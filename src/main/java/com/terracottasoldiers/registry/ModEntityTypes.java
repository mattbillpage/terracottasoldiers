package com.terracottasoldiers.registry;

import com.terracottasoldiers.TerracottaSoldiers;
import com.terracottasoldiers.entity.TerracottaSoldierEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntityTypes {

    public static final DeferredRegister.Entities ENTITY_TYPES =
            DeferredRegister.createEntities(TerracottaSoldiers.MOD_ID);

    public static final Supplier<EntityType<TerracottaSoldierEntity>> TERRACOTTA_SOLDIER =
            ENTITY_TYPES.registerEntityType(
                    "terracotta_soldier",
                    TerracottaSoldierEntity::new,
                    MobCategory.MISC,
                    builder -> builder.sized(0.5f, 0.9f)
                    // placeholder sizing
            );
}