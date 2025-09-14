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
    public static final Item NETHERITE_APPLE = registerItem("netherite_apple",
            new Item(new Item.Settings()));
    public static final Item COPPER_APPLE = registerItem("copper_apple",
            new Item(new Item.Settings()));
    public static final Item ORANGE_APPLE = registerItem("orange_apple",
            new Item(new Item.Settings()));
    public static final Item LAPIS_APPLE = registerItem("lapis_apple",
            new Item(new Item.Settings()));
    public static final Item QUARTZ_APPLEE = registerItem("quartz_apple",
            new Item(new Item.Settings()));
    public static final Item GREEN_APPLE = registerItem("green_apple",
            new Item(new Item.Settings()));
    public static final Item PINK_APPLE = registerItem("pink_apple",
            new Item(new Item.Settings()));

    public static final Item NETHERITE_APPLE = registerItem("netherite_apple",
            new Item(new Item.Settings()));

    public static final Item NETHERITE_APPLE = registerItem("netherite_apple",
            new Item(new Item.Settings()));

    public static final Item NETHERITE_APPLE = registerItem("netherite_apple",
            new Item(new Item.Settings()));

    private static void addItemsToFoodandDrinkItemGroup(FabricItemGroupEntries entries) {
        entries.add(AMETHYST_APPLE);
        entries.add(NETHERITE_APPLE);
        entries.add(COPPER_APPLE);
        entries.add(ORANGE_APPLE);
        entries.add(LAPIS_APPLE);
        entries.add(QUARTZ_APPLEE);
        entries.add(GREEN_APPLE);
        entries.add(PINK_APPLE);
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
