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

    public void printStates(){
        System.out.print("Printing the States \n");

        Iterator<State> it = states.iterator();
        while(it.hasNext()){
            State state = it.next();
            System.out.print(state.id + " ");
        }
        System.out.print("\n");

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

                if(transitions.get(transitionStepper).readSymbol.toString() == tape.get(currentPosition)){
                    if(transitions.get(transitionStepper).direction == "R"){
                        /*
                        Move right and write Symbol
                         */
                        tape.set(currentPosition, transitions.get(transitionStepper).writeSymbol);
                        if (tape.size() == currentPosition){
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
        if(acceptedStates.contains(currentState))
            return true;
        return false;
    }


    public void printInputAlphabet(){
        System.out.print("Printing the Input Alphabet \n");
        Iterator<String> it = inputAlphabet.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.print("\n");
    }

    public void printTapeAlphabet(){
        System.out.print("Printing the Tape Alphabet \n");
        Iterator<String> it = tapeAlphabet.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.print("\n");
    }


    public void printAcceptedStates(){
        System.out.print("Accepted States \n");
        Iterator<State> it = acceptedStates.iterator();
        while(it.hasNext()){
            State state = it.next();
            System.out.print(state.id + " ");
        }
        System.out.print("\n");
    }

    public void printTransitions(){
        System.out.print("Transitions \n");
        Iterator<Transition> it = transitions.iterator();
        while(it.hasNext()){
            Transition transition = it.next();
            System.out.print(transition.currentState.id + " " + transition.readSymbol + " " +
                    transition.nextState.id + " " + transition.writeSymbol + transition.direction + "\n");
        }
        System.out.print("\n");
    }




}
