package com.snoet.plushie.plushiemod.tabs;

import com.snoet.plushie.plushiemod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PlushieTab extends CreativeTabs {

    public PlushieTab(String label)
    {
        super("PlushieTab");

    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemInit.STUFFING);
    }


}
