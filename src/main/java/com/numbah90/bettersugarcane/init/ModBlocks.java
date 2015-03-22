package com.numbah90.bettersugarcane.init;

import com.numbah90.bettersugarcane.blocks.BlockcompressedSugar;
import com.numbah90.bettersugarcane.blocks.BlockcompressedSugarCaneBlock;
import com.numbah90.bettersugarcane.creativetab.TabBSC;
import com.numbah90.bettersugarcane.help.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks
{
    //Blocks
    public static final Block compressedSugarCaneBlock = new BlockcompressedSugarCaneBlock().setBlockName("compressedSugarCaneBlock").setCreativeTab(TabBSC.BSCTAB).setBlockTextureName(Reference.MODID + ":compressedSugarCaneBlock").setHardness(1.0F).setResistance(1.0F);
    public static final Block compressedSugarCaneBlock2 = new BlockcompressedSugarCaneBlock().setBlockName("compressedSugarCaneBlock2").setCreativeTab(TabBSC.BSCTAB).setBlockTextureName(Reference.MODID + ":compressedSugarCaneBlock2").setHardness(1.2F).setResistance(1.2F);
    public static final Block compressedSugarCaneBlock3 = new BlockcompressedSugarCaneBlock().setBlockName("compressedSugarCaneBlock3").setCreativeTab(TabBSC.BSCTAB).setBlockTextureName(Reference.MODID + ":compressedSugarCaneBlock3").setHardness(1.4F).setResistance(1.4F);
    public static final Block compressedSugarCaneBlock4 = new BlockcompressedSugarCaneBlock().setBlockName("compressedSugarCaneBlock4").setCreativeTab(TabBSC.BSCTAB).setBlockTextureName(Reference.MODID + ":compressedSugarCaneBlock4").setHardness(1.6F).setResistance(1.6F);
    public static final Block compressedSugarCaneBlock5 = new BlockcompressedSugarCaneBlock().setBlockName("compressedSugarCaneBlock5").setCreativeTab(TabBSC.BSCTAB).setBlockTextureName(Reference.MODID + ":compressedSugarCaneBlock5").setHardness(1.8F).setResistance(1.8F);
    public static final Block compressedSugarCaneBlock6 = new BlockcompressedSugarCaneBlock().setBlockName("compressedSugarCaneBlock6").setCreativeTab(TabBSC.BSCTAB).setBlockTextureName(Reference.MODID + ":compressedSugarCaneBlock6").setHardness(2.0F).setResistance(2.0F);
    public static final Block compressedSugarCaneBlock7 = new BlockcompressedSugarCaneBlock().setBlockName("compressedSugarCaneBlock7").setCreativeTab(TabBSC.BSCTAB).setBlockTextureName(Reference.MODID + ":compressedSugarCaneBlock7").setHardness(2.2F).setResistance(2.2F);
    public static final Block compressedSugarCaneBlock8 = new BlockcompressedSugarCaneBlock().setBlockName("compressedSugarCaneBlock8").setCreativeTab(TabBSC.BSCTAB).setBlockTextureName(Reference.MODID + ":compressedSugarCaneBlock8").setHardness(2.4F).setResistance(2.4F);

    public static final Block compressedSugar = new BlockcompressedSugar().setBlockName("compressedSugar").setCreativeTab(TabBSC.BSCTAB).setBlockTextureName(Reference.MODID + ":compressedSugar").setHardness(0.6F).setResistance(0.6F);
    public static final Block compressedSugar2 = new BlockcompressedSugar().setBlockName("compressedSugar2").setCreativeTab(TabBSC.BSCTAB).setBlockTextureName(Reference.MODID + ":compressedSugar2").setHardness(0.6F).setResistance(0.6F);

    public static void blockinit()
    {
        GameRegistry.registerBlock(compressedSugarCaneBlock, "compressedSugarCaneBlock");
        GameRegistry.registerBlock(compressedSugarCaneBlock2, "compressedSugarCaneBlock2");
        GameRegistry.registerBlock(compressedSugarCaneBlock3, "compressedSugarCaneBlock3");
        GameRegistry.registerBlock(compressedSugarCaneBlock4, "compressedSugarCaneBlock4");
        GameRegistry.registerBlock(compressedSugarCaneBlock5, "compressedSugarCaneBlock5");
        GameRegistry.registerBlock(compressedSugarCaneBlock6, "compressedSugarCaneBlock6");
        GameRegistry.registerBlock(compressedSugarCaneBlock7, "compressedSugarCaneBlock7");
        GameRegistry.registerBlock(compressedSugarCaneBlock8, "compressedSugarCaneBlock8");

        GameRegistry.registerBlock(compressedSugar, "compressedSugar");
        GameRegistry.registerBlock(compressedSugar2, "compressedSugar2");
    }
}
