package com.example.addon.hud;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class Watermark extends HudElement {
    public static final HudElementInfo<Watermark> INFO = new HudElementInfo<>(Addon.HUD_GROUP, "Watermark", "Displays the Name", Watermark::new);

    public Watermark() {
        super(INFO);
    }

    @Override
    public void render(HudRenderer renderer) {
        setSize(renderer.textWidth("HeediAddon 0.1", true), renderer.textHeight(true));

        renderer.text("HeediAddon 0.1", x, y, Color.WHITE, true);
    }
}
