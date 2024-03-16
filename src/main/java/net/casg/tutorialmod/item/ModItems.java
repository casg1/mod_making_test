package net.casg.tutorialmod.item;

import net.casg.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);
    public static  final RegistryObject<Item> dismantle = ITEMS.register("dismantle",
            () -> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> HELLFIRE = ITEMS.register("hellfire",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
