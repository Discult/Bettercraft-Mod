package jordan.bettercraft.proxy;

import jordan.bettercraft.init.BetterArmor;
import jordan.bettercraft.init.BetterBlocks;
import jordan.bettercraft.init.BetterCrops;
import jordan.bettercraft.init.BetterFoods;
import jordan.bettercraft.init.BetterItems;
import jordan.bettercraft.init.BetterSeeds;
import jordan.bettercraft.init.BetterSoundEvents;
import jordan.bettercraft.init.BetterTools;
import jordan.bettercraft.init.BetterWeapons;
import jordan.bettercraft.init.BetterEvents;
import jordan.bettercraft.init.MobDropsHandler;
import net.minecraft.item.Item;
import net.minecraft.world.gen.structure.StructureStrongholdPieces.ChestCorridor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event)
	{
		BetterItems.init();
		BetterBlocks.init();
		BetterTools.init();
		BetterWeapons.init();
		BetterCrops.init();
		BetterSeeds.init();
		BetterFoods.init();
		BetterArmor.init();
		BetterSoundEvents.registerSounds();
		MinecraftForge.EVENT_BUS.register(new BetterEvents());
		MinecraftForge.EVENT_BUS.register((Object)new MobDropsHandler());
		
		
		
	}
	
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
