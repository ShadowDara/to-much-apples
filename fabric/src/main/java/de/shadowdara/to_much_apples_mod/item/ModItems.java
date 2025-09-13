package de.shadowdara.to_much_apples_mod.item;

import de.shadowdara.to_much_apples_mod.To_much_apples_mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item AMETHYST_APPLE = registerItem("amethyst_apple",
            new Item(new Item.Settings()));

    private static void addItemsToFoodandDrinkItemGroup(FabricItemGroupEntries entries) {
        entries.add(AMETHYST_APPLE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,
                new Identifier(To_much_apples_mod.MOD_ID, name), item
        );
    }

    public static void registerModItems() {
        To_much_apples_mod.LOGGER.info("Registering Mod Items for " + To_much_apples_mod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodandDrinkItemGroup);
    }
}
