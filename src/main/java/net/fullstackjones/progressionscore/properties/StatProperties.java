package net.fullstackjones.progressionscore.properties;

import net.fullstackjones.progressionscore.Config;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import java.util.ArrayList;
import java.util.List;

public class StatProperties {

    // need to make this more dynamic so that it can be customised by modpack authors.
    public static final IntegerProperty MAGIC_LEVEL = IntegerProperty.create("magic_level", 0, Config.MAX_STAT_LEVEL.getDefault());
    public static final IntegerProperty AGILITY_LEVEL = IntegerProperty.create("agility_level", 0, Config.MAX_STAT_LEVEL.getDefault());
    public static final IntegerProperty FARMING_LEVEL = IntegerProperty.create("farming_level", 0, Config.MAX_STAT_LEVEL.getDefault());
    public static final IntegerProperty MINING_LEVEL = IntegerProperty.create("mining_level", 0, Config.MAX_STAT_LEVEL.getDefault());
    public static final IntegerProperty GATHERING_LEVEL = IntegerProperty.create("gathering_level", 0, Config.MAX_STAT_LEVEL.getDefault());
    public static final IntegerProperty CRAFTING_LEVEL = IntegerProperty.create("crafting_level", 0, Config.MAX_STAT_LEVEL.getDefault());
    public static final IntegerProperty BUILDING_LEVEL = IntegerProperty.create("building_level", 0, Config.MAX_STAT_LEVEL.getDefault());
    public static final IntegerProperty COMBAT_LEVEL = IntegerProperty.create("combat_level", 0, Config.MAX_STAT_LEVEL.getDefault());
    public static final IntegerProperty ARMOUR_LEVEL = IntegerProperty.create("armour_level", 0, Config.MAX_STAT_LEVEL.getDefault());
    public static final IntegerProperty MECHANICS_LEVEL = IntegerProperty.create("mechanics_level", 0, Config.MAX_STAT_LEVEL.getDefault());


    public static final IntegerProperty[] LEVELS = CreateProperties();

    private static IntegerProperty[] CreateProperties() {
        List<IntegerProperty> properties = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            properties.add(IntegerProperty.create("level_" + i, 0, Config.MAX_STAT_LEVEL.getDefault()));
        }
       return properties.toArray(new IntegerProperty[0]);
    }
}
