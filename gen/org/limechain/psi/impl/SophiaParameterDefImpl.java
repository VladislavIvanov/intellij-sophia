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

public class SophiaParameterDefImpl extends ASTWrapperPsiElement implements SophiaParameterDef {

  public SophiaParameterDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SophiaVisitor visitor) {
    visitor.visitParameterDef(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SophiaVisitor) accept((SophiaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SophiaSophiaType> getSophiaTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaSophiaType.class);
  }

  @Override
  @NotNull
  public List<SophiaTypeName> getTypeNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaTypeName.class);
  }

}
