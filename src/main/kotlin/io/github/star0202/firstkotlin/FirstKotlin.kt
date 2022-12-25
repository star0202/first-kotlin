package io.github.star0202.firstkotlin

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import org.slf4j.Logger
import org.slf4j.LoggerFactory


object FirstKotlin : ModInitializer {
    private val LOGGER: Logger = LoggerFactory.getLogger(Constants.MOD_NAME)
    private val FIRST_ITEM: Item = Item(FabricItemSettings())
    @Suppress("unused")
    private val FIRST_GROUP: ItemGroup = FabricItemGroupBuilder.build(
        Identifier("first", "first_group")
    ) { ItemStack(FIRST_ITEM) }

    override fun onInitialize() {
        LOGGER.info("${Constants.MOD_NAME}(Id: ${Constants.MOD_ID}) loaded")
        Registry.register(Registry.ITEM, Identifier("fmk", "starcea"), FIRST_ITEM)
    }
}