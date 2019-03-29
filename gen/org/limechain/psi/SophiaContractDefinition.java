// This is a generated file. Not intended for manual editing.
package org.limechain.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SophiaContractDefinition extends PsiElement {

  @NotNull
  SophiaContractName getContractName();

  @NotNull
  List<SophiaEnumDefinition> getEnumDefinitionList();

  @NotNull
  List<SophiaEventDefinition> getEventDefinitionList();

  @NotNull
  List<SophiaFunctionDefinition> getFunctionDefinitionList();

  @NotNull
  List<SophiaInitFunctionDefinition> getInitFunctionDefinitionList();

  @NotNull
  List<SophiaRecordDefinition> getRecordDefinitionList();

  @NotNull
  List<SophiaStateVariableDeclaration> getStateVariableDeclarationList();

  @NotNull
  List<SophiaTypedAssignmentExpression> getTypedAssignmentExpressionList();

}
