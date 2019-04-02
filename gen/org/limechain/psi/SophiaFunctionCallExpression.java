// This is a generated file. Not intended for manual editing.
package org.limechain.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SophiaFunctionCallExpression extends SophiaExpression {

  @NotNull
  List<SophiaExpression> getExpressionList();

  @Nullable
  SophiaFunctionCallArguments getFunctionCallArguments();

  @NotNull
  List<SophiaSophiaType> getSophiaTypeList();

  @NotNull
  List<SophiaStatement> getStatementList();

  @Nullable
  SophiaTypeName getTypeName();

}
