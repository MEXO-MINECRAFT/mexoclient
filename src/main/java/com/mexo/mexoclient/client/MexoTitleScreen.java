package com.mexo.mexoclient.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MexoTitleScreen extends Screen {
    private static final Identifier LOGO = new Identifier("mexoclient", "textures/gui/logo.png");
    private static final Identifier BG   = new Identifier("mexoclient", "textures/gui/background.png");

    public MexoTitleScreen() {
        super(Text.literal("Mexo Client"));
    }

    @Override
    protected void init() {
        int midX = this.width / 2;
        int midY = this.height / 2;

        this.addDrawableChild(new ButtonWidget(midX - 100, midY - 10, 200, 20, Text.literal("Singleplayer"), btn -> {
            this.client.setScreen(new SelectWorldScreen(this));
        }));
        this.addDrawableChild(new ButtonWidget(midX - 100, midY + 15, 200, 20, Text.literal("Multiplayer"), btn -> {
            this.client.setScreen(new net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen(this));
        }));
        this.addDrawableChild(new ButtonWidget(midX - 100, midY + 40, 200, 20, Text.literal("Beenden"), btn -> {
            this.client.scheduleStop();
        }));
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        // Pink gradient background
        fillGradient(matrices, 0, 0, this.width, this.height, 0xFFF3C0E0, 0xFFFF8FBF);

        // Optional background image (if provided in assets)
        RenderSystem.setShaderTexture(0, BG);
        drawTexture(matrices, 0, 0, 0, 0, this.width, this.height, this.width, this.height);

        // Logo (or text if logo is missing)
        int logoWidth = 300;
        int logoHeight = 80;
        int x = (this.width - logoWidth) / 2;
        int y = 30;
        RenderSystem.setShaderTexture(0, LOGO);
        drawTexture(matrices, x, y, 0, 0, logoWidth, logoHeight, logoWidth, logoHeight);

        drawCenteredText(matrices, this.textRenderer, Text.literal("MEXO CLIENT"), this.width / 2, y + logoHeight + 6, 0xFFFFFF);

        super.render(matrices, mouseX, mouseY, delta);
    }
}
