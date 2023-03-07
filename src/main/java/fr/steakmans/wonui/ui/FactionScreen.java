package fr.steakmans.wonui.ui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import fr.steakmans.wonui.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.gui.GuiUtils;

public class FactionScreen extends Screen {

    public static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation(Main.MODID, "textures/ui/background.png");


    private ImageButton closeBtn;
    private ImageButton homeBtn;
    private ImageButton bankBtn;
    private ImageButton axeBtn;
    private ImageButton trophyBtn;
    private ImageButton rocketBtn;
    private ImageButton settingsBtn;


    public FactionScreen() {
        super(new TextComponent("Faction"));
    }

    @Override
    protected void init() {
        super.init();
        closeBtn = new ImageButton(10 * width / 1721, 0, 90 * width / 1721, 90 * width / 1721, 0, 0, 0, new ResourceLocation(Main.MODID, "textures/ui/letter-x.png"), 90 * width / 1721, 90 * width / 1721, btn -> {
            minecraft.setScreen(null);
        });
        homeBtn = new ImageButton(10 * width / 1721, 90 * width / 1721 + 340/6* width / 1721, 90 * width / 1721, 90 * width / 1721, 0, 0, 0, new ResourceLocation(Main.MODID, "textures/ui/home.png"), 90 * width / 1721, 90 * width / 1721, btn -> {

        });
        bankBtn = new ImageButton(10 * width / 1721, 2 * (90 * width / 1721 + 340/6 * width / 1721), 90 * width / 1721, 90 * width / 1721, 0, 0, 0, new ResourceLocation(Main.MODID, "textures/ui/bank.png"), 90 * width / 1721, 90 * width / 1721, btn -> {

        });
        axeBtn = new ImageButton(10 * width / 1721, 3 * (90 * width / 1721 + 340/6* width / 1721), 90 * width / 1721, 90 * width / 1721, 0, 0, 0, new ResourceLocation(Main.MODID, "textures/ui/axe.png"), 90 * width / 1721, 90 * width / 1721, btn -> {

        });
        trophyBtn = new ImageButton(10 * width / 1721, 4 * (90 * width / 1721 + 340/6* width / 1721), 90 * width / 1721, 90 * width / 1721, 0, 0, 0, new ResourceLocation(Main.MODID, "textures/ui/trophy.png"), 90 * width / 1721, 90 * width / 1721, btn -> {

        });
        rocketBtn = new ImageButton(10 * width / 1721, 5 * (90 * width / 1721 + 340/6* width / 1721), 90 * width / 1721, 90 * width / 1721, 0, 0, 0, new ResourceLocation(Main.MODID, "textures/ui/start-up.png"), 90 * width / 1721, 90 * width / 1721, btn -> {

        });
        settingsBtn = new ImageButton(10 * width / 1721, 6 * (90 * width / 1721 + 340/6* width / 1721), 90 * width / 1721, 90 * width / 1721, 0, 0, 0, new ResourceLocation(Main.MODID, "textures/ui/settings.png"), 90 * width / 1721, 90 * width / 1721, btn -> {

        });
        addRenderableWidget(closeBtn);
        addRenderableWidget(homeBtn);
        addRenderableWidget(bankBtn);
        addRenderableWidget(axeBtn);
        addRenderableWidget(trophyBtn);
        addRenderableWidget(rocketBtn);
        addRenderableWidget(settingsBtn);
    }

    @Override
    public void render(PoseStack stack, int p_96563_, int p_96564_, float p_96565_) {
        renderBackground(stack);
        super.render(stack, p_96563_, p_96564_, p_96565_);
    }

    @Override
    public void renderBackground(PoseStack stack) {
        super.renderBackground(stack);
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.setShaderTexture(0, BACKGROUND_TEXTURE);
        blit(stack, 0, 0, 0, 0, width, height, width, height);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
