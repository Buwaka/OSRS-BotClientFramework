package org.IFOSRS.Singletons.Bank;

import org.IFOSRS.Interactive.Entity;
import org.IFOSRS.Location.Tiles.Tile;
import org.IFOSRS.Requirement.Requirement;

import java.util.List;

public interface IBankLocation
{
    BankType getBankType(BankLocation location);

    Tile getCenter(BankLocation location);

    /**
     * @return Gets any requirements needed to access this bank
     */
    Requirement getCondition(BankLocation location);

    /**
     * @return the nearest BankLocation
     */
    BankLocation getNearest();

    /**
     * @param tile the tile to check from
     * @return Gets the nearest BankLocation to the tile
     */
    BankLocation getNearest(Tile tile);

    /**
     * @param tile            the tile to check from
     * @param includeTeleports whether to include teleports
     * @return Gets the nearest BankLocation to the given Tile
     */
    BankLocation getNearest(Tile tile, boolean includeTeleports);

    /**
     * @param entity the entity to check from
     * @return Gets the nearest BankLocation to the entity
     */
    BankLocation getNearest(Entity entity);

    /**
     * @param tile              the tile to check from
     * @param ignoreRequirements whether to ignore requirements
     * @return Gets the nearest bank location to the entity based on euclidean distance getNearest(Tile) will check against web paths to find more exact distances, so takes longer This method should be quicker call, while possibly being less precise.
     */
    BankLocation getNearestEuclidean(Tile tile, boolean ignoreRequirements);

    List<BankLocation> getSortedValidLocations(Tile nearest);

    List<BankLocation> getSortedValidLocations(Entity nearest);

    Tile getTile(BankLocation location);

    List<BankLocation> getValidLocations();

    boolean isMembersOnly(BankLocation location);


    String toString(BankLocation location);
}
