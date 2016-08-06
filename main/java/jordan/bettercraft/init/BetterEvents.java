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
