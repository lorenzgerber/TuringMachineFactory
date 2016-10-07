import java.io.InputStream;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;
import org.antlr.v4.runtime.*;

public class ShopFactory {

    public Shop createShop(InputStream in) throws IOException {
        ShopLexer l = new ShopLexer(new ANTLRInputStream(in));
        ShopParser p = new ShopParser(new CommonTokenStream(l));
        p.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });

        
	Shop s = new Shop();
	ShopBaseListener listener = new ShopBaseListener(){

		@Override 
		public void exitItem(ShopParser.ItemContext context) { 
		    String id = context.ID().getSymbol().getText();
		    int price = Integer.parseInt(context.PRICE().getSymbol().getText());
		    String name = context.NAME().getSymbol().getText();
		    Item item = new Item();
		    item.id = id;
		    item.price = price;
		    item.name = name;
		    s.addItem(item);
		}
	     

	    };

	p.addParseListener(listener);
	p.shop();

        return s;
    }
}
