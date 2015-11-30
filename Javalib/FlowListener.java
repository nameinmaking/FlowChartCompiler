// Generated from Flow.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlowParser}.
 */
public interface FlowListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlowParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(@NotNull FlowParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(@NotNull FlowParser.FContext ctx);

	/**
	 * Enter a parse tree produced by {@link FlowParser#w}.
	 * @param ctx the parse tree
	 */
	void enterW(@NotNull FlowParser.WContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowParser#w}.
	 * @param ctx the parse tree
	 */
	void exitW(@NotNull FlowParser.WContext ctx);

	/**
	 * Enter a parse tree produced by {@link FlowParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(@NotNull FlowParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(@NotNull FlowParser.EContext ctx);

	/**
	 * Enter a parse tree produced by {@link FlowParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(@NotNull FlowParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(@NotNull FlowParser.SContext ctx);

	/**
	 * Enter a parse tree produced by {@link FlowParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(@NotNull FlowParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(@NotNull FlowParser.CContext ctx);

	/**
	 * Enter a parse tree produced by {@link FlowParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(@NotNull FlowParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlowParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(@NotNull FlowParser.AContext ctx);
}