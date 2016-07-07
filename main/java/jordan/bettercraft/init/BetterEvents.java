package jordan.bettercraft.init;

import java.util.Collection;
import java.util.Random;
import java.util.function.Consumer;

import jordan.bettercraft.main.Reference;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickItem;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class BetterEvents {
	int i = 0;

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
				event.getWorld().spawnParticle(EnumParticleTypes.EXPLOSION_HUGE, event.getPos().getX(),
						event.getPos().getY(), event.getPos().getZ(), 0, 0, 0, null);
				event.getEntityPlayer().motionX = event.getEntityPlayer().getLookVec().xCoord;
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
				event.getWorld().spawnParticle(EnumParticleTypes.EXPLOSION_HUGE, event.getPos().getX(),
						event.getPos().getY(), event.getPos().getZ(), 0, 0, 0, null);
				// might do a teleport block
				// event.getEntityPlayer().attemptTeleport(x, y, z)

			}

		}

	}

	@SubscribeEvent
	public void FRingCrafting(RightClickBlock event) {
		if (event.getItemStack() != null && event.getWorld().getBlockState(event.getPos()).getBlock() != null) {
			if (event.getWorld().getBlockState(event.getPos()).getBlock().equals(BetterBlocks.ALTAR)
					&& event.getItemStack().getItem().equals(Items.ELYTRA)
					&& event.getEntityPlayer().inventory.hasItemStack(new ItemStack(Items.NETHER_STAR))
					&& event.getEntityPlayer().inventory.hasItemStack(new ItemStack(BetterItems.RING))) {
				event.getEntityPlayer().inventory.clearMatchingItems(Items.ELYTRA, 0, 1, null);
				event.getEntityPlayer().inventory.clearMatchingItems(Items.NETHER_STAR, 0, 1, null);
				event.getEntityPlayer().inventory.clearMatchingItems(BetterItems.RING, 0, 1, null);
				event.getEntityPlayer().inventory.addItemStackToInventory(new ItemStack(BetterItems.FLYING_RING));
				event.getWorld().spawnParticle(EnumParticleTypes.EXPLOSION_HUGE, event.getPos().getX(),
						event.getPos().getY(), event.getPos().getZ(), 0, 0, 0, null);

			}

		}
	}

	// end the altar crafting
	@SubscribeEvent
	public void test(PlayerInteractEvent.RightClickItem event) {
		BlockPos Raypos = Reference.getRayTrace(event.getWorld(), event.getEntityPlayer(), 10);
		if (event.getItemStack().getItem().equals(BetterItems.DRAGON_SCALE)) {
			event.getEntityPlayer().attemptTeleport(Raypos.getX(), Raypos.getY()+1, Raypos.getZ());
		}
	}

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
