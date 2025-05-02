
package net.euro308.thorniteexpansion.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Holder;
import net.minecraft.Util;

import net.euro308.thorniteexpansion.init.ThorniteExpansionModItems;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.EnumMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class GoldenThorniteArmorItem extends ArmorItem implements INatureRepairable {
	public static Holder<ArmorMaterial> ARMOR_MATERIAL = null;

	@SubscribeEvent
	public static void registerArmorMaterial(RegisterEvent event) {
		event.register(Registries.ARMOR_MATERIAL, registerHelper -> {
			ArmorMaterial armorMaterial = new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 2);
				map.put(ArmorItem.Type.LEGGINGS, 5);
				map.put(ArmorItem.Type.CHESTPLATE, 6);
				map.put(ArmorItem.Type.HELMET, 2);
				map.put(ArmorItem.Type.BODY, 6);
			}), 9, BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY),
					() -> Ingredient.of(new ItemStack(ThorniteExpansionModItems.THORNITE_GEM.get()), new ItemStack(Items.GOLD_INGOT), new ItemStack(ThorniteExpansionModItems.GOLDEN_GEM.get())),
					List.of(new ArmorMaterial.Layer(ResourceLocation.parse("thornite_expansion:golden"))), 0f, 0f);
			registerHelper.register(ResourceLocation.parse("thornite_expansion:golden_thornite_armor"), armorMaterial);
			ARMOR_MATERIAL = BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(armorMaterial);
		});
	}

	public GoldenThorniteArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends GoldenThorniteArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(23)));
		}

		@Override
		public boolean makesPiglinsNeutral(@NotNull ItemStack itemstack, @NotNull LivingEntity entity) {
			return true;
		}
	}

	public static class Chestplate extends GoldenThorniteArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(23)));
		}

		@Override
		public boolean makesPiglinsNeutral(@NotNull ItemStack itemstack, @NotNull LivingEntity entity) {
			return true;
		}
	}

	public static class Leggings extends GoldenThorniteArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(23)));
		}

		@Override
		public boolean makesPiglinsNeutral(@NotNull ItemStack itemstack, @NotNull LivingEntity entity) {
			return true;
		}
	}

	public static class Boots extends GoldenThorniteArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(23)));
		}

		@Override
		public boolean makesPiglinsNeutral(@NotNull ItemStack itemstack, @NotNull LivingEntity entity) {
			return true;
		}
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext level, List<Component> tooltip, @NotNull TooltipFlag flag) {
		tooltip.add(Component.literal("Blessed by Gaia").withStyle(ChatFormatting.DARK_GREEN));
		super.appendHoverText(stack, level, tooltip, flag);
	}
}
