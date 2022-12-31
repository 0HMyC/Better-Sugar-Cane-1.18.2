package com.ohmyc.bettersugarcane;

import com.ohmyc.bettersugarcane.init.InitBlocks;
import com.ohmyc.bettersugarcane.init.InitTools;
//import com.ohmyc.bettersugarcane.items.*;
//import com.ohmyc.bettersugarcane.items.toolmats.*;
//import com.ohmyc.bettersugarcane.items.ItemScPick;
//import com.ohmyc.bettersugarcane.items.ItemScShovel;
//import com.ohmyc.bettersugarcane.items.ItemScSword;
//import com.ohmyc.bettersugarcane.items.toolmats.ScDiamond;
//import com.ohmyc.bettersugarcane.items.toolmats.ScGold;
//import com.ohmyc.bettersugarcane.items.toolmats.ScIron;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
//import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
//import net.minecraft.block.*;
//import net.minecraft.block.Block;
//import net.minecraft.block.FallingBlock;
//import net.minecraft.block.Material;
//import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
//import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BetterSugarCane implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
//    public static final Logger LOGGER = LoggerFactory.getLogger("modid");
//    public static final Item TEST_ITEM = new Item(new FabricItemSettings());
//    public static final Item scRod = new Item(new FabricItemSettings());



//    public void initBlocks() {}
    public void initItems() {
        final Item scRod = new Item(new FabricItemSettings());
//        final Item scRod2 = new Item(new FabricItemSettings());
        final Item sgCookie = new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1.0F).build()));
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sugarcane_rod"), scRod);
//        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sugarcane_rod2"), scRod2);
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sugar_cookie"), sgCookie);
    }
//    public void initTools() {}
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
