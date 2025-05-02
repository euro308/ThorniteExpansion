
package net.euro308.thorniteexpansion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NetheriteGemItem extends Item {
	public NetheriteGemItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
