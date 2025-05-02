
package net.euro308.thorniteexpansion.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.crafting.Ingredient;
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
public abstract class NetheriteThorniteArmorItem extends ArmorItem implements INatureRepairable {
	public static Holder<ArmorMaterial> ARMOR_MATERIAL = null;

	@SubscribeEvent
	public static void registerArmorMaterial(RegisterEvent event) {
		event.register(Registries.ARMOR_MATERIAL, registerHelper -> {
			ArmorMaterial armorMaterial = new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 4);
				map.put(ArmorItem.Type.LEGGINGS, 7);
				map.put(ArmorItem.Type.CHESTPLATE, 9);
				map.put(ArmorItem.Type.HELMET, 4);
				map.put(ArmorItem.Type.BODY, 9);
			}), 15, DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_netherite")),
					() -> Ingredient.of(new ItemStack(ThorniteExpansionModItems.NETHERITE_GEM.get()), new ItemStack(ThorniteExpansionModItems.THORNITE_GEM.get()), new ItemStack(Items.NETHERITE_INGOT)),
					List.of(new ArmorMaterial.Layer(ResourceLocation.parse("thornite_expansion:netherite"))), 4f, 0.2f);
			registerHelper.register(ResourceLocation.parse("thornite_expansion:netherite_thornite_armor"), armorMaterial);
			ARMOR_MATERIAL = BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(armorMaterial);
		});
	}

	public NetheriteThorniteArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends NetheriteThorniteArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(55)).fireResistant());
		}
	}

	public static class Chestplate extends NetheriteThorniteArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(55)).fireResistant());
		}
	}

	public static class Leggings extends NetheriteThorniteArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(55)).fireResistant());
		}
	}

	public static class Boots extends NetheriteThorniteArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(55)).fireResistant());
		}
	}

	@Override
	public int getNatureRepairAmount() {
		return 2;
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext level, List<Component> tooltip, @NotNull TooltipFlag flag) {
		tooltip.add(Component.literal("Blessed by Gaia").withStyle(ChatFormatting.DARK_GREEN));
		super.appendHoverText(stack, level, tooltip, flag);
	}
}
