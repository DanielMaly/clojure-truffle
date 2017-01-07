// $ANTLR 3.5.2 R5RS.g3 2017-01-07 18:05:03

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
		"COMPLEX_2", "COMPLEX_8", "COND", "DECIMAL_10", "DEFINE", "DEFINE_SYNTAX", 
		"DELAY", "DIGIT", "DIGIT_16", "DIGIT_2", "DIGIT_8", "DO", "ELLIPSIS", 
		"ELSE", "EXACTNESS", "EXPONENT_MARKER", "FALSE", "FORMALDEF", "IDENTIFIER", 
		"IF", "INITIAL", "LAMBDA", "LET", "LETREC", "LETREC_SYNTAX", "LETSTAR", 
		"LETTER", "LET_SYNTAX", "LIST", "LITERAL", "NUM_10", "NUM_16", "NUM_2", 
		"NUM_8", "OPERATOR", "OR", "PECULIAR_IDENTIFIER", "PREFIX_10", "PREFIX_16", 
		"PREFIX_2", "PREFIX_8", "PROCEDURECALL", "QUASIQUOTE", "QUOTATION", "QUOTE", 
		"RADIX_10", "RADIX_16", "RADIX_2", "RADIX_8", "REAL_10", "REAL_16", "REAL_2", 
		"REAL_8", "SET", "SIGN", "SPACE", "SPECIAL_INITIAL", "SPECIAL_SUBSEQUENT", 
		"STRING", "STRING_ELEMENT", "SUBSEQUENT", "SUFFIX", "SYNTAXRULE", "SYNTAX_RULES", 
		"TRUE", "UINTEGER_10", "UINTEGER_16", "UINTEGER_2", "UINTEGER_8", "UNQUOTE", 
		"UNQUOTE_SPLICING", "UREAL_10", "UREAL_16", "UREAL_2", "UREAL_8", "VARIABLE", 
		"'#('", "'('", "')'", "','", "',@'", "'.'", "'\\''", "'`'"
	};
	public static final int EOF=-1;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
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
	public static final int DECIMAL_10=17;
	public static final int DEFINE=18;
	public static final int DEFINE_SYNTAX=19;
	public static final int DELAY=20;
	public static final int DIGIT=21;
	public static final int DIGIT_16=22;
	public static final int DIGIT_2=23;
	public static final int DIGIT_8=24;
	public static final int DO=25;
	public static final int ELLIPSIS=26;
	public static final int ELSE=27;
	public static final int EXACTNESS=28;
	public static final int EXPONENT_MARKER=29;
	public static final int FALSE=30;
	public static final int FORMALDEF=31;
	public static final int IDENTIFIER=32;
	public static final int IF=33;
	public static final int INITIAL=34;
	public static final int LAMBDA=35;
	public static final int LET=36;
	public static final int LETREC=37;
	public static final int LETREC_SYNTAX=38;
	public static final int LETSTAR=39;
	public static final int LETTER=40;
	public static final int LET_SYNTAX=41;
	public static final int LIST=42;
	public static final int LITERAL=43;
	public static final int NUM_10=44;
	public static final int NUM_16=45;
	public static final int NUM_2=46;
	public static final int NUM_8=47;
	public static final int OPERATOR=48;
	public static final int OR=49;
	public static final int PECULIAR_IDENTIFIER=50;
	public static final int PREFIX_10=51;
	public static final int PREFIX_16=52;
	public static final int PREFIX_2=53;
	public static final int PREFIX_8=54;
	public static final int PROCEDURECALL=55;
	public static final int QUASIQUOTE=56;
	public static final int QUOTATION=57;
	public static final int QUOTE=58;
	public static final int RADIX_10=59;
	public static final int RADIX_16=60;
	public static final int RADIX_2=61;
	public static final int RADIX_8=62;
	public static final int REAL_10=63;
	public static final int REAL_16=64;
	public static final int REAL_2=65;
	public static final int REAL_8=66;
	public static final int SET=67;
	public static final int SIGN=68;
	public static final int SPACE=69;
	public static final int SPECIAL_INITIAL=70;
	public static final int SPECIAL_SUBSEQUENT=71;
	public static final int STRING=72;
	public static final int STRING_ELEMENT=73;
	public static final int SUBSEQUENT=74;
	public static final int SUFFIX=75;
	public static final int SYNTAXRULE=76;
	public static final int SYNTAX_RULES=77;
	public static final int TRUE=78;
	public static final int UINTEGER_10=79;
	public static final int UINTEGER_16=80;
	public static final int UINTEGER_2=81;
	public static final int UINTEGER_8=82;
	public static final int UNQUOTE=83;
	public static final int UNQUOTE_SPLICING=84;
	public static final int UREAL_10=85;
	public static final int UREAL_16=86;
	public static final int UREAL_2=87;
	public static final int UREAL_8=88;
	public static final int VARIABLE=89;

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
	// R5RS.g3:56:1: parse : ( commandOrDefinition )* EOF ;
	public final R5RSParser.parse_return parse() throws RecognitionException {
		R5RSParser.parse_return retval = new R5RSParser.parse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope commandOrDefinition1 =null;

		Object EOF2_tree=null;

		try {
			// R5RS.g3:57:3: ( ( commandOrDefinition )* EOF )
			// R5RS.g3:57:6: ( commandOrDefinition )* EOF
			{
			root_0 = (Object)adaptor.nil();


			// R5RS.g3:57:6: ( commandOrDefinition )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CHARACTER||LA1_0==ELLIPSIS||LA1_0==FALSE||(LA1_0 >= NUM_10 && LA1_0 <= NUM_8)||LA1_0==STRING||LA1_0==TRUE||LA1_0==VARIABLE||LA1_0==91||(LA1_0 >= 96 && LA1_0 <= 97)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// R5RS.g3:57:6: commandOrDefinition
					{
					pushFollow(FOLLOW_commandOrDefinition_in_parse122);
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

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse125); if (state.failed) return retval;
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
	// R5RS.g3:60:1: commandOrDefinition : ( ( syntaxDefinition )=> syntaxDefinition | ( definition )=> definition | ( '(' BEGIN commandOrDefinition )=> '(' ! BEGIN ^ ( commandOrDefinition )+ ')' !| command );
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
			// R5RS.g3:61:3: ( ( syntaxDefinition )=> syntaxDefinition | ( definition )=> definition | ( '(' BEGIN commandOrDefinition )=> '(' ! BEGIN ^ ( commandOrDefinition )+ ')' !| command )
			int alt3=4;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==91) ) {
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
			else if ( (LA3_0==CHARACTER||LA3_0==ELLIPSIS||LA3_0==FALSE||(LA3_0 >= NUM_10 && LA3_0 <= NUM_8)||LA3_0==STRING||LA3_0==TRUE||LA3_0==VARIABLE||(LA3_0 >= 96 && LA3_0 <= 97)) ) {
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
					// R5RS.g3:61:6: ( syntaxDefinition )=> syntaxDefinition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_syntaxDefinition_in_commandOrDefinition157);
					syntaxDefinition3=syntaxDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntaxDefinition3.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:62:6: ( definition )=> definition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_definition_in_commandOrDefinition188);
					definition4=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition4.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:63:6: ( '(' BEGIN commandOrDefinition )=> '(' ! BEGIN ^ ( commandOrDefinition )+ ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal5=(Token)match(input,91,FOLLOW_91_in_commandOrDefinition204); if (state.failed) return retval;
					BEGIN6=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_commandOrDefinition207); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BEGIN6_tree = new CommandDefinitionSequenceNode(BEGIN6) ;
					root_0 = (Object)adaptor.becomeRoot(BEGIN6_tree, root_0);
					}

					// R5RS.g3:63:83: ( commandOrDefinition )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==CHARACTER||LA2_0==ELLIPSIS||LA2_0==FALSE||(LA2_0 >= NUM_10 && LA2_0 <= NUM_8)||LA2_0==STRING||LA2_0==TRUE||LA2_0==VARIABLE||LA2_0==91||(LA2_0 >= 96 && LA2_0 <= 97)) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// R5RS.g3:63:83: commandOrDefinition
							{
							pushFollow(FOLLOW_commandOrDefinition_in_commandOrDefinition213);
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

					char_literal8=(Token)match(input,92,FOLLOW_92_in_commandOrDefinition216); if (state.failed) return retval;
					}
					break;
				case 4 :
					// R5RS.g3:64:40: command
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_in_commandOrDefinition258);
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
	// R5RS.g3:67:1: syntaxDefinition : '(' ! DEFINE_SYNTAX ^ keyword transformerSpec ')' !;
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
			// R5RS.g3:68:3: ( '(' ! DEFINE_SYNTAX ^ keyword transformerSpec ')' !)
			// R5RS.g3:68:6: '(' ! DEFINE_SYNTAX ^ keyword transformerSpec ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal10=(Token)match(input,91,FOLLOW_91_in_syntaxDefinition272); if (state.failed) return retval;
			DEFINE_SYNTAX11=(Token)match(input,DEFINE_SYNTAX,FOLLOW_DEFINE_SYNTAX_in_syntaxDefinition275); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEFINE_SYNTAX11_tree = (Object)adaptor.create(DEFINE_SYNTAX11);
			root_0 = (Object)adaptor.becomeRoot(DEFINE_SYNTAX11_tree, root_0);
			}

			pushFollow(FOLLOW_keyword_in_syntaxDefinition278);
			keyword12=keyword();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword12.getTree());

			pushFollow(FOLLOW_transformerSpec_in_syntaxDefinition280);
			transformerSpec13=transformerSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, transformerSpec13.getTree());

			char_literal14=(Token)match(input,92,FOLLOW_92_in_syntaxDefinition282); if (state.failed) return retval;
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
	// R5RS.g3:71:1: definition : ( ( simpleDefinition )=> simpleDefinition | ( formalDefinition )=> formalDefinition | '(' ! BEGIN ^ ( definition )* ')' !);
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
			// R5RS.g3:72:3: ( ( simpleDefinition )=> simpleDefinition | ( formalDefinition )=> formalDefinition | '(' ! BEGIN ^ ( definition )* ')' !)
			int alt5=3;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==91) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==DEFINE) ) {
					int LA5_2 = input.LA(3);
					if ( (LA5_2==VARIABLE) && (synpred4_R5RS())) {
						alt5=1;
					}
					else if ( (LA5_2==ELLIPSIS) && (synpred4_R5RS())) {
						alt5=1;
					}
					else if ( (LA5_2==91) && (synpred5_R5RS())) {
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
					// R5RS.g3:72:5: ( simpleDefinition )=> simpleDefinition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleDefinition_in_definition302);
					simpleDefinition15=simpleDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDefinition15.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:73:5: ( formalDefinition )=> formalDefinition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_formalDefinition_in_definition314);
					formalDefinition16=formalDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formalDefinition16.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:74:5: '(' ! BEGIN ^ ( definition )* ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal17=(Token)match(input,91,FOLLOW_91_in_definition320); if (state.failed) return retval;
					BEGIN18=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_definition323); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BEGIN18_tree = (Object)adaptor.create(BEGIN18);
					root_0 = (Object)adaptor.becomeRoot(BEGIN18_tree, root_0);
					}

					// R5RS.g3:74:17: ( definition )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==91) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// R5RS.g3:74:17: definition
							{
							pushFollow(FOLLOW_definition_in_definition326);
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

					char_literal20=(Token)match(input,92,FOLLOW_92_in_definition329); if (state.failed) return retval;
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
	// R5RS.g3:77:1: simpleDefinition : '(' ! DEFINE ^ variable expression ')' !;
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
			// R5RS.g3:78:3: ( '(' ! DEFINE ^ variable expression ')' !)
			// R5RS.g3:78:6: '(' ! DEFINE ^ variable expression ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal21=(Token)match(input,91,FOLLOW_91_in_simpleDefinition344); if (state.failed) return retval;
			DEFINE22=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_simpleDefinition347); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEFINE22_tree = (Object)adaptor.create(DEFINE22);
			root_0 = (Object)adaptor.becomeRoot(DEFINE22_tree, root_0);
			}

			pushFollow(FOLLOW_variable_in_simpleDefinition350);
			variable23=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable23.getTree());

			pushFollow(FOLLOW_expression_in_simpleDefinition352);
			expression24=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression24.getTree());

			char_literal25=(Token)match(input,92,FOLLOW_92_in_simpleDefinition354); if (state.failed) return retval;
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
	// R5RS.g3:81:1: formalDefinition : '(' DEFINE formalDefDecl body ')' -> ^( FORMALDEF formalDefDecl body ) ;
	public final R5RSParser.formalDefinition_return formalDefinition() throws RecognitionException {
		R5RSParser.formalDefinition_return retval = new R5RSParser.formalDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal26=null;
		Token DEFINE27=null;
		Token char_literal30=null;
		ParserRuleReturnScope formalDefDecl28 =null;
		ParserRuleReturnScope body29 =null;

		Object char_literal26_tree=null;
		Object DEFINE27_tree=null;
		Object char_literal30_tree=null;
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleTokenStream stream_DEFINE=new RewriteRuleTokenStream(adaptor,"token DEFINE");
		RewriteRuleSubtreeStream stream_formalDefDecl=new RewriteRuleSubtreeStream(adaptor,"rule formalDefDecl");
		RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");

		try {
			// R5RS.g3:82:3: ( '(' DEFINE formalDefDecl body ')' -> ^( FORMALDEF formalDefDecl body ) )
			// R5RS.g3:82:5: '(' DEFINE formalDefDecl body ')'
			{
			char_literal26=(Token)match(input,91,FOLLOW_91_in_formalDefinition368); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_91.add(char_literal26);

			DEFINE27=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_formalDefinition370); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DEFINE.add(DEFINE27);

			pushFollow(FOLLOW_formalDefDecl_in_formalDefinition372);
			formalDefDecl28=formalDefDecl();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_formalDefDecl.add(formalDefDecl28.getTree());
			pushFollow(FOLLOW_body_in_formalDefinition374);
			body29=body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_body.add(body29.getTree());
			char_literal30=(Token)match(input,92,FOLLOW_92_in_formalDefinition376); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_92.add(char_literal30);

			// AST REWRITE
			// elements: formalDefDecl, body
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 82:39: -> ^( FORMALDEF formalDefDecl body )
			{
				// R5RS.g3:82:42: ^( FORMALDEF formalDefDecl body )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMALDEF, "FORMALDEF"), root_1);
				adaptor.addChild(root_1, stream_formalDefDecl.nextTree());
				adaptor.addChild(root_1, stream_body.nextTree());
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
	// $ANTLR end "formalDefinition"


	public static class formalDefDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalDefDecl"
	// R5RS.g3:85:1: formalDefDecl : '(' ! variable ( variable )* ( '.' variable )? ')' !;
	public final R5RSParser.formalDefDecl_return formalDefDecl() throws RecognitionException {
		R5RSParser.formalDefDecl_return retval = new R5RSParser.formalDefDecl_return();
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
			// R5RS.g3:86:3: ( '(' ! variable ( variable )* ( '.' variable )? ')' !)
			// R5RS.g3:86:5: '(' ! variable ( variable )* ( '.' variable )? ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal31=(Token)match(input,91,FOLLOW_91_in_formalDefDecl399); if (state.failed) return retval;
			pushFollow(FOLLOW_variable_in_formalDefDecl402);
			variable32=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable32.getTree());

			// R5RS.g3:86:19: ( variable )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ELLIPSIS||LA6_0==VARIABLE) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// R5RS.g3:86:19: variable
					{
					pushFollow(FOLLOW_variable_in_formalDefDecl404);
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

			// R5RS.g3:86:29: ( '.' variable )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==95) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// R5RS.g3:86:30: '.' variable
					{
					char_literal34=(Token)match(input,95,FOLLOW_95_in_formalDefDecl408); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal34_tree = (Object)adaptor.create(char_literal34);
					adaptor.addChild(root_0, char_literal34_tree);
					}

					pushFollow(FOLLOW_variable_in_formalDefDecl410);
					variable35=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable35.getTree());

					}
					break;

			}

			char_literal36=(Token)match(input,92,FOLLOW_92_in_formalDefDecl414); if (state.failed) return retval;
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
	// $ANTLR end "formalDefDecl"


	public static class keyword_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "keyword"
	// R5RS.g3:89:1: keyword : identifier ;
	public final R5RSParser.keyword_return keyword() throws RecognitionException {
		R5RSParser.keyword_return retval = new R5RSParser.keyword_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope identifier37 =null;


		try {
			// R5RS.g3:90:3: ( identifier )
			// R5RS.g3:90:6: identifier
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_keyword429);
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
	// R5RS.g3:93:1: transformerSpec : '(' ! SYNTAX_RULES ^ '(' ! ( identifier )* ')' ! ( syntaxRule )* ')' !;
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
			// R5RS.g3:94:3: ( '(' ! SYNTAX_RULES ^ '(' ! ( identifier )* ')' ! ( syntaxRule )* ')' !)
			// R5RS.g3:94:6: '(' ! SYNTAX_RULES ^ '(' ! ( identifier )* ')' ! ( syntaxRule )* ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal38=(Token)match(input,91,FOLLOW_91_in_transformerSpec443); if (state.failed) return retval;
			SYNTAX_RULES39=(Token)match(input,SYNTAX_RULES,FOLLOW_SYNTAX_RULES_in_transformerSpec446); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SYNTAX_RULES39_tree = (Object)adaptor.create(SYNTAX_RULES39);
			root_0 = (Object)adaptor.becomeRoot(SYNTAX_RULES39_tree, root_0);
			}

			char_literal40=(Token)match(input,91,FOLLOW_91_in_transformerSpec449); if (state.failed) return retval;
			// R5RS.g3:94:30: ( identifier )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= AND && LA8_0 <= CASE)||LA8_0==COND||LA8_0==DEFINE||LA8_0==DELAY||(LA8_0 >= DO && LA8_0 <= ELSE)||LA8_0==IF||(LA8_0 >= LAMBDA && LA8_0 <= LETREC)||LA8_0==LETSTAR||LA8_0==OR||LA8_0==QUASIQUOTE||LA8_0==QUOTE||LA8_0==SET||(LA8_0 >= UNQUOTE && LA8_0 <= UNQUOTE_SPLICING)||LA8_0==VARIABLE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// R5RS.g3:94:30: identifier
					{
					pushFollow(FOLLOW_identifier_in_transformerSpec452);
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

			char_literal42=(Token)match(input,92,FOLLOW_92_in_transformerSpec455); if (state.failed) return retval;
			// R5RS.g3:94:47: ( syntaxRule )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==91) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// R5RS.g3:94:47: syntaxRule
					{
					pushFollow(FOLLOW_syntaxRule_in_transformerSpec458);
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

			char_literal44=(Token)match(input,92,FOLLOW_92_in_transformerSpec461); if (state.failed) return retval;
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
	// R5RS.g3:97:1: syntaxRule : '(' pattern template ')' -> ^( SYNTAXRULE pattern template ) ;
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
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleSubtreeStream stream_template=new RewriteRuleSubtreeStream(adaptor,"rule template");
		RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");

		try {
			// R5RS.g3:98:3: ( '(' pattern template ')' -> ^( SYNTAXRULE pattern template ) )
			// R5RS.g3:98:6: '(' pattern template ')'
			{
			char_literal45=(Token)match(input,91,FOLLOW_91_in_syntaxRule476); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_91.add(char_literal45);

			pushFollow(FOLLOW_pattern_in_syntaxRule478);
			pattern46=pattern();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_pattern.add(pattern46.getTree());
			pushFollow(FOLLOW_template_in_syntaxRule480);
			template47=template();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_template.add(template47.getTree());
			char_literal48=(Token)match(input,92,FOLLOW_92_in_syntaxRule482); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_92.add(char_literal48);

			// AST REWRITE
			// elements: template, pattern
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 98:31: -> ^( SYNTAXRULE pattern template )
			{
				// R5RS.g3:98:34: ^( SYNTAXRULE pattern template )
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
	// R5RS.g3:101:1: pattern : ( patternIdentifier | '(' ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )? ')' | '#(' ( ( pattern )+ ( ELLIPSIS )? )? ')' | patternDatum );
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
			// R5RS.g3:102:3: ( patternIdentifier | '(' ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )? ')' | '#(' ( ( pattern )+ ( ELLIPSIS )? )? ')' | patternDatum )
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
			case 91:
				{
				alt16=2;
				}
				break;
			case 90:
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
					// R5RS.g3:102:6: patternIdentifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_patternIdentifier_in_pattern506);
					patternIdentifier49=patternIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, patternIdentifier49.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:103:6: '(' ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal50=(Token)match(input,91,FOLLOW_91_in_pattern513); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal50_tree = (Object)adaptor.create(char_literal50);
					adaptor.addChild(root_0, char_literal50_tree);
					}

					// R5RS.g3:103:10: ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( ((LA12_0 >= AND && LA12_0 <= CHARACTER)||LA12_0==COND||LA12_0==DEFINE||LA12_0==DELAY||LA12_0==DO||LA12_0==ELSE||LA12_0==FALSE||LA12_0==IF||(LA12_0 >= LAMBDA && LA12_0 <= LETREC)||LA12_0==LETSTAR||(LA12_0 >= NUM_10 && LA12_0 <= NUM_8)||LA12_0==OR||LA12_0==QUASIQUOTE||LA12_0==QUOTE||LA12_0==SET||LA12_0==STRING||LA12_0==TRUE||(LA12_0 >= UNQUOTE && LA12_0 <= UNQUOTE_SPLICING)||(LA12_0 >= VARIABLE && LA12_0 <= 91)) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// R5RS.g3:103:11: ( pattern )+ ( '.' pattern | ELLIPSIS )?
							{
							// R5RS.g3:103:11: ( pattern )+
							int cnt10=0;
							loop10:
							while (true) {
								int alt10=2;
								int LA10_0 = input.LA(1);
								if ( ((LA10_0 >= AND && LA10_0 <= CHARACTER)||LA10_0==COND||LA10_0==DEFINE||LA10_0==DELAY||LA10_0==DO||LA10_0==ELSE||LA10_0==FALSE||LA10_0==IF||(LA10_0 >= LAMBDA && LA10_0 <= LETREC)||LA10_0==LETSTAR||(LA10_0 >= NUM_10 && LA10_0 <= NUM_8)||LA10_0==OR||LA10_0==QUASIQUOTE||LA10_0==QUOTE||LA10_0==SET||LA10_0==STRING||LA10_0==TRUE||(LA10_0 >= UNQUOTE && LA10_0 <= UNQUOTE_SPLICING)||(LA10_0 >= VARIABLE && LA10_0 <= 91)) ) {
									alt10=1;
								}

								switch (alt10) {
								case 1 :
									// R5RS.g3:103:11: pattern
									{
									pushFollow(FOLLOW_pattern_in_pattern516);
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

							// R5RS.g3:103:20: ( '.' pattern | ELLIPSIS )?
							int alt11=3;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==95) ) {
								alt11=1;
							}
							else if ( (LA11_0==ELLIPSIS) ) {
								alt11=2;
							}
							switch (alt11) {
								case 1 :
									// R5RS.g3:103:21: '.' pattern
									{
									char_literal52=(Token)match(input,95,FOLLOW_95_in_pattern520); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal52_tree = (Object)adaptor.create(char_literal52);
									adaptor.addChild(root_0, char_literal52_tree);
									}

									pushFollow(FOLLOW_pattern_in_pattern522);
									pattern53=pattern();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern53.getTree());

									}
									break;
								case 2 :
									// R5RS.g3:103:35: ELLIPSIS
									{
									ELLIPSIS54=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_pattern526); if (state.failed) return retval;
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

					char_literal55=(Token)match(input,92,FOLLOW_92_in_pattern533); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal55_tree = (Object)adaptor.create(char_literal55);
					adaptor.addChild(root_0, char_literal55_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:104:6: '#(' ( ( pattern )+ ( ELLIPSIS )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal56=(Token)match(input,90,FOLLOW_90_in_pattern540); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal56_tree = (Object)adaptor.create(string_literal56);
					adaptor.addChild(root_0, string_literal56_tree);
					}

					// R5RS.g3:104:11: ( ( pattern )+ ( ELLIPSIS )? )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( ((LA15_0 >= AND && LA15_0 <= CHARACTER)||LA15_0==COND||LA15_0==DEFINE||LA15_0==DELAY||LA15_0==DO||LA15_0==ELSE||LA15_0==FALSE||LA15_0==IF||(LA15_0 >= LAMBDA && LA15_0 <= LETREC)||LA15_0==LETSTAR||(LA15_0 >= NUM_10 && LA15_0 <= NUM_8)||LA15_0==OR||LA15_0==QUASIQUOTE||LA15_0==QUOTE||LA15_0==SET||LA15_0==STRING||LA15_0==TRUE||(LA15_0 >= UNQUOTE && LA15_0 <= UNQUOTE_SPLICING)||(LA15_0 >= VARIABLE && LA15_0 <= 91)) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// R5RS.g3:104:12: ( pattern )+ ( ELLIPSIS )?
							{
							// R5RS.g3:104:12: ( pattern )+
							int cnt13=0;
							loop13:
							while (true) {
								int alt13=2;
								int LA13_0 = input.LA(1);
								if ( ((LA13_0 >= AND && LA13_0 <= CHARACTER)||LA13_0==COND||LA13_0==DEFINE||LA13_0==DELAY||LA13_0==DO||LA13_0==ELSE||LA13_0==FALSE||LA13_0==IF||(LA13_0 >= LAMBDA && LA13_0 <= LETREC)||LA13_0==LETSTAR||(LA13_0 >= NUM_10 && LA13_0 <= NUM_8)||LA13_0==OR||LA13_0==QUASIQUOTE||LA13_0==QUOTE||LA13_0==SET||LA13_0==STRING||LA13_0==TRUE||(LA13_0 >= UNQUOTE && LA13_0 <= UNQUOTE_SPLICING)||(LA13_0 >= VARIABLE && LA13_0 <= 91)) ) {
									alt13=1;
								}

								switch (alt13) {
								case 1 :
									// R5RS.g3:104:12: pattern
									{
									pushFollow(FOLLOW_pattern_in_pattern543);
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

							// R5RS.g3:104:21: ( ELLIPSIS )?
							int alt14=2;
							int LA14_0 = input.LA(1);
							if ( (LA14_0==ELLIPSIS) ) {
								alt14=1;
							}
							switch (alt14) {
								case 1 :
									// R5RS.g3:104:21: ELLIPSIS
									{
									ELLIPSIS58=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_pattern546); if (state.failed) return retval;
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

					char_literal59=(Token)match(input,92,FOLLOW_92_in_pattern552); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal59_tree = (Object)adaptor.create(char_literal59);
					adaptor.addChild(root_0, char_literal59_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:105:6: patternDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_patternDatum_in_pattern559);
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
	// R5RS.g3:108:1: patternIdentifier : ( syntacticKeyword | VARIABLE );
	public final R5RSParser.patternIdentifier_return patternIdentifier() throws RecognitionException {
		R5RSParser.patternIdentifier_return retval = new R5RSParser.patternIdentifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE62=null;
		ParserRuleReturnScope syntacticKeyword61 =null;

		Object VARIABLE62_tree=null;

		try {
			// R5RS.g3:109:3: ( syntacticKeyword | VARIABLE )
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
					// R5RS.g3:109:6: syntacticKeyword
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_syntacticKeyword_in_patternIdentifier573);
					syntacticKeyword61=syntacticKeyword();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntacticKeyword61.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:110:6: VARIABLE
					{
					root_0 = (Object)adaptor.nil();


					VARIABLE62=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_patternIdentifier580); if (state.failed) return retval;
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
	// R5RS.g3:113:1: patternDatum : ( STRING | CHARACTER | bool | number );
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
			// R5RS.g3:114:3: ( STRING | CHARACTER | bool | number )
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
					// R5RS.g3:114:6: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING63=(Token)match(input,STRING,FOLLOW_STRING_in_patternDatum594); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING63_tree = (Object)adaptor.create(STRING63);
					adaptor.addChild(root_0, STRING63_tree);
					}

					}
					break;
				case 2 :
					// R5RS.g3:115:6: CHARACTER
					{
					root_0 = (Object)adaptor.nil();


					CHARACTER64=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_patternDatum601); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHARACTER64_tree = (Object)adaptor.create(CHARACTER64);
					adaptor.addChild(root_0, CHARACTER64_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:116:6: bool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_in_patternDatum608);
					bool65=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool65.getTree());

					}
					break;
				case 4 :
					// R5RS.g3:117:6: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_patternDatum615);
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
	// R5RS.g3:120:1: template : ( patternIdentifier | '(' ( ( templateElement )+ ( '.' templateElement )? )? ')' | '#(' ( templateElement )* ')' | templateDatum );
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
			// R5RS.g3:121:3: ( patternIdentifier | '(' ( ( templateElement )+ ( '.' templateElement )? )? ')' | '#(' ( templateElement )* ')' | templateDatum )
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
			case 91:
				{
				alt23=2;
				}
				break;
			case 90:
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
					// R5RS.g3:121:6: patternIdentifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_patternIdentifier_in_template629);
					patternIdentifier67=patternIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, patternIdentifier67.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:122:6: '(' ( ( templateElement )+ ( '.' templateElement )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal68=(Token)match(input,91,FOLLOW_91_in_template636); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal68_tree = (Object)adaptor.create(char_literal68);
					adaptor.addChild(root_0, char_literal68_tree);
					}

					// R5RS.g3:122:10: ( ( templateElement )+ ( '.' templateElement )? )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( ((LA21_0 >= AND && LA21_0 <= CHARACTER)||LA21_0==COND||LA21_0==DEFINE||LA21_0==DELAY||LA21_0==DO||LA21_0==ELSE||LA21_0==FALSE||LA21_0==IF||(LA21_0 >= LAMBDA && LA21_0 <= LETREC)||LA21_0==LETSTAR||(LA21_0 >= NUM_10 && LA21_0 <= NUM_8)||LA21_0==OR||LA21_0==QUASIQUOTE||LA21_0==QUOTE||LA21_0==SET||LA21_0==STRING||LA21_0==TRUE||(LA21_0 >= UNQUOTE && LA21_0 <= UNQUOTE_SPLICING)||(LA21_0 >= VARIABLE && LA21_0 <= 91)) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// R5RS.g3:122:11: ( templateElement )+ ( '.' templateElement )?
							{
							// R5RS.g3:122:11: ( templateElement )+
							int cnt19=0;
							loop19:
							while (true) {
								int alt19=2;
								int LA19_0 = input.LA(1);
								if ( ((LA19_0 >= AND && LA19_0 <= CHARACTER)||LA19_0==COND||LA19_0==DEFINE||LA19_0==DELAY||LA19_0==DO||LA19_0==ELSE||LA19_0==FALSE||LA19_0==IF||(LA19_0 >= LAMBDA && LA19_0 <= LETREC)||LA19_0==LETSTAR||(LA19_0 >= NUM_10 && LA19_0 <= NUM_8)||LA19_0==OR||LA19_0==QUASIQUOTE||LA19_0==QUOTE||LA19_0==SET||LA19_0==STRING||LA19_0==TRUE||(LA19_0 >= UNQUOTE && LA19_0 <= UNQUOTE_SPLICING)||(LA19_0 >= VARIABLE && LA19_0 <= 91)) ) {
									alt19=1;
								}

								switch (alt19) {
								case 1 :
									// R5RS.g3:122:11: templateElement
									{
									pushFollow(FOLLOW_templateElement_in_template639);
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

							// R5RS.g3:122:28: ( '.' templateElement )?
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==95) ) {
								alt20=1;
							}
							switch (alt20) {
								case 1 :
									// R5RS.g3:122:29: '.' templateElement
									{
									char_literal70=(Token)match(input,95,FOLLOW_95_in_template643); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal70_tree = (Object)adaptor.create(char_literal70);
									adaptor.addChild(root_0, char_literal70_tree);
									}

									pushFollow(FOLLOW_templateElement_in_template645);
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

					char_literal72=(Token)match(input,92,FOLLOW_92_in_template651); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal72_tree = (Object)adaptor.create(char_literal72);
					adaptor.addChild(root_0, char_literal72_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:123:6: '#(' ( templateElement )* ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal73=(Token)match(input,90,FOLLOW_90_in_template658); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal73_tree = (Object)adaptor.create(string_literal73);
					adaptor.addChild(root_0, string_literal73_tree);
					}

					// R5RS.g3:123:11: ( templateElement )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( ((LA22_0 >= AND && LA22_0 <= CHARACTER)||LA22_0==COND||LA22_0==DEFINE||LA22_0==DELAY||LA22_0==DO||LA22_0==ELSE||LA22_0==FALSE||LA22_0==IF||(LA22_0 >= LAMBDA && LA22_0 <= LETREC)||LA22_0==LETSTAR||(LA22_0 >= NUM_10 && LA22_0 <= NUM_8)||LA22_0==OR||LA22_0==QUASIQUOTE||LA22_0==QUOTE||LA22_0==SET||LA22_0==STRING||LA22_0==TRUE||(LA22_0 >= UNQUOTE && LA22_0 <= UNQUOTE_SPLICING)||(LA22_0 >= VARIABLE && LA22_0 <= 91)) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// R5RS.g3:123:11: templateElement
							{
							pushFollow(FOLLOW_templateElement_in_template660);
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

					char_literal75=(Token)match(input,92,FOLLOW_92_in_template663); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal75_tree = (Object)adaptor.create(char_literal75);
					adaptor.addChild(root_0, char_literal75_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:124:6: templateDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_templateDatum_in_template670);
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
	// R5RS.g3:127:1: templateElement : template ( ELLIPSIS )? ;
	public final R5RSParser.templateElement_return templateElement() throws RecognitionException {
		R5RSParser.templateElement_return retval = new R5RSParser.templateElement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELLIPSIS78=null;
		ParserRuleReturnScope template77 =null;

		Object ELLIPSIS78_tree=null;

		try {
			// R5RS.g3:128:3: ( template ( ELLIPSIS )? )
			// R5RS.g3:128:6: template ( ELLIPSIS )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_template_in_templateElement684);
			template77=template();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, template77.getTree());

			// R5RS.g3:128:15: ( ELLIPSIS )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==ELLIPSIS) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// R5RS.g3:128:15: ELLIPSIS
					{
					ELLIPSIS78=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_templateElement686); if (state.failed) return retval;
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
	// R5RS.g3:131:1: templateDatum : patternDatum ;
	public final R5RSParser.templateDatum_return templateDatum() throws RecognitionException {
		R5RSParser.templateDatum_return retval = new R5RSParser.templateDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope patternDatum79 =null;


		try {
			// R5RS.g3:132:3: ( patternDatum )
			// R5RS.g3:132:6: patternDatum
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_patternDatum_in_templateDatum701);
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
	// R5RS.g3:135:1: command : expression -> ^( COMMAND expression ) ;
	public final R5RSParser.command_return command() throws RecognitionException {
		R5RSParser.command_return retval = new R5RSParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression80 =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// R5RS.g3:136:3: ( expression -> ^( COMMAND expression ) )
			// R5RS.g3:136:6: expression
			{
			pushFollow(FOLLOW_expression_in_command715);
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
			// 136:17: -> ^( COMMAND expression )
			{
				// R5RS.g3:136:20: ^( COMMAND expression )
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
	// R5RS.g3:139:1: identifier : ( syntacticKeyword -> ^( IDENTIFIER syntacticKeyword ) | variable -> ^( IDENTIFIER variable ) );
	public final R5RSParser.identifier_return identifier() throws RecognitionException {
		R5RSParser.identifier_return retval = new R5RSParser.identifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope syntacticKeyword81 =null;
		ParserRuleReturnScope variable82 =null;

		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
		RewriteRuleSubtreeStream stream_syntacticKeyword=new RewriteRuleSubtreeStream(adaptor,"rule syntacticKeyword");

		try {
			// R5RS.g3:140:3: ( syntacticKeyword -> ^( IDENTIFIER syntacticKeyword ) | variable -> ^( IDENTIFIER variable ) )
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
					// R5RS.g3:140:6: syntacticKeyword
					{
					pushFollow(FOLLOW_syntacticKeyword_in_identifier737);
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
					// 140:23: -> ^( IDENTIFIER syntacticKeyword )
					{
						// R5RS.g3:140:26: ^( IDENTIFIER syntacticKeyword )
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
					// R5RS.g3:141:6: variable
					{
					pushFollow(FOLLOW_variable_in_identifier752);
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
					// 141:15: -> ^( IDENTIFIER variable )
					{
						// R5RS.g3:141:18: ^( IDENTIFIER variable )
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
	// R5RS.g3:144:1: syntacticKeyword : ( expressionKeyword | ELSE | ARROW | DEFINE | UNQUOTE | UNQUOTE_SPLICING );
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
			// R5RS.g3:145:3: ( expressionKeyword | ELSE | ARROW | DEFINE | UNQUOTE | UNQUOTE_SPLICING )
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
					// R5RS.g3:145:6: expressionKeyword
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expressionKeyword_in_syntacticKeyword774);
					expressionKeyword83=expressionKeyword();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionKeyword83.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:146:6: ELSE
					{
					root_0 = (Object)adaptor.nil();


					ELSE84=(Token)match(input,ELSE,FOLLOW_ELSE_in_syntacticKeyword781); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELSE84_tree = (Object)adaptor.create(ELSE84);
					adaptor.addChild(root_0, ELSE84_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:147:6: ARROW
					{
					root_0 = (Object)adaptor.nil();


					ARROW85=(Token)match(input,ARROW,FOLLOW_ARROW_in_syntacticKeyword788); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ARROW85_tree = (Object)adaptor.create(ARROW85);
					adaptor.addChild(root_0, ARROW85_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:148:6: DEFINE
					{
					root_0 = (Object)adaptor.nil();


					DEFINE86=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_syntacticKeyword795); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DEFINE86_tree = (Object)adaptor.create(DEFINE86);
					adaptor.addChild(root_0, DEFINE86_tree);
					}

					}
					break;
				case 5 :
					// R5RS.g3:149:6: UNQUOTE
					{
					root_0 = (Object)adaptor.nil();


					UNQUOTE87=(Token)match(input,UNQUOTE,FOLLOW_UNQUOTE_in_syntacticKeyword802); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE87_tree = (Object)adaptor.create(UNQUOTE87);
					adaptor.addChild(root_0, UNQUOTE87_tree);
					}

					}
					break;
				case 6 :
					// R5RS.g3:150:6: UNQUOTE_SPLICING
					{
					root_0 = (Object)adaptor.nil();


					UNQUOTE_SPLICING88=(Token)match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_syntacticKeyword809); if (state.failed) return retval;
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
	// R5RS.g3:153:1: expressionKeyword : ( QUOTE | LAMBDA | IF | SET | BEGIN | COND | AND | OR | CASE | LET | LETSTAR | LETREC | DO | DELAY | QUASIQUOTE );
	public final R5RSParser.expressionKeyword_return expressionKeyword() throws RecognitionException {
		R5RSParser.expressionKeyword_return retval = new R5RSParser.expressionKeyword_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set89=null;

		Object set89_tree=null;

		try {
			// R5RS.g3:154:3: ( QUOTE | LAMBDA | IF | SET | BEGIN | COND | AND | OR | CASE | LET | LETSTAR | LETREC | DO | DELAY | QUASIQUOTE )
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
	// R5RS.g3:171:1: expression : ( ( variable )=> variable | ( literal )=> literal -> ^( LITERAL literal ) | ( lambdaExpression )=> lambdaExpression | ( conditional )=> conditional | ( assignment )=> assignment | ( derivedExpression )=> derivedExpression | ( procedureCall )=> procedureCall | ( macroUse )=> macroUse | macroBlock );
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
			// R5RS.g3:172:3: ( ( variable )=> variable | ( literal )=> literal -> ^( LITERAL literal ) | ( lambdaExpression )=> lambdaExpression | ( conditional )=> conditional | ( assignment )=> assignment | ( derivedExpression )=> derivedExpression | ( procedureCall )=> procedureCall | ( macroUse )=> macroUse | macroBlock )
			int alt27=9;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==VARIABLE) && (synpred6_R5RS())) {
				alt27=1;
			}
			else if ( (LA27_0==ELLIPSIS) && (synpred6_R5RS())) {
				alt27=1;
			}
			else if ( (LA27_0==96) && (synpred7_R5RS())) {
				alt27=2;
			}
			else if ( (LA27_0==91) ) {
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
			else if ( (LA27_0==97) && (synpred11_R5RS())) {
				alt27=6;
			}

			switch (alt27) {
				case 1 :
					// R5RS.g3:172:6: ( variable )=> variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_expression953);
					variable90=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable90.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:173:6: ( literal )=> literal
					{
					pushFollow(FOLLOW_literal_in_expression975);
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
					// 173:36: -> ^( LITERAL literal )
					{
						// R5RS.g3:173:39: ^( LITERAL literal )
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
					// R5RS.g3:174:6: ( lambdaExpression )=> lambdaExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lambdaExpression_in_expression996);
					lambdaExpression92=lambdaExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lambdaExpression92.getTree());

					}
					break;
				case 4 :
					// R5RS.g3:175:6: ( conditional )=> conditional
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_conditional_in_expression1014);
					conditional93=conditional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional93.getTree());

					}
					break;
				case 5 :
					// R5RS.g3:176:6: ( assignment )=> assignment
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_expression1033);
					assignment94=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment94.getTree());

					}
					break;
				case 6 :
					// R5RS.g3:177:6: ( derivedExpression )=> derivedExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_derivedExpression_in_expression1045);
					derivedExpression95=derivedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, derivedExpression95.getTree());

					}
					break;
				case 7 :
					// R5RS.g3:178:6: ( procedureCall )=> procedureCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureCall_in_expression1061);
					procedureCall96=procedureCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall96.getTree());

					}
					break;
				case 8 :
					// R5RS.g3:179:6: ( macroUse )=> macroUse
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_macroUse_in_expression1082);
					macroUse97=macroUse();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, macroUse97.getTree());

					}
					break;
				case 9 :
					// R5RS.g3:180:28: macroBlock
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_macroBlock_in_expression1111);
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
	// R5RS.g3:183:1: variable : ( VARIABLE ^| ELLIPSIS ^);
	public final R5RSParser.variable_return variable() throws RecognitionException {
		R5RSParser.variable_return retval = new R5RSParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE99=null;
		Token ELLIPSIS100=null;

		Object VARIABLE99_tree=null;
		Object ELLIPSIS100_tree=null;

		try {
			// R5RS.g3:184:3: ( VARIABLE ^| ELLIPSIS ^)
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
					// R5RS.g3:184:6: VARIABLE ^
					{
					root_0 = (Object)adaptor.nil();


					VARIABLE99=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_variable1125); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE99_tree = new VariableNode(VARIABLE99) ;
					root_0 = (Object)adaptor.becomeRoot(VARIABLE99_tree, root_0);
					}

					}
					break;
				case 2 :
					// R5RS.g3:185:6: ELLIPSIS ^
					{
					root_0 = (Object)adaptor.nil();


					ELLIPSIS100=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_variable1136); if (state.failed) return retval;
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
	// R5RS.g3:188:1: literal : ( quotation -> ^( QUOTATION quotation ) | selfEvaluating );
	public final R5RSParser.literal_return literal() throws RecognitionException {
		R5RSParser.literal_return retval = new R5RSParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope quotation101 =null;
		ParserRuleReturnScope selfEvaluating102 =null;

		RewriteRuleSubtreeStream stream_quotation=new RewriteRuleSubtreeStream(adaptor,"rule quotation");

		try {
			// R5RS.g3:189:3: ( quotation -> ^( QUOTATION quotation ) | selfEvaluating )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==91||LA29_0==96) ) {
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
					// R5RS.g3:189:6: quotation
					{
					pushFollow(FOLLOW_quotation_in_literal1151);
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
					// 189:16: -> ^( QUOTATION quotation )
					{
						// R5RS.g3:189:19: ^( QUOTATION quotation )
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
					// R5RS.g3:190:6: selfEvaluating
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_selfEvaluating_in_literal1166);
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
	// R5RS.g3:193:1: quotation : ( '\\'' datum | '(' QUOTE datum ')' );
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
			// R5RS.g3:194:3: ( '\\'' datum | '(' QUOTE datum ')' )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==96) ) {
				alt30=1;
			}
			else if ( (LA30_0==91) ) {
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
					// R5RS.g3:194:6: '\\'' datum
					{
					root_0 = (Object)adaptor.nil();


					char_literal103=(Token)match(input,96,FOLLOW_96_in_quotation1180); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal103_tree = (Object)adaptor.create(char_literal103);
					adaptor.addChild(root_0, char_literal103_tree);
					}

					pushFollow(FOLLOW_datum_in_quotation1182);
					datum104=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum104.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:195:6: '(' QUOTE datum ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal105=(Token)match(input,91,FOLLOW_91_in_quotation1189); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal105_tree = (Object)adaptor.create(char_literal105);
					adaptor.addChild(root_0, char_literal105_tree);
					}

					QUOTE106=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_quotation1191); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					QUOTE106_tree = (Object)adaptor.create(QUOTE106);
					adaptor.addChild(root_0, QUOTE106_tree);
					}

					pushFollow(FOLLOW_datum_in_quotation1193);
					datum107=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum107.getTree());

					char_literal108=(Token)match(input,92,FOLLOW_92_in_quotation1195); if (state.failed) return retval;
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
	// R5RS.g3:198:1: selfEvaluating : ( bool | number | CHARACTER | STRING );
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
			// R5RS.g3:199:3: ( bool | number | CHARACTER | STRING )
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
					// R5RS.g3:199:6: bool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_in_selfEvaluating1209);
					bool109=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool109.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:200:6: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_selfEvaluating1216);
					number110=number();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number110.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:201:6: CHARACTER
					{
					root_0 = (Object)adaptor.nil();


					CHARACTER111=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_selfEvaluating1223); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHARACTER111_tree = (Object)adaptor.create(CHARACTER111);
					adaptor.addChild(root_0, CHARACTER111_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:202:6: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING112=(Token)match(input,STRING,FOLLOW_STRING_in_selfEvaluating1230); if (state.failed) return retval;
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
	// R5RS.g3:205:1: lambdaExpression : '(' LAMBDA formals body ')' ;
	public final R5RSParser.lambdaExpression_return lambdaExpression() throws RecognitionException {
		R5RSParser.lambdaExpression_return retval = new R5RSParser.lambdaExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal113=null;
		Token LAMBDA114=null;
		Token char_literal117=null;
		ParserRuleReturnScope formals115 =null;
		ParserRuleReturnScope body116 =null;

		Object char_literal113_tree=null;
		Object LAMBDA114_tree=null;
		Object char_literal117_tree=null;

		try {
			// R5RS.g3:206:3: ( '(' LAMBDA formals body ')' )
			// R5RS.g3:206:6: '(' LAMBDA formals body ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal113=(Token)match(input,91,FOLLOW_91_in_lambdaExpression1244); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal113_tree = (Object)adaptor.create(char_literal113);
			adaptor.addChild(root_0, char_literal113_tree);
			}

			LAMBDA114=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambdaExpression1246); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LAMBDA114_tree = (Object)adaptor.create(LAMBDA114);
			adaptor.addChild(root_0, LAMBDA114_tree);
			}

			pushFollow(FOLLOW_formals_in_lambdaExpression1248);
			formals115=formals();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formals115.getTree());

			pushFollow(FOLLOW_body_in_lambdaExpression1250);
			body116=body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, body116.getTree());

			char_literal117=(Token)match(input,92,FOLLOW_92_in_lambdaExpression1252); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal117_tree = (Object)adaptor.create(char_literal117);
			adaptor.addChild(root_0, char_literal117_tree);
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
	// $ANTLR end "lambdaExpression"


	public static class formals_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formals"
	// R5RS.g3:209:1: formals : ( '(' ( ( variable )+ ( '.' variable )? )? ')' | variable );
	public final R5RSParser.formals_return formals() throws RecognitionException {
		R5RSParser.formals_return retval = new R5RSParser.formals_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal118=null;
		Token char_literal120=null;
		Token char_literal122=null;
		ParserRuleReturnScope variable119 =null;
		ParserRuleReturnScope variable121 =null;
		ParserRuleReturnScope variable123 =null;

		Object char_literal118_tree=null;
		Object char_literal120_tree=null;
		Object char_literal122_tree=null;

		try {
			// R5RS.g3:210:3: ( '(' ( ( variable )+ ( '.' variable )? )? ')' | variable )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==91) ) {
				alt35=1;
			}
			else if ( (LA35_0==ELLIPSIS||LA35_0==VARIABLE) ) {
				alt35=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// R5RS.g3:210:6: '(' ( ( variable )+ ( '.' variable )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal118=(Token)match(input,91,FOLLOW_91_in_formals1266); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal118_tree = (Object)adaptor.create(char_literal118);
					adaptor.addChild(root_0, char_literal118_tree);
					}

					// R5RS.g3:210:10: ( ( variable )+ ( '.' variable )? )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==ELLIPSIS||LA34_0==VARIABLE) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// R5RS.g3:210:11: ( variable )+ ( '.' variable )?
							{
							// R5RS.g3:210:11: ( variable )+
							int cnt32=0;
							loop32:
							while (true) {
								int alt32=2;
								int LA32_0 = input.LA(1);
								if ( (LA32_0==ELLIPSIS||LA32_0==VARIABLE) ) {
									alt32=1;
								}

								switch (alt32) {
								case 1 :
									// R5RS.g3:210:11: variable
									{
									pushFollow(FOLLOW_variable_in_formals1269);
									variable119=variable();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, variable119.getTree());

									}
									break;

								default :
									if ( cnt32 >= 1 ) break loop32;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(32, input);
									throw eee;
								}
								cnt32++;
							}

							// R5RS.g3:210:21: ( '.' variable )?
							int alt33=2;
							int LA33_0 = input.LA(1);
							if ( (LA33_0==95) ) {
								alt33=1;
							}
							switch (alt33) {
								case 1 :
									// R5RS.g3:210:22: '.' variable
									{
									char_literal120=(Token)match(input,95,FOLLOW_95_in_formals1273); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal120_tree = (Object)adaptor.create(char_literal120);
									adaptor.addChild(root_0, char_literal120_tree);
									}

									pushFollow(FOLLOW_variable_in_formals1275);
									variable121=variable();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, variable121.getTree());

									}
									break;

							}

							}
							break;

					}

					char_literal122=(Token)match(input,92,FOLLOW_92_in_formals1281); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal122_tree = (Object)adaptor.create(char_literal122);
					adaptor.addChild(root_0, char_literal122_tree);
					}

					}
					break;
				case 2 :
					// R5RS.g3:211:6: variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_formals1288);
					variable123=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable123.getTree());

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
	// $ANTLR end "formals"


	public static class conditional_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditional"
	// R5RS.g3:214:1: conditional : '(' IF test consequent ( alternate )? ')' ;
	public final R5RSParser.conditional_return conditional() throws RecognitionException {
		R5RSParser.conditional_return retval = new R5RSParser.conditional_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal124=null;
		Token IF125=null;
		Token char_literal129=null;
		ParserRuleReturnScope test126 =null;
		ParserRuleReturnScope consequent127 =null;
		ParserRuleReturnScope alternate128 =null;

		Object char_literal124_tree=null;
		Object IF125_tree=null;
		Object char_literal129_tree=null;

		try {
			// R5RS.g3:215:3: ( '(' IF test consequent ( alternate )? ')' )
			// R5RS.g3:215:6: '(' IF test consequent ( alternate )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal124=(Token)match(input,91,FOLLOW_91_in_conditional1302); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal124_tree = (Object)adaptor.create(char_literal124);
			adaptor.addChild(root_0, char_literal124_tree);
			}

			IF125=(Token)match(input,IF,FOLLOW_IF_in_conditional1304); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF125_tree = (Object)adaptor.create(IF125);
			adaptor.addChild(root_0, IF125_tree);
			}

			pushFollow(FOLLOW_test_in_conditional1306);
			test126=test();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, test126.getTree());

			pushFollow(FOLLOW_consequent_in_conditional1308);
			consequent127=consequent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, consequent127.getTree());

			// R5RS.g3:215:29: ( alternate )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==CHARACTER||LA36_0==ELLIPSIS||LA36_0==FALSE||(LA36_0 >= NUM_10 && LA36_0 <= NUM_8)||LA36_0==STRING||LA36_0==TRUE||LA36_0==VARIABLE||LA36_0==91||(LA36_0 >= 96 && LA36_0 <= 97)) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// R5RS.g3:215:29: alternate
					{
					pushFollow(FOLLOW_alternate_in_conditional1310);
					alternate128=alternate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alternate128.getTree());

					}
					break;

			}

			char_literal129=(Token)match(input,92,FOLLOW_92_in_conditional1313); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal129_tree = (Object)adaptor.create(char_literal129);
			adaptor.addChild(root_0, char_literal129_tree);
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
	// $ANTLR end "conditional"


	public static class test_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "test"
	// R5RS.g3:218:1: test : expression ;
	public final R5RSParser.test_return test() throws RecognitionException {
		R5RSParser.test_return retval = new R5RSParser.test_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression130 =null;


		try {
			// R5RS.g3:219:3: ( expression )
			// R5RS.g3:219:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_test1328);
			expression130=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression130.getTree());

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
	// R5RS.g3:222:1: consequent : expression ;
	public final R5RSParser.consequent_return consequent() throws RecognitionException {
		R5RSParser.consequent_return retval = new R5RSParser.consequent_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression131 =null;


		try {
			// R5RS.g3:223:3: ( expression )
			// R5RS.g3:223:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_consequent1344);
			expression131=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression131.getTree());

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
	// R5RS.g3:226:1: alternate : expression ;
	public final R5RSParser.alternate_return alternate() throws RecognitionException {
		R5RSParser.alternate_return retval = new R5RSParser.alternate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression132 =null;


		try {
			// R5RS.g3:227:3: ( expression )
			// R5RS.g3:227:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_alternate1359);
			expression132=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression132.getTree());

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
	// R5RS.g3:230:1: assignment : '(' SET variable expression ')' ;
	public final R5RSParser.assignment_return assignment() throws RecognitionException {
		R5RSParser.assignment_return retval = new R5RSParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal133=null;
		Token SET134=null;
		Token char_literal137=null;
		ParserRuleReturnScope variable135 =null;
		ParserRuleReturnScope expression136 =null;

		Object char_literal133_tree=null;
		Object SET134_tree=null;
		Object char_literal137_tree=null;

		try {
			// R5RS.g3:231:3: ( '(' SET variable expression ')' )
			// R5RS.g3:231:6: '(' SET variable expression ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal133=(Token)match(input,91,FOLLOW_91_in_assignment1373); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal133_tree = (Object)adaptor.create(char_literal133);
			adaptor.addChild(root_0, char_literal133_tree);
			}

			SET134=(Token)match(input,SET,FOLLOW_SET_in_assignment1375); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SET134_tree = (Object)adaptor.create(SET134);
			adaptor.addChild(root_0, SET134_tree);
			}

			pushFollow(FOLLOW_variable_in_assignment1377);
			variable135=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable135.getTree());

			pushFollow(FOLLOW_expression_in_assignment1379);
			expression136=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression136.getTree());

			char_literal137=(Token)match(input,92,FOLLOW_92_in_assignment1381); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal137_tree = (Object)adaptor.create(char_literal137);
			adaptor.addChild(root_0, char_literal137_tree);
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
	// $ANTLR end "assignment"


	public static class derivedExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "derivedExpression"
	// R5RS.g3:234:1: derivedExpression : ( quasiquotation | '(' ( COND ( '(' ELSE sequence ')' | ( condClause )+ ( '(' ELSE sequence ')' )? ) | CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? ) | AND ( test )* | OR ( test )* | LET ( variable )? '(' ( bindingSpec )* ')' body | LETSTAR '(' ( bindingSpec )* ')' body | LETREC '(' ( bindingSpec )* ')' body | BEGIN sequence | DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )* | DELAY expression ) ')' );
	public final R5RSParser.derivedExpression_return derivedExpression() throws RecognitionException {
		R5RSParser.derivedExpression_return retval = new R5RSParser.derivedExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal139=null;
		Token COND140=null;
		Token char_literal141=null;
		Token ELSE142=null;
		Token char_literal144=null;
		Token char_literal146=null;
		Token ELSE147=null;
		Token char_literal149=null;
		Token CASE150=null;
		Token char_literal152=null;
		Token ELSE153=null;
		Token char_literal155=null;
		Token char_literal157=null;
		Token ELSE158=null;
		Token char_literal160=null;
		Token AND161=null;
		Token OR163=null;
		Token LET165=null;
		Token char_literal167=null;
		Token char_literal169=null;
		Token LETSTAR171=null;
		Token char_literal172=null;
		Token char_literal174=null;
		Token LETREC176=null;
		Token char_literal177=null;
		Token char_literal179=null;
		Token BEGIN181=null;
		Token DO183=null;
		Token char_literal184=null;
		Token char_literal186=null;
		Token char_literal187=null;
		Token char_literal190=null;
		Token DELAY192=null;
		Token char_literal194=null;
		ParserRuleReturnScope quasiquotation138 =null;
		ParserRuleReturnScope sequence143 =null;
		ParserRuleReturnScope condClause145 =null;
		ParserRuleReturnScope sequence148 =null;
		ParserRuleReturnScope expression151 =null;
		ParserRuleReturnScope sequence154 =null;
		ParserRuleReturnScope caseClause156 =null;
		ParserRuleReturnScope sequence159 =null;
		ParserRuleReturnScope test162 =null;
		ParserRuleReturnScope test164 =null;
		ParserRuleReturnScope variable166 =null;
		ParserRuleReturnScope bindingSpec168 =null;
		ParserRuleReturnScope body170 =null;
		ParserRuleReturnScope bindingSpec173 =null;
		ParserRuleReturnScope body175 =null;
		ParserRuleReturnScope bindingSpec178 =null;
		ParserRuleReturnScope body180 =null;
		ParserRuleReturnScope sequence182 =null;
		ParserRuleReturnScope iterationSpec185 =null;
		ParserRuleReturnScope test188 =null;
		ParserRuleReturnScope doResult189 =null;
		ParserRuleReturnScope command191 =null;
		ParserRuleReturnScope expression193 =null;

		Object char_literal139_tree=null;
		Object COND140_tree=null;
		Object char_literal141_tree=null;
		Object ELSE142_tree=null;
		Object char_literal144_tree=null;
		Object char_literal146_tree=null;
		Object ELSE147_tree=null;
		Object char_literal149_tree=null;
		Object CASE150_tree=null;
		Object char_literal152_tree=null;
		Object ELSE153_tree=null;
		Object char_literal155_tree=null;
		Object char_literal157_tree=null;
		Object ELSE158_tree=null;
		Object char_literal160_tree=null;
		Object AND161_tree=null;
		Object OR163_tree=null;
		Object LET165_tree=null;
		Object char_literal167_tree=null;
		Object char_literal169_tree=null;
		Object LETSTAR171_tree=null;
		Object char_literal172_tree=null;
		Object char_literal174_tree=null;
		Object LETREC176_tree=null;
		Object char_literal177_tree=null;
		Object char_literal179_tree=null;
		Object BEGIN181_tree=null;
		Object DO183_tree=null;
		Object char_literal184_tree=null;
		Object char_literal186_tree=null;
		Object char_literal187_tree=null;
		Object char_literal190_tree=null;
		Object DELAY192_tree=null;
		Object char_literal194_tree=null;

		try {
			// R5RS.g3:235:3: ( quasiquotation | '(' ( COND ( '(' ELSE sequence ')' | ( condClause )+ ( '(' ELSE sequence ')' )? ) | CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? ) | AND ( test )* | OR ( test )* | LET ( variable )? '(' ( bindingSpec )* ')' body | LETSTAR '(' ( bindingSpec )* ')' body | LETREC '(' ( bindingSpec )* ')' body | BEGIN sequence | DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )* | DELAY expression ) ')' )
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==97) ) {
				alt53=1;
			}
			else if ( (LA53_0==91) ) {
				int LA53_2 = input.LA(2);
				if ( (LA53_2==QUASIQUOTE) ) {
					alt53=1;
				}
				else if ( (LA53_2==AND||(LA53_2 >= BEGIN && LA53_2 <= CASE)||LA53_2==COND||LA53_2==DELAY||LA53_2==DO||(LA53_2 >= LET && LA53_2 <= LETREC)||LA53_2==LETSTAR||LA53_2==OR) ) {
					alt53=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}

			switch (alt53) {
				case 1 :
					// R5RS.g3:235:6: quasiquotation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_quasiquotation_in_derivedExpression1395);
					quasiquotation138=quasiquotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quasiquotation138.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:236:6: '(' ( COND ( '(' ELSE sequence ')' | ( condClause )+ ( '(' ELSE sequence ')' )? ) | CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? ) | AND ( test )* | OR ( test )* | LET ( variable )? '(' ( bindingSpec )* ')' body | LETSTAR '(' ( bindingSpec )* ')' body | LETREC '(' ( bindingSpec )* ')' body | BEGIN sequence | DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )* | DELAY expression ) ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal139=(Token)match(input,91,FOLLOW_91_in_derivedExpression1402); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal139_tree = (Object)adaptor.create(char_literal139);
					adaptor.addChild(root_0, char_literal139_tree);
					}

					// R5RS.g3:236:10: ( COND ( '(' ELSE sequence ')' | ( condClause )+ ( '(' ELSE sequence ')' )? ) | CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? ) | AND ( test )* | OR ( test )* | LET ( variable )? '(' ( bindingSpec )* ')' body | LETSTAR '(' ( bindingSpec )* ')' body | LETREC '(' ( bindingSpec )* ')' body | BEGIN sequence | DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )* | DELAY expression )
					int alt52=10;
					switch ( input.LA(1) ) {
					case COND:
						{
						alt52=1;
						}
						break;
					case CASE:
						{
						alt52=2;
						}
						break;
					case AND:
						{
						alt52=3;
						}
						break;
					case OR:
						{
						alt52=4;
						}
						break;
					case LET:
						{
						alt52=5;
						}
						break;
					case LETSTAR:
						{
						alt52=6;
						}
						break;
					case LETREC:
						{
						alt52=7;
						}
						break;
					case BEGIN:
						{
						alt52=8;
						}
						break;
					case DO:
						{
						alt52=9;
						}
						break;
					case DELAY:
						{
						alt52=10;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 52, 0, input);
						throw nvae;
					}
					switch (alt52) {
						case 1 :
							// R5RS.g3:236:12: COND ( '(' ELSE sequence ')' | ( condClause )+ ( '(' ELSE sequence ')' )? )
							{
							COND140=(Token)match(input,COND,FOLLOW_COND_in_derivedExpression1406); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COND140_tree = (Object)adaptor.create(COND140);
							adaptor.addChild(root_0, COND140_tree);
							}

							// R5RS.g3:236:17: ( '(' ELSE sequence ')' | ( condClause )+ ( '(' ELSE sequence ')' )? )
							int alt39=2;
							int LA39_0 = input.LA(1);
							if ( (LA39_0==91) ) {
								int LA39_1 = input.LA(2);
								if ( (LA39_1==ELSE) ) {
									alt39=1;
								}
								else if ( (LA39_1==CHARACTER||LA39_1==ELLIPSIS||LA39_1==FALSE||(LA39_1 >= NUM_10 && LA39_1 <= NUM_8)||LA39_1==STRING||LA39_1==TRUE||LA39_1==VARIABLE||LA39_1==91||(LA39_1 >= 96 && LA39_1 <= 97)) ) {
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
									// R5RS.g3:236:19: '(' ELSE sequence ')'
									{
									char_literal141=(Token)match(input,91,FOLLOW_91_in_derivedExpression1410); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal141_tree = (Object)adaptor.create(char_literal141);
									adaptor.addChild(root_0, char_literal141_tree);
									}

									ELSE142=(Token)match(input,ELSE,FOLLOW_ELSE_in_derivedExpression1412); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ELSE142_tree = (Object)adaptor.create(ELSE142);
									adaptor.addChild(root_0, ELSE142_tree);
									}

									pushFollow(FOLLOW_sequence_in_derivedExpression1414);
									sequence143=sequence();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence143.getTree());

									char_literal144=(Token)match(input,92,FOLLOW_92_in_derivedExpression1416); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal144_tree = (Object)adaptor.create(char_literal144);
									adaptor.addChild(root_0, char_literal144_tree);
									}

									}
									break;
								case 2 :
									// R5RS.g3:237:19: ( condClause )+ ( '(' ELSE sequence ')' )?
									{
									// R5RS.g3:237:19: ( condClause )+
									int cnt37=0;
									loop37:
									while (true) {
										int alt37=2;
										int LA37_0 = input.LA(1);
										if ( (LA37_0==91) ) {
											int LA37_1 = input.LA(2);
											if ( (LA37_1==CHARACTER||LA37_1==ELLIPSIS||LA37_1==FALSE||(LA37_1 >= NUM_10 && LA37_1 <= NUM_8)||LA37_1==STRING||LA37_1==TRUE||LA37_1==VARIABLE||LA37_1==91||(LA37_1 >= 96 && LA37_1 <= 97)) ) {
												alt37=1;
											}

										}

										switch (alt37) {
										case 1 :
											// R5RS.g3:237:19: condClause
											{
											pushFollow(FOLLOW_condClause_in_derivedExpression1436);
											condClause145=condClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, condClause145.getTree());

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

									// R5RS.g3:237:31: ( '(' ELSE sequence ')' )?
									int alt38=2;
									int LA38_0 = input.LA(1);
									if ( (LA38_0==91) ) {
										alt38=1;
									}
									switch (alt38) {
										case 1 :
											// R5RS.g3:237:32: '(' ELSE sequence ')'
											{
											char_literal146=(Token)match(input,91,FOLLOW_91_in_derivedExpression1440); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											char_literal146_tree = (Object)adaptor.create(char_literal146);
											adaptor.addChild(root_0, char_literal146_tree);
											}

											ELSE147=(Token)match(input,ELSE,FOLLOW_ELSE_in_derivedExpression1442); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											ELSE147_tree = (Object)adaptor.create(ELSE147);
											adaptor.addChild(root_0, ELSE147_tree);
											}

											pushFollow(FOLLOW_sequence_in_derivedExpression1444);
											sequence148=sequence();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence148.getTree());

											char_literal149=(Token)match(input,92,FOLLOW_92_in_derivedExpression1446); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											char_literal149_tree = (Object)adaptor.create(char_literal149);
											adaptor.addChild(root_0, char_literal149_tree);
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
							// R5RS.g3:239:12: CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? )
							{
							CASE150=(Token)match(input,CASE,FOLLOW_CASE_in_derivedExpression1480); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							CASE150_tree = (Object)adaptor.create(CASE150);
							adaptor.addChild(root_0, CASE150_tree);
							}

							pushFollow(FOLLOW_expression_in_derivedExpression1482);
							expression151=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression151.getTree());

							// R5RS.g3:239:28: ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? )
							int alt42=2;
							int LA42_0 = input.LA(1);
							if ( (LA42_0==91) ) {
								int LA42_1 = input.LA(2);
								if ( (LA42_1==ELSE) ) {
									alt42=1;
								}
								else if ( (LA42_1==91) ) {
									alt42=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 42, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 42, 0, input);
								throw nvae;
							}

							switch (alt42) {
								case 1 :
									// R5RS.g3:239:30: '(' ELSE sequence ')'
									{
									char_literal152=(Token)match(input,91,FOLLOW_91_in_derivedExpression1486); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal152_tree = (Object)adaptor.create(char_literal152);
									adaptor.addChild(root_0, char_literal152_tree);
									}

									ELSE153=(Token)match(input,ELSE,FOLLOW_ELSE_in_derivedExpression1488); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ELSE153_tree = (Object)adaptor.create(ELSE153);
									adaptor.addChild(root_0, ELSE153_tree);
									}

									pushFollow(FOLLOW_sequence_in_derivedExpression1490);
									sequence154=sequence();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence154.getTree());

									char_literal155=(Token)match(input,92,FOLLOW_92_in_derivedExpression1492); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal155_tree = (Object)adaptor.create(char_literal155);
									adaptor.addChild(root_0, char_literal155_tree);
									}

									}
									break;
								case 2 :
									// R5RS.g3:240:30: ( caseClause )+ ( '(' ELSE sequence ')' )?
									{
									// R5RS.g3:240:30: ( caseClause )+
									int cnt40=0;
									loop40:
									while (true) {
										int alt40=2;
										int LA40_0 = input.LA(1);
										if ( (LA40_0==91) ) {
											int LA40_1 = input.LA(2);
											if ( (LA40_1==91) ) {
												alt40=1;
											}

										}

										switch (alt40) {
										case 1 :
											// R5RS.g3:240:30: caseClause
											{
											pushFollow(FOLLOW_caseClause_in_derivedExpression1523);
											caseClause156=caseClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, caseClause156.getTree());

											}
											break;

										default :
											if ( cnt40 >= 1 ) break loop40;
											if (state.backtracking>0) {state.failed=true; return retval;}
											EarlyExitException eee = new EarlyExitException(40, input);
											throw eee;
										}
										cnt40++;
									}

									// R5RS.g3:240:42: ( '(' ELSE sequence ')' )?
									int alt41=2;
									int LA41_0 = input.LA(1);
									if ( (LA41_0==91) ) {
										alt41=1;
									}
									switch (alt41) {
										case 1 :
											// R5RS.g3:240:43: '(' ELSE sequence ')'
											{
											char_literal157=(Token)match(input,91,FOLLOW_91_in_derivedExpression1527); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											char_literal157_tree = (Object)adaptor.create(char_literal157);
											adaptor.addChild(root_0, char_literal157_tree);
											}

											ELSE158=(Token)match(input,ELSE,FOLLOW_ELSE_in_derivedExpression1529); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											ELSE158_tree = (Object)adaptor.create(ELSE158);
											adaptor.addChild(root_0, ELSE158_tree);
											}

											pushFollow(FOLLOW_sequence_in_derivedExpression1531);
											sequence159=sequence();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence159.getTree());

											char_literal160=(Token)match(input,92,FOLLOW_92_in_derivedExpression1533); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											char_literal160_tree = (Object)adaptor.create(char_literal160);
											adaptor.addChild(root_0, char_literal160_tree);
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
							// R5RS.g3:242:12: AND ( test )*
							{
							AND161=(Token)match(input,AND,FOLLOW_AND_in_derivedExpression1578); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							AND161_tree = (Object)adaptor.create(AND161);
							adaptor.addChild(root_0, AND161_tree);
							}

							// R5RS.g3:242:16: ( test )*
							loop43:
							while (true) {
								int alt43=2;
								int LA43_0 = input.LA(1);
								if ( (LA43_0==CHARACTER||LA43_0==ELLIPSIS||LA43_0==FALSE||(LA43_0 >= NUM_10 && LA43_0 <= NUM_8)||LA43_0==STRING||LA43_0==TRUE||LA43_0==VARIABLE||LA43_0==91||(LA43_0 >= 96 && LA43_0 <= 97)) ) {
									alt43=1;
								}

								switch (alt43) {
								case 1 :
									// R5RS.g3:242:16: test
									{
									pushFollow(FOLLOW_test_in_derivedExpression1580);
									test162=test();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, test162.getTree());

									}
									break;

								default :
									break loop43;
								}
							}

							}
							break;
						case 4 :
							// R5RS.g3:243:12: OR ( test )*
							{
							OR163=(Token)match(input,OR,FOLLOW_OR_in_derivedExpression1594); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							OR163_tree = (Object)adaptor.create(OR163);
							adaptor.addChild(root_0, OR163_tree);
							}

							// R5RS.g3:243:15: ( test )*
							loop44:
							while (true) {
								int alt44=2;
								int LA44_0 = input.LA(1);
								if ( (LA44_0==CHARACTER||LA44_0==ELLIPSIS||LA44_0==FALSE||(LA44_0 >= NUM_10 && LA44_0 <= NUM_8)||LA44_0==STRING||LA44_0==TRUE||LA44_0==VARIABLE||LA44_0==91||(LA44_0 >= 96 && LA44_0 <= 97)) ) {
									alt44=1;
								}

								switch (alt44) {
								case 1 :
									// R5RS.g3:243:15: test
									{
									pushFollow(FOLLOW_test_in_derivedExpression1596);
									test164=test();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, test164.getTree());

									}
									break;

								default :
									break loop44;
								}
							}

							}
							break;
						case 5 :
							// R5RS.g3:244:12: LET ( variable )? '(' ( bindingSpec )* ')' body
							{
							LET165=(Token)match(input,LET,FOLLOW_LET_in_derivedExpression1610); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LET165_tree = (Object)adaptor.create(LET165);
							adaptor.addChild(root_0, LET165_tree);
							}

							// R5RS.g3:244:16: ( variable )?
							int alt45=2;
							int LA45_0 = input.LA(1);
							if ( (LA45_0==ELLIPSIS||LA45_0==VARIABLE) ) {
								alt45=1;
							}
							switch (alt45) {
								case 1 :
									// R5RS.g3:244:16: variable
									{
									pushFollow(FOLLOW_variable_in_derivedExpression1612);
									variable166=variable();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, variable166.getTree());

									}
									break;

							}

							char_literal167=(Token)match(input,91,FOLLOW_91_in_derivedExpression1615); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal167_tree = (Object)adaptor.create(char_literal167);
							adaptor.addChild(root_0, char_literal167_tree);
							}

							// R5RS.g3:244:30: ( bindingSpec )*
							loop46:
							while (true) {
								int alt46=2;
								int LA46_0 = input.LA(1);
								if ( (LA46_0==91) ) {
									alt46=1;
								}

								switch (alt46) {
								case 1 :
									// R5RS.g3:244:30: bindingSpec
									{
									pushFollow(FOLLOW_bindingSpec_in_derivedExpression1617);
									bindingSpec168=bindingSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, bindingSpec168.getTree());

									}
									break;

								default :
									break loop46;
								}
							}

							char_literal169=(Token)match(input,92,FOLLOW_92_in_derivedExpression1620); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal169_tree = (Object)adaptor.create(char_literal169);
							adaptor.addChild(root_0, char_literal169_tree);
							}

							pushFollow(FOLLOW_body_in_derivedExpression1622);
							body170=body();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, body170.getTree());

							}
							break;
						case 6 :
							// R5RS.g3:245:12: LETSTAR '(' ( bindingSpec )* ')' body
							{
							LETSTAR171=(Token)match(input,LETSTAR,FOLLOW_LETSTAR_in_derivedExpression1635); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LETSTAR171_tree = (Object)adaptor.create(LETSTAR171);
							adaptor.addChild(root_0, LETSTAR171_tree);
							}

							char_literal172=(Token)match(input,91,FOLLOW_91_in_derivedExpression1637); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal172_tree = (Object)adaptor.create(char_literal172);
							adaptor.addChild(root_0, char_literal172_tree);
							}

							// R5RS.g3:245:24: ( bindingSpec )*
							loop47:
							while (true) {
								int alt47=2;
								int LA47_0 = input.LA(1);
								if ( (LA47_0==91) ) {
									alt47=1;
								}

								switch (alt47) {
								case 1 :
									// R5RS.g3:245:24: bindingSpec
									{
									pushFollow(FOLLOW_bindingSpec_in_derivedExpression1639);
									bindingSpec173=bindingSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, bindingSpec173.getTree());

									}
									break;

								default :
									break loop47;
								}
							}

							char_literal174=(Token)match(input,92,FOLLOW_92_in_derivedExpression1642); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal174_tree = (Object)adaptor.create(char_literal174);
							adaptor.addChild(root_0, char_literal174_tree);
							}

							pushFollow(FOLLOW_body_in_derivedExpression1644);
							body175=body();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, body175.getTree());

							}
							break;
						case 7 :
							// R5RS.g3:246:12: LETREC '(' ( bindingSpec )* ')' body
							{
							LETREC176=(Token)match(input,LETREC,FOLLOW_LETREC_in_derivedExpression1657); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LETREC176_tree = (Object)adaptor.create(LETREC176);
							adaptor.addChild(root_0, LETREC176_tree);
							}

							char_literal177=(Token)match(input,91,FOLLOW_91_in_derivedExpression1659); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal177_tree = (Object)adaptor.create(char_literal177);
							adaptor.addChild(root_0, char_literal177_tree);
							}

							// R5RS.g3:246:23: ( bindingSpec )*
							loop48:
							while (true) {
								int alt48=2;
								int LA48_0 = input.LA(1);
								if ( (LA48_0==91) ) {
									alt48=1;
								}

								switch (alt48) {
								case 1 :
									// R5RS.g3:246:23: bindingSpec
									{
									pushFollow(FOLLOW_bindingSpec_in_derivedExpression1661);
									bindingSpec178=bindingSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, bindingSpec178.getTree());

									}
									break;

								default :
									break loop48;
								}
							}

							char_literal179=(Token)match(input,92,FOLLOW_92_in_derivedExpression1664); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal179_tree = (Object)adaptor.create(char_literal179);
							adaptor.addChild(root_0, char_literal179_tree);
							}

							pushFollow(FOLLOW_body_in_derivedExpression1666);
							body180=body();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, body180.getTree());

							}
							break;
						case 8 :
							// R5RS.g3:247:12: BEGIN sequence
							{
							BEGIN181=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_derivedExpression1679); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							BEGIN181_tree = (Object)adaptor.create(BEGIN181);
							adaptor.addChild(root_0, BEGIN181_tree);
							}

							pushFollow(FOLLOW_sequence_in_derivedExpression1681);
							sequence182=sequence();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence182.getTree());

							}
							break;
						case 9 :
							// R5RS.g3:248:12: DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )*
							{
							DO183=(Token)match(input,DO,FOLLOW_DO_in_derivedExpression1694); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DO183_tree = (Object)adaptor.create(DO183);
							adaptor.addChild(root_0, DO183_tree);
							}

							char_literal184=(Token)match(input,91,FOLLOW_91_in_derivedExpression1696); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal184_tree = (Object)adaptor.create(char_literal184);
							adaptor.addChild(root_0, char_literal184_tree);
							}

							// R5RS.g3:248:19: ( iterationSpec )*
							loop49:
							while (true) {
								int alt49=2;
								int LA49_0 = input.LA(1);
								if ( (LA49_0==91) ) {
									alt49=1;
								}

								switch (alt49) {
								case 1 :
									// R5RS.g3:248:19: iterationSpec
									{
									pushFollow(FOLLOW_iterationSpec_in_derivedExpression1698);
									iterationSpec185=iterationSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, iterationSpec185.getTree());

									}
									break;

								default :
									break loop49;
								}
							}

							char_literal186=(Token)match(input,92,FOLLOW_92_in_derivedExpression1701); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal186_tree = (Object)adaptor.create(char_literal186);
							adaptor.addChild(root_0, char_literal186_tree);
							}

							char_literal187=(Token)match(input,91,FOLLOW_91_in_derivedExpression1703); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal187_tree = (Object)adaptor.create(char_literal187);
							adaptor.addChild(root_0, char_literal187_tree);
							}

							pushFollow(FOLLOW_test_in_derivedExpression1705);
							test188=test();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, test188.getTree());

							// R5RS.g3:248:47: ( doResult )?
							int alt50=2;
							int LA50_0 = input.LA(1);
							if ( (LA50_0==CHARACTER||LA50_0==ELLIPSIS||LA50_0==FALSE||(LA50_0 >= NUM_10 && LA50_0 <= NUM_8)||LA50_0==STRING||LA50_0==TRUE||LA50_0==VARIABLE||LA50_0==91||(LA50_0 >= 96 && LA50_0 <= 97)) ) {
								alt50=1;
							}
							switch (alt50) {
								case 1 :
									// R5RS.g3:248:47: doResult
									{
									pushFollow(FOLLOW_doResult_in_derivedExpression1707);
									doResult189=doResult();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, doResult189.getTree());

									}
									break;

							}

							char_literal190=(Token)match(input,92,FOLLOW_92_in_derivedExpression1710); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal190_tree = (Object)adaptor.create(char_literal190);
							adaptor.addChild(root_0, char_literal190_tree);
							}

							// R5RS.g3:248:61: ( command )*
							loop51:
							while (true) {
								int alt51=2;
								int LA51_0 = input.LA(1);
								if ( (LA51_0==CHARACTER||LA51_0==ELLIPSIS||LA51_0==FALSE||(LA51_0 >= NUM_10 && LA51_0 <= NUM_8)||LA51_0==STRING||LA51_0==TRUE||LA51_0==VARIABLE||LA51_0==91||(LA51_0 >= 96 && LA51_0 <= 97)) ) {
									alt51=1;
								}

								switch (alt51) {
								case 1 :
									// R5RS.g3:248:61: command
									{
									pushFollow(FOLLOW_command_in_derivedExpression1712);
									command191=command();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, command191.getTree());

									}
									break;

								default :
									break loop51;
								}
							}

							}
							break;
						case 10 :
							// R5RS.g3:249:12: DELAY expression
							{
							DELAY192=(Token)match(input,DELAY,FOLLOW_DELAY_in_derivedExpression1726); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DELAY192_tree = (Object)adaptor.create(DELAY192);
							adaptor.addChild(root_0, DELAY192_tree);
							}

							pushFollow(FOLLOW_expression_in_derivedExpression1728);
							expression193=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression193.getTree());

							}
							break;

					}

					char_literal194=(Token)match(input,92,FOLLOW_92_in_derivedExpression1747); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal194_tree = (Object)adaptor.create(char_literal194);
					adaptor.addChild(root_0, char_literal194_tree);
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
	// $ANTLR end "derivedExpression"


	public static class condClause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condClause"
	// R5RS.g3:254:1: condClause : '(' test ( sequence | ARROW recipient )? ')' ;
	public final R5RSParser.condClause_return condClause() throws RecognitionException {
		R5RSParser.condClause_return retval = new R5RSParser.condClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal195=null;
		Token ARROW198=null;
		Token char_literal200=null;
		ParserRuleReturnScope test196 =null;
		ParserRuleReturnScope sequence197 =null;
		ParserRuleReturnScope recipient199 =null;

		Object char_literal195_tree=null;
		Object ARROW198_tree=null;
		Object char_literal200_tree=null;

		try {
			// R5RS.g3:255:3: ( '(' test ( sequence | ARROW recipient )? ')' )
			// R5RS.g3:255:6: '(' test ( sequence | ARROW recipient )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal195=(Token)match(input,91,FOLLOW_91_in_condClause1761); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal195_tree = (Object)adaptor.create(char_literal195);
			adaptor.addChild(root_0, char_literal195_tree);
			}

			pushFollow(FOLLOW_test_in_condClause1763);
			test196=test();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, test196.getTree());

			// R5RS.g3:255:15: ( sequence | ARROW recipient )?
			int alt54=3;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==CHARACTER||LA54_0==ELLIPSIS||LA54_0==FALSE||(LA54_0 >= NUM_10 && LA54_0 <= NUM_8)||LA54_0==STRING||LA54_0==TRUE||LA54_0==VARIABLE||LA54_0==91||(LA54_0 >= 96 && LA54_0 <= 97)) ) {
				alt54=1;
			}
			else if ( (LA54_0==ARROW) ) {
				alt54=2;
			}
			switch (alt54) {
				case 1 :
					// R5RS.g3:255:16: sequence
					{
					pushFollow(FOLLOW_sequence_in_condClause1766);
					sequence197=sequence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence197.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:255:27: ARROW recipient
					{
					ARROW198=(Token)match(input,ARROW,FOLLOW_ARROW_in_condClause1770); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ARROW198_tree = (Object)adaptor.create(ARROW198);
					adaptor.addChild(root_0, ARROW198_tree);
					}

					pushFollow(FOLLOW_recipient_in_condClause1772);
					recipient199=recipient();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recipient199.getTree());

					}
					break;

			}

			char_literal200=(Token)match(input,92,FOLLOW_92_in_condClause1776); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal200_tree = (Object)adaptor.create(char_literal200);
			adaptor.addChild(root_0, char_literal200_tree);
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


	public static class recipient_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "recipient"
	// R5RS.g3:258:1: recipient : expression ;
	public final R5RSParser.recipient_return recipient() throws RecognitionException {
		R5RSParser.recipient_return retval = new R5RSParser.recipient_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression201 =null;


		try {
			// R5RS.g3:259:3: ( expression )
			// R5RS.g3:259:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_recipient1790);
			expression201=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression201.getTree());

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
	// R5RS.g3:262:1: caseClause : '(' '(' ( datum )* ')' sequence ')' ;
	public final R5RSParser.caseClause_return caseClause() throws RecognitionException {
		R5RSParser.caseClause_return retval = new R5RSParser.caseClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal202=null;
		Token char_literal203=null;
		Token char_literal205=null;
		Token char_literal207=null;
		ParserRuleReturnScope datum204 =null;
		ParserRuleReturnScope sequence206 =null;

		Object char_literal202_tree=null;
		Object char_literal203_tree=null;
		Object char_literal205_tree=null;
		Object char_literal207_tree=null;

		try {
			// R5RS.g3:263:3: ( '(' '(' ( datum )* ')' sequence ')' )
			// R5RS.g3:263:6: '(' '(' ( datum )* ')' sequence ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal202=(Token)match(input,91,FOLLOW_91_in_caseClause1804); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal202_tree = (Object)adaptor.create(char_literal202);
			adaptor.addChild(root_0, char_literal202_tree);
			}

			char_literal203=(Token)match(input,91,FOLLOW_91_in_caseClause1806); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal203_tree = (Object)adaptor.create(char_literal203);
			adaptor.addChild(root_0, char_literal203_tree);
			}

			// R5RS.g3:263:14: ( datum )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( ((LA55_0 >= AND && LA55_0 <= CHARACTER)||LA55_0==COND||LA55_0==DEFINE||LA55_0==DELAY||(LA55_0 >= DO && LA55_0 <= ELSE)||LA55_0==FALSE||LA55_0==IF||(LA55_0 >= LAMBDA && LA55_0 <= LETREC)||LA55_0==LETSTAR||(LA55_0 >= NUM_10 && LA55_0 <= NUM_8)||LA55_0==OR||LA55_0==QUASIQUOTE||LA55_0==QUOTE||LA55_0==SET||LA55_0==STRING||LA55_0==TRUE||(LA55_0 >= UNQUOTE && LA55_0 <= UNQUOTE_SPLICING)||(LA55_0 >= VARIABLE && LA55_0 <= 91)||(LA55_0 >= 93 && LA55_0 <= 94)||(LA55_0 >= 96 && LA55_0 <= 97)) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// R5RS.g3:263:14: datum
					{
					pushFollow(FOLLOW_datum_in_caseClause1808);
					datum204=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum204.getTree());

					}
					break;

				default :
					break loop55;
				}
			}

			char_literal205=(Token)match(input,92,FOLLOW_92_in_caseClause1811); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal205_tree = (Object)adaptor.create(char_literal205);
			adaptor.addChild(root_0, char_literal205_tree);
			}

			pushFollow(FOLLOW_sequence_in_caseClause1813);
			sequence206=sequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence206.getTree());

			char_literal207=(Token)match(input,92,FOLLOW_92_in_caseClause1815); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal207_tree = (Object)adaptor.create(char_literal207);
			adaptor.addChild(root_0, char_literal207_tree);
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
	// R5RS.g3:266:1: bindingSpec : '(' variable expression ')' ;
	public final R5RSParser.bindingSpec_return bindingSpec() throws RecognitionException {
		R5RSParser.bindingSpec_return retval = new R5RSParser.bindingSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal208=null;
		Token char_literal211=null;
		ParserRuleReturnScope variable209 =null;
		ParserRuleReturnScope expression210 =null;

		Object char_literal208_tree=null;
		Object char_literal211_tree=null;

		try {
			// R5RS.g3:267:3: ( '(' variable expression ')' )
			// R5RS.g3:267:6: '(' variable expression ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal208=(Token)match(input,91,FOLLOW_91_in_bindingSpec1829); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal208_tree = (Object)adaptor.create(char_literal208);
			adaptor.addChild(root_0, char_literal208_tree);
			}

			pushFollow(FOLLOW_variable_in_bindingSpec1831);
			variable209=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable209.getTree());

			pushFollow(FOLLOW_expression_in_bindingSpec1833);
			expression210=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression210.getTree());

			char_literal211=(Token)match(input,92,FOLLOW_92_in_bindingSpec1835); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal211_tree = (Object)adaptor.create(char_literal211);
			adaptor.addChild(root_0, char_literal211_tree);
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
	// R5RS.g3:270:1: iterationSpec : '(' variable init ( step )? ')' ;
	public final R5RSParser.iterationSpec_return iterationSpec() throws RecognitionException {
		R5RSParser.iterationSpec_return retval = new R5RSParser.iterationSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal212=null;
		Token char_literal216=null;
		ParserRuleReturnScope variable213 =null;
		ParserRuleReturnScope init214 =null;
		ParserRuleReturnScope step215 =null;

		Object char_literal212_tree=null;
		Object char_literal216_tree=null;

		try {
			// R5RS.g3:271:3: ( '(' variable init ( step )? ')' )
			// R5RS.g3:271:6: '(' variable init ( step )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal212=(Token)match(input,91,FOLLOW_91_in_iterationSpec1849); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal212_tree = (Object)adaptor.create(char_literal212);
			adaptor.addChild(root_0, char_literal212_tree);
			}

			pushFollow(FOLLOW_variable_in_iterationSpec1851);
			variable213=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable213.getTree());

			pushFollow(FOLLOW_init_in_iterationSpec1853);
			init214=init();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, init214.getTree());

			// R5RS.g3:271:24: ( step )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==CHARACTER||LA56_0==ELLIPSIS||LA56_0==FALSE||(LA56_0 >= NUM_10 && LA56_0 <= NUM_8)||LA56_0==STRING||LA56_0==TRUE||LA56_0==VARIABLE||LA56_0==91||(LA56_0 >= 96 && LA56_0 <= 97)) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// R5RS.g3:271:24: step
					{
					pushFollow(FOLLOW_step_in_iterationSpec1855);
					step215=step();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, step215.getTree());

					}
					break;

			}

			char_literal216=(Token)match(input,92,FOLLOW_92_in_iterationSpec1858); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal216_tree = (Object)adaptor.create(char_literal216);
			adaptor.addChild(root_0, char_literal216_tree);
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
	// R5RS.g3:274:1: init : expression ;
	public final R5RSParser.init_return init() throws RecognitionException {
		R5RSParser.init_return retval = new R5RSParser.init_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression217 =null;


		try {
			// R5RS.g3:275:3: ( expression )
			// R5RS.g3:275:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_init1872);
			expression217=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression217.getTree());

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
	// R5RS.g3:278:1: step : expression ;
	public final R5RSParser.step_return step() throws RecognitionException {
		R5RSParser.step_return retval = new R5RSParser.step_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression218 =null;


		try {
			// R5RS.g3:279:3: ( expression )
			// R5RS.g3:279:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_step1886);
			expression218=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression218.getTree());

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
	// R5RS.g3:282:1: doResult : sequence ;
	public final R5RSParser.doResult_return doResult() throws RecognitionException {
		R5RSParser.doResult_return retval = new R5RSParser.doResult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope sequence219 =null;


		try {
			// R5RS.g3:283:3: ( sequence )
			// R5RS.g3:283:6: sequence
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_sequence_in_doResult1900);
			sequence219=sequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence219.getTree());

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
	// R5RS.g3:286:1: procedureCall : '(' operator ( operand )* ')' -> ^( PROCEDURECALL operator ( operand )* ) ;
	public final R5RSParser.procedureCall_return procedureCall() throws RecognitionException {
		R5RSParser.procedureCall_return retval = new R5RSParser.procedureCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal220=null;
		Token char_literal223=null;
		ParserRuleReturnScope operator221 =null;
		ParserRuleReturnScope operand222 =null;

		Object char_literal220_tree=null;
		Object char_literal223_tree=null;
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// R5RS.g3:287:3: ( '(' operator ( operand )* ')' -> ^( PROCEDURECALL operator ( operand )* ) )
			// R5RS.g3:287:6: '(' operator ( operand )* ')'
			{
			char_literal220=(Token)match(input,91,FOLLOW_91_in_procedureCall1914); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_91.add(char_literal220);

			pushFollow(FOLLOW_operator_in_procedureCall1916);
			operator221=operator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operator.add(operator221.getTree());
			// R5RS.g3:287:19: ( operand )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==CHARACTER||LA57_0==ELLIPSIS||LA57_0==FALSE||(LA57_0 >= NUM_10 && LA57_0 <= NUM_8)||LA57_0==STRING||LA57_0==TRUE||LA57_0==VARIABLE||LA57_0==91||(LA57_0 >= 96 && LA57_0 <= 97)) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// R5RS.g3:287:19: operand
					{
					pushFollow(FOLLOW_operand_in_procedureCall1918);
					operand222=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(operand222.getTree());
					}
					break;

				default :
					break loop57;
				}
			}

			char_literal223=(Token)match(input,92,FOLLOW_92_in_procedureCall1921); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_92.add(char_literal223);

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
			// 287:32: -> ^( PROCEDURECALL operator ( operand )* )
			{
				// R5RS.g3:287:35: ^( PROCEDURECALL operator ( operand )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_1);
				adaptor.addChild(root_1, stream_operator.nextTree());
				// R5RS.g3:287:60: ( operand )*
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
	// R5RS.g3:290:1: operator : expression -> ^( OPERATOR expression ) ;
	public final R5RSParser.operator_return operator() throws RecognitionException {
		R5RSParser.operator_return retval = new R5RSParser.operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression224 =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// R5RS.g3:291:3: ( expression -> ^( OPERATOR expression ) )
			// R5RS.g3:291:6: expression
			{
			pushFollow(FOLLOW_expression_in_operator1946);
			expression224=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression224.getTree());
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
			// 291:17: -> ^( OPERATOR expression )
			{
				// R5RS.g3:291:20: ^( OPERATOR expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);
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
	// $ANTLR end "operator"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// R5RS.g3:294:1: operand : expression ;
	public final R5RSParser.operand_return operand() throws RecognitionException {
		R5RSParser.operand_return retval = new R5RSParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression225 =null;


		try {
			// R5RS.g3:295:3: ( expression )
			// R5RS.g3:295:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_operand1968);
			expression225=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression225.getTree());

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
	// R5RS.g3:298:1: macroUse : '(' keyword ( datum )* ')' ;
	public final R5RSParser.macroUse_return macroUse() throws RecognitionException {
		R5RSParser.macroUse_return retval = new R5RSParser.macroUse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal226=null;
		Token char_literal229=null;
		ParserRuleReturnScope keyword227 =null;
		ParserRuleReturnScope datum228 =null;

		Object char_literal226_tree=null;
		Object char_literal229_tree=null;

		try {
			// R5RS.g3:299:3: ( '(' keyword ( datum )* ')' )
			// R5RS.g3:299:6: '(' keyword ( datum )* ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal226=(Token)match(input,91,FOLLOW_91_in_macroUse1982); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal226_tree = (Object)adaptor.create(char_literal226);
			adaptor.addChild(root_0, char_literal226_tree);
			}

			pushFollow(FOLLOW_keyword_in_macroUse1984);
			keyword227=keyword();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword227.getTree());

			// R5RS.g3:299:18: ( datum )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( ((LA58_0 >= AND && LA58_0 <= CHARACTER)||LA58_0==COND||LA58_0==DEFINE||LA58_0==DELAY||(LA58_0 >= DO && LA58_0 <= ELSE)||LA58_0==FALSE||LA58_0==IF||(LA58_0 >= LAMBDA && LA58_0 <= LETREC)||LA58_0==LETSTAR||(LA58_0 >= NUM_10 && LA58_0 <= NUM_8)||LA58_0==OR||LA58_0==QUASIQUOTE||LA58_0==QUOTE||LA58_0==SET||LA58_0==STRING||LA58_0==TRUE||(LA58_0 >= UNQUOTE && LA58_0 <= UNQUOTE_SPLICING)||(LA58_0 >= VARIABLE && LA58_0 <= 91)||(LA58_0 >= 93 && LA58_0 <= 94)||(LA58_0 >= 96 && LA58_0 <= 97)) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// R5RS.g3:299:18: datum
					{
					pushFollow(FOLLOW_datum_in_macroUse1986);
					datum228=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum228.getTree());

					}
					break;

				default :
					break loop58;
				}
			}

			char_literal229=(Token)match(input,92,FOLLOW_92_in_macroUse1989); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal229_tree = (Object)adaptor.create(char_literal229);
			adaptor.addChild(root_0, char_literal229_tree);
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
	// R5RS.g3:302:1: macroBlock : '(' ( LET_SYNTAX | LETREC_SYNTAX ) '(' ( syntaxSpec )* ')' body ')' ;
	public final R5RSParser.macroBlock_return macroBlock() throws RecognitionException {
		R5RSParser.macroBlock_return retval = new R5RSParser.macroBlock_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal230=null;
		Token set231=null;
		Token char_literal232=null;
		Token char_literal234=null;
		Token char_literal236=null;
		ParserRuleReturnScope syntaxSpec233 =null;
		ParserRuleReturnScope body235 =null;

		Object char_literal230_tree=null;
		Object set231_tree=null;
		Object char_literal232_tree=null;
		Object char_literal234_tree=null;
		Object char_literal236_tree=null;

		try {
			// R5RS.g3:303:3: ( '(' ( LET_SYNTAX | LETREC_SYNTAX ) '(' ( syntaxSpec )* ')' body ')' )
			// R5RS.g3:303:6: '(' ( LET_SYNTAX | LETREC_SYNTAX ) '(' ( syntaxSpec )* ')' body ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal230=(Token)match(input,91,FOLLOW_91_in_macroBlock2003); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal230_tree = (Object)adaptor.create(char_literal230);
			adaptor.addChild(root_0, char_literal230_tree);
			}

			set231=input.LT(1);
			if ( input.LA(1)==LETREC_SYNTAX||input.LA(1)==LET_SYNTAX ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set231));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			char_literal232=(Token)match(input,91,FOLLOW_91_in_macroBlock2013); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal232_tree = (Object)adaptor.create(char_literal232);
			adaptor.addChild(root_0, char_literal232_tree);
			}

			// R5RS.g3:303:43: ( syntaxSpec )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==91) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// R5RS.g3:303:43: syntaxSpec
					{
					pushFollow(FOLLOW_syntaxSpec_in_macroBlock2015);
					syntaxSpec233=syntaxSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntaxSpec233.getTree());

					}
					break;

				default :
					break loop59;
				}
			}

			char_literal234=(Token)match(input,92,FOLLOW_92_in_macroBlock2018); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal234_tree = (Object)adaptor.create(char_literal234);
			adaptor.addChild(root_0, char_literal234_tree);
			}

			pushFollow(FOLLOW_body_in_macroBlock2020);
			body235=body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, body235.getTree());

			char_literal236=(Token)match(input,92,FOLLOW_92_in_macroBlock2022); if (state.failed) return retval;
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
	// $ANTLR end "macroBlock"


	public static class syntaxSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "syntaxSpec"
	// R5RS.g3:306:1: syntaxSpec : '(' keyword transformerSpec ')' ;
	public final R5RSParser.syntaxSpec_return syntaxSpec() throws RecognitionException {
		R5RSParser.syntaxSpec_return retval = new R5RSParser.syntaxSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal237=null;
		Token char_literal240=null;
		ParserRuleReturnScope keyword238 =null;
		ParserRuleReturnScope transformerSpec239 =null;

		Object char_literal237_tree=null;
		Object char_literal240_tree=null;

		try {
			// R5RS.g3:307:3: ( '(' keyword transformerSpec ')' )
			// R5RS.g3:307:6: '(' keyword transformerSpec ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal237=(Token)match(input,91,FOLLOW_91_in_syntaxSpec2036); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal237_tree = (Object)adaptor.create(char_literal237);
			adaptor.addChild(root_0, char_literal237_tree);
			}

			pushFollow(FOLLOW_keyword_in_syntaxSpec2038);
			keyword238=keyword();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword238.getTree());

			pushFollow(FOLLOW_transformerSpec_in_syntaxSpec2040);
			transformerSpec239=transformerSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, transformerSpec239.getTree());

			char_literal240=(Token)match(input,92,FOLLOW_92_in_syntaxSpec2042); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal240_tree = (Object)adaptor.create(char_literal240);
			adaptor.addChild(root_0, char_literal240_tree);
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
	// R5RS.g3:310:1: body : ( ( definition )=> definition )* sequence ;
	public final R5RSParser.body_return body() throws RecognitionException {
		R5RSParser.body_return retval = new R5RSParser.body_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope definition241 =null;
		ParserRuleReturnScope sequence242 =null;


		try {
			// R5RS.g3:311:3: ( ( ( definition )=> definition )* sequence )
			// R5RS.g3:311:6: ( ( definition )=> definition )* sequence
			{
			root_0 = (Object)adaptor.nil();


			// R5RS.g3:311:6: ( ( definition )=> definition )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==91) ) {
					int LA60_4 = input.LA(2);
					if ( (synpred14_R5RS()) ) {
						alt60=1;
					}

				}

				switch (alt60) {
				case 1 :
					// R5RS.g3:311:7: ( definition )=> definition
					{
					pushFollow(FOLLOW_definition_in_body2062);
					definition241=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition241.getTree());

					}
					break;

				default :
					break loop60;
				}
			}

			pushFollow(FOLLOW_sequence_in_body2066);
			sequence242=sequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence242.getTree());

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
	// R5RS.g3:318:1: sequence : ( expression )+ ;
	public final R5RSParser.sequence_return sequence() throws RecognitionException {
		R5RSParser.sequence_return retval = new R5RSParser.sequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression243 =null;


		try {
			// R5RS.g3:319:3: ( ( expression )+ )
			// R5RS.g3:319:6: ( expression )+
			{
			root_0 = (Object)adaptor.nil();


			// R5RS.g3:319:6: ( expression )+
			int cnt61=0;
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==CHARACTER||LA61_0==ELLIPSIS||LA61_0==FALSE||(LA61_0 >= NUM_10 && LA61_0 <= NUM_8)||LA61_0==STRING||LA61_0==TRUE||LA61_0==VARIABLE||LA61_0==91||(LA61_0 >= 96 && LA61_0 <= 97)) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// R5RS.g3:319:6: expression
					{
					pushFollow(FOLLOW_expression_in_sequence2084);
					expression243=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression243.getTree());

					}
					break;

				default :
					if ( cnt61 >= 1 ) break loop61;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(61, input);
					throw eee;
				}
				cnt61++;
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
	// R5RS.g3:322:1: datum : ( simpleDatum | compoundDatum );
	public final R5RSParser.datum_return datum() throws RecognitionException {
		R5RSParser.datum_return retval = new R5RSParser.datum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simpleDatum244 =null;
		ParserRuleReturnScope compoundDatum245 =null;


		try {
			// R5RS.g3:323:3: ( simpleDatum | compoundDatum )
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( ((LA62_0 >= AND && LA62_0 <= CHARACTER)||LA62_0==COND||LA62_0==DEFINE||LA62_0==DELAY||(LA62_0 >= DO && LA62_0 <= ELSE)||LA62_0==FALSE||LA62_0==IF||(LA62_0 >= LAMBDA && LA62_0 <= LETREC)||LA62_0==LETSTAR||(LA62_0 >= NUM_10 && LA62_0 <= NUM_8)||LA62_0==OR||LA62_0==QUASIQUOTE||LA62_0==QUOTE||LA62_0==SET||LA62_0==STRING||LA62_0==TRUE||(LA62_0 >= UNQUOTE && LA62_0 <= UNQUOTE_SPLICING)||LA62_0==VARIABLE) ) {
				alt62=1;
			}
			else if ( ((LA62_0 >= 90 && LA62_0 <= 91)||(LA62_0 >= 93 && LA62_0 <= 94)||(LA62_0 >= 96 && LA62_0 <= 97)) ) {
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
					// R5RS.g3:323:6: simpleDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleDatum_in_datum2099);
					simpleDatum244=simpleDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDatum244.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:324:6: compoundDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_compoundDatum_in_datum2106);
					compoundDatum245=compoundDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compoundDatum245.getTree());

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
	// R5RS.g3:327:1: simpleDatum : ( bool | number | CHARACTER | STRING | identifier );
	public final R5RSParser.simpleDatum_return simpleDatum() throws RecognitionException {
		R5RSParser.simpleDatum_return retval = new R5RSParser.simpleDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHARACTER248=null;
		Token STRING249=null;
		ParserRuleReturnScope bool246 =null;
		ParserRuleReturnScope number247 =null;
		ParserRuleReturnScope identifier250 =null;

		Object CHARACTER248_tree=null;
		Object STRING249_tree=null;

		try {
			// R5RS.g3:328:3: ( bool | number | CHARACTER | STRING | identifier )
			int alt63=5;
			switch ( input.LA(1) ) {
			case FALSE:
			case TRUE:
				{
				alt63=1;
				}
				break;
			case NUM_10:
			case NUM_16:
			case NUM_2:
			case NUM_8:
				{
				alt63=2;
				}
				break;
			case CHARACTER:
				{
				alt63=3;
				}
				break;
			case STRING:
				{
				alt63=4;
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
				alt63=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// R5RS.g3:328:6: bool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_in_simpleDatum2120);
					bool246=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool246.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:329:6: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_simpleDatum2127);
					number247=number();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number247.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:330:6: CHARACTER
					{
					root_0 = (Object)adaptor.nil();


					CHARACTER248=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_simpleDatum2134); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHARACTER248_tree = (Object)adaptor.create(CHARACTER248);
					adaptor.addChild(root_0, CHARACTER248_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:331:6: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING249=(Token)match(input,STRING,FOLLOW_STRING_in_simpleDatum2141); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING249_tree = (Object)adaptor.create(STRING249);
					adaptor.addChild(root_0, STRING249_tree);
					}

					}
					break;
				case 5 :
					// R5RS.g3:332:6: identifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_simpleDatum2148);
					identifier250=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier250.getTree());

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
	// R5RS.g3:335:1: compoundDatum : ( list -> ^( LIST list ) | vector );
	public final R5RSParser.compoundDatum_return compoundDatum() throws RecognitionException {
		R5RSParser.compoundDatum_return retval = new R5RSParser.compoundDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope list251 =null;
		ParserRuleReturnScope vector252 =null;

		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// R5RS.g3:336:3: ( list -> ^( LIST list ) | vector )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==91||(LA64_0 >= 93 && LA64_0 <= 94)||(LA64_0 >= 96 && LA64_0 <= 97)) ) {
				alt64=1;
			}
			else if ( (LA64_0==90) ) {
				alt64=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// R5RS.g3:336:6: list
					{
					pushFollow(FOLLOW_list_in_compoundDatum2162);
					list251=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_list.add(list251.getTree());
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
					// 336:11: -> ^( LIST list )
					{
						// R5RS.g3:336:14: ^( LIST list )
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
					// R5RS.g3:337:6: vector
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_vector_in_compoundDatum2177);
					vector252=vector();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, vector252.getTree());

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
	// R5RS.g3:340:1: list : ( '(' ( ( datum )+ ( '.' datum )? )? ')' | abbreviation );
	public final R5RSParser.list_return list() throws RecognitionException {
		R5RSParser.list_return retval = new R5RSParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal253=null;
		Token char_literal255=null;
		Token char_literal257=null;
		ParserRuleReturnScope datum254 =null;
		ParserRuleReturnScope datum256 =null;
		ParserRuleReturnScope abbreviation258 =null;

		Object char_literal253_tree=null;
		Object char_literal255_tree=null;
		Object char_literal257_tree=null;

		try {
			// R5RS.g3:341:3: ( '(' ( ( datum )+ ( '.' datum )? )? ')' | abbreviation )
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==91) ) {
				alt68=1;
			}
			else if ( ((LA68_0 >= 93 && LA68_0 <= 94)||(LA68_0 >= 96 && LA68_0 <= 97)) ) {
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
					// R5RS.g3:341:6: '(' ( ( datum )+ ( '.' datum )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal253=(Token)match(input,91,FOLLOW_91_in_list2191); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal253_tree = (Object)adaptor.create(char_literal253);
					adaptor.addChild(root_0, char_literal253_tree);
					}

					// R5RS.g3:341:10: ( ( datum )+ ( '.' datum )? )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( ((LA67_0 >= AND && LA67_0 <= CHARACTER)||LA67_0==COND||LA67_0==DEFINE||LA67_0==DELAY||(LA67_0 >= DO && LA67_0 <= ELSE)||LA67_0==FALSE||LA67_0==IF||(LA67_0 >= LAMBDA && LA67_0 <= LETREC)||LA67_0==LETSTAR||(LA67_0 >= NUM_10 && LA67_0 <= NUM_8)||LA67_0==OR||LA67_0==QUASIQUOTE||LA67_0==QUOTE||LA67_0==SET||LA67_0==STRING||LA67_0==TRUE||(LA67_0 >= UNQUOTE && LA67_0 <= UNQUOTE_SPLICING)||(LA67_0 >= VARIABLE && LA67_0 <= 91)||(LA67_0 >= 93 && LA67_0 <= 94)||(LA67_0 >= 96 && LA67_0 <= 97)) ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// R5RS.g3:341:11: ( datum )+ ( '.' datum )?
							{
							// R5RS.g3:341:11: ( datum )+
							int cnt65=0;
							loop65:
							while (true) {
								int alt65=2;
								int LA65_0 = input.LA(1);
								if ( ((LA65_0 >= AND && LA65_0 <= CHARACTER)||LA65_0==COND||LA65_0==DEFINE||LA65_0==DELAY||(LA65_0 >= DO && LA65_0 <= ELSE)||LA65_0==FALSE||LA65_0==IF||(LA65_0 >= LAMBDA && LA65_0 <= LETREC)||LA65_0==LETSTAR||(LA65_0 >= NUM_10 && LA65_0 <= NUM_8)||LA65_0==OR||LA65_0==QUASIQUOTE||LA65_0==QUOTE||LA65_0==SET||LA65_0==STRING||LA65_0==TRUE||(LA65_0 >= UNQUOTE && LA65_0 <= UNQUOTE_SPLICING)||(LA65_0 >= VARIABLE && LA65_0 <= 91)||(LA65_0 >= 93 && LA65_0 <= 94)||(LA65_0 >= 96 && LA65_0 <= 97)) ) {
									alt65=1;
								}

								switch (alt65) {
								case 1 :
									// R5RS.g3:341:11: datum
									{
									pushFollow(FOLLOW_datum_in_list2194);
									datum254=datum();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, datum254.getTree());

									}
									break;

								default :
									if ( cnt65 >= 1 ) break loop65;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(65, input);
									throw eee;
								}
								cnt65++;
							}

							// R5RS.g3:341:18: ( '.' datum )?
							int alt66=2;
							int LA66_0 = input.LA(1);
							if ( (LA66_0==95) ) {
								alt66=1;
							}
							switch (alt66) {
								case 1 :
									// R5RS.g3:341:19: '.' datum
									{
									char_literal255=(Token)match(input,95,FOLLOW_95_in_list2198); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal255_tree = (Object)adaptor.create(char_literal255);
									adaptor.addChild(root_0, char_literal255_tree);
									}

									pushFollow(FOLLOW_datum_in_list2200);
									datum256=datum();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, datum256.getTree());

									}
									break;

							}

							}
							break;

					}

					char_literal257=(Token)match(input,92,FOLLOW_92_in_list2206); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal257_tree = (Object)adaptor.create(char_literal257);
					adaptor.addChild(root_0, char_literal257_tree);
					}

					}
					break;
				case 2 :
					// R5RS.g3:342:6: abbreviation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_abbreviation_in_list2213);
					abbreviation258=abbreviation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, abbreviation258.getTree());

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
	// R5RS.g3:345:1: abbreviation : abbrevPrefix datum ;
	public final R5RSParser.abbreviation_return abbreviation() throws RecognitionException {
		R5RSParser.abbreviation_return retval = new R5RSParser.abbreviation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope abbrevPrefix259 =null;
		ParserRuleReturnScope datum260 =null;


		try {
			// R5RS.g3:346:3: ( abbrevPrefix datum )
			// R5RS.g3:346:6: abbrevPrefix datum
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_abbrevPrefix_in_abbreviation2227);
			abbrevPrefix259=abbrevPrefix();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, abbrevPrefix259.getTree());

			pushFollow(FOLLOW_datum_in_abbreviation2229);
			datum260=datum();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, datum260.getTree());

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
	// R5RS.g3:349:1: abbrevPrefix : ( '\\'' | '`' | ',@' | ',' );
	public final R5RSParser.abbrevPrefix_return abbrevPrefix() throws RecognitionException {
		R5RSParser.abbrevPrefix_return retval = new R5RSParser.abbrevPrefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set261=null;

		Object set261_tree=null;

		try {
			// R5RS.g3:350:3: ( '\\'' | '`' | ',@' | ',' )
			// R5RS.g3:
			{
			root_0 = (Object)adaptor.nil();


			set261=input.LT(1);
			if ( (input.LA(1) >= 93 && input.LA(1) <= 94)||(input.LA(1) >= 96 && input.LA(1) <= 97) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set261));
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
	// R5RS.g3:353:1: vector : '#(' ( datum )* ')' ;
	public final R5RSParser.vector_return vector() throws RecognitionException {
		R5RSParser.vector_return retval = new R5RSParser.vector_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal262=null;
		Token char_literal264=null;
		ParserRuleReturnScope datum263 =null;

		Object string_literal262_tree=null;
		Object char_literal264_tree=null;

		try {
			// R5RS.g3:354:3: ( '#(' ( datum )* ')' )
			// R5RS.g3:354:6: '#(' ( datum )* ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal262=(Token)match(input,90,FOLLOW_90_in_vector2269); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal262_tree = (Object)adaptor.create(string_literal262);
			adaptor.addChild(root_0, string_literal262_tree);
			}

			// R5RS.g3:354:11: ( datum )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( ((LA69_0 >= AND && LA69_0 <= CHARACTER)||LA69_0==COND||LA69_0==DEFINE||LA69_0==DELAY||(LA69_0 >= DO && LA69_0 <= ELSE)||LA69_0==FALSE||LA69_0==IF||(LA69_0 >= LAMBDA && LA69_0 <= LETREC)||LA69_0==LETSTAR||(LA69_0 >= NUM_10 && LA69_0 <= NUM_8)||LA69_0==OR||LA69_0==QUASIQUOTE||LA69_0==QUOTE||LA69_0==SET||LA69_0==STRING||LA69_0==TRUE||(LA69_0 >= UNQUOTE && LA69_0 <= UNQUOTE_SPLICING)||(LA69_0 >= VARIABLE && LA69_0 <= 91)||(LA69_0 >= 93 && LA69_0 <= 94)||(LA69_0 >= 96 && LA69_0 <= 97)) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// R5RS.g3:354:11: datum
					{
					pushFollow(FOLLOW_datum_in_vector2271);
					datum263=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum263.getTree());

					}
					break;

				default :
					break loop69;
				}
			}

			char_literal264=(Token)match(input,92,FOLLOW_92_in_vector2274); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal264_tree = (Object)adaptor.create(char_literal264);
			adaptor.addChild(root_0, char_literal264_tree);
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
	// R5RS.g3:357:1: number : ( NUM_2 | NUM_8 | NUM_10 | NUM_16 );
	public final R5RSParser.number_return number() throws RecognitionException {
		R5RSParser.number_return retval = new R5RSParser.number_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set265=null;

		Object set265_tree=null;

		try {
			// R5RS.g3:358:3: ( NUM_2 | NUM_8 | NUM_10 | NUM_16 )
			// R5RS.g3:
			{
			root_0 = (Object)adaptor.nil();


			set265=input.LT(1);
			if ( (input.LA(1) >= NUM_10 && input.LA(1) <= NUM_8) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set265));
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
	// R5RS.g3:364:1: bool : ( TRUE | FALSE );
	public final R5RSParser.bool_return bool() throws RecognitionException {
		R5RSParser.bool_return retval = new R5RSParser.bool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set266=null;

		Object set266_tree=null;

		try {
			// R5RS.g3:365:3: ( TRUE | FALSE )
			// R5RS.g3:
			{
			root_0 = (Object)adaptor.nil();


			set266=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set266));
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
	// R5RS.g3:369:1: quasiquotation : quasiquotationD[1] ;
	public final R5RSParser.quasiquotation_return quasiquotation() throws RecognitionException {
		R5RSParser.quasiquotation_return retval = new R5RSParser.quasiquotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope quasiquotationD267 =null;


		try {
			// R5RS.g3:370:3: ( quasiquotationD[1] )
			// R5RS.g3:370:6: quasiquotationD[1]
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_quasiquotationD_in_quasiquotation2344);
			quasiquotationD267=quasiquotationD(1);
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, quasiquotationD267.getTree());

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
	// R5RS.g3:373:1: quasiquotationD[int d] : ( '`' qqTemplate[d] | '(' QUASIQUOTE qqTemplate[d] ')' );
	public final R5RSParser.quasiquotationD_return quasiquotationD(int d) throws RecognitionException {
		R5RSParser.quasiquotationD_return retval = new R5RSParser.quasiquotationD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal268=null;
		Token char_literal270=null;
		Token QUASIQUOTE271=null;
		Token char_literal273=null;
		ParserRuleReturnScope qqTemplate269 =null;
		ParserRuleReturnScope qqTemplate272 =null;

		Object char_literal268_tree=null;
		Object char_literal270_tree=null;
		Object QUASIQUOTE271_tree=null;
		Object char_literal273_tree=null;

		try {
			// R5RS.g3:374:3: ( '`' qqTemplate[d] | '(' QUASIQUOTE qqTemplate[d] ')' )
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==97) ) {
				alt70=1;
			}
			else if ( (LA70_0==91) ) {
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
					// R5RS.g3:374:6: '`' qqTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					char_literal268=(Token)match(input,97,FOLLOW_97_in_quasiquotationD2360); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal268_tree = (Object)adaptor.create(char_literal268);
					adaptor.addChild(root_0, char_literal268_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_quasiquotationD2362);
					qqTemplate269=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate269.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:375:6: '(' QUASIQUOTE qqTemplate[d] ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal270=(Token)match(input,91,FOLLOW_91_in_quasiquotationD2370); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal270_tree = (Object)adaptor.create(char_literal270);
					adaptor.addChild(root_0, char_literal270_tree);
					}

					QUASIQUOTE271=(Token)match(input,QUASIQUOTE,FOLLOW_QUASIQUOTE_in_quasiquotationD2372); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					QUASIQUOTE271_tree = (Object)adaptor.create(QUASIQUOTE271);
					adaptor.addChild(root_0, QUASIQUOTE271_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_quasiquotationD2374);
					qqTemplate272=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate272.getTree());

					char_literal273=(Token)match(input,92,FOLLOW_92_in_quasiquotationD2377); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal273_tree = (Object)adaptor.create(char_literal273);
					adaptor.addChild(root_0, char_literal273_tree);
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
	// R5RS.g3:378:1: qqTemplate[int d] : ( ( expression )=> expression | ( '(' UNQUOTE )=> unquotation[d] | simpleDatum | vectorQQTemplate[d] | listQQTemplate[d] );
	public final R5RSParser.qqTemplate_return qqTemplate(int d) throws RecognitionException {
		R5RSParser.qqTemplate_return retval = new R5RSParser.qqTemplate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression274 =null;
		ParserRuleReturnScope unquotation275 =null;
		ParserRuleReturnScope simpleDatum276 =null;
		ParserRuleReturnScope vectorQQTemplate277 =null;
		ParserRuleReturnScope listQQTemplate278 =null;


		try {
			// R5RS.g3:379:3: ( ( expression )=> expression | ( '(' UNQUOTE )=> unquotation[d] | simpleDatum | vectorQQTemplate[d] | listQQTemplate[d] )
			int alt71=5;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==VARIABLE) ) {
				int LA71_1 = input.LA(2);
				if ( (synpred15_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==ELLIPSIS) ) {
				int LA71_2 = input.LA(2);
				if ( (synpred15_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==96) ) {
				int LA71_3 = input.LA(2);
				if ( (synpred15_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=5;
				}

			}
			else if ( (LA71_0==91) ) {
				int LA71_4 = input.LA(2);
				if ( (synpred15_R5RS()) ) {
					alt71=1;
				}
				else if ( (synpred16_R5RS()) ) {
					alt71=2;
				}
				else if ( (true) ) {
					alt71=5;
				}

			}
			else if ( (LA71_0==FALSE||LA71_0==TRUE) ) {
				int LA71_5 = input.LA(2);
				if ( (synpred15_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( ((LA71_0 >= NUM_10 && LA71_0 <= NUM_8)) ) {
				int LA71_6 = input.LA(2);
				if ( (synpred15_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==CHARACTER) ) {
				int LA71_7 = input.LA(2);
				if ( (synpred15_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==STRING) ) {
				int LA71_8 = input.LA(2);
				if ( (synpred15_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=3;
				}

			}
			else if ( (LA71_0==97) ) {
				int LA71_9 = input.LA(2);
				if ( (synpred15_R5RS()) ) {
					alt71=1;
				}
				else if ( (true) ) {
					alt71=5;
				}

			}
			else if ( (LA71_0==93) && (synpred16_R5RS())) {
				alt71=2;
			}
			else if ( ((LA71_0 >= AND && LA71_0 <= CASE)||LA71_0==COND||LA71_0==DEFINE||LA71_0==DELAY||LA71_0==DO||LA71_0==ELSE||LA71_0==IF||(LA71_0 >= LAMBDA && LA71_0 <= LETREC)||LA71_0==LETSTAR||LA71_0==OR||LA71_0==QUASIQUOTE||LA71_0==QUOTE||LA71_0==SET||(LA71_0 >= UNQUOTE && LA71_0 <= UNQUOTE_SPLICING)) ) {
				alt71=3;
			}
			else if ( (LA71_0==90) ) {
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
					// R5RS.g3:379:6: ( expression )=> expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_qqTemplate2398);
					expression274=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression274.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:380:6: ( '(' UNQUOTE )=> unquotation[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unquotation_in_qqTemplate2412);
					unquotation275=unquotation(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unquotation275.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:381:22: simpleDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleDatum_in_qqTemplate2436);
					simpleDatum276=simpleDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDatum276.getTree());

					}
					break;
				case 4 :
					// R5RS.g3:382:22: vectorQQTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_vectorQQTemplate_in_qqTemplate2459);
					vectorQQTemplate277=vectorQQTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, vectorQQTemplate277.getTree());

					}
					break;
				case 5 :
					// R5RS.g3:383:22: listQQTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_listQQTemplate_in_qqTemplate2483);
					listQQTemplate278=listQQTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, listQQTemplate278.getTree());

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
	// R5RS.g3:386:1: vectorQQTemplate[int d] : '#(' ( qqTemplateOrSplice[d] )* ')' ;
	public final R5RSParser.vectorQQTemplate_return vectorQQTemplate(int d) throws RecognitionException {
		R5RSParser.vectorQQTemplate_return retval = new R5RSParser.vectorQQTemplate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal279=null;
		Token char_literal281=null;
		ParserRuleReturnScope qqTemplateOrSplice280 =null;

		Object string_literal279_tree=null;
		Object char_literal281_tree=null;

		try {
			// R5RS.g3:387:3: ( '#(' ( qqTemplateOrSplice[d] )* ')' )
			// R5RS.g3:387:6: '#(' ( qqTemplateOrSplice[d] )* ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal279=(Token)match(input,90,FOLLOW_90_in_vectorQQTemplate2499); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal279_tree = (Object)adaptor.create(string_literal279);
			adaptor.addChild(root_0, string_literal279_tree);
			}

			// R5RS.g3:387:11: ( qqTemplateOrSplice[d] )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( ((LA72_0 >= AND && LA72_0 <= CHARACTER)||LA72_0==COND||LA72_0==DEFINE||LA72_0==DELAY||(LA72_0 >= DO && LA72_0 <= ELSE)||LA72_0==FALSE||LA72_0==IF||(LA72_0 >= LAMBDA && LA72_0 <= LETREC)||LA72_0==LETSTAR||(LA72_0 >= NUM_10 && LA72_0 <= NUM_8)||LA72_0==OR||LA72_0==QUASIQUOTE||LA72_0==QUOTE||LA72_0==SET||LA72_0==STRING||LA72_0==TRUE||(LA72_0 >= UNQUOTE && LA72_0 <= UNQUOTE_SPLICING)||(LA72_0 >= VARIABLE && LA72_0 <= 91)||(LA72_0 >= 93 && LA72_0 <= 94)||(LA72_0 >= 96 && LA72_0 <= 97)) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// R5RS.g3:387:11: qqTemplateOrSplice[d]
					{
					pushFollow(FOLLOW_qqTemplateOrSplice_in_vectorQQTemplate2501);
					qqTemplateOrSplice280=qqTemplateOrSplice(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplateOrSplice280.getTree());

					}
					break;

				default :
					break loop72;
				}
			}

			char_literal281=(Token)match(input,92,FOLLOW_92_in_vectorQQTemplate2505); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal281_tree = (Object)adaptor.create(char_literal281);
			adaptor.addChild(root_0, char_literal281_tree);
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
	// R5RS.g3:390:1: listQQTemplate[int d] : ( '\\'' qqTemplate[d] | ( '(' QUASIQUOTE )=> quasiquotationD[d+1] | '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')' );
	public final R5RSParser.listQQTemplate_return listQQTemplate(int d) throws RecognitionException {
		R5RSParser.listQQTemplate_return retval = new R5RSParser.listQQTemplate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal282=null;
		Token char_literal285=null;
		Token char_literal287=null;
		Token char_literal289=null;
		ParserRuleReturnScope qqTemplate283 =null;
		ParserRuleReturnScope quasiquotationD284 =null;
		ParserRuleReturnScope qqTemplateOrSplice286 =null;
		ParserRuleReturnScope qqTemplate288 =null;

		Object char_literal282_tree=null;
		Object char_literal285_tree=null;
		Object char_literal287_tree=null;
		Object char_literal289_tree=null;

		try {
			// R5RS.g3:391:3: ( '\\'' qqTemplate[d] | ( '(' QUASIQUOTE )=> quasiquotationD[d+1] | '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')' )
			int alt76=3;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==96) ) {
				alt76=1;
			}
			else if ( (LA76_0==97) && (synpred17_R5RS())) {
				alt76=2;
			}
			else if ( (LA76_0==91) ) {
				int LA76_3 = input.LA(2);
				if ( (synpred17_R5RS()) ) {
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
					// R5RS.g3:391:25: '\\'' qqTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					char_literal282=(Token)match(input,96,FOLLOW_96_in_listQQTemplate2539); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal282_tree = (Object)adaptor.create(char_literal282);
					adaptor.addChild(root_0, char_literal282_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_listQQTemplate2541);
					qqTemplate283=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate283.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:392:6: ( '(' QUASIQUOTE )=> quasiquotationD[d+1]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_quasiquotationD_in_listQQTemplate2556);
					quasiquotationD284=quasiquotationD(d+1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quasiquotationD284.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:393:25: '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal285=(Token)match(input,91,FOLLOW_91_in_listQQTemplate2583); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal285_tree = (Object)adaptor.create(char_literal285);
					adaptor.addChild(root_0, char_literal285_tree);
					}

					// R5RS.g3:393:29: ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( ((LA75_0 >= AND && LA75_0 <= CHARACTER)||LA75_0==COND||LA75_0==DEFINE||LA75_0==DELAY||(LA75_0 >= DO && LA75_0 <= ELSE)||LA75_0==FALSE||LA75_0==IF||(LA75_0 >= LAMBDA && LA75_0 <= LETREC)||LA75_0==LETSTAR||(LA75_0 >= NUM_10 && LA75_0 <= NUM_8)||LA75_0==OR||LA75_0==QUASIQUOTE||LA75_0==QUOTE||LA75_0==SET||LA75_0==STRING||LA75_0==TRUE||(LA75_0 >= UNQUOTE && LA75_0 <= UNQUOTE_SPLICING)||(LA75_0 >= VARIABLE && LA75_0 <= 91)||(LA75_0 >= 93 && LA75_0 <= 94)||(LA75_0 >= 96 && LA75_0 <= 97)) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// R5RS.g3:393:30: ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )?
							{
							// R5RS.g3:393:30: ( qqTemplateOrSplice[d] )+
							int cnt73=0;
							loop73:
							while (true) {
								int alt73=2;
								int LA73_0 = input.LA(1);
								if ( ((LA73_0 >= AND && LA73_0 <= CHARACTER)||LA73_0==COND||LA73_0==DEFINE||LA73_0==DELAY||(LA73_0 >= DO && LA73_0 <= ELSE)||LA73_0==FALSE||LA73_0==IF||(LA73_0 >= LAMBDA && LA73_0 <= LETREC)||LA73_0==LETSTAR||(LA73_0 >= NUM_10 && LA73_0 <= NUM_8)||LA73_0==OR||LA73_0==QUASIQUOTE||LA73_0==QUOTE||LA73_0==SET||LA73_0==STRING||LA73_0==TRUE||(LA73_0 >= UNQUOTE && LA73_0 <= UNQUOTE_SPLICING)||(LA73_0 >= VARIABLE && LA73_0 <= 91)||(LA73_0 >= 93 && LA73_0 <= 94)||(LA73_0 >= 96 && LA73_0 <= 97)) ) {
									alt73=1;
								}

								switch (alt73) {
								case 1 :
									// R5RS.g3:393:30: qqTemplateOrSplice[d]
									{
									pushFollow(FOLLOW_qqTemplateOrSplice_in_listQQTemplate2586);
									qqTemplateOrSplice286=qqTemplateOrSplice(d);
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplateOrSplice286.getTree());

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

							// R5RS.g3:393:53: ( '.' qqTemplate[d] )?
							int alt74=2;
							int LA74_0 = input.LA(1);
							if ( (LA74_0==95) ) {
								alt74=1;
							}
							switch (alt74) {
								case 1 :
									// R5RS.g3:393:54: '.' qqTemplate[d]
									{
									char_literal287=(Token)match(input,95,FOLLOW_95_in_listQQTemplate2591); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal287_tree = (Object)adaptor.create(char_literal287);
									adaptor.addChild(root_0, char_literal287_tree);
									}

									pushFollow(FOLLOW_qqTemplate_in_listQQTemplate2593);
									qqTemplate288=qqTemplate(d);
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate288.getTree());

									}
									break;

							}

							}
							break;

					}

					char_literal289=(Token)match(input,92,FOLLOW_92_in_listQQTemplate2600); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal289_tree = (Object)adaptor.create(char_literal289);
					adaptor.addChild(root_0, char_literal289_tree);
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
	// R5RS.g3:396:1: unquotation[int d] : ( ',' qqTemplate[d-1] | '(' UNQUOTE qqTemplate[d-1] ')' );
	public final R5RSParser.unquotation_return unquotation(int d) throws RecognitionException {
		R5RSParser.unquotation_return retval = new R5RSParser.unquotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal290=null;
		Token char_literal292=null;
		Token UNQUOTE293=null;
		Token char_literal295=null;
		ParserRuleReturnScope qqTemplate291 =null;
		ParserRuleReturnScope qqTemplate294 =null;

		Object char_literal290_tree=null;
		Object char_literal292_tree=null;
		Object UNQUOTE293_tree=null;
		Object char_literal295_tree=null;

		try {
			// R5RS.g3:397:3: ( ',' qqTemplate[d-1] | '(' UNQUOTE qqTemplate[d-1] ')' )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==93) ) {
				alt77=1;
			}
			else if ( (LA77_0==91) ) {
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
					// R5RS.g3:397:6: ',' qqTemplate[d-1]
					{
					root_0 = (Object)adaptor.nil();


					char_literal290=(Token)match(input,93,FOLLOW_93_in_unquotation2615); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal290_tree = (Object)adaptor.create(char_literal290);
					adaptor.addChild(root_0, char_literal290_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_unquotation2617);
					qqTemplate291=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate291.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:398:6: '(' UNQUOTE qqTemplate[d-1] ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal292=(Token)match(input,91,FOLLOW_91_in_unquotation2625); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal292_tree = (Object)adaptor.create(char_literal292);
					adaptor.addChild(root_0, char_literal292_tree);
					}

					UNQUOTE293=(Token)match(input,UNQUOTE,FOLLOW_UNQUOTE_in_unquotation2627); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE293_tree = (Object)adaptor.create(UNQUOTE293);
					adaptor.addChild(root_0, UNQUOTE293_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_unquotation2629);
					qqTemplate294=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate294.getTree());

					char_literal295=(Token)match(input,92,FOLLOW_92_in_unquotation2632); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal295_tree = (Object)adaptor.create(char_literal295);
					adaptor.addChild(root_0, char_literal295_tree);
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
	// R5RS.g3:401:1: qqTemplateOrSplice[int d] : ( ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d] | qqTemplate[d] );
	public final R5RSParser.qqTemplateOrSplice_return qqTemplateOrSplice(int d) throws RecognitionException {
		R5RSParser.qqTemplateOrSplice_return retval = new R5RSParser.qqTemplateOrSplice_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope splicingUnquotation296 =null;
		ParserRuleReturnScope qqTemplate297 =null;


		try {
			// R5RS.g3:402:3: ( ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d] | qqTemplate[d] )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==94) && (synpred18_R5RS())) {
				alt78=1;
			}
			else if ( (LA78_0==91) ) {
				int LA78_2 = input.LA(2);
				if ( (synpred18_R5RS()) ) {
					alt78=1;
				}
				else if ( (true) ) {
					alt78=2;
				}

			}
			else if ( ((LA78_0 >= AND && LA78_0 <= CHARACTER)||LA78_0==COND||LA78_0==DEFINE||LA78_0==DELAY||(LA78_0 >= DO && LA78_0 <= ELSE)||LA78_0==FALSE||LA78_0==IF||(LA78_0 >= LAMBDA && LA78_0 <= LETREC)||LA78_0==LETSTAR||(LA78_0 >= NUM_10 && LA78_0 <= NUM_8)||LA78_0==OR||LA78_0==QUASIQUOTE||LA78_0==QUOTE||LA78_0==SET||LA78_0==STRING||LA78_0==TRUE||(LA78_0 >= UNQUOTE && LA78_0 <= UNQUOTE_SPLICING)||(LA78_0 >= VARIABLE && LA78_0 <= 90)||LA78_0==93||(LA78_0 >= 96 && LA78_0 <= 97)) ) {
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
					// R5RS.g3:402:6: ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_splicingUnquotation_in_qqTemplateOrSplice2654);
					splicingUnquotation296=splicingUnquotation(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, splicingUnquotation296.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:403:31: qqTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_qqTemplate_in_qqTemplateOrSplice2687);
					qqTemplate297=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate297.getTree());

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
	// R5RS.g3:406:1: splicingUnquotation[int d] : ( ',@' qqTemplate[d-1] | '(' UNQUOTE_SPLICING qqTemplate[d-1] ')' );
	public final R5RSParser.splicingUnquotation_return splicingUnquotation(int d) throws RecognitionException {
		R5RSParser.splicingUnquotation_return retval = new R5RSParser.splicingUnquotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal298=null;
		Token char_literal300=null;
		Token UNQUOTE_SPLICING301=null;
		Token char_literal303=null;
		ParserRuleReturnScope qqTemplate299 =null;
		ParserRuleReturnScope qqTemplate302 =null;

		Object string_literal298_tree=null;
		Object char_literal300_tree=null;
		Object UNQUOTE_SPLICING301_tree=null;
		Object char_literal303_tree=null;

		try {
			// R5RS.g3:407:3: ( ',@' qqTemplate[d-1] | '(' UNQUOTE_SPLICING qqTemplate[d-1] ')' )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==94) ) {
				alt79=1;
			}
			else if ( (LA79_0==91) ) {
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
					// R5RS.g3:407:6: ',@' qqTemplate[d-1]
					{
					root_0 = (Object)adaptor.nil();


					string_literal298=(Token)match(input,94,FOLLOW_94_in_splicingUnquotation2703); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal298_tree = (Object)adaptor.create(string_literal298);
					adaptor.addChild(root_0, string_literal298_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_splicingUnquotation2705);
					qqTemplate299=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate299.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:408:6: '(' UNQUOTE_SPLICING qqTemplate[d-1] ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal300=(Token)match(input,91,FOLLOW_91_in_splicingUnquotation2713); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal300_tree = (Object)adaptor.create(char_literal300);
					adaptor.addChild(root_0, char_literal300_tree);
					}

					UNQUOTE_SPLICING301=(Token)match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_splicingUnquotation2715); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE_SPLICING301_tree = (Object)adaptor.create(UNQUOTE_SPLICING301);
					adaptor.addChild(root_0, UNQUOTE_SPLICING301_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_splicingUnquotation2717);
					qqTemplate302=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate302.getTree());

					char_literal303=(Token)match(input,92,FOLLOW_92_in_splicingUnquotation2720); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal303_tree = (Object)adaptor.create(char_literal303);
					adaptor.addChild(root_0, char_literal303_tree);
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
		// R5RS.g3:61:6: ( syntaxDefinition )
		// R5RS.g3:61:7: syntaxDefinition
		{
		pushFollow(FOLLOW_syntaxDefinition_in_synpred1_R5RS140);
		syntaxDefinition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_R5RS

	// $ANTLR start synpred2_R5RS
	public final void synpred2_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:62:6: ( definition )
		// R5RS.g3:62:7: definition
		{
		pushFollow(FOLLOW_definition_in_synpred2_R5RS165);
		definition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_R5RS

	// $ANTLR start synpred3_R5RS
	public final void synpred3_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:63:6: ( '(' BEGIN commandOrDefinition )
		// R5RS.g3:63:7: '(' BEGIN commandOrDefinition
		{
		match(input,91,FOLLOW_91_in_synpred3_R5RS196); if (state.failed) return;

		match(input,BEGIN,FOLLOW_BEGIN_in_synpred3_R5RS198); if (state.failed) return;

		pushFollow(FOLLOW_commandOrDefinition_in_synpred3_R5RS200);
		commandOrDefinition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_R5RS

	// $ANTLR start synpred4_R5RS
	public final void synpred4_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:72:5: ( simpleDefinition )
		// R5RS.g3:72:6: simpleDefinition
		{
		pushFollow(FOLLOW_simpleDefinition_in_synpred4_R5RS297);
		simpleDefinition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_R5RS

	// $ANTLR start synpred5_R5RS
	public final void synpred5_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:73:5: ( formalDefinition )
		// R5RS.g3:73:6: formalDefinition
		{
		pushFollow(FOLLOW_formalDefinition_in_synpred5_R5RS309);
		formalDefinition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_R5RS

	// $ANTLR start synpred6_R5RS
	public final void synpred6_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:172:6: ( variable )
		// R5RS.g3:172:7: variable
		{
		pushFollow(FOLLOW_variable_in_synpred6_R5RS940);
		variable();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_R5RS

	// $ANTLR start synpred7_R5RS
	public final void synpred7_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:173:6: ( literal )
		// R5RS.g3:173:7: literal
		{
		pushFollow(FOLLOW_literal_in_synpred7_R5RS961);
		literal();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_R5RS

	// $ANTLR start synpred8_R5RS
	public final void synpred8_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:174:6: ( lambdaExpression )
		// R5RS.g3:174:7: lambdaExpression
		{
		pushFollow(FOLLOW_lambdaExpression_in_synpred8_R5RS991);
		lambdaExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_R5RS

	// $ANTLR start synpred9_R5RS
	public final void synpred9_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:175:6: ( conditional )
		// R5RS.g3:175:7: conditional
		{
		pushFollow(FOLLOW_conditional_in_synpred9_R5RS1004);
		conditional();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred9_R5RS

	// $ANTLR start synpred10_R5RS
	public final void synpred10_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:176:6: ( assignment )
		// R5RS.g3:176:7: assignment
		{
		pushFollow(FOLLOW_assignment_in_synpred10_R5RS1022);
		assignment();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred10_R5RS

	// $ANTLR start synpred11_R5RS
	public final void synpred11_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:177:6: ( derivedExpression )
		// R5RS.g3:177:7: derivedExpression
		{
		pushFollow(FOLLOW_derivedExpression_in_synpred11_R5RS1041);
		derivedExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred11_R5RS

	// $ANTLR start synpred12_R5RS
	public final void synpred12_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:178:6: ( procedureCall )
		// R5RS.g3:178:7: procedureCall
		{
		pushFollow(FOLLOW_procedureCall_in_synpred12_R5RS1053);
		procedureCall();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred12_R5RS

	// $ANTLR start synpred13_R5RS
	public final void synpred13_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:179:6: ( macroUse )
		// R5RS.g3:179:7: macroUse
		{
		pushFollow(FOLLOW_macroUse_in_synpred13_R5RS1069);
		macroUse();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred13_R5RS

	// $ANTLR start synpred14_R5RS
	public final void synpred14_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:311:7: ( definition )
		// R5RS.g3:311:8: definition
		{
		pushFollow(FOLLOW_definition_in_synpred14_R5RS2058);
		definition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred14_R5RS

	// $ANTLR start synpred15_R5RS
	public final void synpred15_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:379:6: ( expression )
		// R5RS.g3:379:7: expression
		{
		pushFollow(FOLLOW_expression_in_synpred15_R5RS2393);
		expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred15_R5RS

	// $ANTLR start synpred16_R5RS
	public final void synpred16_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:380:6: ( '(' UNQUOTE )
		// R5RS.g3:380:7: '(' UNQUOTE
		{
		match(input,91,FOLLOW_91_in_synpred16_R5RS2406); if (state.failed) return;

		match(input,UNQUOTE,FOLLOW_UNQUOTE_in_synpred16_R5RS2408); if (state.failed) return;

		}

	}
	// $ANTLR end synpred16_R5RS

	// $ANTLR start synpred17_R5RS
	public final void synpred17_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:392:6: ( '(' QUASIQUOTE )
		// R5RS.g3:392:7: '(' QUASIQUOTE
		{
		match(input,91,FOLLOW_91_in_synpred17_R5RS2550); if (state.failed) return;

		match(input,QUASIQUOTE,FOLLOW_QUASIQUOTE_in_synpred17_R5RS2552); if (state.failed) return;

		}

	}
	// $ANTLR end synpred17_R5RS

	// $ANTLR start synpred18_R5RS
	public final void synpred18_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:402:6: ( '(' UNQUOTE_SPLICING )
		// R5RS.g3:402:7: '(' UNQUOTE_SPLICING
		{
		match(input,91,FOLLOW_91_in_synpred18_R5RS2648); if (state.failed) return;

		match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_synpred18_R5RS2650); if (state.failed) return;

		}

	}
	// $ANTLR end synpred18_R5RS

	// Delegated rules

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



	public static final BitSet FOLLOW_commandOrDefinition_in_parse122 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_EOF_in_parse125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntaxDefinition_in_commandOrDefinition157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_commandOrDefinition188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_commandOrDefinition204 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BEGIN_in_commandOrDefinition207 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_commandOrDefinition_in_commandOrDefinition213 = new BitSet(new long[]{0x0000F00044000100L,0x000000031A004100L});
	public static final BitSet FOLLOW_92_in_commandOrDefinition216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commandOrDefinition258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_syntaxDefinition272 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DEFINE_SYNTAX_in_syntaxDefinition275 = new BitSet(new long[]{0x050200BA0E1500F0L,0x0000000002180008L});
	public static final BitSet FOLLOW_keyword_in_syntaxDefinition278 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_transformerSpec_in_syntaxDefinition280 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_syntaxDefinition282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDefinition_in_definition302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalDefinition_in_definition314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_definition320 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BEGIN_in_definition323 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_definition_in_definition326 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_92_in_definition329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_simpleDefinition344 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DEFINE_in_simpleDefinition347 = new BitSet(new long[]{0x0000000004000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_variable_in_simpleDefinition350 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_expression_in_simpleDefinition352 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_simpleDefinition354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_formalDefinition368 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DEFINE_in_formalDefinition370 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_formalDefDecl_in_formalDefinition372 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_body_in_formalDefinition374 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_formalDefinition376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_formalDefDecl399 = new BitSet(new long[]{0x0000000004000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_variable_in_formalDefDecl402 = new BitSet(new long[]{0x0000000004000000L,0x0000000092000000L});
	public static final BitSet FOLLOW_variable_in_formalDefDecl404 = new BitSet(new long[]{0x0000000004000000L,0x0000000092000000L});
	public static final BitSet FOLLOW_95_in_formalDefDecl408 = new BitSet(new long[]{0x0000000004000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_variable_in_formalDefDecl410 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_formalDefDecl414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_keyword429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_transformerSpec443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_SYNTAX_RULES_in_transformerSpec446 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_transformerSpec449 = new BitSet(new long[]{0x050200BA0E1500F0L,0x0000000012180008L});
	public static final BitSet FOLLOW_identifier_in_transformerSpec452 = new BitSet(new long[]{0x050200BA0E1500F0L,0x0000000012180008L});
	public static final BitSet FOLLOW_92_in_transformerSpec455 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_syntaxRule_in_transformerSpec458 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_92_in_transformerSpec461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_syntaxRule476 = new BitSet(new long[]{0x0502F0BA4A1501F0L,0x000000000E184108L});
	public static final BitSet FOLLOW_pattern_in_syntaxRule478 = new BitSet(new long[]{0x0502F0BA4A1501F0L,0x000000000E184108L});
	public static final BitSet FOLLOW_template_in_syntaxRule480 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_syntaxRule482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternIdentifier_in_pattern506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_pattern513 = new BitSet(new long[]{0x0502F0BA4A1501F0L,0x000000001E184108L});
	public static final BitSet FOLLOW_pattern_in_pattern516 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000009E184108L});
	public static final BitSet FOLLOW_95_in_pattern520 = new BitSet(new long[]{0x0502F0BA4A1501F0L,0x000000000E184108L});
	public static final BitSet FOLLOW_pattern_in_pattern522 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_ELLIPSIS_in_pattern526 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_pattern533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_pattern540 = new BitSet(new long[]{0x0502F0BA4A1501F0L,0x000000001E184108L});
	public static final BitSet FOLLOW_pattern_in_pattern543 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000001E184108L});
	public static final BitSet FOLLOW_ELLIPSIS_in_pattern546 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_pattern552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternDatum_in_pattern559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntacticKeyword_in_patternIdentifier573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_patternIdentifier580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_patternDatum594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_patternDatum601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_patternDatum608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_patternDatum615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternIdentifier_in_template629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_template636 = new BitSet(new long[]{0x0502F0BA4A1501F0L,0x000000001E184108L});
	public static final BitSet FOLLOW_templateElement_in_template639 = new BitSet(new long[]{0x0502F0BA4A1501F0L,0x000000009E184108L});
	public static final BitSet FOLLOW_95_in_template643 = new BitSet(new long[]{0x0502F0BA4A1501F0L,0x000000000E184108L});
	public static final BitSet FOLLOW_templateElement_in_template645 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_template651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_template658 = new BitSet(new long[]{0x0502F0BA4A1501F0L,0x000000001E184108L});
	public static final BitSet FOLLOW_templateElement_in_template660 = new BitSet(new long[]{0x0502F0BA4A1501F0L,0x000000001E184108L});
	public static final BitSet FOLLOW_92_in_template663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_templateDatum_in_template670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_template_in_templateElement684 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_templateElement686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternDatum_in_templateDatum701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_command715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntacticKeyword_in_identifier737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_identifier752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionKeyword_in_syntacticKeyword774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_syntacticKeyword781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARROW_in_syntacticKeyword788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFINE_in_syntacticKeyword795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNQUOTE_in_syntacticKeyword802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_syntacticKeyword809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_expression953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_expression975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lambdaExpression_in_expression996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_expression1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_expression1033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derivedExpression_in_expression1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_expression1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroUse_in_expression1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroBlock_in_expression1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_variable1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_variable1136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quotation_in_literal1151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selfEvaluating_in_literal1166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_quotation1180 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000036E184108L});
	public static final BitSet FOLLOW_datum_in_quotation1182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_quotation1189 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_QUOTE_in_quotation1191 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000036E184108L});
	public static final BitSet FOLLOW_datum_in_quotation1193 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_quotation1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_selfEvaluating1209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_selfEvaluating1216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_selfEvaluating1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_selfEvaluating1230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_lambdaExpression1244 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LAMBDA_in_lambdaExpression1246 = new BitSet(new long[]{0x0000000004000000L,0x000000000A000000L});
	public static final BitSet FOLLOW_formals_in_lambdaExpression1248 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_body_in_lambdaExpression1250 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_lambdaExpression1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_formals1266 = new BitSet(new long[]{0x0000000004000000L,0x0000000012000000L});
	public static final BitSet FOLLOW_variable_in_formals1269 = new BitSet(new long[]{0x0000000004000000L,0x0000000092000000L});
	public static final BitSet FOLLOW_95_in_formals1273 = new BitSet(new long[]{0x0000000004000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_variable_in_formals1275 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_formals1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_formals1288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_conditional1302 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_IF_in_conditional1304 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_test_in_conditional1306 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_consequent_in_conditional1308 = new BitSet(new long[]{0x0000F00044000100L,0x000000031A004100L});
	public static final BitSet FOLLOW_alternate_in_conditional1310 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_conditional1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_test1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_consequent1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_alternate1359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_assignment1373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_assignment1375 = new BitSet(new long[]{0x0000000004000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_variable_in_assignment1377 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_expression_in_assignment1379 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_assignment1381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quasiquotation_in_derivedExpression1395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_derivedExpression1402 = new BitSet(new long[]{0x000200B0021100D0L});
	public static final BitSet FOLLOW_COND_in_derivedExpression1406 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_derivedExpression1410 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_ELSE_in_derivedExpression1412 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1414 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_derivedExpression1416 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_condClause_in_derivedExpression1436 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_91_in_derivedExpression1440 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_ELSE_in_derivedExpression1442 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1444 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_derivedExpression1446 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_CASE_in_derivedExpression1480 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_expression_in_derivedExpression1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_derivedExpression1486 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_ELSE_in_derivedExpression1488 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1490 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_derivedExpression1492 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_caseClause_in_derivedExpression1523 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_91_in_derivedExpression1527 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_ELSE_in_derivedExpression1529 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1531 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_derivedExpression1533 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_AND_in_derivedExpression1578 = new BitSet(new long[]{0x0000F00044000100L,0x000000031A004100L});
	public static final BitSet FOLLOW_test_in_derivedExpression1580 = new BitSet(new long[]{0x0000F00044000100L,0x000000031A004100L});
	public static final BitSet FOLLOW_OR_in_derivedExpression1594 = new BitSet(new long[]{0x0000F00044000100L,0x000000031A004100L});
	public static final BitSet FOLLOW_test_in_derivedExpression1596 = new BitSet(new long[]{0x0000F00044000100L,0x000000031A004100L});
	public static final BitSet FOLLOW_LET_in_derivedExpression1610 = new BitSet(new long[]{0x0000000004000000L,0x000000000A000000L});
	public static final BitSet FOLLOW_variable_in_derivedExpression1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_derivedExpression1615 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_bindingSpec_in_derivedExpression1617 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_92_in_derivedExpression1620 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_body_in_derivedExpression1622 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LETSTAR_in_derivedExpression1635 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_derivedExpression1637 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_bindingSpec_in_derivedExpression1639 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_92_in_derivedExpression1642 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_body_in_derivedExpression1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LETREC_in_derivedExpression1657 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_derivedExpression1659 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_bindingSpec_in_derivedExpression1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_92_in_derivedExpression1664 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_body_in_derivedExpression1666 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_BEGIN_in_derivedExpression1679 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1681 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_DO_in_derivedExpression1694 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_derivedExpression1696 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_iterationSpec_in_derivedExpression1698 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_92_in_derivedExpression1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_derivedExpression1703 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_test_in_derivedExpression1705 = new BitSet(new long[]{0x0000F00044000100L,0x000000031A004100L});
	public static final BitSet FOLLOW_doResult_in_derivedExpression1707 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_derivedExpression1710 = new BitSet(new long[]{0x0000F00044000100L,0x000000031A004100L});
	public static final BitSet FOLLOW_command_in_derivedExpression1712 = new BitSet(new long[]{0x0000F00044000100L,0x000000031A004100L});
	public static final BitSet FOLLOW_DELAY_in_derivedExpression1726 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_expression_in_derivedExpression1728 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_derivedExpression1747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_condClause1761 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_test_in_condClause1763 = new BitSet(new long[]{0x0000F00044000120L,0x000000031A004100L});
	public static final BitSet FOLLOW_sequence_in_condClause1766 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_ARROW_in_condClause1770 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_recipient_in_condClause1772 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_condClause1776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_recipient1790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_caseClause1804 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_caseClause1806 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000037E184108L});
	public static final BitSet FOLLOW_datum_in_caseClause1808 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000037E184108L});
	public static final BitSet FOLLOW_92_in_caseClause1811 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_sequence_in_caseClause1813 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_caseClause1815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_bindingSpec1829 = new BitSet(new long[]{0x0000000004000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_variable_in_bindingSpec1831 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_expression_in_bindingSpec1833 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_bindingSpec1835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_iterationSpec1849 = new BitSet(new long[]{0x0000000004000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_variable_in_iterationSpec1851 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_init_in_iterationSpec1853 = new BitSet(new long[]{0x0000F00044000100L,0x000000031A004100L});
	public static final BitSet FOLLOW_step_in_iterationSpec1855 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_iterationSpec1858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_init1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_step1886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequence_in_doResult1900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_procedureCall1914 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_operator_in_procedureCall1916 = new BitSet(new long[]{0x0000F00044000100L,0x000000031A004100L});
	public static final BitSet FOLLOW_operand_in_procedureCall1918 = new BitSet(new long[]{0x0000F00044000100L,0x000000031A004100L});
	public static final BitSet FOLLOW_92_in_procedureCall1921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_operator1946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_operand1968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_macroUse1982 = new BitSet(new long[]{0x050200BA0E1500F0L,0x0000000002180008L});
	public static final BitSet FOLLOW_keyword_in_macroUse1984 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000037E184108L});
	public static final BitSet FOLLOW_datum_in_macroUse1986 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000037E184108L});
	public static final BitSet FOLLOW_92_in_macroUse1989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_macroBlock2003 = new BitSet(new long[]{0x0000024000000000L});
	public static final BitSet FOLLOW_set_in_macroBlock2005 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_macroBlock2013 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_syntaxSpec_in_macroBlock2015 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_92_in_macroBlock2018 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_body_in_macroBlock2020 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_macroBlock2022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_syntaxSpec2036 = new BitSet(new long[]{0x050200BA0E1500F0L,0x0000000002180008L});
	public static final BitSet FOLLOW_keyword_in_syntaxSpec2038 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_transformerSpec_in_syntaxSpec2040 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_syntaxSpec2042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_body2062 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_sequence_in_body2066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_sequence2084 = new BitSet(new long[]{0x0000F00044000102L,0x000000030A004100L});
	public static final BitSet FOLLOW_simpleDatum_in_datum2099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundDatum_in_datum2106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_simpleDatum2120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_simpleDatum2127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_simpleDatum2134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_simpleDatum2141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_simpleDatum2148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_compoundDatum2162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vector_in_compoundDatum2177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_list2191 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000037E184108L});
	public static final BitSet FOLLOW_datum_in_list2194 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x00000003FE184108L});
	public static final BitSet FOLLOW_95_in_list2198 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000036E184108L});
	public static final BitSet FOLLOW_datum_in_list2200 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_list2206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abbreviation_in_list2213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abbrevPrefix_in_abbreviation2227 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000036E184108L});
	public static final BitSet FOLLOW_datum_in_abbreviation2229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_vector2269 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000037E184108L});
	public static final BitSet FOLLOW_datum_in_vector2271 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000037E184108L});
	public static final BitSet FOLLOW_92_in_vector2274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quasiquotationD_in_quasiquotation2344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_quasiquotationD2360 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000032E184108L});
	public static final BitSet FOLLOW_qqTemplate_in_quasiquotationD2362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_quasiquotationD2370 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_QUASIQUOTE_in_quasiquotationD2372 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000032E184108L});
	public static final BitSet FOLLOW_qqTemplate_in_quasiquotationD2374 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_quasiquotationD2377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_qqTemplate2398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unquotation_in_qqTemplate2412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDatum_in_qqTemplate2436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vectorQQTemplate_in_qqTemplate2459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listQQTemplate_in_qqTemplate2483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_vectorQQTemplate2499 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000037E184108L});
	public static final BitSet FOLLOW_qqTemplateOrSplice_in_vectorQQTemplate2501 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000037E184108L});
	public static final BitSet FOLLOW_92_in_vectorQQTemplate2505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_listQQTemplate2539 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000032E184108L});
	public static final BitSet FOLLOW_qqTemplate_in_listQQTemplate2541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quasiquotationD_in_listQQTemplate2556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_listQQTemplate2583 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000037E184108L});
	public static final BitSet FOLLOW_qqTemplateOrSplice_in_listQQTemplate2586 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x00000003FE184108L});
	public static final BitSet FOLLOW_95_in_listQQTemplate2591 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000032E184108L});
	public static final BitSet FOLLOW_qqTemplate_in_listQQTemplate2593 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_listQQTemplate2600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_unquotation2615 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000032E184108L});
	public static final BitSet FOLLOW_qqTemplate_in_unquotation2617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_unquotation2625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_UNQUOTE_in_unquotation2627 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000032E184108L});
	public static final BitSet FOLLOW_qqTemplate_in_unquotation2629 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_unquotation2632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_splicingUnquotation_in_qqTemplateOrSplice2654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qqTemplate_in_qqTemplateOrSplice2687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_splicingUnquotation2703 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000032E184108L});
	public static final BitSet FOLLOW_qqTemplate_in_splicingUnquotation2705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_splicingUnquotation2713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_splicingUnquotation2715 = new BitSet(new long[]{0x0502F0BA4E1501F0L,0x000000032E184108L});
	public static final BitSet FOLLOW_qqTemplate_in_splicingUnquotation2717 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_splicingUnquotation2720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntaxDefinition_in_synpred1_R5RS140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_synpred2_R5RS165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_synpred3_R5RS196 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BEGIN_in_synpred3_R5RS198 = new BitSet(new long[]{0x0000F00044000100L,0x000000030A004100L});
	public static final BitSet FOLLOW_commandOrDefinition_in_synpred3_R5RS200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDefinition_in_synpred4_R5RS297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalDefinition_in_synpred5_R5RS309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_synpred6_R5RS940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_synpred7_R5RS961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lambdaExpression_in_synpred8_R5RS991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_synpred9_R5RS1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_synpred10_R5RS1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derivedExpression_in_synpred11_R5RS1041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_synpred12_R5RS1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroUse_in_synpred13_R5RS1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_synpred14_R5RS2058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred15_R5RS2393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_synpred16_R5RS2406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_UNQUOTE_in_synpred16_R5RS2408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_synpred17_R5RS2550 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_QUASIQUOTE_in_synpred17_R5RS2552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_synpred18_R5RS2648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_synpred18_R5RS2650 = new BitSet(new long[]{0x0000000000000002L});
}
