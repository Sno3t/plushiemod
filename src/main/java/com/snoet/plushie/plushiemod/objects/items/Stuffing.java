package com.snoet.plushie.plushiemod.objects.items;

import com.snoet.plushie.plushiemod.Plushiemod;
import com.snoet.plushie.plushiemod.init.ItemInit;
import net.minecraft.item.Item;
import net.minecraftforge.common.property.Properties;

public class Stuffing extends Item {
//    public Stuffing(Properties properties) {
//        super(properties);
//    }

    public Stuffing(String name)//,  int amount)
    {
//        super(amount);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(Plushiemod.PLUSHIETAB);
        setMaxStackSize(64);
        ItemInit.ITEMS.add(this);


    }

}
