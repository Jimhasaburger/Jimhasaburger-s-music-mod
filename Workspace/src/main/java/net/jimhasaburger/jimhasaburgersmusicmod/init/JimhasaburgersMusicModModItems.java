/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.jimhasaburger.jimhasaburgersmusicmod.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.jimhasaburger.jimhasaburgersmusicmod.item.StereomadnessItem;
import net.jimhasaburger.jimhasaburgersmusicmod.item.MagneticcircuitsItem;
import net.jimhasaburger.jimhasaburgersmusicmod.JimhasaburgersMusicModMod;

import java.util.function.Function;

public class JimhasaburgersMusicModModItems {
	public static Item MAGNETICCIRCUITS;
	public static Item STEREOMADNESS;

	public static void load() {
		MAGNETICCIRCUITS = register("magneticcircuits", MagneticcircuitsItem::new);
		STEREOMADNESS = register("stereomadness", StereomadnessItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(JimhasaburgersMusicModMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}
}