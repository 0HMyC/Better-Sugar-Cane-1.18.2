package com.numbah90.bettersugarcane;

import com.numbah90.bettersugarcane.help.Reference;
import com.numbah90.bettersugarcane.init.ModBlocks;
import com.numbah90.bettersugarcane.init.ModItems;
import com.numbah90.bettersugarcane.init.ModRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class BetterSugarCane
{
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.blockinit();
        ModItems.iteminit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModRecipes.recipeInit();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}