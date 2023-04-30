package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.orbit.EventHandler;

public class SprintPlus extends Module {
    public SprintPlus() {
        super(Addon.HEEDI, "SprintPlus", "Alows you to sprint automatically");
    }

    @EventHandler
    public void onTick(TickEvent.Post event) {
       if (mc.options.forwardKey.isPressed()) mc.player.setSprinting(true);
    }
}
