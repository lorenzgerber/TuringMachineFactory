import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;

public class MachineTest{

    public static void main(String [] argv){
	
	TuringMachine m;
	try{
	    MachineFactory factory = new MachineFactory();
	    m = factory.createTuringMachine(MachineTest.class.getResourceAsStream("/TuringMachine.tex"));
	    m.printStates();
		m.printInputAlphabet();
		m.printAcceptedStates();
		m.printTransitions();
	}catch(IOException e){
	    System.err.println(e.toString());
	}
    }

}
