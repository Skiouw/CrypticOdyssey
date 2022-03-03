package fr.skyuw.cryptic.init;

import fr.skyuw.cryptic.Cryptic;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item TEST_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerAll(){

        Registry.register(Registry.ITEM, new Identifier(Cryptic.MODID, "test_ingot"),TEST_INGOT);

    }

}
