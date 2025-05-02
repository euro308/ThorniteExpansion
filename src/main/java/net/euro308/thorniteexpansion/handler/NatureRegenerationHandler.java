package net.euro308.thorniteexpansion.handler;

import net.euro308.thorniteexpansion.ThorniteExpansionMod;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.BlockPos;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

import net.euro308.thorniteexpansion.item.INatureRepairable;

@EventBusSubscriber(modid = ThorniteExpansionMod.MODID)
public class NatureRegenerationHandler {

    private static final int REGEN_RADIUS = 2; // Search radius for nature blocks
    private static final int REGEN_COOLDOWN = 100; // 5 seconds at 20 ticks/second

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {
        if (!event.getEntity().level().isClientSide()) {
            Player player = event.getEntity();

            // Only process every REGEN_COOLDOWN ticks
            if (player.tickCount % REGEN_COOLDOWN != 0) {
                return;
            }

            // Check if player is near nature blocks
            if (isNearNatureBlocks(player)) {
                // Check and repair main hand item
                repairItemIfNature(player.getMainHandItem());

                // Check and repair off hand item
                repairItemIfNature(player.getOffhandItem());

                // Check and repair armor items
                for (ItemStack armorItem : player.getArmorSlots()) {
                    repairItemIfNature(armorItem);
                }
            }
        }
    }

    private static void repairItemIfNature(ItemStack stack) {
        if (!stack.isEmpty() && stack.isDamaged() && stack.getItem() instanceof INatureRepairable natureItem) {
            int repairAmount = natureItem.getNatureRepairAmount();
            stack.setDamageValue(Math.max(0, stack.getDamageValue() - repairAmount));
        }
    }

    private static boolean isNearNatureBlocks(Player player) {
        BlockPos playerPos = player.blockPosition();

        for (int x = -REGEN_RADIUS; x <= REGEN_RADIUS; x++) {
            for (int y = -REGEN_RADIUS; y <= REGEN_RADIUS; y++) {
                for (int z = -REGEN_RADIUS; z <= REGEN_RADIUS; z++) {
                    BlockPos checkPos = playerPos.offset(x, y, z);
                    Block block = player.level().getBlockState(checkPos).getBlock();

                    if (isNatureBlock(block)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean isNatureBlock(Block block) {
        // List of blocks that count as "nature blocks"
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
