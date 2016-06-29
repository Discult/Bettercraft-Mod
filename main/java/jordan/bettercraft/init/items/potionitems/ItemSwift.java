package jordan.bettercraft.init.items.potionitems;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class ItemSwift extends Item 
{
	public ItemSwift()
	{
		maxStackSize = 1;
		setMaxDamage(9);
	}
	
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand, PlayerInteractEvent event) 
	{
		
		
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("speed"), 200));
		//worldIn.createExplosion(playerIn, playerIn.posX, playerIn.posY, playerIn.posZ, 4.0F, true);
		
		itemStackIn.damageItem(1, playerIn);
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
	}
}
