package net.jimhasaburger.jimhasaburgersmusicmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.jimhasaburger.jimhasaburgersmusicmod.JimhasaburgersMusicModMod;

public class StereomadnessItem extends Item {
	public StereomadnessItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(JimhasaburgersMusicModMod.MODID, "stereomadness"))));
	}
}