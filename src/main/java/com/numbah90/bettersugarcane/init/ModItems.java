package com.numbah90.bettersugarcane.init;

import com.numbah90.bettersugarcane.creativetab.TabBSC;
import com.numbah90.bettersugarcane.help.Reference;
import com.numbah90.bettersugarcane.help.ToolMaterials;
import com.numbah90.bettersugarcane.items.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems
{
    public static final Item sugarCaneRod = new ItemsugarCaneRod().setUnlocalizedName("sugarCaneRod").setCreativeTab(TabBSC.BSCTAB).setTextureName(Reference.MODID + ":sugarCaneRod");

    //Foods
    public static final Item sugarCookie = new ItemmodFood(1, 1.0F, false).setUnlocalizedName("sugarcookie").setCreativeTab(TabBSC.BSCTAB).setTextureName(Reference.MODID + ":sugarCookie");

    //Tools
    //Sword
    public static final Item scIronSword = new ItemscSword(ToolMaterials.scIron).setUnlocalizedName("scIronSword").setCreativeTab(TabBSC.BSCTAB).setTextureName(Reference.MODID + ":scIronSword");
    public static final Item scDiamondSword = new ItemscSword(ToolMaterials.scDiamond).setUnlocalizedName("scDiamondSword").setCreativeTab(TabBSC.BSCTAB).setTextureName(Reference.MODID + ":scDiamondSword");
    public static final Item scGoldSword = new ItemscSword(ToolMaterials.scGold).setUnlocalizedName("scGoldSword").setCreativeTab(TabBSC.BSCTAB).setTextureName(Reference.MODID + ":scGoldSword");

    //Pick
    public static final Item scIronPick = new ItemscPick(ToolMaterials.scIron).setUnlocalizedName("scIronPick").setCreativeTab(TabBSC.BSCTAB).setTextureName(Reference.MODID + ":scIronPick");
    public static final Item scDiamondPick = new ItemscPick(ToolMaterials.scDiamond).setUnlocalizedName("scDiamondPick").setCreativeTab(TabBSC.BSCTAB).setTextureName(Reference.MODID + ":scDiamondPick");
    public static final Item scGoldPick = new ItemscPick(ToolMaterials.scGold).setUnlocalizedName("scGoldPick").setCreativeTab(TabBSC.BSCTAB).setTextureName(Reference.MODID + ":scGoldPick");

    //Axe
    public static final Item scIronAxe = new ItemscAxe(ToolMaterials.scIron).setUnlocalizedName("scIronAxe").setCreativeTab(TabBSC.BSCTAB).setTextureName(Reference.MODID + ":scIronAxe");
    public static final Item scDiamondAxe = new ItemscAxe(ToolMaterials.scDiamond).setUnlocalizedName("scDiamondAxe").setCreativeTab(TabBSC.BSCTAB).setTextureName(Reference.MODID + ":scDiamondAxe");
    public static final Item scGoldAxe = new ItemscAxe(ToolMaterials.scGold).setUnlocalizedName("scGoldAxe").setCreativeTab(TabBSC.BSCTAB).setTextureName(Reference.MODID + ":scGoldAxe");

    //Shovel
    public static final Item scIronShovel = new ItemscShovel(ToolMaterials.scIron).setUnlocalizedName("scIronShovel").setCreativeTab(TabBSC.BSCTAB).setTextureName(Reference.MODID + ":scIronShovel");
    public static final Item scDiamondShovel = new ItemscShovel(ToolMaterials.scDiamond).setUnlocalizedName("scDiamondShovel").setCreativeTab(TabBSC.BSCTAB).setTextureName(Reference.MODID + ":scDiamondShovel");
    public static final Item scGoldShovel = new ItemscShovel(ToolMaterials.scGold).setUnlocalizedName("scGoldShovel").setCreativeTab(TabBSC.BSCTAB).setTextureName(Reference.MODID + ":scGoldShovel");

    public static void iteminit()
    {
        GameRegistry.registerItem(sugarCaneRod, "sugarCaneRod");

        GameRegistry.registerItem(scIronSword, "scIronSword");
        GameRegistry.registerItem(scDiamondSword, "scDiamondSword");
        GameRegistry.registerItem(scGoldSword, "scGoldSword");

        GameRegistry.registerItem(scIronPick, "scIronPick");
        GameRegistry.registerItem(scDiamondPick, "scDiamondPick");
        GameRegistry.registerItem(scGoldPick, "scGoldPick");

        GameRegistry.registerItem(scIronAxe, "scIronAxe");
        GameRegistry.registerItem(scDiamondAxe, "scDiamondAxe");
        GameRegistry.registerItem(scGoldAxe, "scGoldAxe");

        GameRegistry.registerItem(scIronShovel, "scIronShovel");
        GameRegistry.registerItem(scDiamondShovel, "scDiamondShovel");
        GameRegistry.registerItem(scGoldShovel, "scGoldShovel");

        GameRegistry.registerItem(sugarCookie, "sugarCookie");
    }
}
