package jordan.bettercraft.init.items.misc;

import jordan.bettercraft.init.BetterTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemFlyingRing extends Item 
{
	
	
	
	public ItemFlyingRing(String name)
	{
		setCreativeTab(BetterTabs.tabBetterMiscellaneous);
		setUnlocalizedName(name);
		setRegistryName(name);;
	}

	
	
	
	
	//@Override
	//public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) 
	//{
		//playerIn.capabilities.allowFlying = true;
		
		
		//return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
	//}
}
