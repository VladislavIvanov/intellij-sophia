// This is a generated file. Not intended for manual editing.
package org.limechain.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SophiaFunctionDefinition extends PsiElement {

  @NotNull
  SophiaBlock getBlock();

  @NotNull
  List<SophiaFunctionModifier> getFunctionModifierList();

  @NotNull
  SophiaParameterList getParameterList();

  @Nullable
  SophiaSophiaType getSophiaType();

  @Nullable
  PsiElement getIdentifier();

}