// Generated from Calculator.g4 by ANTLR 4.7.2

    import java.util.Map;
    import java.util.HashMap;
    import java.util.Scanner;
    
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, VAR=27, LINE_COMMENT=28, BLOCK_COMMENT=29, ID=30, 
		INT=31, DOUBLE=32, WS=33;
	public static final int
		RULE_comment = 0, RULE_exprList = 1, RULE_topExpr = 2, RULE_varDef = 3, 
		RULE_boolExpr = 4, RULE_expr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"comment", "exprList", "topExpr", "varDef", "boolExpr", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'||'", "'&&'", "'!'", "'>='", "'<='", "'>'", "'<'", 
			"'=='", "'('", "')'", "'print('", "'sqrt('", "'read()'", "'++'", "'--'", 
			"'*'", "'/'", "'+'", "'-'", "'s('", "'c('", "'l('", "'e('", "'^'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "VAR", "LINE_COMMENT", "BLOCK_COMMENT", "ID", "INT", 
			"DOUBLE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	    public static Map<String, Double> variables = new HashMap<String, Double>(); 
	    public static Scanner in = new Scanner(System.in);
	    
	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode LINE_COMMENT() { return getToken(CalculatorParser.LINE_COMMENT, 0); }
		public TerminalNode BLOCK_COMMENT() { return getToken(CalculatorParser.BLOCK_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_la = _input.LA(1);
			if ( !(_la==LINE_COMMENT || _la==BLOCK_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exprList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			topExpr();
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(15);
					match(T__0);
					setState(16);
					topExpr();
					}
					} 
				}
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(22);
				match(T__0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopExprContext extends ParserRuleContext {
		public BoolExprContext boolExpr;
		public ExprContext expr;
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterTopExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitTopExpr(this);
		}
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topExpr);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				((TopExprContext)_localctx).boolExpr = boolExpr();
				 if(((TopExprContext)_localctx).boolExpr.s.equals("v")){}
				                 else
				                   System.out.println("result: "+ Integer.toString(((TopExprContext)_localctx).boolExpr.b?1:0)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				((TopExprContext)_localctx).expr = expr(0);
				 if(((TopExprContext)_localctx).expr.s.equals("v")){} else System.out.println("result: "+ Double.toString(((TopExprContext)_localctx).expr.i));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public double d;
		public Token ID;
		public ExprContext expr;
		public BoolExprContext boolExpr;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitVarDef(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDef);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				((VarDefContext)_localctx).ID = match(ID);
				setState(35);
				match(T__1);
				setState(36);
				((VarDefContext)_localctx).expr = expr(0);
				variables.put((((VarDefContext)_localctx).ID!=null?((VarDefContext)_localctx).ID.getText():null), ((VarDefContext)_localctx).expr.i); ((VarDefContext)_localctx).d = ((VarDefContext)_localctx).expr.i;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				((VarDefContext)_localctx).ID = match(ID);
				setState(40);
				match(T__1);
				setState(41);
				((VarDefContext)_localctx).boolExpr = boolExpr();
				variables.put((((VarDefContext)_localctx).ID!=null?((VarDefContext)_localctx).ID.getText():null), ((VarDefContext)_localctx).boolExpr.b?1.0:0.0); ((VarDefContext)_localctx).d = ((VarDefContext)_localctx).boolExpr.b?1.0:0.0;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExprContext extends ParserRuleContext {
		public boolean b;
		public String s = "";
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public BoolExprContext boolExpr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBoolExpr(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_boolExpr);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				((BoolExprContext)_localctx).el = expr(0);
				setState(47);
				((BoolExprContext)_localctx).op = match(T__2);
				setState(48);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = (((BoolExprContext)_localctx).el.i!=0 || ((BoolExprContext)_localctx).er.i!=0); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				((BoolExprContext)_localctx).el = expr(0);
				setState(52);
				((BoolExprContext)_localctx).op = match(T__3);
				setState(53);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = (((BoolExprContext)_localctx).el.i!=0 && ((BoolExprContext)_localctx).er.i!=0); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(T__4);
				setState(57);
				((BoolExprContext)_localctx).boolExpr = boolExpr();
				((BoolExprContext)_localctx).b = !((BoolExprContext)_localctx).boolExpr.b;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				((BoolExprContext)_localctx).el = expr(0);
				setState(61);
				((BoolExprContext)_localctx).op = match(T__5);
				setState(62);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = (((BoolExprContext)_localctx).el.i>=((BoolExprContext)_localctx).er.i); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				((BoolExprContext)_localctx).el = expr(0);
				setState(66);
				((BoolExprContext)_localctx).op = match(T__6);
				setState(67);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = (((BoolExprContext)_localctx).el.i<=((BoolExprContext)_localctx).er.i); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				((BoolExprContext)_localctx).el = expr(0);
				setState(71);
				((BoolExprContext)_localctx).op = match(T__7);
				setState(72);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = (((BoolExprContext)_localctx).el.i>((BoolExprContext)_localctx).er.i); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
				((BoolExprContext)_localctx).el = expr(0);
				setState(76);
				((BoolExprContext)_localctx).op = match(T__8);
				setState(77);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = (((BoolExprContext)_localctx).el.i<((BoolExprContext)_localctx).er.i); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				((BoolExprContext)_localctx).el = expr(0);
				setState(81);
				((BoolExprContext)_localctx).op = match(T__9);
				setState(82);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = (((BoolExprContext)_localctx).el.i==((BoolExprContext)_localctx).er.i); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public double i;
		public String s = "";
		public ExprContext el;
		public ExprContext expr;
		public Token ID;
		public VarDefContext varDef;
		public Token INT;
		public Token DOUBLE;
		public ExprContext ex;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CalculatorParser.DOUBLE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(88);
				match(T__10);
				setState(89);
				((ExprContext)_localctx).expr = expr(0);
				setState(90);
				match(T__11);
				((ExprContext)_localctx).i = ((ExprContext)_localctx).expr.i;
				}
				break;
			case 3:
				{
				setState(93);
				match(T__12);
				setState(94);
				((ExprContext)_localctx).expr = expr(0);
				setState(95);
				match(T__11);
				System.out.println(((ExprContext)_localctx).expr.i);
				}
				break;
			case 4:
				{
				setState(98);
				match(T__13);
				setState(99);
				((ExprContext)_localctx).expr = expr(0);
				setState(100);
				match(T__11);
				 ((ExprContext)_localctx).i = Math.sqrt(((ExprContext)_localctx).expr.i);
				}
				break;
			case 5:
				{
				setState(103);
				match(T__14);
				 ((ExprContext)_localctx).i =  in.nextDouble();
				                       in.close();
				}
				break;
			case 6:
				{
				setState(105);
				((ExprContext)_localctx).ID = match(ID);
				setState(106);
				match(T__15);
				 if(variables.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))!=null){
				                 ((ExprContext)_localctx).i = variables.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
				                 variables.put((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null),_localctx.i+1);
				                 }
				               else
				                 ((ExprContext)_localctx).i = 0;   
				             
				}
				break;
			case 7:
				{
				setState(108);
				((ExprContext)_localctx).ID = match(ID);
				setState(109);
				match(T__16);
				 if(variables.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))!=null){
				                 ((ExprContext)_localctx).i = variables.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
				                 variables.put((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null),_localctx.i-1);
				                 }
				               else
				                 ((ExprContext)_localctx).i = 0;   
				             
				}
				break;
			case 8:
				{
				setState(111);
				match(T__15);
				setState(112);
				((ExprContext)_localctx).ID = match(ID);
				 if(variables.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))!=null){
				                 ((ExprContext)_localctx).i = variables.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))+1;
				                 variables.put((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null),_localctx.i);
				                 }
				               else
				                 ((ExprContext)_localctx).i = 0;   
				             
				}
				break;
			case 9:
				{
				setState(114);
				match(T__16);
				setState(115);
				((ExprContext)_localctx).ID = match(ID);
				 if(variables.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))!=null){
				                        ((ExprContext)_localctx).i = variables.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))-1;
				                        variables.put((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null),_localctx.i);
				                        }
				                    else
				                        ((ExprContext)_localctx).i = 0;   
				                    
				}
				break;
			case 10:
				{
				setState(117);
				((ExprContext)_localctx).varDef = varDef();
				((ExprContext)_localctx).i = ((ExprContext)_localctx).varDef.d;((ExprContext)_localctx).s = "v";
				}
				break;
			case 11:
				{
				setState(120);
				((ExprContext)_localctx).INT = match(INT);
				 ((ExprContext)_localctx).i = Double.parseDouble((((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getText():null)); 
				}
				break;
			case 12:
				{
				setState(122);
				((ExprContext)_localctx).DOUBLE = match(DOUBLE);
				 ((ExprContext)_localctx).i = Double.parseDouble((((ExprContext)_localctx).DOUBLE!=null?((ExprContext)_localctx).DOUBLE.getText():null)); 
				}
				break;
			case 13:
				{
				setState(124);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).i =  (variables.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))!=null)?variables.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) :0 ; 
				}
				break;
			case 14:
				{
				setState(126);
				match(T__4);
				setState(127);
				((ExprContext)_localctx).expr = expr(8);
				((ExprContext)_localctx).i = (((ExprContext)_localctx).expr.i==0)?1:0;
				}
				break;
			case 15:
				{
				setState(130);
				match(T__21);
				setState(131);
				((ExprContext)_localctx).ex = ((ExprContext)_localctx).expr = expr(0);
				setState(132);
				match(T__11);
				 ((ExprContext)_localctx).i =  Math.sin(((ExprContext)_localctx).ex.i);
				}
				break;
			case 16:
				{
				setState(135);
				match(T__22);
				setState(136);
				((ExprContext)_localctx).ex = ((ExprContext)_localctx).expr = expr(0);
				setState(137);
				match(T__11);
				 ((ExprContext)_localctx).i =  Math.cos(((ExprContext)_localctx).ex.i);
				}
				break;
			case 17:
				{
				setState(140);
				match(T__23);
				setState(141);
				((ExprContext)_localctx).ex = ((ExprContext)_localctx).expr = expr(0);
				setState(142);
				match(T__11);
				 ((ExprContext)_localctx).i =  Math.log(((ExprContext)_localctx).ex.i);
				}
				break;
			case 18:
				{
				setState(145);
				match(T__24);
				setState(146);
				((ExprContext)_localctx).ex = ((ExprContext)_localctx).expr = expr(0);
				setState(147);
				match(T__11);
				 ((ExprContext)_localctx).i =  Math.exp(((ExprContext)_localctx).ex.i);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(153);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(154);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(8);
						 if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("*"))
						                                                  ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i*((ExprContext)_localctx).er.i;
						                                               else{
						                                                  if(((ExprContext)_localctx).er.i==0)
						                                                      System.out.println("Divide by zero error");
						                                                  else
						                                                      ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i/((ExprContext)_localctx).er.i; }
						                                               
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(158);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(159);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(7);
						 ((ExprContext)_localctx).i = ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("+"))?((ExprContext)_localctx).el.i+((ExprContext)_localctx).er.i:((ExprContext)_localctx).el.i-((ExprContext)_localctx).er.i;
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(163);
						((ExprContext)_localctx).op = match(T__25);
						setState(164);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(2);
						 ((ExprContext)_localctx).i = Math.pow(((ExprContext)_localctx).el.i,((ExprContext)_localctx).er.i); 
						}
						break;
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\7\3\24\n\3"+
		"\f\3\16\3\27\13\3\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4#\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5/\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"X\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0099\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00aa\n\7\f\7"+
		"\16\7\u00ad\13\7\3\7\2\3\f\b\2\4\6\b\n\f\2\5\3\2\36\37\3\2\24\25\3\2\26"+
		"\27\2\u00c8\2\16\3\2\2\2\4\20\3\2\2\2\6\"\3\2\2\2\b.\3\2\2\2\nW\3\2\2"+
		"\2\f\u0098\3\2\2\2\16\17\t\2\2\2\17\3\3\2\2\2\20\25\5\6\4\2\21\22\7\3"+
		"\2\2\22\24\5\6\4\2\23\21\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2"+
		"\2\2\26\31\3\2\2\2\27\25\3\2\2\2\30\32\7\3\2\2\31\30\3\2\2\2\31\32\3\2"+
		"\2\2\32\5\3\2\2\2\33#\3\2\2\2\34\35\5\n\6\2\35\36\b\4\1\2\36#\3\2\2\2"+
		"\37 \5\f\7\2 !\b\4\1\2!#\3\2\2\2\"\33\3\2\2\2\"\34\3\2\2\2\"\37\3\2\2"+
		"\2#\7\3\2\2\2$%\7 \2\2%&\7\4\2\2&\'\5\f\7\2\'(\b\5\1\2(/\3\2\2\2)*\7 "+
		"\2\2*+\7\4\2\2+,\5\n\6\2,-\b\5\1\2-/\3\2\2\2.$\3\2\2\2.)\3\2\2\2/\t\3"+
		"\2\2\2\60\61\5\f\7\2\61\62\7\5\2\2\62\63\5\f\7\2\63\64\b\6\1\2\64X\3\2"+
		"\2\2\65\66\5\f\7\2\66\67\7\6\2\2\678\5\f\7\289\b\6\1\29X\3\2\2\2:;\7\7"+
		"\2\2;<\5\n\6\2<=\b\6\1\2=X\3\2\2\2>?\5\f\7\2?@\7\b\2\2@A\5\f\7\2AB\b\6"+
		"\1\2BX\3\2\2\2CD\5\f\7\2DE\7\t\2\2EF\5\f\7\2FG\b\6\1\2GX\3\2\2\2HI\5\f"+
		"\7\2IJ\7\n\2\2JK\5\f\7\2KL\b\6\1\2LX\3\2\2\2MN\5\f\7\2NO\7\13\2\2OP\5"+
		"\f\7\2PQ\b\6\1\2QX\3\2\2\2RS\5\f\7\2ST\7\f\2\2TU\5\f\7\2UV\b\6\1\2VX\3"+
		"\2\2\2W\60\3\2\2\2W\65\3\2\2\2W:\3\2\2\2W>\3\2\2\2WC\3\2\2\2WH\3\2\2\2"+
		"WM\3\2\2\2WR\3\2\2\2X\13\3\2\2\2Y\u0099\b\7\1\2Z[\7\r\2\2[\\\5\f\7\2\\"+
		"]\7\16\2\2]^\b\7\1\2^\u0099\3\2\2\2_`\7\17\2\2`a\5\f\7\2ab\7\16\2\2bc"+
		"\b\7\1\2c\u0099\3\2\2\2de\7\20\2\2ef\5\f\7\2fg\7\16\2\2gh\b\7\1\2h\u0099"+
		"\3\2\2\2ij\7\21\2\2j\u0099\b\7\1\2kl\7 \2\2lm\7\22\2\2m\u0099\b\7\1\2"+
		"no\7 \2\2op\7\23\2\2p\u0099\b\7\1\2qr\7\22\2\2rs\7 \2\2s\u0099\b\7\1\2"+
		"tu\7\23\2\2uv\7 \2\2v\u0099\b\7\1\2wx\5\b\5\2xy\b\7\1\2y\u0099\3\2\2\2"+
		"z{\7!\2\2{\u0099\b\7\1\2|}\7\"\2\2}\u0099\b\7\1\2~\177\7 \2\2\177\u0099"+
		"\b\7\1\2\u0080\u0081\7\7\2\2\u0081\u0082\5\f\7\n\u0082\u0083\b\7\1\2\u0083"+
		"\u0099\3\2\2\2\u0084\u0085\7\30\2\2\u0085\u0086\5\f\7\2\u0086\u0087\7"+
		"\16\2\2\u0087\u0088\b\7\1\2\u0088\u0099\3\2\2\2\u0089\u008a\7\31\2\2\u008a"+
		"\u008b\5\f\7\2\u008b\u008c\7\16\2\2\u008c\u008d\b\7\1\2\u008d\u0099\3"+
		"\2\2\2\u008e\u008f\7\32\2\2\u008f\u0090\5\f\7\2\u0090\u0091\7\16\2\2\u0091"+
		"\u0092\b\7\1\2\u0092\u0099\3\2\2\2\u0093\u0094\7\33\2\2\u0094\u0095\5"+
		"\f\7\2\u0095\u0096\7\16\2\2\u0096\u0097\b\7\1\2\u0097\u0099\3\2\2\2\u0098"+
		"Y\3\2\2\2\u0098Z\3\2\2\2\u0098_\3\2\2\2\u0098d\3\2\2\2\u0098i\3\2\2\2"+
		"\u0098k\3\2\2\2\u0098n\3\2\2\2\u0098q\3\2\2\2\u0098t\3\2\2\2\u0098w\3"+
		"\2\2\2\u0098z\3\2\2\2\u0098|\3\2\2\2\u0098~\3\2\2\2\u0098\u0080\3\2\2"+
		"\2\u0098\u0084\3\2\2\2\u0098\u0089\3\2\2\2\u0098\u008e\3\2\2\2\u0098\u0093"+
		"\3\2\2\2\u0099\u00ab\3\2\2\2\u009a\u009b\f\t\2\2\u009b\u009c\t\3\2\2\u009c"+
		"\u009d\5\f\7\n\u009d\u009e\b\7\1\2\u009e\u00aa\3\2\2\2\u009f\u00a0\f\b"+
		"\2\2\u00a0\u00a1\t\4\2\2\u00a1\u00a2\5\f\7\t\u00a2\u00a3\b\7\1\2\u00a3"+
		"\u00aa\3\2\2\2\u00a4\u00a5\f\3\2\2\u00a5\u00a6\7\34\2\2\u00a6\u00a7\5"+
		"\f\7\4\u00a7\u00a8\b\7\1\2\u00a8\u00aa\3\2\2\2\u00a9\u009a\3\2\2\2\u00a9"+
		"\u009f\3\2\2\2\u00a9\u00a4\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\r\3\2\2\2\u00ad\u00ab\3\2\2\2\n\25\31\""+
		".W\u0098\u00a9\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}