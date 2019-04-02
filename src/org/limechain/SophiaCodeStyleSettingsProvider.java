package org.limechain;

import com.intellij.application.options.*;
import com.intellij.openapi.options.Configurable;
import com.intellij.psi.codeStyle.*;
import org.jetbrains.annotations.*;

public class SophiaCodeStyleSettingsProvider extends CodeStyleSettingsProvider {
    @Override
    public CustomCodeStyleSettings createCustomSettings(CodeStyleSettings settings) {
        return new SophiaCodeStyleSettings(settings);
    }

    @Nullable
    @Override
    public String getConfigurableDisplayName() {
        return "Sophia Æternity";
    }


    @NotNull
    public CodeStyleConfigurable createConfigurable(@NotNull CodeStyleSettings settings, @NotNull CodeStyleSettings modelSettings) {
        return new CodeStyleAbstractConfigurable(settings, modelSettings, this.getConfigurableDisplayName()) {
            @Override
            protected CodeStyleAbstractPanel createPanel(CodeStyleSettings settings) {
                return new SimpleCodeStyleMainPanel(getCurrentSettings(), settings);
            }
        };
    }

    private static class SimpleCodeStyleMainPanel extends TabbedLanguageCodeStylePanel {
        public SimpleCodeStyleMainPanel(CodeStyleSettings currentSettings, CodeStyleSettings settings) {
            super(SophiaLanguage.INSTANCE, currentSettings, settings);
        }
    }
}
