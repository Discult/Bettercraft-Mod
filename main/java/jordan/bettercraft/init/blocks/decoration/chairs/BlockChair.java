package jordan.bettercraft.init.blocks.decoration.chairs;

import java.util.List;

import jordan.bettercraft.init.BetterTabs;
import jordan.bettercraft.init.blocks.entitys.EntitySittableBlock;
import jordan.bettercraft.utils.CollisionHelper;
import jordan.bettercraft.utils.SittableUtil;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockChair extends Block 
{
public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.1, 0.0, 0.1, 0.9, 1.2, 0.9);
	
	private static final AxisAlignedBB CHAIR_BASE = new AxisAlignedBB(0.1, 0.0, 0.1, 0.9, 0.6, 0.9);
	private static final AxisAlignedBB CHAIR_BACKREST_NORTH = CollisionHelper.getBlockBounds(EnumFacing.NORTH, 0.825, 0.6, 0.1, 0.9, 1.2, 0.9);
	private static final AxisAlignedBB CHAIR_BACKREST_EAST = CollisionHelper.getBlockBounds(EnumFacing.EAST, 0.825, 0.6, 0.1, 0.9, 1.2, 0.9);
	private static final AxisAlignedBB CHAIR_BACKREST_SOUTH = CollisionHelper.getBlockBounds(EnumFacing.SOUTH, 0.825, 0.6, 0.1, 0.9, 1.2, 0.9);
	private static final AxisAlignedBB CHAIR_BACKREST_WEST = CollisionHelper.getBlockBounds(EnumFacing.WEST, 0.825, 0.6, 0.1, 0.9, 1.2, 0.9);
	
	public BlockChair(Material material, SoundType sound, String name)
	{
		super(material);
		this.setHardness(1.0F);
		this.setSoundType(sound);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		this.setCreativeTab(BetterTabs.tabBetterDecorationBlocks);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		if(SittableUtil.sitOnBlock(worldIn, pos.getX(), pos.getY(), pos.getZ(), playerIn, 7 * 0.0625))
		{
			worldIn.updateComparatorOutputLevel(pos, this);
			return true;
		}
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		return BOUNDING_BOX;
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB axisAligned, List<AxisAlignedBB> axisAlignedList, Entity collidingEntity) 
	{
		if (!(collidingEntity instanceof EntitySittableBlock))
		{
			EnumFacing facing = state.getValue(FACING);
			switch(facing) 
			{
			case NORTH:
				super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, CHAIR_BACKREST_NORTH);
				break;
			case SOUTH:
				super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, CHAIR_BACKREST_SOUTH);
				break;
			case WEST:
				super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, CHAIR_BACKREST_WEST);
				break;
			default:
				super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, CHAIR_BACKREST_EAST);
				break;
			}
			super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, CHAIR_BASE);
		}
		//TODO might need empty aabb object
	}

	@Override
	public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
		IBlockState state = super.onBlockPlaced(world, pos, facing, hitX, hitY, hitZ, meta, placer);
		state = state.withProperty(FACING, placer.getHorizontalFacing());
		return state;
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((EnumFacing) state.getValue(FACING)).getHorizontalIndex();
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] { FACING });
	}
	
	@Override
	public boolean hasComparatorInputOverride(IBlockState state) 
	{
		return true;
	}

	@Override
	public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos)
	{
		return SittableUtil.isSomeoneSitting(worldIn, pos.getX(), pos.getY(), pos.getZ()) ? 1 : 0;
	}
}
