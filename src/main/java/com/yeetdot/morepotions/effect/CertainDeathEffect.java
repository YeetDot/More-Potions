package com.yeetdot.morepotions.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;

public class CertainDeathEffect extends StatusEffect {
    public CertainDeathEffect() {
        super(StatusEffectCategory.HARMFUL, 0x000000, ParticleTypes.SOUL);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration < 2;
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof ServerPlayerEntity player && (player.isCreative() || player.isSpectator())) {
            return true;
        } else {
            entity.kill();
        }

        return true;
    }
}
