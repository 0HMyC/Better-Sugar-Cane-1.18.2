package com.ohmyc.bettersugarcane;

import com.ohmyc.bettersugarcane.init.InitBlocks;
import com.ohmyc.bettersugarcane.init.InitTools;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BetterSugarCane implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
//    public static final Logger LOGGER = LoggerFactory.getLogger("modid")
    public void initItems() {
        final Item scRod = new Item(new FabricItemSettings());
        final Item sgCookie = new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1.0F).build()));
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
