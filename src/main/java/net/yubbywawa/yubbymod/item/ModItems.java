package net.yubbywawa.yubbymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yubbywawa.yubbymod.YubbyMod;

public class ModItems {

    public static final Item YUBBITE = registerItem("yubbite", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(YubbyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        YubbyMod.LOGGER.info("Registering Mod Items for " + YubbyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(YUBBITE);
        });
    }
}