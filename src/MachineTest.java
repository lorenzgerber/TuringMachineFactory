import java.io.IOException;

public class MachineTest{

    public static void main(String [] argv){
	
	TuringMachine m;
	try{
	    TMFactory factory = new TMFactory();
	    m = factory.createMachine(MachineTest.class.getResourceAsStream("/PalindromeTM.txt"));
	    m.printStates();
		m.printInputAlphabet();
		m.printTapeAlphabet();
		m.printAcceptedStates();
		m.printTransitions();
	}catch(IOException e){
	    System.err.println(e.toString());
	}
    }

}

