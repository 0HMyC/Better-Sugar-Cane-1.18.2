package com.ohmyc.bettersugarcane.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InitBlocks {
    public static final Block cmSgCane = new Block(FabricBlockSettings.of(Material.WOOD).strength(1.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block cmSgCane2 = new Block(FabricBlockSettings.of(Material.WOOD).strength(1.2F).sounds(BlockSoundGroup.WOOD));
    public static final Block cmSgCane3 = new Block(FabricBlockSettings.of(Material.WOOD).strength(1.4F).sounds(BlockSoundGroup.WOOD));
    public static final Block cmSgCane4 = new Block(FabricBlockSettings.of(Material.WOOD).strength(1.6F).sounds(BlockSoundGroup.WOOD));
    public static final Block cmSgCane5 = new Block(FabricBlockSettings.of(Material.WOOD).strength(1.8F).sounds(BlockSoundGroup.WOOD));
    public static final Block cmSgCane6 = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block cmSgCane7 = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.2F).sounds(BlockSoundGroup.WOOD));
    public static final Block cmSgCane8 = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.4F).sounds(BlockSoundGroup.WOOD));
    public static final Block cmSugar = new FallingBlock(FabricBlockSettings.of(Material.SOIL).strength(0.6F).sounds(BlockSoundGroup.SAND));
    public static final Block cmSugar2 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).strength(0.6F).sounds(BlockSoundGroup.SAND));
    public static void initialize() {
        Registry.register(Registry.BLOCK, new Identifier("bettersugarcane", "compressed_sugarcane"), cmSgCane);
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "compressed_sugarcane"), new BlockItem(cmSgCane, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("bettersugarcane", "compressed_sugarcane2"), cmSgCane2);
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "compressed_sugarcane2"), new BlockItem(cmSgCane2, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("bettersugarcane", "compressed_sugarcane3"), cmSgCane3);
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "compressed_sugarcane3"), new BlockItem(cmSgCane3, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("bettersugarcane", "compressed_sugarcane4"), cmSgCane4);
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "compressed_sugarcane4"), new BlockItem(cmSgCane4, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("bettersugarcane", "compressed_sugarcane5"), cmSgCane5);
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "compressed_sugarcane5"), new BlockItem(cmSgCane5, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("bettersugarcane", "compressed_sugarcane6"), cmSgCane6);
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "compressed_sugarcane6"), new BlockItem(cmSgCane6, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("bettersugarcane", "compressed_sugarcane7"), cmSgCane7);
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "compressed_sugarcane7"), new BlockItem(cmSgCane7, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("bettersugarcane", "compressed_sugarcane8"), cmSgCane8);
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "compressed_sugarcane8"), new BlockItem(cmSgCane8, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("bettersugarcane", "compressed_sugar"), cmSugar);
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "compressed_sugar"), new BlockItem(cmSugar, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("bettersugarcane", "compressed_sugar2"), cmSugar2);
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "compressed_sugar2"), new BlockItem(cmSugar2, new FabricItemSettings()));
    }
}
