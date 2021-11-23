package com.snoet.plushie.plushiemod.util.handlers;

import com.snoet.plushie.plushiemod.Plushiemod;
import com.snoet.plushie.plushiemod.init.ItemInit;
import com.snoet.plushie.plushiemod.objects.items.Stuffing;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

//    @SubscribeEvent
//    public static void registerItems(ModelRegistryEvent event) {
//        ModItems.registerModels();
//    }


//    @SubscribeEvent
//    public void registerBlocks(RegistryEvent.Register<Item> event)
//    {
//        event.getRegistry().registerAll(Stuffing);
//    }

//    @SubscribeEvent
//    public static void onModelRegister(ModelRegistryEvent event){
//        for(Item item : ItemInit.ITEMS){
//            Plushiemod.proxy.registerItemRenderer(item, 0 ,"inventory");
//
//        }
//    }

}
