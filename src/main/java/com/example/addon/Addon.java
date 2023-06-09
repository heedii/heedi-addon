package com.example.addon;

import com.example.addon.commands.CommandExample;
import com.example.addon.hud.Watermark;
import com.example.addon.modules.SprintPlus;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category HEEDI = new Category("HeediAddon");
    public static final HudGroup HUD_GROUP = new HudGroup("HeediAddonHud");

    @Override
    public void onInitialize() {
        LOG.info("Initializing HeediAddon...");

        // Modules
        Modules.get().add(new SprintPlus());

        // Commands
        Commands.get().add(new CommandExample());

        // HUD
        Hud.get().register(Watermark.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(HEEDI);
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }
}
