// This is a generated file. Not intended for manual editing.
package org.limechain.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.limechain.psi.SophiaTypes.*;
import org.limechain.psi.*;

public class SophiaPrimaryExpressionImpl extends SophiaExpressionImpl implements SophiaPrimaryExpression {

  public SophiaPrimaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SophiaVisitor visitor) {
    visitor.visitPrimaryExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SophiaVisitor) accept((SophiaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SophiaBooleanLiteral getBooleanLiteral() {
    return findChildByClass(SophiaBooleanLiteral.class);
  }

  @Override
  @Nullable
  public SophiaElementaryTypeName getElementaryTypeName() {
    return findChildByClass(SophiaElementaryTypeName.class);
  }

  @Override
  @Nullable
  public SophiaNumberLiteral getNumberLiteral() {
    return findChildByClass(SophiaNumberLiteral.class);
  }

  @Override
  @Nullable
  public SophiaVarLiteral getVarLiteral() {
    return findChildByClass(SophiaVarLiteral.class);
  }

  @Override
  @Nullable
  public PsiElement getHexLiteral() {
    return findChildByType(HEXLITERAL);
  }

  @Override
  @Nullable
  public PsiElement getStringLiteral() {
    return findChildByType(STRINGLITERAL);
  }

}
