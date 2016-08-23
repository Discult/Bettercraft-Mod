package jordan.bettercraft.init.items;

import jordan.bettercraft.init.BetterTabs;
import net.minecraft.item.Item;

public class MaterialItems extends Item
{
	public MaterialItems(String unlocalizedName)
	{
		setUnlocalizedName(unlocalizedName);
		setRegistryName(unlocalizedName);
		setCreativeTab(BetterTabs.tabBetterMaterials);
	}
}
