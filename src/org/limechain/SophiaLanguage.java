package org.limechain;

import com.intellij.lang.Language;

public class SophiaLanguage extends Language {

    public static final SophiaLanguage INSTANCE = new SophiaLanguage();

    private SophiaLanguage() {
        super("Sophia");
    }
}