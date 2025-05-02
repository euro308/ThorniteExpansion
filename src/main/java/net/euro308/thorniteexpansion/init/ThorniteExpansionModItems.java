
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.euro308.thorniteexpansion.init;

import net.euro308.thorniteexpansion.item.*;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.euro308.thorniteexpansion.ThorniteExpansionMod;

public class ThorniteExpansionModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ThorniteExpansionMod.MODID);
	public static final DeferredItem<Item> RAW_THORNITE = REGISTRY.register("raw_thornite", RawThorniteItem::new);
	public static final DeferredItem<Item> THORNITE_GEM = REGISTRY.register("thornite_gem", ThorniteGemItem::new);
	public static final DeferredItem<Item> THORNITE_ORE = block(ThorniteExpansionModBlocks.THORNITE_ORE);
	public static final DeferredItem<Item> THORNITE_BLOCK = block(ThorniteExpansionModBlocks.THORNITE_BLOCK);
	public static final DeferredItem<Item> THORNITE_PICKAXE = REGISTRY.register("thornite_pickaxe", ThornitePickaxeItem::new);
	public static final DeferredItem<Item> THORNITE_AXE = REGISTRY.register("thornite_axe", ThorniteAxeItem::new);
	public static final DeferredItem<Item> THORNITE_SWORD = REGISTRY.register("thornite_sword", ThorniteSwordItem::new);
	public static final DeferredItem<Item> THORNITE_SHOVEL = REGISTRY.register("thornite_shovel", ThorniteShovelItem::new);
	public static final DeferredItem<Item> THORNITE_HOE = REGISTRY.register("thornite_hoe", ThorniteHoeItem::new);
	public static final DeferredItem<Item> THORNITE_HELMET = REGISTRY.register("thornite_helmet", ThorniteArmorItem.Helmet::new);
	public static final DeferredItem<Item> THORNITE_CHESTPLATE = REGISTRY.register("thornite_chestplate", ThorniteArmorItem.Chestplate::new);
	public static final DeferredItem<Item> THORNITE_LEGGINGS = REGISTRY.register("thornite_leggings", ThorniteArmorItem.Leggings::new);
	public static final DeferredItem<Item> THORNITE_BOOTS = REGISTRY.register("thornite_boots", ThorniteArmorItem.Boots::new);
	public static final DeferredItem<Item> GOLDEN_GEM = REGISTRY.register("golden_gem", GoldenGemItem::new);
	public static final DeferredItem<Item> GOLDEN_THORNITE_PICKAXE = REGISTRY.register("golden_thornite_pickaxe", GoldenThornitePickaxeItem::new);
	public static final DeferredItem<Item> GOLDEN_THORNITE_AXE = REGISTRY.register("golden_thornite_axe", GoldenThorniteAxeItem::new);
	public static final DeferredItem<Item> GOLDEN_THORNITE_SWORD = REGISTRY.register("golden_thornite_sword", GoldenThorniteSwordItem::new);
	public static final DeferredItem<Item> GOLDEN_THORNITE_SHOVEL = REGISTRY.register("golden_thornite_shovel", GoldenThorniteShovelItem::new);
	public static final DeferredItem<Item> GOLDEN_THORNITE_HOE = REGISTRY.register("golden_thornite_hoe", GoldenThorniteHoeItem::new);
	public static final DeferredItem<Item> GOLDEN_THORNITE_HELMET = REGISTRY.register("golden_thornite_helmet", GoldenThorniteArmorItem.Helmet::new);
	public static final DeferredItem<Item> GOLDEN_THORNITE_CHESTPLATE = REGISTRY.register("golden_thornite_chestplate", GoldenThorniteArmorItem.Chestplate::new);
	public static final DeferredItem<Item> GOLDEN_THORNITE_LEGGINGS = REGISTRY.register("golden_thornite_leggings", GoldenThorniteArmorItem.Leggings::new);
	public static final DeferredItem<Item> GOLDEN_THORNITE_BOOTS = REGISTRY.register("golden_thornite_boots", GoldenThorniteArmorItem.Boots::new);
	public static final DeferredItem<Item> DIAMOND_GEM = REGISTRY.register("diamond_gem", DiamondGemItem::new);
	public static final DeferredItem<Item> DIAMOND_THORNITE_PICKAXE = REGISTRY.register("diamond_thornite_pickaxe", DiamondThornitePickaxeItem::new);
	public static final DeferredItem<Item> DIAMOND_THORNITE_AXE = REGISTRY.register("diamond_thornite_axe", DiamondThorniteAxeItem::new);
	public static final DeferredItem<Item> DIAMOND_THORNITE_SWORD = REGISTRY.register("diamond_thornite_sword", DiamondThorniteSwordItem::new);
	public static final DeferredItem<Item> DIAMOND_THORNITE_SHOVEL = REGISTRY.register("diamond_thornite_shovel", DiamondThorniteShovelItem::new);
	public static final DeferredItem<Item> DIAMOND_THORNITE_HOE = REGISTRY.register("diamond_thornite_hoe", DiamondThorniteHoeItem::new);
	public static final DeferredItem<Item> DIAMOND_THORNITE_HELMET = REGISTRY.register("diamond_thornite_helmet", DiamondThorniteArmorItem.Helmet::new);
	public static final DeferredItem<Item> DIAMOND_THORNITE_CHESTPLATE = REGISTRY.register("diamond_thornite_chestplate", DiamondThorniteArmorItem.Chestplate::new);
	public static final DeferredItem<Item> DIAMOND_THORNITE_LEGGINGS = REGISTRY.register("diamond_thornite_leggings", DiamondThorniteArmorItem.Leggings::new);
	public static final DeferredItem<Item> DIAMOND_THORNITE_BOOTS = REGISTRY.register("diamond_thornite_boots", DiamondThorniteArmorItem.Boots::new);
	public static final DeferredItem<Item> EMERALD_GEM = REGISTRY.register("emerald_gem", EmeraldGemItem::new);
	public static final DeferredItem<Item> EMERALD_THORNITE_PICKAXE = REGISTRY.register("emerald_thornite_pickaxe", EmeraldThornitePickaxeItem::new);
	public static final DeferredItem<Item> EMERALD_THORNITE_AXE = REGISTRY.register("emerald_thornite_axe", EmeraldThorniteAxeItem::new);
	public static final DeferredItem<Item> EMERALD_THORNITE_SWORD = REGISTRY.register("emerald_thornite_sword", EmeraldThorniteSwordItem::new);
	public static final DeferredItem<Item> EMERALD_THORNITE_SHOVEL = REGISTRY.register("emerald_thornite_shovel", EmeraldThorniteShovelItem::new);
	public static final DeferredItem<Item> EMERALD_THORNITE_HOE = REGISTRY.register("emerald_thornite_hoe", EmeraldThorniteHoeItem::new);
	public static final DeferredItem<Item> EMERALD_THORNITE_HELMET = REGISTRY.register("emerald_thornite_helmet", EmeraldThorniteArmorItem.Helmet::new);
	public static final DeferredItem<Item> EMERALD_THORNITE_CHESTPLATE = REGISTRY.register("emerald_thornite_chestplate", EmeraldThorniteArmorItem.Chestplate::new);
	public static final DeferredItem<Item> EMERALD_THORNITE_LEGGINGS = REGISTRY.register("emerald_thornite_leggings", EmeraldThorniteArmorItem.Leggings::new);
	public static final DeferredItem<Item> EMERALD_THORNITE_BOOTS = REGISTRY.register("emerald_thornite_boots", EmeraldThorniteArmorItem.Boots::new);
	public static final DeferredItem<Item> NETHERITE_GEM = REGISTRY.register("netherite_gem", NetheriteGemItem::new);
	public static final DeferredItem<Item> NETHERITE_THORNITE_PICKAXE = REGISTRY.register("netherite_thornite_pickaxe", NetheriteThornitePickaxeItem::new);
	public static final DeferredItem<Item> NETHERITE_THORNITE_AXE = REGISTRY.register("netherite_thornite_axe", NetheriteThorniteAxeItem::new);
	public static final DeferredItem<Item> NETHERITE_THORNITE_SWORD = REGISTRY.register("netherite_thornite_sword", NetheriteThorniteSwordItem::new);
	public static final DeferredItem<Item> NETHERITE_THORNITE_SHOVEL = REGISTRY.register("netherite_thornite_shovel", NetheriteThorniteShovelItem::new);
	public static final DeferredItem<Item> NETHERITE_THORNITE_HOE = REGISTRY.register("netherite_thornite_hoe", NetheriteThorniteHoeItem::new);
	public static final DeferredItem<Item> NETHERITE_THORNITE_HELMET = REGISTRY.register("netherite_thornite_helmet", NetheriteThorniteArmorItem.Helmet::new);
	public static final DeferredItem<Item> NETHERITE_THORNITE_CHESTPLATE = REGISTRY.register("netherite_thornite_chestplate", NetheriteThorniteArmorItem.Chestplate::new);
	public static final DeferredItem<Item> NETHERITE_THORNITE_LEGGINGS = REGISTRY.register("netherite_thornite_leggings", NetheriteThorniteArmorItem.Leggings::new);
	public static final DeferredItem<Item> NETHERITE_THORNITE_BOOTS = REGISTRY.register("netherite_thornite_boots", NetheriteThorniteArmorItem.Boots::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}