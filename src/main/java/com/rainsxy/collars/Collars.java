package com.rainsxy.collars;

import com.rainsxy.collars.item.ModItemGroups;
import com.rainsxy.collars.item.ModItems;
import com.rainsxy.collars.sounds.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Collars implements ModInitializer {
	public static final String MOD_ID = "collars";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModSounds.registerModSounds();
	}
}