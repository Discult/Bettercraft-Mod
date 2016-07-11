package jordan.bettercraft.init.blocks;

import java.util.ArrayList;

import jordan.bettercraft.init.BetterTabs;
import jordan.bettercraft.init.tileentitys.AltarTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Altar extends Block implements ITileEntityProvider
{
	  public ArrayList<ItemStack> inventory = new ArrayList<ItemStack>();
	public Altar() 
	{
		super(Material.ROCK);
		setRegistryName("altar");
		setUnlocalizedName("altar");
		GameRegistry.registerTileEntity(AltarTileEntity.class, "alter_tile_entity");
		setCreativeTab(BetterTabs.tabBetterBuildingBlocks);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		return new AltarTileEntity();
	}
	/////////////TO add when created Model\\\\\\\\\\\\\\\\\\\\\\\\
	
	
	// @Override
	///    @SideOnly(Side.CLIENT)
	//    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess worldIn, BlockPos pos, EnumFacing side) 
	// {
	 //       return false;
	 //   }
	 
	// @Override
	//    public boolean isBlockNormalCube(IBlockState blockState) 
	///// {
	//        return false;
	 //   }

	   // @Override
	  //  public boolean isOpaqueCube(IBlockState blockState) 
	   // {
	   //     return false;
	   // }
	
	//////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	    
	    private AltarTileEntity getTE(World world, BlockPos pos) {
	        return (AltarTileEntity) world.getTileEntity(pos);
	    }
	    
	    
	    
	    
	    
	    
	  
	    @Override
	    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand,
				ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
			if (heldItem == null) {
				if (inventory.size() > 0) {
					if (!world.isRemote) {
						world.spawnEntityInWorld(new EntityItem(world, pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5,
								inventory.remove(inventory.size() - 1)));
					} else {
						inventory.remove(inventory.size() - 1);
					}
				
					return true;
				}
			
			}
			else {
				ItemStack oneItem = new ItemStack(heldItem.getItem(),1,heldItem.getItemDamage());
				if (heldItem.hasTagCompound()){
					oneItem.setTagCompound(heldItem.getTagCompound());
				}
				inventory.add(oneItem);
				heldItem.stackSize --;
				return true;
			}
		

	return false;
	}
		
	}

