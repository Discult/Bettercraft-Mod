package jordan.bettercraft.init.items.tools;

import net.minecraft.item.Item.ToolMaterial;
import jordan.bettercraft.init.BetterTabs;
import net.minecraft.item.ItemSpade;

public class BetterItemShovel extends ItemSpade 
{

	public BetterItemShovel(ToolMaterial material) 
	{
		super(material);
		this.setCreativeTab(BetterTabs.tabBetterTools);
	}

}
