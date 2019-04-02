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

public class SophiaFunctionDefinitionImpl extends ASTWrapperPsiElement implements SophiaFunctionDefinition {

  public SophiaFunctionDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SophiaVisitor visitor) {
    visitor.visitFunctionDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SophiaVisitor) accept((SophiaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SophiaBlock getBlock() {
    return findNotNullChildByClass(SophiaBlock.class);
  }

  @Override
  @NotNull
  public List<SophiaFunctionModifier> getFunctionModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaFunctionModifier.class);
  }

  @Override
  @NotNull
  public SophiaParameterList getParameterList() {
    return findNotNullChildByClass(SophiaParameterList.class);
  }

  @Override
  @Nullable
  public SophiaSophiaType getSophiaType() {
    return findChildByClass(SophiaSophiaType.class);
  }

}
