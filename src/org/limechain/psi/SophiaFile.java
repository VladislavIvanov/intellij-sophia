package org.limechain.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.limechain.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class SophiaFile extends PsiFileBase {
    public SophiaFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SophiaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SophiaFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Sophia File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}