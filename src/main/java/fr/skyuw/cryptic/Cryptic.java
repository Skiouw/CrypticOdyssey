package fr.skyuw.cryptic;

import fr.skyuw.cryptic.init.ModItems;
import net.fabricmc.api.ModInitializer;

public class Cryptic implements ModInitializer {

    public static final String MODID = "cryptic";

    @Override
    public void onInitialize() {

        ModItems.registerAll();

    }

}
