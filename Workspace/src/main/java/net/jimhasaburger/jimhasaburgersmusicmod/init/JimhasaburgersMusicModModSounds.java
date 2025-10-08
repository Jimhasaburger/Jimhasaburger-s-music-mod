/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.jimhasaburger.jimhasaburgersmusicmod.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.jimhasaburger.jimhasaburgersmusicmod.JimhasaburgersMusicModMod;

public class JimhasaburgersMusicModModSounds {
	public static SoundEvent CALM4_OGG;
	public static SoundEvent STEREO_MADNESS_AUDIO;

	public static void load() {
		CALM4_OGG = register("calm4.ogg", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("jimhasaburgers_music_mod", "calm4.ogg")));
		STEREO_MADNESS_AUDIO = register("stereo_madness_audio", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("jimhasaburgers_music_mod", "stereo_madness_audio")));
	}

	private static SoundEvent register(String registryname, SoundEvent element) {
		return Registry.register(BuiltInRegistries.SOUND_EVENT, ResourceLocation.fromNamespaceAndPath(JimhasaburgersMusicModMod.MODID, registryname), element);
	}
}