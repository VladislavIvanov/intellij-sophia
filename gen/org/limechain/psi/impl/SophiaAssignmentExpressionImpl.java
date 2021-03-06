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

public class SophiaAssignmentExpressionImpl extends SophiaExpressionImpl implements SophiaAssignmentExpression {

  public SophiaAssignmentExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SophiaVisitor visitor) {
    visitor.visitAssignmentExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SophiaVisitor) accept((SophiaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SophiaEmptyArray getEmptyArray() {
    return findChildByClass(SophiaEmptyArray.class);
  }

  @Override
  @Nullable
  public SophiaEmptyObject getEmptyObject() {
    return findChildByClass(SophiaEmptyObject.class);
  }

  @Override
  @NotNull
  public List<SophiaExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaExpression.class);
  }

  @Override
  @Nullable
  public SophiaExpressionInObject getExpressionInObject() {
    return findChildByClass(SophiaExpressionInObject.class);
  }

  @Override
  @Nullable
  public SophiaSophiaType getSophiaType() {
    return findChildByClass(SophiaSophiaType.class);
  }

}
