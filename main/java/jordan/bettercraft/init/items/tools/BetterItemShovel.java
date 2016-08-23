package jordan.bettercraft.init.items.tools;

import net.minecraft.item.Item.ToolMaterial;
import jordan.bettercraft.init.BetterTabs;
import net.minecraft.item.ItemSpade;

public class BetterItemShovel extends ItemSpade 
{

	public BetterItemShovel(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setCreativeTab(BetterTabs.tabBetterTools);
	}

}
