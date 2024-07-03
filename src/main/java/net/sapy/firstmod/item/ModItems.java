package net.sapy.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sapy.firstmod.Frostytools;

public class ModItems {
    public static final Item SCYTHE = registerItem("scythe", new Item(new FabricItemSettings().maxCount(1)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SCYTHE);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Frostytools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Frostytools.LOGGER.info("registering Mod Items for " + Frostytools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}