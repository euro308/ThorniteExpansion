
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.euro308.thorniteexpansion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.euro308.thorniteexpansion.block.ThorniteOreBlock;
import net.euro308.thorniteexpansion.block.ThorniteBlockBlock;
import net.euro308.thorniteexpansion.ThorniteExpansionMod;

public class ThorniteExpansionModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ThorniteExpansionMod.MODID);
	public static final DeferredBlock<Block> THORNITE_ORE = REGISTRY.register("thornite_ore", ThorniteOreBlock::new);
	public static final DeferredBlock<Block> THORNITE_BLOCK = REGISTRY.register("thornite_block", ThorniteBlockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
