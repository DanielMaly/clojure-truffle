// $ANTLR 3.5.2 R5RS.g3 2017-01-07 20:45:15

package parse;


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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARROW", "BEGIN", "CASE", 
		"CHARACTER", "CHARACTER_NAME", "COMMAND", "COMMENT", "COMPLEX_10", "COMPLEX_16", 
		"COMPLEX_2", "COMPLEX_8", "COND", "CONDCLAUSE", "DECIMAL_10", "DEFINE", 
		"DEFINE_SYNTAX", "DELAY", "DIGIT", "DIGIT_16", "DIGIT_2", "DIGIT_8", "DO", 
		"ELLIPSIS", "ELSE", "EMPTYFORMALS", "EXACTNESS", "EXPONENT_MARKER", "FALSE", 
		"FORMALDEF", "FORMALS", "IDENTIFIER", "IF", "INITIAL", "LAMBDA", "LET", 
		"LETREC", "LETREC_SYNTAX", "LETSTAR", "LETTER", "LET_SYNTAX", "LIST", 
		"LITERAL", "NUM_10", "NUM_16", "NUM_2", "NUM_8", "OR", "PECULIAR_IDENTIFIER", 
		"PREFIX_10", "PREFIX_16", "PREFIX_2", "PREFIX_8", "PROCEDURECALL", "QUASIQUOTE", 
		"QUOTATION", "QUOTE", "RADIX_10", "RADIX_16", "RADIX_2", "RADIX_8", "REAL_10", 
		"REAL_16", "REAL_2", "REAL_8", "SEQUENCE", "SET", "SIGN", "SPACE", "SPECIAL_INITIAL", 
		"SPECIAL_SUBSEQUENT", "STRING", "STRING_ELEMENT", "SUBSEQUENT", "SUFFIX", 
		"SYNTAXRULE", "SYNTAX_RULES", "TRUE", "UINTEGER_10", "UINTEGER_16", "UINTEGER_2", 
		"UINTEGER_8", "UNQUOTE", "UNQUOTE_SPLICING", "UREAL_10", "UREAL_16", "UREAL_2", 
		"UREAL_8", "VARIABLE", "'#('", "'('", "'()'", "')'", "','", "',@'", "'.'", 
		"'\\''", "'`'"
	};
	public static final int EOF=-1;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int AND=4;
	public static final int ARROW=5;
	public static final int BEGIN=6;
	public static final int CASE=7;
	public static final int CHARACTER=8;
	public static final int CHARACTER_NAME=9;
	public static final int COMMAND=10;
	public static final int COMMENT=11;
	public static final int COMPLEX_10=12;
	public static final int COMPLEX_16=13;
	public static final int COMPLEX_2=14;
	public static final int COMPLEX_8=15;
	public static final int COND=16;
	public static final int CONDCLAUSE=17;
	public static final int DECIMAL_10=18;
	public static final int DEFINE=19;
	public static final int DEFINE_SYNTAX=20;
	public static final int DELAY=21;
	public static final int DIGIT=22;
	public static final int DIGIT_16=23;
	public static final int DIGIT_2=24;
	public static final int DIGIT_8=25;
	public static final int DO=26;
	public static final int ELLIPSIS=27;
	public static final int ELSE=28;
	public static final int EMPTYFORMALS=29;
	public static final int EXACTNESS=30;
	public static final int EXPONENT_MARKER=31;
	public static final int FALSE=32;
	public static final int FORMALDEF=33;
	public static final int FORMALS=34;
	public static final int IDENTIFIER=35;
	public static final int IF=36;
	public static final int INITIAL=37;
	public static final int LAMBDA=38;
	public static final int LET=39;
	public static final int LETREC=40;
	public static final int LETREC_SYNTAX=41;
	public static final int LETSTAR=42;
	public static final int LETTER=43;
	public static final int LET_SYNTAX=44;
	public static final int LIST=45;
	public static final int LITERAL=46;
	public static final int NUM_10=47;
	public static final int NUM_16=48;
	public static final int NUM_2=49;
	public static final int NUM_8=50;
	public static final int OR=51;
	public static final int PECULIAR_IDENTIFIER=52;
	public static final int PREFIX_10=53;
	public static final int PREFIX_16=54;
	public static final int PREFIX_2=55;
	public static final int PREFIX_8=56;
	public static final int PROCEDURECALL=57;
	public static final int QUASIQUOTE=58;
	public static final int QUOTATION=59;
	public static final int QUOTE=60;
	public static final int RADIX_10=61;
	public static final int RADIX_16=62;
	public static final int RADIX_2=63;
	public static final int RADIX_8=64;
	public static final int REAL_10=65;
	public static final int REAL_16=66;
	public static final int REAL_2=67;
	public static final int REAL_8=68;
	public static final int SEQUENCE=69;
	public static final int SET=70;
	public static final int SIGN=71;
	public static final int SPACE=72;
	public static final int SPECIAL_INITIAL=73;
	public static final int SPECIAL_SUBSEQUENT=74;
	public static final int STRING=75;
	public static final int STRING_ELEMENT=76;
	public static final int SUBSEQUENT=77;
	public static final int SUFFIX=78;
	public static final int SYNTAXRULE=79;
	public static final int SYNTAX_RULES=80;
	public static final int TRUE=81;
	public static final int UINTEGER_10=82;
	public static final int UINTEGER_16=83;
	public static final int UINTEGER_2=84;
	public static final int UINTEGER_8=85;
	public static final int UNQUOTE=86;
	public static final int UNQUOTE_SPLICING=87;
	public static final int UREAL_10=88;
	public static final int UREAL_16=89;
	public static final int UREAL_2=90;
	public static final int UREAL_8=91;
	public static final int VARIABLE=92;

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
	// R5RS.g3:59:1: parse : ( commandOrDefinition )* EOF ;
	public final R5RSParser.parse_return parse() throws RecognitionException {
		R5RSParser.parse_return retval = new R5RSParser.parse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope commandOrDefinition1 =null;

		Object EOF2_tree=null;

		try {
			// R5RS.g3:60:3: ( ( commandOrDefinition )* EOF )
			// R5RS.g3:60:6: ( commandOrDefinition )* EOF
			{
			root_0 = (Object)adaptor.nil();


			// R5RS.g3:60:6: ( commandOrDefinition )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CHARACTER||LA1_0==ELLIPSIS||LA1_0==FALSE||(LA1_0 >= NUM_10 && LA1_0 <= NUM_8)||LA1_0==STRING||LA1_0==TRUE||LA1_0==VARIABLE||LA1_0==94||(LA1_0 >= 100 && LA1_0 <= 101)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// R5RS.g3:60:6: commandOrDefinition
					{
					pushFollow(FOLLOW_commandOrDefinition_in_parse143);
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

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse146); if (state.failed) return retval;
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
	// R5RS.g3:63:1: commandOrDefinition : ( ( syntaxDefinition )=> syntaxDefinition | ( definition )=> definition | ( '(' BEGIN commandOrDefinition )=> '(' ! BEGIN ^ ( commandOrDefinition )+ ')' !| command );
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
			// R5RS.g3:64:3: ( ( syntaxDefinition )=> syntaxDefinition | ( definition )=> definition | ( '(' BEGIN commandOrDefinition )=> '(' ! BEGIN ^ ( commandOrDefinition )+ ')' !| command )
			int alt3=4;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==94) ) {
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
			else if ( (LA3_0==CHARACTER||LA3_0==ELLIPSIS||LA3_0==FALSE||(LA3_0 >= NUM_10 && LA3_0 <= NUM_8)||LA3_0==STRING||LA3_0==TRUE||LA3_0==VARIABLE||(LA3_0 >= 100 && LA3_0 <= 101)) ) {
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
					// R5RS.g3:64:6: ( syntaxDefinition )=> syntaxDefinition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_syntaxDefinition_in_commandOrDefinition178);
					syntaxDefinition3=syntaxDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntaxDefinition3.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:65:6: ( definition )=> definition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_definition_in_commandOrDefinition209);
					definition4=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition4.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:66:6: ( '(' BEGIN commandOrDefinition )=> '(' ! BEGIN ^ ( commandOrDefinition )+ ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal5=(Token)match(input,94,FOLLOW_94_in_commandOrDefinition225); if (state.failed) return retval;
					BEGIN6=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_commandOrDefinition228); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BEGIN6_tree = new CommandDefinitionSequenceNode(BEGIN6) ;
					root_0 = (Object)adaptor.becomeRoot(BEGIN6_tree, root_0);
					}

					// R5RS.g3:66:83: ( commandOrDefinition )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==CHARACTER||LA2_0==ELLIPSIS||LA2_0==FALSE||(LA2_0 >= NUM_10 && LA2_0 <= NUM_8)||LA2_0==STRING||LA2_0==TRUE||LA2_0==VARIABLE||LA2_0==94||(LA2_0 >= 100 && LA2_0 <= 101)) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// R5RS.g3:66:83: commandOrDefinition
							{
							pushFollow(FOLLOW_commandOrDefinition_in_commandOrDefinition234);
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

					char_literal8=(Token)match(input,96,FOLLOW_96_in_commandOrDefinition237); if (state.failed) return retval;
					}
					break;
				case 4 :
					// R5RS.g3:67:40: command
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_in_commandOrDefinition279);
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
	// R5RS.g3:70:1: syntaxDefinition : '(' ! DEFINE_SYNTAX ^ keyword transformerSpec ')' !;
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
			// R5RS.g3:71:3: ( '(' ! DEFINE_SYNTAX ^ keyword transformerSpec ')' !)
			// R5RS.g3:71:6: '(' ! DEFINE_SYNTAX ^ keyword transformerSpec ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal10=(Token)match(input,94,FOLLOW_94_in_syntaxDefinition293); if (state.failed) return retval;
			DEFINE_SYNTAX11=(Token)match(input,DEFINE_SYNTAX,FOLLOW_DEFINE_SYNTAX_in_syntaxDefinition296); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEFINE_SYNTAX11_tree = (Object)adaptor.create(DEFINE_SYNTAX11);
			root_0 = (Object)adaptor.becomeRoot(DEFINE_SYNTAX11_tree, root_0);
			}

			pushFollow(FOLLOW_keyword_in_syntaxDefinition299);
			keyword12=keyword();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword12.getTree());

			pushFollow(FOLLOW_transformerSpec_in_syntaxDefinition301);
			transformerSpec13=transformerSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, transformerSpec13.getTree());

			char_literal14=(Token)match(input,96,FOLLOW_96_in_syntaxDefinition303); if (state.failed) return retval;
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
	// R5RS.g3:74:1: definition : ( ( simpleDefinition )=> simpleDefinition | ( formalDefinition )=> formalDefinition | '(' ! BEGIN ^ ( definition )* ')' !);
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
			// R5RS.g3:75:3: ( ( simpleDefinition )=> simpleDefinition | ( formalDefinition )=> formalDefinition | '(' ! BEGIN ^ ( definition )* ')' !)
			int alt5=3;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==94) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==DEFINE) ) {
					int LA5_2 = input.LA(3);
					if ( (LA5_2==VARIABLE) && (synpred4_R5RS())) {
						alt5=1;
					}
					else if ( (LA5_2==ELLIPSIS) && (synpred4_R5RS())) {
						alt5=1;
					}
					else if ( (LA5_2==94) && (synpred5_R5RS())) {
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
					// R5RS.g3:75:5: ( simpleDefinition )=> simpleDefinition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleDefinition_in_definition323);
					simpleDefinition15=simpleDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDefinition15.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:76:5: ( formalDefinition )=> formalDefinition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_formalDefinition_in_definition335);
					formalDefinition16=formalDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formalDefinition16.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:77:5: '(' ! BEGIN ^ ( definition )* ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal17=(Token)match(input,94,FOLLOW_94_in_definition341); if (state.failed) return retval;
					BEGIN18=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_definition344); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BEGIN18_tree = (Object)adaptor.create(BEGIN18);
					root_0 = (Object)adaptor.becomeRoot(BEGIN18_tree, root_0);
					}

					// R5RS.g3:77:17: ( definition )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==94) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// R5RS.g3:77:17: definition
							{
							pushFollow(FOLLOW_definition_in_definition347);
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

					char_literal20=(Token)match(input,96,FOLLOW_96_in_definition350); if (state.failed) return retval;
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
	// R5RS.g3:80:1: simpleDefinition : '(' ! DEFINE ^ variable expression ')' !;
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
			// R5RS.g3:81:3: ( '(' ! DEFINE ^ variable expression ')' !)
			// R5RS.g3:81:6: '(' ! DEFINE ^ variable expression ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal21=(Token)match(input,94,FOLLOW_94_in_simpleDefinition365); if (state.failed) return retval;
			DEFINE22=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_simpleDefinition368); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEFINE22_tree = (Object)adaptor.create(DEFINE22);
			root_0 = (Object)adaptor.becomeRoot(DEFINE22_tree, root_0);
			}

			pushFollow(FOLLOW_variable_in_simpleDefinition371);
			variable23=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable23.getTree());

			pushFollow(FOLLOW_expression_in_simpleDefinition373);
			expression24=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression24.getTree());

			char_literal25=(Token)match(input,96,FOLLOW_96_in_simpleDefinition375); if (state.failed) return retval;
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
	// R5RS.g3:84:1: formalDefinition : '(' ! DEFINE ^ formals body ')' !;
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
			// R5RS.g3:85:3: ( '(' ! DEFINE ^ formals body ')' !)
			// R5RS.g3:85:5: '(' ! DEFINE ^ formals body ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal26=(Token)match(input,94,FOLLOW_94_in_formalDefinition389); if (state.failed) return retval;
			DEFINE27=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_formalDefinition392); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEFINE27_tree = (Object)adaptor.create(DEFINE27);
			root_0 = (Object)adaptor.becomeRoot(DEFINE27_tree, root_0);
			}

			pushFollow(FOLLOW_formals_in_formalDefinition395);
			formals28=formals();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formals28.getTree());

			pushFollow(FOLLOW_body_in_formalDefinition397);
			body29=body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, body29.getTree());

			char_literal30=(Token)match(input,96,FOLLOW_96_in_formalDefinition399); if (state.failed) return retval;
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
	// R5RS.g3:88:1: formals : '(' ! variable ( variable )* ( '.' variable )? ')' !;
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
			// R5RS.g3:89:3: ( '(' ! variable ( variable )* ( '.' variable )? ')' !)
			// R5RS.g3:89:5: '(' ! variable ( variable )* ( '.' variable )? ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal31=(Token)match(input,94,FOLLOW_94_in_formals413); if (state.failed) return retval;
			pushFollow(FOLLOW_variable_in_formals416);
			variable32=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable32.getTree());

			// R5RS.g3:89:19: ( variable )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ELLIPSIS||LA6_0==VARIABLE) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// R5RS.g3:89:19: variable
					{
					pushFollow(FOLLOW_variable_in_formals418);
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

			// R5RS.g3:89:29: ( '.' variable )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==99) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// R5RS.g3:89:30: '.' variable
					{
					char_literal34=(Token)match(input,99,FOLLOW_99_in_formals422); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal34_tree = (Object)adaptor.create(char_literal34);
					adaptor.addChild(root_0, char_literal34_tree);
					}

					pushFollow(FOLLOW_variable_in_formals424);
					variable35=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable35.getTree());

					}
					break;

			}

			char_literal36=(Token)match(input,96,FOLLOW_96_in_formals428); if (state.failed) return retval;
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
	// R5RS.g3:92:1: keyword : identifier ;
	public final R5RSParser.keyword_return keyword() throws RecognitionException {
		R5RSParser.keyword_return retval = new R5RSParser.keyword_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope identifier37 =null;


		try {
			// R5RS.g3:93:3: ( identifier )
			// R5RS.g3:93:6: identifier
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_keyword443);
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
	// R5RS.g3:96:1: transformerSpec : '(' ! SYNTAX_RULES ^ '(' ! ( identifier )* ')' ! ( syntaxRule )* ')' !;
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
			// R5RS.g3:97:3: ( '(' ! SYNTAX_RULES ^ '(' ! ( identifier )* ')' ! ( syntaxRule )* ')' !)
			// R5RS.g3:97:6: '(' ! SYNTAX_RULES ^ '(' ! ( identifier )* ')' ! ( syntaxRule )* ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal38=(Token)match(input,94,FOLLOW_94_in_transformerSpec457); if (state.failed) return retval;
			SYNTAX_RULES39=(Token)match(input,SYNTAX_RULES,FOLLOW_SYNTAX_RULES_in_transformerSpec460); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SYNTAX_RULES39_tree = (Object)adaptor.create(SYNTAX_RULES39);
			root_0 = (Object)adaptor.becomeRoot(SYNTAX_RULES39_tree, root_0);
			}

			char_literal40=(Token)match(input,94,FOLLOW_94_in_transformerSpec463); if (state.failed) return retval;
			// R5RS.g3:97:30: ( identifier )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= AND && LA8_0 <= CASE)||LA8_0==COND||LA8_0==DEFINE||LA8_0==DELAY||(LA8_0 >= DO && LA8_0 <= ELSE)||LA8_0==IF||(LA8_0 >= LAMBDA && LA8_0 <= LETREC)||LA8_0==LETSTAR||LA8_0==OR||LA8_0==QUASIQUOTE||LA8_0==QUOTE||LA8_0==SET||(LA8_0 >= UNQUOTE && LA8_0 <= UNQUOTE_SPLICING)||LA8_0==VARIABLE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// R5RS.g3:97:30: identifier
					{
					pushFollow(FOLLOW_identifier_in_transformerSpec466);
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

			char_literal42=(Token)match(input,96,FOLLOW_96_in_transformerSpec469); if (state.failed) return retval;
			// R5RS.g3:97:47: ( syntaxRule )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==94) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// R5RS.g3:97:47: syntaxRule
					{
					pushFollow(FOLLOW_syntaxRule_in_transformerSpec472);
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

			char_literal44=(Token)match(input,96,FOLLOW_96_in_transformerSpec475); if (state.failed) return retval;
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
	// R5RS.g3:100:1: syntaxRule : '(' pattern template ')' -> ^( SYNTAXRULE pattern template ) ;
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
		RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleSubtreeStream stream_template=new RewriteRuleSubtreeStream(adaptor,"rule template");
		RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");

		try {
			// R5RS.g3:101:3: ( '(' pattern template ')' -> ^( SYNTAXRULE pattern template ) )
			// R5RS.g3:101:6: '(' pattern template ')'
			{
			char_literal45=(Token)match(input,94,FOLLOW_94_in_syntaxRule490); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_94.add(char_literal45);

			pushFollow(FOLLOW_pattern_in_syntaxRule492);
			pattern46=pattern();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_pattern.add(pattern46.getTree());
			pushFollow(FOLLOW_template_in_syntaxRule494);
			template47=template();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_template.add(template47.getTree());
			char_literal48=(Token)match(input,96,FOLLOW_96_in_syntaxRule496); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_96.add(char_literal48);

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
			// 101:31: -> ^( SYNTAXRULE pattern template )
			{
				// R5RS.g3:101:34: ^( SYNTAXRULE pattern template )
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
	// R5RS.g3:104:1: pattern : ( patternIdentifier | '(' ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )? ')' | '#(' ( ( pattern )+ ( ELLIPSIS )? )? ')' | patternDatum );
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
			// R5RS.g3:105:3: ( patternIdentifier | '(' ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )? ')' | '#(' ( ( pattern )+ ( ELLIPSIS )? )? ')' | patternDatum )
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
			case 94:
				{
				alt16=2;
				}
				break;
			case 93:
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
					// R5RS.g3:105:6: patternIdentifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_patternIdentifier_in_pattern520);
					patternIdentifier49=patternIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, patternIdentifier49.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:106:6: '(' ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal50=(Token)match(input,94,FOLLOW_94_in_pattern527); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal50_tree = (Object)adaptor.create(char_literal50);
					adaptor.addChild(root_0, char_literal50_tree);
					}

					// R5RS.g3:106:10: ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( ((LA12_0 >= AND && LA12_0 <= CHARACTER)||LA12_0==COND||LA12_0==DEFINE||LA12_0==DELAY||LA12_0==DO||LA12_0==ELSE||LA12_0==FALSE||LA12_0==IF||(LA12_0 >= LAMBDA && LA12_0 <= LETREC)||LA12_0==LETSTAR||(LA12_0 >= NUM_10 && LA12_0 <= OR)||LA12_0==QUASIQUOTE||LA12_0==QUOTE||LA12_0==SET||LA12_0==STRING||LA12_0==TRUE||(LA12_0 >= UNQUOTE && LA12_0 <= UNQUOTE_SPLICING)||(LA12_0 >= VARIABLE && LA12_0 <= 94)) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// R5RS.g3:106:11: ( pattern )+ ( '.' pattern | ELLIPSIS )?
							{
							// R5RS.g3:106:11: ( pattern )+
							int cnt10=0;
							loop10:
							while (true) {
								int alt10=2;
								int LA10_0 = input.LA(1);
								if ( ((LA10_0 >= AND && LA10_0 <= CHARACTER)||LA10_0==COND||LA10_0==DEFINE||LA10_0==DELAY||LA10_0==DO||LA10_0==ELSE||LA10_0==FALSE||LA10_0==IF||(LA10_0 >= LAMBDA && LA10_0 <= LETREC)||LA10_0==LETSTAR||(LA10_0 >= NUM_10 && LA10_0 <= OR)||LA10_0==QUASIQUOTE||LA10_0==QUOTE||LA10_0==SET||LA10_0==STRING||LA10_0==TRUE||(LA10_0 >= UNQUOTE && LA10_0 <= UNQUOTE_SPLICING)||(LA10_0 >= VARIABLE && LA10_0 <= 94)) ) {
									alt10=1;
								}

								switch (alt10) {
								case 1 :
									// R5RS.g3:106:11: pattern
									{
									pushFollow(FOLLOW_pattern_in_pattern530);
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

							// R5RS.g3:106:20: ( '.' pattern | ELLIPSIS )?
							int alt11=3;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==99) ) {
								alt11=1;
							}
							else if ( (LA11_0==ELLIPSIS) ) {
								alt11=2;
							}
							switch (alt11) {
								case 1 :
									// R5RS.g3:106:21: '.' pattern
									{
									char_literal52=(Token)match(input,99,FOLLOW_99_in_pattern534); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal52_tree = (Object)adaptor.create(char_literal52);
									adaptor.addChild(root_0, char_literal52_tree);
									}

									pushFollow(FOLLOW_pattern_in_pattern536);
									pattern53=pattern();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern53.getTree());

									}
									break;
								case 2 :
									// R5RS.g3:106:35: ELLIPSIS
									{
									ELLIPSIS54=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_pattern540); if (state.failed) return retval;
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

					char_literal55=(Token)match(input,96,FOLLOW_96_in_pattern547); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal55_tree = (Object)adaptor.create(char_literal55);
					adaptor.addChild(root_0, char_literal55_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:107:6: '#(' ( ( pattern )+ ( ELLIPSIS )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal56=(Token)match(input,93,FOLLOW_93_in_pattern554); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal56_tree = (Object)adaptor.create(string_literal56);
					adaptor.addChild(root_0, string_literal56_tree);
					}

					// R5RS.g3:107:11: ( ( pattern )+ ( ELLIPSIS )? )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( ((LA15_0 >= AND && LA15_0 <= CHARACTER)||LA15_0==COND||LA15_0==DEFINE||LA15_0==DELAY||LA15_0==DO||LA15_0==ELSE||LA15_0==FALSE||LA15_0==IF||(LA15_0 >= LAMBDA && LA15_0 <= LETREC)||LA15_0==LETSTAR||(LA15_0 >= NUM_10 && LA15_0 <= OR)||LA15_0==QUASIQUOTE||LA15_0==QUOTE||LA15_0==SET||LA15_0==STRING||LA15_0==TRUE||(LA15_0 >= UNQUOTE && LA15_0 <= UNQUOTE_SPLICING)||(LA15_0 >= VARIABLE && LA15_0 <= 94)) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// R5RS.g3:107:12: ( pattern )+ ( ELLIPSIS )?
							{
							// R5RS.g3:107:12: ( pattern )+
							int cnt13=0;
							loop13:
							while (true) {
								int alt13=2;
								int LA13_0 = input.LA(1);
								if ( ((LA13_0 >= AND && LA13_0 <= CHARACTER)||LA13_0==COND||LA13_0==DEFINE||LA13_0==DELAY||LA13_0==DO||LA13_0==ELSE||LA13_0==FALSE||LA13_0==IF||(LA13_0 >= LAMBDA && LA13_0 <= LETREC)||LA13_0==LETSTAR||(LA13_0 >= NUM_10 && LA13_0 <= OR)||LA13_0==QUASIQUOTE||LA13_0==QUOTE||LA13_0==SET||LA13_0==STRING||LA13_0==TRUE||(LA13_0 >= UNQUOTE && LA13_0 <= UNQUOTE_SPLICING)||(LA13_0 >= VARIABLE && LA13_0 <= 94)) ) {
									alt13=1;
								}

								switch (alt13) {
								case 1 :
									// R5RS.g3:107:12: pattern
									{
									pushFollow(FOLLOW_pattern_in_pattern557);
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

							// R5RS.g3:107:21: ( ELLIPSIS )?
							int alt14=2;
							int LA14_0 = input.LA(1);
							if ( (LA14_0==ELLIPSIS) ) {
								alt14=1;
							}
							switch (alt14) {
								case 1 :
									// R5RS.g3:107:21: ELLIPSIS
									{
									ELLIPSIS58=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_pattern560); if (state.failed) return retval;
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

					char_literal59=(Token)match(input,96,FOLLOW_96_in_pattern566); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal59_tree = (Object)adaptor.create(char_literal59);
					adaptor.addChild(root_0, char_literal59_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:108:6: patternDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_patternDatum_in_pattern573);
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
	// R5RS.g3:111:1: patternIdentifier : ( syntacticKeyword | VARIABLE );
	public final R5RSParser.patternIdentifier_return patternIdentifier() throws RecognitionException {
		R5RSParser.patternIdentifier_return retval = new R5RSParser.patternIdentifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE62=null;
		ParserRuleReturnScope syntacticKeyword61 =null;

		Object VARIABLE62_tree=null;

		try {
			// R5RS.g3:112:3: ( syntacticKeyword | VARIABLE )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= AND && LA17_0 <= CASE)||LA17_0==COND||LA17_0==DEFINE||LA17_0==DELAY||LA17_0==DO||LA17_0==ELSE||LA17_0==IF||(LA17_0 >= LAMBDA && LA17_0 <= LETREC)||LA17_0==LETSTAR||LA17_0==OR||LA17_0==QUASIQUOTE||LA17_0==QUOTE||LA17_0==SET||(LA17_0 >= UNQUOTE && LA17_0 <= UNQUOTE_SPLICING)) ) {
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
					// R5RS.g3:112:6: syntacticKeyword
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_syntacticKeyword_in_patternIdentifier587);
					syntacticKeyword61=syntacticKeyword();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntacticKeyword61.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:113:6: VARIABLE
					{
					root_0 = (Object)adaptor.nil();


					VARIABLE62=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_patternIdentifier594); if (state.failed) return retval;
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
	// R5RS.g3:116:1: patternDatum : ( STRING | CHARACTER | bool | number );
	public final R5RSParser.patternDatum_return patternDatum() throws RecognitionException {
		R5RSParser.patternDatum_return retval = new R5RSParser.patternDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING63=null;
		Token CHARACTER64=null;
		ParserRuleReturnScope bool65 =null;
		ParserRuleReturnScope number66 =null;

		Object STRING63_tree=null;
		Object CHARACTER64_tree=null;

		try {
			// R5RS.g3:117:3: ( STRING | CHARACTER | bool | number )
			int alt18=4;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt18=1;
				}
				break;
			case CHARACTER:
				{
				alt18=2;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt18=3;
				}
				break;
			case NUM_10:
			case NUM_16:
			case NUM_2:
			case NUM_8:
				{
				alt18=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// R5RS.g3:117:6: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING63=(Token)match(input,STRING,FOLLOW_STRING_in_patternDatum608); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING63_tree = (Object)adaptor.create(STRING63);
					adaptor.addChild(root_0, STRING63_tree);
					}

					}
					break;
				case 2 :
					// R5RS.g3:118:6: CHARACTER
					{
					root_0 = (Object)adaptor.nil();


					CHARACTER64=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_patternDatum615); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHARACTER64_tree = (Object)adaptor.create(CHARACTER64);
					adaptor.addChild(root_0, CHARACTER64_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:119:6: bool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_in_patternDatum622);
					bool65=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool65.getTree());

					}
					break;
				case 4 :
					// R5RS.g3:120:6: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_patternDatum629);
					number66=number();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number66.getTree());

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
	// $ANTLR end "patternDatum"


	public static class template_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "template"
	// R5RS.g3:123:1: template : ( patternIdentifier | '(' ( ( templateElement )+ ( '.' templateElement )? )? ')' | '#(' ( templateElement )* ')' | templateDatum );
	public final R5RSParser.template_return template() throws RecognitionException {
		R5RSParser.template_return retval = new R5RSParser.template_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal68=null;
		Token char_literal70=null;
		Token char_literal72=null;
		Token string_literal73=null;
		Token char_literal75=null;
		ParserRuleReturnScope patternIdentifier67 =null;
		ParserRuleReturnScope templateElement69 =null;
		ParserRuleReturnScope templateElement71 =null;
		ParserRuleReturnScope templateElement74 =null;
		ParserRuleReturnScope templateDatum76 =null;

		Object char_literal68_tree=null;
		Object char_literal70_tree=null;
		Object char_literal72_tree=null;
		Object string_literal73_tree=null;
		Object char_literal75_tree=null;

		try {
			// R5RS.g3:124:3: ( patternIdentifier | '(' ( ( templateElement )+ ( '.' templateElement )? )? ')' | '#(' ( templateElement )* ')' | templateDatum )
			int alt23=4;
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
				alt23=1;
				}
				break;
			case 94:
				{
				alt23=2;
				}
				break;
			case 93:
				{
				alt23=3;
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
				alt23=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// R5RS.g3:124:6: patternIdentifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_patternIdentifier_in_template643);
					patternIdentifier67=patternIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, patternIdentifier67.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:125:6: '(' ( ( templateElement )+ ( '.' templateElement )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal68=(Token)match(input,94,FOLLOW_94_in_template650); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal68_tree = (Object)adaptor.create(char_literal68);
					adaptor.addChild(root_0, char_literal68_tree);
					}

					// R5RS.g3:125:10: ( ( templateElement )+ ( '.' templateElement )? )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( ((LA21_0 >= AND && LA21_0 <= CHARACTER)||LA21_0==COND||LA21_0==DEFINE||LA21_0==DELAY||LA21_0==DO||LA21_0==ELSE||LA21_0==FALSE||LA21_0==IF||(LA21_0 >= LAMBDA && LA21_0 <= LETREC)||LA21_0==LETSTAR||(LA21_0 >= NUM_10 && LA21_0 <= OR)||LA21_0==QUASIQUOTE||LA21_0==QUOTE||LA21_0==SET||LA21_0==STRING||LA21_0==TRUE||(LA21_0 >= UNQUOTE && LA21_0 <= UNQUOTE_SPLICING)||(LA21_0 >= VARIABLE && LA21_0 <= 94)) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// R5RS.g3:125:11: ( templateElement )+ ( '.' templateElement )?
							{
							// R5RS.g3:125:11: ( templateElement )+
							int cnt19=0;
							loop19:
							while (true) {
								int alt19=2;
								int LA19_0 = input.LA(1);
								if ( ((LA19_0 >= AND && LA19_0 <= CHARACTER)||LA19_0==COND||LA19_0==DEFINE||LA19_0==DELAY||LA19_0==DO||LA19_0==ELSE||LA19_0==FALSE||LA19_0==IF||(LA19_0 >= LAMBDA && LA19_0 <= LETREC)||LA19_0==LETSTAR||(LA19_0 >= NUM_10 && LA19_0 <= OR)||LA19_0==QUASIQUOTE||LA19_0==QUOTE||LA19_0==SET||LA19_0==STRING||LA19_0==TRUE||(LA19_0 >= UNQUOTE && LA19_0 <= UNQUOTE_SPLICING)||(LA19_0 >= VARIABLE && LA19_0 <= 94)) ) {
									alt19=1;
								}

								switch (alt19) {
								case 1 :
									// R5RS.g3:125:11: templateElement
									{
									pushFollow(FOLLOW_templateElement_in_template653);
									templateElement69=templateElement();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, templateElement69.getTree());

									}
									break;

								default :
									if ( cnt19 >= 1 ) break loop19;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(19, input);
									throw eee;
								}
								cnt19++;
							}

							// R5RS.g3:125:28: ( '.' templateElement )?
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==99) ) {
								alt20=1;
							}
							switch (alt20) {
								case 1 :
									// R5RS.g3:125:29: '.' templateElement
									{
									char_literal70=(Token)match(input,99,FOLLOW_99_in_template657); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal70_tree = (Object)adaptor.create(char_literal70);
									adaptor.addChild(root_0, char_literal70_tree);
									}

									pushFollow(FOLLOW_templateElement_in_template659);
									templateElement71=templateElement();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, templateElement71.getTree());

									}
									break;

							}

							}
							break;

					}

					char_literal72=(Token)match(input,96,FOLLOW_96_in_template665); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal72_tree = (Object)adaptor.create(char_literal72);
					adaptor.addChild(root_0, char_literal72_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:126:6: '#(' ( templateElement )* ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal73=(Token)match(input,93,FOLLOW_93_in_template672); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal73_tree = (Object)adaptor.create(string_literal73);
					adaptor.addChild(root_0, string_literal73_tree);
					}

					// R5RS.g3:126:11: ( templateElement )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( ((LA22_0 >= AND && LA22_0 <= CHARACTER)||LA22_0==COND||LA22_0==DEFINE||LA22_0==DELAY||LA22_0==DO||LA22_0==ELSE||LA22_0==FALSE||LA22_0==IF||(LA22_0 >= LAMBDA && LA22_0 <= LETREC)||LA22_0==LETSTAR||(LA22_0 >= NUM_10 && LA22_0 <= OR)||LA22_0==QUASIQUOTE||LA22_0==QUOTE||LA22_0==SET||LA22_0==STRING||LA22_0==TRUE||(LA22_0 >= UNQUOTE && LA22_0 <= UNQUOTE_SPLICING)||(LA22_0 >= VARIABLE && LA22_0 <= 94)) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// R5RS.g3:126:11: templateElement
							{
							pushFollow(FOLLOW_templateElement_in_template674);
							templateElement74=templateElement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, templateElement74.getTree());

							}
							break;

						default :
							break loop22;
						}
					}

					char_literal75=(Token)match(input,96,FOLLOW_96_in_template677); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal75_tree = (Object)adaptor.create(char_literal75);
					adaptor.addChild(root_0, char_literal75_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:127:6: templateDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_templateDatum_in_template684);
					templateDatum76=templateDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, templateDatum76.getTree());

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
	// R5RS.g3:130:1: templateElement : template ( ELLIPSIS )? ;
	public final R5RSParser.templateElement_return templateElement() throws RecognitionException {
		R5RSParser.templateElement_return retval = new R5RSParser.templateElement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELLIPSIS78=null;
		ParserRuleReturnScope template77 =null;

		Object ELLIPSIS78_tree=null;

		try {
			// R5RS.g3:131:3: ( template ( ELLIPSIS )? )
			// R5RS.g3:131:6: template ( ELLIPSIS )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_template_in_templateElement698);
			template77=template();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, template77.getTree());

			// R5RS.g3:131:15: ( ELLIPSIS )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==ELLIPSIS) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// R5RS.g3:131:15: ELLIPSIS
					{
					ELLIPSIS78=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_templateElement700); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELLIPSIS78_tree = (Object)adaptor.create(ELLIPSIS78);
					adaptor.addChild(root_0, ELLIPSIS78_tree);
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
	// R5RS.g3:134:1: templateDatum : patternDatum ;
	public final R5RSParser.templateDatum_return templateDatum() throws RecognitionException {
		R5RSParser.templateDatum_return retval = new R5RSParser.templateDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope patternDatum79 =null;


		try {
			// R5RS.g3:135:3: ( patternDatum )
			// R5RS.g3:135:6: patternDatum
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_patternDatum_in_templateDatum715);
			patternDatum79=patternDatum();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, patternDatum79.getTree());

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
	// R5RS.g3:138:1: command : expression -> ^( COMMAND expression ) ;
	public final R5RSParser.command_return command() throws RecognitionException {
		R5RSParser.command_return retval = new R5RSParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression80 =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// R5RS.g3:139:3: ( expression -> ^( COMMAND expression ) )
			// R5RS.g3:139:6: expression
			{
			pushFollow(FOLLOW_expression_in_command729);
			expression80=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression80.getTree());
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
			// 139:17: -> ^( COMMAND expression )
			{
				// R5RS.g3:139:20: ^( COMMAND expression )
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
	// R5RS.g3:142:1: identifier : ( syntacticKeyword -> ^( IDENTIFIER syntacticKeyword ) | variable -> ^( IDENTIFIER variable ) );
	public final R5RSParser.identifier_return identifier() throws RecognitionException {
		R5RSParser.identifier_return retval = new R5RSParser.identifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope syntacticKeyword81 =null;
		ParserRuleReturnScope variable82 =null;

		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
		RewriteRuleSubtreeStream stream_syntacticKeyword=new RewriteRuleSubtreeStream(adaptor,"rule syntacticKeyword");

		try {
			// R5RS.g3:143:3: ( syntacticKeyword -> ^( IDENTIFIER syntacticKeyword ) | variable -> ^( IDENTIFIER variable ) )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( ((LA25_0 >= AND && LA25_0 <= CASE)||LA25_0==COND||LA25_0==DEFINE||LA25_0==DELAY||LA25_0==DO||LA25_0==ELSE||LA25_0==IF||(LA25_0 >= LAMBDA && LA25_0 <= LETREC)||LA25_0==LETSTAR||LA25_0==OR||LA25_0==QUASIQUOTE||LA25_0==QUOTE||LA25_0==SET||(LA25_0 >= UNQUOTE && LA25_0 <= UNQUOTE_SPLICING)) ) {
				alt25=1;
			}
			else if ( (LA25_0==ELLIPSIS||LA25_0==VARIABLE) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// R5RS.g3:143:6: syntacticKeyword
					{
					pushFollow(FOLLOW_syntacticKeyword_in_identifier751);
					syntacticKeyword81=syntacticKeyword();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_syntacticKeyword.add(syntacticKeyword81.getTree());
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
					// 143:23: -> ^( IDENTIFIER syntacticKeyword )
					{
						// R5RS.g3:143:26: ^( IDENTIFIER syntacticKeyword )
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
					// R5RS.g3:144:6: variable
					{
					pushFollow(FOLLOW_variable_in_identifier766);
					variable82=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variable.add(variable82.getTree());
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
					// 144:15: -> ^( IDENTIFIER variable )
					{
						// R5RS.g3:144:18: ^( IDENTIFIER variable )
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
	// R5RS.g3:147:1: syntacticKeyword : ( expressionKeyword | ELSE | ARROW | DEFINE | UNQUOTE | UNQUOTE_SPLICING );
	public final R5RSParser.syntacticKeyword_return syntacticKeyword() throws RecognitionException {
		R5RSParser.syntacticKeyword_return retval = new R5RSParser.syntacticKeyword_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSE84=null;
		Token ARROW85=null;
		Token DEFINE86=null;
		Token UNQUOTE87=null;
		Token UNQUOTE_SPLICING88=null;
		ParserRuleReturnScope expressionKeyword83 =null;

		Object ELSE84_tree=null;
		Object ARROW85_tree=null;
		Object DEFINE86_tree=null;
		Object UNQUOTE87_tree=null;
		Object UNQUOTE_SPLICING88_tree=null;

		try {
			// R5RS.g3:148:3: ( expressionKeyword | ELSE | ARROW | DEFINE | UNQUOTE | UNQUOTE_SPLICING )
			int alt26=6;
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
				alt26=1;
				}
				break;
			case ELSE:
				{
				alt26=2;
				}
				break;
			case ARROW:
				{
				alt26=3;
				}
				break;
			case DEFINE:
				{
				alt26=4;
				}
				break;
			case UNQUOTE:
				{
				alt26=5;
				}
				break;
			case UNQUOTE_SPLICING:
				{
				alt26=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// R5RS.g3:148:6: expressionKeyword
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expressionKeyword_in_syntacticKeyword788);
					expressionKeyword83=expressionKeyword();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionKeyword83.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:149:6: ELSE
					{
					root_0 = (Object)adaptor.nil();


					ELSE84=(Token)match(input,ELSE,FOLLOW_ELSE_in_syntacticKeyword795); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELSE84_tree = (Object)adaptor.create(ELSE84);
					adaptor.addChild(root_0, ELSE84_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:150:6: ARROW
					{
					root_0 = (Object)adaptor.nil();


					ARROW85=(Token)match(input,ARROW,FOLLOW_ARROW_in_syntacticKeyword802); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ARROW85_tree = (Object)adaptor.create(ARROW85);
					adaptor.addChild(root_0, ARROW85_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:151:6: DEFINE
					{
					root_0 = (Object)adaptor.nil();


					DEFINE86=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_syntacticKeyword809); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DEFINE86_tree = (Object)adaptor.create(DEFINE86);
					adaptor.addChild(root_0, DEFINE86_tree);
					}

					}
					break;
				case 5 :
					// R5RS.g3:152:6: UNQUOTE
					{
					root_0 = (Object)adaptor.nil();


					UNQUOTE87=(Token)match(input,UNQUOTE,FOLLOW_UNQUOTE_in_syntacticKeyword816); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE87_tree = (Object)adaptor.create(UNQUOTE87);
					adaptor.addChild(root_0, UNQUOTE87_tree);
					}

					}
					break;
				case 6 :
					// R5RS.g3:153:6: UNQUOTE_SPLICING
					{
					root_0 = (Object)adaptor.nil();


					UNQUOTE_SPLICING88=(Token)match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_syntacticKeyword823); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE_SPLICING88_tree = (Object)adaptor.create(UNQUOTE_SPLICING88);
					adaptor.addChild(root_0, UNQUOTE_SPLICING88_tree);
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
	// R5RS.g3:156:1: expressionKeyword : ( QUOTE | LAMBDA | IF | SET | BEGIN | COND | AND | OR | CASE | LET | LETSTAR | LETREC | DO | DELAY | QUASIQUOTE );
	public final R5RSParser.expressionKeyword_return expressionKeyword() throws RecognitionException {
		R5RSParser.expressionKeyword_return retval = new R5RSParser.expressionKeyword_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set89=null;

		Object set89_tree=null;

		try {
			// R5RS.g3:157:3: ( QUOTE | LAMBDA | IF | SET | BEGIN | COND | AND | OR | CASE | LET | LETSTAR | LETREC | DO | DELAY | QUASIQUOTE )
			// R5RS.g3:
			{
			root_0 = (Object)adaptor.nil();


			set89=input.LT(1);
			if ( input.LA(1)==AND||(input.LA(1) >= BEGIN && input.LA(1) <= CASE)||input.LA(1)==COND||input.LA(1)==DELAY||input.LA(1)==DO||input.LA(1)==IF||(input.LA(1) >= LAMBDA && input.LA(1) <= LETREC)||input.LA(1)==LETSTAR||input.LA(1)==OR||input.LA(1)==QUASIQUOTE||input.LA(1)==QUOTE||input.LA(1)==SET ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set89));
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
	// R5RS.g3:174:1: expression : ( ( variable )=> variable | ( literal )=> literal -> ^( LITERAL literal ) | ( lambdaExpression )=> lambdaExpression | ( conditional )=> conditional | ( assignment )=> assignment | ( derivedExpression )=> derivedExpression | ( procedureCall )=> procedureCall | ( macroUse )=> macroUse | macroBlock );
	public final R5RSParser.expression_return expression() throws RecognitionException {
		R5RSParser.expression_return retval = new R5RSParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope variable90 =null;
		ParserRuleReturnScope literal91 =null;
		ParserRuleReturnScope lambdaExpression92 =null;
		ParserRuleReturnScope conditional93 =null;
		ParserRuleReturnScope assignment94 =null;
		ParserRuleReturnScope derivedExpression95 =null;
		ParserRuleReturnScope procedureCall96 =null;
		ParserRuleReturnScope macroUse97 =null;
		ParserRuleReturnScope macroBlock98 =null;

		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			// R5RS.g3:175:3: ( ( variable )=> variable | ( literal )=> literal -> ^( LITERAL literal ) | ( lambdaExpression )=> lambdaExpression | ( conditional )=> conditional | ( assignment )=> assignment | ( derivedExpression )=> derivedExpression | ( procedureCall )=> procedureCall | ( macroUse )=> macroUse | macroBlock )
			int alt27=9;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==VARIABLE) && (synpred6_R5RS())) {
				alt27=1;
			}
			else if ( (LA27_0==ELLIPSIS) && (synpred6_R5RS())) {
				alt27=1;
			}
			else if ( (LA27_0==100) && (synpred7_R5RS())) {
				alt27=2;
			}
			else if ( (LA27_0==94) ) {
				int LA27_4 = input.LA(2);
				if ( (synpred7_R5RS()) ) {
					alt27=2;
				}
				else if ( (synpred8_R5RS()) ) {
					alt27=3;
				}
				else if ( (synpred9_R5RS()) ) {
					alt27=4;
				}
				else if ( (synpred10_R5RS()) ) {
					alt27=5;
				}
				else if ( (synpred11_R5RS()) ) {
					alt27=6;
				}
				else if ( (synpred12_R5RS()) ) {
					alt27=7;
				}
				else if ( (synpred13_R5RS()) ) {
					alt27=8;
				}
				else if ( (true) ) {
					alt27=9;
				}

			}
			else if ( (LA27_0==FALSE||LA27_0==TRUE) && (synpred7_R5RS())) {
				alt27=2;
			}
			else if ( ((LA27_0 >= NUM_10 && LA27_0 <= NUM_8)) && (synpred7_R5RS())) {
				alt27=2;
			}
			else if ( (LA27_0==CHARACTER) && (synpred7_R5RS())) {
				alt27=2;
			}
			else if ( (LA27_0==STRING) && (synpred7_R5RS())) {
				alt27=2;
			}
			else if ( (LA27_0==101) && (synpred11_R5RS())) {
				alt27=6;
			}

			switch (alt27) {
				case 1 :
					// R5RS.g3:175:6: ( variable )=> variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_expression967);
					variable90=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable90.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:176:6: ( literal )=> literal
					{
					pushFollow(FOLLOW_literal_in_expression989);
					literal91=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_literal.add(literal91.getTree());
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
					// 176:36: -> ^( LITERAL literal )
					{
						// R5RS.g3:176:39: ^( LITERAL literal )
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
					// R5RS.g3:177:6: ( lambdaExpression )=> lambdaExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lambdaExpression_in_expression1010);
					lambdaExpression92=lambdaExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lambdaExpression92.getTree());

					}
					break;
				case 4 :
					// R5RS.g3:178:6: ( conditional )=> conditional
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_conditional_in_expression1028);
					conditional93=conditional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional93.getTree());

					}
					break;
				case 5 :
					// R5RS.g3:179:6: ( assignment )=> assignment
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_expression1047);
					assignment94=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment94.getTree());

					}
					break;
				case 6 :
					// R5RS.g3:180:6: ( derivedExpression )=> derivedExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_derivedExpression_in_expression1059);
					derivedExpression95=derivedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, derivedExpression95.getTree());

					}
					break;
				case 7 :
					// R5RS.g3:181:6: ( procedureCall )=> procedureCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureCall_in_expression1075);
					procedureCall96=procedureCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall96.getTree());

					}
					break;
				case 8 :
					// R5RS.g3:182:6: ( macroUse )=> macroUse
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_macroUse_in_expression1096);
					macroUse97=macroUse();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, macroUse97.getTree());

					}
					break;
				case 9 :
					// R5RS.g3:183:28: macroBlock
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_macroBlock_in_expression1125);
					macroBlock98=macroBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, macroBlock98.getTree());

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
	// R5RS.g3:186:1: variable : ( VARIABLE ^| ELLIPSIS ^);
	public final R5RSParser.variable_return variable() throws RecognitionException {
		R5RSParser.variable_return retval = new R5RSParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE99=null;
		Token ELLIPSIS100=null;

		Object VARIABLE99_tree=null;
		Object ELLIPSIS100_tree=null;

		try {
			// R5RS.g3:187:3: ( VARIABLE ^| ELLIPSIS ^)
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==VARIABLE) ) {
				alt28=1;
			}
			else if ( (LA28_0==ELLIPSIS) ) {
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
					// R5RS.g3:187:6: VARIABLE ^
					{
					root_0 = (Object)adaptor.nil();


					VARIABLE99=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_variable1139); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE99_tree = new VariableNode(VARIABLE99) ;
					root_0 = (Object)adaptor.becomeRoot(VARIABLE99_tree, root_0);
					}

					}
					break;
				case 2 :
					// R5RS.g3:188:6: ELLIPSIS ^
					{
					root_0 = (Object)adaptor.nil();


					ELLIPSIS100=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_variable1150); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELLIPSIS100_tree = (Object)adaptor.create(ELLIPSIS100);
					root_0 = (Object)adaptor.becomeRoot(ELLIPSIS100_tree, root_0);
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
	// R5RS.g3:191:1: literal : ( quotation -> ^( QUOTATION quotation ) | selfEvaluating );
	public final R5RSParser.literal_return literal() throws RecognitionException {
		R5RSParser.literal_return retval = new R5RSParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope quotation101 =null;
		ParserRuleReturnScope selfEvaluating102 =null;

		RewriteRuleSubtreeStream stream_quotation=new RewriteRuleSubtreeStream(adaptor,"rule quotation");

		try {
			// R5RS.g3:192:3: ( quotation -> ^( QUOTATION quotation ) | selfEvaluating )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==94||LA29_0==100) ) {
				alt29=1;
			}
			else if ( (LA29_0==CHARACTER||LA29_0==FALSE||(LA29_0 >= NUM_10 && LA29_0 <= NUM_8)||LA29_0==STRING||LA29_0==TRUE) ) {
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
					// R5RS.g3:192:6: quotation
					{
					pushFollow(FOLLOW_quotation_in_literal1165);
					quotation101=quotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_quotation.add(quotation101.getTree());
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
					// 192:16: -> ^( QUOTATION quotation )
					{
						// R5RS.g3:192:19: ^( QUOTATION quotation )
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
					// R5RS.g3:193:6: selfEvaluating
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_selfEvaluating_in_literal1180);
					selfEvaluating102=selfEvaluating();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, selfEvaluating102.getTree());

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
	// R5RS.g3:196:1: quotation : ( '\\'' ! datum | '(' QUOTE datum ')' );
	public final R5RSParser.quotation_return quotation() throws RecognitionException {
		R5RSParser.quotation_return retval = new R5RSParser.quotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal103=null;
		Token char_literal105=null;
		Token QUOTE106=null;
		Token char_literal108=null;
		ParserRuleReturnScope datum104 =null;
		ParserRuleReturnScope datum107 =null;

		Object char_literal103_tree=null;
		Object char_literal105_tree=null;
		Object QUOTE106_tree=null;
		Object char_literal108_tree=null;

		try {
			// R5RS.g3:197:3: ( '\\'' ! datum | '(' QUOTE datum ')' )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==100) ) {
				alt30=1;
			}
			else if ( (LA30_0==94) ) {
				alt30=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// R5RS.g3:197:6: '\\'' ! datum
					{
					root_0 = (Object)adaptor.nil();


					char_literal103=(Token)match(input,100,FOLLOW_100_in_quotation1194); if (state.failed) return retval;
					pushFollow(FOLLOW_datum_in_quotation1197);
					datum104=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum104.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:198:6: '(' QUOTE datum ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal105=(Token)match(input,94,FOLLOW_94_in_quotation1204); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal105_tree = (Object)adaptor.create(char_literal105);
					adaptor.addChild(root_0, char_literal105_tree);
					}

					QUOTE106=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_quotation1206); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					QUOTE106_tree = (Object)adaptor.create(QUOTE106);
					adaptor.addChild(root_0, QUOTE106_tree);
					}

					pushFollow(FOLLOW_datum_in_quotation1208);
					datum107=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum107.getTree());

					char_literal108=(Token)match(input,96,FOLLOW_96_in_quotation1210); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal108_tree = (Object)adaptor.create(char_literal108);
					adaptor.addChild(root_0, char_literal108_tree);
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
	// R5RS.g3:201:1: selfEvaluating : ( bool | number | CHARACTER | STRING );
	public final R5RSParser.selfEvaluating_return selfEvaluating() throws RecognitionException {
		R5RSParser.selfEvaluating_return retval = new R5RSParser.selfEvaluating_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHARACTER111=null;
		Token STRING112=null;
		ParserRuleReturnScope bool109 =null;
		ParserRuleReturnScope number110 =null;

		Object CHARACTER111_tree=null;
		Object STRING112_tree=null;

		try {
			// R5RS.g3:202:3: ( bool | number | CHARACTER | STRING )
			int alt31=4;
			switch ( input.LA(1) ) {
			case FALSE:
			case TRUE:
				{
				alt31=1;
				}
				break;
			case NUM_10:
			case NUM_16:
			case NUM_2:
			case NUM_8:
				{
				alt31=2;
				}
				break;
			case CHARACTER:
				{
				alt31=3;
				}
				break;
			case STRING:
				{
				alt31=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// R5RS.g3:202:6: bool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_in_selfEvaluating1224);
					bool109=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool109.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:203:6: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_selfEvaluating1231);
					number110=number();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number110.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:204:6: CHARACTER
					{
					root_0 = (Object)adaptor.nil();


					CHARACTER111=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_selfEvaluating1238); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHARACTER111_tree = (Object)adaptor.create(CHARACTER111);
					adaptor.addChild(root_0, CHARACTER111_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:205:6: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING112=(Token)match(input,STRING,FOLLOW_STRING_in_selfEvaluating1245); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING112_tree = (Object)adaptor.create(STRING112);
					adaptor.addChild(root_0, STRING112_tree);
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
	// R5RS.g3:208:1: lambdaExpression : '(' ! LAMBDA ^ lambdaformals body ')' !;
	public final R5RSParser.lambdaExpression_return lambdaExpression() throws RecognitionException {
		R5RSParser.lambdaExpression_return retval = new R5RSParser.lambdaExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal113=null;
		Token LAMBDA114=null;
		Token char_literal117=null;
		ParserRuleReturnScope lambdaformals115 =null;
		ParserRuleReturnScope body116 =null;

		Object char_literal113_tree=null;
		Object LAMBDA114_tree=null;
		Object char_literal117_tree=null;

		try {
			// R5RS.g3:209:3: ( '(' ! LAMBDA ^ lambdaformals body ')' !)
			// R5RS.g3:209:6: '(' ! LAMBDA ^ lambdaformals body ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal113=(Token)match(input,94,FOLLOW_94_in_lambdaExpression1259); if (state.failed) return retval;
			LAMBDA114=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambdaExpression1262); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LAMBDA114_tree = (Object)adaptor.create(LAMBDA114);
			root_0 = (Object)adaptor.becomeRoot(LAMBDA114_tree, root_0);
			}

			pushFollow(FOLLOW_lambdaformals_in_lambdaExpression1265);
			lambdaformals115=lambdaformals();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lambdaformals115.getTree());

			pushFollow(FOLLOW_body_in_lambdaExpression1267);
			body116=body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, body116.getTree());

			char_literal117=(Token)match(input,96,FOLLOW_96_in_lambdaExpression1269); if (state.failed) return retval;
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
	// R5RS.g3:212:1: lambdaformals : ( ( variable )=> variable | ( formals )=> formals | '()' -> ^( EMPTYFORMALS ) );
	public final R5RSParser.lambdaformals_return lambdaformals() throws RecognitionException {
		R5RSParser.lambdaformals_return retval = new R5RSParser.lambdaformals_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal120=null;
		ParserRuleReturnScope variable118 =null;
		ParserRuleReturnScope formals119 =null;

		Object string_literal120_tree=null;
		RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");

		try {
			// R5RS.g3:213:3: ( ( variable )=> variable | ( formals )=> formals | '()' -> ^( EMPTYFORMALS ) )
			int alt32=3;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==VARIABLE) && (synpred14_R5RS())) {
				alt32=1;
			}
			else if ( (LA32_0==ELLIPSIS) && (synpred14_R5RS())) {
				alt32=1;
			}
			else if ( (LA32_0==94) && (synpred15_R5RS())) {
				alt32=2;
			}
			else if ( (LA32_0==95) ) {
				alt32=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// R5RS.g3:213:5: ( variable )=> variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_lambdaformals1289);
					variable118=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable118.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:214:5: ( formals )=> formals
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_formals_in_lambdaformals1301);
					formals119=formals();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formals119.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:215:5: '()'
					{
					string_literal120=(Token)match(input,95,FOLLOW_95_in_lambdaformals1307); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_95.add(string_literal120);

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
					// 215:10: -> ^( EMPTYFORMALS )
					{
						// R5RS.g3:215:13: ^( EMPTYFORMALS )
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
	// R5RS.g3:219:1: conditional : '(' ! IF ^ test consequent ( alternate )? ')' !;
	public final R5RSParser.conditional_return conditional() throws RecognitionException {
		R5RSParser.conditional_return retval = new R5RSParser.conditional_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal121=null;
		Token IF122=null;
		Token char_literal126=null;
		ParserRuleReturnScope test123 =null;
		ParserRuleReturnScope consequent124 =null;
		ParserRuleReturnScope alternate125 =null;

		Object char_literal121_tree=null;
		Object IF122_tree=null;
		Object char_literal126_tree=null;

		try {
			// R5RS.g3:220:3: ( '(' ! IF ^ test consequent ( alternate )? ')' !)
			// R5RS.g3:220:6: '(' ! IF ^ test consequent ( alternate )? ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal121=(Token)match(input,94,FOLLOW_94_in_conditional1328); if (state.failed) return retval;
			IF122=(Token)match(input,IF,FOLLOW_IF_in_conditional1331); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF122_tree = (Object)adaptor.create(IF122);
			root_0 = (Object)adaptor.becomeRoot(IF122_tree, root_0);
			}

			pushFollow(FOLLOW_test_in_conditional1334);
			test123=test();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, test123.getTree());

			pushFollow(FOLLOW_consequent_in_conditional1336);
			consequent124=consequent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, consequent124.getTree());

			// R5RS.g3:220:31: ( alternate )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==CHARACTER||LA33_0==ELLIPSIS||LA33_0==FALSE||(LA33_0 >= NUM_10 && LA33_0 <= NUM_8)||LA33_0==STRING||LA33_0==TRUE||LA33_0==VARIABLE||LA33_0==94||(LA33_0 >= 100 && LA33_0 <= 101)) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// R5RS.g3:220:31: alternate
					{
					pushFollow(FOLLOW_alternate_in_conditional1338);
					alternate125=alternate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alternate125.getTree());

					}
					break;

			}

			char_literal126=(Token)match(input,96,FOLLOW_96_in_conditional1341); if (state.failed) return retval;
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
	// R5RS.g3:223:1: test : expression ;
	public final R5RSParser.test_return test() throws RecognitionException {
		R5RSParser.test_return retval = new R5RSParser.test_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression127 =null;


		try {
			// R5RS.g3:224:3: ( expression )
			// R5RS.g3:224:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_test1357);
			expression127=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression127.getTree());

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
	// R5RS.g3:227:1: consequent : expression ;
	public final R5RSParser.consequent_return consequent() throws RecognitionException {
		R5RSParser.consequent_return retval = new R5RSParser.consequent_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression128 =null;


		try {
			// R5RS.g3:228:3: ( expression )
			// R5RS.g3:228:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_consequent1373);
			expression128=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression128.getTree());

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
	// R5RS.g3:231:1: alternate : expression ;
	public final R5RSParser.alternate_return alternate() throws RecognitionException {
		R5RSParser.alternate_return retval = new R5RSParser.alternate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression129 =null;


		try {
			// R5RS.g3:232:3: ( expression )
			// R5RS.g3:232:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_alternate1388);
			expression129=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression129.getTree());

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
	// R5RS.g3:235:1: assignment : '(' ! SET ^ variable expression ')' !;
	public final R5RSParser.assignment_return assignment() throws RecognitionException {
		R5RSParser.assignment_return retval = new R5RSParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal130=null;
		Token SET131=null;
		Token char_literal134=null;
		ParserRuleReturnScope variable132 =null;
		ParserRuleReturnScope expression133 =null;

		Object char_literal130_tree=null;
		Object SET131_tree=null;
		Object char_literal134_tree=null;

		try {
			// R5RS.g3:236:3: ( '(' ! SET ^ variable expression ')' !)
			// R5RS.g3:236:6: '(' ! SET ^ variable expression ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal130=(Token)match(input,94,FOLLOW_94_in_assignment1402); if (state.failed) return retval;
			SET131=(Token)match(input,SET,FOLLOW_SET_in_assignment1405); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SET131_tree = (Object)adaptor.create(SET131);
			root_0 = (Object)adaptor.becomeRoot(SET131_tree, root_0);
			}

			pushFollow(FOLLOW_variable_in_assignment1408);
			variable132=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable132.getTree());

			pushFollow(FOLLOW_expression_in_assignment1410);
			expression133=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression133.getTree());

			char_literal134=(Token)match(input,96,FOLLOW_96_in_assignment1412); if (state.failed) return retval;
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
	// R5RS.g3:239:1: derivedExpression : ( quasiquotation | '(' ! ( COND ^ ( '(' ! ELSE ^ sequence ')' !| ( condClause )+ ( '(' ELSE ^ sequence ')' )? ) | CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? ) | AND ^ ( test )* | OR ^ ( test )* | LET ( variable )? '(' ( bindingSpec )* ')' body | LETSTAR '(' ( bindingSpec )* ')' body | LETREC '(' ( bindingSpec )* ')' body | BEGIN ^ sequence | DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )* | DELAY expression ) ')' !);
	public final R5RSParser.derivedExpression_return derivedExpression() throws RecognitionException {
		R5RSParser.derivedExpression_return retval = new R5RSParser.derivedExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal136=null;
		Token COND137=null;
		Token char_literal138=null;
		Token ELSE139=null;
		Token char_literal141=null;
		Token char_literal143=null;
		Token ELSE144=null;
		Token char_literal146=null;
		Token CASE147=null;
		Token char_literal149=null;
		Token ELSE150=null;
		Token char_literal152=null;
		Token char_literal154=null;
		Token ELSE155=null;
		Token char_literal157=null;
		Token AND158=null;
		Token OR160=null;
		Token LET162=null;
		Token char_literal164=null;
		Token char_literal166=null;
		Token LETSTAR168=null;
		Token char_literal169=null;
		Token char_literal171=null;
		Token LETREC173=null;
		Token char_literal174=null;
		Token char_literal176=null;
		Token BEGIN178=null;
		Token DO180=null;
		Token char_literal181=null;
		Token char_literal183=null;
		Token char_literal184=null;
		Token char_literal187=null;
		Token DELAY189=null;
		Token char_literal191=null;
		ParserRuleReturnScope quasiquotation135 =null;
		ParserRuleReturnScope sequence140 =null;
		ParserRuleReturnScope condClause142 =null;
		ParserRuleReturnScope sequence145 =null;
		ParserRuleReturnScope expression148 =null;
		ParserRuleReturnScope sequence151 =null;
		ParserRuleReturnScope caseClause153 =null;
		ParserRuleReturnScope sequence156 =null;
		ParserRuleReturnScope test159 =null;
		ParserRuleReturnScope test161 =null;
		ParserRuleReturnScope variable163 =null;
		ParserRuleReturnScope bindingSpec165 =null;
		ParserRuleReturnScope body167 =null;
		ParserRuleReturnScope bindingSpec170 =null;
		ParserRuleReturnScope body172 =null;
		ParserRuleReturnScope bindingSpec175 =null;
		ParserRuleReturnScope body177 =null;
		ParserRuleReturnScope sequence179 =null;
		ParserRuleReturnScope iterationSpec182 =null;
		ParserRuleReturnScope test185 =null;
		ParserRuleReturnScope doResult186 =null;
		ParserRuleReturnScope command188 =null;
		ParserRuleReturnScope expression190 =null;

		Object char_literal136_tree=null;
		Object COND137_tree=null;
		Object char_literal138_tree=null;
		Object ELSE139_tree=null;
		Object char_literal141_tree=null;
		Object char_literal143_tree=null;
		Object ELSE144_tree=null;
		Object char_literal146_tree=null;
		Object CASE147_tree=null;
		Object char_literal149_tree=null;
		Object ELSE150_tree=null;
		Object char_literal152_tree=null;
		Object char_literal154_tree=null;
		Object ELSE155_tree=null;
		Object char_literal157_tree=null;
		Object AND158_tree=null;
		Object OR160_tree=null;
		Object LET162_tree=null;
		Object char_literal164_tree=null;
		Object char_literal166_tree=null;
		Object LETSTAR168_tree=null;
		Object char_literal169_tree=null;
		Object char_literal171_tree=null;
		Object LETREC173_tree=null;
		Object char_literal174_tree=null;
		Object char_literal176_tree=null;
		Object BEGIN178_tree=null;
		Object DO180_tree=null;
		Object char_literal181_tree=null;
		Object char_literal183_tree=null;
		Object char_literal184_tree=null;
		Object char_literal187_tree=null;
		Object DELAY189_tree=null;
		Object char_literal191_tree=null;

		try {
			// R5RS.g3:240:3: ( quasiquotation | '(' ! ( COND ^ ( '(' ! ELSE ^ sequence ')' !| ( condClause )+ ( '(' ELSE ^ sequence ')' )? ) | CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? ) | AND ^ ( test )* | OR ^ ( test )* | LET ( variable )? '(' ( bindingSpec )* ')' body | LETSTAR '(' ( bindingSpec )* ')' body | LETREC '(' ( bindingSpec )* ')' body | BEGIN ^ sequence | DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )* | DELAY expression ) ')' !)
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==101) ) {
				alt50=1;
			}
			else if ( (LA50_0==94) ) {
				int LA50_2 = input.LA(2);
				if ( (LA50_2==QUASIQUOTE) ) {
					alt50=1;
				}
				else if ( (LA50_2==AND||(LA50_2 >= BEGIN && LA50_2 <= CASE)||LA50_2==COND||LA50_2==DELAY||LA50_2==DO||(LA50_2 >= LET && LA50_2 <= LETREC)||LA50_2==LETSTAR||LA50_2==OR) ) {
					alt50=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 50, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// R5RS.g3:240:6: quasiquotation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_quasiquotation_in_derivedExpression1427);
					quasiquotation135=quasiquotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quasiquotation135.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:241:6: '(' ! ( COND ^ ( '(' ! ELSE ^ sequence ')' !| ( condClause )+ ( '(' ELSE ^ sequence ')' )? ) | CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? ) | AND ^ ( test )* | OR ^ ( test )* | LET ( variable )? '(' ( bindingSpec )* ')' body | LETSTAR '(' ( bindingSpec )* ')' body | LETREC '(' ( bindingSpec )* ')' body | BEGIN ^ sequence | DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )* | DELAY expression ) ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal136=(Token)match(input,94,FOLLOW_94_in_derivedExpression1434); if (state.failed) return retval;
					// R5RS.g3:241:11: ( COND ^ ( '(' ! ELSE ^ sequence ')' !| ( condClause )+ ( '(' ELSE ^ sequence ')' )? ) | CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? ) | AND ^ ( test )* | OR ^ ( test )* | LET ( variable )? '(' ( bindingSpec )* ')' body | LETSTAR '(' ( bindingSpec )* ')' body | LETREC '(' ( bindingSpec )* ')' body | BEGIN ^ sequence | DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )* | DELAY expression )
					int alt49=10;
					switch ( input.LA(1) ) {
					case COND:
						{
						alt49=1;
						}
						break;
					case CASE:
						{
						alt49=2;
						}
						break;
					case AND:
						{
						alt49=3;
						}
						break;
					case OR:
						{
						alt49=4;
						}
						break;
					case LET:
						{
						alt49=5;
						}
						break;
					case LETSTAR:
						{
						alt49=6;
						}
						break;
					case LETREC:
						{
						alt49=7;
						}
						break;
					case BEGIN:
						{
						alt49=8;
						}
						break;
					case DO:
						{
						alt49=9;
						}
						break;
					case DELAY:
						{
						alt49=10;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 49, 0, input);
						throw nvae;
					}
					switch (alt49) {
						case 1 :
							// R5RS.g3:241:13: COND ^ ( '(' ! ELSE ^ sequence ')' !| ( condClause )+ ( '(' ELSE ^ sequence ')' )? )
							{
							COND137=(Token)match(input,COND,FOLLOW_COND_in_derivedExpression1439); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COND137_tree = (Object)adaptor.create(COND137);
							root_0 = (Object)adaptor.becomeRoot(COND137_tree, root_0);
							}

							// R5RS.g3:241:19: ( '(' ! ELSE ^ sequence ')' !| ( condClause )+ ( '(' ELSE ^ sequence ')' )? )
							int alt36=2;
							int LA36_0 = input.LA(1);
							if ( (LA36_0==94) ) {
								int LA36_1 = input.LA(2);
								if ( (LA36_1==ELSE) ) {
									alt36=1;
								}
								else if ( (LA36_1==CHARACTER||LA36_1==ELLIPSIS||LA36_1==FALSE||(LA36_1 >= NUM_10 && LA36_1 <= NUM_8)||LA36_1==STRING||LA36_1==TRUE||LA36_1==VARIABLE||LA36_1==94||(LA36_1 >= 100 && LA36_1 <= 101)) ) {
									alt36=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 36, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 36, 0, input);
								throw nvae;
							}

							switch (alt36) {
								case 1 :
									// R5RS.g3:241:21: '(' ! ELSE ^ sequence ')' !
									{
									char_literal138=(Token)match(input,94,FOLLOW_94_in_derivedExpression1444); if (state.failed) return retval;
									ELSE139=(Token)match(input,ELSE,FOLLOW_ELSE_in_derivedExpression1447); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ELSE139_tree = (Object)adaptor.create(ELSE139);
									root_0 = (Object)adaptor.becomeRoot(ELSE139_tree, root_0);
									}

									pushFollow(FOLLOW_sequence_in_derivedExpression1450);
									sequence140=sequence();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence140.getTree());

									char_literal141=(Token)match(input,96,FOLLOW_96_in_derivedExpression1452); if (state.failed) return retval;
									}
									break;
								case 2 :
									// R5RS.g3:242:19: ( condClause )+ ( '(' ELSE ^ sequence ')' )?
									{
									// R5RS.g3:242:19: ( condClause )+
									int cnt34=0;
									loop34:
									while (true) {
										int alt34=2;
										int LA34_0 = input.LA(1);
										if ( (LA34_0==94) ) {
											int LA34_1 = input.LA(2);
											if ( (LA34_1==CHARACTER||LA34_1==ELLIPSIS||LA34_1==FALSE||(LA34_1 >= NUM_10 && LA34_1 <= NUM_8)||LA34_1==STRING||LA34_1==TRUE||LA34_1==VARIABLE||LA34_1==94||(LA34_1 >= 100 && LA34_1 <= 101)) ) {
												alt34=1;
											}

										}

										switch (alt34) {
										case 1 :
											// R5RS.g3:242:19: condClause
											{
											pushFollow(FOLLOW_condClause_in_derivedExpression1473);
											condClause142=condClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, condClause142.getTree());

											}
											break;

										default :
											if ( cnt34 >= 1 ) break loop34;
											if (state.backtracking>0) {state.failed=true; return retval;}
											EarlyExitException eee = new EarlyExitException(34, input);
											throw eee;
										}
										cnt34++;
									}

									// R5RS.g3:242:31: ( '(' ELSE ^ sequence ')' )?
									int alt35=2;
									int LA35_0 = input.LA(1);
									if ( (LA35_0==94) ) {
										alt35=1;
									}
									switch (alt35) {
										case 1 :
											// R5RS.g3:242:32: '(' ELSE ^ sequence ')'
											{
											char_literal143=(Token)match(input,94,FOLLOW_94_in_derivedExpression1477); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											char_literal143_tree = (Object)adaptor.create(char_literal143);
											adaptor.addChild(root_0, char_literal143_tree);
											}

											ELSE144=(Token)match(input,ELSE,FOLLOW_ELSE_in_derivedExpression1479); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											ELSE144_tree = (Object)adaptor.create(ELSE144);
											root_0 = (Object)adaptor.becomeRoot(ELSE144_tree, root_0);
											}

											pushFollow(FOLLOW_sequence_in_derivedExpression1482);
											sequence145=sequence();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence145.getTree());

											char_literal146=(Token)match(input,96,FOLLOW_96_in_derivedExpression1484); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											char_literal146_tree = (Object)adaptor.create(char_literal146);
											adaptor.addChild(root_0, char_literal146_tree);
											}

											}
											break;

									}

									}
									break;

							}

							}
							break;
						case 2 :
							// R5RS.g3:244:12: CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? )
							{
							CASE147=(Token)match(input,CASE,FOLLOW_CASE_in_derivedExpression1517); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							CASE147_tree = (Object)adaptor.create(CASE147);
							adaptor.addChild(root_0, CASE147_tree);
							}

							pushFollow(FOLLOW_expression_in_derivedExpression1519);
							expression148=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression148.getTree());

							// R5RS.g3:244:28: ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? )
							int alt39=2;
							int LA39_0 = input.LA(1);
							if ( (LA39_0==94) ) {
								int LA39_1 = input.LA(2);
								if ( (LA39_1==ELSE) ) {
									alt39=1;
								}
								else if ( (LA39_1==94) ) {
									alt39=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 39, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 39, 0, input);
								throw nvae;
							}

							switch (alt39) {
								case 1 :
									// R5RS.g3:244:30: '(' ELSE sequence ')'
									{
									char_literal149=(Token)match(input,94,FOLLOW_94_in_derivedExpression1523); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal149_tree = (Object)adaptor.create(char_literal149);
									adaptor.addChild(root_0, char_literal149_tree);
									}

									ELSE150=(Token)match(input,ELSE,FOLLOW_ELSE_in_derivedExpression1525); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ELSE150_tree = (Object)adaptor.create(ELSE150);
									adaptor.addChild(root_0, ELSE150_tree);
									}

									pushFollow(FOLLOW_sequence_in_derivedExpression1527);
									sequence151=sequence();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence151.getTree());

									char_literal152=(Token)match(input,96,FOLLOW_96_in_derivedExpression1529); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal152_tree = (Object)adaptor.create(char_literal152);
									adaptor.addChild(root_0, char_literal152_tree);
									}

									}
									break;
								case 2 :
									// R5RS.g3:245:30: ( caseClause )+ ( '(' ELSE sequence ')' )?
									{
									// R5RS.g3:245:30: ( caseClause )+
									int cnt37=0;
									loop37:
									while (true) {
										int alt37=2;
										int LA37_0 = input.LA(1);
										if ( (LA37_0==94) ) {
											int LA37_1 = input.LA(2);
											if ( (LA37_1==94) ) {
												alt37=1;
											}

										}

										switch (alt37) {
										case 1 :
											// R5RS.g3:245:30: caseClause
											{
											pushFollow(FOLLOW_caseClause_in_derivedExpression1560);
											caseClause153=caseClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, caseClause153.getTree());

											}
											break;

										default :
											if ( cnt37 >= 1 ) break loop37;
											if (state.backtracking>0) {state.failed=true; return retval;}
											EarlyExitException eee = new EarlyExitException(37, input);
											throw eee;
										}
										cnt37++;
									}

									// R5RS.g3:245:42: ( '(' ELSE sequence ')' )?
									int alt38=2;
									int LA38_0 = input.LA(1);
									if ( (LA38_0==94) ) {
										alt38=1;
									}
									switch (alt38) {
										case 1 :
											// R5RS.g3:245:43: '(' ELSE sequence ')'
											{
											char_literal154=(Token)match(input,94,FOLLOW_94_in_derivedExpression1564); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											char_literal154_tree = (Object)adaptor.create(char_literal154);
											adaptor.addChild(root_0, char_literal154_tree);
											}

											ELSE155=(Token)match(input,ELSE,FOLLOW_ELSE_in_derivedExpression1566); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											ELSE155_tree = (Object)adaptor.create(ELSE155);
											adaptor.addChild(root_0, ELSE155_tree);
											}

											pushFollow(FOLLOW_sequence_in_derivedExpression1568);
											sequence156=sequence();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence156.getTree());

											char_literal157=(Token)match(input,96,FOLLOW_96_in_derivedExpression1570); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											char_literal157_tree = (Object)adaptor.create(char_literal157);
											adaptor.addChild(root_0, char_literal157_tree);
											}

											}
											break;

									}

									}
									break;

							}

							}
							break;
						case 3 :
							// R5RS.g3:247:12: AND ^ ( test )*
							{
							AND158=(Token)match(input,AND,FOLLOW_AND_in_derivedExpression1615); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							AND158_tree = (Object)adaptor.create(AND158);
							root_0 = (Object)adaptor.becomeRoot(AND158_tree, root_0);
							}

							// R5RS.g3:247:17: ( test )*
							loop40:
							while (true) {
								int alt40=2;
								int LA40_0 = input.LA(1);
								if ( (LA40_0==CHARACTER||LA40_0==ELLIPSIS||LA40_0==FALSE||(LA40_0 >= NUM_10 && LA40_0 <= NUM_8)||LA40_0==STRING||LA40_0==TRUE||LA40_0==VARIABLE||LA40_0==94||(LA40_0 >= 100 && LA40_0 <= 101)) ) {
									alt40=1;
								}

								switch (alt40) {
								case 1 :
									// R5RS.g3:247:17: test
									{
									pushFollow(FOLLOW_test_in_derivedExpression1618);
									test159=test();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, test159.getTree());

									}
									break;

								default :
									break loop40;
								}
							}

							}
							break;
						case 4 :
							// R5RS.g3:248:12: OR ^ ( test )*
							{
							OR160=(Token)match(input,OR,FOLLOW_OR_in_derivedExpression1632); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							OR160_tree = (Object)adaptor.create(OR160);
							root_0 = (Object)adaptor.becomeRoot(OR160_tree, root_0);
							}

							// R5RS.g3:248:16: ( test )*
							loop41:
							while (true) {
								int alt41=2;
								int LA41_0 = input.LA(1);
								if ( (LA41_0==CHARACTER||LA41_0==ELLIPSIS||LA41_0==FALSE||(LA41_0 >= NUM_10 && LA41_0 <= NUM_8)||LA41_0==STRING||LA41_0==TRUE||LA41_0==VARIABLE||LA41_0==94||(LA41_0 >= 100 && LA41_0 <= 101)) ) {
									alt41=1;
								}

								switch (alt41) {
								case 1 :
									// R5RS.g3:248:16: test
									{
									pushFollow(FOLLOW_test_in_derivedExpression1635);
									test161=test();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, test161.getTree());

									}
									break;

								default :
									break loop41;
								}
							}

							}
							break;
						case 5 :
							// R5RS.g3:249:12: LET ( variable )? '(' ( bindingSpec )* ')' body
							{
							LET162=(Token)match(input,LET,FOLLOW_LET_in_derivedExpression1649); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LET162_tree = (Object)adaptor.create(LET162);
							adaptor.addChild(root_0, LET162_tree);
							}

							// R5RS.g3:249:16: ( variable )?
							int alt42=2;
							int LA42_0 = input.LA(1);
							if ( (LA42_0==ELLIPSIS||LA42_0==VARIABLE) ) {
								alt42=1;
							}
							switch (alt42) {
								case 1 :
									// R5RS.g3:249:16: variable
									{
									pushFollow(FOLLOW_variable_in_derivedExpression1651);
									variable163=variable();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, variable163.getTree());

									}
									break;

							}

							char_literal164=(Token)match(input,94,FOLLOW_94_in_derivedExpression1654); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal164_tree = (Object)adaptor.create(char_literal164);
							adaptor.addChild(root_0, char_literal164_tree);
							}

							// R5RS.g3:249:30: ( bindingSpec )*
							loop43:
							while (true) {
								int alt43=2;
								int LA43_0 = input.LA(1);
								if ( (LA43_0==94) ) {
									alt43=1;
								}

								switch (alt43) {
								case 1 :
									// R5RS.g3:249:30: bindingSpec
									{
									pushFollow(FOLLOW_bindingSpec_in_derivedExpression1656);
									bindingSpec165=bindingSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, bindingSpec165.getTree());

									}
									break;

								default :
									break loop43;
								}
							}

							char_literal166=(Token)match(input,96,FOLLOW_96_in_derivedExpression1659); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal166_tree = (Object)adaptor.create(char_literal166);
							adaptor.addChild(root_0, char_literal166_tree);
							}

							pushFollow(FOLLOW_body_in_derivedExpression1661);
							body167=body();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, body167.getTree());

							}
							break;
						case 6 :
							// R5RS.g3:250:12: LETSTAR '(' ( bindingSpec )* ')' body
							{
							LETSTAR168=(Token)match(input,LETSTAR,FOLLOW_LETSTAR_in_derivedExpression1674); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LETSTAR168_tree = (Object)adaptor.create(LETSTAR168);
							adaptor.addChild(root_0, LETSTAR168_tree);
							}

							char_literal169=(Token)match(input,94,FOLLOW_94_in_derivedExpression1676); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal169_tree = (Object)adaptor.create(char_literal169);
							adaptor.addChild(root_0, char_literal169_tree);
							}

							// R5RS.g3:250:24: ( bindingSpec )*
							loop44:
							while (true) {
								int alt44=2;
								int LA44_0 = input.LA(1);
								if ( (LA44_0==94) ) {
									alt44=1;
								}

								switch (alt44) {
								case 1 :
									// R5RS.g3:250:24: bindingSpec
									{
									pushFollow(FOLLOW_bindingSpec_in_derivedExpression1678);
									bindingSpec170=bindingSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, bindingSpec170.getTree());

									}
									break;

								default :
									break loop44;
								}
							}

							char_literal171=(Token)match(input,96,FOLLOW_96_in_derivedExpression1681); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal171_tree = (Object)adaptor.create(char_literal171);
							adaptor.addChild(root_0, char_literal171_tree);
							}

							pushFollow(FOLLOW_body_in_derivedExpression1683);
							body172=body();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, body172.getTree());

							}
							break;
						case 7 :
							// R5RS.g3:251:12: LETREC '(' ( bindingSpec )* ')' body
							{
							LETREC173=(Token)match(input,LETREC,FOLLOW_LETREC_in_derivedExpression1696); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LETREC173_tree = (Object)adaptor.create(LETREC173);
							adaptor.addChild(root_0, LETREC173_tree);
							}

							char_literal174=(Token)match(input,94,FOLLOW_94_in_derivedExpression1698); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal174_tree = (Object)adaptor.create(char_literal174);
							adaptor.addChild(root_0, char_literal174_tree);
							}

							// R5RS.g3:251:23: ( bindingSpec )*
							loop45:
							while (true) {
								int alt45=2;
								int LA45_0 = input.LA(1);
								if ( (LA45_0==94) ) {
									alt45=1;
								}

								switch (alt45) {
								case 1 :
									// R5RS.g3:251:23: bindingSpec
									{
									pushFollow(FOLLOW_bindingSpec_in_derivedExpression1700);
									bindingSpec175=bindingSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, bindingSpec175.getTree());

									}
									break;

								default :
									break loop45;
								}
							}

							char_literal176=(Token)match(input,96,FOLLOW_96_in_derivedExpression1703); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal176_tree = (Object)adaptor.create(char_literal176);
							adaptor.addChild(root_0, char_literal176_tree);
							}

							pushFollow(FOLLOW_body_in_derivedExpression1705);
							body177=body();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, body177.getTree());

							}
							break;
						case 8 :
							// R5RS.g3:252:12: BEGIN ^ sequence
							{
							BEGIN178=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_derivedExpression1718); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							BEGIN178_tree = (Object)adaptor.create(BEGIN178);
							root_0 = (Object)adaptor.becomeRoot(BEGIN178_tree, root_0);
							}

							pushFollow(FOLLOW_sequence_in_derivedExpression1721);
							sequence179=sequence();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence179.getTree());

							}
							break;
						case 9 :
							// R5RS.g3:253:12: DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )*
							{
							DO180=(Token)match(input,DO,FOLLOW_DO_in_derivedExpression1734); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DO180_tree = (Object)adaptor.create(DO180);
							adaptor.addChild(root_0, DO180_tree);
							}

							char_literal181=(Token)match(input,94,FOLLOW_94_in_derivedExpression1736); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal181_tree = (Object)adaptor.create(char_literal181);
							adaptor.addChild(root_0, char_literal181_tree);
							}

							// R5RS.g3:253:19: ( iterationSpec )*
							loop46:
							while (true) {
								int alt46=2;
								int LA46_0 = input.LA(1);
								if ( (LA46_0==94) ) {
									alt46=1;
								}

								switch (alt46) {
								case 1 :
									// R5RS.g3:253:19: iterationSpec
									{
									pushFollow(FOLLOW_iterationSpec_in_derivedExpression1738);
									iterationSpec182=iterationSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, iterationSpec182.getTree());

									}
									break;

								default :
									break loop46;
								}
							}

							char_literal183=(Token)match(input,96,FOLLOW_96_in_derivedExpression1741); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal183_tree = (Object)adaptor.create(char_literal183);
							adaptor.addChild(root_0, char_literal183_tree);
							}

							char_literal184=(Token)match(input,94,FOLLOW_94_in_derivedExpression1743); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal184_tree = (Object)adaptor.create(char_literal184);
							adaptor.addChild(root_0, char_literal184_tree);
							}

							pushFollow(FOLLOW_test_in_derivedExpression1745);
							test185=test();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, test185.getTree());

							// R5RS.g3:253:47: ( doResult )?
							int alt47=2;
							int LA47_0 = input.LA(1);
							if ( (LA47_0==CHARACTER||LA47_0==ELLIPSIS||LA47_0==FALSE||(LA47_0 >= NUM_10 && LA47_0 <= NUM_8)||LA47_0==STRING||LA47_0==TRUE||LA47_0==VARIABLE||LA47_0==94||(LA47_0 >= 100 && LA47_0 <= 101)) ) {
								alt47=1;
							}
							switch (alt47) {
								case 1 :
									// R5RS.g3:253:47: doResult
									{
									pushFollow(FOLLOW_doResult_in_derivedExpression1747);
									doResult186=doResult();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, doResult186.getTree());

									}
									break;

							}

							char_literal187=(Token)match(input,96,FOLLOW_96_in_derivedExpression1750); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal187_tree = (Object)adaptor.create(char_literal187);
							adaptor.addChild(root_0, char_literal187_tree);
							}

							// R5RS.g3:253:61: ( command )*
							loop48:
							while (true) {
								int alt48=2;
								int LA48_0 = input.LA(1);
								if ( (LA48_0==CHARACTER||LA48_0==ELLIPSIS||LA48_0==FALSE||(LA48_0 >= NUM_10 && LA48_0 <= NUM_8)||LA48_0==STRING||LA48_0==TRUE||LA48_0==VARIABLE||LA48_0==94||(LA48_0 >= 100 && LA48_0 <= 101)) ) {
									alt48=1;
								}

								switch (alt48) {
								case 1 :
									// R5RS.g3:253:61: command
									{
									pushFollow(FOLLOW_command_in_derivedExpression1752);
									command188=command();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, command188.getTree());

									}
									break;

								default :
									break loop48;
								}
							}

							}
							break;
						case 10 :
							// R5RS.g3:254:12: DELAY expression
							{
							DELAY189=(Token)match(input,DELAY,FOLLOW_DELAY_in_derivedExpression1766); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DELAY189_tree = (Object)adaptor.create(DELAY189);
							adaptor.addChild(root_0, DELAY189_tree);
							}

							pushFollow(FOLLOW_expression_in_derivedExpression1768);
							expression190=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression190.getTree());

							}
							break;

					}

					char_literal191=(Token)match(input,96,FOLLOW_96_in_derivedExpression1787); if (state.failed) return retval;
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


	public static class condClause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condClause"
	// R5RS.g3:259:1: condClause : '(' test ( condrealize )? ')' -> ^( CONDCLAUSE ( condrealize )? ) ;
	public final R5RSParser.condClause_return condClause() throws RecognitionException {
		R5RSParser.condClause_return retval = new R5RSParser.condClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal192=null;
		Token char_literal195=null;
		ParserRuleReturnScope test193 =null;
		ParserRuleReturnScope condrealize194 =null;

		Object char_literal192_tree=null;
		Object char_literal195_tree=null;
		RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleSubtreeStream stream_test=new RewriteRuleSubtreeStream(adaptor,"rule test");
		RewriteRuleSubtreeStream stream_condrealize=new RewriteRuleSubtreeStream(adaptor,"rule condrealize");

		try {
			// R5RS.g3:260:3: ( '(' test ( condrealize )? ')' -> ^( CONDCLAUSE ( condrealize )? ) )
			// R5RS.g3:260:6: '(' test ( condrealize )? ')'
			{
			char_literal192=(Token)match(input,94,FOLLOW_94_in_condClause1802); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_94.add(char_literal192);

			pushFollow(FOLLOW_test_in_condClause1804);
			test193=test();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_test.add(test193.getTree());
			// R5RS.g3:260:15: ( condrealize )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==ARROW||LA51_0==CHARACTER||LA51_0==ELLIPSIS||LA51_0==FALSE||(LA51_0 >= NUM_10 && LA51_0 <= NUM_8)||LA51_0==STRING||LA51_0==TRUE||LA51_0==VARIABLE||LA51_0==94||(LA51_0 >= 100 && LA51_0 <= 101)) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// R5RS.g3:260:15: condrealize
					{
					pushFollow(FOLLOW_condrealize_in_condClause1806);
					condrealize194=condrealize();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_condrealize.add(condrealize194.getTree());
					}
					break;

			}

			char_literal195=(Token)match(input,96,FOLLOW_96_in_condClause1809); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_96.add(char_literal195);

			// AST REWRITE
			// elements: condrealize
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 260:32: -> ^( CONDCLAUSE ( condrealize )? )
			{
				// R5RS.g3:260:35: ^( CONDCLAUSE ( condrealize )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDCLAUSE, "CONDCLAUSE"), root_1);
				// R5RS.g3:260:48: ( condrealize )?
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


	public static class condrealize_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condrealize"
	// R5RS.g3:263:1: condrealize : ( sequence | ARROW ^ recipient );
	public final R5RSParser.condrealize_return condrealize() throws RecognitionException {
		R5RSParser.condrealize_return retval = new R5RSParser.condrealize_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ARROW197=null;
		ParserRuleReturnScope sequence196 =null;
		ParserRuleReturnScope recipient198 =null;

		Object ARROW197_tree=null;

		try {
			// R5RS.g3:264:3: ( sequence | ARROW ^ recipient )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==CHARACTER||LA52_0==ELLIPSIS||LA52_0==FALSE||(LA52_0 >= NUM_10 && LA52_0 <= NUM_8)||LA52_0==STRING||LA52_0==TRUE||LA52_0==VARIABLE||LA52_0==94||(LA52_0 >= 100 && LA52_0 <= 101)) ) {
				alt52=1;
			}
			else if ( (LA52_0==ARROW) ) {
				alt52=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// R5RS.g3:264:5: sequence
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sequence_in_condrealize1831);
					sequence196=sequence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence196.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:265:5: ARROW ^ recipient
					{
					root_0 = (Object)adaptor.nil();


					ARROW197=(Token)match(input,ARROW,FOLLOW_ARROW_in_condrealize1837); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ARROW197_tree = (Object)adaptor.create(ARROW197);
					root_0 = (Object)adaptor.becomeRoot(ARROW197_tree, root_0);
					}

					pushFollow(FOLLOW_recipient_in_condrealize1840);
					recipient198=recipient();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recipient198.getTree());

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
	// R5RS.g3:268:1: recipient : expression ;
	public final R5RSParser.recipient_return recipient() throws RecognitionException {
		R5RSParser.recipient_return retval = new R5RSParser.recipient_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression199 =null;


		try {
			// R5RS.g3:269:3: ( expression )
			// R5RS.g3:269:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_recipient1854);
			expression199=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression199.getTree());

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
	// R5RS.g3:272:1: caseClause : '(' '(' ( datum )* ')' sequence ')' ;
	public final R5RSParser.caseClause_return caseClause() throws RecognitionException {
		R5RSParser.caseClause_return retval = new R5RSParser.caseClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal200=null;
		Token char_literal201=null;
		Token char_literal203=null;
		Token char_literal205=null;
		ParserRuleReturnScope datum202 =null;
		ParserRuleReturnScope sequence204 =null;

		Object char_literal200_tree=null;
		Object char_literal201_tree=null;
		Object char_literal203_tree=null;
		Object char_literal205_tree=null;

		try {
			// R5RS.g3:273:3: ( '(' '(' ( datum )* ')' sequence ')' )
			// R5RS.g3:273:6: '(' '(' ( datum )* ')' sequence ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal200=(Token)match(input,94,FOLLOW_94_in_caseClause1868); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal200_tree = (Object)adaptor.create(char_literal200);
			adaptor.addChild(root_0, char_literal200_tree);
			}

			char_literal201=(Token)match(input,94,FOLLOW_94_in_caseClause1870); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal201_tree = (Object)adaptor.create(char_literal201);
			adaptor.addChild(root_0, char_literal201_tree);
			}

			// R5RS.g3:273:14: ( datum )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( ((LA53_0 >= AND && LA53_0 <= CHARACTER)||LA53_0==COND||LA53_0==DEFINE||LA53_0==DELAY||(LA53_0 >= DO && LA53_0 <= ELSE)||LA53_0==FALSE||LA53_0==IF||(LA53_0 >= LAMBDA && LA53_0 <= LETREC)||LA53_0==LETSTAR||(LA53_0 >= NUM_10 && LA53_0 <= OR)||LA53_0==QUASIQUOTE||LA53_0==QUOTE||LA53_0==SET||LA53_0==STRING||LA53_0==TRUE||(LA53_0 >= UNQUOTE && LA53_0 <= UNQUOTE_SPLICING)||(LA53_0 >= VARIABLE && LA53_0 <= 94)||(LA53_0 >= 97 && LA53_0 <= 98)||(LA53_0 >= 100 && LA53_0 <= 101)) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// R5RS.g3:273:14: datum
					{
					pushFollow(FOLLOW_datum_in_caseClause1872);
					datum202=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum202.getTree());

					}
					break;

				default :
					break loop53;
				}
			}

			char_literal203=(Token)match(input,96,FOLLOW_96_in_caseClause1875); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal203_tree = (Object)adaptor.create(char_literal203);
			adaptor.addChild(root_0, char_literal203_tree);
			}

			pushFollow(FOLLOW_sequence_in_caseClause1877);
			sequence204=sequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence204.getTree());

			char_literal205=(Token)match(input,96,FOLLOW_96_in_caseClause1879); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal205_tree = (Object)adaptor.create(char_literal205);
			adaptor.addChild(root_0, char_literal205_tree);
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


	public static class bindingSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bindingSpec"
	// R5RS.g3:276:1: bindingSpec : '(' variable expression ')' ;
	public final R5RSParser.bindingSpec_return bindingSpec() throws RecognitionException {
		R5RSParser.bindingSpec_return retval = new R5RSParser.bindingSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal206=null;
		Token char_literal209=null;
		ParserRuleReturnScope variable207 =null;
		ParserRuleReturnScope expression208 =null;

		Object char_literal206_tree=null;
		Object char_literal209_tree=null;

		try {
			// R5RS.g3:277:3: ( '(' variable expression ')' )
			// R5RS.g3:277:6: '(' variable expression ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal206=(Token)match(input,94,FOLLOW_94_in_bindingSpec1893); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal206_tree = (Object)adaptor.create(char_literal206);
			adaptor.addChild(root_0, char_literal206_tree);
			}

			pushFollow(FOLLOW_variable_in_bindingSpec1895);
			variable207=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable207.getTree());

			pushFollow(FOLLOW_expression_in_bindingSpec1897);
			expression208=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression208.getTree());

			char_literal209=(Token)match(input,96,FOLLOW_96_in_bindingSpec1899); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal209_tree = (Object)adaptor.create(char_literal209);
			adaptor.addChild(root_0, char_literal209_tree);
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
	// R5RS.g3:280:1: iterationSpec : '(' variable init ( step )? ')' ;
	public final R5RSParser.iterationSpec_return iterationSpec() throws RecognitionException {
		R5RSParser.iterationSpec_return retval = new R5RSParser.iterationSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal210=null;
		Token char_literal214=null;
		ParserRuleReturnScope variable211 =null;
		ParserRuleReturnScope init212 =null;
		ParserRuleReturnScope step213 =null;

		Object char_literal210_tree=null;
		Object char_literal214_tree=null;

		try {
			// R5RS.g3:281:3: ( '(' variable init ( step )? ')' )
			// R5RS.g3:281:6: '(' variable init ( step )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal210=(Token)match(input,94,FOLLOW_94_in_iterationSpec1913); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal210_tree = (Object)adaptor.create(char_literal210);
			adaptor.addChild(root_0, char_literal210_tree);
			}

			pushFollow(FOLLOW_variable_in_iterationSpec1915);
			variable211=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable211.getTree());

			pushFollow(FOLLOW_init_in_iterationSpec1917);
			init212=init();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, init212.getTree());

			// R5RS.g3:281:24: ( step )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==CHARACTER||LA54_0==ELLIPSIS||LA54_0==FALSE||(LA54_0 >= NUM_10 && LA54_0 <= NUM_8)||LA54_0==STRING||LA54_0==TRUE||LA54_0==VARIABLE||LA54_0==94||(LA54_0 >= 100 && LA54_0 <= 101)) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// R5RS.g3:281:24: step
					{
					pushFollow(FOLLOW_step_in_iterationSpec1919);
					step213=step();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, step213.getTree());

					}
					break;

			}

			char_literal214=(Token)match(input,96,FOLLOW_96_in_iterationSpec1922); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal214_tree = (Object)adaptor.create(char_literal214);
			adaptor.addChild(root_0, char_literal214_tree);
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
	// R5RS.g3:284:1: init : expression ;
	public final R5RSParser.init_return init() throws RecognitionException {
		R5RSParser.init_return retval = new R5RSParser.init_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression215 =null;


		try {
			// R5RS.g3:285:3: ( expression )
			// R5RS.g3:285:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_init1936);
			expression215=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression215.getTree());

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
	// R5RS.g3:288:1: step : expression ;
	public final R5RSParser.step_return step() throws RecognitionException {
		R5RSParser.step_return retval = new R5RSParser.step_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression216 =null;


		try {
			// R5RS.g3:289:3: ( expression )
			// R5RS.g3:289:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_step1950);
			expression216=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression216.getTree());

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
	// R5RS.g3:292:1: doResult : sequence ;
	public final R5RSParser.doResult_return doResult() throws RecognitionException {
		R5RSParser.doResult_return retval = new R5RSParser.doResult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope sequence217 =null;


		try {
			// R5RS.g3:293:3: ( sequence )
			// R5RS.g3:293:6: sequence
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_sequence_in_doResult1964);
			sequence217=sequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence217.getTree());

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
	// R5RS.g3:296:1: procedureCall : '(' operator ( operand )* ')' -> ^( PROCEDURECALL operator ( operand )* ) ;
	public final R5RSParser.procedureCall_return procedureCall() throws RecognitionException {
		R5RSParser.procedureCall_return retval = new R5RSParser.procedureCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal218=null;
		Token char_literal221=null;
		ParserRuleReturnScope operator219 =null;
		ParserRuleReturnScope operand220 =null;

		Object char_literal218_tree=null;
		Object char_literal221_tree=null;
		RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// R5RS.g3:297:3: ( '(' operator ( operand )* ')' -> ^( PROCEDURECALL operator ( operand )* ) )
			// R5RS.g3:297:6: '(' operator ( operand )* ')'
			{
			char_literal218=(Token)match(input,94,FOLLOW_94_in_procedureCall1978); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_94.add(char_literal218);

			pushFollow(FOLLOW_operator_in_procedureCall1980);
			operator219=operator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operator.add(operator219.getTree());
			// R5RS.g3:297:19: ( operand )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==CHARACTER||LA55_0==ELLIPSIS||LA55_0==FALSE||(LA55_0 >= NUM_10 && LA55_0 <= NUM_8)||LA55_0==STRING||LA55_0==TRUE||LA55_0==VARIABLE||LA55_0==94||(LA55_0 >= 100 && LA55_0 <= 101)) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// R5RS.g3:297:19: operand
					{
					pushFollow(FOLLOW_operand_in_procedureCall1982);
					operand220=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(operand220.getTree());
					}
					break;

				default :
					break loop55;
				}
			}

			char_literal221=(Token)match(input,96,FOLLOW_96_in_procedureCall1985); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_96.add(char_literal221);

			// AST REWRITE
			// elements: operator, operand
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 297:32: -> ^( PROCEDURECALL operator ( operand )* )
			{
				// R5RS.g3:297:35: ^( PROCEDURECALL operator ( operand )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_1);
				adaptor.addChild(root_1, stream_operator.nextTree());
				// R5RS.g3:297:60: ( operand )*
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
	// R5RS.g3:300:1: operator : expression ;
	public final R5RSParser.operator_return operator() throws RecognitionException {
		R5RSParser.operator_return retval = new R5RSParser.operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression222 =null;


		try {
			// R5RS.g3:301:3: ( expression )
			// R5RS.g3:301:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_operator2010);
			expression222=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression222.getTree());

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
	// R5RS.g3:304:1: operand : expression ;
	public final R5RSParser.operand_return operand() throws RecognitionException {
		R5RSParser.operand_return retval = new R5RSParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression223 =null;


		try {
			// R5RS.g3:305:3: ( expression )
			// R5RS.g3:305:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_operand2024);
			expression223=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression223.getTree());

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
	// R5RS.g3:308:1: macroUse : '(' keyword ( datum )* ')' ;
	public final R5RSParser.macroUse_return macroUse() throws RecognitionException {
		R5RSParser.macroUse_return retval = new R5RSParser.macroUse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal224=null;
		Token char_literal227=null;
		ParserRuleReturnScope keyword225 =null;
		ParserRuleReturnScope datum226 =null;

		Object char_literal224_tree=null;
		Object char_literal227_tree=null;

		try {
			// R5RS.g3:309:3: ( '(' keyword ( datum )* ')' )
			// R5RS.g3:309:6: '(' keyword ( datum )* ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal224=(Token)match(input,94,FOLLOW_94_in_macroUse2038); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal224_tree = (Object)adaptor.create(char_literal224);
			adaptor.addChild(root_0, char_literal224_tree);
			}

			pushFollow(FOLLOW_keyword_in_macroUse2040);
			keyword225=keyword();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword225.getTree());

			// R5RS.g3:309:18: ( datum )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( ((LA56_0 >= AND && LA56_0 <= CHARACTER)||LA56_0==COND||LA56_0==DEFINE||LA56_0==DELAY||(LA56_0 >= DO && LA56_0 <= ELSE)||LA56_0==FALSE||LA56_0==IF||(LA56_0 >= LAMBDA && LA56_0 <= LETREC)||LA56_0==LETSTAR||(LA56_0 >= NUM_10 && LA56_0 <= OR)||LA56_0==QUASIQUOTE||LA56_0==QUOTE||LA56_0==SET||LA56_0==STRING||LA56_0==TRUE||(LA56_0 >= UNQUOTE && LA56_0 <= UNQUOTE_SPLICING)||(LA56_0 >= VARIABLE && LA56_0 <= 94)||(LA56_0 >= 97 && LA56_0 <= 98)||(LA56_0 >= 100 && LA56_0 <= 101)) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// R5RS.g3:309:18: datum
					{
					pushFollow(FOLLOW_datum_in_macroUse2042);
					datum226=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum226.getTree());

					}
					break;

				default :
					break loop56;
				}
			}

			char_literal227=(Token)match(input,96,FOLLOW_96_in_macroUse2045); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal227_tree = (Object)adaptor.create(char_literal227);
			adaptor.addChild(root_0, char_literal227_tree);
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
	// R5RS.g3:312:1: macroBlock : '(' ( LET_SYNTAX | LETREC_SYNTAX ) '(' ( syntaxSpec )* ')' body ')' ;
	public final R5RSParser.macroBlock_return macroBlock() throws RecognitionException {
		R5RSParser.macroBlock_return retval = new R5RSParser.macroBlock_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal228=null;
		Token set229=null;
		Token char_literal230=null;
		Token char_literal232=null;
		Token char_literal234=null;
		ParserRuleReturnScope syntaxSpec231 =null;
		ParserRuleReturnScope body233 =null;

		Object char_literal228_tree=null;
		Object set229_tree=null;
		Object char_literal230_tree=null;
		Object char_literal232_tree=null;
		Object char_literal234_tree=null;

		try {
			// R5RS.g3:313:3: ( '(' ( LET_SYNTAX | LETREC_SYNTAX ) '(' ( syntaxSpec )* ')' body ')' )
			// R5RS.g3:313:6: '(' ( LET_SYNTAX | LETREC_SYNTAX ) '(' ( syntaxSpec )* ')' body ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal228=(Token)match(input,94,FOLLOW_94_in_macroBlock2059); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal228_tree = (Object)adaptor.create(char_literal228);
			adaptor.addChild(root_0, char_literal228_tree);
			}

			set229=input.LT(1);
			if ( input.LA(1)==LETREC_SYNTAX||input.LA(1)==LET_SYNTAX ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set229));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			char_literal230=(Token)match(input,94,FOLLOW_94_in_macroBlock2069); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal230_tree = (Object)adaptor.create(char_literal230);
			adaptor.addChild(root_0, char_literal230_tree);
			}

			// R5RS.g3:313:43: ( syntaxSpec )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==94) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// R5RS.g3:313:43: syntaxSpec
					{
					pushFollow(FOLLOW_syntaxSpec_in_macroBlock2071);
					syntaxSpec231=syntaxSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntaxSpec231.getTree());

					}
					break;

				default :
					break loop57;
				}
			}

			char_literal232=(Token)match(input,96,FOLLOW_96_in_macroBlock2074); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal232_tree = (Object)adaptor.create(char_literal232);
			adaptor.addChild(root_0, char_literal232_tree);
			}

			pushFollow(FOLLOW_body_in_macroBlock2076);
			body233=body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, body233.getTree());

			char_literal234=(Token)match(input,96,FOLLOW_96_in_macroBlock2078); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal234_tree = (Object)adaptor.create(char_literal234);
			adaptor.addChild(root_0, char_literal234_tree);
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
	// R5RS.g3:316:1: syntaxSpec : '(' keyword transformerSpec ')' ;
	public final R5RSParser.syntaxSpec_return syntaxSpec() throws RecognitionException {
		R5RSParser.syntaxSpec_return retval = new R5RSParser.syntaxSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal235=null;
		Token char_literal238=null;
		ParserRuleReturnScope keyword236 =null;
		ParserRuleReturnScope transformerSpec237 =null;

		Object char_literal235_tree=null;
		Object char_literal238_tree=null;

		try {
			// R5RS.g3:317:3: ( '(' keyword transformerSpec ')' )
			// R5RS.g3:317:6: '(' keyword transformerSpec ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal235=(Token)match(input,94,FOLLOW_94_in_syntaxSpec2092); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal235_tree = (Object)adaptor.create(char_literal235);
			adaptor.addChild(root_0, char_literal235_tree);
			}

			pushFollow(FOLLOW_keyword_in_syntaxSpec2094);
			keyword236=keyword();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword236.getTree());

			pushFollow(FOLLOW_transformerSpec_in_syntaxSpec2096);
			transformerSpec237=transformerSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, transformerSpec237.getTree());

			char_literal238=(Token)match(input,96,FOLLOW_96_in_syntaxSpec2098); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal238_tree = (Object)adaptor.create(char_literal238);
			adaptor.addChild(root_0, char_literal238_tree);
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
	// R5RS.g3:320:1: body : ( ( definition )=> definition )* sequence ;
	public final R5RSParser.body_return body() throws RecognitionException {
		R5RSParser.body_return retval = new R5RSParser.body_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope definition239 =null;
		ParserRuleReturnScope sequence240 =null;


		try {
			// R5RS.g3:321:3: ( ( ( definition )=> definition )* sequence )
			// R5RS.g3:321:6: ( ( definition )=> definition )* sequence
			{
			root_0 = (Object)adaptor.nil();


			// R5RS.g3:321:6: ( ( definition )=> definition )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==94) ) {
					int LA58_4 = input.LA(2);
					if ( (synpred16_R5RS()) ) {
						alt58=1;
					}

				}

				switch (alt58) {
				case 1 :
					// R5RS.g3:321:7: ( definition )=> definition
					{
					pushFollow(FOLLOW_definition_in_body2118);
					definition239=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition239.getTree());

					}
					break;

				default :
					break loop58;
				}
			}

			pushFollow(FOLLOW_sequence_in_body2122);
			sequence240=sequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence240.getTree());

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
	// R5RS.g3:324:1: sequence : ( expression )+ -> ^( SEQUENCE ( expression )+ ) ;
	public final R5RSParser.sequence_return sequence() throws RecognitionException {
		R5RSParser.sequence_return retval = new R5RSParser.sequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression241 =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// R5RS.g3:325:3: ( ( expression )+ -> ^( SEQUENCE ( expression )+ ) )
			// R5RS.g3:325:6: ( expression )+
			{
			// R5RS.g3:325:6: ( expression )+
			int cnt59=0;
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==CHARACTER||LA59_0==ELLIPSIS||LA59_0==FALSE||(LA59_0 >= NUM_10 && LA59_0 <= NUM_8)||LA59_0==STRING||LA59_0==TRUE||LA59_0==VARIABLE||LA59_0==94||(LA59_0 >= 100 && LA59_0 <= 101)) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// R5RS.g3:325:6: expression
					{
					pushFollow(FOLLOW_expression_in_sequence2136);
					expression241=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression241.getTree());
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
			// 325:18: -> ^( SEQUENCE ( expression )+ )
			{
				// R5RS.g3:325:21: ^( SEQUENCE ( expression )+ )
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
	// R5RS.g3:328:1: datum : ( simpleDatum | compoundDatum );
	public final R5RSParser.datum_return datum() throws RecognitionException {
		R5RSParser.datum_return retval = new R5RSParser.datum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simpleDatum242 =null;
		ParserRuleReturnScope compoundDatum243 =null;


		try {
			// R5RS.g3:329:3: ( simpleDatum | compoundDatum )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( ((LA60_0 >= AND && LA60_0 <= CHARACTER)||LA60_0==COND||LA60_0==DEFINE||LA60_0==DELAY||(LA60_0 >= DO && LA60_0 <= ELSE)||LA60_0==FALSE||LA60_0==IF||(LA60_0 >= LAMBDA && LA60_0 <= LETREC)||LA60_0==LETSTAR||(LA60_0 >= NUM_10 && LA60_0 <= OR)||LA60_0==QUASIQUOTE||LA60_0==QUOTE||LA60_0==SET||LA60_0==STRING||LA60_0==TRUE||(LA60_0 >= UNQUOTE && LA60_0 <= UNQUOTE_SPLICING)||LA60_0==VARIABLE) ) {
				alt60=1;
			}
			else if ( ((LA60_0 >= 93 && LA60_0 <= 94)||(LA60_0 >= 97 && LA60_0 <= 98)||(LA60_0 >= 100 && LA60_0 <= 101)) ) {
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
					// R5RS.g3:329:6: simpleDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleDatum_in_datum2160);
					simpleDatum242=simpleDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDatum242.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:330:6: compoundDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_compoundDatum_in_datum2167);
					compoundDatum243=compoundDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compoundDatum243.getTree());

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
	// R5RS.g3:333:1: simpleDatum : ( bool | number | CHARACTER | STRING | identifier );
	public final R5RSParser.simpleDatum_return simpleDatum() throws RecognitionException {
		R5RSParser.simpleDatum_return retval = new R5RSParser.simpleDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHARACTER246=null;
		Token STRING247=null;
		ParserRuleReturnScope bool244 =null;
		ParserRuleReturnScope number245 =null;
		ParserRuleReturnScope identifier248 =null;

		Object CHARACTER246_tree=null;
		Object STRING247_tree=null;

		try {
			// R5RS.g3:334:3: ( bool | number | CHARACTER | STRING | identifier )
			int alt61=5;
			switch ( input.LA(1) ) {
			case FALSE:
			case TRUE:
				{
				alt61=1;
				}
				break;
			case NUM_10:
			case NUM_16:
			case NUM_2:
			case NUM_8:
				{
				alt61=2;
				}
				break;
			case CHARACTER:
				{
				alt61=3;
				}
				break;
			case STRING:
				{
				alt61=4;
				}
				break;
			case AND:
			case ARROW:
			case BEGIN:
			case CASE:
			case COND:
			case DEFINE:
			case DELAY:
			case DO:
			case ELLIPSIS:
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
				alt61=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}
			switch (alt61) {
				case 1 :
					// R5RS.g3:334:6: bool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_in_simpleDatum2181);
					bool244=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool244.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:335:6: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_simpleDatum2188);
					number245=number();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number245.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:336:6: CHARACTER
					{
					root_0 = (Object)adaptor.nil();


					CHARACTER246=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_simpleDatum2195); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHARACTER246_tree = (Object)adaptor.create(CHARACTER246);
					adaptor.addChild(root_0, CHARACTER246_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:337:6: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING247=(Token)match(input,STRING,FOLLOW_STRING_in_simpleDatum2202); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING247_tree = (Object)adaptor.create(STRING247);
					adaptor.addChild(root_0, STRING247_tree);
					}

					}
					break;
				case 5 :
					// R5RS.g3:338:6: identifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_simpleDatum2209);
					identifier248=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier248.getTree());

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
	// R5RS.g3:341:1: compoundDatum : ( list -> ^( LIST list ) | vector );
	public final R5RSParser.compoundDatum_return compoundDatum() throws RecognitionException {
		R5RSParser.compoundDatum_return retval = new R5RSParser.compoundDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope list249 =null;
		ParserRuleReturnScope vector250 =null;

		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// R5RS.g3:342:3: ( list -> ^( LIST list ) | vector )
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==94||(LA62_0 >= 97 && LA62_0 <= 98)||(LA62_0 >= 100 && LA62_0 <= 101)) ) {
				alt62=1;
			}
			else if ( (LA62_0==93) ) {
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
					// R5RS.g3:342:6: list
					{
					pushFollow(FOLLOW_list_in_compoundDatum2223);
					list249=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_list.add(list249.getTree());
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
					// 342:11: -> ^( LIST list )
					{
						// R5RS.g3:342:14: ^( LIST list )
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
					// R5RS.g3:343:6: vector
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_vector_in_compoundDatum2238);
					vector250=vector();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, vector250.getTree());

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
	// R5RS.g3:346:1: list : ( '(' ( ( datum )+ ( '.' datum )? )? ')' | abbreviation );
	public final R5RSParser.list_return list() throws RecognitionException {
		R5RSParser.list_return retval = new R5RSParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal251=null;
		Token char_literal253=null;
		Token char_literal255=null;
		ParserRuleReturnScope datum252 =null;
		ParserRuleReturnScope datum254 =null;
		ParserRuleReturnScope abbreviation256 =null;

		Object char_literal251_tree=null;
		Object char_literal253_tree=null;
		Object char_literal255_tree=null;

		try {
			// R5RS.g3:347:3: ( '(' ( ( datum )+ ( '.' datum )? )? ')' | abbreviation )
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==94) ) {
				alt66=1;
			}
			else if ( ((LA66_0 >= 97 && LA66_0 <= 98)||(LA66_0 >= 100 && LA66_0 <= 101)) ) {
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
					// R5RS.g3:347:6: '(' ( ( datum )+ ( '.' datum )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal251=(Token)match(input,94,FOLLOW_94_in_list2252); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal251_tree = (Object)adaptor.create(char_literal251);
					adaptor.addChild(root_0, char_literal251_tree);
					}

					// R5RS.g3:347:10: ( ( datum )+ ( '.' datum )? )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( ((LA65_0 >= AND && LA65_0 <= CHARACTER)||LA65_0==COND||LA65_0==DEFINE||LA65_0==DELAY||(LA65_0 >= DO && LA65_0 <= ELSE)||LA65_0==FALSE||LA65_0==IF||(LA65_0 >= LAMBDA && LA65_0 <= LETREC)||LA65_0==LETSTAR||(LA65_0 >= NUM_10 && LA65_0 <= OR)||LA65_0==QUASIQUOTE||LA65_0==QUOTE||LA65_0==SET||LA65_0==STRING||LA65_0==TRUE||(LA65_0 >= UNQUOTE && LA65_0 <= UNQUOTE_SPLICING)||(LA65_0 >= VARIABLE && LA65_0 <= 94)||(LA65_0 >= 97 && LA65_0 <= 98)||(LA65_0 >= 100 && LA65_0 <= 101)) ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// R5RS.g3:347:11: ( datum )+ ( '.' datum )?
							{
							// R5RS.g3:347:11: ( datum )+
							int cnt63=0;
							loop63:
							while (true) {
								int alt63=2;
								int LA63_0 = input.LA(1);
								if ( ((LA63_0 >= AND && LA63_0 <= CHARACTER)||LA63_0==COND||LA63_0==DEFINE||LA63_0==DELAY||(LA63_0 >= DO && LA63_0 <= ELSE)||LA63_0==FALSE||LA63_0==IF||(LA63_0 >= LAMBDA && LA63_0 <= LETREC)||LA63_0==LETSTAR||(LA63_0 >= NUM_10 && LA63_0 <= OR)||LA63_0==QUASIQUOTE||LA63_0==QUOTE||LA63_0==SET||LA63_0==STRING||LA63_0==TRUE||(LA63_0 >= UNQUOTE && LA63_0 <= UNQUOTE_SPLICING)||(LA63_0 >= VARIABLE && LA63_0 <= 94)||(LA63_0 >= 97 && LA63_0 <= 98)||(LA63_0 >= 100 && LA63_0 <= 101)) ) {
									alt63=1;
								}

								switch (alt63) {
								case 1 :
									// R5RS.g3:347:11: datum
									{
									pushFollow(FOLLOW_datum_in_list2255);
									datum252=datum();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, datum252.getTree());

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

							// R5RS.g3:347:18: ( '.' datum )?
							int alt64=2;
							int LA64_0 = input.LA(1);
							if ( (LA64_0==99) ) {
								alt64=1;
							}
							switch (alt64) {
								case 1 :
									// R5RS.g3:347:19: '.' datum
									{
									char_literal253=(Token)match(input,99,FOLLOW_99_in_list2259); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal253_tree = (Object)adaptor.create(char_literal253);
									adaptor.addChild(root_0, char_literal253_tree);
									}

									pushFollow(FOLLOW_datum_in_list2261);
									datum254=datum();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, datum254.getTree());

									}
									break;

							}

							}
							break;

					}

					char_literal255=(Token)match(input,96,FOLLOW_96_in_list2267); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal255_tree = (Object)adaptor.create(char_literal255);
					adaptor.addChild(root_0, char_literal255_tree);
					}

					}
					break;
				case 2 :
					// R5RS.g3:348:6: abbreviation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_abbreviation_in_list2274);
					abbreviation256=abbreviation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, abbreviation256.getTree());

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
	// R5RS.g3:351:1: abbreviation : abbrevPrefix datum ;
	public final R5RSParser.abbreviation_return abbreviation() throws RecognitionException {
		R5RSParser.abbreviation_return retval = new R5RSParser.abbreviation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope abbrevPrefix257 =null;
		ParserRuleReturnScope datum258 =null;


		try {
			// R5RS.g3:352:3: ( abbrevPrefix datum )
			// R5RS.g3:352:6: abbrevPrefix datum
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_abbrevPrefix_in_abbreviation2288);
			abbrevPrefix257=abbrevPrefix();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, abbrevPrefix257.getTree());

			pushFollow(FOLLOW_datum_in_abbreviation2290);
			datum258=datum();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, datum258.getTree());

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
	// R5RS.g3:355:1: abbrevPrefix : ( '\\'' | '`' | ',@' | ',' );
	public final R5RSParser.abbrevPrefix_return abbrevPrefix() throws RecognitionException {
		R5RSParser.abbrevPrefix_return retval = new R5RSParser.abbrevPrefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set259=null;

		Object set259_tree=null;

		try {
			// R5RS.g3:356:3: ( '\\'' | '`' | ',@' | ',' )
			// R5RS.g3:
			{
			root_0 = (Object)adaptor.nil();


			set259=input.LT(1);
			if ( (input.LA(1) >= 97 && input.LA(1) <= 98)||(input.LA(1) >= 100 && input.LA(1) <= 101) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set259));
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
	// R5RS.g3:359:1: vector : '#(' ( datum )* ')' ;
	public final R5RSParser.vector_return vector() throws RecognitionException {
		R5RSParser.vector_return retval = new R5RSParser.vector_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal260=null;
		Token char_literal262=null;
		ParserRuleReturnScope datum261 =null;

		Object string_literal260_tree=null;
		Object char_literal262_tree=null;

		try {
			// R5RS.g3:360:3: ( '#(' ( datum )* ')' )
			// R5RS.g3:360:6: '#(' ( datum )* ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal260=(Token)match(input,93,FOLLOW_93_in_vector2330); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal260_tree = (Object)adaptor.create(string_literal260);
			adaptor.addChild(root_0, string_literal260_tree);
			}

			// R5RS.g3:360:11: ( datum )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( ((LA67_0 >= AND && LA67_0 <= CHARACTER)||LA67_0==COND||LA67_0==DEFINE||LA67_0==DELAY||(LA67_0 >= DO && LA67_0 <= ELSE)||LA67_0==FALSE||LA67_0==IF||(LA67_0 >= LAMBDA && LA67_0 <= LETREC)||LA67_0==LETSTAR||(LA67_0 >= NUM_10 && LA67_0 <= OR)||LA67_0==QUASIQUOTE||LA67_0==QUOTE||LA67_0==SET||LA67_0==STRING||LA67_0==TRUE||(LA67_0 >= UNQUOTE && LA67_0 <= UNQUOTE_SPLICING)||(LA67_0 >= VARIABLE && LA67_0 <= 94)||(LA67_0 >= 97 && LA67_0 <= 98)||(LA67_0 >= 100 && LA67_0 <= 101)) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// R5RS.g3:360:11: datum
					{
					pushFollow(FOLLOW_datum_in_vector2332);
					datum261=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum261.getTree());

					}
					break;

				default :
					break loop67;
				}
			}

			char_literal262=(Token)match(input,96,FOLLOW_96_in_vector2335); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal262_tree = (Object)adaptor.create(char_literal262);
			adaptor.addChild(root_0, char_literal262_tree);
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
	// $ANTLR end "vector"


	public static class number_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "number"
	// R5RS.g3:363:1: number : ( NUM_2 | NUM_8 | NUM_10 | NUM_16 );
	public final R5RSParser.number_return number() throws RecognitionException {
		R5RSParser.number_return retval = new R5RSParser.number_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set263=null;

		Object set263_tree=null;

		try {
			// R5RS.g3:364:3: ( NUM_2 | NUM_8 | NUM_10 | NUM_16 )
			// R5RS.g3:
			{
			root_0 = (Object)adaptor.nil();


			set263=input.LT(1);
			if ( (input.LA(1) >= NUM_10 && input.LA(1) <= NUM_8) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set263));
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
	// $ANTLR end "number"


	public static class bool_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bool"
	// R5RS.g3:370:1: bool : ( TRUE | FALSE );
	public final R5RSParser.bool_return bool() throws RecognitionException {
		R5RSParser.bool_return retval = new R5RSParser.bool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set264=null;

		Object set264_tree=null;

		try {
			// R5RS.g3:371:3: ( TRUE | FALSE )
			// R5RS.g3:
			{
			root_0 = (Object)adaptor.nil();


			set264=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set264));
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
	// $ANTLR end "bool"


	public static class quasiquotation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "quasiquotation"
	// R5RS.g3:375:1: quasiquotation : quasiquotationD[1] ;
	public final R5RSParser.quasiquotation_return quasiquotation() throws RecognitionException {
		R5RSParser.quasiquotation_return retval = new R5RSParser.quasiquotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope quasiquotationD265 =null;


		try {
			// R5RS.g3:376:3: ( quasiquotationD[1] )
			// R5RS.g3:376:6: quasiquotationD[1]
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_quasiquotationD_in_quasiquotation2405);
			quasiquotationD265=quasiquotationD(1);
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, quasiquotationD265.getTree());

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
	// R5RS.g3:379:1: quasiquotationD[int d] : ( '`' qqTemplate[d] | '(' QUASIQUOTE qqTemplate[d] ')' );
	public final R5RSParser.quasiquotationD_return quasiquotationD(int d) throws RecognitionException {
		R5RSParser.quasiquotationD_return retval = new R5RSParser.quasiquotationD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal266=null;
		Token char_literal268=null;
		Token QUASIQUOTE269=null;
		Token char_literal271=null;
		ParserRuleReturnScope qqTemplate267 =null;
		ParserRuleReturnScope qqTemplate270 =null;

		Object char_literal266_tree=null;
		Object char_literal268_tree=null;
		Object QUASIQUOTE269_tree=null;
		Object char_literal271_tree=null;

		try {
			// R5RS.g3:380:3: ( '`' qqTemplate[d] | '(' QUASIQUOTE qqTemplate[d] ')' )
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==101) ) {
				alt68=1;
			}
			else if ( (LA68_0==94) ) {
				alt68=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// R5RS.g3:380:6: '`' qqTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					char_literal266=(Token)match(input,101,FOLLOW_101_in_quasiquotationD2421); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal266_tree = (Object)adaptor.create(char_literal266);
					adaptor.addChild(root_0, char_literal266_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_quasiquotationD2423);
					qqTemplate267=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate267.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:381:6: '(' QUASIQUOTE qqTemplate[d] ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal268=(Token)match(input,94,FOLLOW_94_in_quasiquotationD2431); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal268_tree = (Object)adaptor.create(char_literal268);
					adaptor.addChild(root_0, char_literal268_tree);
					}

					QUASIQUOTE269=(Token)match(input,QUASIQUOTE,FOLLOW_QUASIQUOTE_in_quasiquotationD2433); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					QUASIQUOTE269_tree = (Object)adaptor.create(QUASIQUOTE269);
					adaptor.addChild(root_0, QUASIQUOTE269_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_quasiquotationD2435);
					qqTemplate270=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate270.getTree());

					char_literal271=(Token)match(input,96,FOLLOW_96_in_quasiquotationD2438); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal271_tree = (Object)adaptor.create(char_literal271);
					adaptor.addChild(root_0, char_literal271_tree);
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
	// R5RS.g3:384:1: qqTemplate[int d] : ( ( expression )=> expression | ( '(' UNQUOTE )=> unquotation[d] | simpleDatum | vectorQQTemplate[d] | listQQTemplate[d] );
	public final R5RSParser.qqTemplate_return qqTemplate(int d) throws RecognitionException {
		R5RSParser.qqTemplate_return retval = new R5RSParser.qqTemplate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression272 =null;
		ParserRuleReturnScope unquotation273 =null;
		ParserRuleReturnScope simpleDatum274 =null;
		ParserRuleReturnScope vectorQQTemplate275 =null;
		ParserRuleReturnScope listQQTemplate276 =null;


		try {
			// R5RS.g3:385:3: ( ( expression )=> expression | ( '(' UNQUOTE )=> unquotation[d] | simpleDatum | vectorQQTemplate[d] | listQQTemplate[d] )
			int alt69=5;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==VARIABLE) ) {
				int LA69_1 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt69=1;
				}
				else if ( (true) ) {
					alt69=3;
				}

			}
			else if ( (LA69_0==ELLIPSIS) ) {
				int LA69_2 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt69=1;
				}
				else if ( (true) ) {
					alt69=3;
				}

			}
			else if ( (LA69_0==100) ) {
				int LA69_3 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt69=1;
				}
				else if ( (true) ) {
					alt69=5;
				}

			}
			else if ( (LA69_0==94) ) {
				int LA69_4 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt69=1;
				}
				else if ( (synpred18_R5RS()) ) {
					alt69=2;
				}
				else if ( (true) ) {
					alt69=5;
				}

			}
			else if ( (LA69_0==FALSE||LA69_0==TRUE) ) {
				int LA69_5 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt69=1;
				}
				else if ( (true) ) {
					alt69=3;
				}

			}
			else if ( ((LA69_0 >= NUM_10 && LA69_0 <= NUM_8)) ) {
				int LA69_6 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt69=1;
				}
				else if ( (true) ) {
					alt69=3;
				}

			}
			else if ( (LA69_0==CHARACTER) ) {
				int LA69_7 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt69=1;
				}
				else if ( (true) ) {
					alt69=3;
				}

			}
			else if ( (LA69_0==STRING) ) {
				int LA69_8 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt69=1;
				}
				else if ( (true) ) {
					alt69=3;
				}

			}
			else if ( (LA69_0==101) ) {
				int LA69_9 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
					alt69=1;
				}
				else if ( (true) ) {
					alt69=5;
				}

			}
			else if ( (LA69_0==97) && (synpred18_R5RS())) {
				alt69=2;
			}
			else if ( ((LA69_0 >= AND && LA69_0 <= CASE)||LA69_0==COND||LA69_0==DEFINE||LA69_0==DELAY||LA69_0==DO||LA69_0==ELSE||LA69_0==IF||(LA69_0 >= LAMBDA && LA69_0 <= LETREC)||LA69_0==LETSTAR||LA69_0==OR||LA69_0==QUASIQUOTE||LA69_0==QUOTE||LA69_0==SET||(LA69_0 >= UNQUOTE && LA69_0 <= UNQUOTE_SPLICING)) ) {
				alt69=3;
			}
			else if ( (LA69_0==93) ) {
				alt69=4;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// R5RS.g3:385:6: ( expression )=> expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_qqTemplate2459);
					expression272=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression272.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:386:6: ( '(' UNQUOTE )=> unquotation[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unquotation_in_qqTemplate2473);
					unquotation273=unquotation(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unquotation273.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:387:22: simpleDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleDatum_in_qqTemplate2497);
					simpleDatum274=simpleDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDatum274.getTree());

					}
					break;
				case 4 :
					// R5RS.g3:388:22: vectorQQTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_vectorQQTemplate_in_qqTemplate2520);
					vectorQQTemplate275=vectorQQTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, vectorQQTemplate275.getTree());

					}
					break;
				case 5 :
					// R5RS.g3:389:22: listQQTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_listQQTemplate_in_qqTemplate2544);
					listQQTemplate276=listQQTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, listQQTemplate276.getTree());

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
	// R5RS.g3:392:1: vectorQQTemplate[int d] : '#(' ( qqTemplateOrSplice[d] )* ')' ;
	public final R5RSParser.vectorQQTemplate_return vectorQQTemplate(int d) throws RecognitionException {
		R5RSParser.vectorQQTemplate_return retval = new R5RSParser.vectorQQTemplate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal277=null;
		Token char_literal279=null;
		ParserRuleReturnScope qqTemplateOrSplice278 =null;

		Object string_literal277_tree=null;
		Object char_literal279_tree=null;

		try {
			// R5RS.g3:393:3: ( '#(' ( qqTemplateOrSplice[d] )* ')' )
			// R5RS.g3:393:6: '#(' ( qqTemplateOrSplice[d] )* ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal277=(Token)match(input,93,FOLLOW_93_in_vectorQQTemplate2560); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal277_tree = (Object)adaptor.create(string_literal277);
			adaptor.addChild(root_0, string_literal277_tree);
			}

			// R5RS.g3:393:11: ( qqTemplateOrSplice[d] )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( ((LA70_0 >= AND && LA70_0 <= CHARACTER)||LA70_0==COND||LA70_0==DEFINE||LA70_0==DELAY||(LA70_0 >= DO && LA70_0 <= ELSE)||LA70_0==FALSE||LA70_0==IF||(LA70_0 >= LAMBDA && LA70_0 <= LETREC)||LA70_0==LETSTAR||(LA70_0 >= NUM_10 && LA70_0 <= OR)||LA70_0==QUASIQUOTE||LA70_0==QUOTE||LA70_0==SET||LA70_0==STRING||LA70_0==TRUE||(LA70_0 >= UNQUOTE && LA70_0 <= UNQUOTE_SPLICING)||(LA70_0 >= VARIABLE && LA70_0 <= 94)||(LA70_0 >= 97 && LA70_0 <= 98)||(LA70_0 >= 100 && LA70_0 <= 101)) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// R5RS.g3:393:11: qqTemplateOrSplice[d]
					{
					pushFollow(FOLLOW_qqTemplateOrSplice_in_vectorQQTemplate2562);
					qqTemplateOrSplice278=qqTemplateOrSplice(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplateOrSplice278.getTree());

					}
					break;

				default :
					break loop70;
				}
			}

			char_literal279=(Token)match(input,96,FOLLOW_96_in_vectorQQTemplate2566); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal279_tree = (Object)adaptor.create(char_literal279);
			adaptor.addChild(root_0, char_literal279_tree);
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
	// R5RS.g3:396:1: listQQTemplate[int d] : ( '\\'' qqTemplate[d] | ( '(' QUASIQUOTE )=> quasiquotationD[d+1] | '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')' );
	public final R5RSParser.listQQTemplate_return listQQTemplate(int d) throws RecognitionException {
		R5RSParser.listQQTemplate_return retval = new R5RSParser.listQQTemplate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal280=null;
		Token char_literal283=null;
		Token char_literal285=null;
		Token char_literal287=null;
		ParserRuleReturnScope qqTemplate281 =null;
		ParserRuleReturnScope quasiquotationD282 =null;
		ParserRuleReturnScope qqTemplateOrSplice284 =null;
		ParserRuleReturnScope qqTemplate286 =null;

		Object char_literal280_tree=null;
		Object char_literal283_tree=null;
		Object char_literal285_tree=null;
		Object char_literal287_tree=null;

		try {
			// R5RS.g3:397:3: ( '\\'' qqTemplate[d] | ( '(' QUASIQUOTE )=> quasiquotationD[d+1] | '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')' )
			int alt74=3;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==100) ) {
				alt74=1;
			}
			else if ( (LA74_0==101) && (synpred19_R5RS())) {
				alt74=2;
			}
			else if ( (LA74_0==94) ) {
				int LA74_3 = input.LA(2);
				if ( (synpred19_R5RS()) ) {
					alt74=2;
				}
				else if ( (true) ) {
					alt74=3;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// R5RS.g3:397:25: '\\'' qqTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					char_literal280=(Token)match(input,100,FOLLOW_100_in_listQQTemplate2600); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal280_tree = (Object)adaptor.create(char_literal280);
					adaptor.addChild(root_0, char_literal280_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_listQQTemplate2602);
					qqTemplate281=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate281.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:398:6: ( '(' QUASIQUOTE )=> quasiquotationD[d+1]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_quasiquotationD_in_listQQTemplate2617);
					quasiquotationD282=quasiquotationD(d+1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quasiquotationD282.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:399:25: '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal283=(Token)match(input,94,FOLLOW_94_in_listQQTemplate2644); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal283_tree = (Object)adaptor.create(char_literal283);
					adaptor.addChild(root_0, char_literal283_tree);
					}

					// R5RS.g3:399:29: ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( ((LA73_0 >= AND && LA73_0 <= CHARACTER)||LA73_0==COND||LA73_0==DEFINE||LA73_0==DELAY||(LA73_0 >= DO && LA73_0 <= ELSE)||LA73_0==FALSE||LA73_0==IF||(LA73_0 >= LAMBDA && LA73_0 <= LETREC)||LA73_0==LETSTAR||(LA73_0 >= NUM_10 && LA73_0 <= OR)||LA73_0==QUASIQUOTE||LA73_0==QUOTE||LA73_0==SET||LA73_0==STRING||LA73_0==TRUE||(LA73_0 >= UNQUOTE && LA73_0 <= UNQUOTE_SPLICING)||(LA73_0 >= VARIABLE && LA73_0 <= 94)||(LA73_0 >= 97 && LA73_0 <= 98)||(LA73_0 >= 100 && LA73_0 <= 101)) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// R5RS.g3:399:30: ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )?
							{
							// R5RS.g3:399:30: ( qqTemplateOrSplice[d] )+
							int cnt71=0;
							loop71:
							while (true) {
								int alt71=2;
								int LA71_0 = input.LA(1);
								if ( ((LA71_0 >= AND && LA71_0 <= CHARACTER)||LA71_0==COND||LA71_0==DEFINE||LA71_0==DELAY||(LA71_0 >= DO && LA71_0 <= ELSE)||LA71_0==FALSE||LA71_0==IF||(LA71_0 >= LAMBDA && LA71_0 <= LETREC)||LA71_0==LETSTAR||(LA71_0 >= NUM_10 && LA71_0 <= OR)||LA71_0==QUASIQUOTE||LA71_0==QUOTE||LA71_0==SET||LA71_0==STRING||LA71_0==TRUE||(LA71_0 >= UNQUOTE && LA71_0 <= UNQUOTE_SPLICING)||(LA71_0 >= VARIABLE && LA71_0 <= 94)||(LA71_0 >= 97 && LA71_0 <= 98)||(LA71_0 >= 100 && LA71_0 <= 101)) ) {
									alt71=1;
								}

								switch (alt71) {
								case 1 :
									// R5RS.g3:399:30: qqTemplateOrSplice[d]
									{
									pushFollow(FOLLOW_qqTemplateOrSplice_in_listQQTemplate2647);
									qqTemplateOrSplice284=qqTemplateOrSplice(d);
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplateOrSplice284.getTree());

									}
									break;

								default :
									if ( cnt71 >= 1 ) break loop71;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(71, input);
									throw eee;
								}
								cnt71++;
							}

							// R5RS.g3:399:53: ( '.' qqTemplate[d] )?
							int alt72=2;
							int LA72_0 = input.LA(1);
							if ( (LA72_0==99) ) {
								alt72=1;
							}
							switch (alt72) {
								case 1 :
									// R5RS.g3:399:54: '.' qqTemplate[d]
									{
									char_literal285=(Token)match(input,99,FOLLOW_99_in_listQQTemplate2652); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal285_tree = (Object)adaptor.create(char_literal285);
									adaptor.addChild(root_0, char_literal285_tree);
									}

									pushFollow(FOLLOW_qqTemplate_in_listQQTemplate2654);
									qqTemplate286=qqTemplate(d);
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate286.getTree());

									}
									break;

							}

							}
							break;

					}

					char_literal287=(Token)match(input,96,FOLLOW_96_in_listQQTemplate2661); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal287_tree = (Object)adaptor.create(char_literal287);
					adaptor.addChild(root_0, char_literal287_tree);
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
	// R5RS.g3:402:1: unquotation[int d] : ( ',' qqTemplate[d-1] | '(' UNQUOTE qqTemplate[d-1] ')' );
	public final R5RSParser.unquotation_return unquotation(int d) throws RecognitionException {
		R5RSParser.unquotation_return retval = new R5RSParser.unquotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal288=null;
		Token char_literal290=null;
		Token UNQUOTE291=null;
		Token char_literal293=null;
		ParserRuleReturnScope qqTemplate289 =null;
		ParserRuleReturnScope qqTemplate292 =null;

		Object char_literal288_tree=null;
		Object char_literal290_tree=null;
		Object UNQUOTE291_tree=null;
		Object char_literal293_tree=null;

		try {
			// R5RS.g3:403:3: ( ',' qqTemplate[d-1] | '(' UNQUOTE qqTemplate[d-1] ')' )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==97) ) {
				alt75=1;
			}
			else if ( (LA75_0==94) ) {
				alt75=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// R5RS.g3:403:6: ',' qqTemplate[d-1]
					{
					root_0 = (Object)adaptor.nil();


					char_literal288=(Token)match(input,97,FOLLOW_97_in_unquotation2676); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal288_tree = (Object)adaptor.create(char_literal288);
					adaptor.addChild(root_0, char_literal288_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_unquotation2678);
					qqTemplate289=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate289.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:404:6: '(' UNQUOTE qqTemplate[d-1] ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal290=(Token)match(input,94,FOLLOW_94_in_unquotation2686); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal290_tree = (Object)adaptor.create(char_literal290);
					adaptor.addChild(root_0, char_literal290_tree);
					}

					UNQUOTE291=(Token)match(input,UNQUOTE,FOLLOW_UNQUOTE_in_unquotation2688); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE291_tree = (Object)adaptor.create(UNQUOTE291);
					adaptor.addChild(root_0, UNQUOTE291_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_unquotation2690);
					qqTemplate292=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate292.getTree());

					char_literal293=(Token)match(input,96,FOLLOW_96_in_unquotation2693); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal293_tree = (Object)adaptor.create(char_literal293);
					adaptor.addChild(root_0, char_literal293_tree);
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
	// R5RS.g3:407:1: qqTemplateOrSplice[int d] : ( ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d] | qqTemplate[d] );
	public final R5RSParser.qqTemplateOrSplice_return qqTemplateOrSplice(int d) throws RecognitionException {
		R5RSParser.qqTemplateOrSplice_return retval = new R5RSParser.qqTemplateOrSplice_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope splicingUnquotation294 =null;
		ParserRuleReturnScope qqTemplate295 =null;


		try {
			// R5RS.g3:408:3: ( ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d] | qqTemplate[d] )
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==98) && (synpred20_R5RS())) {
				alt76=1;
			}
			else if ( (LA76_0==94) ) {
				int LA76_2 = input.LA(2);
				if ( (synpred20_R5RS()) ) {
					alt76=1;
				}
				else if ( (true) ) {
					alt76=2;
				}

			}
			else if ( ((LA76_0 >= AND && LA76_0 <= CHARACTER)||LA76_0==COND||LA76_0==DEFINE||LA76_0==DELAY||(LA76_0 >= DO && LA76_0 <= ELSE)||LA76_0==FALSE||LA76_0==IF||(LA76_0 >= LAMBDA && LA76_0 <= LETREC)||LA76_0==LETSTAR||(LA76_0 >= NUM_10 && LA76_0 <= OR)||LA76_0==QUASIQUOTE||LA76_0==QUOTE||LA76_0==SET||LA76_0==STRING||LA76_0==TRUE||(LA76_0 >= UNQUOTE && LA76_0 <= UNQUOTE_SPLICING)||(LA76_0 >= VARIABLE && LA76_0 <= 93)||LA76_0==97||(LA76_0 >= 100 && LA76_0 <= 101)) ) {
				alt76=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}

			switch (alt76) {
				case 1 :
					// R5RS.g3:408:6: ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_splicingUnquotation_in_qqTemplateOrSplice2715);
					splicingUnquotation294=splicingUnquotation(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, splicingUnquotation294.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:409:31: qqTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_qqTemplate_in_qqTemplateOrSplice2748);
					qqTemplate295=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate295.getTree());

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
	// R5RS.g3:412:1: splicingUnquotation[int d] : ( ',@' qqTemplate[d-1] | '(' UNQUOTE_SPLICING qqTemplate[d-1] ')' );
	public final R5RSParser.splicingUnquotation_return splicingUnquotation(int d) throws RecognitionException {
		R5RSParser.splicingUnquotation_return retval = new R5RSParser.splicingUnquotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal296=null;
		Token char_literal298=null;
		Token UNQUOTE_SPLICING299=null;
		Token char_literal301=null;
		ParserRuleReturnScope qqTemplate297 =null;
		ParserRuleReturnScope qqTemplate300 =null;

		Object string_literal296_tree=null;
		Object char_literal298_tree=null;
		Object UNQUOTE_SPLICING299_tree=null;
		Object char_literal301_tree=null;

		try {
			// R5RS.g3:413:3: ( ',@' qqTemplate[d-1] | '(' UNQUOTE_SPLICING qqTemplate[d-1] ')' )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==98) ) {
				alt77=1;
			}
			else if ( (LA77_0==94) ) {
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
					// R5RS.g3:413:6: ',@' qqTemplate[d-1]
					{
					root_0 = (Object)adaptor.nil();


					string_literal296=(Token)match(input,98,FOLLOW_98_in_splicingUnquotation2764); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal296_tree = (Object)adaptor.create(string_literal296);
					adaptor.addChild(root_0, string_literal296_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_splicingUnquotation2766);
					qqTemplate297=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate297.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:414:6: '(' UNQUOTE_SPLICING qqTemplate[d-1] ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal298=(Token)match(input,94,FOLLOW_94_in_splicingUnquotation2774); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal298_tree = (Object)adaptor.create(char_literal298);
					adaptor.addChild(root_0, char_literal298_tree);
					}

					UNQUOTE_SPLICING299=(Token)match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_splicingUnquotation2776); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE_SPLICING299_tree = (Object)adaptor.create(UNQUOTE_SPLICING299);
					adaptor.addChild(root_0, UNQUOTE_SPLICING299_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_splicingUnquotation2778);
					qqTemplate300=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate300.getTree());

					char_literal301=(Token)match(input,96,FOLLOW_96_in_splicingUnquotation2781); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal301_tree = (Object)adaptor.create(char_literal301);
					adaptor.addChild(root_0, char_literal301_tree);
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
		// R5RS.g3:64:6: ( syntaxDefinition )
		// R5RS.g3:64:7: syntaxDefinition
		{
		pushFollow(FOLLOW_syntaxDefinition_in_synpred1_R5RS161);
		syntaxDefinition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_R5RS

	// $ANTLR start synpred2_R5RS
	public final void synpred2_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:65:6: ( definition )
		// R5RS.g3:65:7: definition
		{
		pushFollow(FOLLOW_definition_in_synpred2_R5RS186);
		definition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_R5RS

	// $ANTLR start synpred3_R5RS
	public final void synpred3_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:66:6: ( '(' BEGIN commandOrDefinition )
		// R5RS.g3:66:7: '(' BEGIN commandOrDefinition
		{
		match(input,94,FOLLOW_94_in_synpred3_R5RS217); if (state.failed) return;

		match(input,BEGIN,FOLLOW_BEGIN_in_synpred3_R5RS219); if (state.failed) return;

		pushFollow(FOLLOW_commandOrDefinition_in_synpred3_R5RS221);
		commandOrDefinition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_R5RS

	// $ANTLR start synpred4_R5RS
	public final void synpred4_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:75:5: ( simpleDefinition )
		// R5RS.g3:75:6: simpleDefinition
		{
		pushFollow(FOLLOW_simpleDefinition_in_synpred4_R5RS318);
		simpleDefinition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_R5RS

	// $ANTLR start synpred5_R5RS
	public final void synpred5_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:76:5: ( formalDefinition )
		// R5RS.g3:76:6: formalDefinition
		{
		pushFollow(FOLLOW_formalDefinition_in_synpred5_R5RS330);
		formalDefinition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_R5RS

	// $ANTLR start synpred6_R5RS
	public final void synpred6_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:175:6: ( variable )
		// R5RS.g3:175:7: variable
		{
		pushFollow(FOLLOW_variable_in_synpred6_R5RS954);
		variable();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_R5RS

	// $ANTLR start synpred7_R5RS
	public final void synpred7_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:176:6: ( literal )
		// R5RS.g3:176:7: literal
		{
		pushFollow(FOLLOW_literal_in_synpred7_R5RS975);
		literal();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_R5RS

	// $ANTLR start synpred8_R5RS
	public final void synpred8_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:177:6: ( lambdaExpression )
		// R5RS.g3:177:7: lambdaExpression
		{
		pushFollow(FOLLOW_lambdaExpression_in_synpred8_R5RS1005);
		lambdaExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_R5RS

	// $ANTLR start synpred9_R5RS
	public final void synpred9_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:178:6: ( conditional )
		// R5RS.g3:178:7: conditional
		{
		pushFollow(FOLLOW_conditional_in_synpred9_R5RS1018);
		conditional();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred9_R5RS

	// $ANTLR start synpred10_R5RS
	public final void synpred10_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:179:6: ( assignment )
		// R5RS.g3:179:7: assignment
		{
		pushFollow(FOLLOW_assignment_in_synpred10_R5RS1036);
		assignment();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred10_R5RS

	// $ANTLR start synpred11_R5RS
	public final void synpred11_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:180:6: ( derivedExpression )
		// R5RS.g3:180:7: derivedExpression
		{
		pushFollow(FOLLOW_derivedExpression_in_synpred11_R5RS1055);
		derivedExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred11_R5RS

	// $ANTLR start synpred12_R5RS
	public final void synpred12_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:181:6: ( procedureCall )
		// R5RS.g3:181:7: procedureCall
		{
		pushFollow(FOLLOW_procedureCall_in_synpred12_R5RS1067);
		procedureCall();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred12_R5RS

	// $ANTLR start synpred13_R5RS
	public final void synpred13_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:182:6: ( macroUse )
		// R5RS.g3:182:7: macroUse
		{
		pushFollow(FOLLOW_macroUse_in_synpred13_R5RS1083);
		macroUse();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred13_R5RS

	// $ANTLR start synpred14_R5RS
	public final void synpred14_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:213:5: ( variable )
		// R5RS.g3:213:6: variable
		{
		pushFollow(FOLLOW_variable_in_synpred14_R5RS1284);
		variable();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred14_R5RS

	// $ANTLR start synpred15_R5RS
	public final void synpred15_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:214:5: ( formals )
		// R5RS.g3:214:6: formals
		{
		pushFollow(FOLLOW_formals_in_synpred15_R5RS1296);
		formals();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred15_R5RS

	// $ANTLR start synpred16_R5RS
	public final void synpred16_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:321:7: ( definition )
		// R5RS.g3:321:8: definition
		{
		pushFollow(FOLLOW_definition_in_synpred16_R5RS2114);
		definition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred16_R5RS

	// $ANTLR start synpred17_R5RS
	public final void synpred17_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:385:6: ( expression )
		// R5RS.g3:385:7: expression
		{
		pushFollow(FOLLOW_expression_in_synpred17_R5RS2454);
		expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred17_R5RS

	// $ANTLR start synpred18_R5RS
	public final void synpred18_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:386:6: ( '(' UNQUOTE )
		// R5RS.g3:386:7: '(' UNQUOTE
		{
		match(input,94,FOLLOW_94_in_synpred18_R5RS2467); if (state.failed) return;

		match(input,UNQUOTE,FOLLOW_UNQUOTE_in_synpred18_R5RS2469); if (state.failed) return;

		}

	}
	// $ANTLR end synpred18_R5RS

	// $ANTLR start synpred19_R5RS
	public final void synpred19_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:398:6: ( '(' QUASIQUOTE )
		// R5RS.g3:398:7: '(' QUASIQUOTE
		{
		match(input,94,FOLLOW_94_in_synpred19_R5RS2611); if (state.failed) return;

		match(input,QUASIQUOTE,FOLLOW_QUASIQUOTE_in_synpred19_R5RS2613); if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_R5RS

	// $ANTLR start synpred20_R5RS
	public final void synpred20_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:408:6: ( '(' UNQUOTE_SPLICING )
		// R5RS.g3:408:7: '(' UNQUOTE_SPLICING
		{
		match(input,94,FOLLOW_94_in_synpred20_R5RS2709); if (state.failed) return;

		match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_synpred20_R5RS2711); if (state.failed) return;

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



	public static final BitSet FOLLOW_commandOrDefinition_in_parse143 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_EOF_in_parse146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntaxDefinition_in_commandOrDefinition178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_commandOrDefinition209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_commandOrDefinition225 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BEGIN_in_commandOrDefinition228 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_commandOrDefinition_in_commandOrDefinition234 = new BitSet(new long[]{0x0007800108000100L,0x0000003150020800L});
	public static final BitSet FOLLOW_96_in_commandOrDefinition237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commandOrDefinition279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_syntaxDefinition293 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_DEFINE_SYNTAX_in_syntaxDefinition296 = new BitSet(new long[]{0x140805D01C2900F0L,0x0000000010C00040L});
	public static final BitSet FOLLOW_keyword_in_syntaxDefinition299 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_transformerSpec_in_syntaxDefinition301 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_syntaxDefinition303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDefinition_in_definition323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalDefinition_in_definition335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_definition341 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BEGIN_in_definition344 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_definition_in_definition347 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_96_in_definition350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_simpleDefinition365 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DEFINE_in_simpleDefinition368 = new BitSet(new long[]{0x0000000008000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_variable_in_simpleDefinition371 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_expression_in_simpleDefinition373 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_simpleDefinition375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_formalDefinition389 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DEFINE_in_formalDefinition392 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_formals_in_formalDefinition395 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_body_in_formalDefinition397 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_formalDefinition399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_formals413 = new BitSet(new long[]{0x0000000008000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_variable_in_formals416 = new BitSet(new long[]{0x0000000008000000L,0x0000000910000000L});
	public static final BitSet FOLLOW_variable_in_formals418 = new BitSet(new long[]{0x0000000008000000L,0x0000000910000000L});
	public static final BitSet FOLLOW_99_in_formals422 = new BitSet(new long[]{0x0000000008000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_variable_in_formals424 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_formals428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_keyword443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_transformerSpec457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SYNTAX_RULES_in_transformerSpec460 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_transformerSpec463 = new BitSet(new long[]{0x140805D01C2900F0L,0x0000000110C00040L});
	public static final BitSet FOLLOW_identifier_in_transformerSpec466 = new BitSet(new long[]{0x140805D01C2900F0L,0x0000000110C00040L});
	public static final BitSet FOLLOW_96_in_transformerSpec469 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_syntaxRule_in_transformerSpec472 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_96_in_transformerSpec475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_syntaxRule490 = new BitSet(new long[]{0x140F85D1142901F0L,0x0000000070C20840L});
	public static final BitSet FOLLOW_pattern_in_syntaxRule492 = new BitSet(new long[]{0x140F85D1142901F0L,0x0000000070C20840L});
	public static final BitSet FOLLOW_template_in_syntaxRule494 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_syntaxRule496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternIdentifier_in_pattern520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_pattern527 = new BitSet(new long[]{0x140F85D1142901F0L,0x0000000170C20840L});
	public static final BitSet FOLLOW_pattern_in_pattern530 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000000970C20840L});
	public static final BitSet FOLLOW_99_in_pattern534 = new BitSet(new long[]{0x140F85D1142901F0L,0x0000000070C20840L});
	public static final BitSet FOLLOW_pattern_in_pattern536 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_ELLIPSIS_in_pattern540 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_pattern547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_pattern554 = new BitSet(new long[]{0x140F85D1142901F0L,0x0000000170C20840L});
	public static final BitSet FOLLOW_pattern_in_pattern557 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000000170C20840L});
	public static final BitSet FOLLOW_ELLIPSIS_in_pattern560 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_pattern566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternDatum_in_pattern573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntacticKeyword_in_patternIdentifier587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_patternIdentifier594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_patternDatum608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_patternDatum615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_patternDatum622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_patternDatum629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternIdentifier_in_template643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_template650 = new BitSet(new long[]{0x140F85D1142901F0L,0x0000000170C20840L});
	public static final BitSet FOLLOW_templateElement_in_template653 = new BitSet(new long[]{0x140F85D1142901F0L,0x0000000970C20840L});
	public static final BitSet FOLLOW_99_in_template657 = new BitSet(new long[]{0x140F85D1142901F0L,0x0000000070C20840L});
	public static final BitSet FOLLOW_templateElement_in_template659 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_template665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_template672 = new BitSet(new long[]{0x140F85D1142901F0L,0x0000000170C20840L});
	public static final BitSet FOLLOW_templateElement_in_template674 = new BitSet(new long[]{0x140F85D1142901F0L,0x0000000170C20840L});
	public static final BitSet FOLLOW_96_in_template677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_templateDatum_in_template684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_template_in_templateElement698 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_templateElement700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternDatum_in_templateDatum715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_command729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntacticKeyword_in_identifier751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_identifier766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionKeyword_in_syntacticKeyword788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_syntacticKeyword795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARROW_in_syntacticKeyword802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFINE_in_syntacticKeyword809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNQUOTE_in_syntacticKeyword816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_syntacticKeyword823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_expression967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_expression989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lambdaExpression_in_expression1010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_expression1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_expression1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derivedExpression_in_expression1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_expression1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroUse_in_expression1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroBlock_in_expression1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_variable1139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_variable1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quotation_in_literal1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selfEvaluating_in_literal1180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_100_in_quotation1194 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003670C20840L});
	public static final BitSet FOLLOW_datum_in_quotation1197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_quotation1204 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_QUOTE_in_quotation1206 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003670C20840L});
	public static final BitSet FOLLOW_datum_in_quotation1208 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_quotation1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_selfEvaluating1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_selfEvaluating1231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_selfEvaluating1238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_selfEvaluating1245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_lambdaExpression1259 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LAMBDA_in_lambdaExpression1262 = new BitSet(new long[]{0x0000000008000000L,0x00000000D0000000L});
	public static final BitSet FOLLOW_lambdaformals_in_lambdaExpression1265 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_body_in_lambdaExpression1267 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_lambdaExpression1269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_lambdaformals1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formals_in_lambdaformals1301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_lambdaformals1307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_conditional1328 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_IF_in_conditional1331 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_test_in_conditional1334 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_consequent_in_conditional1336 = new BitSet(new long[]{0x0007800108000100L,0x0000003150020800L});
	public static final BitSet FOLLOW_alternate_in_conditional1338 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_conditional1341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_test1357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_consequent1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_alternate1388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_assignment1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_SET_in_assignment1405 = new BitSet(new long[]{0x0000000008000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_variable_in_assignment1408 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_expression_in_assignment1410 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_assignment1412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quasiquotation_in_derivedExpression1427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_derivedExpression1434 = new BitSet(new long[]{0x00080580042100D0L});
	public static final BitSet FOLLOW_COND_in_derivedExpression1439 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_derivedExpression1444 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ELSE_in_derivedExpression1447 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1450 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_derivedExpression1452 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_condClause_in_derivedExpression1473 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_94_in_derivedExpression1477 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ELSE_in_derivedExpression1479 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_derivedExpression1484 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_CASE_in_derivedExpression1517 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_expression_in_derivedExpression1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_derivedExpression1523 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ELSE_in_derivedExpression1525 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1527 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_derivedExpression1529 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_caseClause_in_derivedExpression1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_94_in_derivedExpression1564 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ELSE_in_derivedExpression1566 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1568 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_derivedExpression1570 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_AND_in_derivedExpression1615 = new BitSet(new long[]{0x0007800108000100L,0x0000003150020800L});
	public static final BitSet FOLLOW_test_in_derivedExpression1618 = new BitSet(new long[]{0x0007800108000100L,0x0000003150020800L});
	public static final BitSet FOLLOW_OR_in_derivedExpression1632 = new BitSet(new long[]{0x0007800108000100L,0x0000003150020800L});
	public static final BitSet FOLLOW_test_in_derivedExpression1635 = new BitSet(new long[]{0x0007800108000100L,0x0000003150020800L});
	public static final BitSet FOLLOW_LET_in_derivedExpression1649 = new BitSet(new long[]{0x0000000008000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_variable_in_derivedExpression1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_derivedExpression1654 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_bindingSpec_in_derivedExpression1656 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_96_in_derivedExpression1659 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_body_in_derivedExpression1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_LETSTAR_in_derivedExpression1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_derivedExpression1676 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_bindingSpec_in_derivedExpression1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_96_in_derivedExpression1681 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_body_in_derivedExpression1683 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_LETREC_in_derivedExpression1696 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_derivedExpression1698 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_bindingSpec_in_derivedExpression1700 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_96_in_derivedExpression1703 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_body_in_derivedExpression1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_BEGIN_in_derivedExpression1718 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1721 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_DO_in_derivedExpression1734 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_derivedExpression1736 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_iterationSpec_in_derivedExpression1738 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_96_in_derivedExpression1741 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_derivedExpression1743 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_test_in_derivedExpression1745 = new BitSet(new long[]{0x0007800108000100L,0x0000003150020800L});
	public static final BitSet FOLLOW_doResult_in_derivedExpression1747 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_derivedExpression1750 = new BitSet(new long[]{0x0007800108000100L,0x0000003150020800L});
	public static final BitSet FOLLOW_command_in_derivedExpression1752 = new BitSet(new long[]{0x0007800108000100L,0x0000003150020800L});
	public static final BitSet FOLLOW_DELAY_in_derivedExpression1766 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_expression_in_derivedExpression1768 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_derivedExpression1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_condClause1802 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_test_in_condClause1804 = new BitSet(new long[]{0x0007800108000120L,0x0000003150020800L});
	public static final BitSet FOLLOW_condrealize_in_condClause1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_condClause1809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequence_in_condrealize1831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARROW_in_condrealize1837 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_recipient_in_condrealize1840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_recipient1854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_caseClause1868 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_caseClause1870 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003770C20840L});
	public static final BitSet FOLLOW_datum_in_caseClause1872 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003770C20840L});
	public static final BitSet FOLLOW_96_in_caseClause1875 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_sequence_in_caseClause1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_caseClause1879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_bindingSpec1893 = new BitSet(new long[]{0x0000000008000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_variable_in_bindingSpec1895 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_expression_in_bindingSpec1897 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_bindingSpec1899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_iterationSpec1913 = new BitSet(new long[]{0x0000000008000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_variable_in_iterationSpec1915 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_init_in_iterationSpec1917 = new BitSet(new long[]{0x0007800108000100L,0x0000003150020800L});
	public static final BitSet FOLLOW_step_in_iterationSpec1919 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_iterationSpec1922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_init1936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_step1950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequence_in_doResult1964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_procedureCall1978 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_operator_in_procedureCall1980 = new BitSet(new long[]{0x0007800108000100L,0x0000003150020800L});
	public static final BitSet FOLLOW_operand_in_procedureCall1982 = new BitSet(new long[]{0x0007800108000100L,0x0000003150020800L});
	public static final BitSet FOLLOW_96_in_procedureCall1985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_operator2010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_operand2024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_macroUse2038 = new BitSet(new long[]{0x140805D01C2900F0L,0x0000000010C00040L});
	public static final BitSet FOLLOW_keyword_in_macroUse2040 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003770C20840L});
	public static final BitSet FOLLOW_datum_in_macroUse2042 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003770C20840L});
	public static final BitSet FOLLOW_96_in_macroUse2045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_macroBlock2059 = new BitSet(new long[]{0x0000120000000000L});
	public static final BitSet FOLLOW_set_in_macroBlock2061 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_macroBlock2069 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_syntaxSpec_in_macroBlock2071 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_96_in_macroBlock2074 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_body_in_macroBlock2076 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_macroBlock2078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_syntaxSpec2092 = new BitSet(new long[]{0x140805D01C2900F0L,0x0000000010C00040L});
	public static final BitSet FOLLOW_keyword_in_syntaxSpec2094 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_transformerSpec_in_syntaxSpec2096 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_syntaxSpec2098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_body2118 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_sequence_in_body2122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_sequence2136 = new BitSet(new long[]{0x0007800108000102L,0x0000003050020800L});
	public static final BitSet FOLLOW_simpleDatum_in_datum2160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundDatum_in_datum2167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_simpleDatum2181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_simpleDatum2188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_simpleDatum2195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_simpleDatum2202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_simpleDatum2209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_compoundDatum2223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vector_in_compoundDatum2238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_list2252 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003770C20840L});
	public static final BitSet FOLLOW_datum_in_list2255 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003F70C20840L});
	public static final BitSet FOLLOW_99_in_list2259 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003670C20840L});
	public static final BitSet FOLLOW_datum_in_list2261 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_list2267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abbreviation_in_list2274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abbrevPrefix_in_abbreviation2288 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003670C20840L});
	public static final BitSet FOLLOW_datum_in_abbreviation2290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_vector2330 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003770C20840L});
	public static final BitSet FOLLOW_datum_in_vector2332 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003770C20840L});
	public static final BitSet FOLLOW_96_in_vector2335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quasiquotationD_in_quasiquotation2405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_quasiquotationD2421 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003270C20840L});
	public static final BitSet FOLLOW_qqTemplate_in_quasiquotationD2423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_quasiquotationD2431 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_QUASIQUOTE_in_quasiquotationD2433 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003270C20840L});
	public static final BitSet FOLLOW_qqTemplate_in_quasiquotationD2435 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_quasiquotationD2438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_qqTemplate2459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unquotation_in_qqTemplate2473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDatum_in_qqTemplate2497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vectorQQTemplate_in_qqTemplate2520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listQQTemplate_in_qqTemplate2544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_vectorQQTemplate2560 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003770C20840L});
	public static final BitSet FOLLOW_qqTemplateOrSplice_in_vectorQQTemplate2562 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003770C20840L});
	public static final BitSet FOLLOW_96_in_vectorQQTemplate2566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_100_in_listQQTemplate2600 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003270C20840L});
	public static final BitSet FOLLOW_qqTemplate_in_listQQTemplate2602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quasiquotationD_in_listQQTemplate2617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_listQQTemplate2644 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003770C20840L});
	public static final BitSet FOLLOW_qqTemplateOrSplice_in_listQQTemplate2647 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003F70C20840L});
	public static final BitSet FOLLOW_99_in_listQQTemplate2652 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003270C20840L});
	public static final BitSet FOLLOW_qqTemplate_in_listQQTemplate2654 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_listQQTemplate2661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_unquotation2676 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003270C20840L});
	public static final BitSet FOLLOW_qqTemplate_in_unquotation2678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_unquotation2686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_UNQUOTE_in_unquotation2688 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003270C20840L});
	public static final BitSet FOLLOW_qqTemplate_in_unquotation2690 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_unquotation2693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_splicingUnquotation_in_qqTemplateOrSplice2715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qqTemplate_in_qqTemplateOrSplice2748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_splicingUnquotation2764 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003270C20840L});
	public static final BitSet FOLLOW_qqTemplate_in_splicingUnquotation2766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_splicingUnquotation2774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_splicingUnquotation2776 = new BitSet(new long[]{0x140F85D11C2901F0L,0x0000003270C20840L});
	public static final BitSet FOLLOW_qqTemplate_in_splicingUnquotation2778 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_splicingUnquotation2781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntaxDefinition_in_synpred1_R5RS161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_synpred2_R5RS186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_synpred3_R5RS217 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BEGIN_in_synpred3_R5RS219 = new BitSet(new long[]{0x0007800108000100L,0x0000003050020800L});
	public static final BitSet FOLLOW_commandOrDefinition_in_synpred3_R5RS221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDefinition_in_synpred4_R5RS318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalDefinition_in_synpred5_R5RS330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_synpred6_R5RS954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_synpred7_R5RS975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lambdaExpression_in_synpred8_R5RS1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_synpred9_R5RS1018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_synpred10_R5RS1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derivedExpression_in_synpred11_R5RS1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_synpred12_R5RS1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroUse_in_synpred13_R5RS1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_synpred14_R5RS1284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formals_in_synpred15_R5RS1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_synpred16_R5RS2114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred17_R5RS2454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_synpred18_R5RS2467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_UNQUOTE_in_synpred18_R5RS2469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_synpred19_R5RS2611 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_QUASIQUOTE_in_synpred19_R5RS2613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_synpred20_R5RS2709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_synpred20_R5RS2711 = new BitSet(new long[]{0x0000000000000002L});
}
