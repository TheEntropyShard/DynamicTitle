package me.theentropyshard.dynamictitle;

import dev.crmodders.cosmicquilt.api.entrypoint.ModInitializer;
import org.quiltmc.loader.api.ModContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DynamicTitleMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("DynamicTitle");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("DynamicTitle initialized!");
	}
}

