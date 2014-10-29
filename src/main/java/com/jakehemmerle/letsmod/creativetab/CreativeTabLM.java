package com.jakehemmerle.letsmod.creativetab;

import com.jakehemmerle.letsmod.init.ModItems;
import com.jakehemmerle.letsmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLM {
    public static final CreativeTabs LM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }

        @Override
        public String getTranslatedTabLabel() {
            return Reference.MOD_NAME;
        }
    };
}
