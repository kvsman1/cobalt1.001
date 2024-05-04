package net.cobalt.mod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cobalt implements ModInitializer {
	public static final  String MOD_ID = "cobalt";
    public static final Logger LOGGER = LoggerFactory.getLogger("cobalt");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}