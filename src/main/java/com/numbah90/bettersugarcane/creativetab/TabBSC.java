package com.numbah90.bettersugarcane.creativetab;

import com.numbah90.bettersugarcane.help.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TabBSC {
    public static final CreativeTabs BSCTAB = new CreativeTabs(Reference.MODID){

        @Override
        public Item getTabIconItem(){
            return Items.reeds;
        }

    };
}
