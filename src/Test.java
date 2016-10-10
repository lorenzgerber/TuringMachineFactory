import java.io.IOException;
import java.util.Scanner;

public class Test{

    public static void main(String [] argv){
        String input;
        if(argv.length > 0){
            input = argv[0];
        }else{
            input = "abbaabba";
        }
        TuringMachine m = new TuringMachine();
        try{
            MachineFactory factory = new MachineFactory();
            m = factory.createMachine(Test.class.getResourceAsStream("PalindromeTM.txt"));
        }catch(IOException e){
            System.err.println(e.toString());
        }
        System.out.println(m.toString());
        m.setInput(input);
        Scanner in = new Scanner(System.in);
        m.printConfiguration();
        String s = in.nextLine();
        while(m.step()){
            m.printConfiguration();
            s = in.nextLine();
        }
        if(m.isAcceptingConfiguration()){
            System.out.println("Input is accepted");
        }else{
            System.out.println("Input is rejected");
        }
    }

}

