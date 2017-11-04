package com.kjmaster.satanism.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBase extends Block {

    public BlockBase(String name, Material material, CreativeTabs tab, float hardness, float resistance,
                     String tool, int harvest) {
        this(name, material, tab, hardness, resistance);
        setHarvestLevel(tool, harvest);
    }

    public BlockBase(String name, Material material, CreativeTabs tab, float hardness, float resistance) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        setCreativeTab(tab);
    }
}
