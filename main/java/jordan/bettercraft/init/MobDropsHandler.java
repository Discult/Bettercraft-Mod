package jordan.bettercraft.init;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDropsHandler
{
	public static double rand;
	
	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event)
	{
		Entity e = event.getEntity();
		EntityLivingBase eL = event.getEntityLiving();
		
		if(e instanceof EntityDragon)
		{
			eL.dropItem(BetterItems.DRAGON_SCALE, 64);
		}
	}
}
