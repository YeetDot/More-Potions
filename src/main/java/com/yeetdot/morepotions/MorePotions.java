package com.yeetdot.morepotions;

import com.yeetdot.morepotions.effect.ModStatusEffects;
import com.yeetdot.morepotions.potion.ModPotions;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MorePotions implements ModInitializer {
	public static final String MOD_ID = "morepotions";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModPotions.registerPotions();
		ModStatusEffects.registerEffects();
	}
}