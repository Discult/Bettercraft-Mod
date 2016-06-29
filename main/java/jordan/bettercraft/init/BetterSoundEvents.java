package jordan.bettercraft.init;

import jordan.bettercraft.main.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BetterSoundEvents 
{
	public static SoundEvent MUMMY_AMBIENT;
	
	
	public static void registerSounds()
	{
		MUMMY_AMBIENT = registerSound("mummy.ambient");
	}
	
	private static SoundEvent registerSound(String soundName)
	{
		final ResourceLocation soundID = new ResourceLocation(Reference.MODID, soundName);
		return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
	}
}

