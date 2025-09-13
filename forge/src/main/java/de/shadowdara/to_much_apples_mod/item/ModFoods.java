package de.shadowdara.to_much_apples_mod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties GREEN_APPLE = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.2f).build();
    public static final FoodProperties AMETHYST_APPLE = new FoodProperties.Builder().nutrition(9)
            .saturationMod(1.1f).build();
    public static final FoodProperties NETHERITE_APPLE = new FoodProperties.Builder().nutrition(12)
            .saturationMod(1f).build();
    public static final FoodProperties COPPER_APPLE = new FoodProperties.Builder().nutrition(7)
            .saturationMod(1f).build();
    public static final FoodProperties ORANGE_APPLE = new FoodProperties.Builder().nutrition(5)
            .saturationMod(0.4f).build();
    public static final FoodProperties LAPIS_APPLE = new FoodProperties.Builder().nutrition(7)
            .saturationMod(0.3f).build();
    public static final FoodProperties QUARTZ_APPLE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.5f).build();
    public static final FoodProperties PINK_APPLE = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.6f).build();
    public static final FoodProperties DARK_PINK_APPLE = new FoodProperties.Builder().nutrition(5)
            .saturationMod(0.6f).build();
    public static final FoodProperties DIAMOND_APPLE = new FoodProperties.Builder().nutrition(11)
            .saturationMod(1f).build();
    public static final FoodProperties IRON_APPLE = new FoodProperties.Builder().nutrition(8)
            .saturationMod(0.7f).build();
    public static final FoodProperties REDSTONE_APPLE = new FoodProperties.Builder().nutrition(4)
            .saturationMod(1f).build();
    public static final FoodProperties DARK_IRON_APPLE = new FoodProperties.Builder().nutrition(10)
            .saturationMod(1f).build();
    public static final FoodProperties DARK_DIAMOND_APPLE = new FoodProperties.Builder().nutrition(13)
            .saturationMod(1.7f).build();
    public static final FoodProperties DARK_NETHERITE_APPLE = new FoodProperties.Builder().nutrition(14)
            .saturationMod(2f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 12000), 3f).build();

    public static final FoodProperties BAD_APPLE = new FoodProperties.Builder().nutrition(8)
            .saturationMod(0.2f).build();
}
