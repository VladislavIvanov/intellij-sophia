// This is a generated file. Not intended for manual editing.
package org.limechain.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SophiaAssignmentExpression extends SophiaExpression {

  @Nullable
  SophiaEmptyArray getEmptyArray();

  @Nullable
  SophiaEmptyObject getEmptyObject();

  @NotNull
  List<SophiaExpression> getExpressionList();

  @Nullable
  SophiaExpressionInObject getExpressionInObject();

  @Nullable
  SophiaSophiaType getSophiaType();

}
