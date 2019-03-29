package org.limechain;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.limechain.psi.SophiaTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class SophiaSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEY =
            createTextAttributesKey("SOPHIA_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("SOPHIA_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("SOPHIA_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("SOPHIA_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey PARENTHESES =
            createTextAttributesKey("SOPHIA_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey BRACKETS =
            createTextAttributesKey("SOPHIA_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("SOPHIA_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("SOPHIA_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey HASH =
            createTextAttributesKey("SOPHIA_HASH", DefaultLanguageHighlighterColors.CONSTANT);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] PARENTHESES_KEYS = new TextAttributesKey[]{PARENTHESES};
    private static final TextAttributesKey[] BRACKETS_KEYS = new TextAttributesKey[]{BRACKETS};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] HASH_KEYS = new TextAttributesKey[]{HASH};

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new SophiaLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(SophiaTypes.CONTRACT)
                || tokenType.equals(SophiaTypes.RECORD)
                || tokenType.equals(SophiaTypes.INCLUDE)
                || tokenType.equals(SophiaTypes.LIBRARY)
                || tokenType.equals(SophiaTypes.PUBLIC)
                || tokenType.equals(SophiaTypes.INTERNAL)
                || tokenType.equals(SophiaTypes.PRIVATE)
                || tokenType.equals(SophiaTypes.CONSTANT)
                || tokenType.equals(SophiaTypes.STATE)
                || tokenType.equals(SophiaTypes.FUNCTION)
                || tokenType.equals(SophiaTypes.INIT)
                || tokenType.equals(SophiaTypes.STATEFUL)
                || tokenType.equals(SophiaTypes.EVENT)
                || tokenType.equals(SophiaTypes.ENUM)
                || tokenType.equals(SophiaTypes.LET)
                || tokenType.equals(SophiaTypes.IF)
                || tokenType.equals(SophiaTypes.ELIF)
                || tokenType.equals(SophiaTypes.ELSE)
                || tokenType.equals(SophiaTypes.ABORT)
                || tokenType.equals(SophiaTypes.NEW)
                || tokenType.equals(SophiaTypes.ADDRESS)
                || tokenType.equals(SophiaTypes.STRING)
                || tokenType.equals(SophiaTypes.BOOL)
                || tokenType.equals(SophiaTypes.TYPE)
                || tokenType.equals(SophiaTypes.NONE)
                || tokenType.equals(SophiaTypes.SOME)
                || tokenType.equals(SophiaTypes.INT)
                || tokenType.equals(SophiaTypes.TUPLE)
                || tokenType.equals(SophiaTypes.MAP)
                || tokenType.equals(SophiaTypes.TRANSACTIONS)
                || tokenType.equals(SophiaTypes.SIGNATURE)
                || tokenType.equals(SophiaTypes.BOOLEANLITERAL)
                || tokenType.equals(SophiaTypes.BOOLEAN_LITERAL)
        ) {
            return KEY_KEYS;
        } else if (tokenType.equals(SophiaTypes.IDENTIFIER)) {
            return IDENTIFIER_KEYS;
        } else if (tokenType.equals(SophiaTypes.STRINGLITERAL)) {
            return STRING_KEYS;
        } else if (tokenType.equals(SophiaTypes.NUMBER_LITERAL)
                || tokenType.equals(SophiaTypes.DECIMALNUMBER)
                || tokenType.equals(SophiaTypes.FIXEDNUMBER)
        ) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(SophiaTypes.LPAREN) || tokenType.equals(SophiaTypes.RPAREN)) {
            return PARENTHESES_KEYS;
        } else if (tokenType.equals(SophiaTypes.HASH) || tokenType.equals(SophiaTypes.HEXLITERAL) || tokenType.equals(SophiaTypes.HEXNUMBER)) {
            return HASH_KEYS;
        } else if (tokenType.equals(SophiaTypes.LBRACKET) || tokenType.equals(SophiaTypes.RBRACKET)) {
            return BRACKETS_KEYS;
        } else if (tokenType.equals(SophiaTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}