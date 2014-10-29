package com.jakehemmerle.simplestuff;

import com.jakehemmerle.simplestuff.reference.Reference;
import com.jakehemmerle.simplestuff.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class SimpleStuff {
	
	@Mod.Instance(Reference.MOD_ID)
	public static SimpleStuff instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public static void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
