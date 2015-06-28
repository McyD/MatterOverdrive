package com.MO.MatterOverdrive.api.inventory.starmap;

import com.MO.MatterOverdrive.starmap.data.Planet;
import net.minecraft.item.ItemStack;

/**
 * Created by Simeon on 6/24/2015.
 */
public interface IBuildable
{
    boolean canBuild(ItemStack building,Planet planet);
    int maxBuildTime(ItemStack building, Planet planet);
    int getBuildTime(ItemStack building);
    void setBuildTime(ItemStack building,int buildTime);
}