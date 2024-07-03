package net.sapy.firstmod;

import net.fabricmc.api.ModInitializer;

import net.sapy.firstmod.item.ModItemGroups;
import net.sapy.firstmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Frostytools implements ModInitializer {
	public static final String MOD_ID = "frostytools";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}