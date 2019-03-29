// This is a generated file. Not intended for manual editing.
package org.limechain.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.limechain.psi.impl.*;

public interface SophiaTypes {

  IElementType ALIAS_EXPRESSION = new SophiaElementType("ALIAS_EXPRESSION");
  IElementType AND_EXPRESSION = new SophiaElementType("AND_EXPRESSION");
  IElementType AND_OP_EXPRESSION = new SophiaElementType("AND_OP_EXPRESSION");
  IElementType ARRAY_TYPE_NAME = new SophiaElementType("ARRAY_TYPE_NAME");
  IElementType ARROW_EXPRESSION = new SophiaElementType("ARROW_EXPRESSION");
  IElementType ASSIGNMENT_EXPRESSION = new SophiaElementType("ASSIGNMENT_EXPRESSION");
  IElementType BLOCK = new SophiaElementType("BLOCK");
  IElementType BOOLEAN_LITERAL = new SophiaElementType("BOOLEAN_LITERAL");
  IElementType BREAK_ST = new SophiaElementType("BREAK_ST");
  IElementType CALL_EXPRESSION = new SophiaElementType("CALL_EXPRESSION");
  IElementType COMP_EXPRESSION = new SophiaElementType("COMP_EXPRESSION");
  IElementType CONTINUE_ST = new SophiaElementType("CONTINUE_ST");
  IElementType CONTRACT_DEFINITION = new SophiaElementType("CONTRACT_DEFINITION");
  IElementType CONTRACT_NAME = new SophiaElementType("CONTRACT_NAME");
  IElementType DECLARATION_ITEM = new SophiaElementType("DECLARATION_ITEM");
  IElementType DECLARATION_LIST = new SophiaElementType("DECLARATION_LIST");
  IElementType DO_WHILE_STATEMENT = new SophiaElementType("DO_WHILE_STATEMENT");
  IElementType ELEMENTARY_TYPE_NAME = new SophiaElementType("ELEMENTARY_TYPE_NAME");
  IElementType ELSE_STATEMENT = new SophiaElementType("ELSE_STATEMENT");
  IElementType EMIT_STATEMENT = new SophiaElementType("EMIT_STATEMENT");
  IElementType EMPTY_OBJECT = new SophiaElementType("EMPTY_OBJECT");
  IElementType ENUM_DEFINITION = new SophiaElementType("ENUM_DEFINITION");
  IElementType ENUM_VALUE = new SophiaElementType("ENUM_VALUE");
  IElementType EQ_EXPRESSION = new SophiaElementType("EQ_EXPRESSION");
  IElementType EVENT_DEFINITION = new SophiaElementType("EVENT_DEFINITION");
  IElementType EXPONENT_EXPRESSION = new SophiaElementType("EXPONENT_EXPRESSION");
  IElementType EXPRESSION = new SophiaElementType("EXPRESSION");
  IElementType FOR_STATEMENT = new SophiaElementType("FOR_STATEMENT");
  IElementType FUNCTION_CALL_ARGUMENTS = new SophiaElementType("FUNCTION_CALL_ARGUMENTS");
  IElementType FUNCTION_CALL_EXPRESSION = new SophiaElementType("FUNCTION_CALL_EXPRESSION");
  IElementType FUNCTION_DEFINITION = new SophiaElementType("FUNCTION_DEFINITION");
  IElementType FUNCTION_MODIFIER = new SophiaElementType("FUNCTION_MODIFIER");
  IElementType FUNCTION_TYPE_NAME = new SophiaElementType("FUNCTION_TYPE_NAME");
  IElementType IF_STATEMENT = new SophiaElementType("IF_STATEMENT");
  IElementType IMPORT_ALIAS = new SophiaElementType("IMPORT_ALIAS");
  IElementType IMPORT_ALIASED_PAIR = new SophiaElementType("IMPORT_ALIASED_PAIR");
  IElementType IMPORT_DIRECTIVE = new SophiaElementType("IMPORT_DIRECTIVE");
  IElementType IMPORT_PATH = new SophiaElementType("IMPORT_PATH");
  IElementType INCREMENT_EXPRESSION = new SophiaElementType("INCREMENT_EXPRESSION");
  IElementType INDEX_ACCESS_EXPRESSION = new SophiaElementType("INDEX_ACCESS_EXPRESSION");
  IElementType INIT_FUNCTION_DEFINITION = new SophiaElementType("INIT_FUNCTION_DEFINITION");
  IElementType INLINE_ARRAY_EXPRESSION = new SophiaElementType("INLINE_ARRAY_EXPRESSION");
  IElementType MAPPING_TYPE_NAME = new SophiaElementType("MAPPING_TYPE_NAME");
  IElementType MAP_ITERATION = new SophiaElementType("MAP_ITERATION");
  IElementType MAP_TYPE = new SophiaElementType("MAP_TYPE");
  IElementType MEMBER_ACCESS_EXPRESSION = new SophiaElementType("MEMBER_ACCESS_EXPRESSION");
  IElementType MULT_DIV_EXPRESSION = new SophiaElementType("MULT_DIV_EXPRESSION");
  IElementType NEW_EXPRESSION = new SophiaElementType("NEW_EXPRESSION");
  IElementType NUMBER_LITERAL = new SophiaElementType("NUMBER_LITERAL");
  IElementType OBJECT_EXPRESSION = new SophiaElementType("OBJECT_EXPRESSION");
  IElementType OR_EXPRESSION = new SophiaElementType("OR_EXPRESSION");
  IElementType OR_OP_EXPRESSION = new SophiaElementType("OR_OP_EXPRESSION");
  IElementType PARAMETER_DEF = new SophiaElementType("PARAMETER_DEF");
  IElementType PARAMETER_LIST = new SophiaElementType("PARAMETER_LIST");
  IElementType PAREN_EXPRESSION = new SophiaElementType("PAREN_EXPRESSION");
  IElementType PLACEHOLDER_STATEMENT = new SophiaElementType("PLACEHOLDER_STATEMENT");
  IElementType PLUS_MIN_EXPRESSION = new SophiaElementType("PLUS_MIN_EXPRESSION");
  IElementType PRIMARY_EXPRESSION = new SophiaElementType("PRIMARY_EXPRESSION");
  IElementType RECORD_DEFINITION = new SophiaElementType("RECORD_DEFINITION");
  IElementType SEQ_EXPRESSION = new SophiaElementType("SEQ_EXPRESSION");
  IElementType SHIFT_EXPRESSION = new SophiaElementType("SHIFT_EXPRESSION");
  IElementType SOPHIA_TYPE = new SophiaElementType("SOPHIA_TYPE");
  IElementType STATEMENT = new SophiaElementType("STATEMENT");
  IElementType STATE_UPDATE_EXPRESSION = new SophiaElementType("STATE_UPDATE_EXPRESSION");
  IElementType STATE_VARIABLE_DECLARATION = new SophiaElementType("STATE_VARIABLE_DECLARATION");
  IElementType SWITCH_STATEMENT = new SophiaElementType("SWITCH_STATEMENT");
  IElementType TERNARY_EXPRESSION = new SophiaElementType("TERNARY_EXPRESSION");
  IElementType THROW_ST = new SophiaElementType("THROW_ST");
  IElementType TUPLE_STATEMENT = new SophiaElementType("TUPLE_STATEMENT");
  IElementType TYPED_ASSIGNMENT_EXPRESSION = new SophiaElementType("TYPED_ASSIGNMENT_EXPRESSION");
  IElementType TYPED_DECLARATION_ITEM = new SophiaElementType("TYPED_DECLARATION_ITEM");
  IElementType TYPED_DECLARATION_LIST = new SophiaElementType("TYPED_DECLARATION_LIST");
  IElementType TYPE_NAME = new SophiaElementType("TYPE_NAME");
  IElementType UNARY_EXPRESSION = new SophiaElementType("UNARY_EXPRESSION");
  IElementType USER_DEFINED_LOCATION_TYPE_NAME = new SophiaElementType("USER_DEFINED_LOCATION_TYPE_NAME");
  IElementType USER_DEFINED_TYPE_NAME = new SophiaElementType("USER_DEFINED_TYPE_NAME");
  IElementType VARIABLE_DECLARATION = new SophiaElementType("VARIABLE_DECLARATION");
  IElementType VARIABLE_DEFINITION = new SophiaElementType("VARIABLE_DEFINITION");
  IElementType VAR_LITERAL = new SophiaElementType("VAR_LITERAL");
  IElementType WHILE_STATEMENT = new SophiaElementType("WHILE_STATEMENT");
  IElementType XOR_OP_EXPRESSION = new SophiaElementType("XOR_OP_EXPRESSION");

  IElementType ABORT = new SophiaTokenType("abort");
  IElementType ADDRESS = new SophiaTokenType("address");
  IElementType AND = new SophiaTokenType("&");
  IElementType ANDAND = new SophiaTokenType("&&");
  IElementType AND_ASSIGN = new SophiaTokenType("&=");
  IElementType ANONYMOUS = new SophiaTokenType("anonymous");
  IElementType AS = new SophiaTokenType("as");
  IElementType ASSIGN = new SophiaTokenType("=");
  IElementType BITS = new SophiaTokenType("bits");
  IElementType BOOL = new SophiaTokenType("bool");
  IElementType BOOLEANLITERAL = new SophiaTokenType("booleanLiteral");
  IElementType BREAK = new SophiaTokenType("break");
  IElementType BYTENUMTYPE = new SophiaTokenType("byteNumType");
  IElementType BYTESNUMTYPE = new SophiaTokenType("bytesNumType");
  IElementType CARET = new SophiaTokenType("^");
  IElementType COLON = new SophiaTokenType(":");
  IElementType COMMA = new SophiaTokenType(",");
  IElementType COMMENT = new SophiaTokenType("comment");
  IElementType CONSTANT = new SophiaTokenType("constant");
  IElementType CONTINUE = new SophiaTokenType("continue");
  IElementType CONTRACT = new SophiaTokenType("contract");
  IElementType DEC = new SophiaTokenType("--");
  IElementType DECIMALNUMBER = new SophiaTokenType("decimalNumber");
  IElementType DELETE = new SophiaTokenType("delete");
  IElementType DIV = new SophiaTokenType("/");
  IElementType DIV_ASSIGN = new SophiaTokenType("/=");
  IElementType DO = new SophiaTokenType("do");
  IElementType DOC_COMMENT_BEGIN = new SophiaTokenType("/*");
  IElementType DOC_COMMENT_END = new SophiaTokenType("*/");
  IElementType DOT = new SophiaTokenType(".");
  IElementType ELIF = new SophiaTokenType("elif");
  IElementType ELSE = new SophiaTokenType("else");
  IElementType EMIT = new SophiaTokenType("emit");
  IElementType ENUM = new SophiaTokenType("enum");
  IElementType EQ = new SophiaTokenType("==");
  IElementType EVENT = new SophiaTokenType("event");
  IElementType EVENTS = new SophiaTokenType("events");
  IElementType EXPONENT = new SophiaTokenType("**");
  IElementType EXTERNAL = new SophiaTokenType("external");
  IElementType FIXEDNUMBER = new SophiaTokenType("fixedNumber");
  IElementType FIXEDNUMTYPE = new SophiaTokenType("fixedNumType");
  IElementType FOR = new SophiaTokenType("for");
  IElementType FUNCTION = new SophiaTokenType("function");
  IElementType HASH = new SophiaTokenType("hash");
  IElementType HEXLITERAL = new SophiaTokenType("hexLiteral");
  IElementType HEXNUMBER = new SophiaTokenType("hexNumber");
  IElementType IDENTIFIER = new SophiaTokenType("Identifier");
  IElementType IF = new SophiaTokenType("if");
  IElementType INC = new SophiaTokenType("++");
  IElementType INCLUDE = new SophiaTokenType("include");
  IElementType INIT = new SophiaTokenType("init");
  IElementType INT = new SophiaTokenType("int");
  IElementType INTERNAL = new SophiaTokenType("internal");
  IElementType INTNUMTYPE = new SophiaTokenType("intNumType");
  IElementType LBRACE = new SophiaTokenType("{");
  IElementType LBRACKET = new SophiaTokenType("[");
  IElementType LEFT_ASSEMBLY = new SophiaTokenType(":=");
  IElementType LESS = new SophiaTokenType("<");
  IElementType LESSEQ = new SophiaTokenType("<=");
  IElementType LET = new SophiaTokenType("let");
  IElementType LIBRARY = new SophiaTokenType("library");
  IElementType LIST = new SophiaTokenType("list");
  IElementType LPAREN = new SophiaTokenType("(");
  IElementType LSHIFT = new SophiaTokenType("<<");
  IElementType LSHIFT_ASSIGN = new SophiaTokenType("<<=");
  IElementType MAP = new SophiaTokenType("map");
  IElementType MAPPING = new SophiaTokenType("mapping");
  IElementType MINUS = new SophiaTokenType("-");
  IElementType MINUS_ASSIGN = new SophiaTokenType("-=");
  IElementType MORE = new SophiaTokenType(">");
  IElementType MOREEQ = new SophiaTokenType(">=");
  IElementType MULT = new SophiaTokenType("*");
  IElementType MULT_ASSIGN = new SophiaTokenType("*=");
  IElementType NEQ = new SophiaTokenType("!=");
  IElementType NEW = new SophiaTokenType("new");
  IElementType NONE = new SophiaTokenType("None");
  IElementType NOT = new SophiaTokenType("!");
  IElementType OR = new SophiaTokenType("|");
  IElementType OROR = new SophiaTokenType("||");
  IElementType OR_ASSIGN = new SophiaTokenType("|=");
  IElementType PERCENT = new SophiaTokenType("%");
  IElementType PERCENT_ASSIGN = new SophiaTokenType("%=");
  IElementType PLUS = new SophiaTokenType("+");
  IElementType PLUS_ASSIGN = new SophiaTokenType("+=");
  IElementType PRIVATE = new SophiaTokenType("private");
  IElementType PUBLIC = new SophiaTokenType("public");
  IElementType QUESTION = new SophiaTokenType("?");
  IElementType RBRACE = new SophiaTokenType("}");
  IElementType RBRACKET = new SophiaTokenType("]");
  IElementType RECORD = new SophiaTokenType("record");
  IElementType RIGHT_ASSEMBLY = new SophiaTokenType("=:");
  IElementType RPAREN = new SophiaTokenType(")");
  IElementType RSHIFT = new SophiaTokenType(">>");
  IElementType RSHIFT_ASSIGN = new SophiaTokenType(">>=");
  IElementType SCIENTIFICNUMBER = new SophiaTokenType("scientificNumber");
  IElementType SEMICOLON = new SophiaTokenType(";");
  IElementType SIGNATURE = new SophiaTokenType("signature");
  IElementType SOME = new SophiaTokenType("Some");
  IElementType STATE = new SophiaTokenType("state");
  IElementType STATEFUL = new SophiaTokenType("stateful");
  IElementType STATEMUTABILITY = new SophiaTokenType("StateMutability");
  IElementType STORAGELOCATION = new SophiaTokenType("StorageLocation");
  IElementType STRING = new SophiaTokenType("string");
  IElementType STRINGLITERAL = new SophiaTokenType("stringLiteral");
  IElementType SWITCH = new SophiaTokenType("switch");
  IElementType TILDE = new SophiaTokenType("~");
  IElementType TO = new SophiaTokenType("=>");
  IElementType TRANSACTIONS = new SophiaTokenType("transactions");
  IElementType TUPLE = new SophiaTokenType("tuple");
  IElementType TYPE = new SophiaTokenType("type");
  IElementType UFIXEDNUMTYPE = new SophiaTokenType("uFixedNumType");
  IElementType UINTNUMTYPE = new SophiaTokenType("uIntNumType");
  IElementType VAR = new SophiaTokenType("var");
  IElementType WHILE = new SophiaTokenType("while");
  IElementType XOR_ASSIGN = new SophiaTokenType("^=");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALIAS_EXPRESSION) {
        return new SophiaAliasExpressionImpl(node);
      }
      else if (type == AND_EXPRESSION) {
        return new SophiaAndExpressionImpl(node);
      }
      else if (type == AND_OP_EXPRESSION) {
        return new SophiaAndOpExpressionImpl(node);
      }
      else if (type == ARRAY_TYPE_NAME) {
        return new SophiaArrayTypeNameImpl(node);
      }
      else if (type == ARROW_EXPRESSION) {
        return new SophiaArrowExpressionImpl(node);
      }
      else if (type == ASSIGNMENT_EXPRESSION) {
        return new SophiaAssignmentExpressionImpl(node);
      }
      else if (type == BLOCK) {
        return new SophiaBlockImpl(node);
      }
      else if (type == BOOLEAN_LITERAL) {
        return new SophiaBooleanLiteralImpl(node);
      }
      else if (type == BREAK_ST) {
        return new SophiaBreakStImpl(node);
      }
      else if (type == CALL_EXPRESSION) {
        return new SophiaCallExpressionImpl(node);
      }
      else if (type == COMP_EXPRESSION) {
        return new SophiaCompExpressionImpl(node);
      }
      else if (type == CONTINUE_ST) {
        return new SophiaContinueStImpl(node);
      }
      else if (type == CONTRACT_DEFINITION) {
        return new SophiaContractDefinitionImpl(node);
      }
      else if (type == CONTRACT_NAME) {
        return new SophiaContractNameImpl(node);
      }
      else if (type == DECLARATION_ITEM) {
        return new SophiaDeclarationItemImpl(node);
      }
      else if (type == DECLARATION_LIST) {
        return new SophiaDeclarationListImpl(node);
      }
      else if (type == DO_WHILE_STATEMENT) {
        return new SophiaDoWhileStatementImpl(node);
      }
      else if (type == ELEMENTARY_TYPE_NAME) {
        return new SophiaElementaryTypeNameImpl(node);
      }
      else if (type == ELSE_STATEMENT) {
        return new SophiaElseStatementImpl(node);
      }
      else if (type == EMIT_STATEMENT) {
        return new SophiaEmitStatementImpl(node);
      }
      else if (type == EMPTY_OBJECT) {
        return new SophiaEmptyObjectImpl(node);
      }
      else if (type == ENUM_DEFINITION) {
        return new SophiaEnumDefinitionImpl(node);
      }
      else if (type == ENUM_VALUE) {
        return new SophiaEnumValueImpl(node);
      }
      else if (type == EQ_EXPRESSION) {
        return new SophiaEqExpressionImpl(node);
      }
      else if (type == EVENT_DEFINITION) {
        return new SophiaEventDefinitionImpl(node);
      }
      else if (type == EXPONENT_EXPRESSION) {
        return new SophiaExponentExpressionImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new SophiaForStatementImpl(node);
      }
      else if (type == FUNCTION_CALL_ARGUMENTS) {
        return new SophiaFunctionCallArgumentsImpl(node);
      }
      else if (type == FUNCTION_CALL_EXPRESSION) {
        return new SophiaFunctionCallExpressionImpl(node);
      }
      else if (type == FUNCTION_DEFINITION) {
        return new SophiaFunctionDefinitionImpl(node);
      }
      else if (type == FUNCTION_MODIFIER) {
        return new SophiaFunctionModifierImpl(node);
      }
      else if (type == FUNCTION_TYPE_NAME) {
        return new SophiaFunctionTypeNameImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new SophiaIfStatementImpl(node);
      }
      else if (type == IMPORT_ALIAS) {
        return new SophiaImportAliasImpl(node);
      }
      else if (type == IMPORT_ALIASED_PAIR) {
        return new SophiaImportAliasedPairImpl(node);
      }
      else if (type == IMPORT_DIRECTIVE) {
        return new SophiaImportDirectiveImpl(node);
      }
      else if (type == IMPORT_PATH) {
        return new SophiaImportPathImpl(node);
      }
      else if (type == INCREMENT_EXPRESSION) {
        return new SophiaIncrementExpressionImpl(node);
      }
      else if (type == INDEX_ACCESS_EXPRESSION) {
        return new SophiaIndexAccessExpressionImpl(node);
      }
      else if (type == INIT_FUNCTION_DEFINITION) {
        return new SophiaInitFunctionDefinitionImpl(node);
      }
      else if (type == INLINE_ARRAY_EXPRESSION) {
        return new SophiaInlineArrayExpressionImpl(node);
      }
      else if (type == MAPPING_TYPE_NAME) {
        return new SophiaMappingTypeNameImpl(node);
      }
      else if (type == MAP_ITERATION) {
        return new SophiaMapIterationImpl(node);
      }
      else if (type == MAP_TYPE) {
        return new SophiaMapTypeImpl(node);
      }
      else if (type == MEMBER_ACCESS_EXPRESSION) {
        return new SophiaMemberAccessExpressionImpl(node);
      }
      else if (type == MULT_DIV_EXPRESSION) {
        return new SophiaMultDivExpressionImpl(node);
      }
      else if (type == NEW_EXPRESSION) {
        return new SophiaNewExpressionImpl(node);
      }
      else if (type == NUMBER_LITERAL) {
        return new SophiaNumberLiteralImpl(node);
      }
      else if (type == OBJECT_EXPRESSION) {
        return new SophiaObjectExpressionImpl(node);
      }
      else if (type == OR_EXPRESSION) {
        return new SophiaOrExpressionImpl(node);
      }
      else if (type == OR_OP_EXPRESSION) {
        return new SophiaOrOpExpressionImpl(node);
      }
      else if (type == PARAMETER_DEF) {
        return new SophiaParameterDefImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new SophiaParameterListImpl(node);
      }
      else if (type == PAREN_EXPRESSION) {
        return new SophiaParenExpressionImpl(node);
      }
      else if (type == PLACEHOLDER_STATEMENT) {
        return new SophiaPlaceholderStatementImpl(node);
      }
      else if (type == PLUS_MIN_EXPRESSION) {
        return new SophiaPlusMinExpressionImpl(node);
      }
      else if (type == PRIMARY_EXPRESSION) {
        return new SophiaPrimaryExpressionImpl(node);
      }
      else if (type == RECORD_DEFINITION) {
        return new SophiaRecordDefinitionImpl(node);
      }
      else if (type == SEQ_EXPRESSION) {
        return new SophiaSeqExpressionImpl(node);
      }
      else if (type == SHIFT_EXPRESSION) {
        return new SophiaShiftExpressionImpl(node);
      }
      else if (type == SOPHIA_TYPE) {
        return new SophiaSophiaTypeImpl(node);
      }
      else if (type == STATEMENT) {
        return new SophiaStatementImpl(node);
      }
      else if (type == STATE_UPDATE_EXPRESSION) {
        return new SophiaStateUpdateExpressionImpl(node);
      }
      else if (type == STATE_VARIABLE_DECLARATION) {
        return new SophiaStateVariableDeclarationImpl(node);
      }
      else if (type == SWITCH_STATEMENT) {
        return new SophiaSwitchStatementImpl(node);
      }
      else if (type == TERNARY_EXPRESSION) {
        return new SophiaTernaryExpressionImpl(node);
      }
      else if (type == THROW_ST) {
        return new SophiaThrowStImpl(node);
      }
      else if (type == TUPLE_STATEMENT) {
        return new SophiaTupleStatementImpl(node);
      }
      else if (type == TYPED_ASSIGNMENT_EXPRESSION) {
        return new SophiaTypedAssignmentExpressionImpl(node);
      }
      else if (type == TYPED_DECLARATION_ITEM) {
        return new SophiaTypedDeclarationItemImpl(node);
      }
      else if (type == TYPED_DECLARATION_LIST) {
        return new SophiaTypedDeclarationListImpl(node);
      }
      else if (type == UNARY_EXPRESSION) {
        return new SophiaUnaryExpressionImpl(node);
      }
      else if (type == USER_DEFINED_TYPE_NAME) {
        return new SophiaUserDefinedTypeNameImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new SophiaVariableDeclarationImpl(node);
      }
      else if (type == VARIABLE_DEFINITION) {
        return new SophiaVariableDefinitionImpl(node);
      }
      else if (type == VAR_LITERAL) {
        return new SophiaVarLiteralImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new SophiaWhileStatementImpl(node);
      }
      else if (type == XOR_OP_EXPRESSION) {
        return new SophiaXorOpExpressionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
