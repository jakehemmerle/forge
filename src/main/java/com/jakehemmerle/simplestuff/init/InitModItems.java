package com.jakehemmerle.simplestuff.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.jakehemmerle.letsmod.block.BlockLM;
import com.jakehemmerle.simplestuff.item.ItemTray;

import cpw.mods.fml.common.registry.GameRegistry;

public class InitModItems {
	public static final Item tray = new ItemTray();
	
	public static void init() {
		GameRegistry.registerItem(tray, "tray");
	}

}
