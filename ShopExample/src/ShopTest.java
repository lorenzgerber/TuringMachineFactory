import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;

public class ShopTest{

    public static void main(String [] argv){
	
	Shop s;
	try{
	    ShopFactory factory = new ShopFactory();
	    s = factory.createShop(ShopTest.class.getResourceAsStream("~/git/TuringMachineFactory/ShopExample/myshop.txt"));
	    s.printShop();
	}catch(IOException e){
	    System.err.println(e.toString());
	}
    }

}
