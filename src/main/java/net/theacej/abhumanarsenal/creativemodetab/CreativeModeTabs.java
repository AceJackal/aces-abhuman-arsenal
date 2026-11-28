package net.theacej.abhumanarsenal.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.theacej.abhumanarsenal.AcesAbhumanArsenal;
import net.theacej.abhumanarsenal.Item.Moditems;

public class CreativeModeTabs {
    public static final CreativeModeTab FAUSTEEL_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(AcesAbhumanArsenal.MOD_ID,"fausteel_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(Moditems.fausteel_ingot))
                    .title(Component.translatable("creativeModeTab.acesabhumanarsenal.fausteel_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(Moditems.spawner_scrap);
                        output.accept(Moditems.fausteel_nugget);
                        output.accept(Moditems.fausteel_ingot);
                        output.accept(Moditems.fausteel_blade);

                    }).build());

    public static final CreativeModeTab FAUSTEEL_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                Identifier.fromNamespaceAndPath(AcesAbhumanArsenal.MOD_ID,"fausteel_blocks"),
                FabricCreativeModeTab.builder().icon(() -> new ItemStack(Moditems.spawner_scrap))
                        .title(Component.translatable("creativeModeTab.acesabhumanarsenal.fausteel_blocks"))
                        .displayItems((parameters, output) -> {
                            output.accept(Moditems.spawner_scrap);

                        }).build());

    public static void registerCreativeModeTabs() {
        AcesAbhumanArsenal.LOGGER.info("Registering Creative Mode Tabs for" + AcesAbhumanArsenal.MOD_ID);
    }
}
