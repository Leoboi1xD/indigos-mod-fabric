package net.indigo.indigosmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.indigo.indigosmod.datagen.*;

public class IndigosModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();

        pack.addProvider(IndigosModModelProvider::new);
        pack.addProvider(IndigosModRecipeProvider::new);
        pack.addProvider(IndigosModBlockTagsProvider::new);
        pack.addProvider(IndigosModItemTagsProvider::new);
        pack.addProvider(IndigosModEquipmentAssetProvider::new);
	}
}
