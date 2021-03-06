// This is a generated file. Not intended for manual editing.
package org.limechain.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SophiaInitFunctionDefinition extends PsiElement {

  @NotNull
  List<SophiaExpression> getExpressionList();

  @Nullable
  SophiaFunctionModifier getFunctionModifier();

  @Nullable
  SophiaObjectVariableDeclaration getObjectVariableDeclaration();

  @NotNull
  SophiaParameterList getParameterList();

  @Nullable
  SophiaVariableDeclaration getVariableDeclaration();

}
