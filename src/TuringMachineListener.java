// Generated from TuringMachine.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TuringMachineParser}.
 */
public interface TuringMachineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#machine}.
	 * @param ctx the parse tree
	 */
	void enterMachine(TuringMachineParser.MachineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#machine}.
	 * @param ctx the parse tree
	 */
	void exitMachine(TuringMachineParser.MachineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(TuringMachineParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(TuringMachineParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#inputalphabet}.
	 * @param ctx the parse tree
	 */
	void enterInputalphabet(TuringMachineParser.InputalphabetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#inputalphabet}.
	 * @param ctx the parse tree
	 */
	void exitInputalphabet(TuringMachineParser.InputalphabetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#tapealphabet}.
	 * @param ctx the parse tree
	 */
	void enterTapealphabet(TuringMachineParser.TapealphabetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#tapealphabet}.
	 * @param ctx the parse tree
	 */
	void exitTapealphabet(TuringMachineParser.TapealphabetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(TuringMachineParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(TuringMachineParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#accepted}.
	 * @param ctx the parse tree
	 */
	void enterAccepted(TuringMachineParser.AcceptedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#accepted}.
	 * @param ctx the parse tree
	 */
	void exitAccepted(TuringMachineParser.AcceptedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(TuringMachineParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(TuringMachineParser.TransitionContext ctx);
}