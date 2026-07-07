package net.indigo.indigosmod.creativemodtab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.indigo.indigosmod.IndigosMod;
import net.indigo.indigosmod.item.IndigosModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class IndigosModCreativeModeTabs {
    public static final CreativeModeTab INDIGOS_MOD_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(IndigosMod.MOD_ID, "indigos_mod_tab"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(IndigosModItems.EMERALD_SWORD)).title(Component.translatable("creativemodetab.indigos_mod_tab")).displayItems((parameters, output) -> {output.accept(IndigosModItems.EMERALD_SWORD);}).build());

    public static void registerIndigosModCreativeModeTabs() {
        IndigosMod.LOGGER.info("Registering IndigosModCreativeModeTabs");
    }
}
