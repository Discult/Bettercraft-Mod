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
	 Random Random = new java.util.Random();

	@SubscribeEvent
	public void onEventRightClickBlock(RightClickBlock event){
		if(event.getItemStack() != null && event.getWorld().getBlockState(event.getPos()).getBlock() != null){
			if(event.getWorld().getBlockState(event.getPos()).getBlock().equals(BetterBlocks.ALTAR)
					&& event.getItemStack().getItem().equals(Items.SUGAR ) && event.getEntityPlayer().inventory.hasItemStack(new ItemStack(BetterItems.TOME))){
				EntityPlayer PlayerIn = event.getEntityPlayer();
				
					
				
				ItemStack stack = new ItemStack(BetterItems.TOME);
				if (event.getEntityPlayer().inventoryContainer.inventorySlots.contains(stack)){
					stack.damageItem(1, PlayerIn);
				}
				
				stack.damageItem(1, event.getEntityPlayer()); 
				event.getEntityPlayer().inventory.clearMatchingItems(Items.SUGAR, 0, 1, null);
				event.getEntityPlayer().inventory.addItemStackToInventory(new ItemStack(BetterItems.SWIFT_ITEM));
			}
		}
	}
}
