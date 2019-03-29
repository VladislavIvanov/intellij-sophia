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

public class SophiaNumberLiteralImpl extends ASTWrapperPsiElement implements SophiaNumberLiteral {

  public SophiaNumberLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SophiaVisitor visitor) {
    visitor.visitNumberLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SophiaVisitor) accept((SophiaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getDecimalNumber() {
    return findChildByType(DECIMALNUMBER);
  }

  @Override
  @Nullable
  public PsiElement getFixedNumber() {
    return findChildByType(FIXEDNUMBER);
  }

  @Override
  @Nullable
  public PsiElement getHexNumber() {
    return findChildByType(HEXNUMBER);
  }

  @Override
  @Nullable
  public PsiElement getScientificNumber() {
    return findChildByType(SCIENTIFICNUMBER);
  }

}
