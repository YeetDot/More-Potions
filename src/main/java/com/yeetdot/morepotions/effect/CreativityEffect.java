package com.yeetdot.morepotions.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.GameMode;

public class CreativityEffect extends StatusEffect {
    public CreativityEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xFFFFFF, ParticleTypes.END_ROD);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration < 2;
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof ServerPlayerEntity player && !player.isSpectator()) {
            player.changeGameMode(GameMode.SURVIVAL);
        } else {
            entity.setInvulnerable(true);
        }
        return super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public void onApplied(LivingEntity entity, int amplifier) {
        if (entity instanceof ServerPlayerEntity player && !player.isSpectator()) {
            player.changeGameMode(GameMode.CREATIVE);
        } else {
            entity.setInvulnerable(true);
        }
    }

}
