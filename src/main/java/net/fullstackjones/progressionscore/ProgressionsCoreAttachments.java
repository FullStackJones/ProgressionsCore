package net.fullstackjones.progressionscore;

import net.fullstackjones.progressionscore.stats.EntityStats;
import net.fullstackjones.progressionscore.stats.EntityStatsCodec;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class ProgressionsCoreAttachments {
    private static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, ProgressionsCore.MODID);

    private static final Supplier<AttachmentType<EntityStats>> ENTITY_STATS = ATTACHMENT_TYPES.register(
            "entitystats", () -> AttachmentType.builder(EntityStats::new).serialize(EntityStatsCodec.CODEC).build()
    );

    public static void register(IEventBus eventBus) {
        ATTACHMENT_TYPES.register(eventBus);
    }
}
