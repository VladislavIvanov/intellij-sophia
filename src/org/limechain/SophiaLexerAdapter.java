package org.limechain;

import com.intellij.lexer.FlexAdapter;
import org.limechain.grammar._SophiaLexer;

import java.io.Reader;

public class SophiaLexerAdapter extends FlexAdapter {
    public SophiaLexerAdapter() {
        super(new _SophiaLexer((Reader) null));
    }
}
