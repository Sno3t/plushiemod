package com.snoet.plushie.plushiemod.proxy;

import com.google.common.util.concurrent.ListenableFuture;
//import com.tutorialmod.turtywurty.entity.magiball.EntityMagiball;
import com.snoet.plushie.plushiemod.init.ItemInit;

import com.snoet.plushie.plushiemod.objects.items.Bow;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id) );
    }

//    @SubscribeEvent
//    public void registerBlocks(RegistryEvent.Register<Block> event) {
//        event.getRegistry().registerAll(block);
//    }

//    @SubscribeEvent
//    public void registerBlocks(RegistryEvent.Register<Item> event) {
//        event.getRegistry().registerAll(new Bow("bow"));
//    }


//    public static void registerItem(Item item)
//    {
//        item.setCreativeTab(Dinocraft.ITEMS);
//        ForgeRegistries.ITEMS.register(item);
//        Utils.getLogger().info("Registered item: " + item.getUnlocalizedName().substring(5));
//    }



//    public void registerModel(){
//
//    }

//        @Override
//    public void registerItemRenderer(Item item, int meta, String id)
//    {
//        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
//    }
//
//    @SuppressWarnings("deprecation")
//    @Override
//    public void render()
//    {

//    }
//
//    @Override
//    public ListenableFuture<Object> addScheduledTaskClient(Runnable runnableToSchedule)
//    {
//        return Minecraft.getMinecraft().addScheduledTask(runnableToSchedule);
//    }
//
//    @Override
//    public EntityPlayer getClientPlayer()
//    {
//        return Minecraft.getMinecraft().player;
//    }
}