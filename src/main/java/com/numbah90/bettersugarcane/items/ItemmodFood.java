package com.numbah90.bettersugarcane.items;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemmodFood extends ItemFood
{
    public ItemmodFood(int healAmount, float saturationModifier, boolean isWolfFood)
    {
        super(healAmount, saturationModifier, isWolfFood);
        setPotionEffect(Potion.moveSpeed.id, 15, 0, 1.0F);
    }
}
