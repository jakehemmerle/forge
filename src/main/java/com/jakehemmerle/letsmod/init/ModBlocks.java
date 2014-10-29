package com.jakehemmerle.letsmod.init;

import com.jakehemmerle.letsmod.block.BlockFlag;
import com.jakehemmerle.letsmod.reference.Names;
import com.jakehemmerle.letsmod.block.BlockLM;
import com.jakehemmerle.letsmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockLM flag = new BlockFlag();
    public static void init () {
        GameRegistry.registerBlock(flag, Names.Blocks.AMERICAN_FLAG);
    }
}
