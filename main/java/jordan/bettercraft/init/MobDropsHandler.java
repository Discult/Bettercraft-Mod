package jordan.bettercraft.init;

import java.util.Random;

import net.minecraft.entity.boss.EntityDragonPart;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDropsHandler
{
	
	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event)
	{
		if(event.getEntity() instanceof EntityDragonPart)
		{
			Random rand = new Random();
			ItemStack stack = new ItemStack(BetterItems.DRAGON_SCALE, 32);
			event.getDrops().add(new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack));
		}
	}
}
