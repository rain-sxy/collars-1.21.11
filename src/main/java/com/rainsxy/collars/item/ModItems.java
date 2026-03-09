package com.rainsxy.collars.item;

import com.rainsxy.collars.Collars;
import com.rainsxy.collars.item.custom.ClickerItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final RegistryKey<Item> CLICKER_KEY = RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(Collars.MOD_ID, "clicker"));
    public static final Item CLICKER = registerItem("clicker", new ClickerItem(new Item.Settings().registryKey(CLICKER_KEY)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Collars.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Collars.LOGGER.info("Registering Mod Items for " + Collars.MOD_ID);
    }
}
