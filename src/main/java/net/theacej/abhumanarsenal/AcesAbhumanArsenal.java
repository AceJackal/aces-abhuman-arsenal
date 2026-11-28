package net.theacej.abhumanarsenal;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;
import net.theacej.abhumanarsenal.Item.Moditems;
import net.theacej.abhumanarsenal.creativemodetab.CreativeModeTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AcesAbhumanArsenal implements ModInitializer {
	public static final String MOD_ID = "aces-abhuman-arsenal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CreativeModeTabs.registerCreativeModeTabs();
		Moditems.registerModItems();
	}

}
