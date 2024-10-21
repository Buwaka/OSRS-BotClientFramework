package org.IFOSRS.Singletons;

import org.IFOSRS.Interactive.Entity;
import org.IFOSRS.Interactive.GameObject;
import org.IFOSRS.Location.Tiles.Tile;

import javax.annotation.Nullable;

public interface Map
{
    /**
     * @param destination
     *
     * @return  Determines if the given destination tile is reachable from your current local players position, and not blocked by any objects/obstacles.
     */
    static boolean canReach(Tile destination)
    {
        return false;
    }

    /**
     * @param destination
     * @param offsetDestination
     *
     * @return Determines if the given destination tile reachable from your current local players position, and not blocked by any objects/obstacles.
     */
    static boolean canReach(Tile destination, boolean offsetDestination)
    {
        return false;
    }

    /**
     * @param destination
     * @param destination
     *
     * @return     Determines if the given destination tile reachable from the given start tile, and not blocked by any objects/obstacles.
     */
    static boolean canReach(Tile start, Tile destination)
    {
        return false;
    }

    /**
     * @param start
     * @param destination
     * @param offsetDestination
     *
     * @return     Determines if the given destination tile reachable from the given start tile, and not blocked by any objects/obstacles.
     */
    static boolean canReach(Tile start, Tile destination, boolean offsetDestination)
    {
        return false;
    }

    /**
     * @param destination
     *
     * @return Determines if the given destination Entity is reachable from your current local players position, and not blocked by any objects/obstacles.
     */
    static boolean canReach(Entity destination)
    {
        return false;
    }

    static void clearGameObjectCache()
    {

    }

    static int costToTile(int startX, int startY, int destinationX, int destinationY, boolean offsetDestination)
    {
        return 0;
    }

    static int costToTile(int startX, int startY, int destinationX, int destinationY, int z, boolean offsetDestination)
    {
        return 0;
    }

    /**
     * @param destination
     *
     * @return     Calculates the exact distance (number of tiles) your current player is away from destination.
     */
    static int exactDistance(Tile destination)
    {
        return 0;
    }

    /**
     * @param destination
     * @param offsetDestination
     *
     * @return  Determines if the given destination tile reachable from your current local players position, and not blocked by any objects/obstacles.
     */
    static int exactDistance(Tile destination, boolean offsetDestination)
    {
        return 0;
    }

    /**
     * @param start
     * @param destination
     *
     * @return Determines if the given destination tile reachable from the given start tile, and not blocked by any objects/obstacles.
     */
    static int exactDistance(Tile start, Tile destination)
    {
        return 0;
    }

    /**
     * @param start
     * @param destination
     * @param offsetDestination
     *
     * @return     Determines if the given destination tile reachable from the given start tile, and not blocked by any objects/obstacles.
     */
    static int exactDistance(Tile start, Tile destination, boolean offsetDestination)
    {
        return 0;
    }

    /**
     * @param destination
     *
     * @return     Calculates the exact distance (number of tiles) your current player is away from destination.
     */
    static int exactDistance(Entity destination)
    {
        return 0;
    }

    /**
     * @param tile
     *
     * @return     Gets the on-screen rectangle bounds of the given tile.
     */
    static java.awt.Rectangle getBounds(Tile tile)
    {
        return null;
    }

    /**
     * @param tile
     *
     * @return     Gets collision flag for the given tile.
     */
    static int getFlag(Tile tile)
    {
        return 0;
    }

    /**
     * @param tile
     *
     * @return     Gets the grid location of the tile.
     */
    static Tile getGridLocation(Tile tile)
    {
        return null;
    }

    /**
     * @param tile
     *
     * @return     Gets the x location of a tile on the region grid.
     */
    static int getGridX(Tile tile)
    {
        return 0;
    }

    /**
     * @param tile
     *
     * @return     Gets the grid y value of a tile
     */
    static int getGridY(Tile tile)
    {
        return 0;
    }

    /**
     * @param tile
     *
     * @return     Gets the mini map Destination for the given tile.
     */
//    static MiniMapTileDestination getMiniMapDestination(Tile tile)
//    {
//        return null;
//    }

    /**
     * @return     Gets a generated shape reference for the minimap widget.
     */
    static java.awt.Shape getMinimapShape()
    {
        return null;
    }

    static java.awt.Shape getMinimapShape(int diameterIncrease)
    {
        return null;
    }

    /**
     * @param tile
     *
     * @return     Gets the GameObjects at the given tile.
     */
    static @Nullable GameObject[] getObjectsAtTile(Tile tile)
    {
        return new GameObject[0];
    }

    /**
     * @param tile
     * @param cachedResults
     *
     * @return     Gets the GameObjects at the given tile.
     */
    static GameObject[] getObjectsAtTile(Tile tile, boolean cachedResults)
    {
        return new GameObject[0];
    }


    /**
     * @param tile
     *
     * @return     Gets the on-screen polygon of the given tile.
     */
    static java.awt.Polygon getPolygon(Tile tile)
    {
        return null;
    }

    /**
     * @param tile
     *
     * @return    Gets the height of a tile.
     */
    static int getTileHeight(Tile tile)
    {
        return 0;
    }


    /**
     * @param tile
     *
     * @return     Gets an array of points which represent the bounds of a tile.
     */
    static java.awt.Point[] getVertices(Tile tile)
    {
        return new java.awt.Point[0];
    }

    /**
     * @param tile
     *
     * @return     Gets a walkable tile which is closest the given tile.
     */
    static Tile getWalkable(Tile tile)
    {
        return null;
    }

    static boolean hoveringMinimap()
    {
        return false;
    }

    /**
     * @param tile
     *
     * @return     Interacts with the given tile on the map
     */
    static boolean interact(Tile tile)
    {
        return false;
    }

    /**
     * @param tile
     * @param action
     *
     * @return     Interacts with the given tile on the map using the given action.
     */
    static boolean interact(Tile tile, java.lang.String action)
    {
        return false;
    }

    /**
     * @param tile
     *
     * @return     Determines if given tile is local.
     */
    static boolean isLocal(Tile tile)
    {
        return false;
    }

    /**
     * @param tile
     *
     * @return     Determines if the given tile is current visible on the mini map.
     */
    static boolean isTileOnMap(Tile tile)
    {
        return false;
    }

    /**
     * @param tile
     *
     * @return     Is tile on screen.
     */
    static boolean isTileOnScreen(Tile tile)
    {
        return false;
    }

    /**
     * @param tile
     *
     * @return     Checks if the Tile is visible on the main screen.
     */
    static boolean isVisible(Tile tile)
    {
        return false;
    }

    /**
     * @param tile
     *
     * @return     Gets the given tile location on the mini map.
     */
    static java.awt.Point tileToMiniMap(Tile tile)
    {
        return null;
    }

    /**
     * @param tile
     *
     * @return     Gets the current screen position of the given tile.
     */
    static java.awt.Point tileToScreen(Tile tile)
    {
        return null;
    }

}
