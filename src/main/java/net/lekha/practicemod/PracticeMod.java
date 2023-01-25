package net.lekha.practicemod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PracticeMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}
