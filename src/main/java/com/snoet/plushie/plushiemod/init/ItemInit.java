package com.snoet.plushie.plushiemod.init;

import com.snoet.plushie.plushiemod.objects.items.Bow;
import com.snoet.plushie.plushiemod.objects.items.Stuffing;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();


//    public static final Item STUFFING = new ItemBase("stuffing");
    public static final Item STUFFING = new Stuffing("stuffing");
    public static final Item BOW = new Bow("bow");


}
