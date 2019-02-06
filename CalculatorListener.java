// Generated from Calculator.g4 by ANTLR 4.7.2

    import java.util.Map;
    import java.util.HashMap;
    import java.util.Scanner;
    
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(CalculatorParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(CalculatorParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CalculatorParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CalculatorParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#topExpr}.
	 * @param ctx the parse tree
	 */
	void enterTopExpr(CalculatorParser.TopExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#topExpr}.
	 * @param ctx the parse tree
	 */
	void exitTopExpr(CalculatorParser.TopExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(CalculatorParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(CalculatorParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(CalculatorParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(CalculatorParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalculatorParser.ExprContext ctx);
}