package net.kirby.zombiemod.item;

import net.kirby.zombiemod.ZombieMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ZombieMod.MOD_ID);

    public static final DeferredItem<Item> HEXCROME = ITEMS.register("hexcrome",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
