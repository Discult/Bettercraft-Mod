package jordan.bettercraft.init.mobs.renderers;

import jordan.bettercraft.init.mobs.entitys.EntityBoar;
import jordan.bettercraft.init.mobs.models.ModelBoar;
import jordan.bettercraft.main.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBoar extends RenderLiving<EntityBoar>
{
    private static final ResourceLocation PIG_TEXTURES = new ResourceLocation(Reference.MODID, "textures/entity/boar/boar.png");

    public RenderBoar(RenderManager renderManagerIn, ModelBoar modelBaseIn, float shadowSizeIn)
    {
        super(renderManagerIn, modelBaseIn, shadowSizeIn);
        this.addLayer(new LayerSaddle(this));
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityBoar entity)
    {
        return PIG_TEXTURES;
    }
    
    @SideOnly(Side.CLIENT)
    public class LayerSaddle implements LayerRenderer<EntityBoar>
    {
        private final ResourceLocation TEXTURE = new ResourceLocation("textures/entity/boar/boar.png");
        private final RenderBoar pigRenderer;
        private final ModelBoar pigModel = new ModelBoar(0.5F);

        public LayerSaddle(RenderBoar pigRendererIn)
        {
            this.pigRenderer = pigRendererIn;
        }

        public void doRenderLayer(EntityBoar entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
        {
            if (entitylivingbaseIn.getSaddled())
            {
                this.pigRenderer.bindTexture(TEXTURE);
                this.pigModel.setModelAttributes(this.pigRenderer.getMainModel());
                this.pigModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            }
        }

        public boolean shouldCombineTextures()
        {
            return false;
        }
    }
}