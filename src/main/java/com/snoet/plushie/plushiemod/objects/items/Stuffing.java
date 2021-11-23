package com.snoet.plushie.plushiemod.objects.items;

import com.snoet.plushie.plushiemod.Plushiemod;
import com.snoet.plushie.plushiemod.init.ItemInit;
import net.minecraft.item.Item;

public class Stuffing extends Item {

    public Stuffing()
    {
//        this.setRegistryName();
        this.setCreativeTab(Plushiemod.PLUSHIETAB);
        this.setMaxStackSize(64);
//        this.setTranslationKey();

        ItemInit.ITEMS.add(this);
    }

}