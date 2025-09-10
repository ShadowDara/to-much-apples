package de.shadowdara.to_much_apples_mod.item;

import de.shadowdara.to_much_apples_mod.main;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, main.MOD_ID);

    public static final RegistryObject<Item> AMETHYST_APPLE = ITEMS.register("amethyst_apple",
            () -> new Item(new Item.Properties().food(ModFoods.AMETHYST_APPLE)));
    public static final RegistryObject<Item> NETHERITE_APPLE = ITEMS.register("netherite_apple",
            () -> new Item(new Item.Properties().food(ModFoods.NETHERITE_APPLE)));
    public static final RegistryObject<Item> COPPER_APPLE = ITEMS.register("copper_apple",
            () -> new Item(new Item.Properties().food(ModFoods.COPPER_APPLE)));
    public static final RegistryObject<Item> ORANGE_APPLE = ITEMS.register("orange_apple",
            () -> new Item(new Item.Properties().food(ModFoods.ORANGE_APPLE)));
    public static final RegistryObject<Item> LAPIS_APPLE = ITEMS.register("lapis_apple",
            () -> new Item(new Item.Properties().food(ModFoods.LAPIS_APPLE)));
    public static final RegistryObject<Item> QUARTZ_APPLE = ITEMS.register("quartz_apple",
            () -> new Item(new Item.Properties().food(ModFoods.QUARTZ_APPLE)));
    public static final RegistryObject<Item> GREEN_APPLE = ITEMS.register("green_apple",
            () -> new Item(new Item.Properties().food(ModFoods.GREEN_APPLE)));
    public static final RegistryObject<Item> PINK_APPLE = ITEMS.register("pink_apple",
            () -> new Item(new Item.Properties().food(ModFoods.PINK_APPLE)));
    public static final RegistryObject<Item> DARK_PINK_APPLE = ITEMS.register("dark_pink_apple",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_PINK_APPLE)));
    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple",
            () -> new Item(new Item.Properties().food(ModFoods.DIAMOND_APPLE)));
    public static final RegistryObject<Item> IRON_APPLE = ITEMS.register("iron_apple",
            () -> new Item(new Item.Properties().food(ModFoods.IRON_APPLE)));
    public static final RegistryObject<Item> REDSTONE_APPLE = ITEMS.register("redstone_apple",
            () -> new Item(new Item.Properties().food(ModFoods.REDSTONE_APPLE)));
    public static final RegistryObject<Item> DARK_IRON_APPLE = ITEMS.register("dark_iron_apple",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_IRON_APPLE)));
    public static final RegistryObject<Item> DARK_DIAMOND_APPLE = ITEMS.register("dark_diamond_apple",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_DIAMOND_APPLE)));
    public static final RegistryObject<Item> DARK_NETHERITE_APPLE = ITEMS.register("dark_netherite_apple",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_NETHERITE_APPLE)));
    public static final RegistryObject<Item> BAD_APPLE = ITEMS.register("bad_apple",
            () -> new Item(new Item.Properties().food(ModFoods.BAD_APPLE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
