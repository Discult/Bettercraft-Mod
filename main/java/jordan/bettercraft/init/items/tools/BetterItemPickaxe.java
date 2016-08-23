package jordan.bettercraft.init.items.tools;

import jordan.bettercraft.init.BetterTabs;
import net.minecraft.item.ItemPickaxe;

public class BetterItemPickaxe extends ItemPickaxe
{

	public BetterItemPickaxe(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(BetterTabs.tabBetterTools);
	}
	
}
