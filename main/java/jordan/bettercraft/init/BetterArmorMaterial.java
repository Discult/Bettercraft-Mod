package jordan.bettercraft.init;

import jordan.bettercraft.main.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class BetterArmorMaterial 
{
	public static ArmorMaterial STEEL = EnumHelper.addArmorMaterial("STEEL", "bettercraft:steel", 20, new int[] { 2, 7, 4, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
}
