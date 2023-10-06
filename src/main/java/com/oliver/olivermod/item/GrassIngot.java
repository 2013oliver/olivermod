package com.oliver.olivermod.item;

import net.minecraft.item.Item;
import com.oliver.olivermod.OliverMod;

public class GrassIngot extends Item {
    public GrassIngot() {
        this.setRegistryName("grassingot");
        this.setUnlocalizedName(OliverMod.MOD_ID + ".GrassIngot");
        this.setMaxStackSize(64);
    }
}
