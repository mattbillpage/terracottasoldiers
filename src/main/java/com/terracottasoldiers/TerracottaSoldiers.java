package com.terracottasoldiers;

import com.terracottasoldiers.entity.TerracottaSoldierEntity;
import com.terracottasoldiers.registry.ModEntityTypes;
import com.terracottasoldiers.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@Mod(TerracottaSoldiers.MOD_ID)
public class TerracottaSoldiers {

    public static final String MOD_ID = "terracottasoldiers";

    public TerracottaSoldiers(IEventBus modEventBus) {
        ModItems.ITEMS.register(modEventBus);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);

        modEventBus.addListener(this::registerAttributes);
    }

    private void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.TERRACOTTA_SOLDIER.get(), TerracottaSoldierEntity.createAttributes().build());
    }
}