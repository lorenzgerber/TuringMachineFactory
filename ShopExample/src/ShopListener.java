// Generated from Shop.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShopParser}.
 */
public interface ShopListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShopParser#shop}.
	 * @param ctx the parse tree
	 */
	void enterShop(ShopParser.ShopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShopParser#shop}.
	 * @param ctx the parse tree
	 */
	void exitShop(ShopParser.ShopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShopParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(ShopParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShopParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(ShopParser.ItemContext ctx);
}