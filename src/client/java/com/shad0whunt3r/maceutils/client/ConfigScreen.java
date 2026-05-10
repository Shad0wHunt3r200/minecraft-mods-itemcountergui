package com.shad0whunt3r.maceutils.client;

import dev.isxander.yacl3.api.YetAnotherConfigLib;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class ConfigScreen extends Screen {
    private final Screen parent;

    public ConfigScreen(Screen parent) {
        super(Component.literal("Mace Utils Config"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        var config = YetAnotherConfigLib.createBuilder().title(Component.literal("Mace Utils"));

    }
}
