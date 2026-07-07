package net.indigo.indigosmod;

import net.fabricmc.api.ModInitializer;

import net.indigo.indigosmod.creativemodtab.IndigosModCreativeModeTabs;
import net.indigo.indigosmod.item.IndigosModItems;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndigosMod implements ModInitializer {
	public static final String MOD_ID = "indigos-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        IndigosModItems.registerIndigosModItems();
        IndigosModCreativeModeTabs.registerIndigosModCreativeModeTabs();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
