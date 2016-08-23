package jordan.bettercraft.init.items;

import jordan.bettercraft.init.BetterTabs;
import net.minecraft.item.Item;

public class MiscItems extends Item
{
	public MiscItems(String unlocalizedName)
	{
		setUnlocalizedName(unlocalizedName);
		setCreativeTab(BetterTabs.tabBetterMiscellaneous);
		setRegistryName(unlocalizedName);
	}
}
