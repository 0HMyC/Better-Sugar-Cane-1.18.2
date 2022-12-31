package com.ohmyc.bettersugarcane.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class ItemScSword extends SwordItem {
    public String toolTipKey = "item.bettersugarcane.";
    public void addTipKey(String itemID) {
        toolTipKey += itemID;
    }
    public ItemScSword(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext ttc) {
//        tooltip.add(new TranslatableText("item.bettersugarcane.sc-ironaxe.tooltip"));
        tooltip.add(new TranslatableText(toolTipKey));
    }
}
