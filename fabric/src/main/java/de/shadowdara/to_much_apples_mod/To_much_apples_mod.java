package de.shadowdara.to_much_apples_mod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import de.shadowdara.to_much_apples_mod.item.ModItems;

public class To_much_apples_mod implements ModInitializer {
    public static final String MOD_ID = "to_much_apples_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
