// Generated from Flow.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlowLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		V=17, A=18, B=19, O=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'START'", "'('", "'='", "'!='", "';'", "'<='", "'OUTPUT'", "'ELSE'", 
		"'NUM'", "'{'", "'IF'", "'=='", "'STOP'", "'}'", "'>='", "V", "A", "B", 
		"O", "WS"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "V", "A", 
		"B", "O", "WS"
	};


	public FlowLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Flow.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 20: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\27|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\6\22f\n\22\r\22\16\22g\3\23\6\23k\n\23\r\23\16\23l\3\24\6\24p\n\24"+
		"\r\24\16\24q\3\25\3\25\3\26\6\26w\n\26\r\26\16\26x\3\26\3\26\2\27\3\3"+
		"\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1"+
		"\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\2"+
		"\3\2\7\3\2c|\5\2\"\"\62;c|\3\2\62;\5\2,-//\61\61\5\2\13\f\17\17\"\"\177"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2"+
		"\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21A\3"+
		"\2\2\2\23H\3\2\2\2\25M\3\2\2\2\27Q\3\2\2\2\31S\3\2\2\2\33V\3\2\2\2\35"+
		"Y\3\2\2\2\37^\3\2\2\2!`\3\2\2\2#c\3\2\2\2%j\3\2\2\2\'o\3\2\2\2)s\3\2\2"+
		"\2+v\3\2\2\2-.\7+\2\2.\4\3\2\2\2/\60\7U\2\2\60\61\7V\2\2\61\62\7C\2\2"+
		"\62\63\7T\2\2\63\64\7V\2\2\64\6\3\2\2\2\65\66\7*\2\2\66\b\3\2\2\2\678"+
		"\7?\2\28\n\3\2\2\29:\7#\2\2:;\7?\2\2;\f\3\2\2\2<=\7=\2\2=\16\3\2\2\2>"+
		"?\7>\2\2?@\7?\2\2@\20\3\2\2\2AB\7Q\2\2BC\7W\2\2CD\7V\2\2DE\7R\2\2EF\7"+
		"W\2\2FG\7V\2\2G\22\3\2\2\2HI\7G\2\2IJ\7N\2\2JK\7U\2\2KL\7G\2\2L\24\3\2"+
		"\2\2MN\7P\2\2NO\7W\2\2OP\7O\2\2P\26\3\2\2\2QR\7}\2\2R\30\3\2\2\2ST\7K"+
		"\2\2TU\7H\2\2U\32\3\2\2\2VW\7?\2\2WX\7?\2\2X\34\3\2\2\2YZ\7U\2\2Z[\7V"+
		"\2\2[\\\7Q\2\2\\]\7R\2\2]\36\3\2\2\2^_\7\177\2\2_ \3\2\2\2`a\7@\2\2ab"+
		"\7?\2\2b\"\3\2\2\2ce\t\2\2\2df\t\3\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2g"+
		"h\3\2\2\2h$\3\2\2\2ik\t\2\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2"+
		"m&\3\2\2\2np\t\4\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r(\3\2\2\2"+
		"st\t\5\2\2t*\3\2\2\2uw\t\6\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"yz\3\2\2\2z{\b\26\2\2{,\3\2\2\2\7\2glqx";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}