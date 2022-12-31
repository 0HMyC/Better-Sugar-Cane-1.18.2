package com.ohmyc.bettersugarcane.items.toolmats;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ScIron implements ToolMaterial {

    public static final ScIron INSTANCE = new ScIron();
    @Override
    public Ingredient getRepairIngredient() {
        // good enough lol
        return Ingredient.ofItems(Items.IRON_BLOCK);
    }
    @Override
    public int getDurability() {
        //TODO: is this correct?
        return 2750;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0F;
    }
    @Override
    public float getAttackDamage() {
        return 5.0F;
    }
    @Override
    public int getMiningLevel() {
        return 3;
    }
    @Override
    public int getEnchantability() {
        return 12;
    }
}
