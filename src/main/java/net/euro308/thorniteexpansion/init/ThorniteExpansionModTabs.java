
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.euro308.thorniteexpansion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.euro308.thorniteexpansion.ThorniteExpansionMod;

public class ThorniteExpansionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ThorniteExpansionMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THORNITE_EXPANSION = REGISTRY.register("thornite_expansion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.thornite_expansion.thornite_expansion")).icon(() -> new ItemStack(ThorniteExpansionModItems.THORNITE_GEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ThorniteExpansionModBlocks.THORNITE_ORE.get().asItem());
				tabData.accept(ThorniteExpansionModBlocks.THORNITE_BLOCK.get().asItem());
				tabData.accept(ThorniteExpansionModItems.RAW_THORNITE.get());
				tabData.accept(ThorniteExpansionModItems.THORNITE_GEM.get());
				tabData.accept(ThorniteExpansionModItems.GOLDEN_GEM.get());
				tabData.accept(ThorniteExpansionModItems.DIAMOND_GEM.get());
				tabData.accept(ThorniteExpansionModItems.EMERALD_GEM.get());
				tabData.accept(ThorniteExpansionModItems.NETHERITE_GEM.get());

				tabData.accept(ThorniteExpansionModItems.THORNITE_SWORD.get());
				tabData.accept(ThorniteExpansionModItems.THORNITE_PICKAXE.get());
				tabData.accept(ThorniteExpansionModItems.THORNITE_AXE.get());
				tabData.accept(ThorniteExpansionModItems.THORNITE_SHOVEL.get());
				tabData.accept(ThorniteExpansionModItems.THORNITE_HOE.get());

				tabData.accept(ThorniteExpansionModItems.GOLDEN_THORNITE_SWORD.get());
				tabData.accept(ThorniteExpansionModItems.GOLDEN_THORNITE_PICKAXE.get());
				tabData.accept(ThorniteExpansionModItems.GOLDEN_THORNITE_AXE.get());
				tabData.accept(ThorniteExpansionModItems.GOLDEN_THORNITE_SHOVEL.get());
				tabData.accept(ThorniteExpansionModItems.GOLDEN_THORNITE_HOE.get());

				tabData.accept(ThorniteExpansionModItems.DIAMOND_THORNITE_SWORD.get());
				tabData.accept(ThorniteExpansionModItems.DIAMOND_THORNITE_PICKAXE.get());
				tabData.accept(ThorniteExpansionModItems.DIAMOND_THORNITE_AXE.get());
				tabData.accept(ThorniteExpansionModItems.DIAMOND_THORNITE_SHOVEL.get());
				tabData.accept(ThorniteExpansionModItems.DIAMOND_THORNITE_HOE.get());

				tabData.accept(ThorniteExpansionModItems.EMERALD_THORNITE_SWORD.get());
				tabData.accept(ThorniteExpansionModItems.EMERALD_THORNITE_PICKAXE.get());
				tabData.accept(ThorniteExpansionModItems.EMERALD_THORNITE_AXE.get());
				tabData.accept(ThorniteExpansionModItems.EMERALD_THORNITE_SHOVEL.get());
				tabData.accept(ThorniteExpansionModItems.EMERALD_THORNITE_HOE.get());

				tabData.accept(ThorniteExpansionModItems.NETHERITE_THORNITE_SWORD.get());
				tabData.accept(ThorniteExpansionModItems.NETHERITE_THORNITE_PICKAXE.get());
				tabData.accept(ThorniteExpansionModItems.NETHERITE_THORNITE_AXE.get());
				tabData.accept(ThorniteExpansionModItems.NETHERITE_THORNITE_SHOVEL.get());
				tabData.accept(ThorniteExpansionModItems.NETHERITE_THORNITE_HOE.get());

				tabData.accept(ThorniteExpansionModItems.THORNITE_HELMET.get());
				tabData.accept(ThorniteExpansionModItems.THORNITE_CHESTPLATE.get());
				tabData.accept(ThorniteExpansionModItems.THORNITE_LEGGINGS.get());
				tabData.accept(ThorniteExpansionModItems.THORNITE_BOOTS.get());

				tabData.accept(ThorniteExpansionModItems.GOLDEN_THORNITE_HELMET.get());
				tabData.accept(ThorniteExpansionModItems.GOLDEN_THORNITE_CHESTPLATE.get());
				tabData.accept(ThorniteExpansionModItems.GOLDEN_THORNITE_LEGGINGS.get());
				tabData.accept(ThorniteExpansionModItems.GOLDEN_THORNITE_BOOTS.get());

				tabData.accept(ThorniteExpansionModItems.DIAMOND_THORNITE_HELMET.get());
				tabData.accept(ThorniteExpansionModItems.DIAMOND_THORNITE_CHESTPLATE.get());
				tabData.accept(ThorniteExpansionModItems.DIAMOND_THORNITE_LEGGINGS.get());
				tabData.accept(ThorniteExpansionModItems.DIAMOND_THORNITE_BOOTS.get());

				tabData.accept(ThorniteExpansionModItems.EMERALD_THORNITE_HELMET.get());
				tabData.accept(ThorniteExpansionModItems.EMERALD_THORNITE_CHESTPLATE.get());
				tabData.accept(ThorniteExpansionModItems.EMERALD_THORNITE_LEGGINGS.get());
				tabData.accept(ThorniteExpansionModItems.EMERALD_THORNITE_BOOTS.get());

				tabData.accept(ThorniteExpansionModItems.NETHERITE_THORNITE_HELMET.get());
				tabData.accept(ThorniteExpansionModItems.NETHERITE_THORNITE_CHESTPLATE.get());
				tabData.accept(ThorniteExpansionModItems.NETHERITE_THORNITE_LEGGINGS.get());
				tabData.accept(ThorniteExpansionModItems.NETHERITE_THORNITE_BOOTS.get());
			}).build());
}