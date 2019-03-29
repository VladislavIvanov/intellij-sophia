package org.limechain;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class SophiaFileType extends LanguageFileType {

    public static final SophiaFileType INSTANCE = new SophiaFileType();

    private SophiaFileType() {
        super(SophiaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Sophia file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Sophia language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "aes";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SophiaIcons.ICON;
    }
}
