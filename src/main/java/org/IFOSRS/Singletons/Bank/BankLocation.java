package org.IFOSRS.Singletons.Bank;

import com.google.inject.Inject;
import org.IFOSRS.Interactive.Entity;
import org.IFOSRS.Location.Area;
import org.IFOSRS.Location.Locatable;
import org.IFOSRS.Location.Tiles.Tile;
import org.IFOSRS.Requirement.Requirement;

public enum BankLocation implements Locatable
{
    AL_KHARID,
    ARCEUUS,
    ARDOUGNE_NORTH,
    ARDOUGNE_SOUTH,
    BARBARIAN_OUTPOST,
    BLAST_FURNACE,
    BURGH_DE_ROTT,
    CANIFIS,
    CASTLE_WARS,
    CATHERBY,
    CIVITAS_ILLA_FORTIS_EAST,
    CIVITAS_ILLA_FORTIS_WEST,
    CORSAIR_COVE,
    CRAFTING_GUILD,
    DARKMEYER,
    DRAYNOR,
    DUEL_ARENA,
    EDGEVILLE,
    ETCETERIA,
    FALADOR_EAST,
    FALADOR_WEST,
    FARMING_GUILD,
    FEROX_ENCLAVE,
    FISHING_GUILD,
    FOSSIL_ISLAND,
    GIANTS_FOUNDRY,
    GNOME_STRONGHOLD,
    GOTR,
    GRAND_EXCHANGE,
    GRAND_TREE,
    HOSIDIUS,
    HOSIDIUS_SHORE,
    HOSIDIUS_KITCHEN,
    HOSIDIUS_VINERY,
    HUNTER_GUILD,
    JATIZSO,
    KELDAGRIM,
    KOUREND_CASTLE,
    LANDS_END,
    LLETYA,
    LOVAKENGJ_SOUTH,
    LOVAKENGJ_WEST,
    LUMBRIDGE,
    LUMBRIDGE_BASEMENT,
    LUNAR_ISLAND,
    MAGE_BANK,
    MINING_GUILD,
    MOONCLAN_ISLE,
    MOS_LEHARMLESS,
    MOTHERLODE_MINE,
    MOUNT_KARUULM,
    MOUNT_QUIDAMORTEM,
    MYTHS_GUILD,
    NARDAH,
    NEITIZNOT,
    PEST_CONTROL,
    PISCATORIS,
    PORT_KHAZARD,
    PORT_PHASMATYS,
    PORT_PISCARILIUS,
    ROGUES_DEN,
    RUINS_OF_CAMDOZAAL,
    RUINS_OF_UNKAH,
    SEERS,
    SHANTAY_PASS,
    SHAYZIEN,
    SHILO_VILLAGE,
    SOUL_WARS,
    TZHAAR,
    TZHAAR_EAST,
    VARROCK_EAST,
    VARROCK_WEST,
    VER_SINHAZA,
    NORTH_PRIFDDINAS,
    SOUTH_PRIFDDINAS,
    WARRIORS_GUILD,
    WINTERTODT,
    WOODCUTTING_GUILD,
    WOODCUTTING_GUILD_DUNGEON,
    YANILLE,
    ZANARIS,
    SULFUR_MINE,
    HALLOWED_SEPULCHER,
    COOKS_GUILD,
    CAM_TORUM,
    DORGESH_KAAN,
    SOPHANEM_DUNGEON;

    @Inject
    static IBankLocation instance = null;

    Area getArea(int radius)
    {
        return Area.CreateArea(instance.getTile(this), radius);
    }

    BankType getBankType()
    {
        return instance.getBankType(this);
    }

    Tile getCenter()
    {
        return instance.getCenter(this);
    }

    public Tile getTile()
    {
        return instance.getTile(this);
    }

    boolean isMembersOnly()
    {
        return instance.isMembersOnly(this);
    }

    public java.lang.String toString()
    {
        return instance.toString(this);
    }

    /**
     * @return     Gets any requirements needed to access this bank
     */
    Requirement getCondition()
    {
        return instance.getCondition(this);
    }

    /**
     * @return
     */
    static BankLocation getNearest()
    {
        return instance.getNearest();
    }

    /**
     * @param tile
     *
     * @return     Gets the nearest BankLocation to the tile
     */
    static BankLocation getNearest(Tile tile)
    {
        return instance.getNearest(tile);
    }


    /**
     * @param tile
     * @param includeTeleports
     *
     * @return     Gets the nearest BankLocation to the given Tile
     */
    static BankLocation getNearest(Tile tile, boolean includeTeleports)
    {
        return instance.getNearest(tile, includeTeleports);
    }


    /**
     * @param entity
     *
     * @return     Gets the nearest BankLocation to the entity
     */
    static BankLocation getNearest(Entity entity)
    {
        return instance.getNearest(entity);
    }


    /**
     * @param tile
     * @param ignoreRequirements
     *
     * @return Gets the nearest bank location to the entity based on euclidean distance getNearest(Tile) will check against web paths to find more exact distances, so takes longer This method should be quicker call, while possibly being less precise.
     */
    static BankLocation getNearestEuclidean(Tile tile, boolean ignoreRequirements)
    {
        return instance.getNearestEuclidean(tile, ignoreRequirements);
    }

    static java.util.List<BankLocation> getSortedValidLocations(Tile nearest)
    {
        return instance.getSortedValidLocations(nearest);
    }

    static java.util.List<BankLocation> getSortedValidLocations(Entity nearest)
    {
        return instance.getSortedValidLocations(nearest.getTile());
    }

    static java.util.List<BankLocation> getValidLocations()
    {
        return instance.getValidLocations();
    }
}
