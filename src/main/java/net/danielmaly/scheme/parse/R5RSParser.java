// $ANTLR 3.5.2 R5RS.g3 2017-01-09 18:26:44

package net.danielmaly.scheme.parse;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class R5RSParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABBREVIATION", "AND", "ARROW", 
		"BEGIN", "BINDINGSPEC", "BODY", "BOOL", "CASE", "CASECLAUSE", "CHAR", 
		"CHARACTER", "CHARACTER_NAME", "COMMAND", "COMMENT", "COMPLEX_10", "COMPLEX_16", 
		"COMPLEX_2", "COMPLEX_8", "COND", "CONDCLAUSE", "DECIMAL_10", "DEFINE", 
		"DEFINE_SYNTAX", "DELAY", "DIGIT", "DIGIT_16", "DIGIT_2", "DIGIT_8", "DO", 
		"DOCOMMANDS", "DORESULT", "ELLIPSIS", "ELSE", "EMPTYFORMALS", "EXACTNESS", 
		"EXPONENT_MARKER", "FALSE", "FORMALDEF", "FORMALS", "IDENTIFIER", "IF", 
		"INITIAL", "ITERATIONSPEC", "LAMBDA", "LET", "LETREC", "LETREC_SYNTAX", 
		"LETSTAR", "LETTER", "LET_SYNTAX", "LIST", "LITERAL", "LOCALBINDING", 
		"NUM10", "NUM16", "NUM2", "NUM8", "NUM_10", "NUM_16", "NUM_2", "NUM_8", 
		"OR", "PECULIAR_IDENTIFIER", "PREFIX_10", "PREFIX_16", "PREFIX_2", "PREFIX_8", 
		"PROCEDURECALL", "QUASIQUOTATION", "QUASIQUOTE", "QUOTATION", "QUOTE", 
		"RADIX_10", "RADIX_16", "RADIX_2", "RADIX_8", "REAL_10", "REAL_16", "REAL_2", 
		"REAL_8", "SELFEVALUATING", "SEQUENCE", "SET", "SIGN", "SPACE", "SPECIAL_INITIAL", 
		"SPECIAL_SUBSEQUENT", "STR", "STRING", "STRING_ELEMENT", "SUBSEQUENT", 
		"SUFFIX", "SYNTAXRULE", "SYNTAX_RULES", "TEST", "TRUE", "UINTEGER_10", 
		"UINTEGER_16", "UINTEGER_2", "UINTEGER_8", "UNQUOTE", "UNQUOTE_SPLICING", 
		"UREAL_10", "UREAL_16", "UREAL_2", "UREAL_8", "VARIABLE", "VECTOR", "'#('", 
		"'('", "'()'", "')'", "','", "',@'", "'.'", "'\\''", "'`'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public R5RSParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public R5RSParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return R5RSParser.tokenNames; }
	@Override public String getGrammarFileName() { return "R5RS.g3"; }


	static class CommandDefinitionSequenceNode extends CommonTree {public CommandDefinitionSequenceNode(Token t) {super(t);}}
	static class VariableNode extends CommonTree {public VariableNode(Token t) {super(t);}}


	public static class parse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parse"
	// R5RS.g3:78:1: parse : ( commandOrDefinition )* EOF ;
	public final R5RSParser.parse_return parse() throws RecognitionException {
		R5RSParser.parse_return retval = new R5RSParser.parse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope commandOrDefinition1 =null;

		Object EOF2_tree=null;

		try {
			// R5RS.g3:79:3: ( ( commandOrDefinition )* EOF )
			// R5RS.g3:79:6: ( commandOrDefinition )* EOF
			{
			root_0 = (Object)adaptor.nil();


			// R5RS.g3:79:6: ( commandOrDefinition )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CHARACTER||LA1_0==ELLIPSIS||LA1_0==FALSE||(LA1_0 >= NUM_10 && LA1_0 <= NUM_8)||LA1_0==STRING||LA1_0==TRUE||LA1_0==VARIABLE||LA1_0==113||(LA1_0 >= 119 && LA1_0 <= 120)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// R5RS.g3:79:6: commandOrDefinition
					{
					pushFollow(FOLLOW_commandOrDefinition_in_parse276);
					commandOrDefinition1=commandOrDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commandOrDefinition1.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse279); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			EOF2_tree = (Object)adaptor.create(EOF2);
			adaptor.addChild(root_0, EOF2_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parse"


	public static class commandOrDefinition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commandOrDefinition"
	// R5RS.g3:82:1: commandOrDefinition : ( ( syntaxDefinition )=> syntaxDefinition | ( definition )=> definition | ( '(' BEGIN commandOrDefinition )=> '(' ! BEGIN ^ ( commandOrDefinition )+ ')' !| command );
	public final R5RSParser.commandOrDefinition_return commandOrDefinition() throws RecognitionException {
		R5RSParser.commandOrDefinition_return retval = new R5RSParser.commandOrDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal5=null;
		Token BEGIN6=null;
		Token char_literal8=null;
		ParserRuleReturnScope syntaxDefinition3 =null;
		ParserRuleReturnScope definition4 =null;
		ParserRuleReturnScope commandOrDefinition7 =null;
		ParserRuleReturnScope command9 =null;

		Object char_literal5_tree=null;
		Object BEGIN6_tree=null;
		Object char_literal8_tree=null;

		try {
			// R5RS.g3:83:3: ( ( syntaxDefinition )=> syntaxDefinition | ( definition )=> definition | ( '(' BEGIN commandOrDefinition )=> '(' ! BEGIN ^ ( commandOrDefinition )+ ')' !| command )
			int alt3=4;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==113) ) {
				int LA3_1 = input.LA(2);
				if ( (synpred1_R5RS()) ) {
					alt3=1;
				}
				else if ( (synpred2_R5RS()) ) {
					alt3=2;
				}
				else if ( (synpred3_R5RS()) ) {
					alt3=3;
				}
				else if ( (true) ) {
					alt3=4;
				}

			}
			else if ( (LA3_0==CHARACTER||LA3_0==ELLIPSIS||LA3_0==FALSE||(LA3_0 >= NUM_10 && LA3_0 <= NUM_8)||LA3_0==STRING||LA3_0==TRUE||LA3_0==VARIABLE||(LA3_0 >= 119 && LA3_0 <= 120)) ) {
				alt3=4;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// R5RS.g3:83:6: ( syntaxDefinition )=> syntaxDefinition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_syntaxDefinition_in_commandOrDefinition311);
					syntaxDefinition3=syntaxDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntaxDefinition3.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:84:6: ( definition )=> definition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_definition_in_commandOrDefinition342);
					definition4=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition4.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:85:6: ( '(' BEGIN commandOrDefinition )=> '(' ! BEGIN ^ ( commandOrDefinition )+ ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal5=(Token)match(input,113,FOLLOW_113_in_commandOrDefinition358); if (state.failed) return retval;
					BEGIN6=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_commandOrDefinition361); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BEGIN6_tree = new CommandDefinitionSequenceNode(BEGIN6) ;
					root_0 = (Object)adaptor.becomeRoot(BEGIN6_tree, root_0);
					}

					// R5RS.g3:85:83: ( commandOrDefinition )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==CHARACTER||LA2_0==ELLIPSIS||LA2_0==FALSE||(LA2_0 >= NUM_10 && LA2_0 <= NUM_8)||LA2_0==STRING||LA2_0==TRUE||LA2_0==VARIABLE||LA2_0==113||(LA2_0 >= 119 && LA2_0 <= 120)) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// R5RS.g3:85:83: commandOrDefinition
							{
							pushFollow(FOLLOW_commandOrDefinition_in_commandOrDefinition367);
							commandOrDefinition7=commandOrDefinition();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, commandOrDefinition7.getTree());

							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					char_literal8=(Token)match(input,115,FOLLOW_115_in_commandOrDefinition370); if (state.failed) return retval;
					}
					break;
				case 4 :
					// R5RS.g3:86:40: command
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_in_commandOrDefinition412);
					command9=command();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command9.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commandOrDefinition"


	public static class syntaxDefinition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "syntaxDefinition"
	// R5RS.g3:89:1: syntaxDefinition : '(' ! DEFINE_SYNTAX ^ keyword transformerSpec ')' !;
	public final R5RSParser.syntaxDefinition_return syntaxDefinition() throws RecognitionException {
		R5RSParser.syntaxDefinition_return retval = new R5RSParser.syntaxDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal10=null;
		Token DEFINE_SYNTAX11=null;
		Token char_literal14=null;
		ParserRuleReturnScope keyword12 =null;
		ParserRuleReturnScope transformerSpec13 =null;

		Object char_literal10_tree=null;
		Object DEFINE_SYNTAX11_tree=null;
		Object char_literal14_tree=null;

		try {
			// R5RS.g3:90:3: ( '(' ! DEFINE_SYNTAX ^ keyword transformerSpec ')' !)
			// R5RS.g3:90:6: '(' ! DEFINE_SYNTAX ^ keyword transformerSpec ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal10=(Token)match(input,113,FOLLOW_113_in_syntaxDefinition426); if (state.failed) return retval;
			DEFINE_SYNTAX11=(Token)match(input,DEFINE_SYNTAX,FOLLOW_DEFINE_SYNTAX_in_syntaxDefinition429); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEFINE_SYNTAX11_tree = (Object)adaptor.create(DEFINE_SYNTAX11);
			root_0 = (Object)adaptor.becomeRoot(DEFINE_SYNTAX11_tree, root_0);
			}

			pushFollow(FOLLOW_keyword_in_syntaxDefinition432);
			keyword12=keyword();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword12.getTree());

			pushFollow(FOLLOW_transformerSpec_in_syntaxDefinition434);
			transformerSpec13=transformerSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, transformerSpec13.getTree());

			char_literal14=(Token)match(input,115,FOLLOW_115_in_syntaxDefinition436); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "syntaxDefinition"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// R5RS.g3:93:1: definition : ( ( simpleDefinition )=> simpleDefinition | ( formalDefinition )=> formalDefinition | '(' ! BEGIN ^ ( definition )* ')' !);
	public final R5RSParser.definition_return definition() throws RecognitionException {
		R5RSParser.definition_return retval = new R5RSParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal17=null;
		Token BEGIN18=null;
		Token char_literal20=null;
		ParserRuleReturnScope simpleDefinition15 =null;
		ParserRuleReturnScope formalDefinition16 =null;
		ParserRuleReturnScope definition19 =null;

		Object char_literal17_tree=null;
		Object BEGIN18_tree=null;
		Object char_literal20_tree=null;

		try {
			// R5RS.g3:94:3: ( ( simpleDefinition )=> simpleDefinition | ( formalDefinition )=> formalDefinition | '(' ! BEGIN ^ ( definition )* ')' !)
			int alt5=3;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==113) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==DEFINE) ) {
					int LA5_2 = input.LA(3);
					if ( (LA5_2==VARIABLE) && (synpred4_R5RS())) {
						alt5=1;
					}
					else if ( (LA5_2==ELLIPSIS) && (synpred4_R5RS())) {
						alt5=1;
					}
					else if ( (LA5_2==113) && (synpred5_R5RS())) {
						alt5=2;
					}

				}
				else if ( (LA5_1==BEGIN) ) {
					alt5=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// R5RS.g3:94:5: ( simpleDefinition )=> simpleDefinition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleDefinition_in_definition456);
					simpleDefinition15=simpleDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDefinition15.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:95:5: ( formalDefinition )=> formalDefinition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_formalDefinition_in_definition468);
					formalDefinition16=formalDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formalDefinition16.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:96:5: '(' ! BEGIN ^ ( definition )* ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal17=(Token)match(input,113,FOLLOW_113_in_definition474); if (state.failed) return retval;
					BEGIN18=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_definition477); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BEGIN18_tree = (Object)adaptor.create(BEGIN18);
					root_0 = (Object)adaptor.becomeRoot(BEGIN18_tree, root_0);
					}

					// R5RS.g3:96:17: ( definition )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==113) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// R5RS.g3:96:17: definition
							{
							pushFollow(FOLLOW_definition_in_definition480);
							definition19=definition();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, definition19.getTree());

							}
							break;

						default :
							break loop4;
						}
					}

					char_literal20=(Token)match(input,115,FOLLOW_115_in_definition483); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class simpleDefinition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simpleDefinition"
	// R5RS.g3:99:1: simpleDefinition : '(' ! DEFINE ^ variable expression ')' !;
	public final R5RSParser.simpleDefinition_return simpleDefinition() throws RecognitionException {
		R5RSParser.simpleDefinition_return retval = new R5RSParser.simpleDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal21=null;
		Token DEFINE22=null;
		Token char_literal25=null;
		ParserRuleReturnScope variable23 =null;
		ParserRuleReturnScope expression24 =null;

		Object char_literal21_tree=null;
		Object DEFINE22_tree=null;
		Object char_literal25_tree=null;

		try {
			// R5RS.g3:100:3: ( '(' ! DEFINE ^ variable expression ')' !)
			// R5RS.g3:100:6: '(' ! DEFINE ^ variable expression ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal21=(Token)match(input,113,FOLLOW_113_in_simpleDefinition498); if (state.failed) return retval;
			DEFINE22=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_simpleDefinition501); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEFINE22_tree = (Object)adaptor.create(DEFINE22);
			root_0 = (Object)adaptor.becomeRoot(DEFINE22_tree, root_0);
			}

			pushFollow(FOLLOW_variable_in_simpleDefinition504);
			variable23=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable23.getTree());

			pushFollow(FOLLOW_expression_in_simpleDefinition506);
			expression24=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression24.getTree());

			char_literal25=(Token)match(input,115,FOLLOW_115_in_simpleDefinition508); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleDefinition"


	public static class formalDefinition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalDefinition"
	// R5RS.g3:103:1: formalDefinition : '(' ! DEFINE ^ formals body ')' !;
	public final R5RSParser.formalDefinition_return formalDefinition() throws RecognitionException {
		R5RSParser.formalDefinition_return retval = new R5RSParser.formalDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal26=null;
		Token DEFINE27=null;
		Token char_literal30=null;
		ParserRuleReturnScope formals28 =null;
		ParserRuleReturnScope body29 =null;

		Object char_literal26_tree=null;
		Object DEFINE27_tree=null;
		Object char_literal30_tree=null;

		try {
			// R5RS.g3:104:3: ( '(' ! DEFINE ^ formals body ')' !)
			// R5RS.g3:104:5: '(' ! DEFINE ^ formals body ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal26=(Token)match(input,113,FOLLOW_113_in_formalDefinition522); if (state.failed) return retval;
			DEFINE27=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_formalDefinition525); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEFINE27_tree = (Object)adaptor.create(DEFINE27);
			root_0 = (Object)adaptor.becomeRoot(DEFINE27_tree, root_0);
			}

			pushFollow(FOLLOW_formals_in_formalDefinition528);
			formals28=formals();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formals28.getTree());

			pushFollow(FOLLOW_body_in_formalDefinition530);
			body29=body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, body29.getTree());

			char_literal30=(Token)match(input,115,FOLLOW_115_in_formalDefinition532); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalDefinition"


	public static class formals_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formals"
	// R5RS.g3:107:1: formals : '(' ! variable ( variable )* ( '.' variable )? ')' !;
	public final R5RSParser.formals_return formals() throws RecognitionException {
		R5RSParser.formals_return retval = new R5RSParser.formals_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal31=null;
		Token char_literal34=null;
		Token char_literal36=null;
		ParserRuleReturnScope variable32 =null;
		ParserRuleReturnScope variable33 =null;
		ParserRuleReturnScope variable35 =null;

		Object char_literal31_tree=null;
		Object char_literal34_tree=null;
		Object char_literal36_tree=null;

		try {
			// R5RS.g3:108:3: ( '(' ! variable ( variable )* ( '.' variable )? ')' !)
			// R5RS.g3:108:5: '(' ! variable ( variable )* ( '.' variable )? ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal31=(Token)match(input,113,FOLLOW_113_in_formals546); if (state.failed) return retval;
			pushFollow(FOLLOW_variable_in_formals549);
			variable32=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable32.getTree());

			// R5RS.g3:108:19: ( variable )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ELLIPSIS||LA6_0==VARIABLE) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// R5RS.g3:108:19: variable
					{
					pushFollow(FOLLOW_variable_in_formals551);
					variable33=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable33.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			// R5RS.g3:108:29: ( '.' variable )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==118) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// R5RS.g3:108:30: '.' variable
					{
					char_literal34=(Token)match(input,118,FOLLOW_118_in_formals555); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal34_tree = (Object)adaptor.create(char_literal34);
					adaptor.addChild(root_0, char_literal34_tree);
					}

					pushFollow(FOLLOW_variable_in_formals557);
					variable35=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable35.getTree());

					}
					break;

			}

			char_literal36=(Token)match(input,115,FOLLOW_115_in_formals561); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formals"


	public static class keyword_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "keyword"
	// R5RS.g3:111:1: keyword : identifier ;
	public final R5RSParser.keyword_return keyword() throws RecognitionException {
		R5RSParser.keyword_return retval = new R5RSParser.keyword_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope identifier37 =null;


		try {
			// R5RS.g3:112:3: ( identifier )
			// R5RS.g3:112:6: identifier
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_keyword576);
			identifier37=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier37.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "keyword"


	public static class transformerSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "transformerSpec"
	// R5RS.g3:116:1: transformerSpec : '(' ! SYNTAX_RULES ^ '(' ! ( identifier )* ')' ! ( syntaxRule )* ')' !;
	public final R5RSParser.transformerSpec_return transformerSpec() throws RecognitionException {
		R5RSParser.transformerSpec_return retval = new R5RSParser.transformerSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal38=null;
		Token SYNTAX_RULES39=null;
		Token char_literal40=null;
		Token char_literal42=null;
		Token char_literal44=null;
		ParserRuleReturnScope identifier41 =null;
		ParserRuleReturnScope syntaxRule43 =null;

		Object char_literal38_tree=null;
		Object SYNTAX_RULES39_tree=null;
		Object char_literal40_tree=null;
		Object char_literal42_tree=null;
		Object char_literal44_tree=null;

		try {
			// R5RS.g3:117:3: ( '(' ! SYNTAX_RULES ^ '(' ! ( identifier )* ')' ! ( syntaxRule )* ')' !)
			// R5RS.g3:117:6: '(' ! SYNTAX_RULES ^ '(' ! ( identifier )* ')' ! ( syntaxRule )* ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal38=(Token)match(input,113,FOLLOW_113_in_transformerSpec592); if (state.failed) return retval;
			SYNTAX_RULES39=(Token)match(input,SYNTAX_RULES,FOLLOW_SYNTAX_RULES_in_transformerSpec595); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SYNTAX_RULES39_tree = (Object)adaptor.create(SYNTAX_RULES39);
			root_0 = (Object)adaptor.becomeRoot(SYNTAX_RULES39_tree, root_0);
			}

			char_literal40=(Token)match(input,113,FOLLOW_113_in_transformerSpec598); if (state.failed) return retval;
			// R5RS.g3:117:30: ( identifier )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= AND && LA8_0 <= BEGIN)||LA8_0==CASE||LA8_0==COND||LA8_0==DEFINE||LA8_0==DELAY||LA8_0==DO||(LA8_0 >= ELLIPSIS && LA8_0 <= ELSE)||LA8_0==IF||(LA8_0 >= LAMBDA && LA8_0 <= LETREC)||LA8_0==LETSTAR||LA8_0==OR||LA8_0==QUASIQUOTE||LA8_0==QUOTE||LA8_0==SET||(LA8_0 >= UNQUOTE && LA8_0 <= UNQUOTE_SPLICING)||LA8_0==VARIABLE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// R5RS.g3:117:30: identifier
					{
					pushFollow(FOLLOW_identifier_in_transformerSpec601);
					identifier41=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier41.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			char_literal42=(Token)match(input,115,FOLLOW_115_in_transformerSpec604); if (state.failed) return retval;
			// R5RS.g3:117:47: ( syntaxRule )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==113) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// R5RS.g3:117:47: syntaxRule
					{
					pushFollow(FOLLOW_syntaxRule_in_transformerSpec607);
					syntaxRule43=syntaxRule();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntaxRule43.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			char_literal44=(Token)match(input,115,FOLLOW_115_in_transformerSpec610); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "transformerSpec"


	public static class syntaxRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "syntaxRule"
	// R5RS.g3:120:1: syntaxRule : '(' pattern template ')' -> ^( SYNTAXRULE pattern template ) ;
	public final R5RSParser.syntaxRule_return syntaxRule() throws RecognitionException {
		R5RSParser.syntaxRule_return retval = new R5RSParser.syntaxRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal45=null;
		Token char_literal48=null;
		ParserRuleReturnScope pattern46 =null;
		ParserRuleReturnScope template47 =null;

		Object char_literal45_tree=null;
		Object char_literal48_tree=null;
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleSubtreeStream stream_template=new RewriteRuleSubtreeStream(adaptor,"rule template");
		RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");

		try {
			// R5RS.g3:121:3: ( '(' pattern template ')' -> ^( SYNTAXRULE pattern template ) )
			// R5RS.g3:121:6: '(' pattern template ')'
			{
			char_literal45=(Token)match(input,113,FOLLOW_113_in_syntaxRule625); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_113.add(char_literal45);

			pushFollow(FOLLOW_pattern_in_syntaxRule627);
			pattern46=pattern();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_pattern.add(pattern46.getTree());
			pushFollow(FOLLOW_template_in_syntaxRule629);
			template47=template();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_template.add(template47.getTree());
			char_literal48=(Token)match(input,115,FOLLOW_115_in_syntaxRule631); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_115.add(char_literal48);

			// AST REWRITE
			// elements: pattern, template
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 121:31: -> ^( SYNTAXRULE pattern template )
			{
				// R5RS.g3:121:34: ^( SYNTAXRULE pattern template )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SYNTAXRULE, "SYNTAXRULE"), root_1);
				adaptor.addChild(root_1, stream_pattern.nextTree());
				adaptor.addChild(root_1, stream_template.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "syntaxRule"


	public static class pattern_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pattern"
	// R5RS.g3:124:1: pattern : ( patternIdentifier | '(' ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )? ')' | '#(' ( ( pattern )+ ( ELLIPSIS )? )? ')' | patternDatum );
	public final R5RSParser.pattern_return pattern() throws RecognitionException {
		R5RSParser.pattern_return retval = new R5RSParser.pattern_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal50=null;
		Token char_literal52=null;
		Token ELLIPSIS54=null;
		Token char_literal55=null;
		Token string_literal56=null;
		Token ELLIPSIS58=null;
		Token char_literal59=null;
		ParserRuleReturnScope patternIdentifier49 =null;
		ParserRuleReturnScope pattern51 =null;
		ParserRuleReturnScope pattern53 =null;
		ParserRuleReturnScope pattern57 =null;
		ParserRuleReturnScope patternDatum60 =null;

		Object char_literal50_tree=null;
		Object char_literal52_tree=null;
		Object ELLIPSIS54_tree=null;
		Object char_literal55_tree=null;
		Object string_literal56_tree=null;
		Object ELLIPSIS58_tree=null;
		Object char_literal59_tree=null;

		try {
			// R5RS.g3:125:3: ( patternIdentifier | '(' ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )? ')' | '#(' ( ( pattern )+ ( ELLIPSIS )? )? ')' | patternDatum )
			int alt16=4;
			switch ( input.LA(1) ) {
			case AND:
			case ARROW:
			case BEGIN:
			case CASE:
			case COND:
			case DEFINE:
			case DELAY:
			case DO:
			case ELSE:
			case IF:
			case LAMBDA:
			case LET:
			case LETREC:
			case LETSTAR:
			case OR:
			case QUASIQUOTE:
			case QUOTE:
			case SET:
			case UNQUOTE:
			case UNQUOTE_SPLICING:
			case VARIABLE:
				{
				alt16=1;
				}
				break;
			case 113:
				{
				alt16=2;
				}
				break;
			case 112:
				{
				alt16=3;
				}
				break;
			case CHARACTER:
			case FALSE:
			case NUM_10:
			case NUM_16:
			case NUM_2:
			case NUM_8:
			case STRING:
			case TRUE:
				{
				alt16=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// R5RS.g3:125:6: patternIdentifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_patternIdentifier_in_pattern655);
					patternIdentifier49=patternIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, patternIdentifier49.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:126:6: '(' ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal50=(Token)match(input,113,FOLLOW_113_in_pattern662); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal50_tree = (Object)adaptor.create(char_literal50);
					adaptor.addChild(root_0, char_literal50_tree);
					}

					// R5RS.g3:126:10: ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( ((LA12_0 >= AND && LA12_0 <= BEGIN)||LA12_0==CASE||LA12_0==CHARACTER||LA12_0==COND||LA12_0==DEFINE||LA12_0==DELAY||LA12_0==DO||LA12_0==ELSE||LA12_0==FALSE||LA12_0==IF||(LA12_0 >= LAMBDA && LA12_0 <= LETREC)||LA12_0==LETSTAR||(LA12_0 >= NUM_10 && LA12_0 <= OR)||LA12_0==QUASIQUOTE||LA12_0==QUOTE||LA12_0==SET||LA12_0==STRING||LA12_0==TRUE||(LA12_0 >= UNQUOTE && LA12_0 <= UNQUOTE_SPLICING)||LA12_0==VARIABLE||(LA12_0 >= 112 && LA12_0 <= 113)) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// R5RS.g3:126:11: ( pattern )+ ( '.' pattern | ELLIPSIS )?
							{
							// R5RS.g3:126:11: ( pattern )+
							int cnt10=0;
							loop10:
							while (true) {
								int alt10=2;
								int LA10_0 = input.LA(1);
								if ( ((LA10_0 >= AND && LA10_0 <= BEGIN)||LA10_0==CASE||LA10_0==CHARACTER||LA10_0==COND||LA10_0==DEFINE||LA10_0==DELAY||LA10_0==DO||LA10_0==ELSE||LA10_0==FALSE||LA10_0==IF||(LA10_0 >= LAMBDA && LA10_0 <= LETREC)||LA10_0==LETSTAR||(LA10_0 >= NUM_10 && LA10_0 <= OR)||LA10_0==QUASIQUOTE||LA10_0==QUOTE||LA10_0==SET||LA10_0==STRING||LA10_0==TRUE||(LA10_0 >= UNQUOTE && LA10_0 <= UNQUOTE_SPLICING)||LA10_0==VARIABLE||(LA10_0 >= 112 && LA10_0 <= 113)) ) {
									alt10=1;
								}

								switch (alt10) {
								case 1 :
									// R5RS.g3:126:11: pattern
									{
									pushFollow(FOLLOW_pattern_in_pattern665);
									pattern51=pattern();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern51.getTree());

									}
									break;

								default :
									if ( cnt10 >= 1 ) break loop10;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(10, input);
									throw eee;
								}
								cnt10++;
							}

							// R5RS.g3:126:20: ( '.' pattern | ELLIPSIS )?
							int alt11=3;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==118) ) {
								alt11=1;
							}
							else if ( (LA11_0==ELLIPSIS) ) {
								alt11=2;
							}
							switch (alt11) {
								case 1 :
									// R5RS.g3:126:21: '.' pattern
									{
									char_literal52=(Token)match(input,118,FOLLOW_118_in_pattern669); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal52_tree = (Object)adaptor.create(char_literal52);
									adaptor.addChild(root_0, char_literal52_tree);
									}

									pushFollow(FOLLOW_pattern_in_pattern671);
									pattern53=pattern();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern53.getTree());

									}
									break;
								case 2 :
									// R5RS.g3:126:35: ELLIPSIS
									{
									ELLIPSIS54=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_pattern675); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ELLIPSIS54_tree = (Object)adaptor.create(ELLIPSIS54);
									adaptor.addChild(root_0, ELLIPSIS54_tree);
									}

									}
									break;

							}

							}
							break;

					}

					char_literal55=(Token)match(input,115,FOLLOW_115_in_pattern682); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal55_tree = (Object)adaptor.create(char_literal55);
					adaptor.addChild(root_0, char_literal55_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:127:6: '#(' ( ( pattern )+ ( ELLIPSIS )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal56=(Token)match(input,112,FOLLOW_112_in_pattern689); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal56_tree = (Object)adaptor.create(string_literal56);
					adaptor.addChild(root_0, string_literal56_tree);
					}

					// R5RS.g3:127:11: ( ( pattern )+ ( ELLIPSIS )? )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( ((LA15_0 >= AND && LA15_0 <= BEGIN)||LA15_0==CASE||LA15_0==CHARACTER||LA15_0==COND||LA15_0==DEFINE||LA15_0==DELAY||LA15_0==DO||LA15_0==ELSE||LA15_0==FALSE||LA15_0==IF||(LA15_0 >= LAMBDA && LA15_0 <= LETREC)||LA15_0==LETSTAR||(LA15_0 >= NUM_10 && LA15_0 <= OR)||LA15_0==QUASIQUOTE||LA15_0==QUOTE||LA15_0==SET||LA15_0==STRING||LA15_0==TRUE||(LA15_0 >= UNQUOTE && LA15_0 <= UNQUOTE_SPLICING)||LA15_0==VARIABLE||(LA15_0 >= 112 && LA15_0 <= 113)) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// R5RS.g3:127:12: ( pattern )+ ( ELLIPSIS )?
							{
							// R5RS.g3:127:12: ( pattern )+
							int cnt13=0;
							loop13:
							while (true) {
								int alt13=2;
								int LA13_0 = input.LA(1);
								if ( ((LA13_0 >= AND && LA13_0 <= BEGIN)||LA13_0==CASE||LA13_0==CHARACTER||LA13_0==COND||LA13_0==DEFINE||LA13_0==DELAY||LA13_0==DO||LA13_0==ELSE||LA13_0==FALSE||LA13_0==IF||(LA13_0 >= LAMBDA && LA13_0 <= LETREC)||LA13_0==LETSTAR||(LA13_0 >= NUM_10 && LA13_0 <= OR)||LA13_0==QUASIQUOTE||LA13_0==QUOTE||LA13_0==SET||LA13_0==STRING||LA13_0==TRUE||(LA13_0 >= UNQUOTE && LA13_0 <= UNQUOTE_SPLICING)||LA13_0==VARIABLE||(LA13_0 >= 112 && LA13_0 <= 113)) ) {
									alt13=1;
								}

								switch (alt13) {
								case 1 :
									// R5RS.g3:127:12: pattern
									{
									pushFollow(FOLLOW_pattern_in_pattern692);
									pattern57=pattern();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern57.getTree());

									}
									break;

								default :
									if ( cnt13 >= 1 ) break loop13;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(13, input);
									throw eee;
								}
								cnt13++;
							}

							// R5RS.g3:127:21: ( ELLIPSIS )?
							int alt14=2;
							int LA14_0 = input.LA(1);
							if ( (LA14_0==ELLIPSIS) ) {
								alt14=1;
							}
							switch (alt14) {
								case 1 :
									// R5RS.g3:127:21: ELLIPSIS
									{
									ELLIPSIS58=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_pattern695); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ELLIPSIS58_tree = (Object)adaptor.create(ELLIPSIS58);
									adaptor.addChild(root_0, ELLIPSIS58_tree);
									}

									}
									break;

							}

							}
							break;

					}

					char_literal59=(Token)match(input,115,FOLLOW_115_in_pattern701); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal59_tree = (Object)adaptor.create(char_literal59);
					adaptor.addChild(root_0, char_literal59_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:128:6: patternDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_patternDatum_in_pattern708);
					patternDatum60=patternDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, patternDatum60.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pattern"


	public static class patternIdentifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "patternIdentifier"
	// R5RS.g3:131:1: patternIdentifier : ( syntacticKeyword | VARIABLE );
	public final R5RSParser.patternIdentifier_return patternIdentifier() throws RecognitionException {
		R5RSParser.patternIdentifier_return retval = new R5RSParser.patternIdentifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE62=null;
		ParserRuleReturnScope syntacticKeyword61 =null;

		Object VARIABLE62_tree=null;

		try {
			// R5RS.g3:132:3: ( syntacticKeyword | VARIABLE )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= AND && LA17_0 <= BEGIN)||LA17_0==CASE||LA17_0==COND||LA17_0==DEFINE||LA17_0==DELAY||LA17_0==DO||LA17_0==ELSE||LA17_0==IF||(LA17_0 >= LAMBDA && LA17_0 <= LETREC)||LA17_0==LETSTAR||LA17_0==OR||LA17_0==QUASIQUOTE||LA17_0==QUOTE||LA17_0==SET||(LA17_0 >= UNQUOTE && LA17_0 <= UNQUOTE_SPLICING)) ) {
				alt17=1;
			}
			else if ( (LA17_0==VARIABLE) ) {
				alt17=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// R5RS.g3:132:6: syntacticKeyword
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_syntacticKeyword_in_patternIdentifier722);
					syntacticKeyword61=syntacticKeyword();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntacticKeyword61.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:133:6: VARIABLE
					{
					root_0 = (Object)adaptor.nil();


					VARIABLE62=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_patternIdentifier729); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE62_tree = (Object)adaptor.create(VARIABLE62);
					adaptor.addChild(root_0, VARIABLE62_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "patternIdentifier"


	public static class patternDatum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "patternDatum"
	// R5RS.g3:136:1: patternDatum : selfEvaluating ;
	public final R5RSParser.patternDatum_return patternDatum() throws RecognitionException {
		R5RSParser.patternDatum_return retval = new R5RSParser.patternDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope selfEvaluating63 =null;


		try {
			// R5RS.g3:137:3: ( selfEvaluating )
			// R5RS.g3:137:6: selfEvaluating
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_selfEvaluating_in_patternDatum743);
			selfEvaluating63=selfEvaluating();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, selfEvaluating63.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "patternDatum"


	public static class template_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "template"
	// R5RS.g3:140:1: template : ( patternIdentifier | '(' ( ( templateElement )+ ( '.' templateElement )? )? ')' | '#(' ( templateElement )* ')' | templateDatum );
	public final R5RSParser.template_return template() throws RecognitionException {
		R5RSParser.template_return retval = new R5RSParser.template_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal65=null;
		Token char_literal67=null;
		Token char_literal69=null;
		Token string_literal70=null;
		Token char_literal72=null;
		ParserRuleReturnScope patternIdentifier64 =null;
		ParserRuleReturnScope templateElement66 =null;
		ParserRuleReturnScope templateElement68 =null;
		ParserRuleReturnScope templateElement71 =null;
		ParserRuleReturnScope templateDatum73 =null;

		Object char_literal65_tree=null;
		Object char_literal67_tree=null;
		Object char_literal69_tree=null;
		Object string_literal70_tree=null;
		Object char_literal72_tree=null;

		try {
			// R5RS.g3:141:3: ( patternIdentifier | '(' ( ( templateElement )+ ( '.' templateElement )? )? ')' | '#(' ( templateElement )* ')' | templateDatum )
			int alt22=4;
			switch ( input.LA(1) ) {
			case AND:
			case ARROW:
			case BEGIN:
			case CASE:
			case COND:
			case DEFINE:
			case DELAY:
			case DO:
			case ELSE:
			case IF:
			case LAMBDA:
			case LET:
			case LETREC:
			case LETSTAR:
			case OR:
			case QUASIQUOTE:
			case QUOTE:
			case SET:
			case UNQUOTE:
			case UNQUOTE_SPLICING:
			case VARIABLE:
				{
				alt22=1;
				}
				break;
			case 113:
				{
				alt22=2;
				}
				break;
			case 112:
				{
				alt22=3;
				}
				break;
			case CHARACTER:
			case FALSE:
			case NUM_10:
			case NUM_16:
			case NUM_2:
			case NUM_8:
			case STRING:
			case TRUE:
				{
				alt22=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// R5RS.g3:141:6: patternIdentifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_patternIdentifier_in_template757);
					patternIdentifier64=patternIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, patternIdentifier64.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:142:6: '(' ( ( templateElement )+ ( '.' templateElement )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal65=(Token)match(input,113,FOLLOW_113_in_template764); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal65_tree = (Object)adaptor.create(char_literal65);
					adaptor.addChild(root_0, char_literal65_tree);
					}

					// R5RS.g3:142:10: ( ( templateElement )+ ( '.' templateElement )? )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( ((LA20_0 >= AND && LA20_0 <= BEGIN)||LA20_0==CASE||LA20_0==CHARACTER||LA20_0==COND||LA20_0==DEFINE||LA20_0==DELAY||LA20_0==DO||LA20_0==ELSE||LA20_0==FALSE||LA20_0==IF||(LA20_0 >= LAMBDA && LA20_0 <= LETREC)||LA20_0==LETSTAR||(LA20_0 >= NUM_10 && LA20_0 <= OR)||LA20_0==QUASIQUOTE||LA20_0==QUOTE||LA20_0==SET||LA20_0==STRING||LA20_0==TRUE||(LA20_0 >= UNQUOTE && LA20_0 <= UNQUOTE_SPLICING)||LA20_0==VARIABLE||(LA20_0 >= 112 && LA20_0 <= 113)) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// R5RS.g3:142:11: ( templateElement )+ ( '.' templateElement )?
							{
							// R5RS.g3:142:11: ( templateElement )+
							int cnt18=0;
							loop18:
							while (true) {
								int alt18=2;
								int LA18_0 = input.LA(1);
								if ( ((LA18_0 >= AND && LA18_0 <= BEGIN)||LA18_0==CASE||LA18_0==CHARACTER||LA18_0==COND||LA18_0==DEFINE||LA18_0==DELAY||LA18_0==DO||LA18_0==ELSE||LA18_0==FALSE||LA18_0==IF||(LA18_0 >= LAMBDA && LA18_0 <= LETREC)||LA18_0==LETSTAR||(LA18_0 >= NUM_10 && LA18_0 <= OR)||LA18_0==QUASIQUOTE||LA18_0==QUOTE||LA18_0==SET||LA18_0==STRING||LA18_0==TRUE||(LA18_0 >= UNQUOTE && LA18_0 <= UNQUOTE_SPLICING)||LA18_0==VARIABLE||(LA18_0 >= 112 && LA18_0 <= 113)) ) {
									alt18=1;
								}

								switch (alt18) {
								case 1 :
									// R5RS.g3:142:11: templateElement
									{
									pushFollow(FOLLOW_templateElement_in_template767);
									templateElement66=templateElement();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, templateElement66.getTree());

									}
									break;

								default :
									if ( cnt18 >= 1 ) break loop18;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(18, input);
									throw eee;
								}
								cnt18++;
							}

							// R5RS.g3:142:28: ( '.' templateElement )?
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==118) ) {
								alt19=1;
							}
							switch (alt19) {
								case 1 :
									// R5RS.g3:142:29: '.' templateElement
									{
									char_literal67=(Token)match(input,118,FOLLOW_118_in_template771); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal67_tree = (Object)adaptor.create(char_literal67);
									adaptor.addChild(root_0, char_literal67_tree);
									}

									pushFollow(FOLLOW_templateElement_in_template773);
									templateElement68=templateElement();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, templateElement68.getTree());

									}
									break;

							}

							}
							break;

					}

					char_literal69=(Token)match(input,115,FOLLOW_115_in_template779); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal69_tree = (Object)adaptor.create(char_literal69);
					adaptor.addChild(root_0, char_literal69_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:143:6: '#(' ( templateElement )* ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal70=(Token)match(input,112,FOLLOW_112_in_template786); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal70_tree = (Object)adaptor.create(string_literal70);
					adaptor.addChild(root_0, string_literal70_tree);
					}

					// R5RS.g3:143:11: ( templateElement )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( ((LA21_0 >= AND && LA21_0 <= BEGIN)||LA21_0==CASE||LA21_0==CHARACTER||LA21_0==COND||LA21_0==DEFINE||LA21_0==DELAY||LA21_0==DO||LA21_0==ELSE||LA21_0==FALSE||LA21_0==IF||(LA21_0 >= LAMBDA && LA21_0 <= LETREC)||LA21_0==LETSTAR||(LA21_0 >= NUM_10 && LA21_0 <= OR)||LA21_0==QUASIQUOTE||LA21_0==QUOTE||LA21_0==SET||LA21_0==STRING||LA21_0==TRUE||(LA21_0 >= UNQUOTE && LA21_0 <= UNQUOTE_SPLICING)||LA21_0==VARIABLE||(LA21_0 >= 112 && LA21_0 <= 113)) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// R5RS.g3:143:11: templateElement
							{
							pushFollow(FOLLOW_templateElement_in_template788);
							templateElement71=templateElement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, templateElement71.getTree());

							}
							break;

						default :
							break loop21;
						}
					}

					char_literal72=(Token)match(input,115,FOLLOW_115_in_template791); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal72_tree = (Object)adaptor.create(char_literal72);
					adaptor.addChild(root_0, char_literal72_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:144:6: templateDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_templateDatum_in_template798);
					templateDatum73=templateDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, templateDatum73.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "template"


	public static class templateElement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "templateElement"
	// R5RS.g3:147:1: templateElement : template ( ELLIPSIS )? ;
	public final R5RSParser.templateElement_return templateElement() throws RecognitionException {
		R5RSParser.templateElement_return retval = new R5RSParser.templateElement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELLIPSIS75=null;
		ParserRuleReturnScope template74 =null;

		Object ELLIPSIS75_tree=null;

		try {
			// R5RS.g3:148:3: ( template ( ELLIPSIS )? )
			// R5RS.g3:148:6: template ( ELLIPSIS )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_template_in_templateElement812);
			template74=template();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, template74.getTree());

			// R5RS.g3:148:15: ( ELLIPSIS )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ELLIPSIS) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// R5RS.g3:148:15: ELLIPSIS
					{
					ELLIPSIS75=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_templateElement814); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELLIPSIS75_tree = (Object)adaptor.create(ELLIPSIS75);
					adaptor.addChild(root_0, ELLIPSIS75_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "templateElement"


	public static class templateDatum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "templateDatum"
	// R5RS.g3:151:1: templateDatum : patternDatum ;
	public final R5RSParser.templateDatum_return templateDatum() throws RecognitionException {
		R5RSParser.templateDatum_return retval = new R5RSParser.templateDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope patternDatum76 =null;


		try {
			// R5RS.g3:152:3: ( patternDatum )
			// R5RS.g3:152:6: patternDatum
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_patternDatum_in_templateDatum829);
			patternDatum76=patternDatum();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, patternDatum76.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "templateDatum"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// R5RS.g3:156:1: command : expression -> ^( COMMAND expression ) ;
	public final R5RSParser.command_return command() throws RecognitionException {
		R5RSParser.command_return retval = new R5RSParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression77 =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// R5RS.g3:157:3: ( expression -> ^( COMMAND expression ) )
			// R5RS.g3:157:6: expression
			{
			pushFollow(FOLLOW_expression_in_command845);
			expression77=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression77.getTree());
			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 157:17: -> ^( COMMAND expression )
			{
				// R5RS.g3:157:20: ^( COMMAND expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command"


	public static class identifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// R5RS.g3:160:1: identifier : ( syntacticKeyword -> ^( IDENTIFIER syntacticKeyword ) | variable -> ^( IDENTIFIER variable ) );
	public final R5RSParser.identifier_return identifier() throws RecognitionException {
		R5RSParser.identifier_return retval = new R5RSParser.identifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope syntacticKeyword78 =null;
		ParserRuleReturnScope variable79 =null;

		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
		RewriteRuleSubtreeStream stream_syntacticKeyword=new RewriteRuleSubtreeStream(adaptor,"rule syntacticKeyword");

		try {
			// R5RS.g3:161:3: ( syntacticKeyword -> ^( IDENTIFIER syntacticKeyword ) | variable -> ^( IDENTIFIER variable ) )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( ((LA24_0 >= AND && LA24_0 <= BEGIN)||LA24_0==CASE||LA24_0==COND||LA24_0==DEFINE||LA24_0==DELAY||LA24_0==DO||LA24_0==ELSE||LA24_0==IF||(LA24_0 >= LAMBDA && LA24_0 <= LETREC)||LA24_0==LETSTAR||LA24_0==OR||LA24_0==QUASIQUOTE||LA24_0==QUOTE||LA24_0==SET||(LA24_0 >= UNQUOTE && LA24_0 <= UNQUOTE_SPLICING)) ) {
				alt24=1;
			}
			else if ( (LA24_0==ELLIPSIS||LA24_0==VARIABLE) ) {
				alt24=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// R5RS.g3:161:6: syntacticKeyword
					{
					pushFollow(FOLLOW_syntacticKeyword_in_identifier867);
					syntacticKeyword78=syntacticKeyword();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_syntacticKeyword.add(syntacticKeyword78.getTree());
					// AST REWRITE
					// elements: syntacticKeyword
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 161:23: -> ^( IDENTIFIER syntacticKeyword )
					{
						// R5RS.g3:161:26: ^( IDENTIFIER syntacticKeyword )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IDENTIFIER, "IDENTIFIER"), root_1);
						adaptor.addChild(root_1, stream_syntacticKeyword.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// R5RS.g3:162:6: variable
					{
					pushFollow(FOLLOW_variable_in_identifier882);
					variable79=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variable.add(variable79.getTree());
					// AST REWRITE
					// elements: variable
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 162:15: -> ^( IDENTIFIER variable )
					{
						// R5RS.g3:162:18: ^( IDENTIFIER variable )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IDENTIFIER, "IDENTIFIER"), root_1);
						adaptor.addChild(root_1, stream_variable.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"


	public static class syntacticKeyword_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "syntacticKeyword"
	// R5RS.g3:165:1: syntacticKeyword : ( expressionKeyword | ELSE | ARROW | DEFINE | UNQUOTE | UNQUOTE_SPLICING );
	public final R5RSParser.syntacticKeyword_return syntacticKeyword() throws RecognitionException {
		R5RSParser.syntacticKeyword_return retval = new R5RSParser.syntacticKeyword_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSE81=null;
		Token ARROW82=null;
		Token DEFINE83=null;
		Token UNQUOTE84=null;
		Token UNQUOTE_SPLICING85=null;
		ParserRuleReturnScope expressionKeyword80 =null;

		Object ELSE81_tree=null;
		Object ARROW82_tree=null;
		Object DEFINE83_tree=null;
		Object UNQUOTE84_tree=null;
		Object UNQUOTE_SPLICING85_tree=null;

		try {
			// R5RS.g3:166:3: ( expressionKeyword | ELSE | ARROW | DEFINE | UNQUOTE | UNQUOTE_SPLICING )
			int alt25=6;
			switch ( input.LA(1) ) {
			case AND:
			case BEGIN:
			case CASE:
			case COND:
			case DELAY:
			case DO:
			case IF:
			case LAMBDA:
			case LET:
			case LETREC:
			case LETSTAR:
			case OR:
			case QUASIQUOTE:
			case QUOTE:
			case SET:
				{
				alt25=1;
				}
				break;
			case ELSE:
				{
				alt25=2;
				}
				break;
			case ARROW:
				{
				alt25=3;
				}
				break;
			case DEFINE:
				{
				alt25=4;
				}
				break;
			case UNQUOTE:
				{
				alt25=5;
				}
				break;
			case UNQUOTE_SPLICING:
				{
				alt25=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// R5RS.g3:166:6: expressionKeyword
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expressionKeyword_in_syntacticKeyword904);
					expressionKeyword80=expressionKeyword();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionKeyword80.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:167:6: ELSE
					{
					root_0 = (Object)adaptor.nil();


					ELSE81=(Token)match(input,ELSE,FOLLOW_ELSE_in_syntacticKeyword911); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELSE81_tree = (Object)adaptor.create(ELSE81);
					adaptor.addChild(root_0, ELSE81_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:168:6: ARROW
					{
					root_0 = (Object)adaptor.nil();


					ARROW82=(Token)match(input,ARROW,FOLLOW_ARROW_in_syntacticKeyword918); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ARROW82_tree = (Object)adaptor.create(ARROW82);
					adaptor.addChild(root_0, ARROW82_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:169:6: DEFINE
					{
					root_0 = (Object)adaptor.nil();


					DEFINE83=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_syntacticKeyword925); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DEFINE83_tree = (Object)adaptor.create(DEFINE83);
					adaptor.addChild(root_0, DEFINE83_tree);
					}

					}
					break;
				case 5 :
					// R5RS.g3:170:6: UNQUOTE
					{
					root_0 = (Object)adaptor.nil();


					UNQUOTE84=(Token)match(input,UNQUOTE,FOLLOW_UNQUOTE_in_syntacticKeyword932); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE84_tree = (Object)adaptor.create(UNQUOTE84);
					adaptor.addChild(root_0, UNQUOTE84_tree);
					}

					}
					break;
				case 6 :
					// R5RS.g3:171:6: UNQUOTE_SPLICING
					{
					root_0 = (Object)adaptor.nil();


					UNQUOTE_SPLICING85=(Token)match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_syntacticKeyword939); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE_SPLICING85_tree = (Object)adaptor.create(UNQUOTE_SPLICING85);
					adaptor.addChild(root_0, UNQUOTE_SPLICING85_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "syntacticKeyword"


	public static class expressionKeyword_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionKeyword"
	// R5RS.g3:174:1: expressionKeyword : ( QUOTE | LAMBDA | IF | SET | BEGIN | COND | AND | OR | CASE | LET | LETSTAR | LETREC | DO | DELAY | QUASIQUOTE );
	public final R5RSParser.expressionKeyword_return expressionKeyword() throws RecognitionException {
		R5RSParser.expressionKeyword_return retval = new R5RSParser.expressionKeyword_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set86=null;

		Object set86_tree=null;

		try {
			// R5RS.g3:175:3: ( QUOTE | LAMBDA | IF | SET | BEGIN | COND | AND | OR | CASE | LET | LETSTAR | LETREC | DO | DELAY | QUASIQUOTE )
			// R5RS.g3:
			{
			root_0 = (Object)adaptor.nil();


			set86=input.LT(1);
			if ( input.LA(1)==AND||input.LA(1)==BEGIN||input.LA(1)==CASE||input.LA(1)==COND||input.LA(1)==DELAY||input.LA(1)==DO||input.LA(1)==IF||(input.LA(1) >= LAMBDA && input.LA(1) <= LETREC)||input.LA(1)==LETSTAR||input.LA(1)==OR||input.LA(1)==QUASIQUOTE||input.LA(1)==QUOTE||input.LA(1)==SET ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set86));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressionKeyword"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// R5RS.g3:192:1: expression : ( ( variable )=> variable | ( literal )=> literal -> ^( LITERAL literal ) | ( lambdaExpression )=> lambdaExpression | ( conditional )=> conditional | ( assignment )=> assignment | ( derivedExpression )=> derivedExpression | ( procedureCall )=> procedureCall | ( macroUse )=> macroUse | macroBlock );
	public final R5RSParser.expression_return expression() throws RecognitionException {
		R5RSParser.expression_return retval = new R5RSParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope variable87 =null;
		ParserRuleReturnScope literal88 =null;
		ParserRuleReturnScope lambdaExpression89 =null;
		ParserRuleReturnScope conditional90 =null;
		ParserRuleReturnScope assignment91 =null;
		ParserRuleReturnScope derivedExpression92 =null;
		ParserRuleReturnScope procedureCall93 =null;
		ParserRuleReturnScope macroUse94 =null;
		ParserRuleReturnScope macroBlock95 =null;

		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			// R5RS.g3:193:3: ( ( variable )=> variable | ( literal )=> literal -> ^( LITERAL literal ) | ( lambdaExpression )=> lambdaExpression | ( conditional )=> conditional | ( assignment )=> assignment | ( derivedExpression )=> derivedExpression | ( procedureCall )=> procedureCall | ( macroUse )=> macroUse | macroBlock )
			int alt26=9;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==VARIABLE) && (synpred6_R5RS())) {
				alt26=1;
			}
			else if ( (LA26_0==ELLIPSIS) && (synpred6_R5RS())) {
				alt26=1;
			}
			else if ( (LA26_0==119) && (synpred7_R5RS())) {
				alt26=2;
			}
			else if ( (LA26_0==113) ) {
				int LA26_4 = input.LA(2);
				if ( (synpred7_R5RS()) ) {
					alt26=2;
				}
				else if ( (synpred8_R5RS()) ) {
					alt26=3;
				}
				else if ( (synpred9_R5RS()) ) {
					alt26=4;
				}
				else if ( (synpred10_R5RS()) ) {
					alt26=5;
				}
				else if ( (synpred11_R5RS()) ) {
					alt26=6;
				}
				else if ( (synpred12_R5RS()) ) {
					alt26=7;
				}
				else if ( (synpred13_R5RS()) ) {
					alt26=8;
				}
				else if ( (true) ) {
					alt26=9;
				}

			}
			else if ( (LA26_0==TRUE) && (synpred7_R5RS())) {
				alt26=2;
			}
			else if ( (LA26_0==FALSE) && (synpred7_R5RS())) {
				alt26=2;
			}
			else if ( (LA26_0==NUM_2) && (synpred7_R5RS())) {
				alt26=2;
			}
			else if ( (LA26_0==NUM_8) && (synpred7_R5RS())) {
				alt26=2;
			}
			else if ( (LA26_0==NUM_10) && (synpred7_R5RS())) {
				alt26=2;
			}
			else if ( (LA26_0==NUM_16) && (synpred7_R5RS())) {
				alt26=2;
			}
			else if ( (LA26_0==CHARACTER) && (synpred7_R5RS())) {
				alt26=2;
			}
			else if ( (LA26_0==STRING) && (synpred7_R5RS())) {
				alt26=2;
			}
			else if ( (LA26_0==120) && (synpred11_R5RS())) {
				alt26=6;
			}

			switch (alt26) {
				case 1 :
					// R5RS.g3:193:6: ( variable )=> variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_expression1083);
					variable87=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable87.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:194:6: ( literal )=> literal
					{
					pushFollow(FOLLOW_literal_in_expression1105);
					literal88=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_literal.add(literal88.getTree());
					// AST REWRITE
					// elements: literal
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 194:36: -> ^( LITERAL literal )
					{
						// R5RS.g3:194:39: ^( LITERAL literal )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);
						adaptor.addChild(root_1, stream_literal.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// R5RS.g3:195:6: ( lambdaExpression )=> lambdaExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lambdaExpression_in_expression1126);
					lambdaExpression89=lambdaExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lambdaExpression89.getTree());

					}
					break;
				case 4 :
					// R5RS.g3:196:6: ( conditional )=> conditional
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_conditional_in_expression1144);
					conditional90=conditional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional90.getTree());

					}
					break;
				case 5 :
					// R5RS.g3:197:6: ( assignment )=> assignment
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_expression1163);
					assignment91=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment91.getTree());

					}
					break;
				case 6 :
					// R5RS.g3:198:6: ( derivedExpression )=> derivedExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_derivedExpression_in_expression1175);
					derivedExpression92=derivedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, derivedExpression92.getTree());

					}
					break;
				case 7 :
					// R5RS.g3:199:6: ( procedureCall )=> procedureCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureCall_in_expression1191);
					procedureCall93=procedureCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall93.getTree());

					}
					break;
				case 8 :
					// R5RS.g3:200:6: ( macroUse )=> macroUse
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_macroUse_in_expression1212);
					macroUse94=macroUse();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, macroUse94.getTree());

					}
					break;
				case 9 :
					// R5RS.g3:201:28: macroBlock
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_macroBlock_in_expression1241);
					macroBlock95=macroBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, macroBlock95.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// R5RS.g3:204:1: variable : ( VARIABLE ^| ELLIPSIS ^);
	public final R5RSParser.variable_return variable() throws RecognitionException {
		R5RSParser.variable_return retval = new R5RSParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE96=null;
		Token ELLIPSIS97=null;

		Object VARIABLE96_tree=null;
		Object ELLIPSIS97_tree=null;

		try {
			// R5RS.g3:205:3: ( VARIABLE ^| ELLIPSIS ^)
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==VARIABLE) ) {
				alt27=1;
			}
			else if ( (LA27_0==ELLIPSIS) ) {
				alt27=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// R5RS.g3:205:6: VARIABLE ^
					{
					root_0 = (Object)adaptor.nil();


					VARIABLE96=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_variable1255); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE96_tree = new VariableNode(VARIABLE96) ;
					root_0 = (Object)adaptor.becomeRoot(VARIABLE96_tree, root_0);
					}

					}
					break;
				case 2 :
					// R5RS.g3:206:6: ELLIPSIS ^
					{
					root_0 = (Object)adaptor.nil();


					ELLIPSIS97=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_variable1266); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELLIPSIS97_tree = (Object)adaptor.create(ELLIPSIS97);
					root_0 = (Object)adaptor.becomeRoot(ELLIPSIS97_tree, root_0);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable"


	public static class literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// R5RS.g3:209:1: literal : ( quotation -> ^( QUOTATION quotation ) | selfEvaluating -> ^( SELFEVALUATING selfEvaluating ) );
	public final R5RSParser.literal_return literal() throws RecognitionException {
		R5RSParser.literal_return retval = new R5RSParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope quotation98 =null;
		ParserRuleReturnScope selfEvaluating99 =null;

		RewriteRuleSubtreeStream stream_selfEvaluating=new RewriteRuleSubtreeStream(adaptor,"rule selfEvaluating");
		RewriteRuleSubtreeStream stream_quotation=new RewriteRuleSubtreeStream(adaptor,"rule quotation");

		try {
			// R5RS.g3:210:3: ( quotation -> ^( QUOTATION quotation ) | selfEvaluating -> ^( SELFEVALUATING selfEvaluating ) )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==113||LA28_0==119) ) {
				alt28=1;
			}
			else if ( (LA28_0==CHARACTER||LA28_0==FALSE||(LA28_0 >= NUM_10 && LA28_0 <= NUM_8)||LA28_0==STRING||LA28_0==TRUE) ) {
				alt28=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// R5RS.g3:210:6: quotation
					{
					pushFollow(FOLLOW_quotation_in_literal1281);
					quotation98=quotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_quotation.add(quotation98.getTree());
					// AST REWRITE
					// elements: quotation
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 210:16: -> ^( QUOTATION quotation )
					{
						// R5RS.g3:210:19: ^( QUOTATION quotation )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUOTATION, "QUOTATION"), root_1);
						adaptor.addChild(root_1, stream_quotation.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// R5RS.g3:211:6: selfEvaluating
					{
					pushFollow(FOLLOW_selfEvaluating_in_literal1296);
					selfEvaluating99=selfEvaluating();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_selfEvaluating.add(selfEvaluating99.getTree());
					// AST REWRITE
					// elements: selfEvaluating
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 211:21: -> ^( SELFEVALUATING selfEvaluating )
					{
						// R5RS.g3:211:24: ^( SELFEVALUATING selfEvaluating )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELFEVALUATING, "SELFEVALUATING"), root_1);
						adaptor.addChild(root_1, stream_selfEvaluating.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal"


	public static class quotation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "quotation"
	// R5RS.g3:214:1: quotation : ( '\\'' ! datum | '(' QUOTE datum ')' );
	public final R5RSParser.quotation_return quotation() throws RecognitionException {
		R5RSParser.quotation_return retval = new R5RSParser.quotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal100=null;
		Token char_literal102=null;
		Token QUOTE103=null;
		Token char_literal105=null;
		ParserRuleReturnScope datum101 =null;
		ParserRuleReturnScope datum104 =null;

		Object char_literal100_tree=null;
		Object char_literal102_tree=null;
		Object QUOTE103_tree=null;
		Object char_literal105_tree=null;

		try {
			// R5RS.g3:215:3: ( '\\'' ! datum | '(' QUOTE datum ')' )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==119) ) {
				alt29=1;
			}
			else if ( (LA29_0==113) ) {
				alt29=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// R5RS.g3:215:6: '\\'' ! datum
					{
					root_0 = (Object)adaptor.nil();


					char_literal100=(Token)match(input,119,FOLLOW_119_in_quotation1318); if (state.failed) return retval;
					pushFollow(FOLLOW_datum_in_quotation1321);
					datum101=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum101.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:216:6: '(' QUOTE datum ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal102=(Token)match(input,113,FOLLOW_113_in_quotation1328); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal102_tree = (Object)adaptor.create(char_literal102);
					adaptor.addChild(root_0, char_literal102_tree);
					}

					QUOTE103=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_quotation1330); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					QUOTE103_tree = (Object)adaptor.create(QUOTE103);
					adaptor.addChild(root_0, QUOTE103_tree);
					}

					pushFollow(FOLLOW_datum_in_quotation1332);
					datum104=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum104.getTree());

					char_literal105=(Token)match(input,115,FOLLOW_115_in_quotation1334); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal105_tree = (Object)adaptor.create(char_literal105);
					adaptor.addChild(root_0, char_literal105_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quotation"


	public static class selfEvaluating_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "selfEvaluating"
	// R5RS.g3:219:1: selfEvaluating : ( bool | number | CHARACTER -> ^( CHAR CHARACTER ) | STRING -> ^( STR STRING ) );
	public final R5RSParser.selfEvaluating_return selfEvaluating() throws RecognitionException {
		R5RSParser.selfEvaluating_return retval = new R5RSParser.selfEvaluating_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHARACTER108=null;
		Token STRING109=null;
		ParserRuleReturnScope bool106 =null;
		ParserRuleReturnScope number107 =null;

		Object CHARACTER108_tree=null;
		Object STRING109_tree=null;
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");

		try {
			// R5RS.g3:220:3: ( bool | number | CHARACTER -> ^( CHAR CHARACTER ) | STRING -> ^( STR STRING ) )
			int alt30=4;
			switch ( input.LA(1) ) {
			case FALSE:
			case TRUE:
				{
				alt30=1;
				}
				break;
			case NUM_10:
			case NUM_16:
			case NUM_2:
			case NUM_8:
				{
				alt30=2;
				}
				break;
			case CHARACTER:
				{
				alt30=3;
				}
				break;
			case STRING:
				{
				alt30=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// R5RS.g3:220:6: bool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_in_selfEvaluating1348);
					bool106=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool106.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:221:6: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_selfEvaluating1355);
					number107=number();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number107.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:222:6: CHARACTER
					{
					CHARACTER108=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_selfEvaluating1362); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER108);

					// AST REWRITE
					// elements: CHARACTER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 222:16: -> ^( CHAR CHARACTER )
					{
						// R5RS.g3:222:19: ^( CHAR CHARACTER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CHAR, "CHAR"), root_1);
						adaptor.addChild(root_1, stream_CHARACTER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// R5RS.g3:223:6: STRING
					{
					STRING109=(Token)match(input,STRING,FOLLOW_STRING_in_selfEvaluating1377); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRING.add(STRING109);

					// AST REWRITE
					// elements: STRING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 223:13: -> ^( STR STRING )
					{
						// R5RS.g3:223:16: ^( STR STRING )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STR, "STR"), root_1);
						adaptor.addChild(root_1, stream_STRING.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selfEvaluating"


	public static class lambdaExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lambdaExpression"
	// R5RS.g3:226:1: lambdaExpression : '(' ! LAMBDA ^ lambdaformals body ')' !;
	public final R5RSParser.lambdaExpression_return lambdaExpression() throws RecognitionException {
		R5RSParser.lambdaExpression_return retval = new R5RSParser.lambdaExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal110=null;
		Token LAMBDA111=null;
		Token char_literal114=null;
		ParserRuleReturnScope lambdaformals112 =null;
		ParserRuleReturnScope body113 =null;

		Object char_literal110_tree=null;
		Object LAMBDA111_tree=null;
		Object char_literal114_tree=null;

		try {
			// R5RS.g3:227:3: ( '(' ! LAMBDA ^ lambdaformals body ')' !)
			// R5RS.g3:227:6: '(' ! LAMBDA ^ lambdaformals body ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal110=(Token)match(input,113,FOLLOW_113_in_lambdaExpression1399); if (state.failed) return retval;
			LAMBDA111=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambdaExpression1402); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LAMBDA111_tree = (Object)adaptor.create(LAMBDA111);
			root_0 = (Object)adaptor.becomeRoot(LAMBDA111_tree, root_0);
			}

			pushFollow(FOLLOW_lambdaformals_in_lambdaExpression1405);
			lambdaformals112=lambdaformals();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lambdaformals112.getTree());

			pushFollow(FOLLOW_body_in_lambdaExpression1407);
			body113=body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, body113.getTree());

			char_literal114=(Token)match(input,115,FOLLOW_115_in_lambdaExpression1409); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lambdaExpression"


	public static class lambdaformals_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lambdaformals"
	// R5RS.g3:230:1: lambdaformals : ( ( variable )=> variable | ( formals )=> formals | '()' -> ^( EMPTYFORMALS ) );
	public final R5RSParser.lambdaformals_return lambdaformals() throws RecognitionException {
		R5RSParser.lambdaformals_return retval = new R5RSParser.lambdaformals_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal117=null;
		ParserRuleReturnScope variable115 =null;
		ParserRuleReturnScope formals116 =null;

		Object string_literal117_tree=null;
		RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");

		try {
			// R5RS.g3:231:3: ( ( variable )=> variable | ( formals )=> formals | '()' -> ^( EMPTYFORMALS ) )
			int alt31=3;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==VARIABLE) && (synpred14_R5RS())) {
				alt31=1;
			}
			else if ( (LA31_0==ELLIPSIS) && (synpred14_R5RS())) {
				alt31=1;
			}
			else if ( (LA31_0==113) && (synpred15_R5RS())) {
				alt31=2;
			}
			else if ( (LA31_0==114) ) {
				alt31=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// R5RS.g3:231:5: ( variable )=> variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_lambdaformals1429);
					variable115=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable115.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:232:5: ( formals )=> formals
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_formals_in_lambdaformals1441);
					formals116=formals();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formals116.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:233:5: '()'
					{
					string_literal117=(Token)match(input,114,FOLLOW_114_in_lambdaformals1447); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_114.add(string_literal117);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 233:10: -> ^( EMPTYFORMALS )
					{
						// R5RS.g3:233:13: ^( EMPTYFORMALS )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EMPTYFORMALS, "EMPTYFORMALS"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lambdaformals"


	public static class conditional_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditional"
	// R5RS.g3:237:1: conditional : '(' ! IF ^ test consequent ( alternate )? ')' !;
	public final R5RSParser.conditional_return conditional() throws RecognitionException {
		R5RSParser.conditional_return retval = new R5RSParser.conditional_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal118=null;
		Token IF119=null;
		Token char_literal123=null;
		ParserRuleReturnScope test120 =null;
		ParserRuleReturnScope consequent121 =null;
		ParserRuleReturnScope alternate122 =null;

		Object char_literal118_tree=null;
		Object IF119_tree=null;
		Object char_literal123_tree=null;

		try {
			// R5RS.g3:238:3: ( '(' ! IF ^ test consequent ( alternate )? ')' !)
			// R5RS.g3:238:6: '(' ! IF ^ test consequent ( alternate )? ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal118=(Token)match(input,113,FOLLOW_113_in_conditional1468); if (state.failed) return retval;
			IF119=(Token)match(input,IF,FOLLOW_IF_in_conditional1471); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF119_tree = (Object)adaptor.create(IF119);
			root_0 = (Object)adaptor.becomeRoot(IF119_tree, root_0);
			}

			pushFollow(FOLLOW_test_in_conditional1474);
			test120=test();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, test120.getTree());

			pushFollow(FOLLOW_consequent_in_conditional1476);
			consequent121=consequent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, consequent121.getTree());

			// R5RS.g3:238:31: ( alternate )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==CHARACTER||LA32_0==ELLIPSIS||LA32_0==FALSE||(LA32_0 >= NUM_10 && LA32_0 <= NUM_8)||LA32_0==STRING||LA32_0==TRUE||LA32_0==VARIABLE||LA32_0==113||(LA32_0 >= 119 && LA32_0 <= 120)) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// R5RS.g3:238:31: alternate
					{
					pushFollow(FOLLOW_alternate_in_conditional1478);
					alternate122=alternate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alternate122.getTree());

					}
					break;

			}

			char_literal123=(Token)match(input,115,FOLLOW_115_in_conditional1481); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional"


	public static class test_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "test"
	// R5RS.g3:241:1: test : expression -> ^( TEST expression ) ;
	public final R5RSParser.test_return test() throws RecognitionException {
		R5RSParser.test_return retval = new R5RSParser.test_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression124 =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// R5RS.g3:242:3: ( expression -> ^( TEST expression ) )
			// R5RS.g3:242:6: expression
			{
			pushFollow(FOLLOW_expression_in_test1497);
			expression124=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression124.getTree());
			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 242:17: -> ^( TEST expression )
			{
				// R5RS.g3:242:20: ^( TEST expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST, "TEST"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "test"


	public static class consequent_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "consequent"
	// R5RS.g3:245:1: consequent : expression ;
	public final R5RSParser.consequent_return consequent() throws RecognitionException {
		R5RSParser.consequent_return retval = new R5RSParser.consequent_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression125 =null;


		try {
			// R5RS.g3:246:3: ( expression )
			// R5RS.g3:246:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_consequent1521);
			expression125=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression125.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "consequent"


	public static class alternate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "alternate"
	// R5RS.g3:249:1: alternate : expression ;
	public final R5RSParser.alternate_return alternate() throws RecognitionException {
		R5RSParser.alternate_return retval = new R5RSParser.alternate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression126 =null;


		try {
			// R5RS.g3:250:3: ( expression )
			// R5RS.g3:250:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_alternate1536);
			expression126=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression126.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alternate"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// R5RS.g3:253:1: assignment : '(' ! SET ^ variable expression ')' !;
	public final R5RSParser.assignment_return assignment() throws RecognitionException {
		R5RSParser.assignment_return retval = new R5RSParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal127=null;
		Token SET128=null;
		Token char_literal131=null;
		ParserRuleReturnScope variable129 =null;
		ParserRuleReturnScope expression130 =null;

		Object char_literal127_tree=null;
		Object SET128_tree=null;
		Object char_literal131_tree=null;

		try {
			// R5RS.g3:254:3: ( '(' ! SET ^ variable expression ')' !)
			// R5RS.g3:254:6: '(' ! SET ^ variable expression ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal127=(Token)match(input,113,FOLLOW_113_in_assignment1550); if (state.failed) return retval;
			SET128=(Token)match(input,SET,FOLLOW_SET_in_assignment1553); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SET128_tree = (Object)adaptor.create(SET128);
			root_0 = (Object)adaptor.becomeRoot(SET128_tree, root_0);
			}

			pushFollow(FOLLOW_variable_in_assignment1556);
			variable129=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable129.getTree());

			pushFollow(FOLLOW_expression_in_assignment1558);
			expression130=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression130.getTree());

			char_literal131=(Token)match(input,115,FOLLOW_115_in_assignment1560); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class derivedExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "derivedExpression"
	// R5RS.g3:257:1: derivedExpression : ( quasiquotation -> ^( QUASIQUOTATION quasiquotation ) | '(' ! ( COND ^ ( '(' ! elseClause ')' !| ( condClause )+ ( '(' ! elseClause ')' !)? ) | CASE ^ expression ( '(' ! elseClause ')' !| ( caseClause )+ ( '(' ! elseClause ')' !)? ) | AND ^ ( test )* | OR ^ ( test )* | localBinding | BEGIN ^ sequence | DO ^ '(' ! ( iterationSpec )* ')' ! '(' ! test ( doResult )? ')' ! doCommands | DELAY ^ expression ) ')' !);
	public final R5RSParser.derivedExpression_return derivedExpression() throws RecognitionException {
		R5RSParser.derivedExpression_return retval = new R5RSParser.derivedExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal133=null;
		Token COND134=null;
		Token char_literal135=null;
		Token char_literal137=null;
		Token char_literal139=null;
		Token char_literal141=null;
		Token CASE142=null;
		Token char_literal144=null;
		Token char_literal146=null;
		Token char_literal148=null;
		Token char_literal150=null;
		Token AND151=null;
		Token OR153=null;
		Token BEGIN156=null;
		Token DO158=null;
		Token char_literal159=null;
		Token char_literal161=null;
		Token char_literal162=null;
		Token char_literal165=null;
		Token DELAY167=null;
		Token char_literal169=null;
		ParserRuleReturnScope quasiquotation132 =null;
		ParserRuleReturnScope elseClause136 =null;
		ParserRuleReturnScope condClause138 =null;
		ParserRuleReturnScope elseClause140 =null;
		ParserRuleReturnScope expression143 =null;
		ParserRuleReturnScope elseClause145 =null;
		ParserRuleReturnScope caseClause147 =null;
		ParserRuleReturnScope elseClause149 =null;
		ParserRuleReturnScope test152 =null;
		ParserRuleReturnScope test154 =null;
		ParserRuleReturnScope localBinding155 =null;
		ParserRuleReturnScope sequence157 =null;
		ParserRuleReturnScope iterationSpec160 =null;
		ParserRuleReturnScope test163 =null;
		ParserRuleReturnScope doResult164 =null;
		ParserRuleReturnScope doCommands166 =null;
		ParserRuleReturnScope expression168 =null;

		Object char_literal133_tree=null;
		Object COND134_tree=null;
		Object char_literal135_tree=null;
		Object char_literal137_tree=null;
		Object char_literal139_tree=null;
		Object char_literal141_tree=null;
		Object CASE142_tree=null;
		Object char_literal144_tree=null;
		Object char_literal146_tree=null;
		Object char_literal148_tree=null;
		Object char_literal150_tree=null;
		Object AND151_tree=null;
		Object OR153_tree=null;
		Object BEGIN156_tree=null;
		Object DO158_tree=null;
		Object char_literal159_tree=null;
		Object char_literal161_tree=null;
		Object char_literal162_tree=null;
		Object char_literal165_tree=null;
		Object DELAY167_tree=null;
		Object char_literal169_tree=null;
		RewriteRuleSubtreeStream stream_quasiquotation=new RewriteRuleSubtreeStream(adaptor,"rule quasiquotation");

		try {
			// R5RS.g3:258:3: ( quasiquotation -> ^( QUASIQUOTATION quasiquotation ) | '(' ! ( COND ^ ( '(' ! elseClause ')' !| ( condClause )+ ( '(' ! elseClause ')' !)? ) | CASE ^ expression ( '(' ! elseClause ')' !| ( caseClause )+ ( '(' ! elseClause ')' !)? ) | AND ^ ( test )* | OR ^ ( test )* | localBinding | BEGIN ^ sequence | DO ^ '(' ! ( iterationSpec )* ')' ! '(' ! test ( doResult )? ')' ! doCommands | DELAY ^ expression ) ')' !)
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==120) ) {
				alt44=1;
			}
			else if ( (LA44_0==113) ) {
				int LA44_2 = input.LA(2);
				if ( (LA44_2==QUASIQUOTE) ) {
					alt44=1;
				}
				else if ( (LA44_2==AND||LA44_2==BEGIN||LA44_2==CASE||LA44_2==COND||LA44_2==DELAY||LA44_2==DO||(LA44_2 >= LET && LA44_2 <= LETREC)||LA44_2==LETSTAR||LA44_2==OR) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// R5RS.g3:258:6: quasiquotation
					{
					pushFollow(FOLLOW_quasiquotation_in_derivedExpression1575);
					quasiquotation132=quasiquotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_quasiquotation.add(quasiquotation132.getTree());
					// AST REWRITE
					// elements: quasiquotation
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 258:21: -> ^( QUASIQUOTATION quasiquotation )
					{
						// R5RS.g3:258:24: ^( QUASIQUOTATION quasiquotation )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUASIQUOTATION, "QUASIQUOTATION"), root_1);
						adaptor.addChild(root_1, stream_quasiquotation.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// R5RS.g3:259:6: '(' ! ( COND ^ ( '(' ! elseClause ')' !| ( condClause )+ ( '(' ! elseClause ')' !)? ) | CASE ^ expression ( '(' ! elseClause ')' !| ( caseClause )+ ( '(' ! elseClause ')' !)? ) | AND ^ ( test )* | OR ^ ( test )* | localBinding | BEGIN ^ sequence | DO ^ '(' ! ( iterationSpec )* ')' ! '(' ! test ( doResult )? ')' ! doCommands | DELAY ^ expression ) ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal133=(Token)match(input,113,FOLLOW_113_in_derivedExpression1590); if (state.failed) return retval;
					// R5RS.g3:259:11: ( COND ^ ( '(' ! elseClause ')' !| ( condClause )+ ( '(' ! elseClause ')' !)? ) | CASE ^ expression ( '(' ! elseClause ')' !| ( caseClause )+ ( '(' ! elseClause ')' !)? ) | AND ^ ( test )* | OR ^ ( test )* | localBinding | BEGIN ^ sequence | DO ^ '(' ! ( iterationSpec )* ')' ! '(' ! test ( doResult )? ')' ! doCommands | DELAY ^ expression )
					int alt43=8;
					switch ( input.LA(1) ) {
					case COND:
						{
						alt43=1;
						}
						break;
					case CASE:
						{
						alt43=2;
						}
						break;
					case AND:
						{
						alt43=3;
						}
						break;
					case OR:
						{
						alt43=4;
						}
						break;
					case LET:
					case LETREC:
					case LETSTAR:
						{
						alt43=5;
						}
						break;
					case BEGIN:
						{
						alt43=6;
						}
						break;
					case DO:
						{
						alt43=7;
						}
						break;
					case DELAY:
						{
						alt43=8;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 43, 0, input);
						throw nvae;
					}
					switch (alt43) {
						case 1 :
							// R5RS.g3:259:13: COND ^ ( '(' ! elseClause ')' !| ( condClause )+ ( '(' ! elseClause ')' !)? )
							{
							COND134=(Token)match(input,COND,FOLLOW_COND_in_derivedExpression1595); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COND134_tree = (Object)adaptor.create(COND134);
							root_0 = (Object)adaptor.becomeRoot(COND134_tree, root_0);
							}

							// R5RS.g3:259:19: ( '(' ! elseClause ')' !| ( condClause )+ ( '(' ! elseClause ')' !)? )
							int alt35=2;
							int LA35_0 = input.LA(1);
							if ( (LA35_0==113) ) {
								int LA35_1 = input.LA(2);
								if ( (LA35_1==ELSE) ) {
									alt35=1;
								}
								else if ( (LA35_1==CHARACTER||LA35_1==ELLIPSIS||LA35_1==FALSE||(LA35_1 >= NUM_10 && LA35_1 <= NUM_8)||LA35_1==STRING||LA35_1==TRUE||LA35_1==VARIABLE||LA35_1==113||(LA35_1 >= 119 && LA35_1 <= 120)) ) {
									alt35=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 35, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 35, 0, input);
								throw nvae;
							}

							switch (alt35) {
								case 1 :
									// R5RS.g3:259:21: '(' ! elseClause ')' !
									{
									char_literal135=(Token)match(input,113,FOLLOW_113_in_derivedExpression1600); if (state.failed) return retval;
									pushFollow(FOLLOW_elseClause_in_derivedExpression1603);
									elseClause136=elseClause();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, elseClause136.getTree());

									char_literal137=(Token)match(input,115,FOLLOW_115_in_derivedExpression1605); if (state.failed) return retval;
									}
									break;
								case 2 :
									// R5RS.g3:260:21: ( condClause )+ ( '(' ! elseClause ')' !)?
									{
									// R5RS.g3:260:21: ( condClause )+
									int cnt33=0;
									loop33:
									while (true) {
										int alt33=2;
										int LA33_0 = input.LA(1);
										if ( (LA33_0==113) ) {
											int LA33_1 = input.LA(2);
											if ( (LA33_1==CHARACTER||LA33_1==ELLIPSIS||LA33_1==FALSE||(LA33_1 >= NUM_10 && LA33_1 <= NUM_8)||LA33_1==STRING||LA33_1==TRUE||LA33_1==VARIABLE||LA33_1==113||(LA33_1 >= 119 && LA33_1 <= 120)) ) {
												alt33=1;
											}

										}

										switch (alt33) {
										case 1 :
											// R5RS.g3:260:21: condClause
											{
											pushFollow(FOLLOW_condClause_in_derivedExpression1628);
											condClause138=condClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, condClause138.getTree());

											}
											break;

										default :
											if ( cnt33 >= 1 ) break loop33;
											if (state.backtracking>0) {state.failed=true; return retval;}
											EarlyExitException eee = new EarlyExitException(33, input);
											throw eee;
										}
										cnt33++;
									}

									// R5RS.g3:260:33: ( '(' ! elseClause ')' !)?
									int alt34=2;
									int LA34_0 = input.LA(1);
									if ( (LA34_0==113) ) {
										alt34=1;
									}
									switch (alt34) {
										case 1 :
											// R5RS.g3:260:34: '(' ! elseClause ')' !
											{
											char_literal139=(Token)match(input,113,FOLLOW_113_in_derivedExpression1632); if (state.failed) return retval;
											pushFollow(FOLLOW_elseClause_in_derivedExpression1635);
											elseClause140=elseClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, elseClause140.getTree());

											char_literal141=(Token)match(input,115,FOLLOW_115_in_derivedExpression1637); if (state.failed) return retval;
											}
											break;

									}

									}
									break;

							}

							}
							break;
						case 2 :
							// R5RS.g3:262:12: CASE ^ expression ( '(' ! elseClause ')' !| ( caseClause )+ ( '(' ! elseClause ')' !)? )
							{
							CASE142=(Token)match(input,CASE,FOLLOW_CASE_in_derivedExpression1673); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							CASE142_tree = (Object)adaptor.create(CASE142);
							root_0 = (Object)adaptor.becomeRoot(CASE142_tree, root_0);
							}

							pushFollow(FOLLOW_expression_in_derivedExpression1676);
							expression143=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression143.getTree());

							// R5RS.g3:262:29: ( '(' ! elseClause ')' !| ( caseClause )+ ( '(' ! elseClause ')' !)? )
							int alt38=2;
							int LA38_0 = input.LA(1);
							if ( (LA38_0==113) ) {
								int LA38_1 = input.LA(2);
								if ( (LA38_1==113) ) {
									alt38=2;
								}
								else if ( (LA38_1==ELSE) ) {
									alt38=1;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 38, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 38, 0, input);
								throw nvae;
							}

							switch (alt38) {
								case 1 :
									// R5RS.g3:262:31: '(' ! elseClause ')' !
									{
									char_literal144=(Token)match(input,113,FOLLOW_113_in_derivedExpression1680); if (state.failed) return retval;
									pushFollow(FOLLOW_elseClause_in_derivedExpression1683);
									elseClause145=elseClause();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, elseClause145.getTree());

									char_literal146=(Token)match(input,115,FOLLOW_115_in_derivedExpression1685); if (state.failed) return retval;
									}
									break;
								case 2 :
									// R5RS.g3:263:31: ( caseClause )+ ( '(' ! elseClause ')' !)?
									{
									// R5RS.g3:263:31: ( caseClause )+
									int cnt36=0;
									loop36:
									while (true) {
										int alt36=2;
										int LA36_0 = input.LA(1);
										if ( (LA36_0==113) ) {
											int LA36_1 = input.LA(2);
											if ( (LA36_1==113) ) {
												alt36=1;
											}

										}

										switch (alt36) {
										case 1 :
											// R5RS.g3:263:31: caseClause
											{
											pushFollow(FOLLOW_caseClause_in_derivedExpression1718);
											caseClause147=caseClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, caseClause147.getTree());

											}
											break;

										default :
											if ( cnt36 >= 1 ) break loop36;
											if (state.backtracking>0) {state.failed=true; return retval;}
											EarlyExitException eee = new EarlyExitException(36, input);
											throw eee;
										}
										cnt36++;
									}

									// R5RS.g3:263:43: ( '(' ! elseClause ')' !)?
									int alt37=2;
									int LA37_0 = input.LA(1);
									if ( (LA37_0==113) ) {
										alt37=1;
									}
									switch (alt37) {
										case 1 :
											// R5RS.g3:263:44: '(' ! elseClause ')' !
											{
											char_literal148=(Token)match(input,113,FOLLOW_113_in_derivedExpression1722); if (state.failed) return retval;
											pushFollow(FOLLOW_elseClause_in_derivedExpression1725);
											elseClause149=elseClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, elseClause149.getTree());

											char_literal150=(Token)match(input,115,FOLLOW_115_in_derivedExpression1727); if (state.failed) return retval;
											}
											break;

									}

									}
									break;

							}

							}
							break;
						case 3 :
							// R5RS.g3:265:12: AND ^ ( test )*
							{
							AND151=(Token)match(input,AND,FOLLOW_AND_in_derivedExpression1773); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							AND151_tree = (Object)adaptor.create(AND151);
							root_0 = (Object)adaptor.becomeRoot(AND151_tree, root_0);
							}

							// R5RS.g3:265:17: ( test )*
							loop39:
							while (true) {
								int alt39=2;
								int LA39_0 = input.LA(1);
								if ( (LA39_0==CHARACTER||LA39_0==ELLIPSIS||LA39_0==FALSE||(LA39_0 >= NUM_10 && LA39_0 <= NUM_8)||LA39_0==STRING||LA39_0==TRUE||LA39_0==VARIABLE||LA39_0==113||(LA39_0 >= 119 && LA39_0 <= 120)) ) {
									alt39=1;
								}

								switch (alt39) {
								case 1 :
									// R5RS.g3:265:17: test
									{
									pushFollow(FOLLOW_test_in_derivedExpression1776);
									test152=test();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, test152.getTree());

									}
									break;

								default :
									break loop39;
								}
							}

							}
							break;
						case 4 :
							// R5RS.g3:266:12: OR ^ ( test )*
							{
							OR153=(Token)match(input,OR,FOLLOW_OR_in_derivedExpression1790); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							OR153_tree = (Object)adaptor.create(OR153);
							root_0 = (Object)adaptor.becomeRoot(OR153_tree, root_0);
							}

							// R5RS.g3:266:16: ( test )*
							loop40:
							while (true) {
								int alt40=2;
								int LA40_0 = input.LA(1);
								if ( (LA40_0==CHARACTER||LA40_0==ELLIPSIS||LA40_0==FALSE||(LA40_0 >= NUM_10 && LA40_0 <= NUM_8)||LA40_0==STRING||LA40_0==TRUE||LA40_0==VARIABLE||LA40_0==113||(LA40_0 >= 119 && LA40_0 <= 120)) ) {
									alt40=1;
								}

								switch (alt40) {
								case 1 :
									// R5RS.g3:266:16: test
									{
									pushFollow(FOLLOW_test_in_derivedExpression1793);
									test154=test();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, test154.getTree());

									}
									break;

								default :
									break loop40;
								}
							}

							}
							break;
						case 5 :
							// R5RS.g3:267:12: localBinding
							{
							pushFollow(FOLLOW_localBinding_in_derivedExpression1807);
							localBinding155=localBinding();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, localBinding155.getTree());

							}
							break;
						case 6 :
							// R5RS.g3:268:12: BEGIN ^ sequence
							{
							BEGIN156=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_derivedExpression1820); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							BEGIN156_tree = (Object)adaptor.create(BEGIN156);
							root_0 = (Object)adaptor.becomeRoot(BEGIN156_tree, root_0);
							}

							pushFollow(FOLLOW_sequence_in_derivedExpression1823);
							sequence157=sequence();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence157.getTree());

							}
							break;
						case 7 :
							// R5RS.g3:269:12: DO ^ '(' ! ( iterationSpec )* ')' ! '(' ! test ( doResult )? ')' ! doCommands
							{
							DO158=(Token)match(input,DO,FOLLOW_DO_in_derivedExpression1836); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DO158_tree = (Object)adaptor.create(DO158);
							root_0 = (Object)adaptor.becomeRoot(DO158_tree, root_0);
							}

							char_literal159=(Token)match(input,113,FOLLOW_113_in_derivedExpression1839); if (state.failed) return retval;
							// R5RS.g3:269:21: ( iterationSpec )*
							loop41:
							while (true) {
								int alt41=2;
								int LA41_0 = input.LA(1);
								if ( (LA41_0==113) ) {
									alt41=1;
								}

								switch (alt41) {
								case 1 :
									// R5RS.g3:269:21: iterationSpec
									{
									pushFollow(FOLLOW_iterationSpec_in_derivedExpression1842);
									iterationSpec160=iterationSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, iterationSpec160.getTree());

									}
									break;

								default :
									break loop41;
								}
							}

							char_literal161=(Token)match(input,115,FOLLOW_115_in_derivedExpression1845); if (state.failed) return retval;
							char_literal162=(Token)match(input,113,FOLLOW_113_in_derivedExpression1848); if (state.failed) return retval;
							pushFollow(FOLLOW_test_in_derivedExpression1851);
							test163=test();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, test163.getTree());

							// R5RS.g3:269:51: ( doResult )?
							int alt42=2;
							int LA42_0 = input.LA(1);
							if ( (LA42_0==CHARACTER||LA42_0==ELLIPSIS||LA42_0==FALSE||(LA42_0 >= NUM_10 && LA42_0 <= NUM_8)||LA42_0==STRING||LA42_0==TRUE||LA42_0==VARIABLE||LA42_0==113||(LA42_0 >= 119 && LA42_0 <= 120)) ) {
								alt42=1;
							}
							switch (alt42) {
								case 1 :
									// R5RS.g3:269:51: doResult
									{
									pushFollow(FOLLOW_doResult_in_derivedExpression1853);
									doResult164=doResult();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, doResult164.getTree());

									}
									break;

							}

							char_literal165=(Token)match(input,115,FOLLOW_115_in_derivedExpression1856); if (state.failed) return retval;
							pushFollow(FOLLOW_doCommands_in_derivedExpression1859);
							doCommands166=doCommands();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, doCommands166.getTree());

							}
							break;
						case 8 :
							// R5RS.g3:270:12: DELAY ^ expression
							{
							DELAY167=(Token)match(input,DELAY,FOLLOW_DELAY_in_derivedExpression1872); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DELAY167_tree = (Object)adaptor.create(DELAY167);
							root_0 = (Object)adaptor.becomeRoot(DELAY167_tree, root_0);
							}

							pushFollow(FOLLOW_expression_in_derivedExpression1875);
							expression168=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression168.getTree());

							}
							break;

					}

					char_literal169=(Token)match(input,115,FOLLOW_115_in_derivedExpression1894); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "derivedExpression"


	public static class doCommands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "doCommands"
	// R5RS.g3:276:1: doCommands : ( command )* -> ^( DOCOMMANDS ( command )* ) ;
	public final R5RSParser.doCommands_return doCommands() throws RecognitionException {
		R5RSParser.doCommands_return retval = new R5RSParser.doCommands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope command170 =null;

		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");

		try {
			// R5RS.g3:277:3: ( ( command )* -> ^( DOCOMMANDS ( command )* ) )
			// R5RS.g3:277:5: ( command )*
			{
			// R5RS.g3:277:5: ( command )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==CHARACTER||LA45_0==ELLIPSIS||LA45_0==FALSE||(LA45_0 >= NUM_10 && LA45_0 <= NUM_8)||LA45_0==STRING||LA45_0==TRUE||LA45_0==VARIABLE||LA45_0==113||(LA45_0 >= 119 && LA45_0 <= 120)) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// R5RS.g3:277:5: command
					{
					pushFollow(FOLLOW_command_in_doCommands1909);
					command170=command();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_command.add(command170.getTree());
					}
					break;

				default :
					break loop45;
				}
			}

			// AST REWRITE
			// elements: command
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 277:14: -> ^( DOCOMMANDS ( command )* )
			{
				// R5RS.g3:277:17: ^( DOCOMMANDS ( command )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOCOMMANDS, "DOCOMMANDS"), root_1);
				// R5RS.g3:277:30: ( command )*
				while ( stream_command.hasNext() ) {
					adaptor.addChild(root_1, stream_command.nextTree());
				}
				stream_command.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doCommands"


	public static class condClause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condClause"
	// R5RS.g3:280:1: condClause : '(' test ( condrealize )? ')' -> ^( CONDCLAUSE test ( condrealize )? ) ;
	public final R5RSParser.condClause_return condClause() throws RecognitionException {
		R5RSParser.condClause_return retval = new R5RSParser.condClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal171=null;
		Token char_literal174=null;
		ParserRuleReturnScope test172 =null;
		ParserRuleReturnScope condrealize173 =null;

		Object char_literal171_tree=null;
		Object char_literal174_tree=null;
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleSubtreeStream stream_test=new RewriteRuleSubtreeStream(adaptor,"rule test");
		RewriteRuleSubtreeStream stream_condrealize=new RewriteRuleSubtreeStream(adaptor,"rule condrealize");

		try {
			// R5RS.g3:281:3: ( '(' test ( condrealize )? ')' -> ^( CONDCLAUSE test ( condrealize )? ) )
			// R5RS.g3:281:6: '(' test ( condrealize )? ')'
			{
			char_literal171=(Token)match(input,113,FOLLOW_113_in_condClause1933); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_113.add(char_literal171);

			pushFollow(FOLLOW_test_in_condClause1935);
			test172=test();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_test.add(test172.getTree());
			// R5RS.g3:281:15: ( condrealize )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==ARROW||LA46_0==CHARACTER||LA46_0==ELLIPSIS||LA46_0==FALSE||(LA46_0 >= NUM_10 && LA46_0 <= NUM_8)||LA46_0==STRING||LA46_0==TRUE||LA46_0==VARIABLE||LA46_0==113||(LA46_0 >= 119 && LA46_0 <= 120)) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// R5RS.g3:281:15: condrealize
					{
					pushFollow(FOLLOW_condrealize_in_condClause1937);
					condrealize173=condrealize();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_condrealize.add(condrealize173.getTree());
					}
					break;

			}

			char_literal174=(Token)match(input,115,FOLLOW_115_in_condClause1940); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_115.add(char_literal174);

			// AST REWRITE
			// elements: test, condrealize
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 281:32: -> ^( CONDCLAUSE test ( condrealize )? )
			{
				// R5RS.g3:281:35: ^( CONDCLAUSE test ( condrealize )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDCLAUSE, "CONDCLAUSE"), root_1);
				adaptor.addChild(root_1, stream_test.nextTree());
				// R5RS.g3:281:53: ( condrealize )?
				if ( stream_condrealize.hasNext() ) {
					adaptor.addChild(root_1, stream_condrealize.nextTree());
				}
				stream_condrealize.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condClause"


	public static class elseClause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elseClause"
	// R5RS.g3:284:1: elseClause : ELSE ^ sequence ;
	public final R5RSParser.elseClause_return elseClause() throws RecognitionException {
		R5RSParser.elseClause_return retval = new R5RSParser.elseClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSE175=null;
		ParserRuleReturnScope sequence176 =null;

		Object ELSE175_tree=null;

		try {
			// R5RS.g3:285:3: ( ELSE ^ sequence )
			// R5RS.g3:285:5: ELSE ^ sequence
			{
			root_0 = (Object)adaptor.nil();


			ELSE175=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseClause1964); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ELSE175_tree = (Object)adaptor.create(ELSE175);
			root_0 = (Object)adaptor.becomeRoot(ELSE175_tree, root_0);
			}

			pushFollow(FOLLOW_sequence_in_elseClause1967);
			sequence176=sequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence176.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elseClause"


	public static class condrealize_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condrealize"
	// R5RS.g3:288:1: condrealize : ( sequence | ARROW ^ recipient );
	public final R5RSParser.condrealize_return condrealize() throws RecognitionException {
		R5RSParser.condrealize_return retval = new R5RSParser.condrealize_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ARROW178=null;
		ParserRuleReturnScope sequence177 =null;
		ParserRuleReturnScope recipient179 =null;

		Object ARROW178_tree=null;

		try {
			// R5RS.g3:289:3: ( sequence | ARROW ^ recipient )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==CHARACTER||LA47_0==ELLIPSIS||LA47_0==FALSE||(LA47_0 >= NUM_10 && LA47_0 <= NUM_8)||LA47_0==STRING||LA47_0==TRUE||LA47_0==VARIABLE||LA47_0==113||(LA47_0 >= 119 && LA47_0 <= 120)) ) {
				alt47=1;
			}
			else if ( (LA47_0==ARROW) ) {
				alt47=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// R5RS.g3:289:5: sequence
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sequence_in_condrealize1980);
					sequence177=sequence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence177.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:290:5: ARROW ^ recipient
					{
					root_0 = (Object)adaptor.nil();


					ARROW178=(Token)match(input,ARROW,FOLLOW_ARROW_in_condrealize1986); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ARROW178_tree = (Object)adaptor.create(ARROW178);
					root_0 = (Object)adaptor.becomeRoot(ARROW178_tree, root_0);
					}

					pushFollow(FOLLOW_recipient_in_condrealize1989);
					recipient179=recipient();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recipient179.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condrealize"


	public static class recipient_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "recipient"
	// R5RS.g3:293:1: recipient : expression ;
	public final R5RSParser.recipient_return recipient() throws RecognitionException {
		R5RSParser.recipient_return retval = new R5RSParser.recipient_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression180 =null;


		try {
			// R5RS.g3:294:3: ( expression )
			// R5RS.g3:294:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_recipient2003);
			expression180=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression180.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recipient"


	public static class caseClause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caseClause"
	// R5RS.g3:297:1: caseClause : '(' '(' ( datum )* ')' sequence ')' -> ^( CASECLAUSE ( datum )* sequence ) ;
	public final R5RSParser.caseClause_return caseClause() throws RecognitionException {
		R5RSParser.caseClause_return retval = new R5RSParser.caseClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal181=null;
		Token char_literal182=null;
		Token char_literal184=null;
		Token char_literal186=null;
		ParserRuleReturnScope datum183 =null;
		ParserRuleReturnScope sequence185 =null;

		Object char_literal181_tree=null;
		Object char_literal182_tree=null;
		Object char_literal184_tree=null;
		Object char_literal186_tree=null;
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleSubtreeStream stream_datum=new RewriteRuleSubtreeStream(adaptor,"rule datum");
		RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");

		try {
			// R5RS.g3:298:3: ( '(' '(' ( datum )* ')' sequence ')' -> ^( CASECLAUSE ( datum )* sequence ) )
			// R5RS.g3:298:6: '(' '(' ( datum )* ')' sequence ')'
			{
			char_literal181=(Token)match(input,113,FOLLOW_113_in_caseClause2017); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_113.add(char_literal181);

			char_literal182=(Token)match(input,113,FOLLOW_113_in_caseClause2019); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_113.add(char_literal182);

			// R5RS.g3:298:14: ( datum )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( ((LA48_0 >= AND && LA48_0 <= BEGIN)||LA48_0==CASE||LA48_0==CHARACTER||LA48_0==COND||LA48_0==DEFINE||LA48_0==DELAY||LA48_0==DO||(LA48_0 >= ELLIPSIS && LA48_0 <= ELSE)||LA48_0==FALSE||LA48_0==IF||(LA48_0 >= LAMBDA && LA48_0 <= LETREC)||LA48_0==LETSTAR||(LA48_0 >= NUM_10 && LA48_0 <= OR)||LA48_0==QUASIQUOTE||LA48_0==QUOTE||LA48_0==SET||LA48_0==STRING||LA48_0==TRUE||(LA48_0 >= UNQUOTE && LA48_0 <= UNQUOTE_SPLICING)||LA48_0==VARIABLE||(LA48_0 >= 112 && LA48_0 <= 113)||(LA48_0 >= 116 && LA48_0 <= 117)||(LA48_0 >= 119 && LA48_0 <= 120)) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// R5RS.g3:298:14: datum
					{
					pushFollow(FOLLOW_datum_in_caseClause2021);
					datum183=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_datum.add(datum183.getTree());
					}
					break;

				default :
					break loop48;
				}
			}

			char_literal184=(Token)match(input,115,FOLLOW_115_in_caseClause2024); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_115.add(char_literal184);

			pushFollow(FOLLOW_sequence_in_caseClause2026);
			sequence185=sequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sequence.add(sequence185.getTree());
			char_literal186=(Token)match(input,115,FOLLOW_115_in_caseClause2028); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_115.add(char_literal186);

			// AST REWRITE
			// elements: datum, sequence
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 298:38: -> ^( CASECLAUSE ( datum )* sequence )
			{
				// R5RS.g3:298:41: ^( CASECLAUSE ( datum )* sequence )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CASECLAUSE, "CASECLAUSE"), root_1);
				// R5RS.g3:298:54: ( datum )*
				while ( stream_datum.hasNext() ) {
					adaptor.addChild(root_1, stream_datum.nextTree());
				}
				stream_datum.reset();

				adaptor.addChild(root_1, stream_sequence.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseClause"


	public static class localBinding_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "localBinding"
	// R5RS.g3:302:1: localBinding : localBindingDefinition -> ^( LOCALBINDING localBindingDefinition ) ;
	public final R5RSParser.localBinding_return localBinding() throws RecognitionException {
		R5RSParser.localBinding_return retval = new R5RSParser.localBinding_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope localBindingDefinition187 =null;

		RewriteRuleSubtreeStream stream_localBindingDefinition=new RewriteRuleSubtreeStream(adaptor,"rule localBindingDefinition");

		try {
			// R5RS.g3:303:3: ( localBindingDefinition -> ^( LOCALBINDING localBindingDefinition ) )
			// R5RS.g3:303:5: localBindingDefinition
			{
			pushFollow(FOLLOW_localBindingDefinition_in_localBinding2053);
			localBindingDefinition187=localBindingDefinition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_localBindingDefinition.add(localBindingDefinition187.getTree());
			// AST REWRITE
			// elements: localBindingDefinition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 303:28: -> ^( LOCALBINDING localBindingDefinition )
			{
				// R5RS.g3:303:31: ^( LOCALBINDING localBindingDefinition )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOCALBINDING, "LOCALBINDING"), root_1);
				adaptor.addChild(root_1, stream_localBindingDefinition.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "localBinding"


	public static class localBindingDefinition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "localBindingDefinition"
	// R5RS.g3:306:1: localBindingDefinition : ( LET ^ ( variable )? '(' ! ( bindingSpec )* ')' ! body | LETSTAR ^ '(' ! ( bindingSpec )* ')' ! body | LETREC ^ '(' ! ( bindingSpec )* ')' ! body );
	public final R5RSParser.localBindingDefinition_return localBindingDefinition() throws RecognitionException {
		R5RSParser.localBindingDefinition_return retval = new R5RSParser.localBindingDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LET188=null;
		Token char_literal190=null;
		Token char_literal192=null;
		Token LETSTAR194=null;
		Token char_literal195=null;
		Token char_literal197=null;
		Token LETREC199=null;
		Token char_literal200=null;
		Token char_literal202=null;
		ParserRuleReturnScope variable189 =null;
		ParserRuleReturnScope bindingSpec191 =null;
		ParserRuleReturnScope body193 =null;
		ParserRuleReturnScope bindingSpec196 =null;
		ParserRuleReturnScope body198 =null;
		ParserRuleReturnScope bindingSpec201 =null;
		ParserRuleReturnScope body203 =null;

		Object LET188_tree=null;
		Object char_literal190_tree=null;
		Object char_literal192_tree=null;
		Object LETSTAR194_tree=null;
		Object char_literal195_tree=null;
		Object char_literal197_tree=null;
		Object LETREC199_tree=null;
		Object char_literal200_tree=null;
		Object char_literal202_tree=null;

		try {
			// R5RS.g3:307:3: ( LET ^ ( variable )? '(' ! ( bindingSpec )* ')' ! body | LETSTAR ^ '(' ! ( bindingSpec )* ')' ! body | LETREC ^ '(' ! ( bindingSpec )* ')' ! body )
			int alt53=3;
			switch ( input.LA(1) ) {
			case LET:
				{
				alt53=1;
				}
				break;
			case LETSTAR:
				{
				alt53=2;
				}
				break;
			case LETREC:
				{
				alt53=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// R5RS.g3:307:5: LET ^ ( variable )? '(' ! ( bindingSpec )* ')' ! body
					{
					root_0 = (Object)adaptor.nil();


					LET188=(Token)match(input,LET,FOLLOW_LET_in_localBindingDefinition2074); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LET188_tree = (Object)adaptor.create(LET188);
					root_0 = (Object)adaptor.becomeRoot(LET188_tree, root_0);
					}

					// R5RS.g3:307:10: ( variable )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==ELLIPSIS||LA49_0==VARIABLE) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// R5RS.g3:307:10: variable
							{
							pushFollow(FOLLOW_variable_in_localBindingDefinition2077);
							variable189=variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variable189.getTree());

							}
							break;

					}

					char_literal190=(Token)match(input,113,FOLLOW_113_in_localBindingDefinition2080); if (state.failed) return retval;
					// R5RS.g3:307:25: ( bindingSpec )*
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==113) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// R5RS.g3:307:25: bindingSpec
							{
							pushFollow(FOLLOW_bindingSpec_in_localBindingDefinition2083);
							bindingSpec191=bindingSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, bindingSpec191.getTree());

							}
							break;

						default :
							break loop50;
						}
					}

					char_literal192=(Token)match(input,115,FOLLOW_115_in_localBindingDefinition2086); if (state.failed) return retval;
					pushFollow(FOLLOW_body_in_localBindingDefinition2089);
					body193=body();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, body193.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:308:5: LETSTAR ^ '(' ! ( bindingSpec )* ')' ! body
					{
					root_0 = (Object)adaptor.nil();


					LETSTAR194=(Token)match(input,LETSTAR,FOLLOW_LETSTAR_in_localBindingDefinition2095); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LETSTAR194_tree = (Object)adaptor.create(LETSTAR194);
					root_0 = (Object)adaptor.becomeRoot(LETSTAR194_tree, root_0);
					}

					char_literal195=(Token)match(input,113,FOLLOW_113_in_localBindingDefinition2098); if (state.failed) return retval;
					// R5RS.g3:308:19: ( bindingSpec )*
					loop51:
					while (true) {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==113) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// R5RS.g3:308:19: bindingSpec
							{
							pushFollow(FOLLOW_bindingSpec_in_localBindingDefinition2101);
							bindingSpec196=bindingSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, bindingSpec196.getTree());

							}
							break;

						default :
							break loop51;
						}
					}

					char_literal197=(Token)match(input,115,FOLLOW_115_in_localBindingDefinition2104); if (state.failed) return retval;
					pushFollow(FOLLOW_body_in_localBindingDefinition2107);
					body198=body();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, body198.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:309:5: LETREC ^ '(' ! ( bindingSpec )* ')' ! body
					{
					root_0 = (Object)adaptor.nil();


					LETREC199=(Token)match(input,LETREC,FOLLOW_LETREC_in_localBindingDefinition2113); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LETREC199_tree = (Object)adaptor.create(LETREC199);
					root_0 = (Object)adaptor.becomeRoot(LETREC199_tree, root_0);
					}

					char_literal200=(Token)match(input,113,FOLLOW_113_in_localBindingDefinition2116); if (state.failed) return retval;
					// R5RS.g3:309:18: ( bindingSpec )*
					loop52:
					while (true) {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( (LA52_0==113) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// R5RS.g3:309:18: bindingSpec
							{
							pushFollow(FOLLOW_bindingSpec_in_localBindingDefinition2119);
							bindingSpec201=bindingSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, bindingSpec201.getTree());

							}
							break;

						default :
							break loop52;
						}
					}

					char_literal202=(Token)match(input,115,FOLLOW_115_in_localBindingDefinition2122); if (state.failed) return retval;
					pushFollow(FOLLOW_body_in_localBindingDefinition2125);
					body203=body();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, body203.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "localBindingDefinition"


	public static class bindingSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bindingSpec"
	// R5RS.g3:312:1: bindingSpec : '(' variable expression ')' -> ^( BINDINGSPEC variable expression ) ;
	public final R5RSParser.bindingSpec_return bindingSpec() throws RecognitionException {
		R5RSParser.bindingSpec_return retval = new R5RSParser.bindingSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal204=null;
		Token char_literal207=null;
		ParserRuleReturnScope variable205 =null;
		ParserRuleReturnScope expression206 =null;

		Object char_literal204_tree=null;
		Object char_literal207_tree=null;
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");

		try {
			// R5RS.g3:313:3: ( '(' variable expression ')' -> ^( BINDINGSPEC variable expression ) )
			// R5RS.g3:313:6: '(' variable expression ')'
			{
			char_literal204=(Token)match(input,113,FOLLOW_113_in_bindingSpec2139); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_113.add(char_literal204);

			pushFollow(FOLLOW_variable_in_bindingSpec2141);
			variable205=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variable.add(variable205.getTree());
			pushFollow(FOLLOW_expression_in_bindingSpec2143);
			expression206=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression206.getTree());
			char_literal207=(Token)match(input,115,FOLLOW_115_in_bindingSpec2145); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_115.add(char_literal207);

			// AST REWRITE
			// elements: variable, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 313:34: -> ^( BINDINGSPEC variable expression )
			{
				// R5RS.g3:313:37: ^( BINDINGSPEC variable expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BINDINGSPEC, "BINDINGSPEC"), root_1);
				adaptor.addChild(root_1, stream_variable.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bindingSpec"


	public static class iterationSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "iterationSpec"
	// R5RS.g3:316:1: iterationSpec : '(' variable init ( step )? ')' -> ^( ITERATIONSPEC variable init ( step )? ) ;
	public final R5RSParser.iterationSpec_return iterationSpec() throws RecognitionException {
		R5RSParser.iterationSpec_return retval = new R5RSParser.iterationSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal208=null;
		Token char_literal212=null;
		ParserRuleReturnScope variable209 =null;
		ParserRuleReturnScope init210 =null;
		ParserRuleReturnScope step211 =null;

		Object char_literal208_tree=null;
		Object char_literal212_tree=null;
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleSubtreeStream stream_init=new RewriteRuleSubtreeStream(adaptor,"rule init");
		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
		RewriteRuleSubtreeStream stream_step=new RewriteRuleSubtreeStream(adaptor,"rule step");

		try {
			// R5RS.g3:317:3: ( '(' variable init ( step )? ')' -> ^( ITERATIONSPEC variable init ( step )? ) )
			// R5RS.g3:317:6: '(' variable init ( step )? ')'
			{
			char_literal208=(Token)match(input,113,FOLLOW_113_in_iterationSpec2169); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_113.add(char_literal208);

			pushFollow(FOLLOW_variable_in_iterationSpec2171);
			variable209=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variable.add(variable209.getTree());
			pushFollow(FOLLOW_init_in_iterationSpec2173);
			init210=init();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_init.add(init210.getTree());
			// R5RS.g3:317:24: ( step )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==CHARACTER||LA54_0==ELLIPSIS||LA54_0==FALSE||(LA54_0 >= NUM_10 && LA54_0 <= NUM_8)||LA54_0==STRING||LA54_0==TRUE||LA54_0==VARIABLE||LA54_0==113||(LA54_0 >= 119 && LA54_0 <= 120)) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// R5RS.g3:317:24: step
					{
					pushFollow(FOLLOW_step_in_iterationSpec2175);
					step211=step();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_step.add(step211.getTree());
					}
					break;

			}

			char_literal212=(Token)match(input,115,FOLLOW_115_in_iterationSpec2178); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_115.add(char_literal212);

			// AST REWRITE
			// elements: variable, init, step
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 317:34: -> ^( ITERATIONSPEC variable init ( step )? )
			{
				// R5RS.g3:317:37: ^( ITERATIONSPEC variable init ( step )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITERATIONSPEC, "ITERATIONSPEC"), root_1);
				adaptor.addChild(root_1, stream_variable.nextTree());
				adaptor.addChild(root_1, stream_init.nextTree());
				// R5RS.g3:317:67: ( step )?
				if ( stream_step.hasNext() ) {
					adaptor.addChild(root_1, stream_step.nextTree());
				}
				stream_step.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "iterationSpec"


	public static class init_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "init"
	// R5RS.g3:320:1: init : expression ;
	public final R5RSParser.init_return init() throws RecognitionException {
		R5RSParser.init_return retval = new R5RSParser.init_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression213 =null;


		try {
			// R5RS.g3:321:3: ( expression )
			// R5RS.g3:321:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_init2205);
			expression213=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression213.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "init"


	public static class step_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "step"
	// R5RS.g3:324:1: step : expression ;
	public final R5RSParser.step_return step() throws RecognitionException {
		R5RSParser.step_return retval = new R5RSParser.step_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression214 =null;


		try {
			// R5RS.g3:325:3: ( expression )
			// R5RS.g3:325:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_step2219);
			expression214=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression214.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "step"


	public static class doResult_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "doResult"
	// R5RS.g3:328:1: doResult : sequence -> ^( DORESULT sequence ) ;
	public final R5RSParser.doResult_return doResult() throws RecognitionException {
		R5RSParser.doResult_return retval = new R5RSParser.doResult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope sequence215 =null;

		RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");

		try {
			// R5RS.g3:329:3: ( sequence -> ^( DORESULT sequence ) )
			// R5RS.g3:329:6: sequence
			{
			pushFollow(FOLLOW_sequence_in_doResult2233);
			sequence215=sequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sequence.add(sequence215.getTree());
			// AST REWRITE
			// elements: sequence
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 329:15: -> ^( DORESULT sequence )
			{
				// R5RS.g3:329:18: ^( DORESULT sequence )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DORESULT, "DORESULT"), root_1);
				adaptor.addChild(root_1, stream_sequence.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doResult"


	public static class procedureCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedureCall"
	// R5RS.g3:332:1: procedureCall : '(' operator ( operand )* ')' -> ^( PROCEDURECALL operator ( operand )* ) ;
	public final R5RSParser.procedureCall_return procedureCall() throws RecognitionException {
		R5RSParser.procedureCall_return retval = new R5RSParser.procedureCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal216=null;
		Token char_literal219=null;
		ParserRuleReturnScope operator217 =null;
		ParserRuleReturnScope operand218 =null;

		Object char_literal216_tree=null;
		Object char_literal219_tree=null;
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// R5RS.g3:333:3: ( '(' operator ( operand )* ')' -> ^( PROCEDURECALL operator ( operand )* ) )
			// R5RS.g3:333:6: '(' operator ( operand )* ')'
			{
			char_literal216=(Token)match(input,113,FOLLOW_113_in_procedureCall2255); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_113.add(char_literal216);

			pushFollow(FOLLOW_operator_in_procedureCall2257);
			operator217=operator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operator.add(operator217.getTree());
			// R5RS.g3:333:19: ( operand )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==CHARACTER||LA55_0==ELLIPSIS||LA55_0==FALSE||(LA55_0 >= NUM_10 && LA55_0 <= NUM_8)||LA55_0==STRING||LA55_0==TRUE||LA55_0==VARIABLE||LA55_0==113||(LA55_0 >= 119 && LA55_0 <= 120)) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// R5RS.g3:333:19: operand
					{
					pushFollow(FOLLOW_operand_in_procedureCall2259);
					operand218=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(operand218.getTree());
					}
					break;

				default :
					break loop55;
				}
			}

			char_literal219=(Token)match(input,115,FOLLOW_115_in_procedureCall2262); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_115.add(char_literal219);

			// AST REWRITE
			// elements: operand, operator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 333:32: -> ^( PROCEDURECALL operator ( operand )* )
			{
				// R5RS.g3:333:35: ^( PROCEDURECALL operator ( operand )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_1);
				adaptor.addChild(root_1, stream_operator.nextTree());
				// R5RS.g3:333:60: ( operand )*
				while ( stream_operand.hasNext() ) {
					adaptor.addChild(root_1, stream_operand.nextTree());
				}
				stream_operand.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedureCall"


	public static class operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operator"
	// R5RS.g3:336:1: operator : expression ;
	public final R5RSParser.operator_return operator() throws RecognitionException {
		R5RSParser.operator_return retval = new R5RSParser.operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression220 =null;


		try {
			// R5RS.g3:337:3: ( expression )
			// R5RS.g3:337:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_operator2287);
			expression220=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression220.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operator"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// R5RS.g3:340:1: operand : expression ;
	public final R5RSParser.operand_return operand() throws RecognitionException {
		R5RSParser.operand_return retval = new R5RSParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression221 =null;


		try {
			// R5RS.g3:341:3: ( expression )
			// R5RS.g3:341:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_operand2301);
			expression221=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression221.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class macroUse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "macroUse"
	// R5RS.g3:344:1: macroUse : '(' keyword ( datum )* ')' ;
	public final R5RSParser.macroUse_return macroUse() throws RecognitionException {
		R5RSParser.macroUse_return retval = new R5RSParser.macroUse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal222=null;
		Token char_literal225=null;
		ParserRuleReturnScope keyword223 =null;
		ParserRuleReturnScope datum224 =null;

		Object char_literal222_tree=null;
		Object char_literal225_tree=null;

		try {
			// R5RS.g3:345:3: ( '(' keyword ( datum )* ')' )
			// R5RS.g3:345:6: '(' keyword ( datum )* ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal222=(Token)match(input,113,FOLLOW_113_in_macroUse2315); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal222_tree = (Object)adaptor.create(char_literal222);
			adaptor.addChild(root_0, char_literal222_tree);
			}

			pushFollow(FOLLOW_keyword_in_macroUse2317);
			keyword223=keyword();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword223.getTree());

			// R5RS.g3:345:18: ( datum )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( ((LA56_0 >= AND && LA56_0 <= BEGIN)||LA56_0==CASE||LA56_0==CHARACTER||LA56_0==COND||LA56_0==DEFINE||LA56_0==DELAY||LA56_0==DO||(LA56_0 >= ELLIPSIS && LA56_0 <= ELSE)||LA56_0==FALSE||LA56_0==IF||(LA56_0 >= LAMBDA && LA56_0 <= LETREC)||LA56_0==LETSTAR||(LA56_0 >= NUM_10 && LA56_0 <= OR)||LA56_0==QUASIQUOTE||LA56_0==QUOTE||LA56_0==SET||LA56_0==STRING||LA56_0==TRUE||(LA56_0 >= UNQUOTE && LA56_0 <= UNQUOTE_SPLICING)||LA56_0==VARIABLE||(LA56_0 >= 112 && LA56_0 <= 113)||(LA56_0 >= 116 && LA56_0 <= 117)||(LA56_0 >= 119 && LA56_0 <= 120)) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// R5RS.g3:345:18: datum
					{
					pushFollow(FOLLOW_datum_in_macroUse2319);
					datum224=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum224.getTree());

					}
					break;

				default :
					break loop56;
				}
			}

			char_literal225=(Token)match(input,115,FOLLOW_115_in_macroUse2322); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal225_tree = (Object)adaptor.create(char_literal225);
			adaptor.addChild(root_0, char_literal225_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "macroUse"


	public static class macroBlock_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "macroBlock"
	// R5RS.g3:348:1: macroBlock : '(' ( LET_SYNTAX | LETREC_SYNTAX ) '(' ( syntaxSpec )* ')' body ')' ;
	public final R5RSParser.macroBlock_return macroBlock() throws RecognitionException {
		R5RSParser.macroBlock_return retval = new R5RSParser.macroBlock_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal226=null;
		Token set227=null;
		Token char_literal228=null;
		Token char_literal230=null;
		Token char_literal232=null;
		ParserRuleReturnScope syntaxSpec229 =null;
		ParserRuleReturnScope body231 =null;

		Object char_literal226_tree=null;
		Object set227_tree=null;
		Object char_literal228_tree=null;
		Object char_literal230_tree=null;
		Object char_literal232_tree=null;

		try {
			// R5RS.g3:349:3: ( '(' ( LET_SYNTAX | LETREC_SYNTAX ) '(' ( syntaxSpec )* ')' body ')' )
			// R5RS.g3:349:6: '(' ( LET_SYNTAX | LETREC_SYNTAX ) '(' ( syntaxSpec )* ')' body ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal226=(Token)match(input,113,FOLLOW_113_in_macroBlock2336); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal226_tree = (Object)adaptor.create(char_literal226);
			adaptor.addChild(root_0, char_literal226_tree);
			}

			set227=input.LT(1);
			if ( input.LA(1)==LETREC_SYNTAX||input.LA(1)==LET_SYNTAX ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set227));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			char_literal228=(Token)match(input,113,FOLLOW_113_in_macroBlock2346); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal228_tree = (Object)adaptor.create(char_literal228);
			adaptor.addChild(root_0, char_literal228_tree);
			}

			// R5RS.g3:349:43: ( syntaxSpec )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==113) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// R5RS.g3:349:43: syntaxSpec
					{
					pushFollow(FOLLOW_syntaxSpec_in_macroBlock2348);
					syntaxSpec229=syntaxSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntaxSpec229.getTree());

					}
					break;

				default :
					break loop57;
				}
			}

			char_literal230=(Token)match(input,115,FOLLOW_115_in_macroBlock2351); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal230_tree = (Object)adaptor.create(char_literal230);
			adaptor.addChild(root_0, char_literal230_tree);
			}

			pushFollow(FOLLOW_body_in_macroBlock2353);
			body231=body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, body231.getTree());

			char_literal232=(Token)match(input,115,FOLLOW_115_in_macroBlock2355); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal232_tree = (Object)adaptor.create(char_literal232);
			adaptor.addChild(root_0, char_literal232_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "macroBlock"


	public static class syntaxSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "syntaxSpec"
	// R5RS.g3:352:1: syntaxSpec : '(' keyword transformerSpec ')' ;
	public final R5RSParser.syntaxSpec_return syntaxSpec() throws RecognitionException {
		R5RSParser.syntaxSpec_return retval = new R5RSParser.syntaxSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal233=null;
		Token char_literal236=null;
		ParserRuleReturnScope keyword234 =null;
		ParserRuleReturnScope transformerSpec235 =null;

		Object char_literal233_tree=null;
		Object char_literal236_tree=null;

		try {
			// R5RS.g3:353:3: ( '(' keyword transformerSpec ')' )
			// R5RS.g3:353:6: '(' keyword transformerSpec ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal233=(Token)match(input,113,FOLLOW_113_in_syntaxSpec2369); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal233_tree = (Object)adaptor.create(char_literal233);
			adaptor.addChild(root_0, char_literal233_tree);
			}

			pushFollow(FOLLOW_keyword_in_syntaxSpec2371);
			keyword234=keyword();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword234.getTree());

			pushFollow(FOLLOW_transformerSpec_in_syntaxSpec2373);
			transformerSpec235=transformerSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, transformerSpec235.getTree());

			char_literal236=(Token)match(input,115,FOLLOW_115_in_syntaxSpec2375); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal236_tree = (Object)adaptor.create(char_literal236);
			adaptor.addChild(root_0, char_literal236_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "syntaxSpec"


	public static class body_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "body"
	// R5RS.g3:356:1: body : ( ( definition )=> definition )* sequence -> ^( BODY ( definition )* sequence ) ;
	public final R5RSParser.body_return body() throws RecognitionException {
		R5RSParser.body_return retval = new R5RSParser.body_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope definition237 =null;
		ParserRuleReturnScope sequence238 =null;

		RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// R5RS.g3:357:3: ( ( ( definition )=> definition )* sequence -> ^( BODY ( definition )* sequence ) )
			// R5RS.g3:357:5: ( ( definition )=> definition )* sequence
			{
			// R5RS.g3:357:5: ( ( definition )=> definition )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==113) ) {
					int LA58_4 = input.LA(2);
					if ( (synpred16_R5RS()) ) {
						alt58=1;
					}

				}

				switch (alt58) {
				case 1 :
					// R5RS.g3:357:6: ( definition )=> definition
					{
					pushFollow(FOLLOW_definition_in_body2394);
					definition237=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_definition.add(definition237.getTree());
					}
					break;

				default :
					break loop58;
				}
			}

			pushFollow(FOLLOW_sequence_in_body2398);
			sequence238=sequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sequence.add(sequence238.getTree());
			// AST REWRITE
			// elements: definition, sequence
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 357:43: -> ^( BODY ( definition )* sequence )
			{
				// R5RS.g3:357:46: ^( BODY ( definition )* sequence )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);
				// R5RS.g3:357:53: ( definition )*
				while ( stream_definition.hasNext() ) {
					adaptor.addChild(root_1, stream_definition.nextTree());
				}
				stream_definition.reset();

				adaptor.addChild(root_1, stream_sequence.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "body"


	public static class sequence_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sequence"
	// R5RS.g3:360:1: sequence : ( expression )+ -> ^( SEQUENCE ( expression )+ ) ;
	public final R5RSParser.sequence_return sequence() throws RecognitionException {
		R5RSParser.sequence_return retval = new R5RSParser.sequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression239 =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// R5RS.g3:361:3: ( ( expression )+ -> ^( SEQUENCE ( expression )+ ) )
			// R5RS.g3:361:6: ( expression )+
			{
			// R5RS.g3:361:6: ( expression )+
			int cnt59=0;
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==CHARACTER||LA59_0==ELLIPSIS||LA59_0==FALSE||(LA59_0 >= NUM_10 && LA59_0 <= NUM_8)||LA59_0==STRING||LA59_0==TRUE||LA59_0==VARIABLE||LA59_0==113||(LA59_0 >= 119 && LA59_0 <= 120)) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// R5RS.g3:361:6: expression
					{
					pushFollow(FOLLOW_expression_in_sequence2423);
					expression239=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression239.getTree());
					}
					break;

				default :
					if ( cnt59 >= 1 ) break loop59;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(59, input);
					throw eee;
				}
				cnt59++;
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 361:18: -> ^( SEQUENCE ( expression )+ )
			{
				// R5RS.g3:361:21: ^( SEQUENCE ( expression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sequence"


	public static class datum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "datum"
	// R5RS.g3:364:1: datum : ( simpleDatum | compoundDatum );
	public final R5RSParser.datum_return datum() throws RecognitionException {
		R5RSParser.datum_return retval = new R5RSParser.datum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simpleDatum240 =null;
		ParserRuleReturnScope compoundDatum241 =null;


		try {
			// R5RS.g3:365:3: ( simpleDatum | compoundDatum )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( ((LA60_0 >= AND && LA60_0 <= BEGIN)||LA60_0==CASE||LA60_0==CHARACTER||LA60_0==COND||LA60_0==DEFINE||LA60_0==DELAY||LA60_0==DO||(LA60_0 >= ELLIPSIS && LA60_0 <= ELSE)||LA60_0==FALSE||LA60_0==IF||(LA60_0 >= LAMBDA && LA60_0 <= LETREC)||LA60_0==LETSTAR||(LA60_0 >= NUM_10 && LA60_0 <= OR)||LA60_0==QUASIQUOTE||LA60_0==QUOTE||LA60_0==SET||LA60_0==STRING||LA60_0==TRUE||(LA60_0 >= UNQUOTE && LA60_0 <= UNQUOTE_SPLICING)||LA60_0==VARIABLE) ) {
				alt60=1;
			}
			else if ( ((LA60_0 >= 112 && LA60_0 <= 113)||(LA60_0 >= 116 && LA60_0 <= 117)||(LA60_0 >= 119 && LA60_0 <= 120)) ) {
				alt60=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}

			switch (alt60) {
				case 1 :
					// R5RS.g3:365:6: simpleDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleDatum_in_datum2447);
					simpleDatum240=simpleDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDatum240.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:366:6: compoundDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_compoundDatum_in_datum2454);
					compoundDatum241=compoundDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compoundDatum241.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "datum"


	public static class simpleDatum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simpleDatum"
	// R5RS.g3:369:1: simpleDatum : ( selfEvaluating | identifier );
	public final R5RSParser.simpleDatum_return simpleDatum() throws RecognitionException {
		R5RSParser.simpleDatum_return retval = new R5RSParser.simpleDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope selfEvaluating242 =null;
		ParserRuleReturnScope identifier243 =null;


		try {
			// R5RS.g3:370:3: ( selfEvaluating | identifier )
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==CHARACTER||LA61_0==FALSE||(LA61_0 >= NUM_10 && LA61_0 <= NUM_8)||LA61_0==STRING||LA61_0==TRUE) ) {
				alt61=1;
			}
			else if ( ((LA61_0 >= AND && LA61_0 <= BEGIN)||LA61_0==CASE||LA61_0==COND||LA61_0==DEFINE||LA61_0==DELAY||LA61_0==DO||(LA61_0 >= ELLIPSIS && LA61_0 <= ELSE)||LA61_0==IF||(LA61_0 >= LAMBDA && LA61_0 <= LETREC)||LA61_0==LETSTAR||LA61_0==OR||LA61_0==QUASIQUOTE||LA61_0==QUOTE||LA61_0==SET||(LA61_0 >= UNQUOTE && LA61_0 <= UNQUOTE_SPLICING)||LA61_0==VARIABLE) ) {
				alt61=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}

			switch (alt61) {
				case 1 :
					// R5RS.g3:370:6: selfEvaluating
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_selfEvaluating_in_simpleDatum2468);
					selfEvaluating242=selfEvaluating();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, selfEvaluating242.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:371:6: identifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_simpleDatum2475);
					identifier243=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier243.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleDatum"


	public static class compoundDatum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "compoundDatum"
	// R5RS.g3:374:1: compoundDatum : ( list -> ^( LIST list ) | vector -> ^( VECTOR vector ) );
	public final R5RSParser.compoundDatum_return compoundDatum() throws RecognitionException {
		R5RSParser.compoundDatum_return retval = new R5RSParser.compoundDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope list244 =null;
		ParserRuleReturnScope vector245 =null;

		RewriteRuleSubtreeStream stream_vector=new RewriteRuleSubtreeStream(adaptor,"rule vector");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// R5RS.g3:375:3: ( list -> ^( LIST list ) | vector -> ^( VECTOR vector ) )
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==113||(LA62_0 >= 116 && LA62_0 <= 117)||(LA62_0 >= 119 && LA62_0 <= 120)) ) {
				alt62=1;
			}
			else if ( (LA62_0==112) ) {
				alt62=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// R5RS.g3:375:6: list
					{
					pushFollow(FOLLOW_list_in_compoundDatum2489);
					list244=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_list.add(list244.getTree());
					// AST REWRITE
					// elements: list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 375:11: -> ^( LIST list )
					{
						// R5RS.g3:375:14: ^( LIST list )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// R5RS.g3:376:6: vector
					{
					pushFollow(FOLLOW_vector_in_compoundDatum2504);
					vector245=vector();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_vector.add(vector245.getTree());
					// AST REWRITE
					// elements: vector
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 376:13: -> ^( VECTOR vector )
					{
						// R5RS.g3:376:16: ^( VECTOR vector )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VECTOR, "VECTOR"), root_1);
						adaptor.addChild(root_1, stream_vector.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compoundDatum"


	public static class list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "list"
	// R5RS.g3:379:1: list : ( '(' ! ( ( datum )+ ( '.' datum )? )? ')' !| abbreviation -> ^( ABBREVIATION abbreviation ) );
	public final R5RSParser.list_return list() throws RecognitionException {
		R5RSParser.list_return retval = new R5RSParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal246=null;
		Token char_literal248=null;
		Token char_literal250=null;
		ParserRuleReturnScope datum247 =null;
		ParserRuleReturnScope datum249 =null;
		ParserRuleReturnScope abbreviation251 =null;

		Object char_literal246_tree=null;
		Object char_literal248_tree=null;
		Object char_literal250_tree=null;
		RewriteRuleSubtreeStream stream_abbreviation=new RewriteRuleSubtreeStream(adaptor,"rule abbreviation");

		try {
			// R5RS.g3:380:3: ( '(' ! ( ( datum )+ ( '.' datum )? )? ')' !| abbreviation -> ^( ABBREVIATION abbreviation ) )
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==113) ) {
				alt66=1;
			}
			else if ( ((LA66_0 >= 116 && LA66_0 <= 117)||(LA66_0 >= 119 && LA66_0 <= 120)) ) {
				alt66=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// R5RS.g3:380:6: '(' ! ( ( datum )+ ( '.' datum )? )? ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal246=(Token)match(input,113,FOLLOW_113_in_list2526); if (state.failed) return retval;
					// R5RS.g3:380:11: ( ( datum )+ ( '.' datum )? )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( ((LA65_0 >= AND && LA65_0 <= BEGIN)||LA65_0==CASE||LA65_0==CHARACTER||LA65_0==COND||LA65_0==DEFINE||LA65_0==DELAY||LA65_0==DO||(LA65_0 >= ELLIPSIS && LA65_0 <= ELSE)||LA65_0==FALSE||LA65_0==IF||(LA65_0 >= LAMBDA && LA65_0 <= LETREC)||LA65_0==LETSTAR||(LA65_0 >= NUM_10 && LA65_0 <= OR)||LA65_0==QUASIQUOTE||LA65_0==QUOTE||LA65_0==SET||LA65_0==STRING||LA65_0==TRUE||(LA65_0 >= UNQUOTE && LA65_0 <= UNQUOTE_SPLICING)||LA65_0==VARIABLE||(LA65_0 >= 112 && LA65_0 <= 113)||(LA65_0 >= 116 && LA65_0 <= 117)||(LA65_0 >= 119 && LA65_0 <= 120)) ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// R5RS.g3:380:12: ( datum )+ ( '.' datum )?
							{
							// R5RS.g3:380:12: ( datum )+
							int cnt63=0;
							loop63:
							while (true) {
								int alt63=2;
								int LA63_0 = input.LA(1);
								if ( ((LA63_0 >= AND && LA63_0 <= BEGIN)||LA63_0==CASE||LA63_0==CHARACTER||LA63_0==COND||LA63_0==DEFINE||LA63_0==DELAY||LA63_0==DO||(LA63_0 >= ELLIPSIS && LA63_0 <= ELSE)||LA63_0==FALSE||LA63_0==IF||(LA63_0 >= LAMBDA && LA63_0 <= LETREC)||LA63_0==LETSTAR||(LA63_0 >= NUM_10 && LA63_0 <= OR)||LA63_0==QUASIQUOTE||LA63_0==QUOTE||LA63_0==SET||LA63_0==STRING||LA63_0==TRUE||(LA63_0 >= UNQUOTE && LA63_0 <= UNQUOTE_SPLICING)||LA63_0==VARIABLE||(LA63_0 >= 112 && LA63_0 <= 113)||(LA63_0 >= 116 && LA63_0 <= 117)||(LA63_0 >= 119 && LA63_0 <= 120)) ) {
									alt63=1;
								}

								switch (alt63) {
								case 1 :
									// R5RS.g3:380:12: datum
									{
									pushFollow(FOLLOW_datum_in_list2530);
									datum247=datum();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, datum247.getTree());

									}
									break;

								default :
									if ( cnt63 >= 1 ) break loop63;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(63, input);
									throw eee;
								}
								cnt63++;
							}

							// R5RS.g3:380:19: ( '.' datum )?
							int alt64=2;
							int LA64_0 = input.LA(1);
							if ( (LA64_0==118) ) {
								alt64=1;
							}
							switch (alt64) {
								case 1 :
									// R5RS.g3:380:20: '.' datum
									{
									char_literal248=(Token)match(input,118,FOLLOW_118_in_list2534); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal248_tree = (Object)adaptor.create(char_literal248);
									adaptor.addChild(root_0, char_literal248_tree);
									}

									pushFollow(FOLLOW_datum_in_list2536);
									datum249=datum();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, datum249.getTree());

									}
									break;

							}

							}
							break;

					}

					char_literal250=(Token)match(input,115,FOLLOW_115_in_list2542); if (state.failed) return retval;
					}
					break;
				case 2 :
					// R5RS.g3:381:6: abbreviation
					{
					pushFollow(FOLLOW_abbreviation_in_list2550);
					abbreviation251=abbreviation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_abbreviation.add(abbreviation251.getTree());
					// AST REWRITE
					// elements: abbreviation
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 381:19: -> ^( ABBREVIATION abbreviation )
					{
						// R5RS.g3:381:22: ^( ABBREVIATION abbreviation )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ABBREVIATION, "ABBREVIATION"), root_1);
						adaptor.addChild(root_1, stream_abbreviation.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list"


	public static class abbreviation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "abbreviation"
	// R5RS.g3:384:1: abbreviation : abbrevPrefix datum ;
	public final R5RSParser.abbreviation_return abbreviation() throws RecognitionException {
		R5RSParser.abbreviation_return retval = new R5RSParser.abbreviation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope abbrevPrefix252 =null;
		ParserRuleReturnScope datum253 =null;


		try {
			// R5RS.g3:385:3: ( abbrevPrefix datum )
			// R5RS.g3:385:6: abbrevPrefix datum
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_abbrevPrefix_in_abbreviation2572);
			abbrevPrefix252=abbrevPrefix();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, abbrevPrefix252.getTree());

			pushFollow(FOLLOW_datum_in_abbreviation2574);
			datum253=datum();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, datum253.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "abbreviation"


	public static class abbrevPrefix_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "abbrevPrefix"
	// R5RS.g3:388:1: abbrevPrefix : ( '\\'' | '`' | ',@' | ',' );
	public final R5RSParser.abbrevPrefix_return abbrevPrefix() throws RecognitionException {
		R5RSParser.abbrevPrefix_return retval = new R5RSParser.abbrevPrefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set254=null;

		Object set254_tree=null;

		try {
			// R5RS.g3:389:3: ( '\\'' | '`' | ',@' | ',' )
			// R5RS.g3:
			{
			root_0 = (Object)adaptor.nil();


			set254=input.LT(1);
			if ( (input.LA(1) >= 116 && input.LA(1) <= 117)||(input.LA(1) >= 119 && input.LA(1) <= 120) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set254));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "abbrevPrefix"


	public static class vector_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vector"
	// R5RS.g3:392:1: vector : '#(' ! ( datum )* ')' !;
	public final R5RSParser.vector_return vector() throws RecognitionException {
		R5RSParser.vector_return retval = new R5RSParser.vector_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal255=null;
		Token char_literal257=null;
		ParserRuleReturnScope datum256 =null;

		Object string_literal255_tree=null;
		Object char_literal257_tree=null;

		try {
			// R5RS.g3:393:3: ( '#(' ! ( datum )* ')' !)
			// R5RS.g3:393:6: '#(' ! ( datum )* ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal255=(Token)match(input,112,FOLLOW_112_in_vector2614); if (state.failed) return retval;
			// R5RS.g3:393:12: ( datum )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( ((LA67_0 >= AND && LA67_0 <= BEGIN)||LA67_0==CASE||LA67_0==CHARACTER||LA67_0==COND||LA67_0==DEFINE||LA67_0==DELAY||LA67_0==DO||(LA67_0 >= ELLIPSIS && LA67_0 <= ELSE)||LA67_0==FALSE||LA67_0==IF||(LA67_0 >= LAMBDA && LA67_0 <= LETREC)||LA67_0==LETSTAR||(LA67_0 >= NUM_10 && LA67_0 <= OR)||LA67_0==QUASIQUOTE||LA67_0==QUOTE||LA67_0==SET||LA67_0==STRING||LA67_0==TRUE||(LA67_0 >= UNQUOTE && LA67_0 <= UNQUOTE_SPLICING)||LA67_0==VARIABLE||(LA67_0 >= 112 && LA67_0 <= 113)||(LA67_0 >= 116 && LA67_0 <= 117)||(LA67_0 >= 119 && LA67_0 <= 120)) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// R5RS.g3:393:12: datum
					{
					pushFollow(FOLLOW_datum_in_vector2617);
					datum256=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum256.getTree());

					}
					break;

				default :
					break loop67;
				}
			}

			char_literal257=(Token)match(input,115,FOLLOW_115_in_vector2620); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "vector"


	public static class number_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "number"
	// R5RS.g3:396:1: number : ( NUM_2 -> ^( NUM2 NUM_2 ) | NUM_8 -> ^( NUM8 NUM_8 ) | NUM_10 -> ^( NUM10 NUM_10 ) | NUM_16 -> ^( NUM16 NUM_16 ) );
	public final R5RSParser.number_return number() throws RecognitionException {
		R5RSParser.number_return retval = new R5RSParser.number_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUM_2258=null;
		Token NUM_8259=null;
		Token NUM_10260=null;
		Token NUM_16261=null;

		Object NUM_2258_tree=null;
		Object NUM_8259_tree=null;
		Object NUM_10260_tree=null;
		Object NUM_16261_tree=null;
		RewriteRuleTokenStream stream_NUM_16=new RewriteRuleTokenStream(adaptor,"token NUM_16");
		RewriteRuleTokenStream stream_NUM_10=new RewriteRuleTokenStream(adaptor,"token NUM_10");
		RewriteRuleTokenStream stream_NUM_2=new RewriteRuleTokenStream(adaptor,"token NUM_2");
		RewriteRuleTokenStream stream_NUM_8=new RewriteRuleTokenStream(adaptor,"token NUM_8");

		try {
			// R5RS.g3:397:3: ( NUM_2 -> ^( NUM2 NUM_2 ) | NUM_8 -> ^( NUM8 NUM_8 ) | NUM_10 -> ^( NUM10 NUM_10 ) | NUM_16 -> ^( NUM16 NUM_16 ) )
			int alt68=4;
			switch ( input.LA(1) ) {
			case NUM_2:
				{
				alt68=1;
				}
				break;
			case NUM_8:
				{
				alt68=2;
				}
				break;
			case NUM_10:
				{
				alt68=3;
				}
				break;
			case NUM_16:
				{
				alt68=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}
			switch (alt68) {
				case 1 :
					// R5RS.g3:397:6: NUM_2
					{
					NUM_2258=(Token)match(input,NUM_2,FOLLOW_NUM_2_in_number2635); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUM_2.add(NUM_2258);

					// AST REWRITE
					// elements: NUM_2
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 397:12: -> ^( NUM2 NUM_2 )
					{
						// R5RS.g3:397:15: ^( NUM2 NUM_2 )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NUM2, "NUM2"), root_1);
						adaptor.addChild(root_1, stream_NUM_2.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// R5RS.g3:398:6: NUM_8
					{
					NUM_8259=(Token)match(input,NUM_8,FOLLOW_NUM_8_in_number2650); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUM_8.add(NUM_8259);

					// AST REWRITE
					// elements: NUM_8
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 398:12: -> ^( NUM8 NUM_8 )
					{
						// R5RS.g3:398:15: ^( NUM8 NUM_8 )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NUM8, "NUM8"), root_1);
						adaptor.addChild(root_1, stream_NUM_8.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// R5RS.g3:399:6: NUM_10
					{
					NUM_10260=(Token)match(input,NUM_10,FOLLOW_NUM_10_in_number2665); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUM_10.add(NUM_10260);

					// AST REWRITE
					// elements: NUM_10
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 399:13: -> ^( NUM10 NUM_10 )
					{
						// R5RS.g3:399:16: ^( NUM10 NUM_10 )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NUM10, "NUM10"), root_1);
						adaptor.addChild(root_1, stream_NUM_10.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// R5RS.g3:400:6: NUM_16
					{
					NUM_16261=(Token)match(input,NUM_16,FOLLOW_NUM_16_in_number2680); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUM_16.add(NUM_16261);

					// AST REWRITE
					// elements: NUM_16
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 400:13: -> ^( NUM16 NUM_16 )
					{
						// R5RS.g3:400:16: ^( NUM16 NUM_16 )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NUM16, "NUM16"), root_1);
						adaptor.addChild(root_1, stream_NUM_16.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "number"


	public static class bool_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bool"
	// R5RS.g3:403:1: bool : ( TRUE -> ^( BOOL TRUE ) | FALSE -> ^( BOOL FALSE ) );
	public final R5RSParser.bool_return bool() throws RecognitionException {
		R5RSParser.bool_return retval = new R5RSParser.bool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TRUE262=null;
		Token FALSE263=null;

		Object TRUE262_tree=null;
		Object FALSE263_tree=null;
		RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
		RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

		try {
			// R5RS.g3:404:3: ( TRUE -> ^( BOOL TRUE ) | FALSE -> ^( BOOL FALSE ) )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==TRUE) ) {
				alt69=1;
			}
			else if ( (LA69_0==FALSE) ) {
				alt69=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// R5RS.g3:404:6: TRUE
					{
					TRUE262=(Token)match(input,TRUE,FOLLOW_TRUE_in_bool2702); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TRUE.add(TRUE262);

					// AST REWRITE
					// elements: TRUE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 404:11: -> ^( BOOL TRUE )
					{
						// R5RS.g3:404:14: ^( BOOL TRUE )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BOOL, "BOOL"), root_1);
						adaptor.addChild(root_1, stream_TRUE.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// R5RS.g3:405:6: FALSE
					{
					FALSE263=(Token)match(input,FALSE,FOLLOW_FALSE_in_bool2717); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FALSE.add(FALSE263);

					// AST REWRITE
					// elements: FALSE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 405:12: -> ^( BOOL FALSE )
					{
						// R5RS.g3:405:15: ^( BOOL FALSE )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BOOL, "BOOL"), root_1);
						adaptor.addChild(root_1, stream_FALSE.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bool"


	public static class quasiquotation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "quasiquotation"
	// R5RS.g3:410:1: quasiquotation : quasiquotationD[1] ;
	public final R5RSParser.quasiquotation_return quasiquotation() throws RecognitionException {
		R5RSParser.quasiquotation_return retval = new R5RSParser.quasiquotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope quasiquotationD264 =null;


		try {
			// R5RS.g3:411:3: ( quasiquotationD[1] )
			// R5RS.g3:411:6: quasiquotationD[1]
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_quasiquotationD_in_quasiquotation2742);
			quasiquotationD264=quasiquotationD(1);
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, quasiquotationD264.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quasiquotation"


	public static class quasiquotationD_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "quasiquotationD"
	// R5RS.g3:414:1: quasiquotationD[int d] : ( '`' qqTemplate[d] | '(' QUASIQUOTE qqTemplate[d] ')' );
	public final R5RSParser.quasiquotationD_return quasiquotationD(int d) throws RecognitionException {
		R5RSParser.quasiquotationD_return retval = new R5RSParser.quasiquotationD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal265=null;
		Token char_literal267=null;
		Token QUASIQUOTE268=null;
		Token char_literal270=null;
		ParserRuleReturnScope qqTemplate266 =null;
		ParserRuleReturnScope qqTemplate269 =null;

		Object char_literal265_tree=null;
		Object char_literal267_tree=null;
		Object QUASIQUOTE268_tree=null;
		Object char_literal270_tree=null;

		try {
			// R5RS.g3:415:3: ( '`' qqTemplate[d] | '(' QUASIQUOTE qqTemplate[d] ')' )
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==120) ) {
				alt70=1;
			}
			else if ( (LA70_0==113) ) {
				alt70=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}

			switch (alt70) {
				case 1 :
					// R5RS.g3:415:6: '`' qqTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					char_literal265=(Token)match(input,120,FOLLOW_120_in_quasiquotationD2758); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal265_tree = (Object)adaptor.create(char_literal265);
					adaptor.addChild(root_0, char_literal265_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_quasiquotationD2760);
					qqTemplate266=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate266.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:416:6: '(' QUASIQUOTE qqTemplate[d] ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal267=(Token)match(input,113,FOLLOW_113_in_quasiquotationD2768); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal267_tree = (Object)adaptor.create(char_literal267);
					adaptor.addChild(root_0, char_literal267_tree);
					}

					QUASIQUOTE268=(Token)match(input,QUASIQUOTE,FOLLOW_QUASIQUOTE_in_quasiquotationD2770); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					QUASIQUOTE268_tree = (Object)adaptor.create(QUASIQUOTE268);
					adaptor.addChild(root_0, QUASIQUOTE268_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_quasiquotationD2772);
					qqTemplate269=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate269.getTree());

					char_literal270=(Token)match(input,115,FOLLOW_115_in_quasiquotationD2775); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal270_tree = (Object)adaptor.create(char_literal270);
					adaptor.addChild(root_0, char_literal270_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quasiquotationD"


	public static class qqTemplate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "qqTemplate"
	// R5RS.g3:419:1: qqTemplate[int d] : ( ( expression )=> expression | ( '(' UNQUOTE )=> unquotation[d] | simpleDatum | vectorQQTemplate[d] | listQQTemplate[d] );
	public final R5RSParser.qqTemplate_return qqTemplate(int d) throws RecognitionException {
		R5RSParser.qqTemplate_return retval = new R5RSParser.qqTemplate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression271 =null;
		ParserRuleReturnScope unquotation272 =null;
		ParserRuleReturnScope simpleDatum273 =null;
		ParserRuleReturnScope vectorQQTemplate274 =null;
		ParserRuleReturnScope listQQTemplate275 =null;


		try {
			// R5RS.g3:420:3: ( ( expression )=> expression | ( '(' UNQUOTE )=> unquotation[d] | simpleDatum | vectorQQTemplate[d] | listQQTemplate[d] )
			int alt71=5;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==VARIABLE) ) {
				int LA71_1 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==ELLIPSIS) ) {
				int LA71_2 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==119) ) {
				int LA71_3 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=5;
				}

			}
			else if ( (LA71_0==113) ) {
				int LA71_4 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt71=1;
				}
				else if ( (synpred18_R5RS()) ) {
					alt71=2;
				}
				else if ( (true) ) {
					alt71=5;
				}

			}
			else if ( (LA71_0==TRUE) ) {
				int LA71_5 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==FALSE) ) {
				int LA71_6 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==NUM_2) ) {
				int LA71_7 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==NUM_8) ) {
				int LA71_8 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==NUM_10) ) {
				int LA71_9 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==NUM_16) ) {
				int LA71_10 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==CHARACTER) ) {
				int LA71_11 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==STRING) ) {
				int LA71_12 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==120) ) {
				int LA71_13 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=5;
				}

			}
			else if ( (LA71_0==116) && (synpred18_R5RS())) {
				alt71=2;
			}
			else if ( ((LA71_0 >= AND && LA71_0 <= BEGIN)||LA71_0==CASE||LA71_0==COND||LA71_0==DEFINE||LA71_0==DELAY||LA71_0==DO||LA71_0==ELSE||LA71_0==IF||(LA71_0 >= LAMBDA && LA71_0 <= LETREC)||LA71_0==LETSTAR||LA71_0==OR||LA71_0==QUASIQUOTE||LA71_0==QUOTE||LA71_0==SET||(LA71_0 >= UNQUOTE && LA71_0 <= UNQUOTE_SPLICING)) ) {
				alt71=3;
			}
			else if ( (LA71_0==112) ) {
				alt71=4;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// R5RS.g3:420:6: ( expression )=> expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_qqTemplate2796);
					expression271=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression271.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:421:6: ( '(' UNQUOTE )=> unquotation[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unquotation_in_qqTemplate2810);
					unquotation272=unquotation(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unquotation272.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:422:22: simpleDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleDatum_in_qqTemplate2834);
					simpleDatum273=simpleDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDatum273.getTree());

					}
					break;
				case 4 :
					// R5RS.g3:423:22: vectorQQTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_vectorQQTemplate_in_qqTemplate2857);
					vectorQQTemplate274=vectorQQTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, vectorQQTemplate274.getTree());

					}
					break;
				case 5 :
					// R5RS.g3:424:22: listQQTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_listQQTemplate_in_qqTemplate2881);
					listQQTemplate275=listQQTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, listQQTemplate275.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "qqTemplate"


	public static class vectorQQTemplate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vectorQQTemplate"
	// R5RS.g3:427:1: vectorQQTemplate[int d] : '#(' ( qqTemplateOrSplice[d] )* ')' ;
	public final R5RSParser.vectorQQTemplate_return vectorQQTemplate(int d) throws RecognitionException {
		R5RSParser.vectorQQTemplate_return retval = new R5RSParser.vectorQQTemplate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal276=null;
		Token char_literal278=null;
		ParserRuleReturnScope qqTemplateOrSplice277 =null;

		Object string_literal276_tree=null;
		Object char_literal278_tree=null;

		try {
			// R5RS.g3:428:3: ( '#(' ( qqTemplateOrSplice[d] )* ')' )
			// R5RS.g3:428:6: '#(' ( qqTemplateOrSplice[d] )* ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal276=(Token)match(input,112,FOLLOW_112_in_vectorQQTemplate2897); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal276_tree = (Object)adaptor.create(string_literal276);
			adaptor.addChild(root_0, string_literal276_tree);
			}

			// R5RS.g3:428:11: ( qqTemplateOrSplice[d] )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( ((LA72_0 >= AND && LA72_0 <= BEGIN)||LA72_0==CASE||LA72_0==CHARACTER||LA72_0==COND||LA72_0==DEFINE||LA72_0==DELAY||LA72_0==DO||(LA72_0 >= ELLIPSIS && LA72_0 <= ELSE)||LA72_0==FALSE||LA72_0==IF||(LA72_0 >= LAMBDA && LA72_0 <= LETREC)||LA72_0==LETSTAR||(LA72_0 >= NUM_10 && LA72_0 <= OR)||LA72_0==QUASIQUOTE||LA72_0==QUOTE||LA72_0==SET||LA72_0==STRING||LA72_0==TRUE||(LA72_0 >= UNQUOTE && LA72_0 <= UNQUOTE_SPLICING)||LA72_0==VARIABLE||(LA72_0 >= 112 && LA72_0 <= 113)||(LA72_0 >= 116 && LA72_0 <= 117)||(LA72_0 >= 119 && LA72_0 <= 120)) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// R5RS.g3:428:11: qqTemplateOrSplice[d]
					{
					pushFollow(FOLLOW_qqTemplateOrSplice_in_vectorQQTemplate2899);
					qqTemplateOrSplice277=qqTemplateOrSplice(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplateOrSplice277.getTree());

					}
					break;

				default :
					break loop72;
				}
			}

			char_literal278=(Token)match(input,115,FOLLOW_115_in_vectorQQTemplate2903); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal278_tree = (Object)adaptor.create(char_literal278);
			adaptor.addChild(root_0, char_literal278_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "vectorQQTemplate"


	public static class listQQTemplate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "listQQTemplate"
	// R5RS.g3:431:1: listQQTemplate[int d] : ( '\\'' qqTemplate[d] | ( '(' QUASIQUOTE )=> quasiquotationD[d+1] | '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')' );
	public final R5RSParser.listQQTemplate_return listQQTemplate(int d) throws RecognitionException {
		R5RSParser.listQQTemplate_return retval = new R5RSParser.listQQTemplate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal279=null;
		Token char_literal282=null;
		Token char_literal284=null;
		Token char_literal286=null;
		ParserRuleReturnScope qqTemplate280 =null;
		ParserRuleReturnScope quasiquotationD281 =null;
		ParserRuleReturnScope qqTemplateOrSplice283 =null;
		ParserRuleReturnScope qqTemplate285 =null;

		Object char_literal279_tree=null;
		Object char_literal282_tree=null;
		Object char_literal284_tree=null;
		Object char_literal286_tree=null;

		try {
			// R5RS.g3:432:3: ( '\\'' qqTemplate[d] | ( '(' QUASIQUOTE )=> quasiquotationD[d+1] | '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')' )
			int alt76=3;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==119) ) {
				alt76=1;
			}
			else if ( (LA76_0==120) && (synpred19_R5RS())) {
				alt76=2;
			}
			else if ( (LA76_0==113) ) {
				int LA76_3 = input.LA(2);
				if ( (synpred19_R5RS()) ) {
					alt76=2;
				}
				else if ( (true) ) {
					alt76=3;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}

			switch (alt76) {
				case 1 :
					// R5RS.g3:432:25: '\\'' qqTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					char_literal279=(Token)match(input,119,FOLLOW_119_in_listQQTemplate2937); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal279_tree = (Object)adaptor.create(char_literal279);
					adaptor.addChild(root_0, char_literal279_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_listQQTemplate2939);
					qqTemplate280=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate280.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:433:6: ( '(' QUASIQUOTE )=> quasiquotationD[d+1]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_quasiquotationD_in_listQQTemplate2954);
					quasiquotationD281=quasiquotationD(d+1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quasiquotationD281.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:434:25: '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal282=(Token)match(input,113,FOLLOW_113_in_listQQTemplate2981); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal282_tree = (Object)adaptor.create(char_literal282);
					adaptor.addChild(root_0, char_literal282_tree);
					}

					// R5RS.g3:434:29: ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( ((LA75_0 >= AND && LA75_0 <= BEGIN)||LA75_0==CASE||LA75_0==CHARACTER||LA75_0==COND||LA75_0==DEFINE||LA75_0==DELAY||LA75_0==DO||(LA75_0 >= ELLIPSIS && LA75_0 <= ELSE)||LA75_0==FALSE||LA75_0==IF||(LA75_0 >= LAMBDA && LA75_0 <= LETREC)||LA75_0==LETSTAR||(LA75_0 >= NUM_10 && LA75_0 <= OR)||LA75_0==QUASIQUOTE||LA75_0==QUOTE||LA75_0==SET||LA75_0==STRING||LA75_0==TRUE||(LA75_0 >= UNQUOTE && LA75_0 <= UNQUOTE_SPLICING)||LA75_0==VARIABLE||(LA75_0 >= 112 && LA75_0 <= 113)||(LA75_0 >= 116 && LA75_0 <= 117)||(LA75_0 >= 119 && LA75_0 <= 120)) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// R5RS.g3:434:30: ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )?
							{
							// R5RS.g3:434:30: ( qqTemplateOrSplice[d] )+
							int cnt73=0;
							loop73:
							while (true) {
								int alt73=2;
								int LA73_0 = input.LA(1);
								if ( ((LA73_0 >= AND && LA73_0 <= BEGIN)||LA73_0==CASE||LA73_0==CHARACTER||LA73_0==COND||LA73_0==DEFINE||LA73_0==DELAY||LA73_0==DO||(LA73_0 >= ELLIPSIS && LA73_0 <= ELSE)||LA73_0==FALSE||LA73_0==IF||(LA73_0 >= LAMBDA && LA73_0 <= LETREC)||LA73_0==LETSTAR||(LA73_0 >= NUM_10 && LA73_0 <= OR)||LA73_0==QUASIQUOTE||LA73_0==QUOTE||LA73_0==SET||LA73_0==STRING||LA73_0==TRUE||(LA73_0 >= UNQUOTE && LA73_0 <= UNQUOTE_SPLICING)||LA73_0==VARIABLE||(LA73_0 >= 112 && LA73_0 <= 113)||(LA73_0 >= 116 && LA73_0 <= 117)||(LA73_0 >= 119 && LA73_0 <= 120)) ) {
									alt73=1;
								}

								switch (alt73) {
								case 1 :
									// R5RS.g3:434:30: qqTemplateOrSplice[d]
									{
									pushFollow(FOLLOW_qqTemplateOrSplice_in_listQQTemplate2984);
									qqTemplateOrSplice283=qqTemplateOrSplice(d);
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplateOrSplice283.getTree());

									}
									break;

								default :
									if ( cnt73 >= 1 ) break loop73;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(73, input);
									throw eee;
								}
								cnt73++;
							}

							// R5RS.g3:434:53: ( '.' qqTemplate[d] )?
							int alt74=2;
							int LA74_0 = input.LA(1);
							if ( (LA74_0==118) ) {
								alt74=1;
							}
							switch (alt74) {
								case 1 :
									// R5RS.g3:434:54: '.' qqTemplate[d]
									{
									char_literal284=(Token)match(input,118,FOLLOW_118_in_listQQTemplate2989); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal284_tree = (Object)adaptor.create(char_literal284);
									adaptor.addChild(root_0, char_literal284_tree);
									}

									pushFollow(FOLLOW_qqTemplate_in_listQQTemplate2991);
									qqTemplate285=qqTemplate(d);
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate285.getTree());

									}
									break;

							}

							}
							break;

					}

					char_literal286=(Token)match(input,115,FOLLOW_115_in_listQQTemplate2998); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal286_tree = (Object)adaptor.create(char_literal286);
					adaptor.addChild(root_0, char_literal286_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "listQQTemplate"


	public static class unquotation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unquotation"
	// R5RS.g3:437:1: unquotation[int d] : ( ',' qqTemplate[d-1] | '(' UNQUOTE qqTemplate[d-1] ')' );
	public final R5RSParser.unquotation_return unquotation(int d) throws RecognitionException {
		R5RSParser.unquotation_return retval = new R5RSParser.unquotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal287=null;
		Token char_literal289=null;
		Token UNQUOTE290=null;
		Token char_literal292=null;
		ParserRuleReturnScope qqTemplate288 =null;
		ParserRuleReturnScope qqTemplate291 =null;

		Object char_literal287_tree=null;
		Object char_literal289_tree=null;
		Object UNQUOTE290_tree=null;
		Object char_literal292_tree=null;

		try {
			// R5RS.g3:438:3: ( ',' qqTemplate[d-1] | '(' UNQUOTE qqTemplate[d-1] ')' )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==116) ) {
				alt77=1;
			}
			else if ( (LA77_0==113) ) {
				alt77=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// R5RS.g3:438:6: ',' qqTemplate[d-1]
					{
					root_0 = (Object)adaptor.nil();


					char_literal287=(Token)match(input,116,FOLLOW_116_in_unquotation3013); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal287_tree = (Object)adaptor.create(char_literal287);
					adaptor.addChild(root_0, char_literal287_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_unquotation3015);
					qqTemplate288=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate288.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:439:6: '(' UNQUOTE qqTemplate[d-1] ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal289=(Token)match(input,113,FOLLOW_113_in_unquotation3023); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal289_tree = (Object)adaptor.create(char_literal289);
					adaptor.addChild(root_0, char_literal289_tree);
					}

					UNQUOTE290=(Token)match(input,UNQUOTE,FOLLOW_UNQUOTE_in_unquotation3025); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE290_tree = (Object)adaptor.create(UNQUOTE290);
					adaptor.addChild(root_0, UNQUOTE290_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_unquotation3027);
					qqTemplate291=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate291.getTree());

					char_literal292=(Token)match(input,115,FOLLOW_115_in_unquotation3030); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal292_tree = (Object)adaptor.create(char_literal292);
					adaptor.addChild(root_0, char_literal292_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unquotation"


	public static class qqTemplateOrSplice_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "qqTemplateOrSplice"
	// R5RS.g3:442:1: qqTemplateOrSplice[int d] : ( ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d] | qqTemplate[d] );
	public final R5RSParser.qqTemplateOrSplice_return qqTemplateOrSplice(int d) throws RecognitionException {
		R5RSParser.qqTemplateOrSplice_return retval = new R5RSParser.qqTemplateOrSplice_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope splicingUnquotation293 =null;
		ParserRuleReturnScope qqTemplate294 =null;


		try {
			// R5RS.g3:443:3: ( ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d] | qqTemplate[d] )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==117) && (synpred20_R5RS())) {
				alt78=1;
			}
			else if ( (LA78_0==113) ) {
				int LA78_2 = input.LA(2);
				if ( (synpred20_R5RS()) ) {
					alt78=1;
				}
				else if ( (true) ) {
					alt78=2;
				}

			}
			else if ( ((LA78_0 >= AND && LA78_0 <= BEGIN)||LA78_0==CASE||LA78_0==CHARACTER||LA78_0==COND||LA78_0==DEFINE||LA78_0==DELAY||LA78_0==DO||(LA78_0 >= ELLIPSIS && LA78_0 <= ELSE)||LA78_0==FALSE||LA78_0==IF||(LA78_0 >= LAMBDA && LA78_0 <= LETREC)||LA78_0==LETSTAR||(LA78_0 >= NUM_10 && LA78_0 <= OR)||LA78_0==QUASIQUOTE||LA78_0==QUOTE||LA78_0==SET||LA78_0==STRING||LA78_0==TRUE||(LA78_0 >= UNQUOTE && LA78_0 <= UNQUOTE_SPLICING)||LA78_0==VARIABLE||LA78_0==112||LA78_0==116||(LA78_0 >= 119 && LA78_0 <= 120)) ) {
				alt78=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}

			switch (alt78) {
				case 1 :
					// R5RS.g3:443:6: ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_splicingUnquotation_in_qqTemplateOrSplice3052);
					splicingUnquotation293=splicingUnquotation(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, splicingUnquotation293.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:444:31: qqTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_qqTemplate_in_qqTemplateOrSplice3085);
					qqTemplate294=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate294.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "qqTemplateOrSplice"


	public static class splicingUnquotation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "splicingUnquotation"
	// R5RS.g3:447:1: splicingUnquotation[int d] : ( ',@' qqTemplate[d-1] | '(' UNQUOTE_SPLICING qqTemplate[d-1] ')' );
	public final R5RSParser.splicingUnquotation_return splicingUnquotation(int d) throws RecognitionException {
		R5RSParser.splicingUnquotation_return retval = new R5RSParser.splicingUnquotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal295=null;
		Token char_literal297=null;
		Token UNQUOTE_SPLICING298=null;
		Token char_literal300=null;
		ParserRuleReturnScope qqTemplate296 =null;
		ParserRuleReturnScope qqTemplate299 =null;

		Object string_literal295_tree=null;
		Object char_literal297_tree=null;
		Object UNQUOTE_SPLICING298_tree=null;
		Object char_literal300_tree=null;

		try {
			// R5RS.g3:448:3: ( ',@' qqTemplate[d-1] | '(' UNQUOTE_SPLICING qqTemplate[d-1] ')' )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==117) ) {
				alt79=1;
			}
			else if ( (LA79_0==113) ) {
				alt79=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// R5RS.g3:448:6: ',@' qqTemplate[d-1]
					{
					root_0 = (Object)adaptor.nil();


					string_literal295=(Token)match(input,117,FOLLOW_117_in_splicingUnquotation3101); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal295_tree = (Object)adaptor.create(string_literal295);
					adaptor.addChild(root_0, string_literal295_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_splicingUnquotation3103);
					qqTemplate296=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate296.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:449:6: '(' UNQUOTE_SPLICING qqTemplate[d-1] ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal297=(Token)match(input,113,FOLLOW_113_in_splicingUnquotation3111); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal297_tree = (Object)adaptor.create(char_literal297);
					adaptor.addChild(root_0, char_literal297_tree);
					}

					UNQUOTE_SPLICING298=(Token)match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_splicingUnquotation3113); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE_SPLICING298_tree = (Object)adaptor.create(UNQUOTE_SPLICING298);
					adaptor.addChild(root_0, UNQUOTE_SPLICING298_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_splicingUnquotation3115);
					qqTemplate299=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate299.getTree());

					char_literal300=(Token)match(input,115,FOLLOW_115_in_splicingUnquotation3118); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal300_tree = (Object)adaptor.create(char_literal300);
					adaptor.addChild(root_0, char_literal300_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "splicingUnquotation"

	// $ANTLR start synpred1_R5RS
	public final void synpred1_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:83:6: ( syntaxDefinition )
		// R5RS.g3:83:7: syntaxDefinition
		{
		pushFollow(FOLLOW_syntaxDefinition_in_synpred1_R5RS294);
		syntaxDefinition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_R5RS

	// $ANTLR start synpred2_R5RS
	public final void synpred2_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:84:6: ( definition )
		// R5RS.g3:84:7: definition
		{
		pushFollow(FOLLOW_definition_in_synpred2_R5RS319);
		definition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_R5RS

	// $ANTLR start synpred3_R5RS
	public final void synpred3_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:85:6: ( '(' BEGIN commandOrDefinition )
		// R5RS.g3:85:7: '(' BEGIN commandOrDefinition
		{
		match(input,113,FOLLOW_113_in_synpred3_R5RS350); if (state.failed) return;

		match(input,BEGIN,FOLLOW_BEGIN_in_synpred3_R5RS352); if (state.failed) return;

		pushFollow(FOLLOW_commandOrDefinition_in_synpred3_R5RS354);
		commandOrDefinition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_R5RS

	// $ANTLR start synpred4_R5RS
	public final void synpred4_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:94:5: ( simpleDefinition )
		// R5RS.g3:94:6: simpleDefinition
		{
		pushFollow(FOLLOW_simpleDefinition_in_synpred4_R5RS451);
		simpleDefinition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_R5RS

	// $ANTLR start synpred5_R5RS
	public final void synpred5_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:95:5: ( formalDefinition )
		// R5RS.g3:95:6: formalDefinition
		{
		pushFollow(FOLLOW_formalDefinition_in_synpred5_R5RS463);
		formalDefinition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_R5RS

	// $ANTLR start synpred6_R5RS
	public final void synpred6_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:193:6: ( variable )
		// R5RS.g3:193:7: variable
		{
		pushFollow(FOLLOW_variable_in_synpred6_R5RS1070);
		variable();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_R5RS

	// $ANTLR start synpred7_R5RS
	public final void synpred7_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:194:6: ( literal )
		// R5RS.g3:194:7: literal
		{
		pushFollow(FOLLOW_literal_in_synpred7_R5RS1091);
		literal();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_R5RS

	// $ANTLR start synpred8_R5RS
	public final void synpred8_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:195:6: ( lambdaExpression )
		// R5RS.g3:195:7: lambdaExpression
		{
		pushFollow(FOLLOW_lambdaExpression_in_synpred8_R5RS1121);
		lambdaExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_R5RS

	// $ANTLR start synpred9_R5RS
	public final void synpred9_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:196:6: ( conditional )
		// R5RS.g3:196:7: conditional
		{
		pushFollow(FOLLOW_conditional_in_synpred9_R5RS1134);
		conditional();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred9_R5RS

	// $ANTLR start synpred10_R5RS
	public final void synpred10_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:197:6: ( assignment )
		// R5RS.g3:197:7: assignment
		{
		pushFollow(FOLLOW_assignment_in_synpred10_R5RS1152);
		assignment();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred10_R5RS

	// $ANTLR start synpred11_R5RS
	public final void synpred11_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:198:6: ( derivedExpression )
		// R5RS.g3:198:7: derivedExpression
		{
		pushFollow(FOLLOW_derivedExpression_in_synpred11_R5RS1171);
		derivedExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred11_R5RS

	// $ANTLR start synpred12_R5RS
	public final void synpred12_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:199:6: ( procedureCall )
		// R5RS.g3:199:7: procedureCall
		{
		pushFollow(FOLLOW_procedureCall_in_synpred12_R5RS1183);
		procedureCall();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred12_R5RS

	// $ANTLR start synpred13_R5RS
	public final void synpred13_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:200:6: ( macroUse )
		// R5RS.g3:200:7: macroUse
		{
		pushFollow(FOLLOW_macroUse_in_synpred13_R5RS1199);
		macroUse();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred13_R5RS

	// $ANTLR start synpred14_R5RS
	public final void synpred14_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:231:5: ( variable )
		// R5RS.g3:231:6: variable
		{
		pushFollow(FOLLOW_variable_in_synpred14_R5RS1424);
		variable();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred14_R5RS

	// $ANTLR start synpred15_R5RS
	public final void synpred15_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:232:5: ( formals )
		// R5RS.g3:232:6: formals
		{
		pushFollow(FOLLOW_formals_in_synpred15_R5RS1436);
		formals();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred15_R5RS

	// $ANTLR start synpred16_R5RS
	public final void synpred16_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:357:6: ( definition )
		// R5RS.g3:357:7: definition
		{
		pushFollow(FOLLOW_definition_in_synpred16_R5RS2390);
		definition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred16_R5RS

	// $ANTLR start synpred17_R5RS
	public final void synpred17_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:420:6: ( expression )
		// R5RS.g3:420:7: expression
		{
		pushFollow(FOLLOW_expression_in_synpred17_R5RS2791);
		expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred17_R5RS

	// $ANTLR start synpred18_R5RS
	public final void synpred18_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:421:6: ( '(' UNQUOTE )
		// R5RS.g3:421:7: '(' UNQUOTE
		{
		match(input,113,FOLLOW_113_in_synpred18_R5RS2804); if (state.failed) return;

		match(input,UNQUOTE,FOLLOW_UNQUOTE_in_synpred18_R5RS2806); if (state.failed) return;

		}

	}
	// $ANTLR end synpred18_R5RS

	// $ANTLR start synpred19_R5RS
	public final void synpred19_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:433:6: ( '(' QUASIQUOTE )
		// R5RS.g3:433:7: '(' QUASIQUOTE
		{
		match(input,113,FOLLOW_113_in_synpred19_R5RS2948); if (state.failed) return;

		match(input,QUASIQUOTE,FOLLOW_QUASIQUOTE_in_synpred19_R5RS2950); if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_R5RS

	// $ANTLR start synpred20_R5RS
	public final void synpred20_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:443:6: ( '(' UNQUOTE_SPLICING )
		// R5RS.g3:443:7: '(' UNQUOTE_SPLICING
		{
		match(input,113,FOLLOW_113_in_synpred20_R5RS3046); if (state.failed) return;

		match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_synpred20_R5RS3048); if (state.failed) return;

		}

	}
	// $ANTLR end synpred20_R5RS

	// Delegated rules

	public final boolean synpred19_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred15_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred15_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred13_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred13_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred11_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred14_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred14_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_R5RS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_R5RS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_commandOrDefinition_in_parse276 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_EOF_in_parse279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntaxDefinition_in_commandOrDefinition311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_commandOrDefinition342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_commandOrDefinition358 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_commandOrDefinition361 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_commandOrDefinition_in_commandOrDefinition367 = new BitSet(new long[]{0xE000010800004000L,0x018A400810000001L});
	public static final BitSet FOLLOW_115_in_commandOrDefinition370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commandOrDefinition412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_syntaxDefinition426 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DEFINE_SYNTAX_in_syntaxDefinition429 = new BitSet(new long[]{0x000B90190A4008E0L,0x0000430000400A02L});
	public static final BitSet FOLLOW_keyword_in_syntaxDefinition432 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_transformerSpec_in_syntaxDefinition434 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_syntaxDefinition436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDefinition_in_definition456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalDefinition_in_definition468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_definition474 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_definition477 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_definition_in_definition480 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_115_in_definition483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_simpleDefinition498 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_DEFINE_in_simpleDefinition501 = new BitSet(new long[]{0x0000000800000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_variable_in_simpleDefinition504 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_expression_in_simpleDefinition506 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_simpleDefinition508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_formalDefinition522 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_DEFINE_in_formalDefinition525 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_formals_in_formalDefinition528 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_body_in_formalDefinition530 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_formalDefinition532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_formals546 = new BitSet(new long[]{0x0000000800000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_variable_in_formals549 = new BitSet(new long[]{0x0000000800000000L,0x0048400000000000L});
	public static final BitSet FOLLOW_variable_in_formals551 = new BitSet(new long[]{0x0000000800000000L,0x0048400000000000L});
	public static final BitSet FOLLOW_118_in_formals555 = new BitSet(new long[]{0x0000000800000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_variable_in_formals557 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_formals561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_keyword576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_transformerSpec592 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_SYNTAX_RULES_in_transformerSpec595 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_transformerSpec598 = new BitSet(new long[]{0x000B90190A4008E0L,0x0008430000400A02L});
	public static final BitSet FOLLOW_identifier_in_transformerSpec601 = new BitSet(new long[]{0x000B90190A4008E0L,0x0008430000400A02L});
	public static final BitSet FOLLOW_115_in_transformerSpec604 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_syntaxRule_in_transformerSpec607 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_115_in_transformerSpec610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_syntaxRule625 = new BitSet(new long[]{0xE00B91110A4048E0L,0x0003430810400A03L});
	public static final BitSet FOLLOW_pattern_in_syntaxRule627 = new BitSet(new long[]{0xE00B91110A4048E0L,0x0003430810400A03L});
	public static final BitSet FOLLOW_template_in_syntaxRule629 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_syntaxRule631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternIdentifier_in_pattern655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_pattern662 = new BitSet(new long[]{0xE00B91110A4048E0L,0x000B430810400A03L});
	public static final BitSet FOLLOW_pattern_in_pattern665 = new BitSet(new long[]{0xE00B91190A4048E0L,0x004B430810400A03L});
	public static final BitSet FOLLOW_118_in_pattern669 = new BitSet(new long[]{0xE00B91110A4048E0L,0x0003430810400A03L});
	public static final BitSet FOLLOW_pattern_in_pattern671 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_ELLIPSIS_in_pattern675 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_pattern682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_112_in_pattern689 = new BitSet(new long[]{0xE00B91110A4048E0L,0x000B430810400A03L});
	public static final BitSet FOLLOW_pattern_in_pattern692 = new BitSet(new long[]{0xE00B91190A4048E0L,0x000B430810400A03L});
	public static final BitSet FOLLOW_ELLIPSIS_in_pattern695 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_pattern701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternDatum_in_pattern708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntacticKeyword_in_patternIdentifier722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_patternIdentifier729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selfEvaluating_in_patternDatum743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternIdentifier_in_template757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_template764 = new BitSet(new long[]{0xE00B91110A4048E0L,0x000B430810400A03L});
	public static final BitSet FOLLOW_templateElement_in_template767 = new BitSet(new long[]{0xE00B91110A4048E0L,0x004B430810400A03L});
	public static final BitSet FOLLOW_118_in_template771 = new BitSet(new long[]{0xE00B91110A4048E0L,0x0003430810400A03L});
	public static final BitSet FOLLOW_templateElement_in_template773 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_template779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_112_in_template786 = new BitSet(new long[]{0xE00B91110A4048E0L,0x000B430810400A03L});
	public static final BitSet FOLLOW_templateElement_in_template788 = new BitSet(new long[]{0xE00B91110A4048E0L,0x000B430810400A03L});
	public static final BitSet FOLLOW_115_in_template791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_templateDatum_in_template798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_template_in_templateElement812 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_templateElement814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternDatum_in_templateDatum829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_command845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntacticKeyword_in_identifier867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_identifier882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionKeyword_in_syntacticKeyword904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_syntacticKeyword911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARROW_in_syntacticKeyword918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFINE_in_syntacticKeyword925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNQUOTE_in_syntacticKeyword932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_syntacticKeyword939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_expression1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_expression1105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lambdaExpression_in_expression1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_expression1144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_expression1163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derivedExpression_in_expression1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_expression1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroUse_in_expression1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroBlock_in_expression1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_variable1255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_variable1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quotation_in_literal1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selfEvaluating_in_literal1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_119_in_quotation1318 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01B3430810400A03L});
	public static final BitSet FOLLOW_datum_in_quotation1321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_quotation1328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_QUOTE_in_quotation1330 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01B3430810400A03L});
	public static final BitSet FOLLOW_datum_in_quotation1332 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_quotation1334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_selfEvaluating1348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_selfEvaluating1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_selfEvaluating1362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_selfEvaluating1377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_lambdaExpression1399 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LAMBDA_in_lambdaExpression1402 = new BitSet(new long[]{0x0000000800000000L,0x0006400000000000L});
	public static final BitSet FOLLOW_lambdaformals_in_lambdaExpression1405 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_body_in_lambdaExpression1407 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_lambdaExpression1409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_lambdaformals1429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formals_in_lambdaformals1441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_114_in_lambdaformals1447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_conditional1468 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_IF_in_conditional1471 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_test_in_conditional1474 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_consequent_in_conditional1476 = new BitSet(new long[]{0xE000010800004000L,0x018A400810000001L});
	public static final BitSet FOLLOW_alternate_in_conditional1478 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_conditional1481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_test1497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_consequent1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_alternate1536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_assignment1550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SET_in_assignment1553 = new BitSet(new long[]{0x0000000800000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_variable_in_assignment1556 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_expression_in_assignment1558 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_assignment1560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quasiquotation_in_derivedExpression1575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_derivedExpression1590 = new BitSet(new long[]{0x000B0001084008A0L,0x0000000000000002L});
	public static final BitSet FOLLOW_COND_in_derivedExpression1595 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_derivedExpression1600 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_elseClause_in_derivedExpression1603 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_derivedExpression1605 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_condClause_in_derivedExpression1628 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_113_in_derivedExpression1632 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_elseClause_in_derivedExpression1635 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_derivedExpression1637 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_CASE_in_derivedExpression1673 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_expression_in_derivedExpression1676 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_derivedExpression1680 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_elseClause_in_derivedExpression1683 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_derivedExpression1685 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_caseClause_in_derivedExpression1718 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_113_in_derivedExpression1722 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_elseClause_in_derivedExpression1725 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_derivedExpression1727 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_AND_in_derivedExpression1773 = new BitSet(new long[]{0xE000010800004000L,0x018A400810000001L});
	public static final BitSet FOLLOW_test_in_derivedExpression1776 = new BitSet(new long[]{0xE000010800004000L,0x018A400810000001L});
	public static final BitSet FOLLOW_OR_in_derivedExpression1790 = new BitSet(new long[]{0xE000010800004000L,0x018A400810000001L});
	public static final BitSet FOLLOW_test_in_derivedExpression1793 = new BitSet(new long[]{0xE000010800004000L,0x018A400810000001L});
	public static final BitSet FOLLOW_localBinding_in_derivedExpression1807 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_BEGIN_in_derivedExpression1820 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1823 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_DO_in_derivedExpression1836 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_derivedExpression1839 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_iterationSpec_in_derivedExpression1842 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_115_in_derivedExpression1845 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_derivedExpression1848 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_test_in_derivedExpression1851 = new BitSet(new long[]{0xE000010800004000L,0x018A400810000001L});
	public static final BitSet FOLLOW_doResult_in_derivedExpression1853 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_derivedExpression1856 = new BitSet(new long[]{0xE000010800004000L,0x018A400810000001L});
	public static final BitSet FOLLOW_doCommands_in_derivedExpression1859 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_DELAY_in_derivedExpression1872 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_expression_in_derivedExpression1875 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_derivedExpression1894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_doCommands1909 = new BitSet(new long[]{0xE000010800004002L,0x0182400810000001L});
	public static final BitSet FOLLOW_113_in_condClause1933 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_test_in_condClause1935 = new BitSet(new long[]{0xE000010800004040L,0x018A400810000001L});
	public static final BitSet FOLLOW_condrealize_in_condClause1937 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_condClause1940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_elseClause1964 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_sequence_in_elseClause1967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequence_in_condrealize1980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARROW_in_condrealize1986 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_recipient_in_condrealize1989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_recipient2003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_caseClause2017 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_caseClause2019 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01BB430810400A03L});
	public static final BitSet FOLLOW_datum_in_caseClause2021 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01BB430810400A03L});
	public static final BitSet FOLLOW_115_in_caseClause2024 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_sequence_in_caseClause2026 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_caseClause2028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localBindingDefinition_in_localBinding2053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_localBindingDefinition2074 = new BitSet(new long[]{0x0000000800000000L,0x0002400000000000L});
	public static final BitSet FOLLOW_variable_in_localBindingDefinition2077 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_localBindingDefinition2080 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_bindingSpec_in_localBindingDefinition2083 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_115_in_localBindingDefinition2086 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_body_in_localBindingDefinition2089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LETSTAR_in_localBindingDefinition2095 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_localBindingDefinition2098 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_bindingSpec_in_localBindingDefinition2101 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_115_in_localBindingDefinition2104 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_body_in_localBindingDefinition2107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LETREC_in_localBindingDefinition2113 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_localBindingDefinition2116 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_bindingSpec_in_localBindingDefinition2119 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_115_in_localBindingDefinition2122 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_body_in_localBindingDefinition2125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_bindingSpec2139 = new BitSet(new long[]{0x0000000800000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_variable_in_bindingSpec2141 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_expression_in_bindingSpec2143 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_bindingSpec2145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_iterationSpec2169 = new BitSet(new long[]{0x0000000800000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_variable_in_iterationSpec2171 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_init_in_iterationSpec2173 = new BitSet(new long[]{0xE000010800004000L,0x018A400810000001L});
	public static final BitSet FOLLOW_step_in_iterationSpec2175 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_iterationSpec2178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_init2205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_step2219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequence_in_doResult2233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_procedureCall2255 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_operator_in_procedureCall2257 = new BitSet(new long[]{0xE000010800004000L,0x018A400810000001L});
	public static final BitSet FOLLOW_operand_in_procedureCall2259 = new BitSet(new long[]{0xE000010800004000L,0x018A400810000001L});
	public static final BitSet FOLLOW_115_in_procedureCall2262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_operator2287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_operand2301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_macroUse2315 = new BitSet(new long[]{0x000B90190A4008E0L,0x0000430000400A02L});
	public static final BitSet FOLLOW_keyword_in_macroUse2317 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01BB430810400A03L});
	public static final BitSet FOLLOW_datum_in_macroUse2319 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01BB430810400A03L});
	public static final BitSet FOLLOW_115_in_macroUse2322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_macroBlock2336 = new BitSet(new long[]{0x0024000000000000L});
	public static final BitSet FOLLOW_set_in_macroBlock2338 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_macroBlock2346 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_syntaxSpec_in_macroBlock2348 = new BitSet(new long[]{0x0000000000000000L,0x000A000000000000L});
	public static final BitSet FOLLOW_115_in_macroBlock2351 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_body_in_macroBlock2353 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_macroBlock2355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_syntaxSpec2369 = new BitSet(new long[]{0x000B90190A4008E0L,0x0000430000400A02L});
	public static final BitSet FOLLOW_keyword_in_syntaxSpec2371 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_transformerSpec_in_syntaxSpec2373 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_syntaxSpec2375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_body2394 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_sequence_in_body2398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_sequence2423 = new BitSet(new long[]{0xE000010800004002L,0x0182400810000001L});
	public static final BitSet FOLLOW_simpleDatum_in_datum2447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundDatum_in_datum2454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selfEvaluating_in_simpleDatum2468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_simpleDatum2475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_compoundDatum2489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vector_in_compoundDatum2504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_list2526 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01BB430810400A03L});
	public static final BitSet FOLLOW_datum_in_list2530 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01FB430810400A03L});
	public static final BitSet FOLLOW_118_in_list2534 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01B3430810400A03L});
	public static final BitSet FOLLOW_datum_in_list2536 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_list2542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abbreviation_in_list2550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abbrevPrefix_in_abbreviation2572 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01B3430810400A03L});
	public static final BitSet FOLLOW_datum_in_abbreviation2574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_112_in_vector2614 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01BB430810400A03L});
	public static final BitSet FOLLOW_datum_in_vector2617 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01BB430810400A03L});
	public static final BitSet FOLLOW_115_in_vector2620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_2_in_number2635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_8_in_number2650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_10_in_number2665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_16_in_number2680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_bool2702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_bool2717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quasiquotationD_in_quasiquotation2742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_120_in_quasiquotationD2758 = new BitSet(new long[]{0xE00B91190A4048E0L,0x0193430810400A03L});
	public static final BitSet FOLLOW_qqTemplate_in_quasiquotationD2760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_quasiquotationD2768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_QUASIQUOTE_in_quasiquotationD2770 = new BitSet(new long[]{0xE00B91190A4048E0L,0x0193430810400A03L});
	public static final BitSet FOLLOW_qqTemplate_in_quasiquotationD2772 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_quasiquotationD2775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_qqTemplate2796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unquotation_in_qqTemplate2810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDatum_in_qqTemplate2834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vectorQQTemplate_in_qqTemplate2857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listQQTemplate_in_qqTemplate2881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_112_in_vectorQQTemplate2897 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01BB430810400A03L});
	public static final BitSet FOLLOW_qqTemplateOrSplice_in_vectorQQTemplate2899 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01BB430810400A03L});
	public static final BitSet FOLLOW_115_in_vectorQQTemplate2903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_119_in_listQQTemplate2937 = new BitSet(new long[]{0xE00B91190A4048E0L,0x0193430810400A03L});
	public static final BitSet FOLLOW_qqTemplate_in_listQQTemplate2939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quasiquotationD_in_listQQTemplate2954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_listQQTemplate2981 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01BB430810400A03L});
	public static final BitSet FOLLOW_qqTemplateOrSplice_in_listQQTemplate2984 = new BitSet(new long[]{0xE00B91190A4048E0L,0x01FB430810400A03L});
	public static final BitSet FOLLOW_118_in_listQQTemplate2989 = new BitSet(new long[]{0xE00B91190A4048E0L,0x0193430810400A03L});
	public static final BitSet FOLLOW_qqTemplate_in_listQQTemplate2991 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_listQQTemplate2998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_116_in_unquotation3013 = new BitSet(new long[]{0xE00B91190A4048E0L,0x0193430810400A03L});
	public static final BitSet FOLLOW_qqTemplate_in_unquotation3015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_unquotation3023 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_UNQUOTE_in_unquotation3025 = new BitSet(new long[]{0xE00B91190A4048E0L,0x0193430810400A03L});
	public static final BitSet FOLLOW_qqTemplate_in_unquotation3027 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_unquotation3030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_splicingUnquotation_in_qqTemplateOrSplice3052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qqTemplate_in_qqTemplateOrSplice3085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_117_in_splicingUnquotation3101 = new BitSet(new long[]{0xE00B91190A4048E0L,0x0193430810400A03L});
	public static final BitSet FOLLOW_qqTemplate_in_splicingUnquotation3103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_splicingUnquotation3111 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_splicingUnquotation3113 = new BitSet(new long[]{0xE00B91190A4048E0L,0x0193430810400A03L});
	public static final BitSet FOLLOW_qqTemplate_in_splicingUnquotation3115 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_splicingUnquotation3118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntaxDefinition_in_synpred1_R5RS294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_synpred2_R5RS319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_synpred3_R5RS350 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_synpred3_R5RS352 = new BitSet(new long[]{0xE000010800004000L,0x0182400810000001L});
	public static final BitSet FOLLOW_commandOrDefinition_in_synpred3_R5RS354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDefinition_in_synpred4_R5RS451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalDefinition_in_synpred5_R5RS463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_synpred6_R5RS1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_synpred7_R5RS1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lambdaExpression_in_synpred8_R5RS1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_synpred9_R5RS1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_synpred10_R5RS1152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derivedExpression_in_synpred11_R5RS1171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_synpred12_R5RS1183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroUse_in_synpred13_R5RS1199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_synpred14_R5RS1424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formals_in_synpred15_R5RS1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_synpred16_R5RS2390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred17_R5RS2791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_synpred18_R5RS2804 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_UNQUOTE_in_synpred18_R5RS2806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_synpred19_R5RS2948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_QUASIQUOTE_in_synpred19_R5RS2950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_synpred20_R5RS3046 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_synpred20_R5RS3048 = new BitSet(new long[]{0x0000000000000002L});
}
