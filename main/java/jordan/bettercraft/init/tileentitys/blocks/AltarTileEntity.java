package jordan.bettercraft.init.tileentitys.blocks;

import java.util.ArrayList;
import java.util.Random;

import jordan.bettercraft.init.BetterItems;
import jordan.bettercraft.main.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;

public class AltarTileEntity extends TEBase {
	public ArrayList<ItemStack> inventory = new ArrayList<ItemStack>();
	Random random = new Random();

	public AltarTileEntity() {
		super();
	}

	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		inventory = new ArrayList<ItemStack>();
		if (tag.hasKey("inventory")) {
			NBTTagList list = tag.getTagList("inventory", Constants.NBT.TAG_COMPOUND);
			for (int i = 0; i < list.tagCount(); i++) {
				inventory.add(ItemStack.loadItemStackFromNBT(list.getCompoundTagAt(i)));
			}
		}
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
		if (inventory.size() > 0) {
			NBTTagList list = new NBTTagList();
			for (int i = 0; i < inventory.size(); i++) {
				;
				if (inventory.get(i) != null) {
					list.appendTag(inventory.get(i).writeToNBT(new NBTTagCompound()));
				}
			}
			tag.setTag("inventory", list);
		}
		return tag;
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		for (int i = 0; i < inventory.size(); i++) {
			if (!world.isRemote) {
				EntityItem item = new EntityItem(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
						inventory.get(i));
				item.forceSpawn = true;
				world.spawnEntityInWorld(item);
			}
		}
		this.invalidate();
	}

	public boolean activate(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand,
			ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		
		if (player.isSneaking()){
			System.out.println("This works");
		
				System.out.println("This works");
				world.spawnEntityInWorld(new EntityItem(world, pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5,
						new ItemStack(BetterItems.FLYING_RING)));
				System.out.println("This works");
				inventory.clear();
				System.out.println("This works");
				return true;
			}
		
		if (heldItem == null && !player.isSneaking()) {
			if (inventory.size() > 0) {
				if (!world.isRemote) {
					world.spawnEntityInWorld(new EntityItem(world, pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5,
							inventory.remove(inventory.size() - 1)));
				} else {
					inventory.remove(inventory.size() - 1);
				}
				markDirty();
				this.getWorld().notifyBlockUpdate(getPos(), state, world.getBlockState(pos), 3);
				return true;
			}
		} else if (player.isSneaking() && heldItem == null) {

		} else {
			if (inventory.size() < 3) {
				ItemStack toAdd = new ItemStack(heldItem.getItem(), 1, heldItem.getItemDamage());
				if (heldItem.hasTagCompound()) {
					toAdd.setTagCompound(heldItem.getTagCompound());
				}
				inventory.add(toAdd);
				heldItem.stackSize--;
				markDirty();
				this.getWorld().notifyBlockUpdate(getPos(), state, world.getBlockState(pos), 3);
				return true;
			}
		}
		return false;
	
	
	
	
	
	
	
	
	}

}
