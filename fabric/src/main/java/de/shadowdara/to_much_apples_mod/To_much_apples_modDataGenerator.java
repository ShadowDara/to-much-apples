package de.shadowdara.to_much_apples_mod;

import de.shadowdara.to_much_apples_mod.datagen.ModItemTagProvider;
import de.shadowdara.to_much_apples_mod.datagen.ModModelsProvider;
import de.shadowdara.to_much_apples_mod.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class To_much_apples_modDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModModelsProvider::new);
        pack.addProvider(ModRecipeProvider::new);
    }
}
