package com.blargsworkshop.common;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("blargsworkshop")
public class BlargsWorkshop
{
    // Directly reference a log4j logger.
//    private static final Logger LOGGER = LogManager.getLogger();

    public BlargsWorkshop() {}
	
	public static final ItemGroup TAB = new ItemGroup("blargsTab") {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(Blocks.SMITHING_TABLE);
		}
	};
}
