package com.shad0whunt3r.maceutils.client;

import net.minecraft.client.Minecraft;
import net.minecraft.world.item.Item;

public class ItemCounter {
    public static int countItems(Item item) {
        var player = Minecraft.getInstance().player; // gets the player object
        int count = 0;

        if (player == null) {
            return 0;
        }

        for (int i = 0; i < player.getInventory().getContainerSize() /* gets the size of the inventory */; i++) {
            var currentItem = player.getInventory().getItem(i);

            if (currentItem.is(item)) {
                count += currentItem.getCount();
            }
        }

        return count;
    }

    public static int getDurability(Item item) {
        var player = Minecraft.getInstance().player; // gets the player object
        int durability = 0;

        if (player == null) {
            return 0;
        }

        for (int i = 0; i < player.getInventory().getContainerSize() /* gets the size of the inventory */; i++) {
            var currentItem = player.getInventory().getItem(i);

            if (currentItem.is(item)) {
                durability = currentItem.getMaxDamage() - currentItem.getDamageValue();
            }
        }

        return durability;
    }
}
