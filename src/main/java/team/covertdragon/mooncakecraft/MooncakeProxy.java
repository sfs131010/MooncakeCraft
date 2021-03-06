/*
 * Copyright (c) 2017 3TUSK, Seraph-JACK, yesterday17, et al.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package team.covertdragon.mooncakecraft;

import org.apache.logging.log4j.Logger;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import team.covertdragon.mooncakecraft.item.MooncakeFillingType;

public abstract class MooncakeProxy {

    public Logger logger;

    public void preInit(FMLPreInitializationEvent event) {
        this.logger = event.getModLog();
    }

    public void init(FMLInitializationEvent event) {
        for (int i = 0; i < MooncakeFillingType.VALUES.length; i++) {
            GameRegistry.addSmelting(new ItemStack(MooncakeConstants.RAW_MOONCAKE_ITEM, 1, i), new ItemStack(MooncakeConstants.MOONCAKE_ITEM, 1, i), 1.0f);
        }
        MinecraftForge.addGrassSeed(new ItemStack(MooncakeConstants.SESAME_SEED), 10);
        MinecraftForge.addGrassSeed(new ItemStack(MooncakeConstants.PEANUT_SEED), 10);
        
        OreDictionary.registerOre("foodMooncake", MooncakeConstants.MOONCAKE_ITEM);
        
        OreDictionary.registerOre("cropSesame", MooncakeConstants.SESAME_SEED);
        OreDictionary.registerOre("seedSesame", MooncakeConstants.SESAME_SEED);
        OreDictionary.registerOre("listAllseed", MooncakeConstants.SESAME_SEED);
        
        OreDictionary.registerOre("cropPeanut", MooncakeConstants.PEANUT_SEED);
        OreDictionary.registerOre("seedPeanut", MooncakeConstants.PEANUT_SEED);
        OreDictionary.registerOre("listAllnut", MooncakeConstants.PEANUT_SEED);
        OreDictionary.registerOre("listAllseed", MooncakeConstants.PEANUT_SEED);
        
        OreDictionary.registerOre("seedLotus", MooncakeConstants.LOTUS_SEED);
        OreDictionary.registerOre("listAllseed", MooncakeConstants.LOTUS_SEED);
        
        OreDictionary.registerOre("cropJujube", MooncakeConstants.JUJUBE);
        OreDictionary.registerOre("listAllfruit", MooncakeConstants.JUJUBE);
        
        OreDictionary.registerOre("foodFlour", MooncakeConstants.WHEAT_FLOUR);
        
        OreDictionary.registerOre("sugar", Items.SUGAR);
    }

    public abstract void postInit(FMLPostInitializationEvent event);
}
