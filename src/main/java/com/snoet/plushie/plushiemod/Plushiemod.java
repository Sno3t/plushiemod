package com.snoet.plushie.plushiemod;

import com.snoet.plushie.plushiemod.proxy.CommonProxy;
import com.snoet.plushie.plushiemod.tabs.PlushieTab;
import com.snoet.plushie.plushiemod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = Plushiemod.MOD_ID,
        name = Plushiemod.MOD_NAME,
        version = Plushiemod.VERSION
)
public class Plushiemod {

    public static final String MOD_ID = "plushiemod";
    public static final String MOD_NAME = "Plushiemod";
    public static final String VERSION = "0.0.1";

    public static final CreativeTabs PLUSHIETAB = new PlushieTab("PlushieTab");




    @Mod.Instance(MOD_ID)
    public static Plushiemod INSTANCE;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {}

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {}

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {}

//    @Mod.EventHandler
//    public void init(FMLInitializationEvent event) {
////        RegistryHandler.initRegistries();
//    }

//    @Mod.EventHandler
//    public void postinit(FMLPostInitializationEvent event) {
//
//    }

//    @GameRegistry.ObjectHolder(MOD_ID)
//    public static class Blocks {
//      /*
//          public static final MySpecialBlock mySpecialBlock = null; // placeholder for special block below
//      */
//    }

//    @GameRegistry.ObjectHolder(MOD_ID)
//    public static class Items {
//      /*
//          public static final ItemBlock mySpecialBlock = null; // itemblock for the block above
//          public static final MySpecialItem mySpecialItem = null; // placeholder for special item below
//      */
//    }

//    @Mod.EventBusSubscriber
//    public static class ObjectRegistryHandler {
//        /**
//         * Listen for the register event for creating custom items
//         */
//        @SubscribeEvent
//        public static void addItems(RegistryEvent.Register<Item> event) {
//           /*
//             event.getRegistry().register(new ItemBlock(Blocks.myBlock).setRegistryName(MOD_ID, "myBlock"));
//             event.getRegistry().register(new MySpecialItem().setRegistryName(MOD_ID, "mySpecialItem"));
//            */
////            event.getRegistry().register(new ItemInit().setRegistryName(MOD_ID, "Stuffing"));
//        }
//
//        /**
//         * Listen for the register event for creating custom blocks
//         */
//        @SubscribeEvent
//        public static void addBlocks(RegistryEvent.Register<Block> event) {
//           /*
//             event.getRegistry().register(new MySpecialBlock().setRegistryName(MOD_ID, "mySpecialBlock"));
//            */
//        }
//    }
//    /* EXAMPLE ITEM AND BLOCK - you probably want these in separate files
//    public static class MySpecialItem extends Item {
//
//    }
//
//    public static class MySpecialBlock extends Block {
//
//    }
//    */
}
