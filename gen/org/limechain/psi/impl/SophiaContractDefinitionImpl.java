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

public class SophiaContractDefinitionImpl extends ASTWrapperPsiElement implements SophiaContractDefinition {

  public SophiaContractDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SophiaVisitor visitor) {
    visitor.visitContractDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SophiaVisitor) accept((SophiaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SophiaContractName getContractName() {
    return findNotNullChildByClass(SophiaContractName.class);
  }

  @Override
  @NotNull
  public List<SophiaEnumDefinition> getEnumDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaEnumDefinition.class);
  }

  @Override
  @NotNull
  public List<SophiaEventDefinition> getEventDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaEventDefinition.class);
  }

  @Override
  @NotNull
  public List<SophiaFunctionDefinition> getFunctionDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaFunctionDefinition.class);
  }

  @Override
  @NotNull
  public List<SophiaInitFunctionDefinition> getInitFunctionDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaInitFunctionDefinition.class);
  }

  @Override
  @NotNull
  public List<SophiaRecordDefinition> getRecordDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaRecordDefinition.class);
  }

  @Override
  @NotNull
  public List<SophiaStateVariableDeclaration> getStateVariableDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaStateVariableDeclaration.class);
  }

  @Override
  @NotNull
  public List<SophiaTypedAssignmentExpression> getTypedAssignmentExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaTypedAssignmentExpression.class);
  }

}
