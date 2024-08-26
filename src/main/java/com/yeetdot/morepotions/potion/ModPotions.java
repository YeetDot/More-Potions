package com.yeetdot.morepotions.potion;

import com.yeetdot.morepotions.MorePotions;
import com.yeetdot.morepotions.effect.ModStatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {
    private static final int SUPER_SHORT_DURATION = 300;
    private static final int SHORT_DURATION = 1200;
    private static final int MEDIUM_DURATION = 3600;
    private static final int LONG_DURATION = 9600;
    private static final int SUPER_LONG_DURATION = 36000;



    public static final RegistryEntry<Potion> ALL_EFFECT = register("all_effect", createAllEffectPotion(SUPER_SHORT_DURATION));
    public static final RegistryEntry<Potion> ALL_EFFECT_LONG = register("all_effect_long", createAllEffectPotion(SHORT_DURATION));
    public static final RegistryEntry<Potion> CREATIVITY = register("creativity", new Potion(new StatusEffectInstance(ModStatusEffects.CREATIVITY_EFFECT, SUPER_SHORT_DURATION)));
    public static final RegistryEntry<Potion> CREATIVITY_LONG = register("creativity_long", new Potion(new StatusEffectInstance(ModStatusEffects.CREATIVITY_EFFECT, SHORT_DURATION)));
    public static final RegistryEntry<Potion> CERTAIN_DEATH = register("certain_death", new Potion(new StatusEffectInstance(ModStatusEffects.CERTAIN_DEATH_EFFECT, MEDIUM_DURATION)));



    private static RegistryEntry<Potion> register(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(MorePotions.MOD_ID, name), potion);
    }

    public static void registerPotions() {}

    private static Potion createAllEffectPotion(int duration){
        return new Potion(
                new StatusEffectInstance(ModStatusEffects.CREATIVITY_EFFECT, duration),
                new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, duration),
                new StatusEffectInstance(StatusEffects.RESISTANCE, duration),
                new StatusEffectInstance(StatusEffects.SLOW_FALLING, duration),
                new StatusEffectInstance(StatusEffects.ABSORPTION, duration),
                new StatusEffectInstance(StatusEffects.CONDUIT_POWER, duration),
                new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, duration),
                new StatusEffectInstance(StatusEffects.GLOWING, duration),
                new StatusEffectInstance(StatusEffects.HASTE, duration),
                new StatusEffectInstance(StatusEffects.HEALTH_BOOST, duration),
                new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, duration),
                new StatusEffectInstance(StatusEffects.INVISIBILITY, duration),
                new StatusEffectInstance(StatusEffects.JUMP_BOOST, duration),
                new StatusEffectInstance(StatusEffects.LUCK, duration),
                new StatusEffectInstance(StatusEffects.NIGHT_VISION, duration),
                new StatusEffectInstance(StatusEffects.REGENERATION, duration),
                new StatusEffectInstance(StatusEffects.SATURATION, duration),
                new StatusEffectInstance(StatusEffects.SPEED, duration),
                new StatusEffectInstance(StatusEffects.STRENGTH, duration),
                new StatusEffectInstance(StatusEffects.WATER_BREATHING, duration),
                new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, duration),
                new StatusEffectInstance(StatusEffects.BAD_OMEN, duration),
                new StatusEffectInstance(StatusEffects.RAID_OMEN, duration),
                new StatusEffectInstance(StatusEffects.TRIAL_OMEN, duration),
                new StatusEffectInstance(StatusEffects.SLOWNESS, duration),
                new StatusEffectInstance(StatusEffects.BLINDNESS, duration),
                new StatusEffectInstance(StatusEffects.DARKNESS, duration),
                new StatusEffectInstance(StatusEffects.HUNGER, duration),
                new StatusEffectInstance(StatusEffects.INFESTED, duration),
                new StatusEffectInstance(StatusEffects.LEVITATION, duration),
                new StatusEffectInstance(StatusEffects.MINING_FATIGUE, duration),
                new StatusEffectInstance(StatusEffects.NAUSEA, duration),
                new StatusEffectInstance(StatusEffects.OOZING, duration),
                new StatusEffectInstance(StatusEffects.POISON, duration),
                new StatusEffectInstance(StatusEffects.UNLUCK, duration),
                new StatusEffectInstance(StatusEffects.WEAKNESS, duration),
                new StatusEffectInstance(StatusEffects.WEAVING, duration),
                new StatusEffectInstance(StatusEffects.WIND_CHARGED, duration),
                new StatusEffectInstance(StatusEffects.WITHER, duration),
                new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, duration)
        );
    }
}
