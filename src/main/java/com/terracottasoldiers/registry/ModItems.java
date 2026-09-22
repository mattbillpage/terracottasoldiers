package com.terracottasoldiers.registry;

import com.terracottasoldiers.TerracottaSoldiers;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(TerracottaSoldiers.MOD_ID);

    // Placeholder, will be the spawn item later 
    public static final DeferredItem<Item> TERRACOTTA_FIGURE =
            ITEMS.registerSimpleItem("terracotta_figure");
}