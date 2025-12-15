package org.pingas.hardtobdamage;

import lombok.Getter;
import net.runelite.api.gameval.NpcID;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum HardTobRooms {
    MAIDEN(
            "Maiden",
            NpcID.TOB_MAIDEN_100_HARD,
            NpcID.TOB_MAIDEN_70_HARD,
            NpcID.TOB_MAIDEN_50_HARD,
            NpcID.TOB_MAIDEN_30_HARD,
            NpcID.TOB_MAIDEN_DYING_A_HARD,
            NpcID.TOB_MAIDEN_DYING_B_HARD,
            NpcID.MAIDEN_ELEMENTAL_HARD,
            NpcID.MAIDEN_BLOOD_SLUG_HARD
    ),
    BLOAT(
            "Bloat",
            NpcID.TOB_BLOAT_HARD
    ),
    NYLOCAS_WAVES(
            "Nylocas Waves",
            NpcID.TOB_NYLOCAS_INCOMING_MELEE_HARD,
            NpcID.TOB_NYLOCAS_INCOMING_MAGIC_HARD,
            NpcID.TOB_NYLOCAS_INCOMING_RANGED_HARD,
            NpcID.TOB_NYLOCAS_BIG_INCOMING_MELEE_HARD,
            NpcID.TOB_NYLOCAS_BIG_INCOMING_MAGIC_HARD,
            NpcID.TOB_NYLOCAS_BIG_INCOMING_RANGED_HARD,
            NpcID.TOB_NYLOCAS_FIGHTING_MELEE_HARD,
            NpcID.TOB_NYLOCAS_FIGHTING_MAGIC_HARD,
            NpcID.TOB_NYLOCAS_FIGHTING_RANGED_HARD,
            NpcID.TOB_NYLOCAS_BIG_FIGHTING_MELEE_HARD,
            NpcID.TOB_NYLOCAS_BIG_FIGHTING_MAGIC_HARD,
            NpcID.TOB_NYLOCAS_BIG_FIGHTING_RANGED_HARD,
            NpcID.NYLOCAS_MINIBOSS_SPAWNING_HARD,
            NpcID.NYLOCAS_MINIBOSS_MELEE_HARD,
            NpcID.NYLOCAS_MINIBOSS_MAGIC_HARD,
            NpcID.NYLOCAS_MINIBOSS_RANGED_HARD
    ),
    NYLOCAS_BOSS(
            "Nylocas Boss",
            NpcID.NYLOCAS_BOSS_SPAWNING_HARD,
            NpcID.NYLOCAS_BOSS_MELEE_HARD,
            NpcID.NYLOCAS_BOSS_MAGIC_HARD,
            NpcID.NYLOCAS_BOSS_RANGED_HARD
    ),
    SOTETSEG(
            "Sotetseg",
            NpcID.TOB_SOTETSEG_COMBAT_HARD,
            NpcID.TOB_SOTETSEG_CREEPER_HARD,
            NpcID.TOB_SOTETSEG_NONCOMBAT_HARD
    ),
    XARPUS(
            "Xarpus",
            NpcID.TOB_XARPUS_COMBAT_HARD,
            NpcID.TOB_XARPUS_STATIC_HARD,
            NpcID.TOB_XARPUS_FEEDING_HARD,
            NpcID.XARPUS_DEATH_HARD
    ),
    VERZIK_P1("Verzik P1", NpcID.VERZIK_PHASE1_HARD),
    VERZIK_P2(
            "Verzik P2",
            NpcID.VERZIK_PHASE1_TO2_TRANSITION_HARD,
            NpcID.VERZIK_PHASE2_HARD,
            NpcID.VERZIK_NYLOCAS_MAGIC_HARD,
            NpcID.VERZIK_NYLOCAS_MELEE_HARD,
            NpcID.VERZIK_NYLOCAS_RANGED_HARD,
            NpcID.TOB_VERZIK_PHASE2_ARMOUREDNYLOCAS_HARD,
            NpcID.TOB_VERZIK_PHASE2_BLOODNYLOCAS_HARD
    ),
    VERZIK_P3(
            "Verzik P3",
            NpcID.VERZIK_PHASE2_TO3_TRANSITION_HARD,
            NpcID.VERZIK_PHASE3_HARD,
            NpcID.VERZIK_NYLOCAS_MAGIC_HARD,
            NpcID.VERZIK_NYLOCAS_MELEE_HARD,
            NpcID.VERZIK_NYLOCAS_RANGED_HARD,
            NpcID.VERZIK_WEB_NPC_HARD);

    private final String name;

    @Getter
    private final Set<Integer> npcIds;

    HardTobRooms(String name, Integer... npcIDs) {
        this.name = name;
        this.npcIds = new HashSet<>(Arrays.asList(npcIDs));
    }

    @Override
    public String toString() {
        return this.name;
    }
}
