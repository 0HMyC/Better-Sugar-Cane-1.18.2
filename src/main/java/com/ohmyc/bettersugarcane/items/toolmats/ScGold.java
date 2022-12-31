package com.ohmyc.bettersugarcane.items.toolmats;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ScGold implements ToolMaterial {

    public static final ScGold INSTANCE = new ScGold();
    @Override
    public Ingredient getRepairIngredient() {
        // good enough lol
        return Ingredient.ofItems(Items.GOLD_BLOCK);
    }
    @Override
    public int getDurability() {
        //TODO: is this correct?
        return 768;
    }
    // Should this be made faster because gold should be
    // close to/faster than diamond?
    @Override
    public float getMiningSpeedMultiplier() {
        return 16.0F;
    }
    @Override
    public float getAttackDamage() {
        return 2.0F;
    }
    @Override
    public int getMiningLevel() {
        return 3;
    }
    @Override
    public int getEnchantability() {
        return 28;
    }
}
