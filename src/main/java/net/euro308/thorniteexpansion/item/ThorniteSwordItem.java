
package net.euro308.thorniteexpansion.item;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;

import net.euro308.thorniteexpansion.init.ThorniteExpansionModItems;
import org.jetbrains.annotations.NotNull;

public class ThorniteSwordItem extends SwordItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 313;
		}

		@Override
		public float getSpeed() {
			return 6f;
		}

		@Override
		public float getAttackDamageBonus() {
			return 0;
		}

		@Override
		public @NotNull TagKey<Block> getIncorrectBlocksForDrops() {
			return BlockTags.INCORRECT_FOR_IRON_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 14;
		}

		@Override
		public @NotNull Ingredient getRepairIngredient() {
			return Ingredient.of(new ItemStack(ThorniteExpansionModItems.THORNITE_GEM.get()), new ItemStack(Items.IRON_INGOT));
		}
	};

	public ThorniteSwordItem() {
		super(TOOL_TIER, new Item.Properties().attributes(SwordItem.createAttributes(TOOL_TIER, 5f, -2.4f)));
	}
}
