package com.jakehemmerle.letsmod.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.jakehemmerle.letsmod.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	
	public static Configuration configuration;
	public static boolean testBool = false;
	public static int testInt = 0;
	
	public static void init(File configFile){
		
		if (configuration == null) {
			
			// Creates the config object from "configFile".
			configuration = new Configuration(configFile);
			
			loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			
			// Resync config file
			loadConfiguration();
			
		}
	}
	
	private static void loadConfiguration() {
		
		testBool = configuration.getBoolean("valueBool", Configuration.CATEGORY_GENERAL, false, "This is a test configuration value.");
		testInt = configuration.getInt("valueInt", Configuration.CATEGORY_GENERAL, 1, 1, 5, "This is just for a test integer.");
	
		// If file is changed, save it.
		if (configuration.hasChanged()) {
			
			configuration.save();
		}
	}
}
