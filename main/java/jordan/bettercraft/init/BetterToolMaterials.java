package jordan.bettercraft.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class BetterToolMaterials 
{
	public static ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2, 1000, 7.0F, 2.5F, 12);
	public static ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 2, 1000, 7.0F, 2.5F, 12);
	public static ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 2, 800, 13.0F, 1000000.0F, 8);//3.5
	public static ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 2, 300, 6.0F, 2.0F, 10);
}
