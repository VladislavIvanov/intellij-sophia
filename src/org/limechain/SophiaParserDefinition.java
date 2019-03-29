package org.limechain;

import com.intellij.lang.*;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.tree.*;
import org.limechain.parser.SophiaParser;
import org.limechain.psi.*;
import org.jetbrains.annotations.NotNull;

public class SophiaParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(SophiaTypes.COMMENT);
    public static final TokenSet CONTRACT = TokenSet.create(SophiaTypes.CONTRACT);
    public static final TokenSet IDENTIFIER = TokenSet.create(SophiaTypes.IDENTIFIER);

    public static final IFileElementType FILE = new IFileElementType(SophiaLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new SophiaLexerAdapter();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getContractTokens() {
        return CONTRACT;
    }

    @NotNull
    public TokenSet getIdentifierTokens() {
        return IDENTIFIER;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new SophiaParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new SophiaFile(viewProvider);
    }

    public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return SophiaTypes.Factory.createElement(node);
    }
}
