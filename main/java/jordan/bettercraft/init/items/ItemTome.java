package jordan.bettercraft.init.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
public class ItemTome extends Item 
	{
		public ItemTome()
		{
			maxStackSize = 1;
			setMaxDamage(15);
		}
}
