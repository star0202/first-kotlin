package io.github.star0202.firstkotlin

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory


@Suppress("UNUSED")
object FirstKotlin : ModInitializer {
    private const val MOD_ID = "firstkotlin"
    private val LOGGER = LoggerFactory.getLogger(MOD_ID)
    override fun onInitialize() {
        LOGGER.info("Example mod has been initialized.")
    }
}