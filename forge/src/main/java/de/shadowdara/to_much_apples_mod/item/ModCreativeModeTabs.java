package de.shadowdara.to_much_apples_mod.item;

import de.shadowdara.to_much_apples_mod.main;
import de.shadowdara.to_much_apples_mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, main.MOD_ID);

    public static final RegistryObject<CreativeModeTab> APPLES_TAB =CREATIVE_MODE_TABS.register("apples_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.AMETHYST_APPLE.get()))
                    .title(Component.translatable("creativetab.apples_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.AMETHYST_APPLE.get());
                        pOutput.accept(ModItems.NETHERITE_APPLE.get());
                        pOutput.accept(ModItems.COPPER_APPLE.get());
                        pOutput.accept(ModItems.ORANGE_APPLE.get());
                        pOutput.accept(ModItems.LAPIS_APPLE.get());
                        pOutput.accept(ModItems.QUARTZ_APPLE.get());
                        pOutput.accept(ModItems.GREEN_APPLE.get());
                        pOutput.accept(ModItems.PINK_APPLE.get());
                        pOutput.accept(ModItems.DARK_PINK_APPLE.get());
                        pOutput.accept(ModItems.DIAMOND_APPLE.get());
                        pOutput.accept(ModItems.IRON_APPLE.get());
                        pOutput.accept(ModItems.REDSTONE_APPLE.get());
                        pOutput.accept(ModItems.DARK_IRON_APPLE.get());
                        pOutput.accept(ModItems.DARK_DIAMOND_APPLE.get());
                        pOutput.accept(ModItems.DARK_NETHERITE_APPLE.get());
                        pOutput.accept(ModItems.BAD_APPLE.get());

                        pOutput.accept(ModBlocks.BLAZE_LOG.get());
                        pOutput.accept(ModBlocks.COMPRESSED_APPLE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
