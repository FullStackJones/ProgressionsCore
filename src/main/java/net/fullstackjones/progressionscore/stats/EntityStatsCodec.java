package net.fullstackjones.progressionscore.stats;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import java.util.Arrays;

public class EntityStatsCodec {
    public static final Codec<int[]> INT_ARRAY_CODEC = Codec.INT.listOf().xmap(
            list -> list.stream().mapToInt(Integer::intValue).toArray(),
            array -> java.util.Arrays.stream(array).boxed().toList()
    );

    public static final Codec<String[]> STRING_ARRAY_CODEC = Codec.STRING.listOf().xmap(
            list -> list.toArray(new String[0]),
            Arrays::asList
    );

    public static final Codec<EntityStats> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            INT_ARRAY_CODEC.fieldOf("stats").forGetter(EntityStats::getStats),
            STRING_ARRAY_CODEC.fieldOf("statNames").forGetter(EntityStats::getStatNames)
    ).apply(instance, EntityStats::new));
}
