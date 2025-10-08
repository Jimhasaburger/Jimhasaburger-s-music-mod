/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.jimhasaburger.jimhasaburgersmusicmod.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.jimhasaburger.jimhasaburgersmusicmod.JimhasaburgersMusicModMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class JimhasaburgersMusicModModTabs {
	public static ResourceKey<CreativeModeTab> TAB_JIMHASABURGERSMUSICMOD = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(JimhasaburgersMusicModMod.MODID, "jimhasaburgersmusicmod"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_JIMHASABURGERSMUSICMOD,
				FabricItemGroup.builder().title(Component.translatable("item_group.jimhasaburgers_music_mod.jimhasaburgersmusicmod")).icon(() -> new ItemStack(Blocks.JUKEBOX)).displayItems((parameters, tabData) -> {
					tabData.accept(JimhasaburgersMusicModModItems.MAGNETICCIRCUITS);
					tabData.accept(JimhasaburgersMusicModModItems.STEREOMADNESS);
				}).build());
	}
}