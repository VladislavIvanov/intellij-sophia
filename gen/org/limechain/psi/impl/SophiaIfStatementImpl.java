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

public class SophiaIfStatementImpl extends ASTWrapperPsiElement implements SophiaIfStatement {

  public SophiaIfStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SophiaVisitor visitor) {
    visitor.visitIfStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SophiaVisitor) accept((SophiaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SophiaExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaExpression.class);
  }

  @Override
  @NotNull
  public List<SophiaStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaStatement.class);
  }

}
