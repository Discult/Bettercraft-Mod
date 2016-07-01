package jordan.bettercraft.init;

import java.util.Collection;
import java.util.Random;
import java.util.function.Consumer;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickItem;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BetterEvents {

	@SubscribeEvent
	public void speedCrafting(RightClickBlock event) {
		if (event.getItemStack() != null && event.getWorld().getBlockState(event.getPos()).getBlock() != null) {
			if (event.getWorld().getBlockState(event.getPos()).getBlock().equals(BetterBlocks.ALTAR)
					&& event.getItemStack().getItem().equals(Items.SUGAR)
					&& event.getEntityPlayer().inventory.hasItemStack(new ItemStack(BetterItems.CATALYST))) {
				event.getEntityPlayer().inventory.clearMatchingItems(Items.SUGAR, 0, 1, null);
				event.getEntityPlayer().inventory.clearMatchingItems(BetterItems.CATALYST, 0, 1, null);
				event.getEntityPlayer().inventory.addItemStackToInventory(new ItemStack(BetterItems.SWIFT_ITEM));

			}

		}
	}

	@SubscribeEvent
	public void catCrafting(RightClickBlock event) {
		if (event.getItemStack() != null && event.getWorld().getBlockState(event.getPos()).getBlock() != null) {
			if (event.getWorld().getBlockState(event.getPos()).getBlock().equals(BetterBlocks.ALTAR)
					&& event.getItemStack().getItem().equals(Items.NETHER_STAR)) {
				event.getEntityPlayer().inventory.clearMatchingItems(Items.NETHER_STAR, 0, 1, null);
				event.getEntityPlayer().inventory.addItemStackToInventory(new ItemStack(BetterItems.CATALYST, 10));
			}

		}

	}

	@SubscribeEvent
	public void FlightRing(RightClickItem event) {
		if (event.getItemStack() != null) {
			if (event.getEntityPlayer().capabilities.allowFlying = false)
				if (event.getItemStack().equals(new ItemStack(BetterItems.FLYING_RING))) {
					event.getEntityPlayer().capabilities.allowFlying = false;
				} else {
					event.getEntityPlayer().capabilities.allowFlying = true;
				}
		}
	}

}
