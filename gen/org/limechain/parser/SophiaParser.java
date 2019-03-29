// This is a generated file. Not intended for manual editing.
package org.limechain.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.limechain.psi.SophiaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SophiaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == BLOCK) {
      r = Block(b, 0);
    }
    else if (t == BOOLEAN_LITERAL) {
      r = BooleanLiteral(b, 0);
    }
    else if (t == BREAK_ST) {
      r = BreakSt(b, 0);
    }
    else if (t == CONTINUE_ST) {
      r = ContinueSt(b, 0);
    }
    else if (t == CONTRACT_DEFINITION) {
      r = ContractDefinition(b, 0);
    }
    else if (t == CONTRACT_NAME) {
      r = ContractName(b, 0);
    }
    else if (t == DECLARATION_ITEM) {
      r = DeclarationItem(b, 0);
    }
    else if (t == DECLARATION_LIST) {
      r = DeclarationList(b, 0);
    }
    else if (t == DO_WHILE_STATEMENT) {
      r = DoWhileStatement(b, 0);
    }
    else if (t == ELSE_STATEMENT) {
      r = ElseStatement(b, 0);
    }
    else if (t == EMIT_STATEMENT) {
      r = EmitStatement(b, 0);
    }
    else if (t == EMPTY_OBJECT) {
      r = EmptyObject(b, 0);
    }
    else if (t == ENUM_DEFINITION) {
      r = EnumDefinition(b, 0);
    }
    else if (t == ENUM_VALUE) {
      r = EnumValue(b, 0);
    }
    else if (t == EVENT_DEFINITION) {
      r = EventDefinition(b, 0);
    }
    else if (t == EXPRESSION) {
      r = Expression(b, 0, -1);
    }
    else if (t == FOR_STATEMENT) {
      r = ForStatement(b, 0);
    }
    else if (t == FUNCTION_CALL_ARGUMENTS) {
      r = FunctionCallArguments(b, 0);
    }
    else if (t == FUNCTION_DEFINITION) {
      r = FunctionDefinition(b, 0);
    }
    else if (t == FUNCTION_MODIFIER) {
      r = FunctionModifier(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = IfStatement(b, 0);
    }
    else if (t == IMPORT_ALIAS) {
      r = ImportAlias(b, 0);
    }
    else if (t == IMPORT_ALIASED_PAIR) {
      r = ImportAliasedPair(b, 0);
    }
    else if (t == IMPORT_DIRECTIVE) {
      r = ImportDirective(b, 0);
    }
    else if (t == IMPORT_PATH) {
      r = ImportPath(b, 0);
    }
    else if (t == INIT_FUNCTION_DEFINITION) {
      r = InitFunctionDefinition(b, 0);
    }
    else if (t == MAP_ITERATION) {
      r = MapIteration(b, 0);
    }
    else if (t == MAP_TYPE) {
      r = MapType(b, 0);
    }
    else if (t == NUMBER_LITERAL) {
      r = NumberLiteral(b, 0);
    }
    else if (t == OBJECT_EXPRESSION) {
      r = ObjectExpression(b, 0);
    }
    else if (t == PARAMETER_DEF) {
      r = ParameterDef(b, 0);
    }
    else if (t == PARAMETER_LIST) {
      r = ParameterList(b, 0);
    }
    else if (t == PLACEHOLDER_STATEMENT) {
      r = PlaceholderStatement(b, 0);
    }
    else if (t == RECORD_DEFINITION) {
      r = RecordDefinition(b, 0);
    }
    else if (t == SEQ_EXPRESSION) {
      r = SeqExpression(b, 0);
    }
    else if (t == SOPHIA_TYPE) {
      r = SophiaType(b, 0);
    }
    else if (t == STATE_UPDATE_EXPRESSION) {
      r = StateUpdateExpression(b, 0);
    }
    else if (t == STATE_VARIABLE_DECLARATION) {
      r = StateVariableDeclaration(b, 0);
    }
    else if (t == STATEMENT) {
      r = Statement(b, 0);
    }
    else if (t == SWITCH_STATEMENT) {
      r = SwitchStatement(b, 0);
    }
    else if (t == THROW_ST) {
      r = ThrowSt(b, 0);
    }
    else if (t == TUPLE_STATEMENT) {
      r = TupleStatement(b, 0);
    }
    else if (t == TYPE_NAME) {
      r = TypeName(b, 0, -1);
    }
    else if (t == TYPED_DECLARATION_ITEM) {
      r = TypedDeclarationItem(b, 0);
    }
    else if (t == TYPED_DECLARATION_LIST) {
      r = TypedDeclarationList(b, 0);
    }
    else if (t == USER_DEFINED_TYPE_NAME) {
      r = UserDefinedTypeName(b, 0);
    }
    else if (t == VAR_LITERAL) {
      r = VarLiteral(b, 0);
    }
    else if (t == VARIABLE_DECLARATION) {
      r = VariableDeclaration(b, 0);
    }
    else if (t == VARIABLE_DEFINITION) {
      r = VariableDefinition(b, 0);
    }
    else if (t == WHILE_STATEMENT) {
      r = WhileStatement(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return SourceUnit(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ARRAY_TYPE_NAME, ELEMENTARY_TYPE_NAME, FUNCTION_TYPE_NAME, MAPPING_TYPE_NAME,
      TYPE_NAME, USER_DEFINED_LOCATION_TYPE_NAME, USER_DEFINED_TYPE_NAME),
    create_token_set_(ALIAS_EXPRESSION, AND_EXPRESSION, AND_OP_EXPRESSION, ARROW_EXPRESSION,
      ASSIGNMENT_EXPRESSION, CALL_EXPRESSION, COMP_EXPRESSION, EQ_EXPRESSION,
      EXPONENT_EXPRESSION, EXPRESSION, FUNCTION_CALL_EXPRESSION, INCREMENT_EXPRESSION,
      INDEX_ACCESS_EXPRESSION, INLINE_ARRAY_EXPRESSION, MEMBER_ACCESS_EXPRESSION, MULT_DIV_EXPRESSION,
      NEW_EXPRESSION, OBJECT_EXPRESSION, OR_EXPRESSION, OR_OP_EXPRESSION,
      PAREN_EXPRESSION, PLUS_MIN_EXPRESSION, PRIMARY_EXPRESSION, SEQ_EXPRESSION,
      SHIFT_EXPRESSION, STATE_UPDATE_EXPRESSION, TERNARY_EXPRESSION, TYPED_ASSIGNMENT_EXPRESSION,
      UNARY_EXPRESSION, XOR_OP_EXPRESSION),
  };

  /* ********************************************************** */
  // Statement*
  public static boolean Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block")) return false;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block>");
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Block", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // booleanLiteral
  public static boolean BooleanLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanLiteral")) return false;
    if (!nextTokenIs(b, BOOLEANLITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BOOLEANLITERAL);
    exit_section_(b, m, BOOLEAN_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // break
  public static boolean BreakSt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakSt")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BREAK);
    exit_section_(b, m, BREAK_ST, r);
    return r;
  }

  /* ********************************************************** */
  // continue
  public static boolean ContinueSt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContinueSt")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTINUE);
    exit_section_(b, m, CONTINUE_ST, r);
    return r;
  }

  /* ********************************************************** */
  // ( contract | library ) ContractName '=' ContractPart*
  public static boolean ContractDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContractDefinition")) return false;
    if (!nextTokenIs(b, "<contract definition>", CONTRACT, LIBRARY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTRACT_DEFINITION, "<contract definition>");
    r = ContractDefinition_0(b, l + 1);
    r = r && ContractName(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && ContractDefinition_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // contract | library
  private static boolean ContractDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContractDefinition_0")) return false;
    boolean r;
    r = consumeToken(b, CONTRACT);
    if (!r) r = consumeToken(b, LIBRARY);
    return r;
  }

  // ContractPart*
  private static boolean ContractDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContractDefinition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ContractPart(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ContractDefinition_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Identifier
  public static boolean ContractName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContractName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CONTRACT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // StateVariableDeclaration
  //              | RecordDefinition | FunctionDefinition | EventDefinition | EnumDefinition | TypedAssignmentExpression | InitFunctionDefinition
  static boolean ContractPart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContractPart")) return false;
    boolean r;
    r = StateVariableDeclaration(b, l + 1);
    if (!r) r = RecordDefinition(b, l + 1);
    if (!r) r = FunctionDefinition(b, l + 1);
    if (!r) r = EventDefinition(b, l + 1);
    if (!r) r = EnumDefinition(b, l + 1);
    if (!r) r = TypedAssignmentExpression(b, l + 1);
    if (!r) r = InitFunctionDefinition(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // decimalNumber
  static boolean DecimalNumber(PsiBuilder b, int l) {
    return consumeToken(b, DECIMALNUMBER);
  }

  /* ********************************************************** */
  // Identifier ','? | ','
  public static boolean DeclarationItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationItem")) return false;
    if (!nextTokenIs(b, "<declaration item>", COMMA, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION_ITEM, "<declaration item>");
    r = DeclarationItem_0(b, l + 1);
    if (!r) r = consumeToken(b, COMMA);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Identifier ','?
  private static boolean DeclarationItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationItem_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && DeclarationItem_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean DeclarationItem_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationItem_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // '(' DeclarationItem*  ')'
  public static boolean DeclarationList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationList")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && DeclarationList_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, DECLARATION_LIST, r);
    return r;
  }

  // DeclarationItem*
  private static boolean DeclarationList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclarationList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DeclarationItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DeclarationList_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // do Statement while '(' Expression ')'
  public static boolean DoWhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoWhileStatement")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO);
    r = r && Statement(b, l + 1);
    r = r && consumeTokens(b, 0, WHILE, LPAREN);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, DO_WHILE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // ElementaryTypeName
  static boolean ElementaryTypeNameExpression(PsiBuilder b, int l) {
    return ElementaryTypeName(b, l + 1);
  }

  /* ********************************************************** */
  // else Statement
  public static boolean ElseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && Statement(b, l + 1);
    exit_section_(b, m, ELSE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // emit FunctionCallExpression
  public static boolean EmitStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EmitStatement")) return false;
    if (!nextTokenIs(b, EMIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EMIT);
    r = r && FunctionCallExpression(b, l + 1);
    exit_section_(b, m, EMIT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // '{''}'
  public static boolean EmptyObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EmptyObject")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACE, RBRACE);
    exit_section_(b, m, EMPTY_OBJECT, r);
    return r;
  }

  /* ********************************************************** */
  // enum Identifier '{' EnumValue? (',' EnumValue)* '}'
  public static boolean EnumDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDefinition")) return false;
    if (!nextTokenIs(b, ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENUM, IDENTIFIER, LBRACE);
    r = r && EnumDefinition_3(b, l + 1);
    r = r && EnumDefinition_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, ENUM_DEFINITION, r);
    return r;
  }

  // EnumValue?
  private static boolean EnumDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDefinition_3")) return false;
    EnumValue(b, l + 1);
    return true;
  }

  // (',' EnumValue)*
  private static boolean EnumDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDefinition_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EnumDefinition_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumDefinition_4", c)) break;
    }
    return true;
  }

  // ',' EnumValue
  private static boolean EnumDefinition_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDefinition_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && EnumValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier
  public static boolean EnumValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumValue")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ENUM_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // event Identifier anonymous?
  public static boolean EventDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EventDefinition")) return false;
    if (!nextTokenIs(b, EVENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EVENT, IDENTIFIER);
    r = r && EventDefinition_2(b, l + 1);
    exit_section_(b, m, EVENT_DEFINITION, r);
    return r;
  }

  // anonymous?
  private static boolean EventDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EventDefinition_2")) return false;
    consumeToken(b, ANONYMOUS);
    return true;
  }

  /* ********************************************************** */
  // Expression
  static boolean ExpressionStatement(PsiBuilder b, int l) {
    return Expression(b, l + 1, -1);
  }

  /* ********************************************************** */
  // DoWhileStatement | PlaceholderStatement | ContinueSt | BreakSt | ThrowSt | EmitStatement | SimpleStatement
  static boolean FinishedStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FinishedStatement")) return false;
    boolean r;
    r = DoWhileStatement(b, l + 1);
    if (!r) r = PlaceholderStatement(b, l + 1);
    if (!r) r = ContinueSt(b, l + 1);
    if (!r) r = BreakSt(b, l + 1);
    if (!r) r = ThrowSt(b, l + 1);
    if (!r) r = EmitStatement(b, l + 1);
    if (!r) r = SimpleStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // fixedNumber
  static boolean FixedNumber(PsiBuilder b, int l) {
    return consumeToken(b, FIXEDNUMBER);
  }

  /* ********************************************************** */
  // for '(' (SimpleStatement)? ';' (Expression)? ';' (ExpressionStatement)? ')' Statement
  public static boolean ForStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, LPAREN);
    r = r && ForStatement_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && ForStatement_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && ForStatement_6(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && Statement(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // (SimpleStatement)?
  private static boolean ForStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_2")) return false;
    ForStatement_2_0(b, l + 1);
    return true;
  }

  // (SimpleStatement)
  private static boolean ForStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SimpleStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expression)?
  private static boolean ForStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_4")) return false;
    ForStatement_4_0(b, l + 1);
    return true;
  }

  // (Expression)
  private static boolean ForStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ExpressionStatement)?
  private static boolean ForStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_6")) return false;
    ForStatement_6_0(b, l + 1);
    return true;
  }

  // (ExpressionStatement)
  private static boolean ForStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StateUpdateExpression | ObjectExpression | Expression? ( ',' Expression )*
  public static boolean FunctionCallArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL_ARGUMENTS, "<function call arguments>");
    r = StateUpdateExpression(b, l + 1);
    if (!r) r = ObjectExpression(b, l + 1);
    if (!r) r = FunctionCallArguments_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Expression? ( ',' Expression )*
  private static boolean FunctionCallArguments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionCallArguments_2_0(b, l + 1);
    r = r && FunctionCallArguments_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean FunctionCallArguments_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments_2_0")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  // ( ',' Expression )*
  private static boolean FunctionCallArguments_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionCallArguments_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionCallArguments_2_1", c)) break;
    }
    return true;
  }

  // ',' Expression
  private static boolean FunctionCallArguments_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( FunctionModifier )* function Identifier? ParameterList
  //                      ( ':' SophiaType )? '=' '{'? Block '}'?
  public static boolean FunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DEFINITION, "<function definition>");
    r = FunctionDefinition_0(b, l + 1);
    r = r && consumeToken(b, FUNCTION);
    r = r && FunctionDefinition_2(b, l + 1);
    r = r && ParameterList(b, l + 1);
    r = r && FunctionDefinition_4(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && FunctionDefinition_6(b, l + 1);
    r = r && Block(b, l + 1);
    r = r && FunctionDefinition_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( FunctionModifier )*
  private static boolean FunctionDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionDefinition_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionDefinition_0", c)) break;
    }
    return true;
  }

  // ( FunctionModifier )
  private static boolean FunctionDefinition_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionModifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Identifier?
  private static boolean FunctionDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_2")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // ( ':' SophiaType )?
  private static boolean FunctionDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_4")) return false;
    FunctionDefinition_4_0(b, l + 1);
    return true;
  }

  // ':' SophiaType
  private static boolean FunctionDefinition_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && SophiaType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{'?
  private static boolean FunctionDefinition_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_6")) return false;
    consumeToken(b, LBRACE);
    return true;
  }

  // '}'?
  private static boolean FunctionDefinition_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_8")) return false;
    consumeToken(b, RBRACE);
    return true;
  }

  /* ********************************************************** */
  // stateful | public | private | internal | StateMutability | Identifier
  public static boolean FunctionModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionModifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_MODIFIER, "<function modifier>");
    r = consumeToken(b, STATEFUL);
    if (!r) r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, PRIVATE);
    if (!r) r = consumeToken(b, INTERNAL);
    if (!r) r = consumeToken(b, STATEMUTABILITY);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // hexLiteral
  static boolean HexLiteral(PsiBuilder b, int l) {
    return consumeToken(b, HEXLITERAL);
  }

  /* ********************************************************** */
  // hexNumber
  static boolean HexNumber(PsiBuilder b, int l) {
    return consumeToken(b, HEXNUMBER);
  }

  /* ********************************************************** */
  // if '(' Expression ')' Statement (elif '(' Expression ')' Statement)? ( else Statement )?
  public static boolean IfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LPAREN);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RPAREN);
    r = r && Statement(b, l + 1);
    r = r && IfStatement_5(b, l + 1);
    r = r && IfStatement_6(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // (elif '(' Expression ')' Statement)?
  private static boolean IfStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_5")) return false;
    IfStatement_5_0(b, l + 1);
    return true;
  }

  // elif '(' Expression ')' Statement
  private static boolean IfStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELIF, LPAREN);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RPAREN);
    r = r && Statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( else Statement )?
  private static boolean IfStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_6")) return false;
    IfStatement_6_0(b, l + 1);
    return true;
  }

  // else Statement
  private static boolean IfStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && Statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier
  public static boolean ImportAlias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportAlias")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, IMPORT_ALIAS, r);
    return r;
  }

  /* ********************************************************** */
  // UserDefinedTypeName (as ImportAlias)?
  public static boolean ImportAliasedPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportAliasedPair")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UserDefinedTypeName(b, l + 1);
    r = r && ImportAliasedPair_1(b, l + 1);
    exit_section_(b, m, IMPORT_ALIASED_PAIR, r);
    return r;
  }

  // (as ImportAlias)?
  private static boolean ImportAliasedPair_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportAliasedPair_1")) return false;
    ImportAliasedPair_1_0(b, l + 1);
    return true;
  }

  // as ImportAlias
  private static boolean ImportAliasedPair_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportAliasedPair_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && ImportAlias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ImportDirectivePart
  public static boolean ImportDirective(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirective")) return false;
    if (!nextTokenIs(b, INCLUDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportDirectivePart(b, l + 1);
    exit_section_(b, m, IMPORT_DIRECTIVE, r);
    return r;
  }

  /* ********************************************************** */
  // include ( ImportPath (as ImportAlias)?
  //         | ('*' | UserDefinedTypeName) (as ImportAlias)? 'from' ImportPath
  //         | '{' ImportRuleSet '}' 'from' ImportPath )
  static boolean ImportDirectivePart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart")) return false;
    if (!nextTokenIs(b, INCLUDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCLUDE);
    r = r && ImportDirectivePart_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ImportPath (as ImportAlias)?
  //         | ('*' | UserDefinedTypeName) (as ImportAlias)? 'from' ImportPath
  //         | '{' ImportRuleSet '}' 'from' ImportPath
  private static boolean ImportDirectivePart_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportDirectivePart_1_0(b, l + 1);
    if (!r) r = ImportDirectivePart_1_1(b, l + 1);
    if (!r) r = ImportDirectivePart_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ImportPath (as ImportAlias)?
  private static boolean ImportDirectivePart_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportPath(b, l + 1);
    r = r && ImportDirectivePart_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (as ImportAlias)?
  private static boolean ImportDirectivePart_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_0_1")) return false;
    ImportDirectivePart_1_0_1_0(b, l + 1);
    return true;
  }

  // as ImportAlias
  private static boolean ImportDirectivePart_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && ImportAlias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('*' | UserDefinedTypeName) (as ImportAlias)? 'from' ImportPath
  private static boolean ImportDirectivePart_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportDirectivePart_1_1_0(b, l + 1);
    r = r && ImportDirectivePart_1_1_1(b, l + 1);
    r = r && consumeToken(b, "from");
    r = r && ImportPath(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' | UserDefinedTypeName
  private static boolean ImportDirectivePart_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MULT);
    if (!r) r = UserDefinedTypeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (as ImportAlias)?
  private static boolean ImportDirectivePart_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_1_1")) return false;
    ImportDirectivePart_1_1_1_0(b, l + 1);
    return true;
  }

  // as ImportAlias
  private static boolean ImportDirectivePart_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && ImportAlias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' ImportRuleSet '}' 'from' ImportPath
  private static boolean ImportDirectivePart_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDirectivePart_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && ImportRuleSet(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    r = r && consumeToken(b, "from");
    r = r && ImportPath(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StringLiteral
  public static boolean ImportPath(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportPath")) return false;
    if (!nextTokenIs(b, STRINGLITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StringLiteral(b, l + 1);
    exit_section_(b, m, IMPORT_PATH, r);
    return r;
  }

  /* ********************************************************** */
  // ImportAliasedPair ( ',' ImportAliasedPair )*
  static boolean ImportRuleSet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportRuleSet")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportAliasedPair(b, l + 1);
    r = r && ImportRuleSet_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' ImportAliasedPair )*
  private static boolean ImportRuleSet_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportRuleSet_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ImportRuleSet_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ImportRuleSet_1", c)) break;
    }
    return true;
  }

  // ',' ImportAliasedPair
  private static boolean ImportRuleSet_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportRuleSet_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ImportAliasedPair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VisibilityModifiers function init ParameterList ( ':' state )? '=' '{' (AssignmentExpression ',' | AssignmentExpression)* '}'
  public static boolean InitFunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitFunctionDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INIT_FUNCTION_DEFINITION, "<init function definition>");
    r = VisibilityModifiers(b, l + 1);
    r = r && consumeTokens(b, 0, FUNCTION, INIT);
    r = r && ParameterList(b, l + 1);
    r = r && InitFunctionDefinition_4(b, l + 1);
    r = r && consumeTokens(b, 0, ASSIGN, LBRACE);
    r = r && InitFunctionDefinition_7(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ':' state )?
  private static boolean InitFunctionDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitFunctionDefinition_4")) return false;
    InitFunctionDefinition_4_0(b, l + 1);
    return true;
  }

  // ':' state
  private static boolean InitFunctionDefinition_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitFunctionDefinition_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLON, STATE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AssignmentExpression ',' | AssignmentExpression)*
  private static boolean InitFunctionDefinition_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitFunctionDefinition_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!InitFunctionDefinition_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InitFunctionDefinition_7", c)) break;
    }
    return true;
  }

  // AssignmentExpression ',' | AssignmentExpression
  private static boolean InitFunctionDefinition_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitFunctionDefinition_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InitFunctionDefinition_7_0_0(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AssignmentExpression ','
  private static boolean InitFunctionDefinition_7_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InitFunctionDefinition_7_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "Map.member" ParameterList
  public static boolean MapIteration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapIteration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAP_ITERATION, "<map iteration>");
    r = consumeToken(b, "Map.member");
    r = r && ParameterList(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // map '(' (ElementaryTypeName | SophiaType) (',' (ElementaryTypeName | SophiaType))? ')'
  public static boolean MapType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapType")) return false;
    if (!nextTokenIs(b, MAP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MAP, LPAREN);
    r = r && MapType_2(b, l + 1);
    r = r && MapType_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, MAP_TYPE, r);
    return r;
  }

  // ElementaryTypeName | SophiaType
  private static boolean MapType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapType_2")) return false;
    boolean r;
    r = ElementaryTypeName(b, l + 1);
    if (!r) r = SophiaType(b, l + 1);
    return r;
  }

  // (',' (ElementaryTypeName | SophiaType))?
  private static boolean MapType_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapType_3")) return false;
    MapType_3_0(b, l + 1);
    return true;
  }

  // ',' (ElementaryTypeName | SophiaType)
  private static boolean MapType_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapType_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && MapType_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ElementaryTypeName | SophiaType
  private static boolean MapType_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapType_3_0_1")) return false;
    boolean r;
    r = ElementaryTypeName(b, l + 1);
    if (!r) r = SophiaType(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // HexNumber | DecimalNumber | FixedNumber | ScientificNumber
  public static boolean NumberLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER_LITERAL, "<number literal>");
    r = HexNumber(b, l + 1);
    if (!r) r = DecimalNumber(b, l + 1);
    if (!r) r = FixedNumber(b, l + 1);
    if (!r) r = ScientificNumber(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' ObjectExpressionClause (',' ObjectExpressionClause )* '}'
  public static boolean ObjectExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && ObjectExpressionClause(b, l + 1);
    r = r && ObjectExpression_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, OBJECT_EXPRESSION, r);
    return r;
  }

  // (',' ObjectExpressionClause )*
  private static boolean ObjectExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ObjectExpression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectExpression_2", c)) break;
    }
    return true;
  }

  // ',' ObjectExpressionClause
  private static boolean ObjectExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ObjectExpressionClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier '=' Expression
  static boolean ObjectExpressionClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpressionClause")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, ASSIGN);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier (':' (TypeName | SophiaType | Identifier))?
  public static boolean ParameterDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterDef")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && ParameterDef_1(b, l + 1);
    exit_section_(b, m, PARAMETER_DEF, r);
    return r;
  }

  // (':' (TypeName | SophiaType | Identifier))?
  private static boolean ParameterDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterDef_1")) return false;
    ParameterDef_1_0(b, l + 1);
    return true;
  }

  // ':' (TypeName | SophiaType | Identifier)
  private static boolean ParameterDef_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterDef_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && ParameterDef_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeName | SophiaType | Identifier
  private static boolean ParameterDef_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterDef_1_0_1")) return false;
    boolean r;
    r = TypeName(b, l + 1, -1);
    if (!r) r = SophiaType(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // '(' ( ParameterDef (',' ParameterDef)* )? ')'
  public static boolean ParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && ParameterList_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PARAMETER_LIST, r);
    return r;
  }

  // ( ParameterDef (',' ParameterDef)* )?
  private static boolean ParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1")) return false;
    ParameterList_1_0(b, l + 1);
    return true;
  }

  // ParameterDef (',' ParameterDef)*
  private static boolean ParameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterDef(b, l + 1);
    r = r && ParameterList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' ParameterDef)*
  private static boolean ParameterList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ParameterList_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ParameterList_1_0_1", c)) break;
    }
    return true;
  }

  // ',' ParameterDef
  private static boolean ParameterList_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ParameterDef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '_'
  public static boolean PlaceholderStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PlaceholderStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PLACEHOLDER_STATEMENT, "<placeholder statement>");
    r = consumeToken(b, "_");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // address | string | bool
  static boolean PrimitiveLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimitiveLiteral")) return false;
    boolean r;
    r = consumeToken(b, ADDRESS);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, BOOL);
    return r;
  }

  /* ********************************************************** */
  // record (Identifier | state) '=' '{'
  //                      ( Identifier ':' (ElementaryTypeName | SophiaType)) ( ',' Identifier ':' (ElementaryTypeName | SophiaType))* '}'
  public static boolean RecordDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordDefinition")) return false;
    if (!nextTokenIs(b, RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RECORD);
    r = r && RecordDefinition_1(b, l + 1);
    r = r && consumeTokens(b, 0, ASSIGN, LBRACE);
    r = r && RecordDefinition_4(b, l + 1);
    r = r && RecordDefinition_5(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, RECORD_DEFINITION, r);
    return r;
  }

  // Identifier | state
  private static boolean RecordDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordDefinition_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, STATE);
    return r;
  }

  // Identifier ':' (ElementaryTypeName | SophiaType)
  private static boolean RecordDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordDefinition_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && RecordDefinition_4_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ElementaryTypeName | SophiaType
  private static boolean RecordDefinition_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordDefinition_4_2")) return false;
    boolean r;
    r = ElementaryTypeName(b, l + 1);
    if (!r) r = SophiaType(b, l + 1);
    return r;
  }

  // ( ',' Identifier ':' (ElementaryTypeName | SophiaType))*
  private static boolean RecordDefinition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordDefinition_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!RecordDefinition_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RecordDefinition_5", c)) break;
    }
    return true;
  }

  // ',' Identifier ':' (ElementaryTypeName | SophiaType)
  private static boolean RecordDefinition_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordDefinition_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER, COLON);
    r = r && RecordDefinition_5_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ElementaryTypeName | SophiaType
  private static boolean RecordDefinition_5_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordDefinition_5_0_3")) return false;
    boolean r;
    r = ElementaryTypeName(b, l + 1);
    if (!r) r = SophiaType(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Expression ':' Expression
  static boolean RightTernaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RightTernaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // scientificNumber
  static boolean ScientificNumber(PsiBuilder b, int l) {
    return consumeToken(b, SCIENTIFICNUMBER);
  }

  /* ********************************************************** */
  // '(' ','? Expression (',' Expression)* ','? ')'
  public static boolean SeqExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqExpression")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && SeqExpression_1(b, l + 1);
    r = r && Expression(b, l + 1, -1);
    r = r && SeqExpression_3(b, l + 1);
    r = r && SeqExpression_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, SEQ_EXPRESSION, r);
    return r;
  }

  // ','?
  private static boolean SeqExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqExpression_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // (',' Expression)*
  private static boolean SeqExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqExpression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SeqExpression_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SeqExpression_3", c)) break;
    }
    return true;
  }

  // ',' Expression
  private static boolean SeqExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean SeqExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqExpression_4")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // VariableDefinition | ExpressionStatement
  static boolean SimpleStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleStatement")) return false;
    boolean r;
    r = VariableDefinition(b, l + 1);
    if (!r) r = ExpressionStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // int | address | bool | bits | string | list | tuple | record | map | state | transactions | events | signature
  public static boolean SophiaType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SophiaType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SOPHIA_TYPE, "<sophia type>");
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, ADDRESS);
    if (!r) r = consumeToken(b, BOOL);
    if (!r) r = consumeToken(b, BITS);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, LIST);
    if (!r) r = consumeToken(b, TUPLE);
    if (!r) r = consumeToken(b, RECORD);
    if (!r) r = consumeToken(b, MAP);
    if (!r) r = consumeToken(b, STATE);
    if (!r) r = consumeToken(b, TRANSACTIONS);
    if (!r) r = consumeToken(b, EVENTS);
    if (!r) r = consumeToken(b, SIGNATURE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( ImportDirective | ContractDefinition | Expression)*
  static boolean SourceUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SourceUnit")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SourceUnit_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SourceUnit", c)) break;
    }
    return true;
  }

  // ImportDirective | ContractDefinition | Expression
  private static boolean SourceUnit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SourceUnit_0")) return false;
    boolean r;
    r = ImportDirective(b, l + 1);
    if (!r) r = ContractDefinition(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    return r;
  }

  /* ********************************************************** */
  // state '{' (IndexAccessExpression | ObjectExpressionClause | Expression) '=' (Expression | hash) (',' (IndexAccessExpression | ObjectExpressionClause | Expression) '=' (Expression | hash))? '}'
  public static boolean StateUpdateExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateUpdateExpression")) return false;
    if (!nextTokenIs(b, STATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STATE, LBRACE);
    r = r && StateUpdateExpression_2(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && StateUpdateExpression_4(b, l + 1);
    r = r && StateUpdateExpression_5(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, STATE_UPDATE_EXPRESSION, r);
    return r;
  }

  // IndexAccessExpression | ObjectExpressionClause | Expression
  private static boolean StateUpdateExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateUpdateExpression_2")) return false;
    boolean r;
    r = Expression(b, l + 1, 19);
    if (!r) r = ObjectExpressionClause(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    return r;
  }

  // Expression | hash
  private static boolean StateUpdateExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateUpdateExpression_4")) return false;
    boolean r;
    r = Expression(b, l + 1, -1);
    if (!r) r = consumeToken(b, HASH);
    return r;
  }

  // (',' (IndexAccessExpression | ObjectExpressionClause | Expression) '=' (Expression | hash))?
  private static boolean StateUpdateExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateUpdateExpression_5")) return false;
    StateUpdateExpression_5_0(b, l + 1);
    return true;
  }

  // ',' (IndexAccessExpression | ObjectExpressionClause | Expression) '=' (Expression | hash)
  private static boolean StateUpdateExpression_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateUpdateExpression_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && StateUpdateExpression_5_0_1(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && StateUpdateExpression_5_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IndexAccessExpression | ObjectExpressionClause | Expression
  private static boolean StateUpdateExpression_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateUpdateExpression_5_0_1")) return false;
    boolean r;
    r = Expression(b, l + 1, 19);
    if (!r) r = ObjectExpressionClause(b, l + 1);
    if (!r) r = Expression(b, l + 1, -1);
    return r;
  }

  // Expression | hash
  private static boolean StateUpdateExpression_5_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateUpdateExpression_5_0_3")) return false;
    boolean r;
    r = Expression(b, l + 1, -1);
    if (!r) r = consumeToken(b, HASH);
    return r;
  }

  /* ********************************************************** */
  // TypeName (VisibilityModifiers constant | constant? VisibilityModifiers? ) Identifier ('=' (Expression | SophiaType))?
  public static boolean StateVariableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATE_VARIABLE_DECLARATION, "<state variable declaration>");
    r = TypeName(b, l + 1, -1);
    r = r && StateVariableDeclaration_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && StateVariableDeclaration_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VisibilityModifiers constant | constant? VisibilityModifiers?
  private static boolean StateVariableDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StateVariableDeclaration_1_0(b, l + 1);
    if (!r) r = StateVariableDeclaration_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VisibilityModifiers constant
  private static boolean StateVariableDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VisibilityModifiers(b, l + 1);
    r = r && consumeToken(b, CONSTANT);
    exit_section_(b, m, null, r);
    return r;
  }

  // constant? VisibilityModifiers?
  private static boolean StateVariableDeclaration_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StateVariableDeclaration_1_1_0(b, l + 1);
    r = r && StateVariableDeclaration_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // constant?
  private static boolean StateVariableDeclaration_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_1_1_0")) return false;
    consumeToken(b, CONSTANT);
    return true;
  }

  // VisibilityModifiers?
  private static boolean StateVariableDeclaration_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_1_1_1")) return false;
    VisibilityModifiers(b, l + 1);
    return true;
  }

  // ('=' (Expression | SophiaType))?
  private static boolean StateVariableDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_3")) return false;
    StateVariableDeclaration_3_0(b, l + 1);
    return true;
  }

  // '=' (Expression | SophiaType)
  private static boolean StateVariableDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && StateVariableDeclaration_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression | SophiaType
  private static boolean StateVariableDeclaration_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StateVariableDeclaration_3_0_1")) return false;
    boolean r;
    r = Expression(b, l + 1, -1);
    if (!r) r = SophiaType(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IfStatement | ElseStatement | SwitchStatement | WhileStatement | ForStatement | TupleStatement | FinishedStatement | MapIteration
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = IfStatement(b, l + 1);
    if (!r) r = ElseStatement(b, l + 1);
    if (!r) r = SwitchStatement(b, l + 1);
    if (!r) r = WhileStatement(b, l + 1);
    if (!r) r = ForStatement(b, l + 1);
    if (!r) r = TupleStatement(b, l + 1);
    if (!r) r = FinishedStatement(b, l + 1);
    if (!r) r = MapIteration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // stringLiteral
  static boolean StringLiteral(PsiBuilder b, int l) {
    return consumeToken(b, STRINGLITERAL);
  }

  /* ********************************************************** */
  // switch '(' Expression ')' Statement
  public static boolean SwitchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchStatement")) return false;
    if (!nextTokenIs(b, SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SWITCH, LPAREN);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RPAREN);
    r = r && Statement(b, l + 1);
    exit_section_(b, m, SWITCH_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // abort
  public static boolean ThrowSt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowSt")) return false;
    if (!nextTokenIs(b, ABORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ABORT);
    exit_section_(b, m, THROW_ST, r);
    return r;
  }

  /* ********************************************************** */
  // VariableDeclaration '=' SeqExpression
  //     | SeqExpression '=' SeqExpression
  //     | SeqExpression '=' Expression
  public static boolean TupleStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_STATEMENT, "<tuple statement>");
    r = TupleStatement_0(b, l + 1);
    if (!r) r = TupleStatement_1(b, l + 1);
    if (!r) r = TupleStatement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VariableDeclaration '=' SeqExpression
  private static boolean TupleStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDeclaration(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && SeqExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SeqExpression '=' SeqExpression
  private static boolean TupleStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SeqExpression(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && SeqExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SeqExpression '=' Expression
  private static boolean TupleStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SeqExpression(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (TypeName StorageLocation?)? Identifier ','? | ','
  public static boolean TypedDeclarationItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedDeclarationItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPED_DECLARATION_ITEM, "<typed declaration item>");
    r = TypedDeclarationItem_0(b, l + 1);
    if (!r) r = consumeToken(b, COMMA);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (TypeName StorageLocation?)? Identifier ','?
  private static boolean TypedDeclarationItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedDeclarationItem_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypedDeclarationItem_0_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && TypedDeclarationItem_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TypeName StorageLocation?)?
  private static boolean TypedDeclarationItem_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedDeclarationItem_0_0")) return false;
    TypedDeclarationItem_0_0_0(b, l + 1);
    return true;
  }

  // TypeName StorageLocation?
  private static boolean TypedDeclarationItem_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedDeclarationItem_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeName(b, l + 1, -1);
    r = r && TypedDeclarationItem_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StorageLocation?
  private static boolean TypedDeclarationItem_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedDeclarationItem_0_0_0_1")) return false;
    consumeToken(b, STORAGELOCATION);
    return true;
  }

  // ','?
  private static boolean TypedDeclarationItem_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedDeclarationItem_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // '(' TypedDeclarationItem*  ')'
  public static boolean TypedDeclarationList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedDeclarationList")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && TypedDeclarationList_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, TYPED_DECLARATION_LIST, r);
    return r;
  }

  // TypedDeclarationItem*
  private static boolean TypedDeclarationList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedDeclarationList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypedDeclarationItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypedDeclarationList_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Identifier ( '.' Identifier )*
  public static boolean UserDefinedTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedTypeName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && UserDefinedTypeName_1(b, l + 1);
    exit_section_(b, m, USER_DEFINED_TYPE_NAME, r);
    return r;
  }

  // ( '.' Identifier )*
  private static boolean UserDefinedTypeName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedTypeName_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UserDefinedTypeName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UserDefinedTypeName_1", c)) break;
    }
    return true;
  }

  // '.' Identifier
  private static boolean UserDefinedTypeName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedTypeName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UserDefinedTypeName
  static boolean UserDefinedWithLocationTypeName(PsiBuilder b, int l) {
    return UserDefinedTypeName(b, l + 1);
  }

  /* ********************************************************** */
  // UserDefinedTypeName
  static boolean UserDefinedWithoutLocationTypeName(PsiBuilder b, int l) {
    return UserDefinedTypeName(b, l + 1);
  }

  /* ********************************************************** */
  // Identifier
  public static boolean VarLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarLiteral")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, VAR_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // let DeclarationList |
  //     DeclarationList |
  //     TypedDeclarationList |
  //     TypeName Identifier
  public static boolean VariableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = VariableDeclaration_0(b, l + 1);
    if (!r) r = DeclarationList(b, l + 1);
    if (!r) r = TypedDeclarationList(b, l + 1);
    if (!r) r = VariableDeclaration_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // let DeclarationList
  private static boolean VariableDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LET);
    r = r && DeclarationList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeName Identifier
  private static boolean VariableDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeName(b, l + 1, -1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableDeclaration ( '=' (Expression | Statement | hash) )?
  public static boolean VariableDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DEFINITION, "<variable definition>");
    r = VariableDeclaration(b, l + 1);
    r = r && VariableDefinition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '=' (Expression | Statement | hash) )?
  private static boolean VariableDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_1")) return false;
    VariableDefinition_1_0(b, l + 1);
    return true;
  }

  // '=' (Expression | Statement | hash)
  private static boolean VariableDefinition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && VariableDefinition_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression | Statement | hash
  private static boolean VariableDefinition_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_1_0_1")) return false;
    boolean r;
    r = Expression(b, l + 1, -1);
    if (!r) r = Statement(b, l + 1);
    if (!r) r = consumeToken(b, HASH);
    return r;
  }

  /* ********************************************************** */
  // public | internal | private
  static boolean VisibilityModifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VisibilityModifiers")) return false;
    boolean r;
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, INTERNAL);
    if (!r) r = consumeToken(b, PRIVATE);
    return r;
  }

  /* ********************************************************** */
  // while '(' Expression ')' Statement
  public static boolean WhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHILE, LPAREN);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RPAREN);
    r = r && Statement(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: Expression
  // Operator priority table:
  // 0: POSTFIX(AssignmentExpression)
  // 1: ATOM(TypedAssignmentExpression)
  // 2: POSTFIX(TernaryExpression)
  // 3: ATOM(FunctionCallExpression)
  // 4: POSTFIX(CallExpression)
  // 5: PREFIX(ParenExpression)
  // 6: ATOM(NewExpression)
  // 7: BINARY(EqExpression)
  // 8: BINARY(OrExpression)
  // 9: BINARY(AndExpression)
  // 10: BINARY(CompExpression)
  // 11: BINARY(OrOpExpression)
  // 12: BINARY(XorOpExpression)
  // 13: BINARY(AndOpExpression)
  // 14: BINARY(ShiftExpression)
  // 15: BINARY(PlusMinExpression)
  // 16: BINARY(MultDivExpression)
  // 17: BINARY(ExponentExpression)
  // 18: PREFIX(UnaryExpression)
  // 19: POSTFIX(IncrementExpression)
  // 20: POSTFIX(IndexAccessExpression)
  // 21: POSTFIX(MemberAccessExpression)
  // 22: ATOM(InlineArrayExpression)
  // 23: ATOM(PrimaryExpression)
  // 24: POSTFIX(ArrowExpression)
  // 25: BINARY(AliasExpression)
  public static boolean Expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = TypedAssignmentExpression(b, l + 1);
    if (!r) r = FunctionCallExpression(b, l + 1);
    if (!r) r = ParenExpression(b, l + 1);
    if (!r) r = NewExpression(b, l + 1);
    if (!r) r = UnaryExpression(b, l + 1);
    if (!r) r = InlineArrayExpression(b, l + 1);
    if (!r) r = PrimaryExpression(b, l + 1);
    p = r;
    r = r && Expression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean Expression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && AssignmentExpression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, ASSIGNMENT_EXPRESSION, r, true, null);
      }
      else if (g < 2 && TernaryExpression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, TERNARY_EXPRESSION, r, true, null);
      }
      else if (g < 4 && CallExpression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, CALL_EXPRESSION, r, true, null);
      }
      else if (g < 7 && EqExpression_0(b, l + 1)) {
        r = Expression(b, l, 7);
        exit_section_(b, l, m, EQ_EXPRESSION, r, true, null);
      }
      else if (g < 8 && consumeTokenSmart(b, OROR)) {
        r = Expression(b, l, 8);
        exit_section_(b, l, m, OR_EXPRESSION, r, true, null);
      }
      else if (g < 9 && consumeTokenSmart(b, ANDAND)) {
        r = Expression(b, l, 9);
        exit_section_(b, l, m, AND_EXPRESSION, r, true, null);
      }
      else if (g < 10 && CompExpression_0(b, l + 1)) {
        r = Expression(b, l, 10);
        exit_section_(b, l, m, COMP_EXPRESSION, r, true, null);
      }
      else if (g < 11 && consumeTokenSmart(b, OR)) {
        r = Expression(b, l, 11);
        exit_section_(b, l, m, OR_OP_EXPRESSION, r, true, null);
      }
      else if (g < 12 && consumeTokenSmart(b, CARET)) {
        r = Expression(b, l, 12);
        exit_section_(b, l, m, XOR_OP_EXPRESSION, r, true, null);
      }
      else if (g < 13 && consumeTokenSmart(b, AND)) {
        r = Expression(b, l, 13);
        exit_section_(b, l, m, AND_OP_EXPRESSION, r, true, null);
      }
      else if (g < 14 && ShiftExpression_0(b, l + 1)) {
        r = Expression(b, l, 14);
        exit_section_(b, l, m, SHIFT_EXPRESSION, r, true, null);
      }
      else if (g < 15 && PlusMinExpression_0(b, l + 1)) {
        r = Expression(b, l, 15);
        exit_section_(b, l, m, PLUS_MIN_EXPRESSION, r, true, null);
      }
      else if (g < 16 && MultDivExpression_0(b, l + 1)) {
        r = Expression(b, l, 16);
        exit_section_(b, l, m, MULT_DIV_EXPRESSION, r, true, null);
      }
      else if (g < 17 && consumeTokenSmart(b, EXPONENT)) {
        r = Expression(b, l, 17);
        exit_section_(b, l, m, EXPONENT_EXPRESSION, r, true, null);
      }
      else if (g < 19 && IncrementExpression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INCREMENT_EXPRESSION, r, true, null);
      }
      else if (g < 20 && IndexAccessExpression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INDEX_ACCESS_EXPRESSION, r, true, null);
      }
      else if (g < 21 && parseTokensSmart(b, 0, DOT, IDENTIFIER)) {
        r = true;
        exit_section_(b, l, m, MEMBER_ACCESS_EXPRESSION, r, true, null);
      }
      else if (g < 24 && ArrowExpression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, ARROW_EXPRESSION, r, true, null);
      }
      else if (g < 25 && consumeTokenSmart(b, "@")) {
        r = Expression(b, l, 25);
        exit_section_(b, l, m, ALIAS_EXPRESSION, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // ('=' | '|=' | '^=' | '&=' | '<<=' | '>>=' | '+=' | '-=' | '*=' | '/=' | '%=') (Expression | SophiaType | EmptyObject)
  private static boolean AssignmentExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignmentExpression_0_0(b, l + 1);
    r = r && AssignmentExpression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' | '|=' | '^=' | '&=' | '<<=' | '>>=' | '+=' | '-=' | '*=' | '/=' | '%='
  private static boolean AssignmentExpression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentExpression_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ASSIGN);
    if (!r) r = consumeTokenSmart(b, OR_ASSIGN);
    if (!r) r = consumeTokenSmart(b, XOR_ASSIGN);
    if (!r) r = consumeTokenSmart(b, AND_ASSIGN);
    if (!r) r = consumeTokenSmart(b, LSHIFT_ASSIGN);
    if (!r) r = consumeTokenSmart(b, RSHIFT_ASSIGN);
    if (!r) r = consumeTokenSmart(b, PLUS_ASSIGN);
    if (!r) r = consumeTokenSmart(b, MINUS_ASSIGN);
    if (!r) r = consumeTokenSmart(b, MULT_ASSIGN);
    if (!r) r = consumeTokenSmart(b, DIV_ASSIGN);
    if (!r) r = consumeTokenSmart(b, PERCENT_ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression | SophiaType | EmptyObject
  private static boolean AssignmentExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentExpression_0_1")) return false;
    boolean r;
    r = Expression(b, l + 1, -1);
    if (!r) r = SophiaType(b, l + 1);
    if (!r) r = EmptyObject(b, l + 1);
    return r;
  }

  // ':' (ElementaryTypeName | SophiaType)+
  public static boolean TypedAssignmentExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedAssignmentExpression")) return false;
    if (!nextTokenIsSmart(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COLON);
    r = r && TypedAssignmentExpression_1(b, l + 1);
    exit_section_(b, m, TYPED_ASSIGNMENT_EXPRESSION, r);
    return r;
  }

  // (ElementaryTypeName | SophiaType)+
  private static boolean TypedAssignmentExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedAssignmentExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypedAssignmentExpression_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!TypedAssignmentExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypedAssignmentExpression_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ElementaryTypeName | SophiaType
  private static boolean TypedAssignmentExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedAssignmentExpression_1_0")) return false;
    boolean r;
    r = ElementaryTypeName(b, l + 1);
    if (!r) r = SophiaType(b, l + 1);
    return r;
  }

  // '?' RightTernaryExpression
  private static boolean TernaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TernaryExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, QUESTION);
    r = r && RightTernaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Identifier '(' FunctionCallArguments? ')') |
  //                            ( ( PrimaryExpression | NewExpression | TypeName  ) ( ( '.' Identifier ) | ( '[' Expression? ']' ) )* '(' FunctionCallArguments? ')' )
  public static boolean FunctionCallExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL_EXPRESSION, "<function call expression>");
    r = FunctionCallExpression_0(b, l + 1);
    if (!r) r = FunctionCallExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Identifier '(' FunctionCallArguments? ')'
  private static boolean FunctionCallExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, IDENTIFIER, LPAREN);
    r = r && FunctionCallExpression_0_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionCallArguments?
  private static boolean FunctionCallExpression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_0_2")) return false;
    FunctionCallArguments(b, l + 1);
    return true;
  }

  // ( PrimaryExpression | NewExpression | TypeName  ) ( ( '.' Identifier ) | ( '[' Expression? ']' ) )* '(' FunctionCallArguments? ')'
  private static boolean FunctionCallExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionCallExpression_1_0(b, l + 1);
    r = r && FunctionCallExpression_1_1(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && FunctionCallExpression_1_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // PrimaryExpression | NewExpression | TypeName
  private static boolean FunctionCallExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1_0")) return false;
    boolean r;
    r = PrimaryExpression(b, l + 1);
    if (!r) r = NewExpression(b, l + 1);
    if (!r) r = TypeName(b, l + 1, -1);
    return r;
  }

  // ( ( '.' Identifier ) | ( '[' Expression? ']' ) )*
  private static boolean FunctionCallExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionCallExpression_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionCallExpression_1_1", c)) break;
    }
    return true;
  }

  // ( '.' Identifier ) | ( '[' Expression? ']' )
  private static boolean FunctionCallExpression_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionCallExpression_1_1_0_0(b, l + 1);
    if (!r) r = FunctionCallExpression_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.' Identifier
  private static boolean FunctionCallExpression_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' Expression? ']'
  private static boolean FunctionCallExpression_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACKET);
    r = r && FunctionCallExpression_1_1_0_1_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean FunctionCallExpression_1_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1_1_0_1_1")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  // FunctionCallArguments?
  private static boolean FunctionCallExpression_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpression_1_3")) return false;
    FunctionCallArguments(b, l + 1);
    return true;
  }

  // ( ( '.' Identifier ) | ( '[' Expression ']' ) )* '(' FunctionCallArguments? ')' ('(' FunctionCallArguments? ')')*
  private static boolean CallExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallExpression_0_0(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && CallExpression_0_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && CallExpression_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( '.' Identifier ) | ( '[' Expression ']' ) )*
  private static boolean CallExpression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CallExpression_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallExpression_0_0", c)) break;
    }
    return true;
  }

  // ( '.' Identifier ) | ( '[' Expression ']' )
  private static boolean CallExpression_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallExpression_0_0_0_0(b, l + 1);
    if (!r) r = CallExpression_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.' Identifier
  private static boolean CallExpression_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' Expression ']'
  private static boolean CallExpression_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACKET);
    r = r && Expression(b, l + 1, -1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionCallArguments?
  private static boolean CallExpression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_2")) return false;
    FunctionCallArguments(b, l + 1);
    return true;
  }

  // ('(' FunctionCallArguments? ')')*
  private static boolean CallExpression_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CallExpression_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallExpression_0_4", c)) break;
    }
    return true;
  }

  // '(' FunctionCallArguments? ')'
  private static boolean CallExpression_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LPAREN);
    r = r && CallExpression_0_4_0_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionCallArguments?
  private static boolean CallExpression_0_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpression_0_4_0_1")) return false;
    FunctionCallArguments(b, l + 1);
    return true;
  }

  public static boolean ParenExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenExpression")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LPAREN);
    p = r;
    r = p && Expression(b, l, 5);
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    exit_section_(b, l, m, PAREN_EXPRESSION, r, p, null);
    return r || p;
  }

  // new ( Identifier | PrimitiveLiteral )
  public static boolean NewExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpression")) return false;
    if (!nextTokenIsSmart(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, NEW);
    r = r && NewExpression_1(b, l + 1);
    exit_section_(b, m, NEW_EXPRESSION, r);
    return r;
  }

  // Identifier | PrimitiveLiteral
  private static boolean NewExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewExpression_1")) return false;
    boolean r;
    r = consumeTokenSmart(b, IDENTIFIER);
    if (!r) r = PrimitiveLiteral(b, l + 1);
    return r;
  }

  // '==' | '!='
  private static boolean EqExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EqExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, EQ);
    if (!r) r = consumeTokenSmart(b, NEQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<' | '>' | '<=' | '>='
  private static boolean CompExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LESS);
    if (!r) r = consumeTokenSmart(b, MORE);
    if (!r) r = consumeTokenSmart(b, LESSEQ);
    if (!r) r = consumeTokenSmart(b, MOREEQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<<' | '>>'
  private static boolean ShiftExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LSHIFT);
    if (!r) r = consumeTokenSmart(b, RSHIFT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+' | '-'
  private static boolean PlusMinExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PlusMinExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, PLUS);
    if (!r) r = consumeTokenSmart(b, MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' | '/' | '%'
  private static boolean MultDivExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultDivExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, MULT);
    if (!r) r = consumeTokenSmart(b, DIV);
    if (!r) r = consumeTokenSmart(b, PERCENT);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean UnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = UnaryExpression_0(b, l + 1);
    p = r;
    r = p && Expression(b, l, 18);
    exit_section_(b, l, m, UNARY_EXPRESSION, r, p, null);
    return r || p;
  }

  // '!' | '~' | delete | '++' | '--' | '+' | '-'
  private static boolean UnaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, NOT);
    if (!r) r = consumeTokenSmart(b, TILDE);
    if (!r) r = consumeTokenSmart(b, DELETE);
    if (!r) r = consumeTokenSmart(b, INC);
    if (!r) r = consumeTokenSmart(b, DEC);
    if (!r) r = consumeTokenSmart(b, PLUS);
    if (!r) r = consumeTokenSmart(b, MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  // '++' | '--'
  private static boolean IncrementExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IncrementExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, INC);
    if (!r) r = consumeTokenSmart(b, DEC);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' Expression? ']'
  private static boolean IndexAccessExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexAccessExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACKET);
    r = r && IndexAccessExpression_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean IndexAccessExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexAccessExpression_0_1")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  // '[' Expression (',' Expression)* ']'
  public static boolean InlineArrayExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InlineArrayExpression")) return false;
    if (!nextTokenIsSmart(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACKET);
    r = r && Expression(b, l + 1, -1);
    r = r && InlineArrayExpression_2(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, INLINE_ARRAY_EXPRESSION, r);
    return r;
  }

  // (',' Expression)*
  private static boolean InlineArrayExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InlineArrayExpression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!InlineArrayExpression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InlineArrayExpression_2", c)) break;
    }
    return true;
  }

  // ',' Expression
  private static boolean InlineArrayExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InlineArrayExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VarLiteral
  //                   | BooleanLiteral
  //                   | NumberLiteral
  //                   | HexLiteral
  //                   | StringLiteral
  //                   | ElementaryTypeNameExpression
  public static boolean PrimaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPRESSION, "<primary expression>");
    r = VarLiteral(b, l + 1);
    if (!r) r = BooleanLiteral(b, l + 1);
    if (!r) r = NumberLiteral(b, l + 1);
    if (!r) r = HexLiteral(b, l + 1);
    if (!r) r = StringLiteral(b, l + 1);
    if (!r) r = ElementaryTypeNameExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '=>' Expression?
  private static boolean ArrowExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrowExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, TO);
    r = r && ArrowExpression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean ArrowExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrowExpression_0_1")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // Expression root: TypeName
  // Operator priority table:
  // 0: ATOM(ElementaryTypeName)
  // 1: ATOM(MappingTypeName)
  // 2: ATOM(UserDefinedLocationTypeName)
  // 3: POSTFIX(ArrayTypeName)
  // 4: ATOM(FunctionTypeName)
  public static boolean TypeName(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "TypeName")) return false;
    addVariant(b, "<type name>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<type name>");
    r = ElementaryTypeName(b, l + 1);
    if (!r) r = MappingTypeName(b, l + 1);
    if (!r) r = UserDefinedLocationTypeName(b, l + 1);
    if (!r) r = FunctionTypeName(b, l + 1);
    p = r;
    r = r && TypeName_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean TypeName_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "TypeName_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 3 && ArrayTypeName_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, ARRAY_TYPE_NAME, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // address | bool | string | var | let | type | None | Some | MapType
  public static boolean ElementaryTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElementaryTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENTARY_TYPE_NAME, "<elementary type name>");
    r = consumeTokenSmart(b, ADDRESS);
    if (!r) r = consumeTokenSmart(b, BOOL);
    if (!r) r = consumeTokenSmart(b, STRING);
    if (!r) r = consumeTokenSmart(b, VAR);
    if (!r) r = consumeTokenSmart(b, LET);
    if (!r) r = consumeTokenSmart(b, TYPE);
    if (!r) r = consumeTokenSmart(b, NONE);
    if (!r) r = consumeTokenSmart(b, SOME);
    if (!r) r = MapType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // mapping '(' ( ElementaryTypeName  ) '=>' TypeName ')'
  public static boolean MappingTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MappingTypeName")) return false;
    if (!nextTokenIsSmart(b, MAPPING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, MAPPING, LPAREN);
    r = r && MappingTypeName_2(b, l + 1);
    r = r && consumeToken(b, TO);
    r = r && TypeName(b, l + 1, -1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, MAPPING_TYPE_NAME, r);
    return r;
  }

  // ( ElementaryTypeName  )
  private static boolean MappingTypeName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MappingTypeName_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ElementaryTypeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UserDefinedWithLocationTypeName | UserDefinedWithoutLocationTypeName
  public static boolean UserDefinedLocationTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefinedLocationTypeName")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, USER_DEFINED_LOCATION_TYPE_NAME, null);
    r = UserDefinedWithLocationTypeName(b, l + 1);
    if (!r) r = UserDefinedWithoutLocationTypeName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '[' Expression? ']' StorageLocation?
  private static boolean ArrayTypeName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayTypeName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACKET);
    r = r && ArrayTypeName_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    r = r && ArrayTypeName_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean ArrayTypeName_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayTypeName_0_1")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  // StorageLocation?
  private static boolean ArrayTypeName_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayTypeName_0_3")) return false;
    consumeTokenSmart(b, STORAGELOCATION);
    return true;
  }

  // function ParameterList ( internal | external  )*
  public static boolean FunctionTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName")) return false;
    if (!nextTokenIsSmart(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, FUNCTION);
    r = r && ParameterList(b, l + 1);
    r = r && FunctionTypeName_2(b, l + 1);
    exit_section_(b, m, FUNCTION_TYPE_NAME, r);
    return r;
  }

  // ( internal | external  )*
  private static boolean FunctionTypeName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionTypeName_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionTypeName_2", c)) break;
    }
    return true;
  }

  // internal | external
  private static boolean FunctionTypeName_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_2_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, INTERNAL);
    if (!r) r = consumeTokenSmart(b, EXTERNAL);
    return r;
  }

}
