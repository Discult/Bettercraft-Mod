package jordan.bettercraft.init.items.weapons;

import jordan.bettercraft.init.BetterTabs;
import net.minecraft.item.ItemSword;

public class BetterSwords extends ItemSword
{

	public BetterSwords(ToolMaterial material) 
	{
		super(material);
		setCreativeTab(BetterTabs.tabBetterCombat);
	}
	
}
