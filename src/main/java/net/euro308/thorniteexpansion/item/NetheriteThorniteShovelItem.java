
package net.euro308.thorniteexpansion.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;

import net.euro308.thorniteexpansion.init.ThorniteExpansionModItems;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NetheriteThorniteShovelItem extends ShovelItem implements INatureRepairable {
    private static final Tier TOOL_TIER = new Tier() {
        @Override
        public int getUses() {
            return 3046;
        }

        @Override
        public float getSpeed() {
            return 10f;
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
            return 15;
        }

        @Override
        public @NotNull Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(ThorniteExpansionModItems.NETHERITE_GEM.get()), new ItemStack(Items.NETHERITE_INGOT), new ItemStack(ThorniteExpansionModItems.THORNITE_GEM.get()));
        }
    };

    public NetheriteThorniteShovelItem() {
        super(TOOL_TIER, new Item.Properties().attributes(DiggerItem.createAttributes(TOOL_TIER, 5.5f, -3f)).fireResistant());
    }

    @Override
    public int getNatureRepairAmount() {
        return 3;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext level, List<Component> tooltip, @NotNull TooltipFlag flag) {
        tooltip.add(Component.literal("Blessed by Gaia").withStyle(ChatFormatting.DARK_GREEN));
        super.appendHoverText(stack, level, tooltip, flag);
    }
}
