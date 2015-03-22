package com.numbah90.bettersugarcane.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes
{
    public static void recipeInit()
    {
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock), new ItemStack(Items.reeds, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock2), new ItemStack(ModBlocks.compressedSugarCaneBlock, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock3), new ItemStack(ModBlocks.compressedSugarCaneBlock2, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock4), new ItemStack(ModBlocks.compressedSugarCaneBlock3, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock5), new ItemStack(ModBlocks.compressedSugarCaneBlock4, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock6), new ItemStack(ModBlocks.compressedSugarCaneBlock5, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock7), new ItemStack(ModBlocks.compressedSugarCaneBlock6, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock8), new ItemStack(ModBlocks.compressedSugarCaneBlock7, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.reeds, 9), new ItemStack(ModBlocks.compressedSugarCaneBlock));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock, 9), new ItemStack(ModBlocks.compressedSugarCaneBlock2));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock2, 9), new ItemStack(ModBlocks.compressedSugarCaneBlock3));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock3, 9), new ItemStack(ModBlocks.compressedSugarCaneBlock4));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock4, 9), new ItemStack(ModBlocks.compressedSugarCaneBlock5));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock5, 9), new ItemStack(ModBlocks.compressedSugarCaneBlock6));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock6, 9), new ItemStack(ModBlocks.compressedSugarCaneBlock7));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugarCaneBlock7, 9), new ItemStack(ModBlocks.compressedSugarCaneBlock8));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugar), new ItemStack(Items.sugar, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugar2), new ItemStack(ModBlocks.compressedSugar, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.sugar, 9), new ItemStack(ModBlocks.compressedSugar));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSugar, 9), new ItemStack(ModBlocks.compressedSugar2));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.scIronSword), "I", "I", "R", 'I', new ItemStack(Blocks.iron_block), 'R', new ItemStack(ModItems.sugarCaneRod));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.scDiamondSword), "I", "I", "R", 'I', new ItemStack(Blocks.diamond_block), 'R', new ItemStack(ModItems.sugarCaneRod));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.scGoldSword), "I", "I", "R", 'I', new ItemStack(Blocks.gold_block), 'R', new ItemStack(ModItems.sugarCaneRod));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.scIronPick), "III", " R ", " R ", 'I', new ItemStack(Blocks.iron_block), 'R', new ItemStack(ModItems.sugarCaneRod));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.scDiamondPick), "III", " R ", " R ", 'I', new ItemStack(Blocks.diamond_block), 'R', new ItemStack(ModItems.sugarCaneRod));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.scGoldPick), "III", " R ", " R ", 'I', new ItemStack(Blocks.gold_block), 'R', new ItemStack(ModItems.sugarCaneRod));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.scIronAxe), "II", "IR", " R", 'I', new ItemStack(Blocks.iron_block), 'R', new ItemStack(ModItems.sugarCaneRod));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.scDiamondAxe), "II", "IR", " R", 'I', new ItemStack(Blocks.diamond_block), 'R', new ItemStack(ModItems.sugarCaneRod));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.scGoldAxe), "II", "IR", " R", 'I', new ItemStack(Blocks.gold_block), 'R', new ItemStack(ModItems.sugarCaneRod));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.scIronShovel), "I", "R", "R", 'I', new ItemStack(Blocks.iron_block), 'R', new ItemStack(ModItems.sugarCaneRod));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.scDiamondShovel), "I", "R", "R", 'I', new ItemStack(Blocks.diamond_block), 'R', new ItemStack(ModItems.sugarCaneRod));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.scGoldShovel), "I", "R", "R", 'I', new ItemStack(Blocks.gold_block), 'R', new ItemStack(ModItems.sugarCaneRod));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.sugarCaneRod), " SB", "SBS", "BS ", 'S', new ItemStack(Items.reeds), 'B', ModBlocks.compressedSugarCaneBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.sugarCookie, 4), "SWS", 'S', new ItemStack(Items.sugar), 'W', new ItemStack(Items.wheat));
    }
}
