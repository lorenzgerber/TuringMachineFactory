import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TuringMachine{


    public List<State> states = new ArrayList<State>();
    public List<Transition> transitions = new ArrayList<Transition>();
    public List<String> inputAlphabet = new ArrayList<String>();
    public List<String> tapeAlphabet = new ArrayList<String>();
    public String blankSymbol;
    public State startState;
    public List<State> acceptedStates = new ArrayList<State>();
    public List<String> tape = new ArrayList<String>();
    public int currentPosition;
    public int currentState;

    public void addTransition(Transition t){
		transitions.add(t);
    }

    public void addState(State s) {
        states.add(s);
    }


    public void setInput(String input){
        for (int iii = 0; iii < input.length(); iii++){
            // Todo: verify that input belongs to input alphabet
            tape.add(String.valueOf(input.charAt(iii)));
        }
        currentPosition = 0;
        currentState = startState.id;

    }

    public void printConfiguration(){
        System.out.print("State " + currentState + "\n");
        for(int iii = 0; iii < tape.size(); iii++){
            System.out.print(tape.get(iii));
        }
        System.out.print("\n");
        for(int iii = 0; iii < currentPosition;iii++){
            System.out.print(" ");
        }
        System.out.print("^\n");

    }

    public boolean step(){
        boolean transitionFound = false;
        int transitionStepper = 0;
        while (transitionStepper < transitions.size() && transitionFound == false ){

            if(transitions.get(transitionStepper).currentState.id == currentState){

                if(transitions.get(transitionStepper).readSymbol.toString().equals(tape.get(currentPosition))){
                    if(transitions.get(transitionStepper).direction.equals("R")){
                        /*
                        Move right and write Symbol
                         */
                        tape.set(currentPosition, transitions.get(transitionStepper).writeSymbol);
                        if ((tape.size() - 1) == currentPosition){
                            tape.add("blank");
                        }
                        currentPosition++;
                        currentState = transitions.get(transitionStepper).nextState.id;
                    } else {
                        /*
                        Move left and write Symbol
                         */
                        tape.set(currentPosition, transitions.get(transitionStepper).writeSymbol.toString());
                        if(currentPosition > 0){
                            currentPosition--;
                        }
                        currentState = transitions.get(transitionStepper).nextState.id;
                    }
                    return true;
                }



            }

            transitionStepper++;
        }

        return false;
    }



    public boolean isAcceptingConfiguration(){
        for(State checkState:acceptedStates){
            if(checkState.id == currentState)
                return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String empty = "Turing Machine\n--------------\n\n";
        StringBuilder sb = new StringBuilder(empty);

        sb.append("States \n");
        Iterator<State> statesIterator = states.iterator();
        while(statesIterator.hasNext()){
            State state = statesIterator.next();
            sb.append(state.id + " ");
        }
        sb.append("\n\n");


        sb.append("Input Alphabet \n");
        Iterator<String> inputAlphabetIterator = inputAlphabet.iterator();
        while(inputAlphabetIterator.hasNext()){
            sb.append(inputAlphabetIterator.next() + " ");
        }
        sb.append("\n\n");

        sb.append("Tape Alphabet \n");
        Iterator<String> tapeAlphabetIterator = tapeAlphabet.iterator();
        while(tapeAlphabetIterator.hasNext()){
            sb.append(tapeAlphabetIterator.next() + " ");
        }
        sb.append("\n\n");

        sb.append("Start State \n");
        sb.append(startState.id + "\n\n");

        sb.append("Accepted States \n");
        Iterator<State> acceptedStatesIterator = acceptedStates.iterator();
        while(acceptedStatesIterator.hasNext()){
            State state = acceptedStatesIterator.next();
            sb.append(state.id + " ");
        }
        sb.append("\n\n");

        sb.append("Transitions \n");
        Iterator<Transition> it = transitions.iterator();
        while(it.hasNext()){
            Transition transition = it.next();
            sb.append(transition.currentState.id + " " + transition.readSymbol + " -> " +
                    transition.nextState.id + " " + transition.writeSymbol + ", " + transition.direction + "\n");
        }
        sb.append("--------------\n\n");







        return(sb.toString());
    }




}
