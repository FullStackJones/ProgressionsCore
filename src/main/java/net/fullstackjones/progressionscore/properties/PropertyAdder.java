package net.fullstackjones.progressionscore.properties;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class PropertyAdder {

    private static void addCustomProperty(Block block) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.ofFullCopy(block);
        for (int i = 0; i < 10; i++) {
            block.defaultBlockState().setValue(StatProperties.LEVELS[i], 0);
        }
    }

    private static void addCustomProperty(Item item) {
        Item.Properties properties = new Item.Properties();
        // Assuming you have a way to set properties for items, as items don't have states like blocks
        // This is a placeholder to show where you would add your custom properties
        // item.setProperty(StatProperties.AGILITY_LEVEL, 0);
        // item.setProperty(StatProperties.ARMOUR_LEVEL, 0);
        // item.setProperty(StatProperties.BUILDING_LEVEL, 0);
        // item.setProperty(StatProperties.COMBAT_LEVEL, 0);
        // item.setProperty(StatProperties.FARMING_LEVEL, 0);
        // item.setProperty(StatProperties.MAGIC_LEVEL, 0);
        // item.setProperty(StatProperties.MINING_LEVEL, 0);
        // item.setProperty(StatProperties.MECHANICS_LEVEL, 0);
        // item.setProperty(StatProperties.GATHERING_LEVEL, 0);
        // item.setProperty(StatProperties.CRAFTING_LEVEL, 0);
    }
}
