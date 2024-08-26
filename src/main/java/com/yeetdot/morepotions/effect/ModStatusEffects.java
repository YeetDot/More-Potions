package com.yeetdot.morepotions.effect;

import com.yeetdot.morepotions.MorePotions;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModStatusEffects {

    public static final RegistryEntry<StatusEffect> CREATIVITY_EFFECT = register("creativity", new CreativityEffect());
    public static final RegistryEntry<StatusEffect> CERTAIN_DEATH_EFFECT = register("certain_death", new CertainDeathEffect());


    private static RegistryEntry<StatusEffect> register(String name, StatusEffect effect){
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MorePotions.MOD_ID, name), effect);
    }

    public static void registerEffects() {}
}
