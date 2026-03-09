package com.rainsxy.collars.item;

import com.rainsxy.collars.Collars;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COLLARS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Collars.MOD_ID, "collars"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CLICKER))
                    .displayName(Text.translatable("itemgroup.collars.collars"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CLICKER);
                    })
                    .build());


    public static void registerItemGroups() {
        Collars.LOGGER.info("Registering Item Groups for " + Collars.MOD_ID);
    }
}
