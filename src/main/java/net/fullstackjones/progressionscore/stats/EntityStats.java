package net.fullstackjones.progressionscore.stats;

import net.fullstackjones.progressionscore.Config;

public class EntityStats {
    private final int[] stats;
    private final String[] statNames;

    public EntityStats() {
        this.stats = new int[10];
        this.statNames = new String[] {
                "Magic",
                "Agility",
                "Farming",
                "Mining",
                "Gathering",
                "Crafting",
                "Building",
                "Combat",
                "Armour",
                "Mechanics"
        };
    }

    public EntityStats(int[] stats, String[] statNames) {
        this.stats = stats;
        this.statNames = statNames;
    }

    public int getStat(int index) {
        return stats[index];
    }

    public void setStat(int index, int value) {
        stats[index] = value;
    }

    public String getStatName(int index) {
        return statNames[index];
    }

    public void setStatName(int index, String name) {
        statNames[index] = name;
    }

    public int[] getStats() {
        return stats;
    }

    public String[] getStatNames() {
        return statNames;
    }

    public int getStatMaxLevel() {
        return Config.MAX_STAT_LEVEL.getDefault();
    }
}
