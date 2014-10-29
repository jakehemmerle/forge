package com.jakehemmerle.letsmod;

import com.jakehemmerle.letsmod.init.ModBlocks;
import net.minecraft.block.Block;

import com.jakehemmerle.letsmod.handler.ConfigurationHandler;
import com.jakehemmerle.letsmod.init.ModItems;
import com.jakehemmerle.letsmod.proxy.IProxy;
import com.jakehemmerle.letsmod.reference.Reference;
import com.jakehemmerle.letsmod.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
public class LetsMod {
	
	@Mod.Instance(Reference.MOD_ID)
	public static LetsMod instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre initialization Complete.");

}
	
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
		LogHelper.info("Initialization Complete.");
	}
	
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		LogHelper.info("Post initialization Complete.");
	}
	
	
}
