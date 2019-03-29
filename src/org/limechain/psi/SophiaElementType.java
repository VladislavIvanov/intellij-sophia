package org.limechain.psi;

import com.intellij.psi.tree.IElementType;
import org.limechain.SophiaLanguage;

public class SophiaElementType extends IElementType {

    public SophiaElementType(String debugName) {
        super(debugName, SophiaLanguage.INSTANCE);
    }
}