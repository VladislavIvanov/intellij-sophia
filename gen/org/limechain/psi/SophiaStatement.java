// This is a generated file. Not intended for manual editing.
package org.limechain.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SophiaStatement extends PsiElement {

  @Nullable
  SophiaBreakSt getBreakSt();

  @Nullable
  SophiaContinueSt getContinueSt();

  @Nullable
  SophiaDoWhileStatement getDoWhileStatement();

  @Nullable
  SophiaElseStatement getElseStatement();

  @Nullable
  SophiaEmitStatement getEmitStatement();

  @Nullable
  SophiaExpression getExpression();

  @Nullable
  SophiaForStatement getForStatement();

  @Nullable
  SophiaIfStatement getIfStatement();

  @Nullable
  SophiaMapIteration getMapIteration();

  @Nullable
  SophiaPlaceholderStatement getPlaceholderStatement();

  @Nullable
  SophiaSwitchStatement getSwitchStatement();

  @Nullable
  SophiaThrowSt getThrowSt();

  @Nullable
  SophiaTupleStatement getTupleStatement();

  @Nullable
  SophiaVariableDefinition getVariableDefinition();

  @Nullable
  SophiaWhileStatement getWhileStatement();

}
