// Generated from TuringMachine.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TuringMachineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, DIRECTION=7, DIGIT=8, 
		SYMBOL=9, BLANK=10, WS=11;
	public static final int
		RULE_machine = 0, RULE_state = 1, RULE_inputalphabet = 2, RULE_tapealphabet = 3, 
		RULE_start = 4, RULE_accepted = 5, RULE_transition = 6;
	public static final String[] ruleNames = {
		"machine", "state", "inputalphabet", "tapealphabet", "start", "accepted", 
		"transition"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "';'", "')'", "'Q'", "','", "'->'", null, null, null, "'blank'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "DIRECTION", "DIGIT", "SYMBOL", 
		"BLANK", "WS"
	};
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
	public String getGrammarFileName() { return "TuringMachine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TuringMachineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MachineContext extends ParserRuleContext {
		public InputalphabetContext inputalphabet() {
			return getRuleContext(InputalphabetContext.class,0);
		}
		public TapealphabetContext tapealphabet() {
			return getRuleContext(TapealphabetContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<AcceptedContext> accepted() {
			return getRuleContexts(AcceptedContext.class);
		}
		public AcceptedContext accepted(int i) {
			return getRuleContext(AcceptedContext.class,i);
		}
		public MachineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_machine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterMachine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitMachine(this);
		}
	}

	public final MachineContext machine() throws RecognitionException {
		MachineContext _localctx = new MachineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_machine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				state();
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(20);
			match(T__1);
			setState(21);
			inputalphabet();
			setState(22);
			match(T__1);
			setState(23);
			tapealphabet();
			setState(24);
			match(T__1);
			setState(25);
			start();
			setState(26);
			match(T__1);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				accepted();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(32);
			match(T__2);
			setState(33);
			match(T__0);
			{
			setState(34);
			transition();
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(35);
				match(T__1);
				setState(36);
				transition();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(T__2);
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

	public static class StateContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(TuringMachineParser.DIGIT, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__3);
			setState(45);
			match(DIGIT);
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

	public static class InputalphabetContext extends ParserRuleContext {
		public List<TerminalNode> SYMBOL() { return getTokens(TuringMachineParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(TuringMachineParser.SYMBOL, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(TuringMachineParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TuringMachineParser.DIGIT, i);
		}
		public InputalphabetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputalphabet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterInputalphabet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitInputalphabet(this);
		}
	}

	public final InputalphabetContext inputalphabet() throws RecognitionException {
		InputalphabetContext _localctx = new InputalphabetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inputalphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				_la = _input.LA(1);
				if ( !(_la==DIGIT || _la==SYMBOL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT || _la==SYMBOL );
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

	public static class TapealphabetContext extends ParserRuleContext {
		public List<TerminalNode> SYMBOL() { return getTokens(TuringMachineParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(TuringMachineParser.SYMBOL, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(TuringMachineParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TuringMachineParser.DIGIT, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(TuringMachineParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(TuringMachineParser.BLANK, i);
		}
		public TapealphabetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tapealphabet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterTapealphabet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitTapealphabet(this);
		}
	}

	public final TapealphabetContext tapealphabet() throws RecognitionException {
		TapealphabetContext _localctx = new TapealphabetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tapealphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << SYMBOL) | (1L << BLANK))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << SYMBOL) | (1L << BLANK))) != 0) );
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

	public static class StartContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			state();
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

	public static class AcceptedContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public AcceptedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accepted; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterAccepted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitAccepted(this);
		}
	}

	public final AcceptedContext accepted() throws RecognitionException {
		AcceptedContext _localctx = new AcceptedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_accepted);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			state();
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

	public static class TransitionContext extends ParserRuleContext {
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<TapealphabetContext> tapealphabet() {
			return getRuleContexts(TapealphabetContext.class);
		}
		public TapealphabetContext tapealphabet(int i) {
			return getRuleContext(TapealphabetContext.class,i);
		}
		public TerminalNode DIRECTION() { return getToken(TuringMachineParser.DIRECTION, 0); }
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			state();
			setState(62);
			match(T__4);
			setState(63);
			tapealphabet();
			setState(64);
			match(T__5);
			setState(65);
			state();
			setState(66);
			match(T__4);
			setState(67);
			tapealphabet();
			setState(68);
			match(T__4);
			setState(69);
			match(DIRECTION);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rJ\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\37\n\2\r\2\16\2 \3\2\3\2\3\2\3"+
		"\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\4\6\4\63\n\4\r\4"+
		"\16\4\64\3\5\6\58\n\5\r\5\16\59\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\4\3\2\n\13\3\2\n\fG\2\20"+
		"\3\2\2\2\4.\3\2\2\2\6\62\3\2\2\2\b\67\3\2\2\2\n;\3\2\2\2\f=\3\2\2\2\16"+
		"?\3\2\2\2\20\22\7\3\2\2\21\23\5\4\3\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22"+
		"\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\27\7\4\2\2\27\30\5\6\4\2\30\31"+
		"\7\4\2\2\31\32\5\b\5\2\32\33\7\4\2\2\33\34\5\n\6\2\34\36\7\4\2\2\35\37"+
		"\5\f\7\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\""+
		"#\7\5\2\2#$\7\3\2\2$)\5\16\b\2%&\7\4\2\2&(\5\16\b\2\'%\3\2\2\2(+\3\2\2"+
		"\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\5\2\2-\3\3\2\2\2./\7\6"+
		"\2\2/\60\7\n\2\2\60\5\3\2\2\2\61\63\t\2\2\2\62\61\3\2\2\2\63\64\3\2\2"+
		"\2\64\62\3\2\2\2\64\65\3\2\2\2\65\7\3\2\2\2\668\t\3\2\2\67\66\3\2\2\2"+
		"89\3\2\2\29\67\3\2\2\29:\3\2\2\2:\t\3\2\2\2;<\5\4\3\2<\13\3\2\2\2=>\5"+
		"\4\3\2>\r\3\2\2\2?@\5\4\3\2@A\7\7\2\2AB\5\b\5\2BC\7\b\2\2CD\5\4\3\2DE"+
		"\7\7\2\2EF\5\b\5\2FG\7\7\2\2GH\7\t\2\2H\17\3\2\2\2\7\24 )\649";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}