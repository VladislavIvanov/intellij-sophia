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

public class SophiaVariableDefinitionImpl extends ASTWrapperPsiElement implements SophiaVariableDefinition {

  public SophiaVariableDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SophiaVisitor visitor) {
    visitor.visitVariableDefinition(this);
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
  public SophiaStatement getStatement() {
    return findChildByClass(SophiaStatement.class);
  }

  @Override
  @NotNull
  public SophiaVariableDeclaration getVariableDeclaration() {
    return findNotNullChildByClass(SophiaVariableDeclaration.class);
  }

  @Override
  @Nullable
  public PsiElement getHash() {
    return findChildByType(HASH);
  }

}
