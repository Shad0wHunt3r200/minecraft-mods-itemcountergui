package com.shad0whunt3r.maceutils.client;

import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class HUDOverlay {
    public static void render(GuiGraphics graphics, DeltaTracker tickDelta) {
        if (!ModConfig.INSTANCE.enabled) return;

        int x = 5;
        int y = 5;

        drawItem(graphics, Items.WIND_CHARGE, ItemCounter.countItems(Items.WIND_CHARGE), x, y);
        y += 20;

        drawItem(graphics, Items.ENDER_PEARL, ItemCounter.countItems(Items.ENDER_PEARL), x, y);
        y += 20;

        drawItem(graphics, Items.ELYTRA, ItemCounter.getDurability(Items.ELYTRA), x, y);
        y += 20;
    }

    private static void drawItem(GuiGraphics graphics, Item item, int count, int x, int y) {
        if (count == 0) return;

        var itemStack = new ItemStack(item);

        graphics.renderItem(itemStack, x, y);
        graphics.drawString(Minecraft.getInstance().font, String.valueOf(count), x + 18, y + 5, ModConfig.INSTANCE.textColor);
    }
}

