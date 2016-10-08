import java.io.InputStream;
import java.io.IOException;
import java.util.Iterator;

import org.antlr.v4.runtime.*;



public class TMFactory {

    public TuringMachine createMachine(InputStream in) throws IOException {
        TuringMachineLexer l = new TuringMachineLexer(new ANTLRInputStream(in));
        TuringMachineParser p = new TuringMachineParser(new CommonTokenStream(l));
        p.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });

        
	TuringMachine tm = new TuringMachine();
	TuringMachineBaseListener listener = new TuringMachineBaseListener(){


        @Override
        public void exitMachine(TuringMachineParser.MachineContext context) {

            /*
            States
             */
            for(TuringMachineParser.StateContext currentState : context.state() ){
                State state = new State();
                int id = Integer.parseInt(currentState.DIGIT().getSymbol().getText());
                state.id = id;
                tm.addState(state);
            }

            /*
            Input Alphabet
             */

            Iterator inputAlphabetIteratorDigit = context.inputalphabet().DIGIT().iterator();
            while(inputAlphabetIteratorDigit.hasNext()){
                tm.inputAlphabet.add(inputAlphabetIteratorDigit.next().toString());
            }

            Iterator inputAlphabetSymbolIterator = context.inputalphabet().SYMBOL().iterator();
            while(inputAlphabetSymbolIterator.hasNext()){
                tm.inputAlphabet.add(inputAlphabetSymbolIterator.next().toString());
            }

            /*
            Tape Alphabet
             */
            Iterator tapeAlphabetIteratorDigit = context.tapealphabet().DIGIT().iterator();
            while(tapeAlphabetIteratorDigit.hasNext()){
                tm.tapeAlphabet.add(tapeAlphabetIteratorDigit.next().toString());
            }

            Iterator tapeAlphabetSymbolIterator = context.tapealphabet().SYMBOL().iterator();
            while(tapeAlphabetSymbolIterator.hasNext()){
                tm.tapeAlphabet.add(tapeAlphabetSymbolIterator.next().toString());
            }

            if(context.tapealphabet().BLANK().size() != 0){
                tm.tapeAlphabet.add(context.tapealphabet().BLANK(0).toString());
            }



            /*
            add Blank Symbol
             */
            tm.blankSymbol = context.tapealphabet().BLANK().toString();

            /*
            tape alphabet exclusive blnak
             */


            /*
            add start state
             */
            State start = new State();
            int startId = Integer.parseInt(context.start().state().DIGIT().getSymbol().getText());
            start.id = startId;
            tm.startState = start;

            /*
            add accepted states
             */
            context.accepted().get(0).state().DIGIT().getSymbol().getText();
            int numberOfAccepted = context.accepted().size();
            for(int iii = 0; iii < numberOfAccepted; iii++){
                State accepted = new State();
                accepted.id = Integer.parseInt(context.accepted().get(iii).state().DIGIT().getSymbol().getText());
                tm.acceptedStates.add(accepted);
            }

            /*
            add transitions
             */
            int numberOfTransitions = context.transition().size();
            for(int iii = 0; iii < numberOfTransitions; iii++){

                Transition currentTransition = new Transition();

                /*
                add current State
                 */
                State currentState = new State();
                currentState.id = Integer.parseInt(context.transition().get(iii).state().get(0).DIGIT().getSymbol().getText());
                currentTransition.currentState = currentState;

                /*
                add "read sybmol" in Transition
                 */
                if(context.transition().get(iii).tapealphabet(0).BLANK().size()==1){
                    currentTransition.readSymbol = context.transition().get(iii).tapealphabet(0).BLANK().toString();
                } else if (context.transition().get(iii).tapealphabet(0).DIGIT().size()==1){
                    currentTransition.readSymbol = context.transition().get(iii).tapealphabet(0).DIGIT().toString();
                } else
                {
                    currentTransition.readSymbol = context.transition().get(iii).tapealphabet(0).SYMBOL().toString();
                }

                /*
                add next State
                 */
                State nextState = new State();
                nextState.id = Integer.parseInt(context.transition().get(iii).state().get(1).DIGIT().getSymbol().getText());
                currentTransition.nextState = nextState;

                /*
                add "write symbol" in Transition
                 */
                if(context.transition().get(iii).tapealphabet(1).BLANK().size()==1){
                    currentTransition.writeSymbol = context.transition().get(iii).tapealphabet(1).BLANK().toString();
                } else if (context.transition().get(iii).tapealphabet(1).DIGIT().size()==1) {
                    currentTransition.writeSymbol = context.transition().get(iii).tapealphabet(1).DIGIT().toString();
                } else
                {
                    currentTransition.writeSymbol = context.transition().get(iii).tapealphabet(1).SYMBOL().toString();
                }

                tm.addTransition(currentTransition);

                /*
                add direction
                 */
                currentTransition.direction = context.transition().get(iii).DIRECTION().getSymbol().getText();


            }






        }



    };

	p.addParseListener(listener);
	p.machine();

        return tm;
    }
}
