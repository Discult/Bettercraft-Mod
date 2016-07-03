package jordan.bettercraft.init;

import java.util.Collection;
import java.util.Random;
import java.util.function.Consumer;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickItem;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class BetterEvents {

	// start basic altar crafting method
	@SubscribeEvent
	public void speedCrafting(RightClickBlock event) {
		if (event.getItemStack() != null && event.getWorld().getBlockState(event.getPos()).getBlock() != null) {
			if (event.getWorld().getBlockState(event.getPos()).getBlock().equals(BetterBlocks.ALTAR)
					&& event.getItemStack().getItem().equals(Items.SUGAR)
					&& event.getEntityPlayer().inventory.hasItemStack(new ItemStack(BetterItems.CATALYST))) {
				event.getEntityPlayer().inventory.clearMatchingItems(Items.SUGAR, 0, 1, null);
				event.getEntityPlayer().inventory.clearMatchingItems(BetterItems.CATALYST, 0, 1, null);
				event.getEntityPlayer().inventory.addItemStackToInventory(new ItemStack(BetterItems.SWIFT_ITEM));
				event.getWorld().spawnParticle(EnumParticleTypes.DRAGON_BREATH, event.getPos().getX(),
						event.getPos().getY(), event.getPos().getZ(), 0, 0, 0, null);
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
	// end the altar crafting

	// this works but i can see it being really not server freindly
	@SubscribeEvent
	public void PlayerTick(PlayerTickEvent event) {
		if (event.player.isCreative()) {

		} else {
			if (event.player.inventory.hasItemStack(new ItemStack(BetterItems.FLYING_RING))) {

				event.player.capabilities.allowFlying = true;
			} else {
				event.player.capabilities.allowFlying = false;

			}

		}

	}
}
