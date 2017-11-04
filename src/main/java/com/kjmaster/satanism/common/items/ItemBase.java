package com.kjmaster.satanism.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String name, CreativeTabs tab) { this(name, tab, 64); }

    public ItemBase(String name, CreativeTabs tab, int stackSize) {
        this(name, tab, stackSize, false);
    }

    public ItemBase(String name, CreativeTabs tab, int stackSize, Boolean hasSubtypes) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setHasSubtypes(hasSubtypes);
        setCreativeTab(tab);
        setMaxStackSize(stackSize);
    }
}
