import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TuringMachine{


    public List<State> states = new ArrayList<State>();
    public List<Transition> transitions = new ArrayList<Transition>();
    public List<String> inputAlphabet = new ArrayList<String>();
    public String blankSymbol;
    public State startState;
    public List<State> acceptedStates = new ArrayList<State>();

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

    }

    public void printConfiguration(){

    }

    public boolean step(){

        return true;
    }

    public boolean isAcceptingConfiguration(){

        return true;
    }


    public void printInputAlphabet(){
        System.out.print("Printing the Input Alphabet \n");
        Iterator<String> it = inputAlphabet.iterator();
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
