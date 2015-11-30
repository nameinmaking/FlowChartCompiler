// Generated from Flow.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlowParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		V=17, A=18, B=19, O=20, WS=21;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'START'", "'('", "'='", "'!='", "';'", "'<='", "'OUTPUT'", 
		"'ELSE'", "'NUM'", "'{'", "'IF'", "'=='", "'STOP'", "'}'", "'>='", "V", 
		"A", "B", "O", "WS"
	};
	public static final int
		RULE_a = 0, RULE_s = 1, RULE_e = 2, RULE_w = 3, RULE_c = 4, RULE_f = 5;
	public static final String[] ruleNames = {
		"a", "s", "e", "w", "c", "f"
	};

	@Override
	public String getGrammarFileName() { return "Flow.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public FlowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlowListener ) ((FlowListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlowListener ) ((FlowListener)listener).exitA(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); match(2);
			setState(13); s();
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

	public static class SContext extends ParserRuleContext {
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlowListener ) ((FlowListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlowListener ) ((FlowListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << V))) != 0)) {
				{
				{
				setState(15); e();
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode V() { return getToken(FlowParser.V, 0); }
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public TerminalNode B() { return getToken(FlowParser.B, 0); }
		public WContext w() {
			return getRuleContext(WContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlowListener ) ((FlowListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlowListener ) ((FlowListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_e);
		try {
			setState(47);
			switch (_input.LA(1)) {
			case 10:
				enterOuterAlt(_localctx, 1);
				{
				setState(21); match(10);
				setState(22); match(V);
				setState(23); match(4);
				setState(24); match(B);
				setState(25); match(6);
				}
				break;
			case V:
				enterOuterAlt(_localctx, 2);
				{
				setState(26); match(V);
				setState(27); match(4);
				setState(28); f();
				setState(29); match(6);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 3);
				{
				setState(31); match(12);
				setState(32); match(3);
				setState(33); w();
				setState(34); match(1);
				setState(35); match(11);
				setState(36); s();
				setState(37); match(15);
				setState(38); match(9);
				setState(39); match(11);
				setState(40); s();
				setState(41); match(15);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 4);
				{
				setState(43); match(8);
				setState(44); match(V);
				setState(45); match(6);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 5);
				{
				setState(46); match(14);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class WContext extends ParserRuleContext {
		public List<TerminalNode> V() { return getTokens(FlowParser.V); }
		public TerminalNode V(int i) {
			return getToken(FlowParser.V, i);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode B() { return getToken(FlowParser.B, 0); }
		public WContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlowListener ) ((FlowListener)listener).enterW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlowListener ) ((FlowListener)listener).exitW(this);
		}
	}

	public final WContext w() throws RecognitionException {
		WContext _localctx = new WContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_w);
		try {
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); match(V);
				setState(50); c();
				setState(51); match(V);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53); match(V);
				setState(54); c();
				setState(55); match(B);
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

	public static class CContext extends ParserRuleContext {
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlowListener ) ((FlowListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlowListener ) ((FlowListener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_c);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 13) | (1L << 16))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class FContext extends ParserRuleContext {
		public List<TerminalNode> V() { return getTokens(FlowParser.V); }
		public TerminalNode V(int i) {
			return getToken(FlowParser.V, i);
		}
		public TerminalNode O() { return getToken(FlowParser.O, 0); }
		public TerminalNode B() { return getToken(FlowParser.B, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlowListener ) ((FlowListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlowListener ) ((FlowListener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_f);
		try {
			setState(77);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); match(V);
				setState(62); match(O);
				setState(63); f();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); match(V);
				setState(65); match(O);
				setState(66); match(B);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); match(V);
				setState(68); match(O);
				setState(69); match(V);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70); match(B);
				setState(71); match(O);
				setState(72); match(V);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73); match(B);
				setState(74); match(O);
				setState(75); f();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(76); match(B);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\27R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\7\3\23\n\3\f\3\16\3"+
		"\26\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\7\2\b\2\4\6\b\n\f\2\3\6\2\7\7"+
		"\t\t\17\17\22\22V\2\16\3\2\2\2\4\24\3\2\2\2\6\61\3\2\2\2\b;\3\2\2\2\n"+
		"=\3\2\2\2\fO\3\2\2\2\16\17\7\4\2\2\17\20\5\4\3\2\20\3\3\2\2\2\21\23\5"+
		"\6\4\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\5\3"+
		"\2\2\2\26\24\3\2\2\2\27\30\7\f\2\2\30\31\7\23\2\2\31\32\7\6\2\2\32\33"+
		"\7\25\2\2\33\62\7\b\2\2\34\35\7\23\2\2\35\36\7\6\2\2\36\37\5\f\7\2\37"+
		" \7\b\2\2 \62\3\2\2\2!\"\7\16\2\2\"#\7\5\2\2#$\5\b\5\2$%\7\3\2\2%&\7\r"+
		"\2\2&\'\5\4\3\2\'(\7\21\2\2()\7\13\2\2)*\7\r\2\2*+\5\4\3\2+,\7\21\2\2"+
		",\62\3\2\2\2-.\7\n\2\2./\7\23\2\2/\62\7\b\2\2\60\62\7\20\2\2\61\27\3\2"+
		"\2\2\61\34\3\2\2\2\61!\3\2\2\2\61-\3\2\2\2\61\60\3\2\2\2\62\7\3\2\2\2"+
		"\63\64\7\23\2\2\64\65\5\n\6\2\65\66\7\23\2\2\66<\3\2\2\2\678\7\23\2\2"+
		"89\5\n\6\29:\7\25\2\2:<\3\2\2\2;\63\3\2\2\2;\67\3\2\2\2<\t\3\2\2\2=>\t"+
		"\2\2\2>\13\3\2\2\2?@\7\23\2\2@A\7\26\2\2AP\5\f\7\2BC\7\23\2\2CD\7\26\2"+
		"\2DP\7\25\2\2EF\7\23\2\2FG\7\26\2\2GP\7\23\2\2HI\7\25\2\2IJ\7\26\2\2J"+
		"P\7\23\2\2KL\7\25\2\2LM\7\26\2\2MP\5\f\7\2NP\7\25\2\2O?\3\2\2\2OB\3\2"+
		"\2\2OE\3\2\2\2OH\3\2\2\2OK\3\2\2\2ON\3\2\2\2P\r\3\2\2\2\6\24\61;O";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}