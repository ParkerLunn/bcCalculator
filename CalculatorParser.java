// Generated from Calculator.g4 by ANTLR 4.7.2

    import java.util.Map;
    import java.util.HashMap;
    
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
		T__17=18, T__18=19, T__19=20, VAR=21, LINE_COMMENT=22, BLOCK_COMMENT=23, 
		ID=24, INT=25, DOUBLE=26, WS=27;
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
			null, "';'", "'='", "'&&'", "'||'", "'>='", "'<='", "'>'", "'<'", "'=='", 
			"'*'", "'/'", "'+'", "'-'", "'^'", "'s('", "')'", "'c('", "'l('", "'e('", 
			"'('", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "VAR", "LINE_COMMENT", 
			"BLOCK_COMMENT", "ID", "INT", "DOUBLE", "WS"
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
		public ExprContext expr;
		public BoolExprContext boolExpr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
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
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				((TopExprContext)_localctx).expr = expr(0);
				 System.out.println("result: "+ Integer.toString(((TopExprContext)_localctx).expr.i));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				((TopExprContext)_localctx).boolExpr = boolExpr();
				 System.out.println("result: "+ Integer.toString(((TopExprContext)_localctx).boolExpr.b?1:0)); 
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
		public Token ID;
		public ExprContext expr;
		public TerminalNode VAR() { return getToken(CalculatorParser.VAR, 0); }
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(VAR);
			setState(34);
			((VarDefContext)_localctx).ID = match(ID);
			setState(35);
			match(T__1);
			setState(36);
			((VarDefContext)_localctx).expr = expr(0);

			    variables.put((((VarDefContext)_localctx).ID!=null?((VarDefContext)_localctx).ID.getText():null), ((VarDefContext)_localctx).expr.i);
			    
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
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				((BoolExprContext)_localctx).el = expr(0);
				setState(40);
				((BoolExprContext)_localctx).op = match(T__2);
				setState(41);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = (((BoolExprContext)_localctx).el.i!=0 && ((BoolExprContext)_localctx).er.i!=0); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				((BoolExprContext)_localctx).el = expr(0);
				setState(45);
				((BoolExprContext)_localctx).op = match(T__3);
				setState(46);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = (((BoolExprContext)_localctx).el.i!=0 || ((BoolExprContext)_localctx).er.i!=0); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				((BoolExprContext)_localctx).el = expr(0);
				setState(50);
				((BoolExprContext)_localctx).op = match(T__4);
				setState(51);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = (((BoolExprContext)_localctx).el.i>=((BoolExprContext)_localctx).er.i); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				((BoolExprContext)_localctx).el = expr(0);
				setState(55);
				((BoolExprContext)_localctx).op = match(T__5);
				setState(56);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = (((BoolExprContext)_localctx).el.i<=((BoolExprContext)_localctx).er.i); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				((BoolExprContext)_localctx).el = expr(0);
				setState(60);
				((BoolExprContext)_localctx).op = match(T__6);
				setState(61);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = (((BoolExprContext)_localctx).el.i>((BoolExprContext)_localctx).er.i); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				((BoolExprContext)_localctx).el = expr(0);
				setState(65);
				((BoolExprContext)_localctx).op = match(T__7);
				setState(66);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = (((BoolExprContext)_localctx).el.i<((BoolExprContext)_localctx).er.i); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				((BoolExprContext)_localctx).el = expr(0);
				setState(70);
				((BoolExprContext)_localctx).op = match(T__8);
				setState(71);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = (((BoolExprContext)_localctx).el.i==((BoolExprContext)_localctx).er.i); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(74);
				expr(0);
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
		public ExprContext el;
		public Token INT;
		public Token DOUBLE;
		public Token ID;
		public ExprContext ex;
		public Token op;
		public ExprContext er;
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CalculatorParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(78);
				((ExprContext)_localctx).INT = match(INT);
				 ((ExprContext)_localctx).i = Double.parseDouble((((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getText():null)); 
				}
				break;
			case DOUBLE:
				{
				setState(80);
				((ExprContext)_localctx).DOUBLE = match(DOUBLE);
				 ((ExprContext)_localctx).i = Double.parseDouble((((ExprContext)_localctx).DOUBLE!=null?((ExprContext)_localctx).DOUBLE.getText():null)); 
				}
				break;
			case ID:
				{
				setState(82);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).i =  (variables.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null))!=null)?variables.get((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) :0 ; 
				}
				break;
			case T__14:
				{
				setState(84);
				match(T__14);
				setState(85);
				((ExprContext)_localctx).ex = expr(0);
				setState(86);
				match(T__15);
				 ((ExprContext)_localctx).i =  Math.sin(((ExprContext)_localctx).ex.i);
				}
				break;
			case T__16:
				{
				setState(89);
				match(T__16);
				setState(90);
				((ExprContext)_localctx).ex = expr(0);
				setState(91);
				match(T__15);
				 ((ExprContext)_localctx).i =  Math.cos(((ExprContext)_localctx).ex.i);
				}
				break;
			case T__17:
				{
				setState(94);
				match(T__17);
				setState(95);
				((ExprContext)_localctx).ex = expr(0);
				setState(96);
				match(T__15);
				 ((ExprContext)_localctx).i =  Math.log(((ExprContext)_localctx).ex.i);
				}
				break;
			case T__18:
				{
				setState(99);
				match(T__18);
				setState(100);
				((ExprContext)_localctx).ex = expr(0);
				setState(101);
				match(T__15);
				 ((ExprContext)_localctx).i =  Math.exp(((ExprContext)_localctx).ex.i);
				}
				break;
			case VAR:
				{
				setState(104);
				varDef();
				}
				break;
			case T__19:
				{
				setState(105);
				match(T__19);
				setState(106);
				expr(0);
				setState(107);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(112);
						((ExprContext)_localctx).op = match(T__9);
						setState(113);
						((ExprContext)_localctx).er = expr(15);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i*((ExprContext)_localctx).er.i; 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(117);
						((ExprContext)_localctx).op = match(T__10);
						setState(118);
						((ExprContext)_localctx).er = expr(14);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i/((ExprContext)_localctx).er.i; 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(121);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(122);
						((ExprContext)_localctx).op = match(T__11);
						setState(123);
						((ExprContext)_localctx).er = expr(13);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i+((ExprContext)_localctx).er.i; 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(127);
						((ExprContext)_localctx).op = match(T__12);
						setState(128);
						((ExprContext)_localctx).er = expr(12);
						 ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i-((ExprContext)_localctx).er.i; 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(132);
						((ExprContext)_localctx).op = match(T__13);
						setState(133);
						((ExprContext)_localctx).er = expr(11);
						 ((ExprContext)_localctx).i = Math.pow(((ExprContext)_localctx).el.i,((ExprContext)_localctx).er.i); 
						}
						break;
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0090\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\7\3\24\n"+
		"\3\f\3\16\3\27\13\3\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\"\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008b"+
		"\n\7\f\7\16\7\u008e\13\7\3\7\2\3\f\b\2\4\6\b\n\f\2\3\3\2\30\31\2\u00a0"+
		"\2\16\3\2\2\2\4\20\3\2\2\2\6!\3\2\2\2\b#\3\2\2\2\nM\3\2\2\2\fo\3\2\2\2"+
		"\16\17\t\2\2\2\17\3\3\2\2\2\20\25\5\6\4\2\21\22\7\3\2\2\22\24\5\6\4\2"+
		"\23\21\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\31\3\2\2\2"+
		"\27\25\3\2\2\2\30\32\7\3\2\2\31\30\3\2\2\2\31\32\3\2\2\2\32\5\3\2\2\2"+
		"\33\34\5\f\7\2\34\35\b\4\1\2\35\"\3\2\2\2\36\37\5\n\6\2\37 \b\4\1\2 \""+
		"\3\2\2\2!\33\3\2\2\2!\36\3\2\2\2\"\7\3\2\2\2#$\7\27\2\2$%\7\32\2\2%&\7"+
		"\4\2\2&\'\5\f\7\2\'(\b\5\1\2(\t\3\2\2\2)*\5\f\7\2*+\7\5\2\2+,\5\f\7\2"+
		",-\b\6\1\2-N\3\2\2\2./\5\f\7\2/\60\7\6\2\2\60\61\5\f\7\2\61\62\b\6\1\2"+
		"\62N\3\2\2\2\63\64\5\f\7\2\64\65\7\7\2\2\65\66\5\f\7\2\66\67\b\6\1\2\67"+
		"N\3\2\2\289\5\f\7\29:\7\b\2\2:;\5\f\7\2;<\b\6\1\2<N\3\2\2\2=>\5\f\7\2"+
		">?\7\t\2\2?@\5\f\7\2@A\b\6\1\2AN\3\2\2\2BC\5\f\7\2CD\7\n\2\2DE\5\f\7\2"+
		"EF\b\6\1\2FN\3\2\2\2GH\5\f\7\2HI\7\13\2\2IJ\5\f\7\2JK\b\6\1\2KN\3\2\2"+
		"\2LN\5\f\7\2M)\3\2\2\2M.\3\2\2\2M\63\3\2\2\2M8\3\2\2\2M=\3\2\2\2MB\3\2"+
		"\2\2MG\3\2\2\2ML\3\2\2\2N\13\3\2\2\2OP\b\7\1\2PQ\7\33\2\2Qp\b\7\1\2RS"+
		"\7\34\2\2Sp\b\7\1\2TU\7\32\2\2Up\b\7\1\2VW\7\21\2\2WX\5\f\7\2XY\7\22\2"+
		"\2YZ\b\7\1\2Zp\3\2\2\2[\\\7\23\2\2\\]\5\f\7\2]^\7\22\2\2^_\b\7\1\2_p\3"+
		"\2\2\2`a\7\24\2\2ab\5\f\7\2bc\7\22\2\2cd\b\7\1\2dp\3\2\2\2ef\7\25\2\2"+
		"fg\5\f\7\2gh\7\22\2\2hi\b\7\1\2ip\3\2\2\2jp\5\b\5\2kl\7\26\2\2lm\5\f\7"+
		"\2mn\7\22\2\2np\3\2\2\2oO\3\2\2\2oR\3\2\2\2oT\3\2\2\2oV\3\2\2\2o[\3\2"+
		"\2\2o`\3\2\2\2oe\3\2\2\2oj\3\2\2\2ok\3\2\2\2p\u008c\3\2\2\2qr\f\20\2\2"+
		"rs\7\f\2\2st\5\f\7\21tu\b\7\1\2u\u008b\3\2\2\2vw\f\17\2\2wx\7\r\2\2xy"+
		"\5\f\7\20yz\b\7\1\2z\u008b\3\2\2\2{|\f\16\2\2|}\7\16\2\2}~\5\f\7\17~\177"+
		"\b\7\1\2\177\u008b\3\2\2\2\u0080\u0081\f\r\2\2\u0081\u0082\7\17\2\2\u0082"+
		"\u0083\5\f\7\16\u0083\u0084\b\7\1\2\u0084\u008b\3\2\2\2\u0085\u0086\f"+
		"\f\2\2\u0086\u0087\7\20\2\2\u0087\u0088\5\f\7\r\u0088\u0089\b\7\1\2\u0089"+
		"\u008b\3\2\2\2\u008aq\3\2\2\2\u008av\3\2\2\2\u008a{\3\2\2\2\u008a\u0080"+
		"\3\2\2\2\u008a\u0085\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\r\3\2\2\2\u008e\u008c\3\2\2\2\t\25\31!Mo\u008a\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}