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

public class SophiaVariableDeclarationImpl extends ASTWrapperPsiElement implements SophiaVariableDeclaration {

  public SophiaVariableDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SophiaVisitor visitor) {
    visitor.visitVariableDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SophiaVisitor) accept((SophiaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SophiaDeclarationList getDeclarationList() {
    return findChildByClass(SophiaDeclarationList.class);
  }

  @Override
  @Nullable
  public SophiaPropertyAccessExpression getPropertyAccessExpression() {
    return findChildByClass(SophiaPropertyAccessExpression.class);
  }

  @Override
  @Nullable
  public SophiaTypeName getTypeName() {
    return findChildByClass(SophiaTypeName.class);
  }

  @Override
  @Nullable
  public SophiaTypedDeclarationList getTypedDeclarationList() {
    return findChildByClass(SophiaTypedDeclarationList.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
