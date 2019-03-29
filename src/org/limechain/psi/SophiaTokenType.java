package org.limechain.psi;

import com.intellij.psi.tree.IElementType;
import org.limechain.SophiaLanguage;

public class SophiaTokenType extends IElementType {

    public SophiaTokenType(String debugName) {
        super(debugName, SophiaLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SophiaTokenType." + super.toString();
    }
}