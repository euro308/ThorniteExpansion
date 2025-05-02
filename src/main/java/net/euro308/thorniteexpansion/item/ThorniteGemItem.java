
package net.euro308.thorniteexpansion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ThorniteGemItem extends Item {
	public ThorniteGemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
