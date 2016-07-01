package jordan.bettercraft.init;

import java.util.Collection;
import java.util.Random;
import java.util.function.Consumer;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BetterEvents {

	@SubscribeEvent
	public void onEventRightClickBlock(RightClickBlock event){ 
		
		ItemStack stack = new ItemStack(BetterItems.TOME);
		
		
	    if(event.getItemStack() != null && event.getWorld().getBlockState(event.getPos()).getBlock() != null){ 
	      if(event.getWorld().getBlockState(event.getPos()).getBlock().equals(BetterBlocks.ALTAR) 
	          && event.getItemStack().getItem().equals(Items.SUGAR ) && event.getEntityPlayer().inventory.hasItemStack(new ItemStack(BetterItems.TOME))){ 
	        event.getEntityPlayer().inventory.clearMatchingItems(Items.SUGAR, 0, 1, null); 
	        event.getEntityPlayer().inventory.addItemStackToInventory(new ItemStack(BetterItems.SWIFT_ITEM)); 
	      } 
	    } 
	}
}

