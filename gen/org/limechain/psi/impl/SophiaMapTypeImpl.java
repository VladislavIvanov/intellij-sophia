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

public class SophiaMapTypeImpl extends ASTWrapperPsiElement implements SophiaMapType {

  public SophiaMapTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SophiaVisitor visitor) {
    visitor.visitMapType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SophiaVisitor) accept((SophiaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SophiaElementaryTypeName> getElementaryTypeNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaElementaryTypeName.class);
  }

  @Override
  @NotNull
  public List<SophiaSophiaType> getSophiaTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SophiaSophiaType.class);
  }

}
