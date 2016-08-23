package jordan.bettercraft.init.items.tools;

import jordan.bettercraft.init.BetterTabs;
import net.minecraft.item.ItemAxe;

public class BetterItemAxe extends ItemAxe
{

	public BetterItemAxe(ToolMaterial material, String unlocalizedName) 
	{
		super(material, 8.0F, -3.0F);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(unlocalizedName);
		setCreativeTab(BetterTabs.tabBetterTools);
	}
}
