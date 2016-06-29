package jordan.bettercraft.init.mobs;

import jordan.bettercraft.init.mobs.entitys.EntityMummy;
import jordan.bettercraft.init.mobs.entitys.EntityZebra;
import jordan.bettercraft.init.mobs.models.ModelMummy;
import jordan.bettercraft.init.mobs.models.ModelZebra;
import jordan.bettercraft.init.mobs.renderers.RenderMummy;
import jordan.bettercraft.init.mobs.renderers.RenderZebra;
import jordan.bettercraft.main.Bettercraft;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MobRegistry 
{
	
	public static void register()
	{
		MobRegistry.registerEntity();
		MobRegistry.registerRender();
	}
	
	public static void registerRender()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityZebra.class, new RenderZebra(Minecraft.getMinecraft().getRenderManager(), new ModelZebra(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMummy.class, new RenderMummy(Minecraft.getMinecraft().getRenderManager()));
	}
	public static void registerEntity()
	{
		EntityRegistry.registerModEntity(EntityZebra.class, "zebra", 300, Bettercraft.instance, 64, 1, true, 0xf7f7f7, 0x202421);
		EntityRegistry.addSpawn(EntityZebra.class, 10, 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(BiomeDictionary.Type.PLAINS));
		
		EntityRegistry.registerModEntity(EntityMummy.class, "mummy", 301, Bettercraft.instance, 64, 1, true, 0xffffcc, 0xffdd99);
		EntityRegistry.addSpawn(EntityMummy.class, 10, 1, 2, EnumCreatureType.MONSTER, BiomeDictionary.getBiomesForType(BiomeDictionary.Type.SANDY));
		
	
	}
}
