package com.ohmyc.bettersugarcane;

import com.ohmyc.bettersugarcane.init.InitBlocks;
import com.ohmyc.bettersugarcane.init.InitTools;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public class BetterSugarCane implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
//    public static final Logger LOGGER = LoggerFactory.getLogger("modid");
    public static final ItemGroup BSC_GROUP = FabricItemGroupBuilder.build(new Identifier("bettersugarcane", "creative"),
            () -> new ItemStack(Items.SUGAR_CANE));
    public void initItems() {
        final Item scRod = new Item(new FabricItemSettings().group(BSC_GROUP));
        final Item sgCookie = new Item(new FabricItemSettings().group(BSC_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1.0F).build()));
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sugarcane_rod"), scRod);
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sugar_cookie"), sgCookie);
    }
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
//        LOGGER.info("BetterSugarCane running!");
        // Blocks
        InitBlocks.initialize();
//        initBlocks();
        // Items
        initItems();
        InitTools.initialize();
//        initTools();
    }
}
