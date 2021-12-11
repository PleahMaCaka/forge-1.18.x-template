package com.pleahmacaka.examplemod.common.modinit

import com.pleahmacaka.examplemod.ExampleMod
import com.pleahmacaka.examplemod.common.blocks.ExampleBlock
import net.minecraft.world.level.block.Block
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries

object BlockInit {

    private val BLOCKS: DeferredRegister<Block> = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID)

    fun register(bus: IEventBus) { BLOCKS.register(bus) }

    // Block
    val EXAMPLE_BLOCK = BLOCKS.register<Block>("example_block") { ExampleBlock }!!
}