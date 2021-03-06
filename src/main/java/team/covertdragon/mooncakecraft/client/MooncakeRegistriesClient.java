/*
 * Copyright (c) 2017 3TUSK, Seraph-JACK, yesterday17, et al.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package team.covertdragon.mooncakecraft.client;

import team.covertdragon.mooncakecraft.MooncakeConstants;
import team.covertdragon.mooncakecraft.item.MooncakeFillingType;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(modid = MooncakeConstants.MODID, value = Side.CLIENT)
public class MooncakeRegistriesClient {

    @SubscribeEvent
    public static void onModelRegistry(ModelRegistryEvent event) {
        //Registries for mooncakes
        ModelResourceLocation[] modelLocationArray = new ModelResourceLocation[MooncakeFillingType.VALUES.length];
        for (int i = 0; i < MooncakeFillingType.VALUES.length; i++) {
            modelLocationArray[i] = new ModelResourceLocation("mooncakecraft:mooncake_" + MooncakeFillingType.getByOrdinal(i).getLocalizationKey(), "inventory");
        }
        ModelBakery.registerItemVariants(MooncakeConstants.MOONCAKE_ITEM, modelLocationArray);
        ModelLoader.setCustomMeshDefinition(MooncakeConstants.MOONCAKE_ITEM, itemStack -> new ModelResourceLocation("mooncakecraft:mooncake_" + MooncakeFillingType.getByOrdinal(itemStack.getMetadata()).getLocalizationKey(), "inventory"));

        //Registries for mooncake fillings
        ModelResourceLocation[] modelLocationArray1 = new ModelResourceLocation[MooncakeFillingType.VALUES.length];
        for (int i = 0; i < MooncakeFillingType.VALUES.length; i++) {
            modelLocationArray1[i] = new ModelResourceLocation("mooncakecraft:mooncake_filling_" + MooncakeFillingType.getByOrdinal(i).getLocalizationKey(), "inventory");
        }
        ModelBakery.registerItemVariants(MooncakeConstants.MOONCAKE_FILLING, modelLocationArray1);
        ModelLoader.setCustomMeshDefinition(MooncakeConstants.MOONCAKE_FILLING, itemStack -> new ModelResourceLocation("mooncakecraft:mooncake_filling_" + MooncakeFillingType.getByOrdinal(itemStack.getMetadata()).getLocalizationKey(), "inventory"));

        //Registries for raw mooncakes
        ModelResourceLocation[] modelLocationArray2 = new ModelResourceLocation[MooncakeFillingType.VALUES.length];
        for (int i = 0; i < MooncakeFillingType.VALUES.length; i++) {
            modelLocationArray2[i] = new ModelResourceLocation("mooncakecraft:mooncake_raw_" + MooncakeFillingType.getByOrdinal(i).getLocalizationKey(), "inventory");
        }
        ModelBakery.registerItemVariants(MooncakeConstants.RAW_MOONCAKE_ITEM, modelLocationArray2);
        ModelLoader.setCustomMeshDefinition(MooncakeConstants.RAW_MOONCAKE_ITEM, itemStack -> new ModelResourceLocation("mooncakecraft:mooncake_raw_" + MooncakeFillingType.getByOrdinal(itemStack.getMetadata()).getLocalizationKey(), "inventory"));

        //Registries for unshaped mooncakes
        ModelResourceLocation[] modelLocationArray3 = new ModelResourceLocation[MooncakeFillingType.VALUES.length];
        for (int i = 0; i < MooncakeFillingType.VALUES.length; i++) {
            modelLocationArray3[i] = new ModelResourceLocation("mooncakecraft:mooncake_unshaped_" + MooncakeFillingType.getByOrdinal(i).getLocalizationKey(), "inventory");
        }
        ModelBakery.registerItemVariants(MooncakeConstants.UNSHAPED_MOONCAKE_ITEM, modelLocationArray3);
        ModelLoader.setCustomMeshDefinition(MooncakeConstants.UNSHAPED_MOONCAKE_ITEM, itemStack -> new ModelResourceLocation("mooncakecraft:mooncake_unshaped_" + MooncakeFillingType.getByOrdinal(itemStack.getMetadata()).getLocalizationKey(), "inventory"));

        //Registries for other things
        ModelLoader.setCustomModelResourceLocation(MooncakeConstants.WHEAT_FLOUR, 0, new ModelResourceLocation("mooncakecraft:wheat_flour", "inventory"));
        ModelLoader.setCustomModelResourceLocation(MooncakeConstants.SESAME_SEED, 0, new ModelResourceLocation("mooncakecraft:sesame_seeds", "inventory"));
        ModelLoader.setCustomModelResourceLocation(MooncakeConstants.PEANUT_SEED, 0, new ModelResourceLocation("mooncakecraft:peanut_seeds", "inventory"));
        ModelLoader.setCustomModelResourceLocation(MooncakeConstants.LOTUS_SEED, 0, new ModelResourceLocation("mooncakecraft:lotus_seeds", "inventory"));
        ModelLoader.setCustomModelResourceLocation(MooncakeConstants.JUJUBE, 0, new ModelResourceLocation("mooncakecraft:jujube", "inventory"));

        //Registries for mooncake mold
        ModelLoader.setCustomModelResourceLocation(MooncakeConstants.MOONCAKE_MOLD, 0, new ModelResourceLocation("mooncakecraft:mooncake_mold_empty", "inventory"));
        ModelLoader.setCustomModelResourceLocation(MooncakeConstants.MOONCAKE_MOLD, 1, new ModelResourceLocation("mooncakecraft:mooncake_mold_full", "inventory"));

        //ICON
        ModelLoader.setCustomModelResourceLocation(MooncakeConstants.ICON, 0, new ModelResourceLocation("mooncakecraft:icon", "inventory"));
    }
}
