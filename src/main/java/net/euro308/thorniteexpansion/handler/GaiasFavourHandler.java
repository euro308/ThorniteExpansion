package net.euro308.thorniteexpansion.handler;

import net.euro308.thorniteexpansion.ThorniteExpansionMod;
import net.euro308.thorniteexpansion.item.INatureRepairable;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

@EventBusSubscriber(modid = ThorniteExpansionMod.MODID)
public class GaiasFavourHandler {

    private static final ResourceLocation GAIAS_FAVOUR_ID = ResourceLocation.fromNamespaceAndPath("thornite_expansion", "gaias_favour");
    private static final int REGEN_COOLDOWN = 250; // 12.5 seconds at 20 ticks/second

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {

        if (!event.getEntity().level().isClientSide()) {
            Player player = event.getEntity();

            // Only process every REGEN_COOLDOWN ticks
            if (player.tickCount % REGEN_COOLDOWN != 0) {
                return;
            }

            // Check if player is standing on or just above a nature block/flower
            if (isNatureBlockUnderOrAtFeet(player)) {

                // Main hand
                tryRepairWithGaiasFavour(player, player.getMainHandItem());

                // Offhand
                tryRepairWithGaiasFavour(player, player.getOffhandItem());

                // Armor slots
                for (ItemStack armorItem : player.getArmorSlots()) {
                    tryRepairWithGaiasFavour(player, armorItem);
                }
            }
        }
    }

    private static void tryRepairWithGaiasFavour(Player player, ItemStack stack) {
        if (stack.isEmpty() || !stack.isDamaged()) return;

        // Block Gaia's Favour effect on Thornite items (or any INatureRepairable)
        if (stack.getItem() instanceof INatureRepairable) {
            return;
        }

        var enchantmentHolder = player.level().registryAccess().registryOrThrow(Registries.ENCHANTMENT).getHolder(GAIAS_FAVOUR_ID);
        if (enchantmentHolder.isEmpty()) {
            return;
        }

        int level = EnchantmentHelper.getItemEnchantmentLevel(enchantmentHolder.get(), stack);

        if (level > 0) {
            stack.setDamageValue(Math.max(0, stack.getDamageValue() - 1));
            }
    }

    private static boolean isNatureBlockUnderOrAtFeet(Player player) {
        BlockPos pos = player.blockPosition();
        Block blockBelow = player.level().getBlockState(pos.below()).getBlock();
        Block blockAtFeet = player.level().getBlockState(pos).getBlock();

        return isNatureBlock(blockBelow) || isNatureBlock(blockAtFeet);
    }

    private static boolean isNatureBlock(Block block) {
        return block == Blocks.GRASS_BLOCK ||
                block == Blocks.MOSS_BLOCK ||
                block == Blocks.MOSS_CARPET ||
                block == Blocks.AZALEA ||
                block == Blocks.FLOWERING_AZALEA ||
                block == Blocks.SHORT_GRASS ||
                block == Blocks.FERN ||
                block == Blocks.DANDELION ||
                block == Blocks.POPPY ||
                block == Blocks.BLUE_ORCHID ||
                block == Blocks.ALLIUM ||
                block == Blocks.AZURE_BLUET ||
                block == Blocks.RED_TULIP ||
                block == Blocks.ORANGE_TULIP ||
                block == Blocks.WHITE_TULIP ||
                block == Blocks.PINK_TULIP ||
                block == Blocks.OXEYE_DAISY ||
                block == Blocks.CORNFLOWER ||
                block == Blocks.LILY_OF_THE_VALLEY;
    }
}
