import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Shop{


    public List<Item> items = new ArrayList<Item>();

    public void addItem(Item i){
	items.add(i);
    }

    public void printShop(){

	Iterator<Item> it = items.iterator();
	while(it.hasNext()){
	    Item item = it.next();
	    System.out.println(item.id + " " + item.price + " " + item.name);
	}
    }
}
