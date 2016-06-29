package jordan.bettercraft.init.mobs.renderers;

import java.util.List;

import com.google.common.collect.Lists;

import jordan.bettercraft.init.mobs.entitys.EntityMummy;
import jordan.bettercraft.init.mobs.entitys.EntityZebra;
import jordan.bettercraft.init.mobs.models.ModelMummy;
import jordan.bettercraft.init.mobs.models.ModelZebra;
import jordan.bettercraft.main.Bettercraft;
import jordan.bettercraft.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.model.ModelZombieVillager;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.renderer.entity.layers.LayerCustomHead;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.layers.LayerVillagerArmor;
import net.minecraft.client.renderer.texture.LayeredTexture;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraft.entity.passive.HorseType;
import net.minecraft.util.ResourceLocation;

public class RenderMummy extends RenderBiped<EntityMummy>
{
    private static final ResourceLocation Mummy_Texture = new ResourceLocation(Reference.MODID, "textures/entity/mummy/mummy.png");
    
    private final ModelBiped defaultModel;
    private final List<LayerRenderer<EntityMummy>> villagerLayers;
    private final List<LayerRenderer<EntityMummy>> defaultLayers;

    public RenderMummy(RenderManager renderManagerIn)
    {
        super(renderManagerIn, new ModelMummy(), 0.5F, 1.0F);
        LayerRenderer<?> layerrenderer = (LayerRenderer)this.layerRenderers.get(0);
        this.defaultModel = this.modelBipedMain;
        this.addLayer(new LayerHeldItem(this));
        LayerBipedArmor layerbipedarmor = new LayerBipedArmor(this)
        {
            protected void initArmor()
            {
                this.modelLeggings = new ModelMummy(0.5F, true);
                this.modelArmor = new ModelMummy(1.0F, true);
            }
        };
        this.addLayer(layerbipedarmor);
        this.defaultLayers = Lists.newArrayList(this.layerRenderers);

        if (layerrenderer instanceof LayerCustomHead)
        {
            this.removeLayer(layerrenderer);
        }

        this.removeLayer(layerbipedarmor);
        this.addLayer(new LayerVillagerArmor(this));
        this.villagerLayers = Lists.newArrayList(this.layerRenderers);
    }

    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(EntityMummy entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        this.swapArmor(entity);
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityMummy entity)
    {
        return Mummy_Texture;
    }

    private void swapArmor(EntityMummy zombie)
    {
        if (zombie.isVillager())
        {
            this.layerRenderers = this.villagerLayers;
        }
        else
        {
            this.mainModel = this.defaultModel;
            this.layerRenderers = this.defaultLayers;
        }

        this.modelBipedMain = (ModelBiped)this.mainModel;
    }

    protected void rotateCorpse(EntityMummy entityLiving, float p_77043_2_, float p_77043_3_, float partialTicks)
    {
        if (entityLiving.isConverting())
        {
            p_77043_3_ += (float)(Math.cos((double)entityLiving.ticksExisted * 3.25D) * Math.PI * 0.25D);
        }

        super.rotateCorpse(entityLiving, p_77043_2_, p_77043_3_, partialTicks);
    }
}