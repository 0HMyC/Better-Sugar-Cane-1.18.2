package com.ohmyc.bettersugarcane.items.toolmats;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ScDiamond implements ToolMaterial {

    public static final ScDiamond INSTANCE = new ScDiamond();
    @Override
    public Ingredient getRepairIngredient() {
        // good enough lol
        return Ingredient.ofItems(Items.DIAMOND_BLOCK);
    }
    @Override
    public int getDurability() {
        //TODO: is this correct?
        return 14549;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 25.0F;
    }
    @Override
    public float getAttackDamage() {
        return 8.0F;
    }
    @Override
    public int getMiningLevel() {
        return 3;
    }
    @Override
    public int getEnchantability() {
        return 10;
    }
}
