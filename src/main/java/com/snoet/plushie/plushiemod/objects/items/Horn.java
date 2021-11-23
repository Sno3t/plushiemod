package com.snoet.plushie.plushiemod.objects.items;

import com.snoet.plushie.plushiemod.Plushiemod;
import com.snoet.plushie.plushiemod.init.ItemInit;
import net.minecraft.item.Item;
import net.minecraftforge.common.property.Properties;

public class Horn extends Item {
    //    public Horn(Properties properties) {
    public Horn(String name) {
        this.setRegistryName(name);
        this.setCreativeTab(Plushiemod.PLUSHIETAB);
        this.setMaxStackSize(64);
        this.setTranslationKey(name);

        ItemInit.ITEMS.add(this);
    }
}
//}
