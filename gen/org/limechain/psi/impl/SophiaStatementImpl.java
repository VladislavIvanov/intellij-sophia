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

public class SophiaStatementImpl extends ASTWrapperPsiElement implements SophiaStatement {

  public SophiaStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SophiaVisitor visitor) {
    visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SophiaVisitor) accept((SophiaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SophiaBreakSt getBreakSt() {
    return findChildByClass(SophiaBreakSt.class);
  }

  @Override
  @Nullable
  public SophiaContinueSt getContinueSt() {
    return findChildByClass(SophiaContinueSt.class);
  }

  @Override
  @Nullable
  public SophiaDoWhileStatement getDoWhileStatement() {
    return findChildByClass(SophiaDoWhileStatement.class);
  }

  @Override
  @Nullable
  public SophiaElseStatement getElseStatement() {
    return findChildByClass(SophiaElseStatement.class);
  }

  @Override
  @Nullable
  public SophiaEmitStatement getEmitStatement() {
    return findChildByClass(SophiaEmitStatement.class);
  }

  @Override
  @Nullable
  public SophiaExpression getExpression() {
    return findChildByClass(SophiaExpression.class);
  }

  @Override
  @Nullable
  public SophiaForStatement getForStatement() {
    return findChildByClass(SophiaForStatement.class);
  }

  @Override
  @Nullable
  public SophiaIfStatement getIfStatement() {
    return findChildByClass(SophiaIfStatement.class);
  }

  @Override
  @Nullable
  public SophiaMapIteration getMapIteration() {
    return findChildByClass(SophiaMapIteration.class);
  }

  @Override
  @Nullable
  public SophiaPlaceholderStatement getPlaceholderStatement() {
    return findChildByClass(SophiaPlaceholderStatement.class);
  }

  @Override
  @Nullable
  public SophiaSwitchStatement getSwitchStatement() {
    return findChildByClass(SophiaSwitchStatement.class);
  }

  @Override
  @Nullable
  public SophiaThrowSt getThrowSt() {
    return findChildByClass(SophiaThrowSt.class);
  }

  @Override
  @Nullable
  public SophiaTupleStatement getTupleStatement() {
    return findChildByClass(SophiaTupleStatement.class);
  }

  @Override
  @Nullable
  public SophiaVariableDefinition getVariableDefinition() {
    return findChildByClass(SophiaVariableDefinition.class);
  }

  @Override
  @Nullable
  public SophiaWhileStatement getWhileStatement() {
    return findChildByClass(SophiaWhileStatement.class);
  }

}
