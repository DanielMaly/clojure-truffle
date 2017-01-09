// $ANTLR 3.5.2 R5RS.g3 2017-01-09 18:26:45

package parse;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class R5RSLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int ABBREVIATION=4;
	public static final int AND=5;
	public static final int ARROW=6;
	public static final int BEGIN=7;
	public static final int BINDINGSPEC=8;
	public static final int BODY=9;
	public static final int BOOL=10;
	public static final int CASE=11;
	public static final int CASECLAUSE=12;
	public static final int CHAR=13;
	public static final int CHARACTER=14;
	public static final int CHARACTER_NAME=15;
	public static final int COMMAND=16;
	public static final int COMMENT=17;
	public static final int COMPLEX_10=18;
	public static final int COMPLEX_16=19;
	public static final int COMPLEX_2=20;
	public static final int COMPLEX_8=21;
	public static final int COND=22;
	public static final int CONDCLAUSE=23;
	public static final int DECIMAL_10=24;
	public static final int DEFINE=25;
	public static final int DEFINE_SYNTAX=26;
	public static final int DELAY=27;
	public static final int DIGIT=28;
	public static final int DIGIT_16=29;
	public static final int DIGIT_2=30;
	public static final int DIGIT_8=31;
	public static final int DO=32;
	public static final int DOCOMMANDS=33;
	public static final int DORESULT=34;
	public static final int ELLIPSIS=35;
	public static final int ELSE=36;
	public static final int EMPTYFORMALS=37;
	public static final int EXACTNESS=38;
	public static final int EXPONENT_MARKER=39;
	public static final int FALSE=40;
	public static final int FORMALDEF=41;
	public static final int FORMALS=42;
	public static final int IDENTIFIER=43;
	public static final int IF=44;
	public static final int INITIAL=45;
	public static final int ITERATIONSPEC=46;
	public static final int LAMBDA=47;
	public static final int LET=48;
	public static final int LETREC=49;
	public static final int LETREC_SYNTAX=50;
	public static final int LETSTAR=51;
	public static final int LETTER=52;
	public static final int LET_SYNTAX=53;
	public static final int LIST=54;
	public static final int LITERAL=55;
	public static final int LOCALBINDING=56;
	public static final int NUM10=57;
	public static final int NUM16=58;
	public static final int NUM2=59;
	public static final int NUM8=60;
	public static final int NUM_10=61;
	public static final int NUM_16=62;
	public static final int NUM_2=63;
	public static final int NUM_8=64;
	public static final int OR=65;
	public static final int PECULIAR_IDENTIFIER=66;
	public static final int PREFIX_10=67;
	public static final int PREFIX_16=68;
	public static final int PREFIX_2=69;
	public static final int PREFIX_8=70;
	public static final int PROCEDURECALL=71;
	public static final int QUASIQUOTATION=72;
	public static final int QUASIQUOTE=73;
	public static final int QUOTATION=74;
	public static final int QUOTE=75;
	public static final int RADIX_10=76;
	public static final int RADIX_16=77;
	public static final int RADIX_2=78;
	public static final int RADIX_8=79;
	public static final int REAL_10=80;
	public static final int REAL_16=81;
	public static final int REAL_2=82;
	public static final int REAL_8=83;
	public static final int SELFEVALUATING=84;
	public static final int SEQUENCE=85;
	public static final int SET=86;
	public static final int SIGN=87;
	public static final int SPACE=88;
	public static final int SPECIAL_INITIAL=89;
	public static final int SPECIAL_SUBSEQUENT=90;
	public static final int STR=91;
	public static final int STRING=92;
	public static final int STRING_ELEMENT=93;
	public static final int SUBSEQUENT=94;
	public static final int SUFFIX=95;
	public static final int SYNTAXRULE=96;
	public static final int SYNTAX_RULES=97;
	public static final int TEST=98;
	public static final int TRUE=99;
	public static final int UINTEGER_10=100;
	public static final int UINTEGER_16=101;
	public static final int UINTEGER_2=102;
	public static final int UINTEGER_8=103;
	public static final int UNQUOTE=104;
	public static final int UNQUOTE_SPLICING=105;
	public static final int UREAL_10=106;
	public static final int UREAL_16=107;
	public static final int UREAL_2=108;
	public static final int UREAL_8=109;
	public static final int VARIABLE=110;
	public static final int VECTOR=111;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public R5RSLexer() {} 
	public R5RSLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public R5RSLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "R5RS.g3"; }

	// $ANTLR start "T__112"
	public final void mT__112() throws RecognitionException {
		try {
			int _type = T__112;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:6:8: ( '#(' )
			// R5RS.g3:6:10: '#('
			{
			match("#("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__112"

	// $ANTLR start "T__113"
	public final void mT__113() throws RecognitionException {
		try {
			int _type = T__113;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:7:8: ( '(' )
			// R5RS.g3:7:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__113"

	// $ANTLR start "T__114"
	public final void mT__114() throws RecognitionException {
		try {
			int _type = T__114;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:8:8: ( '()' )
			// R5RS.g3:8:10: '()'
			{
			match("()"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__114"

	// $ANTLR start "T__115"
	public final void mT__115() throws RecognitionException {
		try {
			int _type = T__115;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:9:8: ( ')' )
			// R5RS.g3:9:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__115"

	// $ANTLR start "T__116"
	public final void mT__116() throws RecognitionException {
		try {
			int _type = T__116;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:10:8: ( ',' )
			// R5RS.g3:10:10: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__116"

	// $ANTLR start "T__117"
	public final void mT__117() throws RecognitionException {
		try {
			int _type = T__117;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:11:8: ( ',@' )
			// R5RS.g3:11:10: ',@'
			{
			match(",@"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__117"

	// $ANTLR start "T__118"
	public final void mT__118() throws RecognitionException {
		try {
			int _type = T__118;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:12:8: ( '.' )
			// R5RS.g3:12:10: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__118"

	// $ANTLR start "T__119"
	public final void mT__119() throws RecognitionException {
		try {
			int _type = T__119;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:13:8: ( '\\'' )
			// R5RS.g3:13:10: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__119"

	// $ANTLR start "T__120"
	public final void mT__120() throws RecognitionException {
		try {
			int _type = T__120;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:14:8: ( '`' )
			// R5RS.g3:14:10: '`'
			{
			match('`'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__120"

	// $ANTLR start "LET_SYNTAX"
	public final void mLET_SYNTAX() throws RecognitionException {
		try {
			int _type = LET_SYNTAX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:453:18: ( 'let-syntax' )
			// R5RS.g3:453:20: 'let-syntax'
			{
			match("let-syntax"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET_SYNTAX"

	// $ANTLR start "LETREC_SYNTAX"
	public final void mLETREC_SYNTAX() throws RecognitionException {
		try {
			int _type = LETREC_SYNTAX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:454:18: ( 'letrec-syntax' )
			// R5RS.g3:454:20: 'letrec-syntax'
			{
			match("letrec-syntax"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETREC_SYNTAX"

	// $ANTLR start "SYNTAX_RULES"
	public final void mSYNTAX_RULES() throws RecognitionException {
		try {
			int _type = SYNTAX_RULES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:455:18: ( 'syntax-rules' )
			// R5RS.g3:455:20: 'syntax-rules'
			{
			match("syntax-rules"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYNTAX_RULES"

	// $ANTLR start "DEFINE_SYNTAX"
	public final void mDEFINE_SYNTAX() throws RecognitionException {
		try {
			int _type = DEFINE_SYNTAX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:456:18: ( 'define-syntax' )
			// R5RS.g3:456:20: 'define-syntax'
			{
			match("define-syntax"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFINE_SYNTAX"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:459:18: ( 'else' )
			// R5RS.g3:459:20: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "ARROW"
	public final void mARROW() throws RecognitionException {
		try {
			int _type = ARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:460:18: ( '=>' )
			// R5RS.g3:460:20: '=>'
			{
			match("=>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARROW"

	// $ANTLR start "DEFINE"
	public final void mDEFINE() throws RecognitionException {
		try {
			int _type = DEFINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:461:18: ( 'define' )
			// R5RS.g3:461:20: 'define'
			{
			match("define"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFINE"

	// $ANTLR start "UNQUOTE_SPLICING"
	public final void mUNQUOTE_SPLICING() throws RecognitionException {
		try {
			int _type = UNQUOTE_SPLICING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:462:18: ( 'unquote-splicing' )
			// R5RS.g3:462:20: 'unquote-splicing'
			{
			match("unquote-splicing"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNQUOTE_SPLICING"

	// $ANTLR start "UNQUOTE"
	public final void mUNQUOTE() throws RecognitionException {
		try {
			int _type = UNQUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:463:18: ( 'unquote' )
			// R5RS.g3:463:20: 'unquote'
			{
			match("unquote"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNQUOTE"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			int _type = QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:466:18: ( 'quote' )
			// R5RS.g3:466:20: 'quote'
			{
			match("quote"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTE"

	// $ANTLR start "LAMBDA"
	public final void mLAMBDA() throws RecognitionException {
		try {
			int _type = LAMBDA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:467:18: ( 'lambda' )
			// R5RS.g3:467:20: 'lambda'
			{
			match("lambda"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LAMBDA"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:468:18: ( 'if' )
			// R5RS.g3:468:20: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "SET"
	public final void mSET() throws RecognitionException {
		try {
			int _type = SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:469:18: ( 'set!' )
			// R5RS.g3:469:20: 'set!'
			{
			match("set!"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SET"

	// $ANTLR start "BEGIN"
	public final void mBEGIN() throws RecognitionException {
		try {
			int _type = BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:470:18: ( 'begin' )
			// R5RS.g3:470:20: 'begin'
			{
			match("begin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BEGIN"

	// $ANTLR start "COND"
	public final void mCOND() throws RecognitionException {
		try {
			int _type = COND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:471:18: ( 'cond' )
			// R5RS.g3:471:20: 'cond'
			{
			match("cond"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COND"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:472:18: ( 'and' )
			// R5RS.g3:472:20: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:473:18: ( 'or' )
			// R5RS.g3:473:20: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:474:18: ( 'case' )
			// R5RS.g3:474:20: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:475:18: ( 'let' )
			// R5RS.g3:475:20: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "LETSTAR"
	public final void mLETSTAR() throws RecognitionException {
		try {
			int _type = LETSTAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:476:18: ( 'let*' )
			// R5RS.g3:476:20: 'let*'
			{
			match("let*"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETSTAR"

	// $ANTLR start "LETREC"
	public final void mLETREC() throws RecognitionException {
		try {
			int _type = LETREC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:477:18: ( 'letrec' )
			// R5RS.g3:477:20: 'letrec'
			{
			match("letrec"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETREC"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:478:18: ( 'do' )
			// R5RS.g3:478:20: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "DELAY"
	public final void mDELAY() throws RecognitionException {
		try {
			int _type = DELAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:479:18: ( 'delay' )
			// R5RS.g3:479:20: 'delay'
			{
			match("delay"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DELAY"

	// $ANTLR start "QUASIQUOTE"
	public final void mQUASIQUOTE() throws RecognitionException {
		try {
			int _type = QUASIQUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:480:18: ( 'quasiquote' )
			// R5RS.g3:480:20: 'quasiquote'
			{
			match("quasiquote"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUASIQUOTE"

	// $ANTLR start "NUM_2"
	public final void mNUM_2() throws RecognitionException {
		try {
			int _type = NUM_2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:482:8: ( PREFIX_2 COMPLEX_2 )
			// R5RS.g3:482:10: PREFIX_2 COMPLEX_2
			{
			mPREFIX_2(); 

			mCOMPLEX_2(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM_2"

	// $ANTLR start "NUM_8"
	public final void mNUM_8() throws RecognitionException {
		try {
			int _type = NUM_8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:483:8: ( PREFIX_8 COMPLEX_8 )
			// R5RS.g3:483:10: PREFIX_8 COMPLEX_8
			{
			mPREFIX_8(); 

			mCOMPLEX_8(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM_8"

	// $ANTLR start "NUM_10"
	public final void mNUM_10() throws RecognitionException {
		try {
			int _type = NUM_10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:484:8: ( ( PREFIX_10 )? COMPLEX_10 )
			// R5RS.g3:484:10: ( PREFIX_10 )? COMPLEX_10
			{
			// R5RS.g3:484:10: ( PREFIX_10 )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='#') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// R5RS.g3:484:10: PREFIX_10
					{
					mPREFIX_10(); 

					}
					break;

			}

			mCOMPLEX_10(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM_10"

	// $ANTLR start "NUM_16"
	public final void mNUM_16() throws RecognitionException {
		try {
			int _type = NUM_16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:485:8: ( PREFIX_16 COMPLEX_16 )
			// R5RS.g3:485:10: PREFIX_16 COMPLEX_16
			{
			mPREFIX_16(); 

			mCOMPLEX_16(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM_16"

	// $ANTLR start "ELLIPSIS"
	public final void mELLIPSIS() throws RecognitionException {
		try {
			int _type = ELLIPSIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:487:10: ( '...' )
			// R5RS.g3:487:12: '...'
			{
			match("..."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELLIPSIS"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:490:3: ( INITIAL ( SUBSEQUENT )* | PECULIAR_IDENTIFIER )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='!'||(LA3_0 >= '$' && LA3_0 <= '&')||LA3_0=='*'||LA3_0=='/'||LA3_0==':'||(LA3_0 >= '<' && LA3_0 <= '?')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= '^' && LA3_0 <= '_')||(LA3_0 >= 'a' && LA3_0 <= 'z')||LA3_0=='~') ) {
				alt3=1;
			}
			else if ( (LA3_0=='+'||LA3_0=='-') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// R5RS.g3:490:6: INITIAL ( SUBSEQUENT )*
					{
					mINITIAL(); 

					// R5RS.g3:490:14: ( SUBSEQUENT )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0=='!'||(LA2_0 >= '$' && LA2_0 <= '&')||(LA2_0 >= '*' && LA2_0 <= '+')||(LA2_0 >= '-' && LA2_0 <= ':')||(LA2_0 >= '<' && LA2_0 <= 'Z')||(LA2_0 >= '^' && LA2_0 <= '_')||(LA2_0 >= 'a' && LA2_0 <= 'z')||LA2_0=='~') ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// R5RS.g3:
							{
							if ( input.LA(1)=='!'||(input.LA(1) >= '$' && input.LA(1) <= '&')||(input.LA(1) >= '*' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= ':')||(input.LA(1) >= '<' && input.LA(1) <= 'Z')||(input.LA(1) >= '^' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='~' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;
				case 2 :
					// R5RS.g3:491:6: PECULIAR_IDENTIFIER
					{
					mPECULIAR_IDENTIFIER(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:494:8: ( '\"' ( STRING_ELEMENT )* '\"' )
			// R5RS.g3:494:10: '\"' ( STRING_ELEMENT )* '\"'
			{
			match('\"'); 
			// R5RS.g3:494:14: ( STRING_ELEMENT )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// R5RS.g3:494:14: STRING_ELEMENT
					{
					mSTRING_ELEMENT(); 

					}
					break;

				default :
					break loop4;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			int _type = CHARACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:496:11: ( '#\\\\' (~ ( ' ' | '\\n' ) | CHARACTER_NAME ) )
			// R5RS.g3:496:13: '#\\\\' (~ ( ' ' | '\\n' ) | CHARACTER_NAME )
			{
			match("#\\"); 

			// R5RS.g3:496:19: (~ ( ' ' | '\\n' ) | CHARACTER_NAME )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='s') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='p') ) {
					alt5=2;
				}

				else {
					alt5=1;
				}

			}
			else if ( (LA5_0=='n') ) {
				int LA5_2 = input.LA(2);
				if ( (LA5_2=='e') ) {
					alt5=2;
				}

				else {
					alt5=1;
				}

			}
			else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\u001F')||(LA5_0 >= '!' && LA5_0 <= 'm')||(LA5_0 >= 'o' && LA5_0 <= 'r')||(LA5_0 >= 't' && LA5_0 <= '\uFFFF')) ) {
				alt5=1;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// R5RS.g3:496:20: ~ ( ' ' | '\\n' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// R5RS.g3:496:36: CHARACTER_NAME
					{
					mCHARACTER_NAME(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:498:7: ( '#' ( 't' | 'T' ) )
			// R5RS.g3:498:9: '#' ( 't' | 'T' )
			{
			match('#'); 
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:499:7: ( '#' ( 'f' | 'F' ) )
			// R5RS.g3:499:9: '#' ( 'f' | 'F' )
			{
			match('#'); 
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "SPACE"
	public final void mSPACE() throws RecognitionException {
		try {
			int _type = SPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:502:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// R5RS.g3:502:11: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPACE"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// R5RS.g3:503:9: ( ';' (~ ( '\\r' | '\\n' ) )* )
			// R5RS.g3:503:11: ';' (~ ( '\\r' | '\\n' ) )*
			{
			match(';'); 
			// R5RS.g3:503:15: (~ ( '\\r' | '\\n' ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// R5RS.g3:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "INITIAL"
	public final void mINITIAL() throws RecognitionException {
		try {
			// R5RS.g3:506:18: ( LETTER | SPECIAL_INITIAL )
			// R5RS.g3:
			{
			if ( input.LA(1)=='!'||(input.LA(1) >= '$' && input.LA(1) <= '&')||input.LA(1)=='*'||input.LA(1)=='/'||input.LA(1)==':'||(input.LA(1) >= '<' && input.LA(1) <= '?')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= '^' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='~' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INITIAL"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// R5RS.g3:507:17: ( 'a' .. 'z' | 'A' .. 'Z' )
			// R5RS.g3:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "SPECIAL_INITIAL"
	public final void mSPECIAL_INITIAL() throws RecognitionException {
		try {
			// R5RS.g3:508:26: ( '!' | '$' | '%' | '&' | '*' | '/' | ':' | '<' | '=' | '>' | '?' | '^' | '_' | '~' )
			// R5RS.g3:
			{
			if ( input.LA(1)=='!'||(input.LA(1) >= '$' && input.LA(1) <= '&')||input.LA(1)=='*'||input.LA(1)=='/'||input.LA(1)==':'||(input.LA(1) >= '<' && input.LA(1) <= '?')||(input.LA(1) >= '^' && input.LA(1) <= '_')||input.LA(1)=='~' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPECIAL_INITIAL"

	// $ANTLR start "SUBSEQUENT"
	public final void mSUBSEQUENT() throws RecognitionException {
		try {
			// R5RS.g3:509:21: ( INITIAL | DIGIT | SPECIAL_SUBSEQUENT )
			// R5RS.g3:
			{
			if ( input.LA(1)=='!'||(input.LA(1) >= '$' && input.LA(1) <= '&')||(input.LA(1) >= '*' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= ':')||(input.LA(1) >= '<' && input.LA(1) <= 'Z')||(input.LA(1) >= '^' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='~' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUBSEQUENT"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// R5RS.g3:510:16: ( '0' .. '9' )
			// R5RS.g3:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "SPECIAL_SUBSEQUENT"
	public final void mSPECIAL_SUBSEQUENT() throws RecognitionException {
		try {
			// R5RS.g3:511:29: ( '.' | '+' | '-' | '@' )
			// R5RS.g3:
			{
			if ( input.LA(1)=='+'||(input.LA(1) >= '-' && input.LA(1) <= '.')||input.LA(1)=='@' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPECIAL_SUBSEQUENT"

	// $ANTLR start "PECULIAR_IDENTIFIER"
	public final void mPECULIAR_IDENTIFIER() throws RecognitionException {
		try {
			// R5RS.g3:512:30: ( '+' | '-' )
			// R5RS.g3:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PECULIAR_IDENTIFIER"

	// $ANTLR start "STRING_ELEMENT"
	public final void mSTRING_ELEMENT() throws RecognitionException {
		try {
			// R5RS.g3:513:25: (~ ( '\"' | '\\\\' ) | '\\\\' ( '\"' | '\\\\' ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
				alt7=1;
			}
			else if ( (LA7_0=='\\') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// R5RS.g3:513:27: ~ ( '\"' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// R5RS.g3:513:43: '\\\\' ( '\"' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\\' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_ELEMENT"

	// $ANTLR start "CHARACTER_NAME"
	public final void mCHARACTER_NAME() throws RecognitionException {
		try {
			// R5RS.g3:514:25: ( 'space' | 'newline' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='s') ) {
				alt8=1;
			}
			else if ( (LA8_0=='n') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// R5RS.g3:514:27: 'space'
					{
					match("space"); 

					}
					break;
				case 2 :
					// R5RS.g3:514:37: 'newline'
					{
					match("newline"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER_NAME"

	// $ANTLR start "COMPLEX_2"
	public final void mCOMPLEX_2() throws RecognitionException {
		try {
			// R5RS.g3:517:3: ( REAL_2 ( '@' REAL_2 )? | ( REAL_2 )? SIGN ( UREAL_2 )? ( 'i' | 'I' ) )
			int alt12=2;
			alt12 = dfa12.predict(input);
			switch (alt12) {
				case 1 :
					// R5RS.g3:517:6: REAL_2 ( '@' REAL_2 )?
					{
					mREAL_2(); 

					// R5RS.g3:517:13: ( '@' REAL_2 )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='@') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// R5RS.g3:517:14: '@' REAL_2
							{
							match('@'); 
							mREAL_2(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// R5RS.g3:518:6: ( REAL_2 )? SIGN ( UREAL_2 )? ( 'i' | 'I' )
					{
					// R5RS.g3:518:6: ( REAL_2 )?
					int alt10=2;
					alt10 = dfa10.predict(input);
					switch (alt10) {
						case 1 :
							// R5RS.g3:518:6: REAL_2
							{
							mREAL_2(); 

							}
							break;

					}

					mSIGN(); 

					// R5RS.g3:518:19: ( UREAL_2 )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( ((LA11_0 >= '0' && LA11_0 <= '1')) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// R5RS.g3:518:19: UREAL_2
							{
							mUREAL_2(); 

							}
							break;

					}

					if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPLEX_2"

	// $ANTLR start "COMPLEX_8"
	public final void mCOMPLEX_8() throws RecognitionException {
		try {
			// R5RS.g3:522:3: ( REAL_8 ( '@' REAL_8 )? | ( REAL_8 )? SIGN ( UREAL_8 )? ( 'i' | 'I' ) )
			int alt16=2;
			alt16 = dfa16.predict(input);
			switch (alt16) {
				case 1 :
					// R5RS.g3:522:6: REAL_8 ( '@' REAL_8 )?
					{
					mREAL_8(); 

					// R5RS.g3:522:13: ( '@' REAL_8 )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0=='@') ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// R5RS.g3:522:14: '@' REAL_8
							{
							match('@'); 
							mREAL_8(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// R5RS.g3:523:6: ( REAL_8 )? SIGN ( UREAL_8 )? ( 'i' | 'I' )
					{
					// R5RS.g3:523:6: ( REAL_8 )?
					int alt14=2;
					alt14 = dfa14.predict(input);
					switch (alt14) {
						case 1 :
							// R5RS.g3:523:6: REAL_8
							{
							mREAL_8(); 

							}
							break;

					}

					mSIGN(); 

					// R5RS.g3:523:19: ( UREAL_8 )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( ((LA15_0 >= '0' && LA15_0 <= '7')) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// R5RS.g3:523:19: UREAL_8
							{
							mUREAL_8(); 

							}
							break;

					}

					if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPLEX_8"

	// $ANTLR start "COMPLEX_10"
	public final void mCOMPLEX_10() throws RecognitionException {
		try {
			// R5RS.g3:527:3: ( REAL_10 ( '@' REAL_10 )? | ( REAL_10 )? SIGN ( UREAL_10 )? ( 'i' | 'I' ) )
			int alt20=2;
			alt20 = dfa20.predict(input);
			switch (alt20) {
				case 1 :
					// R5RS.g3:527:6: REAL_10 ( '@' REAL_10 )?
					{
					mREAL_10(); 

					// R5RS.g3:527:14: ( '@' REAL_10 )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0=='@') ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// R5RS.g3:527:15: '@' REAL_10
							{
							match('@'); 
							mREAL_10(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// R5RS.g3:528:6: ( REAL_10 )? SIGN ( UREAL_10 )? ( 'i' | 'I' )
					{
					// R5RS.g3:528:6: ( REAL_10 )?
					int alt18=2;
					alt18 = dfa18.predict(input);
					switch (alt18) {
						case 1 :
							// R5RS.g3:528:6: REAL_10
							{
							mREAL_10(); 

							}
							break;

					}

					mSIGN(); 

					// R5RS.g3:528:20: ( UREAL_10 )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0=='.'||(LA19_0 >= '0' && LA19_0 <= '9')) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// R5RS.g3:528:20: UREAL_10
							{
							mUREAL_10(); 

							}
							break;

					}

					if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPLEX_10"

	// $ANTLR start "COMPLEX_16"
	public final void mCOMPLEX_16() throws RecognitionException {
		try {
			// R5RS.g3:532:3: ( REAL_16 ( '@' REAL_16 )? | ( REAL_16 )? SIGN ( UREAL_16 )? ( 'i' | 'I' ) )
			int alt24=2;
			alt24 = dfa24.predict(input);
			switch (alt24) {
				case 1 :
					// R5RS.g3:532:6: REAL_16 ( '@' REAL_16 )?
					{
					mREAL_16(); 

					// R5RS.g3:532:14: ( '@' REAL_16 )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0=='@') ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// R5RS.g3:532:15: '@' REAL_16
							{
							match('@'); 
							mREAL_16(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// R5RS.g3:533:6: ( REAL_16 )? SIGN ( UREAL_16 )? ( 'i' | 'I' )
					{
					// R5RS.g3:533:6: ( REAL_16 )?
					int alt22=2;
					alt22 = dfa22.predict(input);
					switch (alt22) {
						case 1 :
							// R5RS.g3:533:6: REAL_16
							{
							mREAL_16(); 

							}
							break;

					}

					mSIGN(); 

					// R5RS.g3:533:20: ( UREAL_16 )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( ((LA23_0 >= '0' && LA23_0 <= '9')||(LA23_0 >= 'A' && LA23_0 <= 'F')||(LA23_0 >= 'a' && LA23_0 <= 'f')) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// R5RS.g3:533:20: UREAL_16
							{
							mUREAL_16(); 

							}
							break;

					}

					if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPLEX_16"

	// $ANTLR start "REAL_2"
	public final void mREAL_2() throws RecognitionException {
		try {
			// R5RS.g3:536:17: ( ( SIGN )? UREAL_2 )
			// R5RS.g3:536:19: ( SIGN )? UREAL_2
			{
			// R5RS.g3:536:19: ( SIGN )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0=='+'||LA25_0=='-') ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// R5RS.g3:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mUREAL_2(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL_2"

	// $ANTLR start "REAL_8"
	public final void mREAL_8() throws RecognitionException {
		try {
			// R5RS.g3:537:17: ( ( SIGN )? UREAL_8 )
			// R5RS.g3:537:19: ( SIGN )? UREAL_8
			{
			// R5RS.g3:537:19: ( SIGN )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0=='+'||LA26_0=='-') ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// R5RS.g3:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mUREAL_8(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL_8"

	// $ANTLR start "REAL_10"
	public final void mREAL_10() throws RecognitionException {
		try {
			// R5RS.g3:538:18: ( ( SIGN )? UREAL_10 )
			// R5RS.g3:538:20: ( SIGN )? UREAL_10
			{
			// R5RS.g3:538:20: ( SIGN )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='+'||LA27_0=='-') ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// R5RS.g3:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mUREAL_10(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL_10"

	// $ANTLR start "REAL_16"
	public final void mREAL_16() throws RecognitionException {
		try {
			// R5RS.g3:539:18: ( ( SIGN )? UREAL_16 )
			// R5RS.g3:539:20: ( SIGN )? UREAL_16
			{
			// R5RS.g3:539:20: ( SIGN )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0=='+'||LA28_0=='-') ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// R5RS.g3:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mUREAL_16(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL_16"

	// $ANTLR start "UREAL_2"
	public final void mUREAL_2() throws RecognitionException {
		try {
			// R5RS.g3:540:18: ( UINTEGER_2 ( '/' UINTEGER_2 )? )
			// R5RS.g3:540:20: UINTEGER_2 ( '/' UINTEGER_2 )?
			{
			mUINTEGER_2(); 

			// R5RS.g3:540:31: ( '/' UINTEGER_2 )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0=='/') ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// R5RS.g3:540:32: '/' UINTEGER_2
					{
					match('/'); 
					mUINTEGER_2(); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UREAL_2"

	// $ANTLR start "UREAL_8"
	public final void mUREAL_8() throws RecognitionException {
		try {
			// R5RS.g3:541:18: ( UINTEGER_8 ( '/' UINTEGER_8 )? )
			// R5RS.g3:541:20: UINTEGER_8 ( '/' UINTEGER_8 )?
			{
			mUINTEGER_8(); 

			// R5RS.g3:541:31: ( '/' UINTEGER_8 )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0=='/') ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// R5RS.g3:541:32: '/' UINTEGER_8
					{
					match('/'); 
					mUINTEGER_8(); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UREAL_8"

	// $ANTLR start "UREAL_10"
	public final void mUREAL_10() throws RecognitionException {
		try {
			// R5RS.g3:542:19: ( UINTEGER_10 ( '/' UINTEGER_10 )? | DECIMAL_10 )
			int alt32=2;
			alt32 = dfa32.predict(input);
			switch (alt32) {
				case 1 :
					// R5RS.g3:542:21: UINTEGER_10 ( '/' UINTEGER_10 )?
					{
					mUINTEGER_10(); 

					// R5RS.g3:542:33: ( '/' UINTEGER_10 )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0=='/') ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// R5RS.g3:542:34: '/' UINTEGER_10
							{
							match('/'); 
							mUINTEGER_10(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// R5RS.g3:542:54: DECIMAL_10
					{
					mDECIMAL_10(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UREAL_10"

	// $ANTLR start "UREAL_16"
	public final void mUREAL_16() throws RecognitionException {
		try {
			// R5RS.g3:543:19: ( UINTEGER_16 ( '/' UINTEGER_16 )? )
			// R5RS.g3:543:21: UINTEGER_16 ( '/' UINTEGER_16 )?
			{
			mUINTEGER_16(); 

			// R5RS.g3:543:33: ( '/' UINTEGER_16 )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0=='/') ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// R5RS.g3:543:34: '/' UINTEGER_16
					{
					match('/'); 
					mUINTEGER_16(); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UREAL_16"

	// $ANTLR start "DECIMAL_10"
	public final void mDECIMAL_10() throws RecognitionException {
		try {
			// R5RS.g3:546:3: ( UINTEGER_10 SUFFIX | '.' ( DIGIT )+ ( '#' )* ( SUFFIX )? | ( DIGIT )+ '.' ( DIGIT )* ( '#' )* ( SUFFIX )? | ( DIGIT )+ ( '#' )+ '.' ( '#' )* ( SUFFIX )? )
			int alt45=4;
			alt45 = dfa45.predict(input);
			switch (alt45) {
				case 1 :
					// R5RS.g3:546:6: UINTEGER_10 SUFFIX
					{
					mUINTEGER_10(); 

					mSUFFIX(); 

					}
					break;
				case 2 :
					// R5RS.g3:547:6: '.' ( DIGIT )+ ( '#' )* ( SUFFIX )?
					{
					match('.'); 
					// R5RS.g3:547:10: ( DIGIT )+
					int cnt34=0;
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( ((LA34_0 >= '0' && LA34_0 <= '9')) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// R5RS.g3:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt34 >= 1 ) break loop34;
							EarlyExitException eee = new EarlyExitException(34, input);
							throw eee;
						}
						cnt34++;
					}

					// R5RS.g3:547:17: ( '#' )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0=='#') ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// R5RS.g3:547:17: '#'
							{
							match('#'); 
							}
							break;

						default :
							break loop35;
						}
					}

					// R5RS.g3:547:22: ( SUFFIX )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( ((LA36_0 >= 'D' && LA36_0 <= 'F')||LA36_0=='L'||LA36_0=='S'||(LA36_0 >= 'd' && LA36_0 <= 'f')||LA36_0=='l'||LA36_0=='s') ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// R5RS.g3:547:22: SUFFIX
							{
							mSUFFIX(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// R5RS.g3:548:6: ( DIGIT )+ '.' ( DIGIT )* ( '#' )* ( SUFFIX )?
					{
					// R5RS.g3:548:6: ( DIGIT )+
					int cnt37=0;
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( ((LA37_0 >= '0' && LA37_0 <= '9')) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// R5RS.g3:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt37 >= 1 ) break loop37;
							EarlyExitException eee = new EarlyExitException(37, input);
							throw eee;
						}
						cnt37++;
					}

					match('.'); 
					// R5RS.g3:548:17: ( DIGIT )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( ((LA38_0 >= '0' && LA38_0 <= '9')) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// R5RS.g3:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop38;
						}
					}

					// R5RS.g3:548:24: ( '#' )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0=='#') ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// R5RS.g3:548:24: '#'
							{
							match('#'); 
							}
							break;

						default :
							break loop39;
						}
					}

					// R5RS.g3:548:29: ( SUFFIX )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( ((LA40_0 >= 'D' && LA40_0 <= 'F')||LA40_0=='L'||LA40_0=='S'||(LA40_0 >= 'd' && LA40_0 <= 'f')||LA40_0=='l'||LA40_0=='s') ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// R5RS.g3:548:29: SUFFIX
							{
							mSUFFIX(); 

							}
							break;

					}

					}
					break;
				case 4 :
					// R5RS.g3:549:6: ( DIGIT )+ ( '#' )+ '.' ( '#' )* ( SUFFIX )?
					{
					// R5RS.g3:549:6: ( DIGIT )+
					int cnt41=0;
					loop41:
					while (true) {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( ((LA41_0 >= '0' && LA41_0 <= '9')) ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// R5RS.g3:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt41 >= 1 ) break loop41;
							EarlyExitException eee = new EarlyExitException(41, input);
							throw eee;
						}
						cnt41++;
					}

					// R5RS.g3:549:13: ( '#' )+
					int cnt42=0;
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0=='#') ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// R5RS.g3:549:13: '#'
							{
							match('#'); 
							}
							break;

						default :
							if ( cnt42 >= 1 ) break loop42;
							EarlyExitException eee = new EarlyExitException(42, input);
							throw eee;
						}
						cnt42++;
					}

					match('.'); 
					// R5RS.g3:549:22: ( '#' )*
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0=='#') ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// R5RS.g3:549:22: '#'
							{
							match('#'); 
							}
							break;

						default :
							break loop43;
						}
					}

					// R5RS.g3:549:27: ( SUFFIX )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( ((LA44_0 >= 'D' && LA44_0 <= 'F')||LA44_0=='L'||LA44_0=='S'||(LA44_0 >= 'd' && LA44_0 <= 'f')||LA44_0=='l'||LA44_0=='s') ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// R5RS.g3:549:27: SUFFIX
							{
							mSUFFIX(); 

							}
							break;

					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECIMAL_10"

	// $ANTLR start "UINTEGER_2"
	public final void mUINTEGER_2() throws RecognitionException {
		try {
			// R5RS.g3:552:21: ( ( DIGIT_2 )+ ( '#' )* )
			// R5RS.g3:552:23: ( DIGIT_2 )+ ( '#' )*
			{
			// R5RS.g3:552:23: ( DIGIT_2 )+
			int cnt46=0;
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( ((LA46_0 >= '0' && LA46_0 <= '1')) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// R5RS.g3:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt46 >= 1 ) break loop46;
					EarlyExitException eee = new EarlyExitException(46, input);
					throw eee;
				}
				cnt46++;
			}

			// R5RS.g3:552:32: ( '#' )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0=='#') ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// R5RS.g3:552:32: '#'
					{
					match('#'); 
					}
					break;

				default :
					break loop47;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UINTEGER_2"

	// $ANTLR start "UINTEGER_8"
	public final void mUINTEGER_8() throws RecognitionException {
		try {
			// R5RS.g3:553:21: ( ( DIGIT_8 )+ ( '#' )* )
			// R5RS.g3:553:23: ( DIGIT_8 )+ ( '#' )*
			{
			// R5RS.g3:553:23: ( DIGIT_8 )+
			int cnt48=0;
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( ((LA48_0 >= '0' && LA48_0 <= '7')) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// R5RS.g3:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt48 >= 1 ) break loop48;
					EarlyExitException eee = new EarlyExitException(48, input);
					throw eee;
				}
				cnt48++;
			}

			// R5RS.g3:553:32: ( '#' )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0=='#') ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// R5RS.g3:553:32: '#'
					{
					match('#'); 
					}
					break;

				default :
					break loop49;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UINTEGER_8"

	// $ANTLR start "UINTEGER_10"
	public final void mUINTEGER_10() throws RecognitionException {
		try {
			// R5RS.g3:554:22: ( ( DIGIT )+ ( '#' )* )
			// R5RS.g3:554:24: ( DIGIT )+ ( '#' )*
			{
			// R5RS.g3:554:24: ( DIGIT )+
			int cnt50=0;
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( ((LA50_0 >= '0' && LA50_0 <= '9')) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// R5RS.g3:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt50 >= 1 ) break loop50;
					EarlyExitException eee = new EarlyExitException(50, input);
					throw eee;
				}
				cnt50++;
			}

			// R5RS.g3:554:31: ( '#' )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0=='#') ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// R5RS.g3:554:31: '#'
					{
					match('#'); 
					}
					break;

				default :
					break loop51;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UINTEGER_10"

	// $ANTLR start "UINTEGER_16"
	public final void mUINTEGER_16() throws RecognitionException {
		try {
			// R5RS.g3:555:22: ( ( DIGIT_16 )+ ( '#' )* )
			// R5RS.g3:555:24: ( DIGIT_16 )+ ( '#' )*
			{
			// R5RS.g3:555:24: ( DIGIT_16 )+
			int cnt52=0;
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( ((LA52_0 >= '0' && LA52_0 <= '9')||(LA52_0 >= 'A' && LA52_0 <= 'F')||(LA52_0 >= 'a' && LA52_0 <= 'f')) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// R5RS.g3:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt52 >= 1 ) break loop52;
					EarlyExitException eee = new EarlyExitException(52, input);
					throw eee;
				}
				cnt52++;
			}

			// R5RS.g3:555:34: ( '#' )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0=='#') ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// R5RS.g3:555:34: '#'
					{
					match('#'); 
					}
					break;

				default :
					break loop53;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UINTEGER_16"

	// $ANTLR start "PREFIX_2"
	public final void mPREFIX_2() throws RecognitionException {
		try {
			// R5RS.g3:556:19: ( RADIX_2 ( EXACTNESS )? | EXACTNESS RADIX_2 )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0=='#') ) {
				int LA55_1 = input.LA(2);
				if ( (LA55_1=='B'||LA55_1=='b') ) {
					alt55=1;
				}
				else if ( (LA55_1=='E'||LA55_1=='I'||LA55_1=='e'||LA55_1=='i') ) {
					alt55=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// R5RS.g3:556:21: RADIX_2 ( EXACTNESS )?
					{
					mRADIX_2(); 

					// R5RS.g3:556:29: ( EXACTNESS )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0=='#') ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// R5RS.g3:556:29: EXACTNESS
							{
							mEXACTNESS(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// R5RS.g3:556:42: EXACTNESS RADIX_2
					{
					mEXACTNESS(); 

					mRADIX_2(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PREFIX_2"

	// $ANTLR start "PREFIX_8"
	public final void mPREFIX_8() throws RecognitionException {
		try {
			// R5RS.g3:557:19: ( RADIX_8 ( EXACTNESS )? | EXACTNESS RADIX_8 )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0=='#') ) {
				int LA57_1 = input.LA(2);
				if ( (LA57_1=='O'||LA57_1=='o') ) {
					alt57=1;
				}
				else if ( (LA57_1=='E'||LA57_1=='I'||LA57_1=='e'||LA57_1=='i') ) {
					alt57=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 57, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// R5RS.g3:557:21: RADIX_8 ( EXACTNESS )?
					{
					mRADIX_8(); 

					// R5RS.g3:557:29: ( EXACTNESS )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0=='#') ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// R5RS.g3:557:29: EXACTNESS
							{
							mEXACTNESS(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// R5RS.g3:557:42: EXACTNESS RADIX_8
					{
					mEXACTNESS(); 

					mRADIX_8(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PREFIX_8"

	// $ANTLR start "PREFIX_10"
	public final void mPREFIX_10() throws RecognitionException {
		try {
			// R5RS.g3:558:20: ( RADIX_10 ( EXACTNESS )? | EXACTNESS RADIX_10 )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0=='#') ) {
				int LA59_1 = input.LA(2);
				if ( (LA59_1=='D'||LA59_1=='d') ) {
					alt59=1;
				}
				else if ( (LA59_1=='E'||LA59_1=='I'||LA59_1=='e'||LA59_1=='i') ) {
					alt59=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 59, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// R5RS.g3:558:22: RADIX_10 ( EXACTNESS )?
					{
					mRADIX_10(); 

					// R5RS.g3:558:31: ( EXACTNESS )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0=='#') ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// R5RS.g3:558:31: EXACTNESS
							{
							mEXACTNESS(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// R5RS.g3:558:44: EXACTNESS RADIX_10
					{
					mEXACTNESS(); 

					mRADIX_10(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PREFIX_10"

	// $ANTLR start "PREFIX_16"
	public final void mPREFIX_16() throws RecognitionException {
		try {
			// R5RS.g3:559:20: ( RADIX_16 ( EXACTNESS )? | EXACTNESS RADIX_16 )
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0=='#') ) {
				int LA61_1 = input.LA(2);
				if ( (LA61_1=='X'||LA61_1=='x') ) {
					alt61=1;
				}
				else if ( (LA61_1=='E'||LA61_1=='I'||LA61_1=='e'||LA61_1=='i') ) {
					alt61=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 61, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}

			switch (alt61) {
				case 1 :
					// R5RS.g3:559:22: RADIX_16 ( EXACTNESS )?
					{
					mRADIX_16(); 

					// R5RS.g3:559:31: ( EXACTNESS )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0=='#') ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// R5RS.g3:559:31: EXACTNESS
							{
							mEXACTNESS(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// R5RS.g3:559:44: EXACTNESS RADIX_16
					{
					mEXACTNESS(); 

					mRADIX_16(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PREFIX_16"

	// $ANTLR start "SUFFIX"
	public final void mSUFFIX() throws RecognitionException {
		try {
			// R5RS.g3:560:17: ( EXPONENT_MARKER ( SIGN )? ( DIGIT )+ )
			// R5RS.g3:560:19: EXPONENT_MARKER ( SIGN )? ( DIGIT )+
			{
			mEXPONENT_MARKER(); 

			// R5RS.g3:560:35: ( SIGN )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0=='+'||LA62_0=='-') ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// R5RS.g3:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// R5RS.g3:560:41: ( DIGIT )+
			int cnt63=0;
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( ((LA63_0 >= '0' && LA63_0 <= '9')) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// R5RS.g3:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt63 >= 1 ) break loop63;
					EarlyExitException eee = new EarlyExitException(63, input);
					throw eee;
				}
				cnt63++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUFFIX"

	// $ANTLR start "EXPONENT_MARKER"
	public final void mEXPONENT_MARKER() throws RecognitionException {
		try {
			// R5RS.g3:561:26: ( 'e' | 's' | 'f' | 'd' | 'l' | 'E' | 'S' | 'F' | 'D' | 'L' )
			// R5RS.g3:
			{
			if ( (input.LA(1) >= 'D' && input.LA(1) <= 'F')||input.LA(1)=='L'||input.LA(1)=='S'||(input.LA(1) >= 'd' && input.LA(1) <= 'f')||input.LA(1)=='l'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT_MARKER"

	// $ANTLR start "SIGN"
	public final void mSIGN() throws RecognitionException {
		try {
			// R5RS.g3:562:15: ( '+' | '-' )
			// R5RS.g3:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIGN"

	// $ANTLR start "EXACTNESS"
	public final void mEXACTNESS() throws RecognitionException {
		try {
			// R5RS.g3:563:20: ( '#' ( 'i' | 'e' | 'I' | 'E' ) )
			// R5RS.g3:563:22: '#' ( 'i' | 'e' | 'I' | 'E' )
			{
			match('#'); 
			if ( input.LA(1)=='E'||input.LA(1)=='I'||input.LA(1)=='e'||input.LA(1)=='i' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXACTNESS"

	// $ANTLR start "RADIX_2"
	public final void mRADIX_2() throws RecognitionException {
		try {
			// R5RS.g3:564:18: ( '#' ( 'b' | 'B' ) )
			// R5RS.g3:564:20: '#' ( 'b' | 'B' )
			{
			match('#'); 
			if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RADIX_2"

	// $ANTLR start "RADIX_8"
	public final void mRADIX_8() throws RecognitionException {
		try {
			// R5RS.g3:565:18: ( '#' ( 'o' | 'O' ) )
			// R5RS.g3:565:20: '#' ( 'o' | 'O' )
			{
			match('#'); 
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RADIX_8"

	// $ANTLR start "RADIX_10"
	public final void mRADIX_10() throws RecognitionException {
		try {
			// R5RS.g3:566:19: ( '#' ( 'd' | 'D' ) )
			// R5RS.g3:566:21: '#' ( 'd' | 'D' )
			{
			match('#'); 
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RADIX_10"

	// $ANTLR start "RADIX_16"
	public final void mRADIX_16() throws RecognitionException {
		try {
			// R5RS.g3:567:19: ( '#' ( 'x' | 'X' ) )
			// R5RS.g3:567:21: '#' ( 'x' | 'X' )
			{
			match('#'); 
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RADIX_16"

	// $ANTLR start "DIGIT_2"
	public final void mDIGIT_2() throws RecognitionException {
		try {
			// R5RS.g3:568:18: ( '0' | '1' )
			// R5RS.g3:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT_2"

	// $ANTLR start "DIGIT_8"
	public final void mDIGIT_8() throws RecognitionException {
		try {
			// R5RS.g3:569:18: ( '0' .. '7' )
			// R5RS.g3:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT_8"

	// $ANTLR start "DIGIT_16"
	public final void mDIGIT_16() throws RecognitionException {
		try {
			// R5RS.g3:570:19: ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )
			// R5RS.g3:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT_16"

	@Override
	public void mTokens() throws RecognitionException {
		// R5RS.g3:1:8: ( T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | LET_SYNTAX | LETREC_SYNTAX | SYNTAX_RULES | DEFINE_SYNTAX | ELSE | ARROW | DEFINE | UNQUOTE_SPLICING | UNQUOTE | QUOTE | LAMBDA | IF | SET | BEGIN | COND | AND | OR | CASE | LET | LETSTAR | LETREC | DO | DELAY | QUASIQUOTE | NUM_2 | NUM_8 | NUM_10 | NUM_16 | ELLIPSIS | VARIABLE | STRING | CHARACTER | TRUE | FALSE | SPACE | COMMENT )
		int alt64=45;
		alt64 = dfa64.predict(input);
		switch (alt64) {
			case 1 :
				// R5RS.g3:1:10: T__112
				{
				mT__112(); 

				}
				break;
			case 2 :
				// R5RS.g3:1:17: T__113
				{
				mT__113(); 

				}
				break;
			case 3 :
				// R5RS.g3:1:24: T__114
				{
				mT__114(); 

				}
				break;
			case 4 :
				// R5RS.g3:1:31: T__115
				{
				mT__115(); 

				}
				break;
			case 5 :
				// R5RS.g3:1:38: T__116
				{
				mT__116(); 

				}
				break;
			case 6 :
				// R5RS.g3:1:45: T__117
				{
				mT__117(); 

				}
				break;
			case 7 :
				// R5RS.g3:1:52: T__118
				{
				mT__118(); 

				}
				break;
			case 8 :
				// R5RS.g3:1:59: T__119
				{
				mT__119(); 

				}
				break;
			case 9 :
				// R5RS.g3:1:66: T__120
				{
				mT__120(); 

				}
				break;
			case 10 :
				// R5RS.g3:1:73: LET_SYNTAX
				{
				mLET_SYNTAX(); 

				}
				break;
			case 11 :
				// R5RS.g3:1:84: LETREC_SYNTAX
				{
				mLETREC_SYNTAX(); 

				}
				break;
			case 12 :
				// R5RS.g3:1:98: SYNTAX_RULES
				{
				mSYNTAX_RULES(); 

				}
				break;
			case 13 :
				// R5RS.g3:1:111: DEFINE_SYNTAX
				{
				mDEFINE_SYNTAX(); 

				}
				break;
			case 14 :
				// R5RS.g3:1:125: ELSE
				{
				mELSE(); 

				}
				break;
			case 15 :
				// R5RS.g3:1:130: ARROW
				{
				mARROW(); 

				}
				break;
			case 16 :
				// R5RS.g3:1:136: DEFINE
				{
				mDEFINE(); 

				}
				break;
			case 17 :
				// R5RS.g3:1:143: UNQUOTE_SPLICING
				{
				mUNQUOTE_SPLICING(); 

				}
				break;
			case 18 :
				// R5RS.g3:1:160: UNQUOTE
				{
				mUNQUOTE(); 

				}
				break;
			case 19 :
				// R5RS.g3:1:168: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 20 :
				// R5RS.g3:1:174: LAMBDA
				{
				mLAMBDA(); 

				}
				break;
			case 21 :
				// R5RS.g3:1:181: IF
				{
				mIF(); 

				}
				break;
			case 22 :
				// R5RS.g3:1:184: SET
				{
				mSET(); 

				}
				break;
			case 23 :
				// R5RS.g3:1:188: BEGIN
				{
				mBEGIN(); 

				}
				break;
			case 24 :
				// R5RS.g3:1:194: COND
				{
				mCOND(); 

				}
				break;
			case 25 :
				// R5RS.g3:1:199: AND
				{
				mAND(); 

				}
				break;
			case 26 :
				// R5RS.g3:1:203: OR
				{
				mOR(); 

				}
				break;
			case 27 :
				// R5RS.g3:1:206: CASE
				{
				mCASE(); 

				}
				break;
			case 28 :
				// R5RS.g3:1:211: LET
				{
				mLET(); 

				}
				break;
			case 29 :
				// R5RS.g3:1:215: LETSTAR
				{
				mLETSTAR(); 

				}
				break;
			case 30 :
				// R5RS.g3:1:223: LETREC
				{
				mLETREC(); 

				}
				break;
			case 31 :
				// R5RS.g3:1:230: DO
				{
				mDO(); 

				}
				break;
			case 32 :
				// R5RS.g3:1:233: DELAY
				{
				mDELAY(); 

				}
				break;
			case 33 :
				// R5RS.g3:1:239: QUASIQUOTE
				{
				mQUASIQUOTE(); 

				}
				break;
			case 34 :
				// R5RS.g3:1:250: NUM_2
				{
				mNUM_2(); 

				}
				break;
			case 35 :
				// R5RS.g3:1:256: NUM_8
				{
				mNUM_8(); 

				}
				break;
			case 36 :
				// R5RS.g3:1:262: NUM_10
				{
				mNUM_10(); 

				}
				break;
			case 37 :
				// R5RS.g3:1:269: NUM_16
				{
				mNUM_16(); 

				}
				break;
			case 38 :
				// R5RS.g3:1:276: ELLIPSIS
				{
				mELLIPSIS(); 

				}
				break;
			case 39 :
				// R5RS.g3:1:285: VARIABLE
				{
				mVARIABLE(); 

				}
				break;
			case 40 :
				// R5RS.g3:1:294: STRING
				{
				mSTRING(); 

				}
				break;
			case 41 :
				// R5RS.g3:1:301: CHARACTER
				{
				mCHARACTER(); 

				}
				break;
			case 42 :
				// R5RS.g3:1:311: TRUE
				{
				mTRUE(); 

				}
				break;
			case 43 :
				// R5RS.g3:1:316: FALSE
				{
				mFALSE(); 

				}
				break;
			case 44 :
				// R5RS.g3:1:322: SPACE
				{
				mSPACE(); 

				}
				break;
			case 45 :
				// R5RS.g3:1:328: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	protected DFA10 dfa10 = new DFA10(this);
	protected DFA16 dfa16 = new DFA16(this);
	protected DFA14 dfa14 = new DFA14(this);
	protected DFA20 dfa20 = new DFA20(this);
	protected DFA18 dfa18 = new DFA18(this);
	protected DFA24 dfa24 = new DFA24(this);
	protected DFA22 dfa22 = new DFA22(this);
	protected DFA32 dfa32 = new DFA32(this);
	protected DFA45 dfa45 = new DFA45(this);
	protected DFA64 dfa64 = new DFA64(this);
	static final String DFA12_eotS =
		"\2\uffff\2\6\1\uffff\1\6\2\uffff\1\6\1\uffff\4\6";
	static final String DFA12_eofS =
		"\16\uffff";
	static final String DFA12_minS =
		"\1\53\1\60\2\43\1\uffff\1\43\1\uffff\1\60\1\43\1\60\4\43";
	static final String DFA12_maxS =
		"\1\61\1\151\1\61\1\151\1\uffff\1\57\1\uffff\1\61\1\151\2\61\1\151\1\55"+
		"\1\151";
	static final String DFA12_acceptS =
		"\4\uffff\1\2\1\uffff\1\1\7\uffff";
	static final String DFA12_specialS =
		"\16\uffff}>";
	static final String[] DFA12_transitionS = {
			"\1\1\1\uffff\1\1\2\uffff\2\2",
			"\2\3\27\uffff\1\4\37\uffff\1\4",
			"\1\5\7\uffff\1\4\1\uffff\1\4\1\uffff\1\7\2\2",
			"\1\10\7\uffff\1\4\1\uffff\1\4\1\uffff\1\11\2\3\27\uffff\1\4\37\uffff"+
			"\1\4",
			"",
			"\1\5\7\uffff\1\4\1\uffff\1\4\1\uffff\1\7",
			"",
			"\2\12",
			"\1\10\7\uffff\1\4\1\uffff\1\4\1\uffff\1\11\31\uffff\1\4\37\uffff\1\4",
			"\2\13",
			"\1\14\7\uffff\1\4\1\uffff\1\4\2\uffff\2\12",
			"\1\15\7\uffff\1\4\1\uffff\1\4\2\uffff\2\13\27\uffff\1\4\37\uffff\1\4",
			"\1\14\7\uffff\1\4\1\uffff\1\4",
			"\1\15\7\uffff\1\4\1\uffff\1\4\33\uffff\1\4\37\uffff\1\4"
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "516:10: fragment COMPLEX_2 : ( REAL_2 ( '@' REAL_2 )? | ( REAL_2 )? SIGN ( UREAL_2 )? ( 'i' | 'I' ) );";
		}
	}

	static final String DFA10_eotS =
		"\11\uffff";
	static final String DFA10_eofS =
		"\11\uffff";
	static final String DFA10_minS =
		"\1\53\1\60\1\uffff\1\43\1\uffff\1\43\1\60\2\43";
	static final String DFA10_maxS =
		"\1\61\1\151\1\uffff\1\151\1\uffff\1\151\1\61\2\151";
	static final String DFA10_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\4\uffff";
	static final String DFA10_specialS =
		"\11\uffff}>";
	static final String[] DFA10_transitionS = {
			"\1\1\1\uffff\1\1\2\uffff\2\2",
			"\2\3\27\uffff\1\4\37\uffff\1\4",
			"",
			"\1\5\7\uffff\1\2\1\uffff\1\2\1\uffff\1\6\2\3\27\uffff\1\4\37\uffff\1"+
			"\4",
			"",
			"\1\5\7\uffff\1\2\1\uffff\1\2\1\uffff\1\6\31\uffff\1\4\37\uffff\1\4",
			"\2\7",
			"\1\10\7\uffff\1\2\1\uffff\1\2\2\uffff\2\7\27\uffff\1\4\37\uffff\1\4",
			"\1\10\7\uffff\1\2\1\uffff\1\2\33\uffff\1\4\37\uffff\1\4"
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "518:6: ( REAL_2 )?";
		}
	}

	static final String DFA16_eotS =
		"\2\uffff\2\6\1\uffff\1\6\2\uffff\1\6\1\uffff\4\6";
	static final String DFA16_eofS =
		"\16\uffff";
	static final String DFA16_minS =
		"\1\53\1\60\2\43\1\uffff\1\43\1\uffff\1\60\1\43\1\60\4\43";
	static final String DFA16_maxS =
		"\1\67\1\151\1\67\1\151\1\uffff\1\57\1\uffff\1\67\1\151\2\67\1\151\1\55"+
		"\1\151";
	static final String DFA16_acceptS =
		"\4\uffff\1\2\1\uffff\1\1\7\uffff";
	static final String DFA16_specialS =
		"\16\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\1\1\uffff\1\1\2\uffff\10\2",
			"\10\3\21\uffff\1\4\37\uffff\1\4",
			"\1\5\7\uffff\1\4\1\uffff\1\4\1\uffff\1\7\10\2",
			"\1\10\7\uffff\1\4\1\uffff\1\4\1\uffff\1\11\10\3\21\uffff\1\4\37\uffff"+
			"\1\4",
			"",
			"\1\5\7\uffff\1\4\1\uffff\1\4\1\uffff\1\7",
			"",
			"\10\12",
			"\1\10\7\uffff\1\4\1\uffff\1\4\1\uffff\1\11\31\uffff\1\4\37\uffff\1\4",
			"\10\13",
			"\1\14\7\uffff\1\4\1\uffff\1\4\2\uffff\10\12",
			"\1\15\7\uffff\1\4\1\uffff\1\4\2\uffff\10\13\21\uffff\1\4\37\uffff\1"+
			"\4",
			"\1\14\7\uffff\1\4\1\uffff\1\4",
			"\1\15\7\uffff\1\4\1\uffff\1\4\33\uffff\1\4\37\uffff\1\4"
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "521:10: fragment COMPLEX_8 : ( REAL_8 ( '@' REAL_8 )? | ( REAL_8 )? SIGN ( UREAL_8 )? ( 'i' | 'I' ) );";
		}
	}

	static final String DFA14_eotS =
		"\11\uffff";
	static final String DFA14_eofS =
		"\11\uffff";
	static final String DFA14_minS =
		"\1\53\1\60\1\uffff\1\43\1\uffff\1\43\1\60\2\43";
	static final String DFA14_maxS =
		"\1\67\1\151\1\uffff\1\151\1\uffff\1\151\1\67\2\151";
	static final String DFA14_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\4\uffff";
	static final String DFA14_specialS =
		"\11\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\1\1\uffff\1\1\2\uffff\10\2",
			"\10\3\21\uffff\1\4\37\uffff\1\4",
			"",
			"\1\5\7\uffff\1\2\1\uffff\1\2\1\uffff\1\6\10\3\21\uffff\1\4\37\uffff"+
			"\1\4",
			"",
			"\1\5\7\uffff\1\2\1\uffff\1\2\1\uffff\1\6\31\uffff\1\4\37\uffff\1\4",
			"\10\7",
			"\1\10\7\uffff\1\2\1\uffff\1\2\2\uffff\10\7\21\uffff\1\4\37\uffff\1\4",
			"\1\10\7\uffff\1\2\1\uffff\1\2\33\uffff\1\4\37\uffff\1\4"
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "523:6: ( REAL_8 )?";
		}
	}

	static final String DFA20_eotS =
		"\2\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff\3\10\2\uffff\4\10\1\uffff"+
		"\3\10\1\uffff\1\10\1\uffff\2\10\1\uffff\3\10\1\uffff\1\10\1\uffff\1\10"+
		"\1\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff\1\10\1\uffff\1\10\1\uffff"+
		"\1\10\1\uffff\1\10\1\uffff\1\10";
	static final String DFA20_eofS =
		"\66\uffff";
	static final String DFA20_minS =
		"\1\53\1\56\1\43\1\60\1\43\1\60\1\uffff\1\43\1\uffff\1\60\1\53\3\43\1\60"+
		"\1\53\4\43\1\60\1\53\2\43\1\53\1\43\1\53\2\43\1\60\1\53\2\43\1\53\1\43"+
		"\1\53\1\43\1\53\1\43\1\60\1\53\1\60\1\53\1\43\1\53\1\43\1\60\1\53\1\60"+
		"\1\53\1\60\1\53\1\60\1\53";
	static final String DFA20_maxS =
		"\1\71\1\151\1\163\1\71\1\163\1\71\1\uffff\1\163\1\uffff\2\71\3\163\2\71"+
		"\3\163\3\71\2\163\1\71\1\163\1\71\1\163\1\151\1\71\1\151\2\163\1\71\1"+
		"\163\1\71\1\163\1\71\1\55\4\71\1\163\1\71\1\151\1\71\1\151\1\71\1\151"+
		"\3\71\1\151";
	static final String DFA20_acceptS =
		"\6\uffff\1\2\1\uffff\1\1\55\uffff";
	static final String DFA20_specialS =
		"\66\uffff}>";
	static final String[] DFA20_transitionS = {
			"\1\1\1\uffff\1\1\1\3\1\uffff\12\2",
			"\1\5\1\uffff\12\4\17\uffff\1\6\37\uffff\1\6",
			"\1\7\7\uffff\1\6\1\uffff\1\6\1\13\1\11\12\2\12\uffff\3\12\5\uffff\1"+
			"\12\6\uffff\1\12\20\uffff\3\12\5\uffff\1\12\6\uffff\1\12",
			"\12\14",
			"\1\15\7\uffff\1\6\1\uffff\1\6\1\20\1\16\12\4\12\uffff\3\17\2\uffff\1"+
			"\6\2\uffff\1\17\6\uffff\1\17\20\uffff\3\17\2\uffff\1\6\2\uffff\1\17\6"+
			"\uffff\1\17",
			"\12\21",
			"",
			"\1\7\7\uffff\1\6\1\uffff\1\6\1\22\1\11\24\uffff\3\12\5\uffff\1\12\6"+
			"\uffff\1\12\20\uffff\3\12\5\uffff\1\12\6\uffff\1\12",
			"",
			"\12\23",
			"\1\24\1\uffff\1\24\2\uffff\12\25",
			"\1\27\7\uffff\1\6\1\uffff\1\6\2\uffff\12\26\12\uffff\3\30\5\uffff\1"+
			"\30\6\uffff\1\30\20\uffff\3\30\5\uffff\1\30\6\uffff\1\30",
			"\1\31\7\uffff\1\6\1\uffff\1\6\2\uffff\12\14\12\uffff\3\32\5\uffff\1"+
			"\32\6\uffff\1\32\20\uffff\3\32\5\uffff\1\32\6\uffff\1\32",
			"\1\15\7\uffff\1\6\1\uffff\1\6\1\33\1\16\24\uffff\3\17\2\uffff\1\6\2"+
			"\uffff\1\17\6\uffff\1\17\20\uffff\3\17\2\uffff\1\6\2\uffff\1\17\6\uffff"+
			"\1\17",
			"\12\34",
			"\1\35\1\uffff\1\35\2\uffff\12\36",
			"\1\40\7\uffff\1\6\1\uffff\1\6\2\uffff\12\37\12\uffff\3\41\2\uffff\1"+
			"\6\2\uffff\1\41\6\uffff\1\41\20\uffff\3\41\2\uffff\1\6\2\uffff\1\41\6"+
			"\uffff\1\41",
			"\1\42\7\uffff\1\6\1\uffff\1\6\2\uffff\12\21\12\uffff\3\43\2\uffff\1"+
			"\6\2\uffff\1\43\6\uffff\1\43\20\uffff\3\43\2\uffff\1\6\2\uffff\1\43\6"+
			"\uffff\1\43",
			"\1\44\7\uffff\1\6\1\uffff\1\6\26\uffff\3\45\5\uffff\1\45\6\uffff\1\45"+
			"\20\uffff\3\45\5\uffff\1\45\6\uffff\1\45",
			"\1\46\7\uffff\1\6\1\uffff\1\6\2\uffff\12\23",
			"\12\25",
			"\1\6\1\uffff\1\6\2\uffff\12\25",
			"\1\27\7\uffff\1\6\1\uffff\1\6\2\uffff\12\26\12\uffff\3\30\5\uffff\1"+
			"\30\6\uffff\1\30\20\uffff\3\30\5\uffff\1\30\6\uffff\1\30",
			"\1\27\7\uffff\1\6\1\uffff\1\6\26\uffff\3\30\5\uffff\1\30\6\uffff\1\30"+
			"\20\uffff\3\30\5\uffff\1\30\6\uffff\1\30",
			"\1\47\1\uffff\1\47\2\uffff\12\50",
			"\1\31\7\uffff\1\6\1\uffff\1\6\26\uffff\3\32\5\uffff\1\32\6\uffff\1\32"+
			"\20\uffff\3\32\5\uffff\1\32\6\uffff\1\32",
			"\1\51\1\uffff\1\51\2\uffff\12\52",
			"\1\53\7\uffff\1\6\1\uffff\1\6\26\uffff\3\54\2\uffff\1\6\2\uffff\1\54"+
			"\6\uffff\1\54\20\uffff\3\54\2\uffff\1\6\2\uffff\1\54\6\uffff\1\54",
			"\1\55\7\uffff\1\6\1\uffff\1\6\2\uffff\12\34\17\uffff\1\6\37\uffff\1"+
			"\6",
			"\12\36",
			"\1\6\1\uffff\1\6\2\uffff\12\36\17\uffff\1\6\37\uffff\1\6",
			"\1\40\7\uffff\1\6\1\uffff\1\6\2\uffff\12\37\12\uffff\3\41\2\uffff\1"+
			"\6\2\uffff\1\41\6\uffff\1\41\20\uffff\3\41\2\uffff\1\6\2\uffff\1\41\6"+
			"\uffff\1\41",
			"\1\40\7\uffff\1\6\1\uffff\1\6\26\uffff\3\41\2\uffff\1\6\2\uffff\1\41"+
			"\6\uffff\1\41\20\uffff\3\41\2\uffff\1\6\2\uffff\1\41\6\uffff\1\41",
			"\1\56\1\uffff\1\56\2\uffff\12\57",
			"\1\42\7\uffff\1\6\1\uffff\1\6\26\uffff\3\43\2\uffff\1\6\2\uffff\1\43"+
			"\6\uffff\1\43\20\uffff\3\43\2\uffff\1\6\2\uffff\1\43\6\uffff\1\43",
			"\1\60\1\uffff\1\60\2\uffff\12\61",
			"\1\44\7\uffff\1\6\1\uffff\1\6\26\uffff\3\45\5\uffff\1\45\6\uffff\1\45"+
			"\20\uffff\3\45\5\uffff\1\45\6\uffff\1\45",
			"\1\62\1\uffff\1\62\2\uffff\12\63",
			"\1\46\7\uffff\1\6\1\uffff\1\6",
			"\12\50",
			"\1\6\1\uffff\1\6\2\uffff\12\50",
			"\12\52",
			"\1\6\1\uffff\1\6\2\uffff\12\52",
			"\1\53\7\uffff\1\6\1\uffff\1\6\26\uffff\3\54\2\uffff\1\6\2\uffff\1\54"+
			"\6\uffff\1\54\20\uffff\3\54\2\uffff\1\6\2\uffff\1\54\6\uffff\1\54",
			"\1\64\1\uffff\1\64\2\uffff\12\65",
			"\1\55\7\uffff\1\6\1\uffff\1\6\33\uffff\1\6\37\uffff\1\6",
			"\12\57",
			"\1\6\1\uffff\1\6\2\uffff\12\57\17\uffff\1\6\37\uffff\1\6",
			"\12\61",
			"\1\6\1\uffff\1\6\2\uffff\12\61\17\uffff\1\6\37\uffff\1\6",
			"\12\63",
			"\1\6\1\uffff\1\6\2\uffff\12\63",
			"\12\65",
			"\1\6\1\uffff\1\6\2\uffff\12\65\17\uffff\1\6\37\uffff\1\6"
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "526:10: fragment COMPLEX_10 : ( REAL_10 ( '@' REAL_10 )? | ( REAL_10 )? SIGN ( UREAL_10 )? ( 'i' | 'I' ) );";
		}
	}

	static final String DFA18_eotS =
		"\35\uffff";
	static final String DFA18_eofS =
		"\35\uffff";
	static final String DFA18_minS =
		"\1\53\1\56\1\uffff\1\43\1\60\1\uffff\1\43\1\60\1\53\4\43\1\60\1\53\2\43"+
		"\1\53\1\43\1\53\1\43\1\53\1\43\1\60\1\53\1\60\1\53\1\60\1\53";
	static final String DFA18_maxS =
		"\1\71\1\151\1\uffff\1\163\1\71\1\uffff\1\163\2\71\3\163\1\151\1\71\1\151"+
		"\2\163\1\71\1\163\1\71\1\163\1\71\1\151\1\71\1\151\1\71\1\151\1\71\1\151";
	static final String DFA18_acceptS =
		"\2\uffff\1\1\2\uffff\1\2\27\uffff";
	static final String DFA18_specialS =
		"\35\uffff}>";
	static final String[] DFA18_transitionS = {
			"\1\1\1\uffff\1\1\1\2\1\uffff\12\2",
			"\1\4\1\uffff\12\3\17\uffff\1\5\37\uffff\1\5",
			"",
			"\1\6\7\uffff\1\2\1\uffff\1\2\1\11\1\7\12\3\12\uffff\3\10\2\uffff\1\5"+
			"\2\uffff\1\10\6\uffff\1\10\20\uffff\3\10\2\uffff\1\5\2\uffff\1\10\6\uffff"+
			"\1\10",
			"\12\12",
			"",
			"\1\6\7\uffff\1\2\1\uffff\1\2\1\13\1\7\24\uffff\3\10\2\uffff\1\5\2\uffff"+
			"\1\10\6\uffff\1\10\20\uffff\3\10\2\uffff\1\5\2\uffff\1\10\6\uffff\1\10",
			"\12\14",
			"\1\15\1\uffff\1\15\2\uffff\12\16",
			"\1\20\7\uffff\1\2\1\uffff\1\2\2\uffff\12\17\12\uffff\3\21\2\uffff\1"+
			"\5\2\uffff\1\21\6\uffff\1\21\20\uffff\3\21\2\uffff\1\5\2\uffff\1\21\6"+
			"\uffff\1\21",
			"\1\22\7\uffff\1\2\1\uffff\1\2\2\uffff\12\12\12\uffff\3\23\2\uffff\1"+
			"\5\2\uffff\1\23\6\uffff\1\23\20\uffff\3\23\2\uffff\1\5\2\uffff\1\23\6"+
			"\uffff\1\23",
			"\1\24\7\uffff\1\2\1\uffff\1\2\26\uffff\3\25\2\uffff\1\5\2\uffff\1\25"+
			"\6\uffff\1\25\20\uffff\3\25\2\uffff\1\5\2\uffff\1\25\6\uffff\1\25",
			"\1\26\7\uffff\1\2\1\uffff\1\2\2\uffff\12\14\17\uffff\1\5\37\uffff\1"+
			"\5",
			"\12\16",
			"\1\2\1\uffff\1\2\2\uffff\12\16\17\uffff\1\5\37\uffff\1\5",
			"\1\20\7\uffff\1\2\1\uffff\1\2\2\uffff\12\17\12\uffff\3\21\2\uffff\1"+
			"\5\2\uffff\1\21\6\uffff\1\21\20\uffff\3\21\2\uffff\1\5\2\uffff\1\21\6"+
			"\uffff\1\21",
			"\1\20\7\uffff\1\2\1\uffff\1\2\26\uffff\3\21\2\uffff\1\5\2\uffff\1\21"+
			"\6\uffff\1\21\20\uffff\3\21\2\uffff\1\5\2\uffff\1\21\6\uffff\1\21",
			"\1\27\1\uffff\1\27\2\uffff\12\30",
			"\1\22\7\uffff\1\2\1\uffff\1\2\26\uffff\3\23\2\uffff\1\5\2\uffff\1\23"+
			"\6\uffff\1\23\20\uffff\3\23\2\uffff\1\5\2\uffff\1\23\6\uffff\1\23",
			"\1\31\1\uffff\1\31\2\uffff\12\32",
			"\1\24\7\uffff\1\2\1\uffff\1\2\26\uffff\3\25\2\uffff\1\5\2\uffff\1\25"+
			"\6\uffff\1\25\20\uffff\3\25\2\uffff\1\5\2\uffff\1\25\6\uffff\1\25",
			"\1\33\1\uffff\1\33\2\uffff\12\34",
			"\1\26\7\uffff\1\2\1\uffff\1\2\33\uffff\1\5\37\uffff\1\5",
			"\12\30",
			"\1\2\1\uffff\1\2\2\uffff\12\30\17\uffff\1\5\37\uffff\1\5",
			"\12\32",
			"\1\2\1\uffff\1\2\2\uffff\12\32\17\uffff\1\5\37\uffff\1\5",
			"\12\34",
			"\1\2\1\uffff\1\2\2\uffff\12\34\17\uffff\1\5\37\uffff\1\5"
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "528:6: ( REAL_10 )?";
		}
	}

	static final String DFA24_eotS =
		"\2\uffff\2\6\1\uffff\1\6\2\uffff\1\6\1\uffff\4\6";
	static final String DFA24_eofS =
		"\16\uffff";
	static final String DFA24_minS =
		"\1\53\1\60\2\43\1\uffff\1\43\1\uffff\1\60\1\43\1\60\4\43";
	static final String DFA24_maxS =
		"\1\146\1\151\1\146\1\151\1\uffff\1\57\1\uffff\1\146\1\151\2\146\1\151"+
		"\1\55\1\151";
	static final String DFA24_acceptS =
		"\4\uffff\1\2\1\uffff\1\1\7\uffff";
	static final String DFA24_specialS =
		"\16\uffff}>";
	static final String[] DFA24_transitionS = {
			"\1\1\1\uffff\1\1\2\uffff\12\2\7\uffff\6\2\32\uffff\6\2",
			"\12\3\7\uffff\6\3\2\uffff\1\4\27\uffff\6\3\2\uffff\1\4",
			"\1\5\7\uffff\1\4\1\uffff\1\4\1\uffff\1\7\12\2\7\uffff\6\2\32\uffff\6"+
			"\2",
			"\1\10\7\uffff\1\4\1\uffff\1\4\1\uffff\1\11\12\3\7\uffff\6\3\2\uffff"+
			"\1\4\27\uffff\6\3\2\uffff\1\4",
			"",
			"\1\5\7\uffff\1\4\1\uffff\1\4\1\uffff\1\7",
			"",
			"\12\12\7\uffff\6\12\32\uffff\6\12",
			"\1\10\7\uffff\1\4\1\uffff\1\4\1\uffff\1\11\31\uffff\1\4\37\uffff\1\4",
			"\12\13\7\uffff\6\13\32\uffff\6\13",
			"\1\14\7\uffff\1\4\1\uffff\1\4\2\uffff\12\12\7\uffff\6\12\32\uffff\6"+
			"\12",
			"\1\15\7\uffff\1\4\1\uffff\1\4\2\uffff\12\13\7\uffff\6\13\2\uffff\1\4"+
			"\27\uffff\6\13\2\uffff\1\4",
			"\1\14\7\uffff\1\4\1\uffff\1\4",
			"\1\15\7\uffff\1\4\1\uffff\1\4\33\uffff\1\4\37\uffff\1\4"
	};

	static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
	static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
	static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
	static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
	static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
	static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
	static final short[][] DFA24_transition;

	static {
		int numStates = DFA24_transitionS.length;
		DFA24_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
		}
	}

	protected class DFA24 extends DFA {

		public DFA24(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 24;
			this.eot = DFA24_eot;
			this.eof = DFA24_eof;
			this.min = DFA24_min;
			this.max = DFA24_max;
			this.accept = DFA24_accept;
			this.special = DFA24_special;
			this.transition = DFA24_transition;
		}
		@Override
		public String getDescription() {
			return "531:10: fragment COMPLEX_16 : ( REAL_16 ( '@' REAL_16 )? | ( REAL_16 )? SIGN ( UREAL_16 )? ( 'i' | 'I' ) );";
		}
	}

	static final String DFA22_eotS =
		"\11\uffff";
	static final String DFA22_eofS =
		"\11\uffff";
	static final String DFA22_minS =
		"\1\53\1\60\1\uffff\1\43\1\uffff\1\43\1\60\2\43";
	static final String DFA22_maxS =
		"\1\146\1\151\1\uffff\1\151\1\uffff\1\151\1\146\2\151";
	static final String DFA22_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\4\uffff";
	static final String DFA22_specialS =
		"\11\uffff}>";
	static final String[] DFA22_transitionS = {
			"\1\1\1\uffff\1\1\2\uffff\12\2\7\uffff\6\2\32\uffff\6\2",
			"\12\3\7\uffff\6\3\2\uffff\1\4\27\uffff\6\3\2\uffff\1\4",
			"",
			"\1\5\7\uffff\1\2\1\uffff\1\2\1\uffff\1\6\12\3\7\uffff\6\3\2\uffff\1"+
			"\4\27\uffff\6\3\2\uffff\1\4",
			"",
			"\1\5\7\uffff\1\2\1\uffff\1\2\1\uffff\1\6\31\uffff\1\4\37\uffff\1\4",
			"\12\7\7\uffff\6\7\32\uffff\6\7",
			"\1\10\7\uffff\1\2\1\uffff\1\2\2\uffff\12\7\7\uffff\6\7\2\uffff\1\4\27"+
			"\uffff\6\7\2\uffff\1\4",
			"\1\10\7\uffff\1\2\1\uffff\1\2\33\uffff\1\4\37\uffff\1\4"
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "533:6: ( REAL_16 )?";
		}
	}

	static final String DFA32_eotS =
		"\1\uffff\1\4\1\uffff\1\4\1\uffff";
	static final String DFA32_eofS =
		"\5\uffff";
	static final String DFA32_minS =
		"\1\56\1\43\1\uffff\1\43\1\uffff";
	static final String DFA32_maxS =
		"\1\71\1\163\1\uffff\1\163\1\uffff";
	static final String DFA32_acceptS =
		"\2\uffff\1\2\1\uffff\1\1";
	static final String DFA32_specialS =
		"\5\uffff}>";
	static final String[] DFA32_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\12\uffff\1\2\1\uffff\12\1\12\uffff\3\2\5\uffff\1\2\6\uffff\1\2"+
			"\20\uffff\3\2\5\uffff\1\2\6\uffff\1\2",
			"",
			"\1\3\12\uffff\1\2\25\uffff\3\2\5\uffff\1\2\6\uffff\1\2\20\uffff\3\2"+
			"\5\uffff\1\2\6\uffff\1\2",
			""
	};

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	protected class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		@Override
		public String getDescription() {
			return "542:10: fragment UREAL_10 : ( UINTEGER_10 ( '/' UINTEGER_10 )? | DECIMAL_10 );";
		}
	}

	static final String DFA45_eotS =
		"\7\uffff";
	static final String DFA45_eofS =
		"\7\uffff";
	static final String DFA45_minS =
		"\1\56\1\43\1\uffff\1\43\3\uffff";
	static final String DFA45_maxS =
		"\1\71\1\163\1\uffff\1\163\3\uffff";
	static final String DFA45_acceptS =
		"\2\uffff\1\2\1\uffff\1\1\1\3\1\4";
	static final String DFA45_specialS =
		"\7\uffff}>";
	static final String[] DFA45_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\12\uffff\1\5\1\uffff\12\1\12\uffff\3\4\5\uffff\1\4\6\uffff\1\4"+
			"\20\uffff\3\4\5\uffff\1\4\6\uffff\1\4",
			"",
			"\1\3\12\uffff\1\6\25\uffff\3\4\5\uffff\1\4\6\uffff\1\4\20\uffff\3\4"+
			"\5\uffff\1\4\6\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
	static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
	static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
	static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
	static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
	static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
	static final short[][] DFA45_transition;

	static {
		int numStates = DFA45_transitionS.length;
		DFA45_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
		}
	}

	protected class DFA45 extends DFA {

		public DFA45(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 45;
			this.eot = DFA45_eot;
			this.eof = DFA45_eof;
			this.min = DFA45_min;
			this.max = DFA45_max;
			this.accept = DFA45_accept;
			this.special = DFA45_special;
			this.transition = DFA45_transition;
		}
		@Override
		public String getDescription() {
			return "545:10: fragment DECIMAL_10 : ( UINTEGER_10 SUFFIX | '.' ( DIGIT )+ ( '#' )* ( SUFFIX )? | ( DIGIT )+ '.' ( DIGIT )* ( '#' )* ( SUFFIX )? | ( DIGIT )+ ( '#' )+ '.' ( '#' )* ( SUFFIX )? );";
		}
	}

	static final String DFA64_eotS =
		"\2\uffff\1\43\1\uffff\1\45\1\47\2\uffff\15\26\23\uffff\5\26\1\77\1\26"+
		"\1\101\2\26\1\105\4\26\1\112\1\uffff\1\116\5\26\1\uffff\1\26\1\uffff\3"+
		"\26\1\uffff\3\26\1\133\1\uffff\2\26\1\136\1\uffff\2\26\1\141\2\26\1\144"+
		"\4\26\1\151\1\152\1\uffff\2\26\1\uffff\2\26\1\uffff\1\26\1\160\1\uffff"+
		"\1\26\1\162\1\26\1\164\2\uffff\1\26\1\167\1\170\1\26\1\173\1\uffff\1\26"+
		"\1\uffff\1\26\1\uffff\2\26\2\uffff\2\26\1\uffff\1\u0083\6\26\1\uffff\7"+
		"\26\1\u0091\4\26\1\u0096\1\uffff\4\26\1\uffff\1\26\1\u009c\2\26\1\u009f"+
		"\1\uffff\1\u00a0\1\26\2\uffff\2\26\1\u00a4\1\uffff";
	static final String DFA64_eofS =
		"\u00a5\uffff";
	static final String DFA64_minS =
		"\1\11\1\50\1\51\1\uffff\1\100\1\56\2\uffff\1\141\2\145\1\154\1\76\1\156"+
		"\1\165\1\146\1\145\1\141\1\156\1\162\1\56\7\uffff\1\43\13\uffff\1\164"+
		"\1\155\1\156\1\164\1\146\1\41\1\163\1\41\1\161\1\141\1\41\1\147\1\156"+
		"\1\163\1\144\1\41\1\102\1\41\1\142\1\164\1\41\1\151\1\141\1\uffff\1\145"+
		"\1\uffff\1\165\1\164\1\163\1\uffff\1\151\1\144\1\145\1\41\1\uffff\1\163"+
		"\1\145\1\41\1\uffff\1\144\1\141\1\41\1\156\1\171\1\41\1\157\1\145\1\151"+
		"\1\156\2\41\1\uffff\1\171\1\143\1\uffff\1\141\1\170\1\uffff\1\145\1\41"+
		"\1\uffff\1\164\1\41\1\161\1\41\2\uffff\1\156\2\41\1\55\1\41\1\uffff\1"+
		"\145\1\uffff\1\165\1\uffff\1\164\1\163\2\uffff\1\162\1\163\1\uffff\1\41"+
		"\1\157\1\141\1\171\1\165\1\171\1\163\1\uffff\1\164\1\170\1\156\1\154\1"+
		"\156\1\160\1\145\1\41\1\164\1\145\1\164\1\154\1\41\1\uffff\1\141\1\163"+
		"\1\141\1\151\1\uffff\1\170\1\41\1\170\1\143\1\41\1\uffff\1\41\1\151\2"+
		"\uffff\1\156\1\147\1\41\1\uffff";
	static final String DFA64_maxS =
		"\1\176\1\170\1\51\1\uffff\1\100\1\71\2\uffff\1\145\1\171\1\157\1\154\1"+
		"\76\1\156\1\165\1\146\1\145\1\157\1\156\1\162\1\151\7\uffff\1\43\13\uffff"+
		"\1\164\1\155\1\156\1\164\1\154\1\176\1\163\1\176\1\161\1\157\1\176\1\147"+
		"\1\156\1\163\1\144\1\176\1\170\1\176\1\142\1\164\1\41\1\151\1\141\1\uffff"+
		"\1\145\1\uffff\1\165\1\164\1\163\1\uffff\1\151\1\144\1\145\1\176\1\uffff"+
		"\1\163\1\145\1\176\1\uffff\1\144\1\141\1\176\1\156\1\171\1\176\1\157\1"+
		"\145\1\151\1\156\2\176\1\uffff\1\171\1\143\1\uffff\1\141\1\170\1\uffff"+
		"\1\145\1\176\1\uffff\1\164\1\176\1\161\1\176\2\uffff\1\156\2\176\1\55"+
		"\1\176\1\uffff\1\145\1\uffff\1\165\1\uffff\1\164\1\163\2\uffff\1\162\1"+
		"\163\1\uffff\1\176\1\157\1\141\1\171\1\165\1\171\1\163\1\uffff\1\164\1"+
		"\170\1\156\1\154\1\156\1\160\1\145\1\176\1\164\1\145\1\164\1\154\1\176"+
		"\1\uffff\1\141\1\163\1\141\1\151\1\uffff\1\170\1\176\1\170\1\143\1\176"+
		"\1\uffff\1\176\1\151\2\uffff\1\156\1\147\1\176\1\uffff";
	static final String DFA64_acceptS =
		"\3\uffff\1\4\2\uffff\1\10\1\11\15\uffff\1\44\1\47\1\50\1\54\1\55\1\1\1"+
		"\42\1\uffff\1\43\1\45\1\51\1\52\1\53\1\3\1\2\1\6\1\5\1\46\1\7\27\uffff"+
		"\1\37\1\uffff\1\17\3\uffff\1\25\4\uffff\1\32\3\uffff\1\34\14\uffff\1\31"+
		"\2\uffff\1\35\2\uffff\1\26\2\uffff\1\16\4\uffff\1\30\1\33\5\uffff\1\40"+
		"\1\uffff\1\23\1\uffff\1\27\2\uffff\1\36\1\24\2\uffff\1\20\7\uffff\1\22"+
		"\15\uffff\1\12\4\uffff\1\41\5\uffff\1\14\2\uffff\1\13\1\15\3\uffff\1\21";
	static final String DFA64_specialS =
		"\u00a5\uffff}>";
	static final String[] DFA64_transitionS = {
			"\2\30\2\uffff\1\30\22\uffff\1\30\1\26\1\27\1\1\3\26\1\6\1\2\1\3\1\26"+
			"\1\24\1\4\1\24\1\5\1\26\12\25\1\26\1\31\1\26\1\14\2\26\1\uffff\32\26"+
			"\3\uffff\2\26\1\7\1\22\1\20\1\21\1\12\1\13\3\26\1\17\2\26\1\10\2\26\1"+
			"\23\1\26\1\16\1\26\1\11\1\26\1\15\5\26\3\uffff\1\26",
			"\1\32\31\uffff\1\33\1\uffff\1\25\1\34\1\41\2\uffff\1\34\5\uffff\1\35"+
			"\4\uffff\1\40\3\uffff\1\36\3\uffff\1\37\5\uffff\1\33\1\uffff\1\25\1\34"+
			"\1\41\2\uffff\1\34\5\uffff\1\35\4\uffff\1\40\3\uffff\1\36",
			"\1\42",
			"",
			"\1\44",
			"\1\46\1\uffff\12\25",
			"",
			"",
			"\1\51\3\uffff\1\50",
			"\1\53\23\uffff\1\52",
			"\1\54\11\uffff\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\65\15\uffff\1\64",
			"\1\66",
			"\1\67",
			"\1\25\1\uffff\12\25\17\uffff\1\25\37\uffff\1\25",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\70",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75\5\uffff\1\76",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"\1\100",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"\1\102",
			"\1\104\15\uffff\1\103",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"\1\33\1\uffff\1\25\12\uffff\1\35\10\uffff\1\36\11\uffff\1\33\1\uffff"+
			"\1\25\12\uffff\1\35\10\uffff\1\36",
			"\1\26\2\uffff\3\26\3\uffff\1\115\1\26\1\uffff\1\113\15\26\1\uffff\37"+
			"\26\3\uffff\2\26\1\uffff\21\26\1\114\10\26\3\uffff\1\26",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"",
			"\1\124",
			"",
			"\1\125",
			"\1\126",
			"\1\127",
			"",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"",
			"\1\134",
			"\1\135",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"",
			"\1\137",
			"\1\140",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"\1\142",
			"\1\143",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"",
			"\1\153",
			"\1\154",
			"",
			"\1\155",
			"\1\156",
			"",
			"\1\157",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"",
			"\1\161",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"\1\163",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"",
			"",
			"\1\165",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\1\166\15\26\1\uffff\37\26\3"+
			"\uffff\2\26\1\uffff\32\26\3\uffff\1\26",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"\1\171",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\1\172\15\26\1\uffff\37\26\3"+
			"\uffff\2\26\1\uffff\32\26\3\uffff\1\26",
			"",
			"\1\174",
			"",
			"\1\175",
			"",
			"\1\176",
			"\1\177",
			"",
			"",
			"\1\u0080",
			"\1\u0081",
			"",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\1\u0082\15\26\1\uffff\37\26"+
			"\3\uffff\2\26\1\uffff\32\26\3\uffff\1\26",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"",
			"\1\u009b",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"\1\u009d",
			"\1\u009e",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			"\1\u00a1",
			"",
			"",
			"\1\u00a2",
			"\1\u00a3",
			"\1\26\2\uffff\3\26\3\uffff\2\26\1\uffff\16\26\1\uffff\37\26\3\uffff"+
			"\2\26\1\uffff\32\26\3\uffff\1\26",
			""
	};

	static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
	static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
	static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
	static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
	static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
	static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
	static final short[][] DFA64_transition;

	static {
		int numStates = DFA64_transitionS.length;
		DFA64_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
		}
	}

	protected class DFA64 extends DFA {

		public DFA64(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 64;
			this.eot = DFA64_eot;
			this.eof = DFA64_eof;
			this.min = DFA64_min;
			this.max = DFA64_max;
			this.accept = DFA64_accept;
			this.special = DFA64_special;
			this.transition = DFA64_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | LET_SYNTAX | LETREC_SYNTAX | SYNTAX_RULES | DEFINE_SYNTAX | ELSE | ARROW | DEFINE | UNQUOTE_SPLICING | UNQUOTE | QUOTE | LAMBDA | IF | SET | BEGIN | COND | AND | OR | CASE | LET | LETSTAR | LETREC | DO | DELAY | QUASIQUOTE | NUM_2 | NUM_8 | NUM_10 | NUM_16 | ELLIPSIS | VARIABLE | STRING | CHARACTER | TRUE | FALSE | SPACE | COMMENT );";
		}
	}

}
