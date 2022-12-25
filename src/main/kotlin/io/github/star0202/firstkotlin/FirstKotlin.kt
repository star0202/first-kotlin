package io.github.star0202.firstkotlin

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory


object FirstKotlin : ModInitializer {
    private val LOGGER = LoggerFactory.getLogger(Constants.MOD_NAME)
    override fun onInitialize() {
        LOGGER.info("${Constants.MOD_NAME}(${Constants.MOD_ID}) loaded")
    }
}