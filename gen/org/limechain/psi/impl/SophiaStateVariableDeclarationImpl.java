// This is a generated file. Not intended for manual editing.
package org.limechain.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.limechain.psi.SophiaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.limechain.psi.*;

public class SophiaStateVariableDeclarationImpl extends ASTWrapperPsiElement implements SophiaStateVariableDeclaration {

  public SophiaStateVariableDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SophiaVisitor visitor) {
    visitor.visitStateVariableDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SophiaVisitor) accept((SophiaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SophiaExpression getExpression() {
    return findChildByClass(SophiaExpression.class);
  }

  @Override
  @Nullable
  public SophiaSophiaType getSophiaType() {
    return findChildByClass(SophiaSophiaType.class);
  }

  @Override
  @NotNull
  public SophiaTypeName getTypeName() {
    return findNotNullChildByClass(SophiaTypeName.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
