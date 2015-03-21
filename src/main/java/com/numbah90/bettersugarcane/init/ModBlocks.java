package com.numbah90.bettersugarcane.init;

import com.numbah90.bettersugarcane.blocks.BlockcompressedSugarCaneBlock;
import com.numbah90.bettersugarcane.creativetab.TabBSC;
import com.numbah90.bettersugarcane.help.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks
{
    //Blocks
    public static final Block compressedSugarCaneBlock = new BlockcompressedSugarCaneBlock().setBlockName("compressedSugarCaneBlock").setCreativeTab(TabBSC.BSCTAB).setBlockTextureName(Reference.MODID + ":compressedSugarCaneBlock").setHardness(1.0F).setResistance(1.0F);

    public static void init()
    {
        GameRegistry.registerBlock(compressedSugarCaneBlock, "compressedSugarCaneBlock");
    }
}
