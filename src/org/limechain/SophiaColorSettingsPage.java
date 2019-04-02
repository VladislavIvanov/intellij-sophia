package org.limechain;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.*;
import org.jetbrains.annotations.*;

import javax.swing.*;
import java.util.Map;

public class SophiaColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", SophiaSyntaxHighlighter.KEY),
            new AttributesDescriptor("Identifier", SophiaSyntaxHighlighter.IDENTIFIER),
            new AttributesDescriptor("Comment", SophiaSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Number", SophiaSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("String", SophiaSyntaxHighlighter.STRING),
            new AttributesDescriptor("Hash", SophiaSyntaxHighlighter.HASH),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return SophiaIcons.ICON;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new SophiaSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "contract FundMe =\n" +
                "\n" +
                "  record spend_args = { recipient : address,\n" +
                "                        amount    : int }\n" +
                "\n" +
                "  record state = { contributions : map(address, int),\n" +
                "                   total         : int,\n" +
                "                   beneficiary   : address,\n" +
                "                   deadline      : int,\n" +
                "                   goal          : int }\n" +
                "\n" +
                "  private function require(b : bool, err : string) =\n" +
                "    if(!b) abort(err)\n" +
                "\n" +
                "  private function spend(args : spend_args) =\n" +
                "    raw_spend(args.recipient, args.amount)\n" +
                "\n" +
                "  public function init(beneficiary, deadline, goal) : state =\n" +
                "    { contributions = {},\n" +
                "      beneficiary   = beneficiary,\n" +
                "      deadline      = deadline,\n" +
                "      total         = 0,\n" +
                "      goal          = goal }\n" +
                "\n" +
                "  private function is_contributor(addr) =\n" +
                "    Map.member(addr, state.contributions)\n" +
                "\n" +
                "  public stateful function contribute() =\n" +
                "    if(Chain.block_height >= state.deadline)\n" +
                "      spend({ recipient = Call.caller, amount = Call.value }) // Refund money\n" +
                "      false\n" +
                "    else\n" +
                "      let amount =\n" +
                "        switch(Map.lookup(Call.caller, state.contributions))\n" +
                "          None    => Call.value\n" +
                "          Some(n) => n + Call.value\n" +
                "      put(state{ contributions[Call.caller] = amount,\n" +
                "                 total @ tot = tot + Call.value })\n" +
                "      true\n" +
                "\n" +
                "  public stateful function withdraw() =\n" +
                "    if(Chain.block_height < state.deadline)\n" +
                "      abort(\"Cannot withdraw before deadline\")\n" +
                "    if(Call.caller == state.beneficiary)\n" +
                "      withdraw_beneficiary()\n" +
                "    elif(is_contributor(Call.caller))\n" +
                "      withdraw_contributor()\n" +
                "    else\n" +
                "      abort(\"Not a contributor or beneficiary\")\n" +
                "\n" +
                "  private stateful function withdraw_beneficiary() =\n" +
                "    require(state.total >= state.goal, \"Project was not funded\")\n" +
                "    spend({recipient = state.beneficiary,\n" +
                "           amount    = Contract.balance })\n" +
                "    put(state{ beneficiary = #0 })\n" +
                "\n" +
                "  private stateful function withdraw_contributor() =\n" +
                "    if(state.total >= state.goal)\n" +
                "      abort(\"Project was funded\")\n" +
                "    let to = Call.caller\n" +
                "    spend({recipient = to,\n" +
                "           amount    = state.contributions[to]})\n" +
                "    put(state{ contributions @ c = Map.delete(to, c) })";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Sophia Æternity";
    }
}