package org.IFOSRS.Singletons.Walking;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Interactive.Entity;
import org.IFOSRS.Location.Tiles.Tile;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.annotation.Nullable;

@Singleton
public interface Walking extends ClientWrapper
{
    /**
     * @param destination
     *
     * @return     Returns whether you are able to walk to the tile, only works with local tiles.
     */
    @Inject
    static boolean canWalk(@NonNull Tile destination)
    {
        return false;
    }

    /**
     * @param destination
     *
     * @return     Checks whether you can walk to a given entity using local walk.
     */
    @Inject
    static boolean canWalk(@NonNull Entity destination)
    {
        return false;
    }

    /**
     * @param tile
     *
     * @return     Clicks a tile on the minimap
     */
    @Inject
    static boolean clickTileOnMinimap(@NonNull Tile tile)
    {
        return false;
    }

    /**
     * @param tile
     *
     * @return Returns the closest tile on the minimap to offset given tile.
     */
    @Inject
    static @Nullable Tile getClosestTileOnMap(@NonNull Tile tile)
    {
        return null;
    }

    /**
     * @return     Gets destination tile (red mini map flag).
     */
    @Inject
    static @Nullable Tile getDestination()
    {
        return null;
    }

    /**
     * @return      Gets the distance from the destination
     */
    @Inject
    static int getDestinationDistance()
    {
        return 0;
    }

    @Inject
    static int getMinimapTargetSize()
    {
        return 0;
    }

    @Inject
    static int getRunEnergy()
    {
        return 0;
    }

    /**
     * @return     Gets energy level which run will be toggled when using default walk methods.
     */
    @Inject
    static int getRunThreshold()
    {
        return 0;
    }

    /**
     * @return     Checks whether the setting for no click walk is enabled or not
     */
    @Inject
    static boolean isNoClickWalkEnabled()
    {
        return false;
    }

    /**
     * @return     Checks whether running is currently enabled via playerSettings.
     */
    @Inject
    static boolean isRunEnabled()
    {
        return false;
    }

    @Inject
    static boolean isStaminaActive()
    {
        return false;
    }

    @Inject
    static void reset()
    {

    }

    /**
     * @param active     Sets whether the walker should check for gangplanks before walking
     */
    @Inject
    static void setGangplankHandling(boolean active)
    {

    }

    /**
     * @param sizeInPx     Sets the size of MiniMapTileDestination's target area when minimap walking
     */
    @Inject
    static void setMinimapTargetSize(int sizeInPx)
    {

    }

    /**
     * @param shouldSleep  Sets whether the walker should sleep after interacting with an obstacle Setting this to false may result in spam clicking obstacles
     *
     */
    @Inject
    static void setObstacleSleeping(boolean shouldSleep)
    {

    }

    /**
     * @param runThreshold Sets energy level which run will be toggled when using default walk methods.
     */
    @Inject
    static void setRunThreshold(int runThreshold)
    {

    }

    /**
     * @return     Gets whether the walker should check for gangplanks before walking
     */
    @Inject
    static boolean shouldHandleGangplanks()
    {
        return false;
    }

    /**
     * @return     Gets whether the walker should sleep after interacting with an obstacle
     */
    @Inject
    static boolean shouldObstacleSleep()
    {
        return false;
    }

    /**
     * @return     Calls shouldWalk(4) See shouldWalk(int)
     */
    @Inject
    static boolean shouldWalk()
    {
        return false;
    }

    /**
     * @param distance
     *
     * @return Returns whether you should walk - if you're moving, it'll check if your distance to destination is less than specified
     */
    @Inject
    static boolean shouldWalk(int distance)
    {
        return false;
    }

    @Inject
    static void toggleNoClickWalk(boolean toggle)
    {

    }

    @Inject
    static boolean toggleRun()
    {
        return false;
    }

    /**
     * @param x
     * @param y
     *
     * @return     Walks to the tile at (x, y, 0)
     */
    @Inject
    static boolean walk(int x, int y)
    {
        return false;
    }

    @Inject
    static boolean walk(int x, int y, int z)
    {
        return false;
    }

    /**
     * @param tile
     *
     * @return Walks to the given tile, using a combination of web and local pathfinders, handling obstacles along the way as necessary.
     */
    @Inject
    static boolean walk(@NonNull Tile tile)
    {
        return false;
    }

    /**
     * @param entity
     *
     * @return     Walks to the tile (or the nearest walkable tile) of the entity.
     */
    @Inject
    static boolean walk(@NonNull Entity entity)
    {
        return false;
    }

    /**
     * @param tile
     *
     * @return Attempts to walk to the exact tile
     */
    @Inject
    static boolean walkExact(@NonNull Tile tile)
    {
        return false;
    }

    /**
     * @param tile
     *
     * @return Clicks on a tile on the main game screen
     */
    @Inject
    static boolean walkOnScreen(@NonNull Tile tile)
    {
        return false;
    }

}
