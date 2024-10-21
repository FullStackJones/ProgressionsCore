package net.fullstackjones.progressionscore;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Neo's config APIs
@EventBusSubscriber(modid = ProgressionsCore.MODID, bus = EventBusSubscriber.Bus.MOD)
public class Config
{
    public static final String CATEGORY_STATS = "Stats";
    public static ModConfigSpec COMMON_CONFIG;
    public static ModConfigSpec.IntValue MAX_STAT_LEVEL;

    static{
        ModConfigSpec.Builder COMMON_BUILDER = new ModConfigSpec.Builder();
        COMMON_BUILDER.comment("General settings").push(CATEGORY_STATS);
        MAX_STAT_LEVEL = COMMON_BUILDER.comment("What should the stat max level be? [default: 100, max: 100]")
                .defineInRange("maxstatlevel", 100, 0, 100);
        COMMON_BUILDER.pop();
        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
    }
}
