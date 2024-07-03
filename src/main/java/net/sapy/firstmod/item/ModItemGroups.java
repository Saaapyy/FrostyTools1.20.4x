package net.sapy.firstmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sapy.firstmod.Frostytools;

public class ModItemGroups {
    public static final ItemGroup GLACIERITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Frostytools.MOD_ID,"glacierite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.glacierite"))
                    .icon(() -> new ItemStack(ModItems.SCYTHE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SCYTHE);



                    }).build());



    public static void registerItemGroups() {
        Frostytools.LOGGER.info("Register Item Groups for " + Frostytools.MOD_ID);

    }
}