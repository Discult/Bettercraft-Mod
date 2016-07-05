package jordan.bettercraft.init.items.potionitems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemJump extends Item 
{
	public  ItemJump()
	{
		maxStackSize = 1;
		setMaxDamage(9);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) 
	{
		
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("jump_boost"), 600, 2));
		
		itemStackIn.damageItem(1, playerIn);
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
	}
}
