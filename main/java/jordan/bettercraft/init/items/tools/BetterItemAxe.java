package jordan.bettercraft.init.items.tools;

import jordan.bettercraft.init.BetterTabs;
import net.minecraft.item.ItemAxe;

public class BetterItemAxe extends ItemAxe
{

	public BetterItemAxe(ToolMaterial material) 
	{
		super(material, 8.0F, -3.0F);
		setCreativeTab(BetterTabs.tabBetterTools);
	}
}
