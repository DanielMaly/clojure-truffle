// $ANTLR 3.5.2 R5RS.g3 2017-01-07 14:50:55

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
		"CHARACTER", "CHARACTER_NAME", "COMMENT", "COMPLEX_10", "COMPLEX_16", 
		"COMPLEX_2", "COMPLEX_8", "COND", "DECIMAL_10", "DEFINE", "DEFINE_SYNTAX", 
		"DELAY", "DIGIT", "DIGIT_16", "DIGIT_2", "DIGIT_8", "DO", "ELLIPSIS", 
		"ELSE", "EXACTNESS", "EXPONENT_MARKER", "FALSE", "IF", "INITIAL", "LAMBDA", 
		"LET", "LETREC", "LETREC_SYNTAX", "LETSTAR", "LETTER", "LET_SYNTAX", "NUM_10", 
		"NUM_16", "NUM_2", "NUM_8", "OR", "PECULIAR_IDENTIFIER", "PREFIX_10", 
		"PREFIX_16", "PREFIX_2", "PREFIX_8", "QUASIQUOTE", "QUOTE", "RADIX_10", 
		"RADIX_16", "RADIX_2", "RADIX_8", "REAL_10", "REAL_16", "REAL_2", "REAL_8", 
		"SET", "SIGN", "SPACE", "SPECIAL_INITIAL", "SPECIAL_SUBSEQUENT", "STRING", 
		"STRING_ELEMENT", "SUBSEQUENT", "SUFFIX", "SYNTAX_RULES", "TRUE", "UINTEGER_10", 
		"UINTEGER_16", "UINTEGER_2", "UINTEGER_8", "UNQUOTE", "UNQUOTE_SPLICING", 
		"UREAL_10", "UREAL_16", "UREAL_2", "UREAL_8", "VARIABLE", "'#('", "'('", 
		"')'", "','", "',@'", "'.'", "'\\''", "'`'"
	};
	public static final int EOF=-1;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int AND=4;
	public static final int ARROW=5;
	public static final int BEGIN=6;
	public static final int CASE=7;
	public static final int CHARACTER=8;
	public static final int CHARACTER_NAME=9;
	public static final int COMMENT=10;
	public static final int COMPLEX_10=11;
	public static final int COMPLEX_16=12;
	public static final int COMPLEX_2=13;
	public static final int COMPLEX_8=14;
	public static final int COND=15;
	public static final int DECIMAL_10=16;
	public static final int DEFINE=17;
	public static final int DEFINE_SYNTAX=18;
	public static final int DELAY=19;
	public static final int DIGIT=20;
	public static final int DIGIT_16=21;
	public static final int DIGIT_2=22;
	public static final int DIGIT_8=23;
	public static final int DO=24;
	public static final int ELLIPSIS=25;
	public static final int ELSE=26;
	public static final int EXACTNESS=27;
	public static final int EXPONENT_MARKER=28;
	public static final int FALSE=29;
	public static final int IF=30;
	public static final int INITIAL=31;
	public static final int LAMBDA=32;
	public static final int LET=33;
	public static final int LETREC=34;
	public static final int LETREC_SYNTAX=35;
	public static final int LETSTAR=36;
	public static final int LETTER=37;
	public static final int LET_SYNTAX=38;
	public static final int NUM_10=39;
	public static final int NUM_16=40;
	public static final int NUM_2=41;
	public static final int NUM_8=42;
	public static final int OR=43;
	public static final int PECULIAR_IDENTIFIER=44;
	public static final int PREFIX_10=45;
	public static final int PREFIX_16=46;
	public static final int PREFIX_2=47;
	public static final int PREFIX_8=48;
	public static final int QUASIQUOTE=49;
	public static final int QUOTE=50;
	public static final int RADIX_10=51;
	public static final int RADIX_16=52;
	public static final int RADIX_2=53;
	public static final int RADIX_8=54;
	public static final int REAL_10=55;
	public static final int REAL_16=56;
	public static final int REAL_2=57;
	public static final int REAL_8=58;
	public static final int SET=59;
	public static final int SIGN=60;
	public static final int SPACE=61;
	public static final int SPECIAL_INITIAL=62;
	public static final int SPECIAL_SUBSEQUENT=63;
	public static final int STRING=64;
	public static final int STRING_ELEMENT=65;
	public static final int SUBSEQUENT=66;
	public static final int SUFFIX=67;
	public static final int SYNTAX_RULES=68;
	public static final int TRUE=69;
	public static final int UINTEGER_10=70;
	public static final int UINTEGER_16=71;
	public static final int UINTEGER_2=72;
	public static final int UINTEGER_8=73;
	public static final int UNQUOTE=74;
	public static final int UNQUOTE_SPLICING=75;
	public static final int UREAL_10=76;
	public static final int UREAL_16=77;
	public static final int UREAL_2=78;
	public static final int UREAL_8=79;
	public static final int VARIABLE=80;

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


	static class BeginCommandOrDefinitionNode extends CommonTree {public BeginCommandOrDefinitionNode(Token t) {super(t);}}
	static class DefinitionNode extends CommonTree {public DefinitionNode(Token t) {super(t);}}
	static class DefFormalsNode extends CommonTree {public DefFormalsNode(Token t) {super(t);}}
	static class VariableNode extends CommonTree {public VariableNode(Token t) {super(t);}}
	static class EllipsisNode extends CommonTree {public EllipsisNode(Token t) {super(t);}}


	public static class parse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parse"
	// R5RS.g3:45:1: parse : ( commandOrDefinition )* EOF ;
	public final R5RSParser.parse_return parse() throws RecognitionException {
		R5RSParser.parse_return retval = new R5RSParser.parse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope commandOrDefinition1 =null;

		Object EOF2_tree=null;

		try {
			// R5RS.g3:46:3: ( ( commandOrDefinition )* EOF )
			// R5RS.g3:46:6: ( commandOrDefinition )* EOF
			{
			root_0 = (Object)adaptor.nil();


			// R5RS.g3:46:6: ( commandOrDefinition )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CHARACTER||LA1_0==ELLIPSIS||LA1_0==FALSE||(LA1_0 >= NUM_10 && LA1_0 <= NUM_8)||LA1_0==STRING||LA1_0==TRUE||LA1_0==VARIABLE||LA1_0==82||(LA1_0 >= 87 && LA1_0 <= 88)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// R5RS.g3:46:6: commandOrDefinition
					{
					pushFollow(FOLLOW_commandOrDefinition_in_parse52);
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

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse55); if (state.failed) return retval;
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
	// R5RS.g3:49:1: commandOrDefinition : ( ( syntaxDefinition )=> syntaxDefinition | ( definition )=> definition | ( '(' BEGIN commandOrDefinition )=> '(' ! BEGIN ^ ( commandOrDefinition )+ ')' !| command );
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
			// R5RS.g3:50:3: ( ( syntaxDefinition )=> syntaxDefinition | ( definition )=> definition | ( '(' BEGIN commandOrDefinition )=> '(' ! BEGIN ^ ( commandOrDefinition )+ ')' !| command )
			int alt3=4;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==82) ) {
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
			else if ( (LA3_0==CHARACTER||LA3_0==ELLIPSIS||LA3_0==FALSE||(LA3_0 >= NUM_10 && LA3_0 <= NUM_8)||LA3_0==STRING||LA3_0==TRUE||LA3_0==VARIABLE||(LA3_0 >= 87 && LA3_0 <= 88)) ) {
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
					// R5RS.g3:50:6: ( syntaxDefinition )=> syntaxDefinition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_syntaxDefinition_in_commandOrDefinition87);
					syntaxDefinition3=syntaxDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntaxDefinition3.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:51:6: ( definition )=> definition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_definition_in_commandOrDefinition118);
					definition4=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition4.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:52:6: ( '(' BEGIN commandOrDefinition )=> '(' ! BEGIN ^ ( commandOrDefinition )+ ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal5=(Token)match(input,82,FOLLOW_82_in_commandOrDefinition134); if (state.failed) return retval;
					BEGIN6=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_commandOrDefinition137); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BEGIN6_tree = new BeginCommandOrDefinitionNode(BEGIN6) ;
					root_0 = (Object)adaptor.becomeRoot(BEGIN6_tree, root_0);
					}

					// R5RS.g3:52:82: ( commandOrDefinition )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==CHARACTER||LA2_0==ELLIPSIS||LA2_0==FALSE||(LA2_0 >= NUM_10 && LA2_0 <= NUM_8)||LA2_0==STRING||LA2_0==TRUE||LA2_0==VARIABLE||LA2_0==82||(LA2_0 >= 87 && LA2_0 <= 88)) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// R5RS.g3:52:82: commandOrDefinition
							{
							pushFollow(FOLLOW_commandOrDefinition_in_commandOrDefinition143);
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

					char_literal8=(Token)match(input,83,FOLLOW_83_in_commandOrDefinition146); if (state.failed) return retval;
					}
					break;
				case 4 :
					// R5RS.g3:53:40: command
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_in_commandOrDefinition188);
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
	// R5RS.g3:56:1: syntaxDefinition : '(' ! DEFINE_SYNTAX ^ keyword transformerSpec ')' !;
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
			// R5RS.g3:57:3: ( '(' ! DEFINE_SYNTAX ^ keyword transformerSpec ')' !)
			// R5RS.g3:57:6: '(' ! DEFINE_SYNTAX ^ keyword transformerSpec ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal10=(Token)match(input,82,FOLLOW_82_in_syntaxDefinition202); if (state.failed) return retval;
			DEFINE_SYNTAX11=(Token)match(input,DEFINE_SYNTAX,FOLLOW_DEFINE_SYNTAX_in_syntaxDefinition205); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEFINE_SYNTAX11_tree = (Object)adaptor.create(DEFINE_SYNTAX11);
			root_0 = (Object)adaptor.becomeRoot(DEFINE_SYNTAX11_tree, root_0);
			}

			pushFollow(FOLLOW_keyword_in_syntaxDefinition208);
			keyword12=keyword();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword12.getTree());

			pushFollow(FOLLOW_transformerSpec_in_syntaxDefinition210);
			transformerSpec13=transformerSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, transformerSpec13.getTree());

			char_literal14=(Token)match(input,83,FOLLOW_83_in_syntaxDefinition212); if (state.failed) return retval;
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
	// R5RS.g3:60:1: definition : ( '(' ! DEFINE ^ ( variable expression ')' !| '(' ! variable defFormals ')' ! body ')' !) | '(' ! BEGIN ^ ( definition )* ')' !);
	public final R5RSParser.definition_return definition() throws RecognitionException {
		R5RSParser.definition_return retval = new R5RSParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal15=null;
		Token DEFINE16=null;
		Token char_literal19=null;
		Token char_literal20=null;
		Token char_literal23=null;
		Token char_literal25=null;
		Token char_literal26=null;
		Token BEGIN27=null;
		Token char_literal29=null;
		ParserRuleReturnScope variable17 =null;
		ParserRuleReturnScope expression18 =null;
		ParserRuleReturnScope variable21 =null;
		ParserRuleReturnScope defFormals22 =null;
		ParserRuleReturnScope body24 =null;
		ParserRuleReturnScope definition28 =null;

		Object char_literal15_tree=null;
		Object DEFINE16_tree=null;
		Object char_literal19_tree=null;
		Object char_literal20_tree=null;
		Object char_literal23_tree=null;
		Object char_literal25_tree=null;
		Object char_literal26_tree=null;
		Object BEGIN27_tree=null;
		Object char_literal29_tree=null;

		try {
			// R5RS.g3:61:3: ( '(' ! DEFINE ^ ( variable expression ')' !| '(' ! variable defFormals ')' ! body ')' !) | '(' ! BEGIN ^ ( definition )* ')' !)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==82) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==DEFINE) ) {
					alt6=1;
				}
				else if ( (LA6_1==BEGIN) ) {
					alt6=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// R5RS.g3:61:6: '(' ! DEFINE ^ ( variable expression ')' !| '(' ! variable defFormals ')' ! body ')' !)
					{
					root_0 = (Object)adaptor.nil();


					char_literal15=(Token)match(input,82,FOLLOW_82_in_definition227); if (state.failed) return retval;
					DEFINE16=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_definition230); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DEFINE16_tree = new DefinitionNode(DEFINE16) ;
					root_0 = (Object)adaptor.becomeRoot(DEFINE16_tree, root_0);
					}

					// R5RS.g3:61:35: ( variable expression ')' !| '(' ! variable defFormals ')' ! body ')' !)
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==ELLIPSIS||LA4_0==VARIABLE) ) {
						alt4=1;
					}
					else if ( (LA4_0==82) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// R5RS.g3:61:37: variable expression ')' !
							{
							pushFollow(FOLLOW_variable_in_definition238);
							variable17=variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variable17.getTree());

							pushFollow(FOLLOW_expression_in_definition240);
							expression18=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression18.getTree());

							char_literal19=(Token)match(input,83,FOLLOW_83_in_definition242); if (state.failed) return retval;
							}
							break;
						case 2 :
							// R5RS.g3:62:19: '(' ! variable defFormals ')' ! body ')' !
							{
							char_literal20=(Token)match(input,82,FOLLOW_82_in_definition263); if (state.failed) return retval;
							pushFollow(FOLLOW_variable_in_definition266);
							variable21=variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variable21.getTree());

							pushFollow(FOLLOW_defFormals_in_definition268);
							defFormals22=defFormals();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, defFormals22.getTree());

							char_literal23=(Token)match(input,83,FOLLOW_83_in_definition270); if (state.failed) return retval;
							pushFollow(FOLLOW_body_in_definition273);
							body24=body();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, body24.getTree());

							char_literal25=(Token)match(input,83,FOLLOW_83_in_definition275); if (state.failed) return retval;
							}
							break;

					}

					}
					break;
				case 2 :
					// R5RS.g3:64:6: '(' ! BEGIN ^ ( definition )* ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal26=(Token)match(input,82,FOLLOW_82_in_definition301); if (state.failed) return retval;
					BEGIN27=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_definition304); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BEGIN27_tree = (Object)adaptor.create(BEGIN27);
					root_0 = (Object)adaptor.becomeRoot(BEGIN27_tree, root_0);
					}

					// R5RS.g3:64:18: ( definition )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==82) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// R5RS.g3:64:18: definition
							{
							pushFollow(FOLLOW_definition_in_definition307);
							definition28=definition();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, definition28.getTree());

							}
							break;

						default :
							break loop5;
						}
					}

					char_literal29=(Token)match(input,83,FOLLOW_83_in_definition310); if (state.failed) return retval;
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


	public static class defFormals_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defFormals"
	// R5RS.g3:67:1: defFormals : ( variable )* ( '.' variable )? ;
	public final R5RSParser.defFormals_return defFormals() throws RecognitionException {
		R5RSParser.defFormals_return retval = new R5RSParser.defFormals_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal31=null;
		ParserRuleReturnScope variable30 =null;
		ParserRuleReturnScope variable32 =null;

		Object char_literal31_tree=null;

		try {
			// R5RS.g3:68:3: ( ( variable )* ( '.' variable )? )
			// R5RS.g3:68:6: ( variable )* ( '.' variable )?
			{
			root_0 = (Object)adaptor.nil();


			// R5RS.g3:68:6: ( variable )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==ELLIPSIS||LA7_0==VARIABLE) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// R5RS.g3:68:6: variable
					{
					pushFollow(FOLLOW_variable_in_defFormals325);
					variable30=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable30.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			// R5RS.g3:68:16: ( '.' variable )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==86) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// R5RS.g3:68:17: '.' variable
					{
					char_literal31=(Token)match(input,86,FOLLOW_86_in_defFormals329); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal31_tree = (Object)adaptor.create(char_literal31);
					adaptor.addChild(root_0, char_literal31_tree);
					}

					pushFollow(FOLLOW_variable_in_defFormals331);
					variable32=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable32.getTree());

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
	// $ANTLR end "defFormals"


	public static class keyword_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "keyword"
	// R5RS.g3:71:1: keyword : identifier ;
	public final R5RSParser.keyword_return keyword() throws RecognitionException {
		R5RSParser.keyword_return retval = new R5RSParser.keyword_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope identifier33 =null;


		try {
			// R5RS.g3:72:3: ( identifier )
			// R5RS.g3:72:6: identifier
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_keyword347);
			identifier33=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier33.getTree());

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
	// R5RS.g3:75:1: transformerSpec : '(' SYNTAX_RULES '(' ( identifier )* ')' ( syntaxRule )* ')' ;
	public final R5RSParser.transformerSpec_return transformerSpec() throws RecognitionException {
		R5RSParser.transformerSpec_return retval = new R5RSParser.transformerSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal34=null;
		Token SYNTAX_RULES35=null;
		Token char_literal36=null;
		Token char_literal38=null;
		Token char_literal40=null;
		ParserRuleReturnScope identifier37 =null;
		ParserRuleReturnScope syntaxRule39 =null;

		Object char_literal34_tree=null;
		Object SYNTAX_RULES35_tree=null;
		Object char_literal36_tree=null;
		Object char_literal38_tree=null;
		Object char_literal40_tree=null;

		try {
			// R5RS.g3:76:3: ( '(' SYNTAX_RULES '(' ( identifier )* ')' ( syntaxRule )* ')' )
			// R5RS.g3:76:6: '(' SYNTAX_RULES '(' ( identifier )* ')' ( syntaxRule )* ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal34=(Token)match(input,82,FOLLOW_82_in_transformerSpec361); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal34_tree = (Object)adaptor.create(char_literal34);
			adaptor.addChild(root_0, char_literal34_tree);
			}

			SYNTAX_RULES35=(Token)match(input,SYNTAX_RULES,FOLLOW_SYNTAX_RULES_in_transformerSpec363); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SYNTAX_RULES35_tree = (Object)adaptor.create(SYNTAX_RULES35);
			adaptor.addChild(root_0, SYNTAX_RULES35_tree);
			}

			char_literal36=(Token)match(input,82,FOLLOW_82_in_transformerSpec365); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal36_tree = (Object)adaptor.create(char_literal36);
			adaptor.addChild(root_0, char_literal36_tree);
			}

			// R5RS.g3:76:27: ( identifier )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= AND && LA9_0 <= CASE)||LA9_0==COND||LA9_0==DEFINE||LA9_0==DELAY||(LA9_0 >= DO && LA9_0 <= ELSE)||LA9_0==IF||(LA9_0 >= LAMBDA && LA9_0 <= LETREC)||LA9_0==LETSTAR||LA9_0==OR||(LA9_0 >= QUASIQUOTE && LA9_0 <= QUOTE)||LA9_0==SET||(LA9_0 >= UNQUOTE && LA9_0 <= UNQUOTE_SPLICING)||LA9_0==VARIABLE) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// R5RS.g3:76:27: identifier
					{
					pushFollow(FOLLOW_identifier_in_transformerSpec367);
					identifier37=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier37.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			char_literal38=(Token)match(input,83,FOLLOW_83_in_transformerSpec370); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal38_tree = (Object)adaptor.create(char_literal38);
			adaptor.addChild(root_0, char_literal38_tree);
			}

			// R5RS.g3:76:43: ( syntaxRule )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==82) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// R5RS.g3:76:43: syntaxRule
					{
					pushFollow(FOLLOW_syntaxRule_in_transformerSpec372);
					syntaxRule39=syntaxRule();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntaxRule39.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			char_literal40=(Token)match(input,83,FOLLOW_83_in_transformerSpec375); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal40_tree = (Object)adaptor.create(char_literal40);
			adaptor.addChild(root_0, char_literal40_tree);
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
	// $ANTLR end "transformerSpec"


	public static class syntaxRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "syntaxRule"
	// R5RS.g3:79:1: syntaxRule : '(' pattern template ')' ;
	public final R5RSParser.syntaxRule_return syntaxRule() throws RecognitionException {
		R5RSParser.syntaxRule_return retval = new R5RSParser.syntaxRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal41=null;
		Token char_literal44=null;
		ParserRuleReturnScope pattern42 =null;
		ParserRuleReturnScope template43 =null;

		Object char_literal41_tree=null;
		Object char_literal44_tree=null;

		try {
			// R5RS.g3:80:3: ( '(' pattern template ')' )
			// R5RS.g3:80:6: '(' pattern template ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal41=(Token)match(input,82,FOLLOW_82_in_syntaxRule389); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal41_tree = (Object)adaptor.create(char_literal41);
			adaptor.addChild(root_0, char_literal41_tree);
			}

			pushFollow(FOLLOW_pattern_in_syntaxRule391);
			pattern42=pattern();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern42.getTree());

			pushFollow(FOLLOW_template_in_syntaxRule393);
			template43=template();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, template43.getTree());

			char_literal44=(Token)match(input,83,FOLLOW_83_in_syntaxRule395); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal44_tree = (Object)adaptor.create(char_literal44);
			adaptor.addChild(root_0, char_literal44_tree);
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
	// R5RS.g3:83:1: pattern : ( patternIdentifier | '(' ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )? ')' | '#(' ( ( pattern )+ ( ELLIPSIS )? )? ')' | patternDatum );
	public final R5RSParser.pattern_return pattern() throws RecognitionException {
		R5RSParser.pattern_return retval = new R5RSParser.pattern_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal46=null;
		Token char_literal48=null;
		Token ELLIPSIS50=null;
		Token char_literal51=null;
		Token string_literal52=null;
		Token ELLIPSIS54=null;
		Token char_literal55=null;
		ParserRuleReturnScope patternIdentifier45 =null;
		ParserRuleReturnScope pattern47 =null;
		ParserRuleReturnScope pattern49 =null;
		ParserRuleReturnScope pattern53 =null;
		ParserRuleReturnScope patternDatum56 =null;

		Object char_literal46_tree=null;
		Object char_literal48_tree=null;
		Object ELLIPSIS50_tree=null;
		Object char_literal51_tree=null;
		Object string_literal52_tree=null;
		Object ELLIPSIS54_tree=null;
		Object char_literal55_tree=null;

		try {
			// R5RS.g3:84:3: ( patternIdentifier | '(' ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )? ')' | '#(' ( ( pattern )+ ( ELLIPSIS )? )? ')' | patternDatum )
			int alt17=4;
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
				alt17=1;
				}
				break;
			case 82:
				{
				alt17=2;
				}
				break;
			case 81:
				{
				alt17=3;
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
				alt17=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// R5RS.g3:84:6: patternIdentifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_patternIdentifier_in_pattern409);
					patternIdentifier45=patternIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, patternIdentifier45.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:85:6: '(' ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal46=(Token)match(input,82,FOLLOW_82_in_pattern416); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal46_tree = (Object)adaptor.create(char_literal46);
					adaptor.addChild(root_0, char_literal46_tree);
					}

					// R5RS.g3:85:10: ( ( pattern )+ ( '.' pattern | ELLIPSIS )? )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( ((LA13_0 >= AND && LA13_0 <= CHARACTER)||LA13_0==COND||LA13_0==DEFINE||LA13_0==DELAY||LA13_0==DO||LA13_0==ELSE||(LA13_0 >= FALSE && LA13_0 <= IF)||(LA13_0 >= LAMBDA && LA13_0 <= LETREC)||LA13_0==LETSTAR||(LA13_0 >= NUM_10 && LA13_0 <= OR)||(LA13_0 >= QUASIQUOTE && LA13_0 <= QUOTE)||LA13_0==SET||LA13_0==STRING||LA13_0==TRUE||(LA13_0 >= UNQUOTE && LA13_0 <= UNQUOTE_SPLICING)||(LA13_0 >= VARIABLE && LA13_0 <= 82)) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// R5RS.g3:85:11: ( pattern )+ ( '.' pattern | ELLIPSIS )?
							{
							// R5RS.g3:85:11: ( pattern )+
							int cnt11=0;
							loop11:
							while (true) {
								int alt11=2;
								int LA11_0 = input.LA(1);
								if ( ((LA11_0 >= AND && LA11_0 <= CHARACTER)||LA11_0==COND||LA11_0==DEFINE||LA11_0==DELAY||LA11_0==DO||LA11_0==ELSE||(LA11_0 >= FALSE && LA11_0 <= IF)||(LA11_0 >= LAMBDA && LA11_0 <= LETREC)||LA11_0==LETSTAR||(LA11_0 >= NUM_10 && LA11_0 <= OR)||(LA11_0 >= QUASIQUOTE && LA11_0 <= QUOTE)||LA11_0==SET||LA11_0==STRING||LA11_0==TRUE||(LA11_0 >= UNQUOTE && LA11_0 <= UNQUOTE_SPLICING)||(LA11_0 >= VARIABLE && LA11_0 <= 82)) ) {
									alt11=1;
								}

								switch (alt11) {
								case 1 :
									// R5RS.g3:85:11: pattern
									{
									pushFollow(FOLLOW_pattern_in_pattern419);
									pattern47=pattern();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern47.getTree());

									}
									break;

								default :
									if ( cnt11 >= 1 ) break loop11;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(11, input);
									throw eee;
								}
								cnt11++;
							}

							// R5RS.g3:85:20: ( '.' pattern | ELLIPSIS )?
							int alt12=3;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==86) ) {
								alt12=1;
							}
							else if ( (LA12_0==ELLIPSIS) ) {
								alt12=2;
							}
							switch (alt12) {
								case 1 :
									// R5RS.g3:85:21: '.' pattern
									{
									char_literal48=(Token)match(input,86,FOLLOW_86_in_pattern423); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal48_tree = (Object)adaptor.create(char_literal48);
									adaptor.addChild(root_0, char_literal48_tree);
									}

									pushFollow(FOLLOW_pattern_in_pattern425);
									pattern49=pattern();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern49.getTree());

									}
									break;
								case 2 :
									// R5RS.g3:85:35: ELLIPSIS
									{
									ELLIPSIS50=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_pattern429); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ELLIPSIS50_tree = (Object)adaptor.create(ELLIPSIS50);
									adaptor.addChild(root_0, ELLIPSIS50_tree);
									}

									}
									break;

							}

							}
							break;

					}

					char_literal51=(Token)match(input,83,FOLLOW_83_in_pattern436); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal51_tree = (Object)adaptor.create(char_literal51);
					adaptor.addChild(root_0, char_literal51_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:86:6: '#(' ( ( pattern )+ ( ELLIPSIS )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal52=(Token)match(input,81,FOLLOW_81_in_pattern443); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal52_tree = (Object)adaptor.create(string_literal52);
					adaptor.addChild(root_0, string_literal52_tree);
					}

					// R5RS.g3:86:11: ( ( pattern )+ ( ELLIPSIS )? )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( ((LA16_0 >= AND && LA16_0 <= CHARACTER)||LA16_0==COND||LA16_0==DEFINE||LA16_0==DELAY||LA16_0==DO||LA16_0==ELSE||(LA16_0 >= FALSE && LA16_0 <= IF)||(LA16_0 >= LAMBDA && LA16_0 <= LETREC)||LA16_0==LETSTAR||(LA16_0 >= NUM_10 && LA16_0 <= OR)||(LA16_0 >= QUASIQUOTE && LA16_0 <= QUOTE)||LA16_0==SET||LA16_0==STRING||LA16_0==TRUE||(LA16_0 >= UNQUOTE && LA16_0 <= UNQUOTE_SPLICING)||(LA16_0 >= VARIABLE && LA16_0 <= 82)) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// R5RS.g3:86:12: ( pattern )+ ( ELLIPSIS )?
							{
							// R5RS.g3:86:12: ( pattern )+
							int cnt14=0;
							loop14:
							while (true) {
								int alt14=2;
								int LA14_0 = input.LA(1);
								if ( ((LA14_0 >= AND && LA14_0 <= CHARACTER)||LA14_0==COND||LA14_0==DEFINE||LA14_0==DELAY||LA14_0==DO||LA14_0==ELSE||(LA14_0 >= FALSE && LA14_0 <= IF)||(LA14_0 >= LAMBDA && LA14_0 <= LETREC)||LA14_0==LETSTAR||(LA14_0 >= NUM_10 && LA14_0 <= OR)||(LA14_0 >= QUASIQUOTE && LA14_0 <= QUOTE)||LA14_0==SET||LA14_0==STRING||LA14_0==TRUE||(LA14_0 >= UNQUOTE && LA14_0 <= UNQUOTE_SPLICING)||(LA14_0 >= VARIABLE && LA14_0 <= 82)) ) {
									alt14=1;
								}

								switch (alt14) {
								case 1 :
									// R5RS.g3:86:12: pattern
									{
									pushFollow(FOLLOW_pattern_in_pattern446);
									pattern53=pattern();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern53.getTree());

									}
									break;

								default :
									if ( cnt14 >= 1 ) break loop14;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(14, input);
									throw eee;
								}
								cnt14++;
							}

							// R5RS.g3:86:21: ( ELLIPSIS )?
							int alt15=2;
							int LA15_0 = input.LA(1);
							if ( (LA15_0==ELLIPSIS) ) {
								alt15=1;
							}
							switch (alt15) {
								case 1 :
									// R5RS.g3:86:21: ELLIPSIS
									{
									ELLIPSIS54=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_pattern449); if (state.failed) return retval;
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

					char_literal55=(Token)match(input,83,FOLLOW_83_in_pattern455); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal55_tree = (Object)adaptor.create(char_literal55);
					adaptor.addChild(root_0, char_literal55_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:87:6: patternDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_patternDatum_in_pattern462);
					patternDatum56=patternDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, patternDatum56.getTree());

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
	// R5RS.g3:90:1: patternIdentifier : ( syntacticKeyword | VARIABLE );
	public final R5RSParser.patternIdentifier_return patternIdentifier() throws RecognitionException {
		R5RSParser.patternIdentifier_return retval = new R5RSParser.patternIdentifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE58=null;
		ParserRuleReturnScope syntacticKeyword57 =null;

		Object VARIABLE58_tree=null;

		try {
			// R5RS.g3:91:3: ( syntacticKeyword | VARIABLE )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( ((LA18_0 >= AND && LA18_0 <= CASE)||LA18_0==COND||LA18_0==DEFINE||LA18_0==DELAY||LA18_0==DO||LA18_0==ELSE||LA18_0==IF||(LA18_0 >= LAMBDA && LA18_0 <= LETREC)||LA18_0==LETSTAR||LA18_0==OR||(LA18_0 >= QUASIQUOTE && LA18_0 <= QUOTE)||LA18_0==SET||(LA18_0 >= UNQUOTE && LA18_0 <= UNQUOTE_SPLICING)) ) {
				alt18=1;
			}
			else if ( (LA18_0==VARIABLE) ) {
				alt18=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// R5RS.g3:91:6: syntacticKeyword
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_syntacticKeyword_in_patternIdentifier476);
					syntacticKeyword57=syntacticKeyword();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntacticKeyword57.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:92:6: VARIABLE
					{
					root_0 = (Object)adaptor.nil();


					VARIABLE58=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_patternIdentifier483); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE58_tree = (Object)adaptor.create(VARIABLE58);
					adaptor.addChild(root_0, VARIABLE58_tree);
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
	// R5RS.g3:95:1: patternDatum : ( STRING | CHARACTER | bool | number );
	public final R5RSParser.patternDatum_return patternDatum() throws RecognitionException {
		R5RSParser.patternDatum_return retval = new R5RSParser.patternDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING59=null;
		Token CHARACTER60=null;
		ParserRuleReturnScope bool61 =null;
		ParserRuleReturnScope number62 =null;

		Object STRING59_tree=null;
		Object CHARACTER60_tree=null;

		try {
			// R5RS.g3:96:3: ( STRING | CHARACTER | bool | number )
			int alt19=4;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt19=1;
				}
				break;
			case CHARACTER:
				{
				alt19=2;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt19=3;
				}
				break;
			case NUM_10:
			case NUM_16:
			case NUM_2:
			case NUM_8:
				{
				alt19=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// R5RS.g3:96:6: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING59=(Token)match(input,STRING,FOLLOW_STRING_in_patternDatum497); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING59_tree = (Object)adaptor.create(STRING59);
					adaptor.addChild(root_0, STRING59_tree);
					}

					}
					break;
				case 2 :
					// R5RS.g3:97:6: CHARACTER
					{
					root_0 = (Object)adaptor.nil();


					CHARACTER60=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_patternDatum504); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHARACTER60_tree = (Object)adaptor.create(CHARACTER60);
					adaptor.addChild(root_0, CHARACTER60_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:98:6: bool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_in_patternDatum511);
					bool61=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool61.getTree());

					}
					break;
				case 4 :
					// R5RS.g3:99:6: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_patternDatum518);
					number62=number();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number62.getTree());

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
	// R5RS.g3:102:1: template : ( patternIdentifier | '(' ( ( templateElement )+ ( '.' templateElement )? )? ')' | '#(' ( templateElement )* ')' | templateDatum );
	public final R5RSParser.template_return template() throws RecognitionException {
		R5RSParser.template_return retval = new R5RSParser.template_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal64=null;
		Token char_literal66=null;
		Token char_literal68=null;
		Token string_literal69=null;
		Token char_literal71=null;
		ParserRuleReturnScope patternIdentifier63 =null;
		ParserRuleReturnScope templateElement65 =null;
		ParserRuleReturnScope templateElement67 =null;
		ParserRuleReturnScope templateElement70 =null;
		ParserRuleReturnScope templateDatum72 =null;

		Object char_literal64_tree=null;
		Object char_literal66_tree=null;
		Object char_literal68_tree=null;
		Object string_literal69_tree=null;
		Object char_literal71_tree=null;

		try {
			// R5RS.g3:103:3: ( patternIdentifier | '(' ( ( templateElement )+ ( '.' templateElement )? )? ')' | '#(' ( templateElement )* ')' | templateDatum )
			int alt24=4;
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
				alt24=1;
				}
				break;
			case 82:
				{
				alt24=2;
				}
				break;
			case 81:
				{
				alt24=3;
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
				alt24=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// R5RS.g3:103:6: patternIdentifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_patternIdentifier_in_template532);
					patternIdentifier63=patternIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, patternIdentifier63.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:104:6: '(' ( ( templateElement )+ ( '.' templateElement )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal64=(Token)match(input,82,FOLLOW_82_in_template539); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal64_tree = (Object)adaptor.create(char_literal64);
					adaptor.addChild(root_0, char_literal64_tree);
					}

					// R5RS.g3:104:10: ( ( templateElement )+ ( '.' templateElement )? )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( ((LA22_0 >= AND && LA22_0 <= CHARACTER)||LA22_0==COND||LA22_0==DEFINE||LA22_0==DELAY||LA22_0==DO||LA22_0==ELSE||(LA22_0 >= FALSE && LA22_0 <= IF)||(LA22_0 >= LAMBDA && LA22_0 <= LETREC)||LA22_0==LETSTAR||(LA22_0 >= NUM_10 && LA22_0 <= OR)||(LA22_0 >= QUASIQUOTE && LA22_0 <= QUOTE)||LA22_0==SET||LA22_0==STRING||LA22_0==TRUE||(LA22_0 >= UNQUOTE && LA22_0 <= UNQUOTE_SPLICING)||(LA22_0 >= VARIABLE && LA22_0 <= 82)) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// R5RS.g3:104:11: ( templateElement )+ ( '.' templateElement )?
							{
							// R5RS.g3:104:11: ( templateElement )+
							int cnt20=0;
							loop20:
							while (true) {
								int alt20=2;
								int LA20_0 = input.LA(1);
								if ( ((LA20_0 >= AND && LA20_0 <= CHARACTER)||LA20_0==COND||LA20_0==DEFINE||LA20_0==DELAY||LA20_0==DO||LA20_0==ELSE||(LA20_0 >= FALSE && LA20_0 <= IF)||(LA20_0 >= LAMBDA && LA20_0 <= LETREC)||LA20_0==LETSTAR||(LA20_0 >= NUM_10 && LA20_0 <= OR)||(LA20_0 >= QUASIQUOTE && LA20_0 <= QUOTE)||LA20_0==SET||LA20_0==STRING||LA20_0==TRUE||(LA20_0 >= UNQUOTE && LA20_0 <= UNQUOTE_SPLICING)||(LA20_0 >= VARIABLE && LA20_0 <= 82)) ) {
									alt20=1;
								}

								switch (alt20) {
								case 1 :
									// R5RS.g3:104:11: templateElement
									{
									pushFollow(FOLLOW_templateElement_in_template542);
									templateElement65=templateElement();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, templateElement65.getTree());

									}
									break;

								default :
									if ( cnt20 >= 1 ) break loop20;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(20, input);
									throw eee;
								}
								cnt20++;
							}

							// R5RS.g3:104:28: ( '.' templateElement )?
							int alt21=2;
							int LA21_0 = input.LA(1);
							if ( (LA21_0==86) ) {
								alt21=1;
							}
							switch (alt21) {
								case 1 :
									// R5RS.g3:104:29: '.' templateElement
									{
									char_literal66=(Token)match(input,86,FOLLOW_86_in_template546); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal66_tree = (Object)adaptor.create(char_literal66);
									adaptor.addChild(root_0, char_literal66_tree);
									}

									pushFollow(FOLLOW_templateElement_in_template548);
									templateElement67=templateElement();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, templateElement67.getTree());

									}
									break;

							}

							}
							break;

					}

					char_literal68=(Token)match(input,83,FOLLOW_83_in_template554); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal68_tree = (Object)adaptor.create(char_literal68);
					adaptor.addChild(root_0, char_literal68_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:105:6: '#(' ( templateElement )* ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal69=(Token)match(input,81,FOLLOW_81_in_template561); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal69_tree = (Object)adaptor.create(string_literal69);
					adaptor.addChild(root_0, string_literal69_tree);
					}

					// R5RS.g3:105:11: ( templateElement )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( ((LA23_0 >= AND && LA23_0 <= CHARACTER)||LA23_0==COND||LA23_0==DEFINE||LA23_0==DELAY||LA23_0==DO||LA23_0==ELSE||(LA23_0 >= FALSE && LA23_0 <= IF)||(LA23_0 >= LAMBDA && LA23_0 <= LETREC)||LA23_0==LETSTAR||(LA23_0 >= NUM_10 && LA23_0 <= OR)||(LA23_0 >= QUASIQUOTE && LA23_0 <= QUOTE)||LA23_0==SET||LA23_0==STRING||LA23_0==TRUE||(LA23_0 >= UNQUOTE && LA23_0 <= UNQUOTE_SPLICING)||(LA23_0 >= VARIABLE && LA23_0 <= 82)) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// R5RS.g3:105:11: templateElement
							{
							pushFollow(FOLLOW_templateElement_in_template563);
							templateElement70=templateElement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, templateElement70.getTree());

							}
							break;

						default :
							break loop23;
						}
					}

					char_literal71=(Token)match(input,83,FOLLOW_83_in_template566); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal71_tree = (Object)adaptor.create(char_literal71);
					adaptor.addChild(root_0, char_literal71_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:106:6: templateDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_templateDatum_in_template573);
					templateDatum72=templateDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, templateDatum72.getTree());

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
	// R5RS.g3:109:1: templateElement : template ( ELLIPSIS )? ;
	public final R5RSParser.templateElement_return templateElement() throws RecognitionException {
		R5RSParser.templateElement_return retval = new R5RSParser.templateElement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELLIPSIS74=null;
		ParserRuleReturnScope template73 =null;

		Object ELLIPSIS74_tree=null;

		try {
			// R5RS.g3:110:3: ( template ( ELLIPSIS )? )
			// R5RS.g3:110:6: template ( ELLIPSIS )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_template_in_templateElement587);
			template73=template();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, template73.getTree());

			// R5RS.g3:110:15: ( ELLIPSIS )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==ELLIPSIS) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// R5RS.g3:110:15: ELLIPSIS
					{
					ELLIPSIS74=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_templateElement589); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELLIPSIS74_tree = (Object)adaptor.create(ELLIPSIS74);
					adaptor.addChild(root_0, ELLIPSIS74_tree);
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
	// R5RS.g3:113:1: templateDatum : patternDatum ;
	public final R5RSParser.templateDatum_return templateDatum() throws RecognitionException {
		R5RSParser.templateDatum_return retval = new R5RSParser.templateDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope patternDatum75 =null;


		try {
			// R5RS.g3:114:3: ( patternDatum )
			// R5RS.g3:114:6: patternDatum
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_patternDatum_in_templateDatum604);
			patternDatum75=patternDatum();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, patternDatum75.getTree());

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
	// R5RS.g3:117:1: command : expression ;
	public final R5RSParser.command_return command() throws RecognitionException {
		R5RSParser.command_return retval = new R5RSParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression76 =null;


		try {
			// R5RS.g3:118:3: ( expression )
			// R5RS.g3:118:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_command618);
			expression76=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression76.getTree());

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
	// R5RS.g3:121:1: identifier : ( syntacticKeyword | variable );
	public final R5RSParser.identifier_return identifier() throws RecognitionException {
		R5RSParser.identifier_return retval = new R5RSParser.identifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope syntacticKeyword77 =null;
		ParserRuleReturnScope variable78 =null;


		try {
			// R5RS.g3:122:3: ( syntacticKeyword | variable )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( ((LA26_0 >= AND && LA26_0 <= CASE)||LA26_0==COND||LA26_0==DEFINE||LA26_0==DELAY||LA26_0==DO||LA26_0==ELSE||LA26_0==IF||(LA26_0 >= LAMBDA && LA26_0 <= LETREC)||LA26_0==LETSTAR||LA26_0==OR||(LA26_0 >= QUASIQUOTE && LA26_0 <= QUOTE)||LA26_0==SET||(LA26_0 >= UNQUOTE && LA26_0 <= UNQUOTE_SPLICING)) ) {
				alt26=1;
			}
			else if ( (LA26_0==ELLIPSIS||LA26_0==VARIABLE) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// R5RS.g3:122:6: syntacticKeyword
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_syntacticKeyword_in_identifier632);
					syntacticKeyword77=syntacticKeyword();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntacticKeyword77.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:123:6: variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_identifier639);
					variable78=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable78.getTree());

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
	// R5RS.g3:126:1: syntacticKeyword : ( expressionKeyword | ELSE | ARROW | DEFINE | UNQUOTE | UNQUOTE_SPLICING );
	public final R5RSParser.syntacticKeyword_return syntacticKeyword() throws RecognitionException {
		R5RSParser.syntacticKeyword_return retval = new R5RSParser.syntacticKeyword_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSE80=null;
		Token ARROW81=null;
		Token DEFINE82=null;
		Token UNQUOTE83=null;
		Token UNQUOTE_SPLICING84=null;
		ParserRuleReturnScope expressionKeyword79 =null;

		Object ELSE80_tree=null;
		Object ARROW81_tree=null;
		Object DEFINE82_tree=null;
		Object UNQUOTE83_tree=null;
		Object UNQUOTE_SPLICING84_tree=null;

		try {
			// R5RS.g3:127:3: ( expressionKeyword | ELSE | ARROW | DEFINE | UNQUOTE | UNQUOTE_SPLICING )
			int alt27=6;
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
				alt27=1;
				}
				break;
			case ELSE:
				{
				alt27=2;
				}
				break;
			case ARROW:
				{
				alt27=3;
				}
				break;
			case DEFINE:
				{
				alt27=4;
				}
				break;
			case UNQUOTE:
				{
				alt27=5;
				}
				break;
			case UNQUOTE_SPLICING:
				{
				alt27=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// R5RS.g3:127:6: expressionKeyword
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expressionKeyword_in_syntacticKeyword653);
					expressionKeyword79=expressionKeyword();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionKeyword79.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:128:6: ELSE
					{
					root_0 = (Object)adaptor.nil();


					ELSE80=(Token)match(input,ELSE,FOLLOW_ELSE_in_syntacticKeyword660); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELSE80_tree = (Object)adaptor.create(ELSE80);
					adaptor.addChild(root_0, ELSE80_tree);
					}

					}
					break;
				case 3 :
					// R5RS.g3:129:6: ARROW
					{
					root_0 = (Object)adaptor.nil();


					ARROW81=(Token)match(input,ARROW,FOLLOW_ARROW_in_syntacticKeyword667); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ARROW81_tree = (Object)adaptor.create(ARROW81);
					adaptor.addChild(root_0, ARROW81_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:130:6: DEFINE
					{
					root_0 = (Object)adaptor.nil();


					DEFINE82=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_syntacticKeyword674); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DEFINE82_tree = (Object)adaptor.create(DEFINE82);
					adaptor.addChild(root_0, DEFINE82_tree);
					}

					}
					break;
				case 5 :
					// R5RS.g3:131:6: UNQUOTE
					{
					root_0 = (Object)adaptor.nil();


					UNQUOTE83=(Token)match(input,UNQUOTE,FOLLOW_UNQUOTE_in_syntacticKeyword681); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE83_tree = (Object)adaptor.create(UNQUOTE83);
					adaptor.addChild(root_0, UNQUOTE83_tree);
					}

					}
					break;
				case 6 :
					// R5RS.g3:132:6: UNQUOTE_SPLICING
					{
					root_0 = (Object)adaptor.nil();


					UNQUOTE_SPLICING84=(Token)match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_syntacticKeyword688); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE_SPLICING84_tree = (Object)adaptor.create(UNQUOTE_SPLICING84);
					adaptor.addChild(root_0, UNQUOTE_SPLICING84_tree);
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
	// R5RS.g3:135:1: expressionKeyword : ( QUOTE | LAMBDA | IF | SET | BEGIN | COND | AND | OR | CASE | LET | LETSTAR | LETREC | DO | DELAY | QUASIQUOTE );
	public final R5RSParser.expressionKeyword_return expressionKeyword() throws RecognitionException {
		R5RSParser.expressionKeyword_return retval = new R5RSParser.expressionKeyword_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set85=null;

		Object set85_tree=null;

		try {
			// R5RS.g3:136:3: ( QUOTE | LAMBDA | IF | SET | BEGIN | COND | AND | OR | CASE | LET | LETSTAR | LETREC | DO | DELAY | QUASIQUOTE )
			// R5RS.g3:
			{
			root_0 = (Object)adaptor.nil();


			set85=input.LT(1);
			if ( input.LA(1)==AND||(input.LA(1) >= BEGIN && input.LA(1) <= CASE)||input.LA(1)==COND||input.LA(1)==DELAY||input.LA(1)==DO||input.LA(1)==IF||(input.LA(1) >= LAMBDA && input.LA(1) <= LETREC)||input.LA(1)==LETSTAR||input.LA(1)==OR||(input.LA(1) >= QUASIQUOTE && input.LA(1) <= QUOTE)||input.LA(1)==SET ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set85));
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
	// R5RS.g3:153:1: expression : ( ( variable )=> variable | ( literal )=> literal | ( lambdaExpression )=> lambdaExpression | ( conditional )=> conditional | ( assignment )=> assignment | ( derivedExpression )=> derivedExpression | ( procedureCall )=> procedureCall | ( macroUse )=> macroUse | macroBlock );
	public final R5RSParser.expression_return expression() throws RecognitionException {
		R5RSParser.expression_return retval = new R5RSParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope variable86 =null;
		ParserRuleReturnScope literal87 =null;
		ParserRuleReturnScope lambdaExpression88 =null;
		ParserRuleReturnScope conditional89 =null;
		ParserRuleReturnScope assignment90 =null;
		ParserRuleReturnScope derivedExpression91 =null;
		ParserRuleReturnScope procedureCall92 =null;
		ParserRuleReturnScope macroUse93 =null;
		ParserRuleReturnScope macroBlock94 =null;


		try {
			// R5RS.g3:154:3: ( ( variable )=> variable | ( literal )=> literal | ( lambdaExpression )=> lambdaExpression | ( conditional )=> conditional | ( assignment )=> assignment | ( derivedExpression )=> derivedExpression | ( procedureCall )=> procedureCall | ( macroUse )=> macroUse | macroBlock )
			int alt28=9;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==VARIABLE) && (synpred4_R5RS())) {
				alt28=1;
			}
			else if ( (LA28_0==ELLIPSIS) && (synpred4_R5RS())) {
				alt28=1;
			}
			else if ( (LA28_0==87) && (synpred5_R5RS())) {
				alt28=2;
			}
			else if ( (LA28_0==82) ) {
				int LA28_4 = input.LA(2);
				if ( (synpred5_R5RS()) ) {
					alt28=2;
				}
				else if ( (synpred6_R5RS()) ) {
					alt28=3;
				}
				else if ( (synpred7_R5RS()) ) {
					alt28=4;
				}
				else if ( (synpred8_R5RS()) ) {
					alt28=5;
				}
				else if ( (synpred9_R5RS()) ) {
					alt28=6;
				}
				else if ( (synpred10_R5RS()) ) {
					alt28=7;
				}
				else if ( (synpred11_R5RS()) ) {
					alt28=8;
				}
				else if ( (true) ) {
					alt28=9;
				}

			}
			else if ( (LA28_0==FALSE||LA28_0==TRUE) && (synpred5_R5RS())) {
				alt28=2;
			}
			else if ( ((LA28_0 >= NUM_10 && LA28_0 <= NUM_8)) && (synpred5_R5RS())) {
				alt28=2;
			}
			else if ( (LA28_0==CHARACTER) && (synpred5_R5RS())) {
				alt28=2;
			}
			else if ( (LA28_0==STRING) && (synpred5_R5RS())) {
				alt28=2;
			}
			else if ( (LA28_0==88) && (synpred9_R5RS())) {
				alt28=6;
			}

			switch (alt28) {
				case 1 :
					// R5RS.g3:154:6: ( variable )=> variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_expression832);
					variable86=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable86.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:155:6: ( literal )=> literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_expression854);
					literal87=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal87.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:156:6: ( lambdaExpression )=> lambdaExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lambdaExpression_in_expression867);
					lambdaExpression88=lambdaExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lambdaExpression88.getTree());

					}
					break;
				case 4 :
					// R5RS.g3:157:6: ( conditional )=> conditional
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_conditional_in_expression885);
					conditional89=conditional();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional89.getTree());

					}
					break;
				case 5 :
					// R5RS.g3:158:6: ( assignment )=> assignment
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_expression904);
					assignment90=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment90.getTree());

					}
					break;
				case 6 :
					// R5RS.g3:159:6: ( derivedExpression )=> derivedExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_derivedExpression_in_expression916);
					derivedExpression91=derivedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, derivedExpression91.getTree());

					}
					break;
				case 7 :
					// R5RS.g3:160:6: ( procedureCall )=> procedureCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureCall_in_expression932);
					procedureCall92=procedureCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall92.getTree());

					}
					break;
				case 8 :
					// R5RS.g3:161:6: ( macroUse )=> macroUse
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_macroUse_in_expression953);
					macroUse93=macroUse();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, macroUse93.getTree());

					}
					break;
				case 9 :
					// R5RS.g3:162:28: macroBlock
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_macroBlock_in_expression982);
					macroBlock94=macroBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, macroBlock94.getTree());

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
	// R5RS.g3:165:1: variable : ( VARIABLE ^| ELLIPSIS ^);
	public final R5RSParser.variable_return variable() throws RecognitionException {
		R5RSParser.variable_return retval = new R5RSParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE95=null;
		Token ELLIPSIS96=null;

		Object VARIABLE95_tree=null;
		Object ELLIPSIS96_tree=null;

		try {
			// R5RS.g3:166:3: ( VARIABLE ^| ELLIPSIS ^)
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==VARIABLE) ) {
				alt29=1;
			}
			else if ( (LA29_0==ELLIPSIS) ) {
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
					// R5RS.g3:166:6: VARIABLE ^
					{
					root_0 = (Object)adaptor.nil();


					VARIABLE95=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_variable996); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE95_tree = new VariableNode(VARIABLE95) ;
					root_0 = (Object)adaptor.becomeRoot(VARIABLE95_tree, root_0);
					}

					}
					break;
				case 2 :
					// R5RS.g3:167:6: ELLIPSIS ^
					{
					root_0 = (Object)adaptor.nil();


					ELLIPSIS96=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_variable1007); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELLIPSIS96_tree = new EllipsisNode(ELLIPSIS96) ;
					root_0 = (Object)adaptor.becomeRoot(ELLIPSIS96_tree, root_0);
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
	// R5RS.g3:170:1: literal : ( quotation | selfEvaluating );
	public final R5RSParser.literal_return literal() throws RecognitionException {
		R5RSParser.literal_return retval = new R5RSParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope quotation97 =null;
		ParserRuleReturnScope selfEvaluating98 =null;


		try {
			// R5RS.g3:171:3: ( quotation | selfEvaluating )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==82||LA30_0==87) ) {
				alt30=1;
			}
			else if ( (LA30_0==CHARACTER||LA30_0==FALSE||(LA30_0 >= NUM_10 && LA30_0 <= NUM_8)||LA30_0==STRING||LA30_0==TRUE) ) {
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
					// R5RS.g3:171:6: quotation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_quotation_in_literal1025);
					quotation97=quotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quotation97.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:172:6: selfEvaluating
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_selfEvaluating_in_literal1032);
					selfEvaluating98=selfEvaluating();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, selfEvaluating98.getTree());

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
	// R5RS.g3:175:1: quotation : ( '\\'' datum | '(' QUOTE datum ')' );
	public final R5RSParser.quotation_return quotation() throws RecognitionException {
		R5RSParser.quotation_return retval = new R5RSParser.quotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal99=null;
		Token char_literal101=null;
		Token QUOTE102=null;
		Token char_literal104=null;
		ParserRuleReturnScope datum100 =null;
		ParserRuleReturnScope datum103 =null;

		Object char_literal99_tree=null;
		Object char_literal101_tree=null;
		Object QUOTE102_tree=null;
		Object char_literal104_tree=null;

		try {
			// R5RS.g3:176:3: ( '\\'' datum | '(' QUOTE datum ')' )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==87) ) {
				alt31=1;
			}
			else if ( (LA31_0==82) ) {
				alt31=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// R5RS.g3:176:6: '\\'' datum
					{
					root_0 = (Object)adaptor.nil();


					char_literal99=(Token)match(input,87,FOLLOW_87_in_quotation1046); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal99_tree = (Object)adaptor.create(char_literal99);
					adaptor.addChild(root_0, char_literal99_tree);
					}

					pushFollow(FOLLOW_datum_in_quotation1048);
					datum100=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum100.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:177:6: '(' QUOTE datum ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal101=(Token)match(input,82,FOLLOW_82_in_quotation1055); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal101_tree = (Object)adaptor.create(char_literal101);
					adaptor.addChild(root_0, char_literal101_tree);
					}

					QUOTE102=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_quotation1057); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					QUOTE102_tree = (Object)adaptor.create(QUOTE102);
					adaptor.addChild(root_0, QUOTE102_tree);
					}

					pushFollow(FOLLOW_datum_in_quotation1059);
					datum103=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum103.getTree());

					char_literal104=(Token)match(input,83,FOLLOW_83_in_quotation1061); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal104_tree = (Object)adaptor.create(char_literal104);
					adaptor.addChild(root_0, char_literal104_tree);
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
	// R5RS.g3:180:1: selfEvaluating : ( bool | number | CHARACTER | STRING );
	public final R5RSParser.selfEvaluating_return selfEvaluating() throws RecognitionException {
		R5RSParser.selfEvaluating_return retval = new R5RSParser.selfEvaluating_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHARACTER107=null;
		Token STRING108=null;
		ParserRuleReturnScope bool105 =null;
		ParserRuleReturnScope number106 =null;

		Object CHARACTER107_tree=null;
		Object STRING108_tree=null;

		try {
			// R5RS.g3:181:3: ( bool | number | CHARACTER | STRING )
			int alt32=4;
			switch ( input.LA(1) ) {
			case FALSE:
			case TRUE:
				{
				alt32=1;
				}
				break;
			case NUM_10:
			case NUM_16:
			case NUM_2:
			case NUM_8:
				{
				alt32=2;
				}
				break;
			case CHARACTER:
				{
				alt32=3;
				}
				break;
			case STRING:
				{
				alt32=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// R5RS.g3:181:6: bool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_in_selfEvaluating1075);
					bool105=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool105.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:182:6: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_selfEvaluating1082);
					number106=number();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number106.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:183:6: CHARACTER
					{
					root_0 = (Object)adaptor.nil();


					CHARACTER107=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_selfEvaluating1089); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHARACTER107_tree = (Object)adaptor.create(CHARACTER107);
					adaptor.addChild(root_0, CHARACTER107_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:184:6: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING108=(Token)match(input,STRING,FOLLOW_STRING_in_selfEvaluating1096); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING108_tree = (Object)adaptor.create(STRING108);
					adaptor.addChild(root_0, STRING108_tree);
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
	// R5RS.g3:187:1: lambdaExpression : '(' LAMBDA formals body ')' ;
	public final R5RSParser.lambdaExpression_return lambdaExpression() throws RecognitionException {
		R5RSParser.lambdaExpression_return retval = new R5RSParser.lambdaExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal109=null;
		Token LAMBDA110=null;
		Token char_literal113=null;
		ParserRuleReturnScope formals111 =null;
		ParserRuleReturnScope body112 =null;

		Object char_literal109_tree=null;
		Object LAMBDA110_tree=null;
		Object char_literal113_tree=null;

		try {
			// R5RS.g3:188:3: ( '(' LAMBDA formals body ')' )
			// R5RS.g3:188:6: '(' LAMBDA formals body ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal109=(Token)match(input,82,FOLLOW_82_in_lambdaExpression1110); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal109_tree = (Object)adaptor.create(char_literal109);
			adaptor.addChild(root_0, char_literal109_tree);
			}

			LAMBDA110=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambdaExpression1112); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LAMBDA110_tree = (Object)adaptor.create(LAMBDA110);
			adaptor.addChild(root_0, LAMBDA110_tree);
			}

			pushFollow(FOLLOW_formals_in_lambdaExpression1114);
			formals111=formals();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formals111.getTree());

			pushFollow(FOLLOW_body_in_lambdaExpression1116);
			body112=body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, body112.getTree());

			char_literal113=(Token)match(input,83,FOLLOW_83_in_lambdaExpression1118); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal113_tree = (Object)adaptor.create(char_literal113);
			adaptor.addChild(root_0, char_literal113_tree);
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
	// R5RS.g3:191:1: formals : ( '(' ( ( variable )+ ( '.' variable )? )? ')' | variable );
	public final R5RSParser.formals_return formals() throws RecognitionException {
		R5RSParser.formals_return retval = new R5RSParser.formals_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal114=null;
		Token char_literal116=null;
		Token char_literal118=null;
		ParserRuleReturnScope variable115 =null;
		ParserRuleReturnScope variable117 =null;
		ParserRuleReturnScope variable119 =null;

		Object char_literal114_tree=null;
		Object char_literal116_tree=null;
		Object char_literal118_tree=null;

		try {
			// R5RS.g3:192:3: ( '(' ( ( variable )+ ( '.' variable )? )? ')' | variable )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==82) ) {
				alt36=1;
			}
			else if ( (LA36_0==ELLIPSIS||LA36_0==VARIABLE) ) {
				alt36=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// R5RS.g3:192:6: '(' ( ( variable )+ ( '.' variable )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal114=(Token)match(input,82,FOLLOW_82_in_formals1132); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal114_tree = (Object)adaptor.create(char_literal114);
					adaptor.addChild(root_0, char_literal114_tree);
					}

					// R5RS.g3:192:10: ( ( variable )+ ( '.' variable )? )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==ELLIPSIS||LA35_0==VARIABLE) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// R5RS.g3:192:11: ( variable )+ ( '.' variable )?
							{
							// R5RS.g3:192:11: ( variable )+
							int cnt33=0;
							loop33:
							while (true) {
								int alt33=2;
								int LA33_0 = input.LA(1);
								if ( (LA33_0==ELLIPSIS||LA33_0==VARIABLE) ) {
									alt33=1;
								}

								switch (alt33) {
								case 1 :
									// R5RS.g3:192:11: variable
									{
									pushFollow(FOLLOW_variable_in_formals1135);
									variable115=variable();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, variable115.getTree());

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

							// R5RS.g3:192:21: ( '.' variable )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==86) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// R5RS.g3:192:22: '.' variable
									{
									char_literal116=(Token)match(input,86,FOLLOW_86_in_formals1139); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal116_tree = (Object)adaptor.create(char_literal116);
									adaptor.addChild(root_0, char_literal116_tree);
									}

									pushFollow(FOLLOW_variable_in_formals1141);
									variable117=variable();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, variable117.getTree());

									}
									break;

							}

							}
							break;

					}

					char_literal118=(Token)match(input,83,FOLLOW_83_in_formals1147); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal118_tree = (Object)adaptor.create(char_literal118);
					adaptor.addChild(root_0, char_literal118_tree);
					}

					}
					break;
				case 2 :
					// R5RS.g3:193:6: variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_formals1154);
					variable119=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable119.getTree());

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
	// R5RS.g3:196:1: conditional : '(' IF test consequent ( alternate )? ')' ;
	public final R5RSParser.conditional_return conditional() throws RecognitionException {
		R5RSParser.conditional_return retval = new R5RSParser.conditional_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal120=null;
		Token IF121=null;
		Token char_literal125=null;
		ParserRuleReturnScope test122 =null;
		ParserRuleReturnScope consequent123 =null;
		ParserRuleReturnScope alternate124 =null;

		Object char_literal120_tree=null;
		Object IF121_tree=null;
		Object char_literal125_tree=null;

		try {
			// R5RS.g3:197:3: ( '(' IF test consequent ( alternate )? ')' )
			// R5RS.g3:197:6: '(' IF test consequent ( alternate )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal120=(Token)match(input,82,FOLLOW_82_in_conditional1168); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal120_tree = (Object)adaptor.create(char_literal120);
			adaptor.addChild(root_0, char_literal120_tree);
			}

			IF121=(Token)match(input,IF,FOLLOW_IF_in_conditional1170); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF121_tree = (Object)adaptor.create(IF121);
			adaptor.addChild(root_0, IF121_tree);
			}

			pushFollow(FOLLOW_test_in_conditional1172);
			test122=test();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, test122.getTree());

			pushFollow(FOLLOW_consequent_in_conditional1174);
			consequent123=consequent();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, consequent123.getTree());

			// R5RS.g3:197:29: ( alternate )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==CHARACTER||LA37_0==ELLIPSIS||LA37_0==FALSE||(LA37_0 >= NUM_10 && LA37_0 <= NUM_8)||LA37_0==STRING||LA37_0==TRUE||LA37_0==VARIABLE||LA37_0==82||(LA37_0 >= 87 && LA37_0 <= 88)) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// R5RS.g3:197:29: alternate
					{
					pushFollow(FOLLOW_alternate_in_conditional1176);
					alternate124=alternate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alternate124.getTree());

					}
					break;

			}

			char_literal125=(Token)match(input,83,FOLLOW_83_in_conditional1179); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal125_tree = (Object)adaptor.create(char_literal125);
			adaptor.addChild(root_0, char_literal125_tree);
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
	// R5RS.g3:200:1: test : expression ;
	public final R5RSParser.test_return test() throws RecognitionException {
		R5RSParser.test_return retval = new R5RSParser.test_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression126 =null;


		try {
			// R5RS.g3:201:3: ( expression )
			// R5RS.g3:201:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_test1194);
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
	// $ANTLR end "test"


	public static class consequent_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "consequent"
	// R5RS.g3:204:1: consequent : expression ;
	public final R5RSParser.consequent_return consequent() throws RecognitionException {
		R5RSParser.consequent_return retval = new R5RSParser.consequent_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression127 =null;


		try {
			// R5RS.g3:205:3: ( expression )
			// R5RS.g3:205:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_consequent1210);
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
	// $ANTLR end "consequent"


	public static class alternate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "alternate"
	// R5RS.g3:208:1: alternate : expression ;
	public final R5RSParser.alternate_return alternate() throws RecognitionException {
		R5RSParser.alternate_return retval = new R5RSParser.alternate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression128 =null;


		try {
			// R5RS.g3:209:3: ( expression )
			// R5RS.g3:209:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_alternate1225);
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
	// $ANTLR end "alternate"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// R5RS.g3:212:1: assignment : '(' SET variable expression ')' ;
	public final R5RSParser.assignment_return assignment() throws RecognitionException {
		R5RSParser.assignment_return retval = new R5RSParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal129=null;
		Token SET130=null;
		Token char_literal133=null;
		ParserRuleReturnScope variable131 =null;
		ParserRuleReturnScope expression132 =null;

		Object char_literal129_tree=null;
		Object SET130_tree=null;
		Object char_literal133_tree=null;

		try {
			// R5RS.g3:213:3: ( '(' SET variable expression ')' )
			// R5RS.g3:213:6: '(' SET variable expression ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal129=(Token)match(input,82,FOLLOW_82_in_assignment1239); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal129_tree = (Object)adaptor.create(char_literal129);
			adaptor.addChild(root_0, char_literal129_tree);
			}

			SET130=(Token)match(input,SET,FOLLOW_SET_in_assignment1241); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SET130_tree = (Object)adaptor.create(SET130);
			adaptor.addChild(root_0, SET130_tree);
			}

			pushFollow(FOLLOW_variable_in_assignment1243);
			variable131=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable131.getTree());

			pushFollow(FOLLOW_expression_in_assignment1245);
			expression132=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression132.getTree());

			char_literal133=(Token)match(input,83,FOLLOW_83_in_assignment1247); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal133_tree = (Object)adaptor.create(char_literal133);
			adaptor.addChild(root_0, char_literal133_tree);
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
	// R5RS.g3:216:1: derivedExpression : ( quasiquotation | '(' ( COND ( '(' ELSE sequence ')' | ( condClause )+ ( '(' ELSE sequence ')' )? ) | CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? ) | AND ( test )* | OR ( test )* | LET ( variable )? '(' ( bindingSpec )* ')' body | LETSTAR '(' ( bindingSpec )* ')' body | LETREC '(' ( bindingSpec )* ')' body | BEGIN sequence | DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )* | DELAY expression ) ')' );
	public final R5RSParser.derivedExpression_return derivedExpression() throws RecognitionException {
		R5RSParser.derivedExpression_return retval = new R5RSParser.derivedExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal135=null;
		Token COND136=null;
		Token char_literal137=null;
		Token ELSE138=null;
		Token char_literal140=null;
		Token char_literal142=null;
		Token ELSE143=null;
		Token char_literal145=null;
		Token CASE146=null;
		Token char_literal148=null;
		Token ELSE149=null;
		Token char_literal151=null;
		Token char_literal153=null;
		Token ELSE154=null;
		Token char_literal156=null;
		Token AND157=null;
		Token OR159=null;
		Token LET161=null;
		Token char_literal163=null;
		Token char_literal165=null;
		Token LETSTAR167=null;
		Token char_literal168=null;
		Token char_literal170=null;
		Token LETREC172=null;
		Token char_literal173=null;
		Token char_literal175=null;
		Token BEGIN177=null;
		Token DO179=null;
		Token char_literal180=null;
		Token char_literal182=null;
		Token char_literal183=null;
		Token char_literal186=null;
		Token DELAY188=null;
		Token char_literal190=null;
		ParserRuleReturnScope quasiquotation134 =null;
		ParserRuleReturnScope sequence139 =null;
		ParserRuleReturnScope condClause141 =null;
		ParserRuleReturnScope sequence144 =null;
		ParserRuleReturnScope expression147 =null;
		ParserRuleReturnScope sequence150 =null;
		ParserRuleReturnScope caseClause152 =null;
		ParserRuleReturnScope sequence155 =null;
		ParserRuleReturnScope test158 =null;
		ParserRuleReturnScope test160 =null;
		ParserRuleReturnScope variable162 =null;
		ParserRuleReturnScope bindingSpec164 =null;
		ParserRuleReturnScope body166 =null;
		ParserRuleReturnScope bindingSpec169 =null;
		ParserRuleReturnScope body171 =null;
		ParserRuleReturnScope bindingSpec174 =null;
		ParserRuleReturnScope body176 =null;
		ParserRuleReturnScope sequence178 =null;
		ParserRuleReturnScope iterationSpec181 =null;
		ParserRuleReturnScope test184 =null;
		ParserRuleReturnScope doResult185 =null;
		ParserRuleReturnScope command187 =null;
		ParserRuleReturnScope expression189 =null;

		Object char_literal135_tree=null;
		Object COND136_tree=null;
		Object char_literal137_tree=null;
		Object ELSE138_tree=null;
		Object char_literal140_tree=null;
		Object char_literal142_tree=null;
		Object ELSE143_tree=null;
		Object char_literal145_tree=null;
		Object CASE146_tree=null;
		Object char_literal148_tree=null;
		Object ELSE149_tree=null;
		Object char_literal151_tree=null;
		Object char_literal153_tree=null;
		Object ELSE154_tree=null;
		Object char_literal156_tree=null;
		Object AND157_tree=null;
		Object OR159_tree=null;
		Object LET161_tree=null;
		Object char_literal163_tree=null;
		Object char_literal165_tree=null;
		Object LETSTAR167_tree=null;
		Object char_literal168_tree=null;
		Object char_literal170_tree=null;
		Object LETREC172_tree=null;
		Object char_literal173_tree=null;
		Object char_literal175_tree=null;
		Object BEGIN177_tree=null;
		Object DO179_tree=null;
		Object char_literal180_tree=null;
		Object char_literal182_tree=null;
		Object char_literal183_tree=null;
		Object char_literal186_tree=null;
		Object DELAY188_tree=null;
		Object char_literal190_tree=null;

		try {
			// R5RS.g3:217:3: ( quasiquotation | '(' ( COND ( '(' ELSE sequence ')' | ( condClause )+ ( '(' ELSE sequence ')' )? ) | CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? ) | AND ( test )* | OR ( test )* | LET ( variable )? '(' ( bindingSpec )* ')' body | LETSTAR '(' ( bindingSpec )* ')' body | LETREC '(' ( bindingSpec )* ')' body | BEGIN sequence | DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )* | DELAY expression ) ')' )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==88) ) {
				alt54=1;
			}
			else if ( (LA54_0==82) ) {
				int LA54_2 = input.LA(2);
				if ( (LA54_2==QUASIQUOTE) ) {
					alt54=1;
				}
				else if ( (LA54_2==AND||(LA54_2 >= BEGIN && LA54_2 <= CASE)||LA54_2==COND||LA54_2==DELAY||LA54_2==DO||(LA54_2 >= LET && LA54_2 <= LETREC)||LA54_2==LETSTAR||LA54_2==OR) ) {
					alt54=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// R5RS.g3:217:6: quasiquotation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_quasiquotation_in_derivedExpression1261);
					quasiquotation134=quasiquotation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quasiquotation134.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:218:6: '(' ( COND ( '(' ELSE sequence ')' | ( condClause )+ ( '(' ELSE sequence ')' )? ) | CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? ) | AND ( test )* | OR ( test )* | LET ( variable )? '(' ( bindingSpec )* ')' body | LETSTAR '(' ( bindingSpec )* ')' body | LETREC '(' ( bindingSpec )* ')' body | BEGIN sequence | DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )* | DELAY expression ) ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal135=(Token)match(input,82,FOLLOW_82_in_derivedExpression1268); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal135_tree = (Object)adaptor.create(char_literal135);
					adaptor.addChild(root_0, char_literal135_tree);
					}

					// R5RS.g3:218:10: ( COND ( '(' ELSE sequence ')' | ( condClause )+ ( '(' ELSE sequence ')' )? ) | CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? ) | AND ( test )* | OR ( test )* | LET ( variable )? '(' ( bindingSpec )* ')' body | LETSTAR '(' ( bindingSpec )* ')' body | LETREC '(' ( bindingSpec )* ')' body | BEGIN sequence | DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )* | DELAY expression )
					int alt53=10;
					switch ( input.LA(1) ) {
					case COND:
						{
						alt53=1;
						}
						break;
					case CASE:
						{
						alt53=2;
						}
						break;
					case AND:
						{
						alt53=3;
						}
						break;
					case OR:
						{
						alt53=4;
						}
						break;
					case LET:
						{
						alt53=5;
						}
						break;
					case LETSTAR:
						{
						alt53=6;
						}
						break;
					case LETREC:
						{
						alt53=7;
						}
						break;
					case BEGIN:
						{
						alt53=8;
						}
						break;
					case DO:
						{
						alt53=9;
						}
						break;
					case DELAY:
						{
						alt53=10;
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
							// R5RS.g3:218:12: COND ( '(' ELSE sequence ')' | ( condClause )+ ( '(' ELSE sequence ')' )? )
							{
							COND136=(Token)match(input,COND,FOLLOW_COND_in_derivedExpression1272); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COND136_tree = (Object)adaptor.create(COND136);
							adaptor.addChild(root_0, COND136_tree);
							}

							// R5RS.g3:218:17: ( '(' ELSE sequence ')' | ( condClause )+ ( '(' ELSE sequence ')' )? )
							int alt40=2;
							int LA40_0 = input.LA(1);
							if ( (LA40_0==82) ) {
								int LA40_1 = input.LA(2);
								if ( (LA40_1==ELSE) ) {
									alt40=1;
								}
								else if ( (LA40_1==CHARACTER||LA40_1==ELLIPSIS||LA40_1==FALSE||(LA40_1 >= NUM_10 && LA40_1 <= NUM_8)||LA40_1==STRING||LA40_1==TRUE||LA40_1==VARIABLE||LA40_1==82||(LA40_1 >= 87 && LA40_1 <= 88)) ) {
									alt40=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 40, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 40, 0, input);
								throw nvae;
							}

							switch (alt40) {
								case 1 :
									// R5RS.g3:218:19: '(' ELSE sequence ')'
									{
									char_literal137=(Token)match(input,82,FOLLOW_82_in_derivedExpression1276); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal137_tree = (Object)adaptor.create(char_literal137);
									adaptor.addChild(root_0, char_literal137_tree);
									}

									ELSE138=(Token)match(input,ELSE,FOLLOW_ELSE_in_derivedExpression1278); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ELSE138_tree = (Object)adaptor.create(ELSE138);
									adaptor.addChild(root_0, ELSE138_tree);
									}

									pushFollow(FOLLOW_sequence_in_derivedExpression1280);
									sequence139=sequence();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence139.getTree());

									char_literal140=(Token)match(input,83,FOLLOW_83_in_derivedExpression1282); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal140_tree = (Object)adaptor.create(char_literal140);
									adaptor.addChild(root_0, char_literal140_tree);
									}

									}
									break;
								case 2 :
									// R5RS.g3:219:19: ( condClause )+ ( '(' ELSE sequence ')' )?
									{
									// R5RS.g3:219:19: ( condClause )+
									int cnt38=0;
									loop38:
									while (true) {
										int alt38=2;
										int LA38_0 = input.LA(1);
										if ( (LA38_0==82) ) {
											int LA38_1 = input.LA(2);
											if ( (LA38_1==CHARACTER||LA38_1==ELLIPSIS||LA38_1==FALSE||(LA38_1 >= NUM_10 && LA38_1 <= NUM_8)||LA38_1==STRING||LA38_1==TRUE||LA38_1==VARIABLE||LA38_1==82||(LA38_1 >= 87 && LA38_1 <= 88)) ) {
												alt38=1;
											}

										}

										switch (alt38) {
										case 1 :
											// R5RS.g3:219:19: condClause
											{
											pushFollow(FOLLOW_condClause_in_derivedExpression1302);
											condClause141=condClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, condClause141.getTree());

											}
											break;

										default :
											if ( cnt38 >= 1 ) break loop38;
											if (state.backtracking>0) {state.failed=true; return retval;}
											EarlyExitException eee = new EarlyExitException(38, input);
											throw eee;
										}
										cnt38++;
									}

									// R5RS.g3:219:31: ( '(' ELSE sequence ')' )?
									int alt39=2;
									int LA39_0 = input.LA(1);
									if ( (LA39_0==82) ) {
										alt39=1;
									}
									switch (alt39) {
										case 1 :
											// R5RS.g3:219:32: '(' ELSE sequence ')'
											{
											char_literal142=(Token)match(input,82,FOLLOW_82_in_derivedExpression1306); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											char_literal142_tree = (Object)adaptor.create(char_literal142);
											adaptor.addChild(root_0, char_literal142_tree);
											}

											ELSE143=(Token)match(input,ELSE,FOLLOW_ELSE_in_derivedExpression1308); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											ELSE143_tree = (Object)adaptor.create(ELSE143);
											adaptor.addChild(root_0, ELSE143_tree);
											}

											pushFollow(FOLLOW_sequence_in_derivedExpression1310);
											sequence144=sequence();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence144.getTree());

											char_literal145=(Token)match(input,83,FOLLOW_83_in_derivedExpression1312); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											char_literal145_tree = (Object)adaptor.create(char_literal145);
											adaptor.addChild(root_0, char_literal145_tree);
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
							// R5RS.g3:221:12: CASE expression ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? )
							{
							CASE146=(Token)match(input,CASE,FOLLOW_CASE_in_derivedExpression1346); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							CASE146_tree = (Object)adaptor.create(CASE146);
							adaptor.addChild(root_0, CASE146_tree);
							}

							pushFollow(FOLLOW_expression_in_derivedExpression1348);
							expression147=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression147.getTree());

							// R5RS.g3:221:28: ( '(' ELSE sequence ')' | ( caseClause )+ ( '(' ELSE sequence ')' )? )
							int alt43=2;
							int LA43_0 = input.LA(1);
							if ( (LA43_0==82) ) {
								int LA43_1 = input.LA(2);
								if ( (LA43_1==ELSE) ) {
									alt43=1;
								}
								else if ( (LA43_1==82) ) {
									alt43=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 43, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 43, 0, input);
								throw nvae;
							}

							switch (alt43) {
								case 1 :
									// R5RS.g3:221:30: '(' ELSE sequence ')'
									{
									char_literal148=(Token)match(input,82,FOLLOW_82_in_derivedExpression1352); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal148_tree = (Object)adaptor.create(char_literal148);
									adaptor.addChild(root_0, char_literal148_tree);
									}

									ELSE149=(Token)match(input,ELSE,FOLLOW_ELSE_in_derivedExpression1354); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ELSE149_tree = (Object)adaptor.create(ELSE149);
									adaptor.addChild(root_0, ELSE149_tree);
									}

									pushFollow(FOLLOW_sequence_in_derivedExpression1356);
									sequence150=sequence();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence150.getTree());

									char_literal151=(Token)match(input,83,FOLLOW_83_in_derivedExpression1358); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal151_tree = (Object)adaptor.create(char_literal151);
									adaptor.addChild(root_0, char_literal151_tree);
									}

									}
									break;
								case 2 :
									// R5RS.g3:222:30: ( caseClause )+ ( '(' ELSE sequence ')' )?
									{
									// R5RS.g3:222:30: ( caseClause )+
									int cnt41=0;
									loop41:
									while (true) {
										int alt41=2;
										int LA41_0 = input.LA(1);
										if ( (LA41_0==82) ) {
											int LA41_1 = input.LA(2);
											if ( (LA41_1==82) ) {
												alt41=1;
											}

										}

										switch (alt41) {
										case 1 :
											// R5RS.g3:222:30: caseClause
											{
											pushFollow(FOLLOW_caseClause_in_derivedExpression1389);
											caseClause152=caseClause();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, caseClause152.getTree());

											}
											break;

										default :
											if ( cnt41 >= 1 ) break loop41;
											if (state.backtracking>0) {state.failed=true; return retval;}
											EarlyExitException eee = new EarlyExitException(41, input);
											throw eee;
										}
										cnt41++;
									}

									// R5RS.g3:222:42: ( '(' ELSE sequence ')' )?
									int alt42=2;
									int LA42_0 = input.LA(1);
									if ( (LA42_0==82) ) {
										alt42=1;
									}
									switch (alt42) {
										case 1 :
											// R5RS.g3:222:43: '(' ELSE sequence ')'
											{
											char_literal153=(Token)match(input,82,FOLLOW_82_in_derivedExpression1393); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											char_literal153_tree = (Object)adaptor.create(char_literal153);
											adaptor.addChild(root_0, char_literal153_tree);
											}

											ELSE154=(Token)match(input,ELSE,FOLLOW_ELSE_in_derivedExpression1395); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											ELSE154_tree = (Object)adaptor.create(ELSE154);
											adaptor.addChild(root_0, ELSE154_tree);
											}

											pushFollow(FOLLOW_sequence_in_derivedExpression1397);
											sequence155=sequence();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence155.getTree());

											char_literal156=(Token)match(input,83,FOLLOW_83_in_derivedExpression1399); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											char_literal156_tree = (Object)adaptor.create(char_literal156);
											adaptor.addChild(root_0, char_literal156_tree);
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
							// R5RS.g3:224:12: AND ( test )*
							{
							AND157=(Token)match(input,AND,FOLLOW_AND_in_derivedExpression1444); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							AND157_tree = (Object)adaptor.create(AND157);
							adaptor.addChild(root_0, AND157_tree);
							}

							// R5RS.g3:224:16: ( test )*
							loop44:
							while (true) {
								int alt44=2;
								int LA44_0 = input.LA(1);
								if ( (LA44_0==CHARACTER||LA44_0==ELLIPSIS||LA44_0==FALSE||(LA44_0 >= NUM_10 && LA44_0 <= NUM_8)||LA44_0==STRING||LA44_0==TRUE||LA44_0==VARIABLE||LA44_0==82||(LA44_0 >= 87 && LA44_0 <= 88)) ) {
									alt44=1;
								}

								switch (alt44) {
								case 1 :
									// R5RS.g3:224:16: test
									{
									pushFollow(FOLLOW_test_in_derivedExpression1446);
									test158=test();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, test158.getTree());

									}
									break;

								default :
									break loop44;
								}
							}

							}
							break;
						case 4 :
							// R5RS.g3:225:12: OR ( test )*
							{
							OR159=(Token)match(input,OR,FOLLOW_OR_in_derivedExpression1460); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							OR159_tree = (Object)adaptor.create(OR159);
							adaptor.addChild(root_0, OR159_tree);
							}

							// R5RS.g3:225:15: ( test )*
							loop45:
							while (true) {
								int alt45=2;
								int LA45_0 = input.LA(1);
								if ( (LA45_0==CHARACTER||LA45_0==ELLIPSIS||LA45_0==FALSE||(LA45_0 >= NUM_10 && LA45_0 <= NUM_8)||LA45_0==STRING||LA45_0==TRUE||LA45_0==VARIABLE||LA45_0==82||(LA45_0 >= 87 && LA45_0 <= 88)) ) {
									alt45=1;
								}

								switch (alt45) {
								case 1 :
									// R5RS.g3:225:15: test
									{
									pushFollow(FOLLOW_test_in_derivedExpression1462);
									test160=test();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, test160.getTree());

									}
									break;

								default :
									break loop45;
								}
							}

							}
							break;
						case 5 :
							// R5RS.g3:226:12: LET ( variable )? '(' ( bindingSpec )* ')' body
							{
							LET161=(Token)match(input,LET,FOLLOW_LET_in_derivedExpression1476); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LET161_tree = (Object)adaptor.create(LET161);
							adaptor.addChild(root_0, LET161_tree);
							}

							// R5RS.g3:226:16: ( variable )?
							int alt46=2;
							int LA46_0 = input.LA(1);
							if ( (LA46_0==ELLIPSIS||LA46_0==VARIABLE) ) {
								alt46=1;
							}
							switch (alt46) {
								case 1 :
									// R5RS.g3:226:16: variable
									{
									pushFollow(FOLLOW_variable_in_derivedExpression1478);
									variable162=variable();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, variable162.getTree());

									}
									break;

							}

							char_literal163=(Token)match(input,82,FOLLOW_82_in_derivedExpression1481); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal163_tree = (Object)adaptor.create(char_literal163);
							adaptor.addChild(root_0, char_literal163_tree);
							}

							// R5RS.g3:226:30: ( bindingSpec )*
							loop47:
							while (true) {
								int alt47=2;
								int LA47_0 = input.LA(1);
								if ( (LA47_0==82) ) {
									alt47=1;
								}

								switch (alt47) {
								case 1 :
									// R5RS.g3:226:30: bindingSpec
									{
									pushFollow(FOLLOW_bindingSpec_in_derivedExpression1483);
									bindingSpec164=bindingSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, bindingSpec164.getTree());

									}
									break;

								default :
									break loop47;
								}
							}

							char_literal165=(Token)match(input,83,FOLLOW_83_in_derivedExpression1486); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal165_tree = (Object)adaptor.create(char_literal165);
							adaptor.addChild(root_0, char_literal165_tree);
							}

							pushFollow(FOLLOW_body_in_derivedExpression1488);
							body166=body();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, body166.getTree());

							}
							break;
						case 6 :
							// R5RS.g3:227:12: LETSTAR '(' ( bindingSpec )* ')' body
							{
							LETSTAR167=(Token)match(input,LETSTAR,FOLLOW_LETSTAR_in_derivedExpression1501); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LETSTAR167_tree = (Object)adaptor.create(LETSTAR167);
							adaptor.addChild(root_0, LETSTAR167_tree);
							}

							char_literal168=(Token)match(input,82,FOLLOW_82_in_derivedExpression1503); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal168_tree = (Object)adaptor.create(char_literal168);
							adaptor.addChild(root_0, char_literal168_tree);
							}

							// R5RS.g3:227:24: ( bindingSpec )*
							loop48:
							while (true) {
								int alt48=2;
								int LA48_0 = input.LA(1);
								if ( (LA48_0==82) ) {
									alt48=1;
								}

								switch (alt48) {
								case 1 :
									// R5RS.g3:227:24: bindingSpec
									{
									pushFollow(FOLLOW_bindingSpec_in_derivedExpression1505);
									bindingSpec169=bindingSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, bindingSpec169.getTree());

									}
									break;

								default :
									break loop48;
								}
							}

							char_literal170=(Token)match(input,83,FOLLOW_83_in_derivedExpression1508); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal170_tree = (Object)adaptor.create(char_literal170);
							adaptor.addChild(root_0, char_literal170_tree);
							}

							pushFollow(FOLLOW_body_in_derivedExpression1510);
							body171=body();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, body171.getTree());

							}
							break;
						case 7 :
							// R5RS.g3:228:12: LETREC '(' ( bindingSpec )* ')' body
							{
							LETREC172=(Token)match(input,LETREC,FOLLOW_LETREC_in_derivedExpression1523); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LETREC172_tree = (Object)adaptor.create(LETREC172);
							adaptor.addChild(root_0, LETREC172_tree);
							}

							char_literal173=(Token)match(input,82,FOLLOW_82_in_derivedExpression1525); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal173_tree = (Object)adaptor.create(char_literal173);
							adaptor.addChild(root_0, char_literal173_tree);
							}

							// R5RS.g3:228:23: ( bindingSpec )*
							loop49:
							while (true) {
								int alt49=2;
								int LA49_0 = input.LA(1);
								if ( (LA49_0==82) ) {
									alt49=1;
								}

								switch (alt49) {
								case 1 :
									// R5RS.g3:228:23: bindingSpec
									{
									pushFollow(FOLLOW_bindingSpec_in_derivedExpression1527);
									bindingSpec174=bindingSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, bindingSpec174.getTree());

									}
									break;

								default :
									break loop49;
								}
							}

							char_literal175=(Token)match(input,83,FOLLOW_83_in_derivedExpression1530); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal175_tree = (Object)adaptor.create(char_literal175);
							adaptor.addChild(root_0, char_literal175_tree);
							}

							pushFollow(FOLLOW_body_in_derivedExpression1532);
							body176=body();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, body176.getTree());

							}
							break;
						case 8 :
							// R5RS.g3:229:12: BEGIN sequence
							{
							BEGIN177=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_derivedExpression1545); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							BEGIN177_tree = (Object)adaptor.create(BEGIN177);
							adaptor.addChild(root_0, BEGIN177_tree);
							}

							pushFollow(FOLLOW_sequence_in_derivedExpression1547);
							sequence178=sequence();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence178.getTree());

							}
							break;
						case 9 :
							// R5RS.g3:230:12: DO '(' ( iterationSpec )* ')' '(' test ( doResult )? ')' ( command )*
							{
							DO179=(Token)match(input,DO,FOLLOW_DO_in_derivedExpression1560); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DO179_tree = (Object)adaptor.create(DO179);
							adaptor.addChild(root_0, DO179_tree);
							}

							char_literal180=(Token)match(input,82,FOLLOW_82_in_derivedExpression1562); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal180_tree = (Object)adaptor.create(char_literal180);
							adaptor.addChild(root_0, char_literal180_tree);
							}

							// R5RS.g3:230:19: ( iterationSpec )*
							loop50:
							while (true) {
								int alt50=2;
								int LA50_0 = input.LA(1);
								if ( (LA50_0==82) ) {
									alt50=1;
								}

								switch (alt50) {
								case 1 :
									// R5RS.g3:230:19: iterationSpec
									{
									pushFollow(FOLLOW_iterationSpec_in_derivedExpression1564);
									iterationSpec181=iterationSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, iterationSpec181.getTree());

									}
									break;

								default :
									break loop50;
								}
							}

							char_literal182=(Token)match(input,83,FOLLOW_83_in_derivedExpression1567); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal182_tree = (Object)adaptor.create(char_literal182);
							adaptor.addChild(root_0, char_literal182_tree);
							}

							char_literal183=(Token)match(input,82,FOLLOW_82_in_derivedExpression1569); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal183_tree = (Object)adaptor.create(char_literal183);
							adaptor.addChild(root_0, char_literal183_tree);
							}

							pushFollow(FOLLOW_test_in_derivedExpression1571);
							test184=test();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, test184.getTree());

							// R5RS.g3:230:47: ( doResult )?
							int alt51=2;
							int LA51_0 = input.LA(1);
							if ( (LA51_0==CHARACTER||LA51_0==ELLIPSIS||LA51_0==FALSE||(LA51_0 >= NUM_10 && LA51_0 <= NUM_8)||LA51_0==STRING||LA51_0==TRUE||LA51_0==VARIABLE||LA51_0==82||(LA51_0 >= 87 && LA51_0 <= 88)) ) {
								alt51=1;
							}
							switch (alt51) {
								case 1 :
									// R5RS.g3:230:47: doResult
									{
									pushFollow(FOLLOW_doResult_in_derivedExpression1573);
									doResult185=doResult();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, doResult185.getTree());

									}
									break;

							}

							char_literal186=(Token)match(input,83,FOLLOW_83_in_derivedExpression1576); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal186_tree = (Object)adaptor.create(char_literal186);
							adaptor.addChild(root_0, char_literal186_tree);
							}

							// R5RS.g3:230:61: ( command )*
							loop52:
							while (true) {
								int alt52=2;
								int LA52_0 = input.LA(1);
								if ( (LA52_0==CHARACTER||LA52_0==ELLIPSIS||LA52_0==FALSE||(LA52_0 >= NUM_10 && LA52_0 <= NUM_8)||LA52_0==STRING||LA52_0==TRUE||LA52_0==VARIABLE||LA52_0==82||(LA52_0 >= 87 && LA52_0 <= 88)) ) {
									alt52=1;
								}

								switch (alt52) {
								case 1 :
									// R5RS.g3:230:61: command
									{
									pushFollow(FOLLOW_command_in_derivedExpression1578);
									command187=command();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, command187.getTree());

									}
									break;

								default :
									break loop52;
								}
							}

							}
							break;
						case 10 :
							// R5RS.g3:231:12: DELAY expression
							{
							DELAY188=(Token)match(input,DELAY,FOLLOW_DELAY_in_derivedExpression1592); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DELAY188_tree = (Object)adaptor.create(DELAY188);
							adaptor.addChild(root_0, DELAY188_tree);
							}

							pushFollow(FOLLOW_expression_in_derivedExpression1594);
							expression189=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression189.getTree());

							}
							break;

					}

					char_literal190=(Token)match(input,83,FOLLOW_83_in_derivedExpression1613); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal190_tree = (Object)adaptor.create(char_literal190);
					adaptor.addChild(root_0, char_literal190_tree);
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
	// R5RS.g3:236:1: condClause : '(' test ( sequence | ARROW recipient )? ')' ;
	public final R5RSParser.condClause_return condClause() throws RecognitionException {
		R5RSParser.condClause_return retval = new R5RSParser.condClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal191=null;
		Token ARROW194=null;
		Token char_literal196=null;
		ParserRuleReturnScope test192 =null;
		ParserRuleReturnScope sequence193 =null;
		ParserRuleReturnScope recipient195 =null;

		Object char_literal191_tree=null;
		Object ARROW194_tree=null;
		Object char_literal196_tree=null;

		try {
			// R5RS.g3:237:3: ( '(' test ( sequence | ARROW recipient )? ')' )
			// R5RS.g3:237:6: '(' test ( sequence | ARROW recipient )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal191=(Token)match(input,82,FOLLOW_82_in_condClause1627); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal191_tree = (Object)adaptor.create(char_literal191);
			adaptor.addChild(root_0, char_literal191_tree);
			}

			pushFollow(FOLLOW_test_in_condClause1629);
			test192=test();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, test192.getTree());

			// R5RS.g3:237:15: ( sequence | ARROW recipient )?
			int alt55=3;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==CHARACTER||LA55_0==ELLIPSIS||LA55_0==FALSE||(LA55_0 >= NUM_10 && LA55_0 <= NUM_8)||LA55_0==STRING||LA55_0==TRUE||LA55_0==VARIABLE||LA55_0==82||(LA55_0 >= 87 && LA55_0 <= 88)) ) {
				alt55=1;
			}
			else if ( (LA55_0==ARROW) ) {
				alt55=2;
			}
			switch (alt55) {
				case 1 :
					// R5RS.g3:237:16: sequence
					{
					pushFollow(FOLLOW_sequence_in_condClause1632);
					sequence193=sequence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence193.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:237:27: ARROW recipient
					{
					ARROW194=(Token)match(input,ARROW,FOLLOW_ARROW_in_condClause1636); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ARROW194_tree = (Object)adaptor.create(ARROW194);
					adaptor.addChild(root_0, ARROW194_tree);
					}

					pushFollow(FOLLOW_recipient_in_condClause1638);
					recipient195=recipient();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recipient195.getTree());

					}
					break;

			}

			char_literal196=(Token)match(input,83,FOLLOW_83_in_condClause1642); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal196_tree = (Object)adaptor.create(char_literal196);
			adaptor.addChild(root_0, char_literal196_tree);
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
	// R5RS.g3:240:1: recipient : expression ;
	public final R5RSParser.recipient_return recipient() throws RecognitionException {
		R5RSParser.recipient_return retval = new R5RSParser.recipient_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression197 =null;


		try {
			// R5RS.g3:241:3: ( expression )
			// R5RS.g3:241:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_recipient1656);
			expression197=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression197.getTree());

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
	// R5RS.g3:244:1: caseClause : '(' '(' ( datum )* ')' sequence ')' ;
	public final R5RSParser.caseClause_return caseClause() throws RecognitionException {
		R5RSParser.caseClause_return retval = new R5RSParser.caseClause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal198=null;
		Token char_literal199=null;
		Token char_literal201=null;
		Token char_literal203=null;
		ParserRuleReturnScope datum200 =null;
		ParserRuleReturnScope sequence202 =null;

		Object char_literal198_tree=null;
		Object char_literal199_tree=null;
		Object char_literal201_tree=null;
		Object char_literal203_tree=null;

		try {
			// R5RS.g3:245:3: ( '(' '(' ( datum )* ')' sequence ')' )
			// R5RS.g3:245:6: '(' '(' ( datum )* ')' sequence ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal198=(Token)match(input,82,FOLLOW_82_in_caseClause1670); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal198_tree = (Object)adaptor.create(char_literal198);
			adaptor.addChild(root_0, char_literal198_tree);
			}

			char_literal199=(Token)match(input,82,FOLLOW_82_in_caseClause1672); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal199_tree = (Object)adaptor.create(char_literal199);
			adaptor.addChild(root_0, char_literal199_tree);
			}

			// R5RS.g3:245:14: ( datum )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( ((LA56_0 >= AND && LA56_0 <= CHARACTER)||LA56_0==COND||LA56_0==DEFINE||LA56_0==DELAY||(LA56_0 >= DO && LA56_0 <= ELSE)||(LA56_0 >= FALSE && LA56_0 <= IF)||(LA56_0 >= LAMBDA && LA56_0 <= LETREC)||LA56_0==LETSTAR||(LA56_0 >= NUM_10 && LA56_0 <= OR)||(LA56_0 >= QUASIQUOTE && LA56_0 <= QUOTE)||LA56_0==SET||LA56_0==STRING||LA56_0==TRUE||(LA56_0 >= UNQUOTE && LA56_0 <= UNQUOTE_SPLICING)||(LA56_0 >= VARIABLE && LA56_0 <= 82)||(LA56_0 >= 84 && LA56_0 <= 85)||(LA56_0 >= 87 && LA56_0 <= 88)) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// R5RS.g3:245:14: datum
					{
					pushFollow(FOLLOW_datum_in_caseClause1674);
					datum200=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum200.getTree());

					}
					break;

				default :
					break loop56;
				}
			}

			char_literal201=(Token)match(input,83,FOLLOW_83_in_caseClause1677); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal201_tree = (Object)adaptor.create(char_literal201);
			adaptor.addChild(root_0, char_literal201_tree);
			}

			pushFollow(FOLLOW_sequence_in_caseClause1679);
			sequence202=sequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence202.getTree());

			char_literal203=(Token)match(input,83,FOLLOW_83_in_caseClause1681); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal203_tree = (Object)adaptor.create(char_literal203);
			adaptor.addChild(root_0, char_literal203_tree);
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
	// R5RS.g3:248:1: bindingSpec : '(' variable expression ')' ;
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

		try {
			// R5RS.g3:249:3: ( '(' variable expression ')' )
			// R5RS.g3:249:6: '(' variable expression ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal204=(Token)match(input,82,FOLLOW_82_in_bindingSpec1695); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal204_tree = (Object)adaptor.create(char_literal204);
			adaptor.addChild(root_0, char_literal204_tree);
			}

			pushFollow(FOLLOW_variable_in_bindingSpec1697);
			variable205=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable205.getTree());

			pushFollow(FOLLOW_expression_in_bindingSpec1699);
			expression206=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression206.getTree());

			char_literal207=(Token)match(input,83,FOLLOW_83_in_bindingSpec1701); if (state.failed) return retval;
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
	// $ANTLR end "bindingSpec"


	public static class iterationSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "iterationSpec"
	// R5RS.g3:252:1: iterationSpec : '(' variable init ( step )? ')' ;
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

		try {
			// R5RS.g3:253:3: ( '(' variable init ( step )? ')' )
			// R5RS.g3:253:6: '(' variable init ( step )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal208=(Token)match(input,82,FOLLOW_82_in_iterationSpec1715); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal208_tree = (Object)adaptor.create(char_literal208);
			adaptor.addChild(root_0, char_literal208_tree);
			}

			pushFollow(FOLLOW_variable_in_iterationSpec1717);
			variable209=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable209.getTree());

			pushFollow(FOLLOW_init_in_iterationSpec1719);
			init210=init();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, init210.getTree());

			// R5RS.g3:253:24: ( step )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==CHARACTER||LA57_0==ELLIPSIS||LA57_0==FALSE||(LA57_0 >= NUM_10 && LA57_0 <= NUM_8)||LA57_0==STRING||LA57_0==TRUE||LA57_0==VARIABLE||LA57_0==82||(LA57_0 >= 87 && LA57_0 <= 88)) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// R5RS.g3:253:24: step
					{
					pushFollow(FOLLOW_step_in_iterationSpec1721);
					step211=step();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, step211.getTree());

					}
					break;

			}

			char_literal212=(Token)match(input,83,FOLLOW_83_in_iterationSpec1724); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal212_tree = (Object)adaptor.create(char_literal212);
			adaptor.addChild(root_0, char_literal212_tree);
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
	// R5RS.g3:256:1: init : expression ;
	public final R5RSParser.init_return init() throws RecognitionException {
		R5RSParser.init_return retval = new R5RSParser.init_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression213 =null;


		try {
			// R5RS.g3:257:3: ( expression )
			// R5RS.g3:257:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_init1738);
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
	// R5RS.g3:260:1: step : expression ;
	public final R5RSParser.step_return step() throws RecognitionException {
		R5RSParser.step_return retval = new R5RSParser.step_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression214 =null;


		try {
			// R5RS.g3:261:3: ( expression )
			// R5RS.g3:261:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_step1752);
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
	// R5RS.g3:264:1: doResult : sequence ;
	public final R5RSParser.doResult_return doResult() throws RecognitionException {
		R5RSParser.doResult_return retval = new R5RSParser.doResult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope sequence215 =null;


		try {
			// R5RS.g3:265:3: ( sequence )
			// R5RS.g3:265:6: sequence
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_sequence_in_doResult1766);
			sequence215=sequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence215.getTree());

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
	// R5RS.g3:268:1: procedureCall : '(' operator ( operand )* ')' ;
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

		try {
			// R5RS.g3:269:3: ( '(' operator ( operand )* ')' )
			// R5RS.g3:269:6: '(' operator ( operand )* ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal216=(Token)match(input,82,FOLLOW_82_in_procedureCall1780); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal216_tree = (Object)adaptor.create(char_literal216);
			adaptor.addChild(root_0, char_literal216_tree);
			}

			pushFollow(FOLLOW_operator_in_procedureCall1782);
			operator217=operator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, operator217.getTree());

			// R5RS.g3:269:19: ( operand )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==CHARACTER||LA58_0==ELLIPSIS||LA58_0==FALSE||(LA58_0 >= NUM_10 && LA58_0 <= NUM_8)||LA58_0==STRING||LA58_0==TRUE||LA58_0==VARIABLE||LA58_0==82||(LA58_0 >= 87 && LA58_0 <= 88)) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// R5RS.g3:269:19: operand
					{
					pushFollow(FOLLOW_operand_in_procedureCall1784);
					operand218=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operand218.getTree());

					}
					break;

				default :
					break loop58;
				}
			}

			char_literal219=(Token)match(input,83,FOLLOW_83_in_procedureCall1787); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal219_tree = (Object)adaptor.create(char_literal219);
			adaptor.addChild(root_0, char_literal219_tree);
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
	// R5RS.g3:272:1: operator : expression ;
	public final R5RSParser.operator_return operator() throws RecognitionException {
		R5RSParser.operator_return retval = new R5RSParser.operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression220 =null;


		try {
			// R5RS.g3:273:3: ( expression )
			// R5RS.g3:273:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_operator1801);
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
	// R5RS.g3:276:1: operand : expression ;
	public final R5RSParser.operand_return operand() throws RecognitionException {
		R5RSParser.operand_return retval = new R5RSParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression221 =null;


		try {
			// R5RS.g3:277:3: ( expression )
			// R5RS.g3:277:6: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_operand1815);
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
	// R5RS.g3:280:1: macroUse : '(' keyword ( datum )* ')' ;
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
			// R5RS.g3:281:3: ( '(' keyword ( datum )* ')' )
			// R5RS.g3:281:6: '(' keyword ( datum )* ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal222=(Token)match(input,82,FOLLOW_82_in_macroUse1829); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal222_tree = (Object)adaptor.create(char_literal222);
			adaptor.addChild(root_0, char_literal222_tree);
			}

			pushFollow(FOLLOW_keyword_in_macroUse1831);
			keyword223=keyword();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword223.getTree());

			// R5RS.g3:281:18: ( datum )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( ((LA59_0 >= AND && LA59_0 <= CHARACTER)||LA59_0==COND||LA59_0==DEFINE||LA59_0==DELAY||(LA59_0 >= DO && LA59_0 <= ELSE)||(LA59_0 >= FALSE && LA59_0 <= IF)||(LA59_0 >= LAMBDA && LA59_0 <= LETREC)||LA59_0==LETSTAR||(LA59_0 >= NUM_10 && LA59_0 <= OR)||(LA59_0 >= QUASIQUOTE && LA59_0 <= QUOTE)||LA59_0==SET||LA59_0==STRING||LA59_0==TRUE||(LA59_0 >= UNQUOTE && LA59_0 <= UNQUOTE_SPLICING)||(LA59_0 >= VARIABLE && LA59_0 <= 82)||(LA59_0 >= 84 && LA59_0 <= 85)||(LA59_0 >= 87 && LA59_0 <= 88)) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// R5RS.g3:281:18: datum
					{
					pushFollow(FOLLOW_datum_in_macroUse1833);
					datum224=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum224.getTree());

					}
					break;

				default :
					break loop59;
				}
			}

			char_literal225=(Token)match(input,83,FOLLOW_83_in_macroUse1836); if (state.failed) return retval;
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
	// R5RS.g3:284:1: macroBlock : '(' ( LET_SYNTAX | LETREC_SYNTAX ) '(' ( syntaxSpec )* ')' body ')' ;
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
			// R5RS.g3:285:3: ( '(' ( LET_SYNTAX | LETREC_SYNTAX ) '(' ( syntaxSpec )* ')' body ')' )
			// R5RS.g3:285:6: '(' ( LET_SYNTAX | LETREC_SYNTAX ) '(' ( syntaxSpec )* ')' body ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal226=(Token)match(input,82,FOLLOW_82_in_macroBlock1850); if (state.failed) return retval;
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
			char_literal228=(Token)match(input,82,FOLLOW_82_in_macroBlock1860); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal228_tree = (Object)adaptor.create(char_literal228);
			adaptor.addChild(root_0, char_literal228_tree);
			}

			// R5RS.g3:285:43: ( syntaxSpec )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==82) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// R5RS.g3:285:43: syntaxSpec
					{
					pushFollow(FOLLOW_syntaxSpec_in_macroBlock1862);
					syntaxSpec229=syntaxSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, syntaxSpec229.getTree());

					}
					break;

				default :
					break loop60;
				}
			}

			char_literal230=(Token)match(input,83,FOLLOW_83_in_macroBlock1865); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal230_tree = (Object)adaptor.create(char_literal230);
			adaptor.addChild(root_0, char_literal230_tree);
			}

			pushFollow(FOLLOW_body_in_macroBlock1867);
			body231=body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, body231.getTree());

			char_literal232=(Token)match(input,83,FOLLOW_83_in_macroBlock1869); if (state.failed) return retval;
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
	// R5RS.g3:288:1: syntaxSpec : '(' keyword transformerSpec ')' ;
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
			// R5RS.g3:289:3: ( '(' keyword transformerSpec ')' )
			// R5RS.g3:289:6: '(' keyword transformerSpec ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal233=(Token)match(input,82,FOLLOW_82_in_syntaxSpec1883); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal233_tree = (Object)adaptor.create(char_literal233);
			adaptor.addChild(root_0, char_literal233_tree);
			}

			pushFollow(FOLLOW_keyword_in_syntaxSpec1885);
			keyword234=keyword();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword234.getTree());

			pushFollow(FOLLOW_transformerSpec_in_syntaxSpec1887);
			transformerSpec235=transformerSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, transformerSpec235.getTree());

			char_literal236=(Token)match(input,83,FOLLOW_83_in_syntaxSpec1889); if (state.failed) return retval;
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
	// R5RS.g3:292:1: body : ( ( definition )=> definition )* sequence ;
	public final R5RSParser.body_return body() throws RecognitionException {
		R5RSParser.body_return retval = new R5RSParser.body_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope definition237 =null;
		ParserRuleReturnScope sequence238 =null;


		try {
			// R5RS.g3:293:3: ( ( ( definition )=> definition )* sequence )
			// R5RS.g3:293:6: ( ( definition )=> definition )* sequence
			{
			root_0 = (Object)adaptor.nil();


			// R5RS.g3:293:6: ( ( definition )=> definition )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==82) ) {
					int LA61_4 = input.LA(2);
					if ( (synpred12_R5RS()) ) {
						alt61=1;
					}

				}

				switch (alt61) {
				case 1 :
					// R5RS.g3:293:7: ( definition )=> definition
					{
					pushFollow(FOLLOW_definition_in_body1909);
					definition237=definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, definition237.getTree());

					}
					break;

				default :
					break loop61;
				}
			}

			pushFollow(FOLLOW_sequence_in_body1913);
			sequence238=sequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence238.getTree());

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
	// R5RS.g3:300:1: sequence : ( expression )+ ;
	public final R5RSParser.sequence_return sequence() throws RecognitionException {
		R5RSParser.sequence_return retval = new R5RSParser.sequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression239 =null;


		try {
			// R5RS.g3:301:3: ( ( expression )+ )
			// R5RS.g3:301:6: ( expression )+
			{
			root_0 = (Object)adaptor.nil();


			// R5RS.g3:301:6: ( expression )+
			int cnt62=0;
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==CHARACTER||LA62_0==ELLIPSIS||LA62_0==FALSE||(LA62_0 >= NUM_10 && LA62_0 <= NUM_8)||LA62_0==STRING||LA62_0==TRUE||LA62_0==VARIABLE||LA62_0==82||(LA62_0 >= 87 && LA62_0 <= 88)) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// R5RS.g3:301:6: expression
					{
					pushFollow(FOLLOW_expression_in_sequence1931);
					expression239=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression239.getTree());

					}
					break;

				default :
					if ( cnt62 >= 1 ) break loop62;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(62, input);
					throw eee;
				}
				cnt62++;
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
	// R5RS.g3:304:1: datum : ( simpleDatum | compoundDatum );
	public final R5RSParser.datum_return datum() throws RecognitionException {
		R5RSParser.datum_return retval = new R5RSParser.datum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simpleDatum240 =null;
		ParserRuleReturnScope compoundDatum241 =null;


		try {
			// R5RS.g3:305:3: ( simpleDatum | compoundDatum )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( ((LA63_0 >= AND && LA63_0 <= CHARACTER)||LA63_0==COND||LA63_0==DEFINE||LA63_0==DELAY||(LA63_0 >= DO && LA63_0 <= ELSE)||(LA63_0 >= FALSE && LA63_0 <= IF)||(LA63_0 >= LAMBDA && LA63_0 <= LETREC)||LA63_0==LETSTAR||(LA63_0 >= NUM_10 && LA63_0 <= OR)||(LA63_0 >= QUASIQUOTE && LA63_0 <= QUOTE)||LA63_0==SET||LA63_0==STRING||LA63_0==TRUE||(LA63_0 >= UNQUOTE && LA63_0 <= UNQUOTE_SPLICING)||LA63_0==VARIABLE) ) {
				alt63=1;
			}
			else if ( ((LA63_0 >= 81 && LA63_0 <= 82)||(LA63_0 >= 84 && LA63_0 <= 85)||(LA63_0 >= 87 && LA63_0 <= 88)) ) {
				alt63=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// R5RS.g3:305:6: simpleDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleDatum_in_datum1946);
					simpleDatum240=simpleDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDatum240.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:306:6: compoundDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_compoundDatum_in_datum1953);
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
	// R5RS.g3:309:1: simpleDatum : ( bool | number | CHARACTER | STRING | identifier );
	public final R5RSParser.simpleDatum_return simpleDatum() throws RecognitionException {
		R5RSParser.simpleDatum_return retval = new R5RSParser.simpleDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHARACTER244=null;
		Token STRING245=null;
		ParserRuleReturnScope bool242 =null;
		ParserRuleReturnScope number243 =null;
		ParserRuleReturnScope identifier246 =null;

		Object CHARACTER244_tree=null;
		Object STRING245_tree=null;

		try {
			// R5RS.g3:310:3: ( bool | number | CHARACTER | STRING | identifier )
			int alt64=5;
			switch ( input.LA(1) ) {
			case FALSE:
			case TRUE:
				{
				alt64=1;
				}
				break;
			case NUM_10:
			case NUM_16:
			case NUM_2:
			case NUM_8:
				{
				alt64=2;
				}
				break;
			case CHARACTER:
				{
				alt64=3;
				}
				break;
			case STRING:
				{
				alt64=4;
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
				alt64=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}
			switch (alt64) {
				case 1 :
					// R5RS.g3:310:6: bool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_in_simpleDatum1967);
					bool242=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool242.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:311:6: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_simpleDatum1974);
					number243=number();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number243.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:312:6: CHARACTER
					{
					root_0 = (Object)adaptor.nil();


					CHARACTER244=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_simpleDatum1981); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHARACTER244_tree = (Object)adaptor.create(CHARACTER244);
					adaptor.addChild(root_0, CHARACTER244_tree);
					}

					}
					break;
				case 4 :
					// R5RS.g3:313:6: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING245=(Token)match(input,STRING,FOLLOW_STRING_in_simpleDatum1988); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING245_tree = (Object)adaptor.create(STRING245);
					adaptor.addChild(root_0, STRING245_tree);
					}

					}
					break;
				case 5 :
					// R5RS.g3:314:6: identifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_simpleDatum1995);
					identifier246=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier246.getTree());

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
	// R5RS.g3:317:1: compoundDatum : ( list | vector );
	public final R5RSParser.compoundDatum_return compoundDatum() throws RecognitionException {
		R5RSParser.compoundDatum_return retval = new R5RSParser.compoundDatum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope list247 =null;
		ParserRuleReturnScope vector248 =null;


		try {
			// R5RS.g3:318:3: ( list | vector )
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==82||(LA65_0 >= 84 && LA65_0 <= 85)||(LA65_0 >= 87 && LA65_0 <= 88)) ) {
				alt65=1;
			}
			else if ( (LA65_0==81) ) {
				alt65=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// R5RS.g3:318:6: list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_list_in_compoundDatum2009);
					list247=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, list247.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:319:6: vector
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_vector_in_compoundDatum2016);
					vector248=vector();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, vector248.getTree());

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
	// R5RS.g3:322:1: list : ( '(' ( ( datum )+ ( '.' datum )? )? ')' | abbreviation );
	public final R5RSParser.list_return list() throws RecognitionException {
		R5RSParser.list_return retval = new R5RSParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal249=null;
		Token char_literal251=null;
		Token char_literal253=null;
		ParserRuleReturnScope datum250 =null;
		ParserRuleReturnScope datum252 =null;
		ParserRuleReturnScope abbreviation254 =null;

		Object char_literal249_tree=null;
		Object char_literal251_tree=null;
		Object char_literal253_tree=null;

		try {
			// R5RS.g3:323:3: ( '(' ( ( datum )+ ( '.' datum )? )? ')' | abbreviation )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==82) ) {
				alt69=1;
			}
			else if ( ((LA69_0 >= 84 && LA69_0 <= 85)||(LA69_0 >= 87 && LA69_0 <= 88)) ) {
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
					// R5RS.g3:323:6: '(' ( ( datum )+ ( '.' datum )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal249=(Token)match(input,82,FOLLOW_82_in_list2030); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal249_tree = (Object)adaptor.create(char_literal249);
					adaptor.addChild(root_0, char_literal249_tree);
					}

					// R5RS.g3:323:10: ( ( datum )+ ( '.' datum )? )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( ((LA68_0 >= AND && LA68_0 <= CHARACTER)||LA68_0==COND||LA68_0==DEFINE||LA68_0==DELAY||(LA68_0 >= DO && LA68_0 <= ELSE)||(LA68_0 >= FALSE && LA68_0 <= IF)||(LA68_0 >= LAMBDA && LA68_0 <= LETREC)||LA68_0==LETSTAR||(LA68_0 >= NUM_10 && LA68_0 <= OR)||(LA68_0 >= QUASIQUOTE && LA68_0 <= QUOTE)||LA68_0==SET||LA68_0==STRING||LA68_0==TRUE||(LA68_0 >= UNQUOTE && LA68_0 <= UNQUOTE_SPLICING)||(LA68_0 >= VARIABLE && LA68_0 <= 82)||(LA68_0 >= 84 && LA68_0 <= 85)||(LA68_0 >= 87 && LA68_0 <= 88)) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// R5RS.g3:323:11: ( datum )+ ( '.' datum )?
							{
							// R5RS.g3:323:11: ( datum )+
							int cnt66=0;
							loop66:
							while (true) {
								int alt66=2;
								int LA66_0 = input.LA(1);
								if ( ((LA66_0 >= AND && LA66_0 <= CHARACTER)||LA66_0==COND||LA66_0==DEFINE||LA66_0==DELAY||(LA66_0 >= DO && LA66_0 <= ELSE)||(LA66_0 >= FALSE && LA66_0 <= IF)||(LA66_0 >= LAMBDA && LA66_0 <= LETREC)||LA66_0==LETSTAR||(LA66_0 >= NUM_10 && LA66_0 <= OR)||(LA66_0 >= QUASIQUOTE && LA66_0 <= QUOTE)||LA66_0==SET||LA66_0==STRING||LA66_0==TRUE||(LA66_0 >= UNQUOTE && LA66_0 <= UNQUOTE_SPLICING)||(LA66_0 >= VARIABLE && LA66_0 <= 82)||(LA66_0 >= 84 && LA66_0 <= 85)||(LA66_0 >= 87 && LA66_0 <= 88)) ) {
									alt66=1;
								}

								switch (alt66) {
								case 1 :
									// R5RS.g3:323:11: datum
									{
									pushFollow(FOLLOW_datum_in_list2033);
									datum250=datum();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, datum250.getTree());

									}
									break;

								default :
									if ( cnt66 >= 1 ) break loop66;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(66, input);
									throw eee;
								}
								cnt66++;
							}

							// R5RS.g3:323:18: ( '.' datum )?
							int alt67=2;
							int LA67_0 = input.LA(1);
							if ( (LA67_0==86) ) {
								alt67=1;
							}
							switch (alt67) {
								case 1 :
									// R5RS.g3:323:19: '.' datum
									{
									char_literal251=(Token)match(input,86,FOLLOW_86_in_list2037); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal251_tree = (Object)adaptor.create(char_literal251);
									adaptor.addChild(root_0, char_literal251_tree);
									}

									pushFollow(FOLLOW_datum_in_list2039);
									datum252=datum();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, datum252.getTree());

									}
									break;

							}

							}
							break;

					}

					char_literal253=(Token)match(input,83,FOLLOW_83_in_list2045); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal253_tree = (Object)adaptor.create(char_literal253);
					adaptor.addChild(root_0, char_literal253_tree);
					}

					}
					break;
				case 2 :
					// R5RS.g3:324:6: abbreviation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_abbreviation_in_list2052);
					abbreviation254=abbreviation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, abbreviation254.getTree());

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
	// R5RS.g3:327:1: abbreviation : abbrevPrefix datum ;
	public final R5RSParser.abbreviation_return abbreviation() throws RecognitionException {
		R5RSParser.abbreviation_return retval = new R5RSParser.abbreviation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope abbrevPrefix255 =null;
		ParserRuleReturnScope datum256 =null;


		try {
			// R5RS.g3:328:3: ( abbrevPrefix datum )
			// R5RS.g3:328:6: abbrevPrefix datum
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_abbrevPrefix_in_abbreviation2066);
			abbrevPrefix255=abbrevPrefix();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, abbrevPrefix255.getTree());

			pushFollow(FOLLOW_datum_in_abbreviation2068);
			datum256=datum();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, datum256.getTree());

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
	// R5RS.g3:331:1: abbrevPrefix : ( '\\'' | '`' | ',@' | ',' );
	public final R5RSParser.abbrevPrefix_return abbrevPrefix() throws RecognitionException {
		R5RSParser.abbrevPrefix_return retval = new R5RSParser.abbrevPrefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set257=null;

		Object set257_tree=null;

		try {
			// R5RS.g3:332:3: ( '\\'' | '`' | ',@' | ',' )
			// R5RS.g3:
			{
			root_0 = (Object)adaptor.nil();


			set257=input.LT(1);
			if ( (input.LA(1) >= 84 && input.LA(1) <= 85)||(input.LA(1) >= 87 && input.LA(1) <= 88) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set257));
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
	// R5RS.g3:335:1: vector : '#(' ( datum )* ')' ;
	public final R5RSParser.vector_return vector() throws RecognitionException {
		R5RSParser.vector_return retval = new R5RSParser.vector_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal258=null;
		Token char_literal260=null;
		ParserRuleReturnScope datum259 =null;

		Object string_literal258_tree=null;
		Object char_literal260_tree=null;

		try {
			// R5RS.g3:336:3: ( '#(' ( datum )* ')' )
			// R5RS.g3:336:6: '#(' ( datum )* ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal258=(Token)match(input,81,FOLLOW_81_in_vector2108); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal258_tree = (Object)adaptor.create(string_literal258);
			adaptor.addChild(root_0, string_literal258_tree);
			}

			// R5RS.g3:336:11: ( datum )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( ((LA70_0 >= AND && LA70_0 <= CHARACTER)||LA70_0==COND||LA70_0==DEFINE||LA70_0==DELAY||(LA70_0 >= DO && LA70_0 <= ELSE)||(LA70_0 >= FALSE && LA70_0 <= IF)||(LA70_0 >= LAMBDA && LA70_0 <= LETREC)||LA70_0==LETSTAR||(LA70_0 >= NUM_10 && LA70_0 <= OR)||(LA70_0 >= QUASIQUOTE && LA70_0 <= QUOTE)||LA70_0==SET||LA70_0==STRING||LA70_0==TRUE||(LA70_0 >= UNQUOTE && LA70_0 <= UNQUOTE_SPLICING)||(LA70_0 >= VARIABLE && LA70_0 <= 82)||(LA70_0 >= 84 && LA70_0 <= 85)||(LA70_0 >= 87 && LA70_0 <= 88)) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// R5RS.g3:336:11: datum
					{
					pushFollow(FOLLOW_datum_in_vector2110);
					datum259=datum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datum259.getTree());

					}
					break;

				default :
					break loop70;
				}
			}

			char_literal260=(Token)match(input,83,FOLLOW_83_in_vector2113); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal260_tree = (Object)adaptor.create(char_literal260);
			adaptor.addChild(root_0, char_literal260_tree);
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
	// R5RS.g3:339:1: number : ( NUM_2 | NUM_8 | NUM_10 | NUM_16 );
	public final R5RSParser.number_return number() throws RecognitionException {
		R5RSParser.number_return retval = new R5RSParser.number_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set261=null;

		Object set261_tree=null;

		try {
			// R5RS.g3:340:3: ( NUM_2 | NUM_8 | NUM_10 | NUM_16 )
			// R5RS.g3:
			{
			root_0 = (Object)adaptor.nil();


			set261=input.LT(1);
			if ( (input.LA(1) >= NUM_10 && input.LA(1) <= NUM_8) ) {
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
	// $ANTLR end "number"


	public static class bool_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bool"
	// R5RS.g3:346:1: bool : ( TRUE | FALSE );
	public final R5RSParser.bool_return bool() throws RecognitionException {
		R5RSParser.bool_return retval = new R5RSParser.bool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set262=null;

		Object set262_tree=null;

		try {
			// R5RS.g3:347:3: ( TRUE | FALSE )
			// R5RS.g3:
			{
			root_0 = (Object)adaptor.nil();


			set262=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set262));
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
	// R5RS.g3:351:1: quasiquotation : quasiquotationD[1] ;
	public final R5RSParser.quasiquotation_return quasiquotation() throws RecognitionException {
		R5RSParser.quasiquotation_return retval = new R5RSParser.quasiquotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope quasiquotationD263 =null;


		try {
			// R5RS.g3:352:3: ( quasiquotationD[1] )
			// R5RS.g3:352:6: quasiquotationD[1]
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_quasiquotationD_in_quasiquotation2183);
			quasiquotationD263=quasiquotationD(1);
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, quasiquotationD263.getTree());

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
	// R5RS.g3:355:1: quasiquotationD[int d] : ( '`' qqTemplate[d] | '(' QUASIQUOTE qqTemplate[d] ')' );
	public final R5RSParser.quasiquotationD_return quasiquotationD(int d) throws RecognitionException {
		R5RSParser.quasiquotationD_return retval = new R5RSParser.quasiquotationD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal264=null;
		Token char_literal266=null;
		Token QUASIQUOTE267=null;
		Token char_literal269=null;
		ParserRuleReturnScope qqTemplate265 =null;
		ParserRuleReturnScope qqTemplate268 =null;

		Object char_literal264_tree=null;
		Object char_literal266_tree=null;
		Object QUASIQUOTE267_tree=null;
		Object char_literal269_tree=null;

		try {
			// R5RS.g3:356:3: ( '`' qqTemplate[d] | '(' QUASIQUOTE qqTemplate[d] ')' )
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==88) ) {
				alt71=1;
			}
			else if ( (LA71_0==82) ) {
				alt71=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// R5RS.g3:356:6: '`' qqTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					char_literal264=(Token)match(input,88,FOLLOW_88_in_quasiquotationD2199); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal264_tree = (Object)adaptor.create(char_literal264);
					adaptor.addChild(root_0, char_literal264_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_quasiquotationD2201);
					qqTemplate265=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate265.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:357:6: '(' QUASIQUOTE qqTemplate[d] ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal266=(Token)match(input,82,FOLLOW_82_in_quasiquotationD2209); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal266_tree = (Object)adaptor.create(char_literal266);
					adaptor.addChild(root_0, char_literal266_tree);
					}

					QUASIQUOTE267=(Token)match(input,QUASIQUOTE,FOLLOW_QUASIQUOTE_in_quasiquotationD2211); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					QUASIQUOTE267_tree = (Object)adaptor.create(QUASIQUOTE267);
					adaptor.addChild(root_0, QUASIQUOTE267_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_quasiquotationD2213);
					qqTemplate268=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate268.getTree());

					char_literal269=(Token)match(input,83,FOLLOW_83_in_quasiquotationD2216); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal269_tree = (Object)adaptor.create(char_literal269);
					adaptor.addChild(root_0, char_literal269_tree);
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
	// R5RS.g3:360:1: qqTemplate[int d] : ( ( expression )=> expression | ( '(' UNQUOTE )=> unquotation[d] | simpleDatum | vectorQQTemplate[d] | listQQTemplate[d] );
	public final R5RSParser.qqTemplate_return qqTemplate(int d) throws RecognitionException {
		R5RSParser.qqTemplate_return retval = new R5RSParser.qqTemplate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression270 =null;
		ParserRuleReturnScope unquotation271 =null;
		ParserRuleReturnScope simpleDatum272 =null;
		ParserRuleReturnScope vectorQQTemplate273 =null;
		ParserRuleReturnScope listQQTemplate274 =null;


		try {
			// R5RS.g3:361:3: ( ( expression )=> expression | ( '(' UNQUOTE )=> unquotation[d] | simpleDatum | vectorQQTemplate[d] | listQQTemplate[d] )
			int alt72=5;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==VARIABLE) ) {
				int LA72_1 = input.LA(2);
				if ( (synpred13_R5RS()) ) {
					alt72=1;
				}
				else if ( (true) ) {
					alt72=3;
				}

			}
			else if ( (LA72_0==ELLIPSIS) ) {
				int LA72_2 = input.LA(2);
				if ( (synpred13_R5RS()) ) {
					alt72=1;
				}
				else if ( (true) ) {
					alt72=3;
				}

			}
			else if ( (LA72_0==87) ) {
				int LA72_3 = input.LA(2);
				if ( (synpred13_R5RS()) ) {
					alt72=1;
				}
				else if ( (true) ) {
					alt72=5;
				}

			}
			else if ( (LA72_0==82) ) {
				int LA72_4 = input.LA(2);
				if ( (synpred13_R5RS()) ) {
					alt72=1;
				}
				else if ( (synpred14_R5RS()) ) {
					alt72=2;
				}
				else if ( (true) ) {
					alt72=5;
				}

			}
			else if ( (LA72_0==FALSE||LA72_0==TRUE) ) {
				int LA72_5 = input.LA(2);
				if ( (synpred13_R5RS()) ) {
					alt72=1;
				}
				else if ( (true) ) {
					alt72=3;
				}

			}
			else if ( ((LA72_0 >= NUM_10 && LA72_0 <= NUM_8)) ) {
				int LA72_6 = input.LA(2);
				if ( (synpred13_R5RS()) ) {
					alt72=1;
				}
				else if ( (true) ) {
					alt72=3;
				}

			}
			else if ( (LA72_0==CHARACTER) ) {
				int LA72_7 = input.LA(2);
				if ( (synpred13_R5RS()) ) {
					alt72=1;
				}
				else if ( (true) ) {
					alt72=3;
				}

			}
			else if ( (LA72_0==STRING) ) {
				int LA72_8 = input.LA(2);
				if ( (synpred13_R5RS()) ) {
					alt72=1;
				}
				else if ( (true) ) {
					alt72=3;
				}

			}
			else if ( (LA72_0==88) ) {
				int LA72_9 = input.LA(2);
				if ( (synpred13_R5RS()) ) {
					alt72=1;
				}
				else if ( (true) ) {
					alt72=5;
				}

			}
			else if ( (LA72_0==84) && (synpred14_R5RS())) {
				alt72=2;
			}
			else if ( ((LA72_0 >= AND && LA72_0 <= CASE)||LA72_0==COND||LA72_0==DEFINE||LA72_0==DELAY||LA72_0==DO||LA72_0==ELSE||LA72_0==IF||(LA72_0 >= LAMBDA && LA72_0 <= LETREC)||LA72_0==LETSTAR||LA72_0==OR||(LA72_0 >= QUASIQUOTE && LA72_0 <= QUOTE)||LA72_0==SET||(LA72_0 >= UNQUOTE && LA72_0 <= UNQUOTE_SPLICING)) ) {
				alt72=3;
			}
			else if ( (LA72_0==81) ) {
				alt72=4;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}

			switch (alt72) {
				case 1 :
					// R5RS.g3:361:6: ( expression )=> expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_qqTemplate2237);
					expression270=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression270.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:362:6: ( '(' UNQUOTE )=> unquotation[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unquotation_in_qqTemplate2251);
					unquotation271=unquotation(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unquotation271.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:363:22: simpleDatum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleDatum_in_qqTemplate2275);
					simpleDatum272=simpleDatum();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDatum272.getTree());

					}
					break;
				case 4 :
					// R5RS.g3:364:22: vectorQQTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_vectorQQTemplate_in_qqTemplate2298);
					vectorQQTemplate273=vectorQQTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, vectorQQTemplate273.getTree());

					}
					break;
				case 5 :
					// R5RS.g3:365:22: listQQTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_listQQTemplate_in_qqTemplate2322);
					listQQTemplate274=listQQTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, listQQTemplate274.getTree());

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
	// R5RS.g3:368:1: vectorQQTemplate[int d] : '#(' ( qqTemplateOrSplice[d] )* ')' ;
	public final R5RSParser.vectorQQTemplate_return vectorQQTemplate(int d) throws RecognitionException {
		R5RSParser.vectorQQTemplate_return retval = new R5RSParser.vectorQQTemplate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal275=null;
		Token char_literal277=null;
		ParserRuleReturnScope qqTemplateOrSplice276 =null;

		Object string_literal275_tree=null;
		Object char_literal277_tree=null;

		try {
			// R5RS.g3:369:3: ( '#(' ( qqTemplateOrSplice[d] )* ')' )
			// R5RS.g3:369:6: '#(' ( qqTemplateOrSplice[d] )* ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal275=(Token)match(input,81,FOLLOW_81_in_vectorQQTemplate2338); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal275_tree = (Object)adaptor.create(string_literal275);
			adaptor.addChild(root_0, string_literal275_tree);
			}

			// R5RS.g3:369:11: ( qqTemplateOrSplice[d] )*
			loop73:
			while (true) {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( ((LA73_0 >= AND && LA73_0 <= CHARACTER)||LA73_0==COND||LA73_0==DEFINE||LA73_0==DELAY||(LA73_0 >= DO && LA73_0 <= ELSE)||(LA73_0 >= FALSE && LA73_0 <= IF)||(LA73_0 >= LAMBDA && LA73_0 <= LETREC)||LA73_0==LETSTAR||(LA73_0 >= NUM_10 && LA73_0 <= OR)||(LA73_0 >= QUASIQUOTE && LA73_0 <= QUOTE)||LA73_0==SET||LA73_0==STRING||LA73_0==TRUE||(LA73_0 >= UNQUOTE && LA73_0 <= UNQUOTE_SPLICING)||(LA73_0 >= VARIABLE && LA73_0 <= 82)||(LA73_0 >= 84 && LA73_0 <= 85)||(LA73_0 >= 87 && LA73_0 <= 88)) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// R5RS.g3:369:11: qqTemplateOrSplice[d]
					{
					pushFollow(FOLLOW_qqTemplateOrSplice_in_vectorQQTemplate2340);
					qqTemplateOrSplice276=qqTemplateOrSplice(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplateOrSplice276.getTree());

					}
					break;

				default :
					break loop73;
				}
			}

			char_literal277=(Token)match(input,83,FOLLOW_83_in_vectorQQTemplate2344); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal277_tree = (Object)adaptor.create(char_literal277);
			adaptor.addChild(root_0, char_literal277_tree);
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
	// R5RS.g3:372:1: listQQTemplate[int d] : ( '\\'' qqTemplate[d] | ( '(' QUASIQUOTE )=> quasiquotationD[d+1] | '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')' );
	public final R5RSParser.listQQTemplate_return listQQTemplate(int d) throws RecognitionException {
		R5RSParser.listQQTemplate_return retval = new R5RSParser.listQQTemplate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal278=null;
		Token char_literal281=null;
		Token char_literal283=null;
		Token char_literal285=null;
		ParserRuleReturnScope qqTemplate279 =null;
		ParserRuleReturnScope quasiquotationD280 =null;
		ParserRuleReturnScope qqTemplateOrSplice282 =null;
		ParserRuleReturnScope qqTemplate284 =null;

		Object char_literal278_tree=null;
		Object char_literal281_tree=null;
		Object char_literal283_tree=null;
		Object char_literal285_tree=null;

		try {
			// R5RS.g3:373:3: ( '\\'' qqTemplate[d] | ( '(' QUASIQUOTE )=> quasiquotationD[d+1] | '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')' )
			int alt77=3;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==87) ) {
				alt77=1;
			}
			else if ( (LA77_0==88) && (synpred15_R5RS())) {
				alt77=2;
			}
			else if ( (LA77_0==82) ) {
				int LA77_3 = input.LA(2);
				if ( (synpred15_R5RS()) ) {
					alt77=2;
				}
				else if ( (true) ) {
					alt77=3;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// R5RS.g3:373:25: '\\'' qqTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					char_literal278=(Token)match(input,87,FOLLOW_87_in_listQQTemplate2378); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal278_tree = (Object)adaptor.create(char_literal278);
					adaptor.addChild(root_0, char_literal278_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_listQQTemplate2380);
					qqTemplate279=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate279.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:374:6: ( '(' QUASIQUOTE )=> quasiquotationD[d+1]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_quasiquotationD_in_listQQTemplate2395);
					quasiquotationD280=quasiquotationD(d+1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quasiquotationD280.getTree());

					}
					break;
				case 3 :
					// R5RS.g3:375:25: '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal281=(Token)match(input,82,FOLLOW_82_in_listQQTemplate2422); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal281_tree = (Object)adaptor.create(char_literal281);
					adaptor.addChild(root_0, char_literal281_tree);
					}

					// R5RS.g3:375:29: ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( ((LA76_0 >= AND && LA76_0 <= CHARACTER)||LA76_0==COND||LA76_0==DEFINE||LA76_0==DELAY||(LA76_0 >= DO && LA76_0 <= ELSE)||(LA76_0 >= FALSE && LA76_0 <= IF)||(LA76_0 >= LAMBDA && LA76_0 <= LETREC)||LA76_0==LETSTAR||(LA76_0 >= NUM_10 && LA76_0 <= OR)||(LA76_0 >= QUASIQUOTE && LA76_0 <= QUOTE)||LA76_0==SET||LA76_0==STRING||LA76_0==TRUE||(LA76_0 >= UNQUOTE && LA76_0 <= UNQUOTE_SPLICING)||(LA76_0 >= VARIABLE && LA76_0 <= 82)||(LA76_0 >= 84 && LA76_0 <= 85)||(LA76_0 >= 87 && LA76_0 <= 88)) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// R5RS.g3:375:30: ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )?
							{
							// R5RS.g3:375:30: ( qqTemplateOrSplice[d] )+
							int cnt74=0;
							loop74:
							while (true) {
								int alt74=2;
								int LA74_0 = input.LA(1);
								if ( ((LA74_0 >= AND && LA74_0 <= CHARACTER)||LA74_0==COND||LA74_0==DEFINE||LA74_0==DELAY||(LA74_0 >= DO && LA74_0 <= ELSE)||(LA74_0 >= FALSE && LA74_0 <= IF)||(LA74_0 >= LAMBDA && LA74_0 <= LETREC)||LA74_0==LETSTAR||(LA74_0 >= NUM_10 && LA74_0 <= OR)||(LA74_0 >= QUASIQUOTE && LA74_0 <= QUOTE)||LA74_0==SET||LA74_0==STRING||LA74_0==TRUE||(LA74_0 >= UNQUOTE && LA74_0 <= UNQUOTE_SPLICING)||(LA74_0 >= VARIABLE && LA74_0 <= 82)||(LA74_0 >= 84 && LA74_0 <= 85)||(LA74_0 >= 87 && LA74_0 <= 88)) ) {
									alt74=1;
								}

								switch (alt74) {
								case 1 :
									// R5RS.g3:375:30: qqTemplateOrSplice[d]
									{
									pushFollow(FOLLOW_qqTemplateOrSplice_in_listQQTemplate2425);
									qqTemplateOrSplice282=qqTemplateOrSplice(d);
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplateOrSplice282.getTree());

									}
									break;

								default :
									if ( cnt74 >= 1 ) break loop74;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(74, input);
									throw eee;
								}
								cnt74++;
							}

							// R5RS.g3:375:53: ( '.' qqTemplate[d] )?
							int alt75=2;
							int LA75_0 = input.LA(1);
							if ( (LA75_0==86) ) {
								alt75=1;
							}
							switch (alt75) {
								case 1 :
									// R5RS.g3:375:54: '.' qqTemplate[d]
									{
									char_literal283=(Token)match(input,86,FOLLOW_86_in_listQQTemplate2430); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal283_tree = (Object)adaptor.create(char_literal283);
									adaptor.addChild(root_0, char_literal283_tree);
									}

									pushFollow(FOLLOW_qqTemplate_in_listQQTemplate2432);
									qqTemplate284=qqTemplate(d);
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate284.getTree());

									}
									break;

							}

							}
							break;

					}

					char_literal285=(Token)match(input,83,FOLLOW_83_in_listQQTemplate2439); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal285_tree = (Object)adaptor.create(char_literal285);
					adaptor.addChild(root_0, char_literal285_tree);
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
	// R5RS.g3:378:1: unquotation[int d] : ( ',' qqTemplate[d-1] | '(' UNQUOTE qqTemplate[d-1] ')' );
	public final R5RSParser.unquotation_return unquotation(int d) throws RecognitionException {
		R5RSParser.unquotation_return retval = new R5RSParser.unquotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal286=null;
		Token char_literal288=null;
		Token UNQUOTE289=null;
		Token char_literal291=null;
		ParserRuleReturnScope qqTemplate287 =null;
		ParserRuleReturnScope qqTemplate290 =null;

		Object char_literal286_tree=null;
		Object char_literal288_tree=null;
		Object UNQUOTE289_tree=null;
		Object char_literal291_tree=null;

		try {
			// R5RS.g3:379:3: ( ',' qqTemplate[d-1] | '(' UNQUOTE qqTemplate[d-1] ')' )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==84) ) {
				alt78=1;
			}
			else if ( (LA78_0==82) ) {
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
					// R5RS.g3:379:6: ',' qqTemplate[d-1]
					{
					root_0 = (Object)adaptor.nil();


					char_literal286=(Token)match(input,84,FOLLOW_84_in_unquotation2454); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal286_tree = (Object)adaptor.create(char_literal286);
					adaptor.addChild(root_0, char_literal286_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_unquotation2456);
					qqTemplate287=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate287.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:380:6: '(' UNQUOTE qqTemplate[d-1] ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal288=(Token)match(input,82,FOLLOW_82_in_unquotation2464); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal288_tree = (Object)adaptor.create(char_literal288);
					adaptor.addChild(root_0, char_literal288_tree);
					}

					UNQUOTE289=(Token)match(input,UNQUOTE,FOLLOW_UNQUOTE_in_unquotation2466); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE289_tree = (Object)adaptor.create(UNQUOTE289);
					adaptor.addChild(root_0, UNQUOTE289_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_unquotation2468);
					qqTemplate290=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate290.getTree());

					char_literal291=(Token)match(input,83,FOLLOW_83_in_unquotation2471); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal291_tree = (Object)adaptor.create(char_literal291);
					adaptor.addChild(root_0, char_literal291_tree);
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
	// R5RS.g3:383:1: qqTemplateOrSplice[int d] : ( ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d] | qqTemplate[d] );
	public final R5RSParser.qqTemplateOrSplice_return qqTemplateOrSplice(int d) throws RecognitionException {
		R5RSParser.qqTemplateOrSplice_return retval = new R5RSParser.qqTemplateOrSplice_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope splicingUnquotation292 =null;
		ParserRuleReturnScope qqTemplate293 =null;


		try {
			// R5RS.g3:384:3: ( ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d] | qqTemplate[d] )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==85) && (synpred16_R5RS())) {
				alt79=1;
			}
			else if ( (LA79_0==82) ) {
				int LA79_2 = input.LA(2);
				if ( (synpred16_R5RS()) ) {
					alt79=1;
				}
				else if ( (true) ) {
					alt79=2;
				}

			}
			else if ( ((LA79_0 >= AND && LA79_0 <= CHARACTER)||LA79_0==COND||LA79_0==DEFINE||LA79_0==DELAY||(LA79_0 >= DO && LA79_0 <= ELSE)||(LA79_0 >= FALSE && LA79_0 <= IF)||(LA79_0 >= LAMBDA && LA79_0 <= LETREC)||LA79_0==LETSTAR||(LA79_0 >= NUM_10 && LA79_0 <= OR)||(LA79_0 >= QUASIQUOTE && LA79_0 <= QUOTE)||LA79_0==SET||LA79_0==STRING||LA79_0==TRUE||(LA79_0 >= UNQUOTE && LA79_0 <= UNQUOTE_SPLICING)||(LA79_0 >= VARIABLE && LA79_0 <= 81)||LA79_0==84||(LA79_0 >= 87 && LA79_0 <= 88)) ) {
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
					// R5RS.g3:384:6: ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_splicingUnquotation_in_qqTemplateOrSplice2493);
					splicingUnquotation292=splicingUnquotation(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, splicingUnquotation292.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:385:31: qqTemplate[d]
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_qqTemplate_in_qqTemplateOrSplice2526);
					qqTemplate293=qqTemplate(d);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate293.getTree());

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
	// R5RS.g3:388:1: splicingUnquotation[int d] : ( ',@' qqTemplate[d-1] | '(' UNQUOTE_SPLICING qqTemplate[d-1] ')' );
	public final R5RSParser.splicingUnquotation_return splicingUnquotation(int d) throws RecognitionException {
		R5RSParser.splicingUnquotation_return retval = new R5RSParser.splicingUnquotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal294=null;
		Token char_literal296=null;
		Token UNQUOTE_SPLICING297=null;
		Token char_literal299=null;
		ParserRuleReturnScope qqTemplate295 =null;
		ParserRuleReturnScope qqTemplate298 =null;

		Object string_literal294_tree=null;
		Object char_literal296_tree=null;
		Object UNQUOTE_SPLICING297_tree=null;
		Object char_literal299_tree=null;

		try {
			// R5RS.g3:389:3: ( ',@' qqTemplate[d-1] | '(' UNQUOTE_SPLICING qqTemplate[d-1] ')' )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==85) ) {
				alt80=1;
			}
			else if ( (LA80_0==82) ) {
				alt80=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// R5RS.g3:389:6: ',@' qqTemplate[d-1]
					{
					root_0 = (Object)adaptor.nil();


					string_literal294=(Token)match(input,85,FOLLOW_85_in_splicingUnquotation2542); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal294_tree = (Object)adaptor.create(string_literal294);
					adaptor.addChild(root_0, string_literal294_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_splicingUnquotation2544);
					qqTemplate295=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate295.getTree());

					}
					break;
				case 2 :
					// R5RS.g3:390:6: '(' UNQUOTE_SPLICING qqTemplate[d-1] ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal296=(Token)match(input,82,FOLLOW_82_in_splicingUnquotation2552); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal296_tree = (Object)adaptor.create(char_literal296);
					adaptor.addChild(root_0, char_literal296_tree);
					}

					UNQUOTE_SPLICING297=(Token)match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_splicingUnquotation2554); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNQUOTE_SPLICING297_tree = (Object)adaptor.create(UNQUOTE_SPLICING297);
					adaptor.addChild(root_0, UNQUOTE_SPLICING297_tree);
					}

					pushFollow(FOLLOW_qqTemplate_in_splicingUnquotation2556);
					qqTemplate298=qqTemplate(d-1);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate298.getTree());

					char_literal299=(Token)match(input,83,FOLLOW_83_in_splicingUnquotation2559); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal299_tree = (Object)adaptor.create(char_literal299);
					adaptor.addChild(root_0, char_literal299_tree);
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
		// R5RS.g3:50:6: ( syntaxDefinition )
		// R5RS.g3:50:7: syntaxDefinition
		{
		pushFollow(FOLLOW_syntaxDefinition_in_synpred1_R5RS70);
		syntaxDefinition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_R5RS

	// $ANTLR start synpred2_R5RS
	public final void synpred2_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:51:6: ( definition )
		// R5RS.g3:51:7: definition
		{
		pushFollow(FOLLOW_definition_in_synpred2_R5RS95);
		definition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_R5RS

	// $ANTLR start synpred3_R5RS
	public final void synpred3_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:52:6: ( '(' BEGIN commandOrDefinition )
		// R5RS.g3:52:7: '(' BEGIN commandOrDefinition
		{
		match(input,82,FOLLOW_82_in_synpred3_R5RS126); if (state.failed) return;

		match(input,BEGIN,FOLLOW_BEGIN_in_synpred3_R5RS128); if (state.failed) return;

		pushFollow(FOLLOW_commandOrDefinition_in_synpred3_R5RS130);
		commandOrDefinition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_R5RS

	// $ANTLR start synpred4_R5RS
	public final void synpred4_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:154:6: ( variable )
		// R5RS.g3:154:7: variable
		{
		pushFollow(FOLLOW_variable_in_synpred4_R5RS819);
		variable();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_R5RS

	// $ANTLR start synpred5_R5RS
	public final void synpred5_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:155:6: ( literal )
		// R5RS.g3:155:7: literal
		{
		pushFollow(FOLLOW_literal_in_synpred5_R5RS840);
		literal();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_R5RS

	// $ANTLR start synpred6_R5RS
	public final void synpred6_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:156:6: ( lambdaExpression )
		// R5RS.g3:156:7: lambdaExpression
		{
		pushFollow(FOLLOW_lambdaExpression_in_synpred6_R5RS862);
		lambdaExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_R5RS

	// $ANTLR start synpred7_R5RS
	public final void synpred7_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:157:6: ( conditional )
		// R5RS.g3:157:7: conditional
		{
		pushFollow(FOLLOW_conditional_in_synpred7_R5RS875);
		conditional();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_R5RS

	// $ANTLR start synpred8_R5RS
	public final void synpred8_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:158:6: ( assignment )
		// R5RS.g3:158:7: assignment
		{
		pushFollow(FOLLOW_assignment_in_synpred8_R5RS893);
		assignment();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_R5RS

	// $ANTLR start synpred9_R5RS
	public final void synpred9_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:159:6: ( derivedExpression )
		// R5RS.g3:159:7: derivedExpression
		{
		pushFollow(FOLLOW_derivedExpression_in_synpred9_R5RS912);
		derivedExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred9_R5RS

	// $ANTLR start synpred10_R5RS
	public final void synpred10_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:160:6: ( procedureCall )
		// R5RS.g3:160:7: procedureCall
		{
		pushFollow(FOLLOW_procedureCall_in_synpred10_R5RS924);
		procedureCall();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred10_R5RS

	// $ANTLR start synpred11_R5RS
	public final void synpred11_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:161:6: ( macroUse )
		// R5RS.g3:161:7: macroUse
		{
		pushFollow(FOLLOW_macroUse_in_synpred11_R5RS940);
		macroUse();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred11_R5RS

	// $ANTLR start synpred12_R5RS
	public final void synpred12_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:293:7: ( definition )
		// R5RS.g3:293:8: definition
		{
		pushFollow(FOLLOW_definition_in_synpred12_R5RS1905);
		definition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred12_R5RS

	// $ANTLR start synpred13_R5RS
	public final void synpred13_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:361:6: ( expression )
		// R5RS.g3:361:7: expression
		{
		pushFollow(FOLLOW_expression_in_synpred13_R5RS2232);
		expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred13_R5RS

	// $ANTLR start synpred14_R5RS
	public final void synpred14_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:362:6: ( '(' UNQUOTE )
		// R5RS.g3:362:7: '(' UNQUOTE
		{
		match(input,82,FOLLOW_82_in_synpred14_R5RS2245); if (state.failed) return;

		match(input,UNQUOTE,FOLLOW_UNQUOTE_in_synpred14_R5RS2247); if (state.failed) return;

		}

	}
	// $ANTLR end synpred14_R5RS

	// $ANTLR start synpred15_R5RS
	public final void synpred15_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:374:6: ( '(' QUASIQUOTE )
		// R5RS.g3:374:7: '(' QUASIQUOTE
		{
		match(input,82,FOLLOW_82_in_synpred15_R5RS2389); if (state.failed) return;

		match(input,QUASIQUOTE,FOLLOW_QUASIQUOTE_in_synpred15_R5RS2391); if (state.failed) return;

		}

	}
	// $ANTLR end synpred15_R5RS

	// $ANTLR start synpred16_R5RS
	public final void synpred16_R5RS_fragment() throws RecognitionException {
		// R5RS.g3:384:6: ( '(' UNQUOTE_SPLICING )
		// R5RS.g3:384:7: '(' UNQUOTE_SPLICING
		{
		match(input,82,FOLLOW_82_in_synpred16_R5RS2487); if (state.failed) return;

		match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_synpred16_R5RS2489); if (state.failed) return;

		}

	}
	// $ANTLR end synpred16_R5RS

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



	public static final BitSet FOLLOW_commandOrDefinition_in_parse52 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_EOF_in_parse55 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntaxDefinition_in_commandOrDefinition87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_commandOrDefinition118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_commandOrDefinition134 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BEGIN_in_commandOrDefinition137 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_commandOrDefinition_in_commandOrDefinition143 = new BitSet(new long[]{0x0000078022000100L,0x00000000018D0021L});
	public static final BitSet FOLLOW_83_in_commandOrDefinition146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commandOrDefinition188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_syntaxDefinition202 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DEFINE_SYNTAX_in_syntaxDefinition205 = new BitSet(new long[]{0x08060817470A80F0L,0x0000000000010C00L});
	public static final BitSet FOLLOW_keyword_in_syntaxDefinition208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_transformerSpec_in_syntaxDefinition210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_syntaxDefinition212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_definition227 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DEFINE_in_definition230 = new BitSet(new long[]{0x0000000002000000L,0x0000000000050000L});
	public static final BitSet FOLLOW_variable_in_definition238 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_expression_in_definition240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_definition242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_definition263 = new BitSet(new long[]{0x0000000002000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_variable_in_definition266 = new BitSet(new long[]{0x0000000002000000L,0x0000000000490000L});
	public static final BitSet FOLLOW_defFormals_in_definition268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_definition270 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_body_in_definition273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_definition275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_definition301 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BEGIN_in_definition304 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_definition_in_definition307 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_83_in_definition310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_defFormals325 = new BitSet(new long[]{0x0000000002000002L,0x0000000000410000L});
	public static final BitSet FOLLOW_86_in_defFormals329 = new BitSet(new long[]{0x0000000002000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_variable_in_defFormals331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_keyword347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_transformerSpec361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SYNTAX_RULES_in_transformerSpec363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_transformerSpec365 = new BitSet(new long[]{0x08060817470A80F0L,0x0000000000090C00L});
	public static final BitSet FOLLOW_identifier_in_transformerSpec367 = new BitSet(new long[]{0x08060817470A80F0L,0x0000000000090C00L});
	public static final BitSet FOLLOW_83_in_transformerSpec370 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_syntaxRule_in_transformerSpec372 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_83_in_transformerSpec375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_syntaxRule389 = new BitSet(new long[]{0x08060F97650A81F0L,0x0000000000070C21L});
	public static final BitSet FOLLOW_pattern_in_syntaxRule391 = new BitSet(new long[]{0x08060F97650A81F0L,0x0000000000070C21L});
	public static final BitSet FOLLOW_template_in_syntaxRule393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_syntaxRule395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternIdentifier_in_pattern409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_pattern416 = new BitSet(new long[]{0x08060F97650A81F0L,0x00000000000F0C21L});
	public static final BitSet FOLLOW_pattern_in_pattern419 = new BitSet(new long[]{0x08060F97670A81F0L,0x00000000004F0C21L});
	public static final BitSet FOLLOW_86_in_pattern423 = new BitSet(new long[]{0x08060F97650A81F0L,0x0000000000070C21L});
	public static final BitSet FOLLOW_pattern_in_pattern425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ELLIPSIS_in_pattern429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_pattern436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_pattern443 = new BitSet(new long[]{0x08060F97650A81F0L,0x00000000000F0C21L});
	public static final BitSet FOLLOW_pattern_in_pattern446 = new BitSet(new long[]{0x08060F97670A81F0L,0x00000000000F0C21L});
	public static final BitSet FOLLOW_ELLIPSIS_in_pattern449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_pattern455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternDatum_in_pattern462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntacticKeyword_in_patternIdentifier476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_patternIdentifier483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_patternDatum497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_patternDatum504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_patternDatum511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_patternDatum518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternIdentifier_in_template532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_template539 = new BitSet(new long[]{0x08060F97650A81F0L,0x00000000000F0C21L});
	public static final BitSet FOLLOW_templateElement_in_template542 = new BitSet(new long[]{0x08060F97650A81F0L,0x00000000004F0C21L});
	public static final BitSet FOLLOW_86_in_template546 = new BitSet(new long[]{0x08060F97650A81F0L,0x0000000000070C21L});
	public static final BitSet FOLLOW_templateElement_in_template548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_template554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_template561 = new BitSet(new long[]{0x08060F97650A81F0L,0x00000000000F0C21L});
	public static final BitSet FOLLOW_templateElement_in_template563 = new BitSet(new long[]{0x08060F97650A81F0L,0x00000000000F0C21L});
	public static final BitSet FOLLOW_83_in_template566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_templateDatum_in_template573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_template_in_templateElement587 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_templateElement589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_patternDatum_in_templateDatum604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_command618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntacticKeyword_in_identifier632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_identifier639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionKeyword_in_syntacticKeyword653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_syntacticKeyword660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARROW_in_syntacticKeyword667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFINE_in_syntacticKeyword674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNQUOTE_in_syntacticKeyword681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_syntacticKeyword688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_expression832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_expression854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lambdaExpression_in_expression867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_expression885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_expression904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derivedExpression_in_expression916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_expression932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroUse_in_expression953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroBlock_in_expression982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_variable996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_variable1007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quotation_in_literal1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selfEvaluating_in_literal1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_quotation1046 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001B70C21L});
	public static final BitSet FOLLOW_datum_in_quotation1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_quotation1055 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_QUOTE_in_quotation1057 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001B70C21L});
	public static final BitSet FOLLOW_datum_in_quotation1059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_quotation1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_selfEvaluating1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_selfEvaluating1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_selfEvaluating1089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_selfEvaluating1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_lambdaExpression1110 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LAMBDA_in_lambdaExpression1112 = new BitSet(new long[]{0x0000000002000000L,0x0000000000050000L});
	public static final BitSet FOLLOW_formals_in_lambdaExpression1114 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_body_in_lambdaExpression1116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_lambdaExpression1118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_formals1132 = new BitSet(new long[]{0x0000000002000000L,0x0000000000090000L});
	public static final BitSet FOLLOW_variable_in_formals1135 = new BitSet(new long[]{0x0000000002000000L,0x0000000000490000L});
	public static final BitSet FOLLOW_86_in_formals1139 = new BitSet(new long[]{0x0000000002000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_variable_in_formals1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_formals1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_formals1154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_conditional1168 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_IF_in_conditional1170 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_test_in_conditional1172 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_consequent_in_conditional1174 = new BitSet(new long[]{0x0000078022000100L,0x00000000018D0021L});
	public static final BitSet FOLLOW_alternate_in_conditional1176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_conditional1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_test1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_consequent1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_alternate1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_assignment1239 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SET_in_assignment1241 = new BitSet(new long[]{0x0000000002000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_variable_in_assignment1243 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_expression_in_assignment1245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_assignment1247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quasiquotation_in_derivedExpression1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_derivedExpression1268 = new BitSet(new long[]{0x00000816010880D0L});
	public static final BitSet FOLLOW_COND_in_derivedExpression1272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_derivedExpression1276 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ELSE_in_derivedExpression1278 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_derivedExpression1282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_condClause_in_derivedExpression1302 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_82_in_derivedExpression1306 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ELSE_in_derivedExpression1308 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_derivedExpression1312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_CASE_in_derivedExpression1346 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_expression_in_derivedExpression1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_derivedExpression1352 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ELSE_in_derivedExpression1354 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_derivedExpression1358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_caseClause_in_derivedExpression1389 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_82_in_derivedExpression1393 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ELSE_in_derivedExpression1395 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_derivedExpression1399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_AND_in_derivedExpression1444 = new BitSet(new long[]{0x0000078022000100L,0x00000000018D0021L});
	public static final BitSet FOLLOW_test_in_derivedExpression1446 = new BitSet(new long[]{0x0000078022000100L,0x00000000018D0021L});
	public static final BitSet FOLLOW_OR_in_derivedExpression1460 = new BitSet(new long[]{0x0000078022000100L,0x00000000018D0021L});
	public static final BitSet FOLLOW_test_in_derivedExpression1462 = new BitSet(new long[]{0x0000078022000100L,0x00000000018D0021L});
	public static final BitSet FOLLOW_LET_in_derivedExpression1476 = new BitSet(new long[]{0x0000000002000000L,0x0000000000050000L});
	public static final BitSet FOLLOW_variable_in_derivedExpression1478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_derivedExpression1481 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_bindingSpec_in_derivedExpression1483 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_83_in_derivedExpression1486 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_body_in_derivedExpression1488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LETSTAR_in_derivedExpression1501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_derivedExpression1503 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_bindingSpec_in_derivedExpression1505 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_83_in_derivedExpression1508 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_body_in_derivedExpression1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LETREC_in_derivedExpression1523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_derivedExpression1525 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_bindingSpec_in_derivedExpression1527 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_83_in_derivedExpression1530 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_body_in_derivedExpression1532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_BEGIN_in_derivedExpression1545 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_sequence_in_derivedExpression1547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_derivedExpression1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_derivedExpression1562 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_iterationSpec_in_derivedExpression1564 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_83_in_derivedExpression1567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_derivedExpression1569 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_test_in_derivedExpression1571 = new BitSet(new long[]{0x0000078022000100L,0x00000000018D0021L});
	public static final BitSet FOLLOW_doResult_in_derivedExpression1573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_derivedExpression1576 = new BitSet(new long[]{0x0000078022000100L,0x00000000018D0021L});
	public static final BitSet FOLLOW_command_in_derivedExpression1578 = new BitSet(new long[]{0x0000078022000100L,0x00000000018D0021L});
	public static final BitSet FOLLOW_DELAY_in_derivedExpression1592 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_expression_in_derivedExpression1594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_derivedExpression1613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_condClause1627 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_test_in_condClause1629 = new BitSet(new long[]{0x0000078022000120L,0x00000000018D0021L});
	public static final BitSet FOLLOW_sequence_in_condClause1632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ARROW_in_condClause1636 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_recipient_in_condClause1638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_condClause1642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_recipient1656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_caseClause1670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_caseClause1672 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001BF0C21L});
	public static final BitSet FOLLOW_datum_in_caseClause1674 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001BF0C21L});
	public static final BitSet FOLLOW_83_in_caseClause1677 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_sequence_in_caseClause1679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_caseClause1681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_bindingSpec1695 = new BitSet(new long[]{0x0000000002000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_variable_in_bindingSpec1697 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_expression_in_bindingSpec1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_bindingSpec1701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_iterationSpec1715 = new BitSet(new long[]{0x0000000002000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_variable_in_iterationSpec1717 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_init_in_iterationSpec1719 = new BitSet(new long[]{0x0000078022000100L,0x00000000018D0021L});
	public static final BitSet FOLLOW_step_in_iterationSpec1721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_iterationSpec1724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_init1738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_step1752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequence_in_doResult1766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_procedureCall1780 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_operator_in_procedureCall1782 = new BitSet(new long[]{0x0000078022000100L,0x00000000018D0021L});
	public static final BitSet FOLLOW_operand_in_procedureCall1784 = new BitSet(new long[]{0x0000078022000100L,0x00000000018D0021L});
	public static final BitSet FOLLOW_83_in_procedureCall1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_operator1801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_operand1815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_macroUse1829 = new BitSet(new long[]{0x08060817470A80F0L,0x0000000000010C00L});
	public static final BitSet FOLLOW_keyword_in_macroUse1831 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001BF0C21L});
	public static final BitSet FOLLOW_datum_in_macroUse1833 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001BF0C21L});
	public static final BitSet FOLLOW_83_in_macroUse1836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_macroBlock1850 = new BitSet(new long[]{0x0000004800000000L});
	public static final BitSet FOLLOW_set_in_macroBlock1852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_macroBlock1860 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_syntaxSpec_in_macroBlock1862 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
	public static final BitSet FOLLOW_83_in_macroBlock1865 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_body_in_macroBlock1867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_macroBlock1869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_syntaxSpec1883 = new BitSet(new long[]{0x08060817470A80F0L,0x0000000000010C00L});
	public static final BitSet FOLLOW_keyword_in_syntaxSpec1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_transformerSpec_in_syntaxSpec1887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_syntaxSpec1889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_body1909 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_sequence_in_body1913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_sequence1931 = new BitSet(new long[]{0x0000078022000102L,0x0000000001850021L});
	public static final BitSet FOLLOW_simpleDatum_in_datum1946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundDatum_in_datum1953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_simpleDatum1967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_simpleDatum1974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_simpleDatum1981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_simpleDatum1988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_simpleDatum1995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_compoundDatum2009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vector_in_compoundDatum2016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_list2030 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001BF0C21L});
	public static final BitSet FOLLOW_datum_in_list2033 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001FF0C21L});
	public static final BitSet FOLLOW_86_in_list2037 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001B70C21L});
	public static final BitSet FOLLOW_datum_in_list2039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_list2045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abbreviation_in_list2052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abbrevPrefix_in_abbreviation2066 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001B70C21L});
	public static final BitSet FOLLOW_datum_in_abbreviation2068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_vector2108 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001BF0C21L});
	public static final BitSet FOLLOW_datum_in_vector2110 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001BF0C21L});
	public static final BitSet FOLLOW_83_in_vector2113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quasiquotationD_in_quasiquotation2183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_quasiquotationD2199 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001970C21L});
	public static final BitSet FOLLOW_qqTemplate_in_quasiquotationD2201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_quasiquotationD2209 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_QUASIQUOTE_in_quasiquotationD2211 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001970C21L});
	public static final BitSet FOLLOW_qqTemplate_in_quasiquotationD2213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_quasiquotationD2216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_qqTemplate2237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unquotation_in_qqTemplate2251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDatum_in_qqTemplate2275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vectorQQTemplate_in_qqTemplate2298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listQQTemplate_in_qqTemplate2322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_vectorQQTemplate2338 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001BF0C21L});
	public static final BitSet FOLLOW_qqTemplateOrSplice_in_vectorQQTemplate2340 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001BF0C21L});
	public static final BitSet FOLLOW_83_in_vectorQQTemplate2344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_listQQTemplate2378 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001970C21L});
	public static final BitSet FOLLOW_qqTemplate_in_listQQTemplate2380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quasiquotationD_in_listQQTemplate2395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_listQQTemplate2422 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001BF0C21L});
	public static final BitSet FOLLOW_qqTemplateOrSplice_in_listQQTemplate2425 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001FF0C21L});
	public static final BitSet FOLLOW_86_in_listQQTemplate2430 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001970C21L});
	public static final BitSet FOLLOW_qqTemplate_in_listQQTemplate2432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_listQQTemplate2439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_unquotation2454 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001970C21L});
	public static final BitSet FOLLOW_qqTemplate_in_unquotation2456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_unquotation2464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_UNQUOTE_in_unquotation2466 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001970C21L});
	public static final BitSet FOLLOW_qqTemplate_in_unquotation2468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_unquotation2471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_splicingUnquotation_in_qqTemplateOrSplice2493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qqTemplate_in_qqTemplateOrSplice2526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_splicingUnquotation2542 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001970C21L});
	public static final BitSet FOLLOW_qqTemplate_in_splicingUnquotation2544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_splicingUnquotation2552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_splicingUnquotation2554 = new BitSet(new long[]{0x08060F97670A81F0L,0x0000000001970C21L});
	public static final BitSet FOLLOW_qqTemplate_in_splicingUnquotation2556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_splicingUnquotation2559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_syntaxDefinition_in_synpred1_R5RS70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_synpred2_R5RS95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_synpred3_R5RS126 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BEGIN_in_synpred3_R5RS128 = new BitSet(new long[]{0x0000078022000100L,0x0000000001850021L});
	public static final BitSet FOLLOW_commandOrDefinition_in_synpred3_R5RS130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_synpred4_R5RS819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_synpred5_R5RS840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lambdaExpression_in_synpred6_R5RS862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_synpred7_R5RS875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_synpred8_R5RS893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derivedExpression_in_synpred9_R5RS912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_synpred10_R5RS924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macroUse_in_synpred11_R5RS940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_synpred12_R5RS1905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred13_R5RS2232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_synpred14_R5RS2245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_UNQUOTE_in_synpred14_R5RS2247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_synpred15_R5RS2389 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_QUASIQUOTE_in_synpred15_R5RS2391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_synpred16_R5RS2487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_synpred16_R5RS2489 = new BitSet(new long[]{0x0000000000000002L});
}
