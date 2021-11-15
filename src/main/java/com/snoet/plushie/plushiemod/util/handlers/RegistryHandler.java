package com.snoet.plushie.plushiemod.util.handlers;

import com.snoet.plushie.plushiemod.init.ItemInit;
import com.snoet.plushie.plushiemod.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

//
//
//
////import com.tutorialmod.turtywurty.init.BlockInit;
////import com.tutorialmod.turtywurty.init.EntityInit;
////import com.tutorialmod.turtywurty.init.ItemInit;
////import com.tutorialmod.turtywurty.recipes.CraftingRecipes;
//
//
//import com.snoet.plushie.plushiemod.init.ItemInit;
//import net.minecraft.block.Block;
//import net.minecraft.enchantment.Enchantment;
//import net.minecraft.item.Item;
//import net.minecraft.world.WorldType;
//import net.minecraftforge.client.event.ModelRegistryEvent;
//import net.minecraftforge.common.util.EnumHelper;
//import net.minecraftforge.event.RegistryEvent;
//import net.minecraftforge.fml.client.registry.ClientRegistry;
//import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
//import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
//import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
//import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//import net.minecraftforge.fml.common.network.NetworkRegistry;
//import net.minecraftforge.fml.common.registry.GameRegistry;
//import net.minecraftforge.fml.relauncher.Side;
//import net.minecraftforge.fml.relauncher.SideOnly;
//
@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){
        for(Item item : ItemInit.ITEMS){
            if (item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }
        }
    }

}
