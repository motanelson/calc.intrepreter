// Generated from math.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mathParser}.
 */
public interface mathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mathParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(mathParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(mathParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(mathParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(mathParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(mathParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(mathParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(mathParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(mathParser.AtomContext ctx);
}