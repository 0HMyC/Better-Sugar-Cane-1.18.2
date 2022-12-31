package com.ohmyc.bettersugarcane.init;

import com.ohmyc.bettersugarcane.items.*;
import com.ohmyc.bettersugarcane.items.toolmats.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InitTools {
    public static final ItemScAxe scIrAxe = new ItemScAxe(ScIron.INSTANCE, 6.0F, -2.6F, new Item.Settings());
    public static final ItemScAxe scGlAxe = new ItemScAxe(ScGold.INSTANCE, 6.0F, -2.5F, new Item.Settings());
    public static final ItemScAxe scDiAxe = new ItemScAxe(ScDiamond.INSTANCE, 5.0F, -2.5F, new Item.Settings());
    public static final ItemScSword scIrSword = new ItemScSword(ScIron.INSTANCE, 3, -2.0F, new Item.Settings());
    public static final ItemScSword scGlSword = new ItemScSword(ScGold.INSTANCE, 3, -2.0F, new Item.Settings());
    public static final ItemScSword scDiSword = new ItemScSword(ScDiamond.INSTANCE, 3, -2.0F, new Item.Settings());
    public static final ItemScPick scIrPick = new ItemScPick(ScIron.INSTANCE, 1, -2.4F, new Item.Settings());
    public static final ItemScPick scGlPick = new ItemScPick(ScGold.INSTANCE, 1, -2.4F, new Item.Settings());
    public static final ItemScPick scDiPick = new ItemScPick(ScDiamond.INSTANCE, 1, -2.4F, new Item.Settings());
    public static final ItemScShovel scIrShovel = new ItemScShovel(ScIron.INSTANCE, 1.5F, -2.6F, new Item.Settings());
    public static final ItemScShovel scGlShovel = new ItemScShovel(ScGold.INSTANCE, 1.5F, -2.6F, new Item.Settings());
    public static final ItemScShovel scDiShovel = new ItemScShovel(ScDiamond.INSTANCE, 1.5F, -2.6F, new Item.Settings());
    public static void initialize() {
        scIrAxe.addTipKey("sc-ironaxe.tooltip");
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sc-ironaxe"), scIrAxe);
        scGlAxe.addTipKey("sc-goldaxe.tooltip");
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sc-goldaxe"), scGlAxe);
        scDiAxe.addTipKey("sc-diamondaxe.tooltip");
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sc-diamondaxe"), scDiAxe);
        scIrSword.addTipKey("sc-ironsword.tooltip");
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sc-ironsword"), scIrSword);
        scGlSword.addTipKey("sc-goldsword.tooltip");
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sc-goldsword"), scGlSword);
        scDiSword.addTipKey("sc-diamondaxe.tooltip");
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sc-diamondsword"), scDiSword);
        scIrPick.addTipKey("sc-ironpick.tooltip");
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sc-ironpick"), scIrPick);
        scGlPick.addTipKey("sc-goldpick.tooltip");
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sc-goldpick"), scGlPick);
        scDiPick.addTipKey("sc-diamondpick.tooltip");
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sc-diamondpick"), scDiPick);
        scIrShovel.addTipKey("sc-ironshovel.tooltip");
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sc-ironshovel"), scIrShovel);
        scGlShovel.addTipKey("sc-goldshovel.tooltip");
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sc-goldshovel"), scGlShovel);
        scDiShovel.addTipKey("sc-diamondshovel.tooltip");
        Registry.register(Registry.ITEM, new Identifier("bettersugarcane", "sc-diamondshovel"), scDiShovel);
    }
}
