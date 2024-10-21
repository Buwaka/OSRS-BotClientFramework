package org.IFOSRS;

import javax.annotation.Nullable;
import org.IFOSRS.Location.Tiles.Tile;

public interface CollisionMap extends ClientWrapper
{
    int getBaseX();

    int getBaseY();

    float getCost(int sx, int sy, int tx, int ty);

    int getDirection(int x, int y);

   default @Nullable Integer getFlag(int gridX, int gridY)
    {
        if(gridX < 0 || gridY < 0)
        {
            return null;
        }

        int[][] flags =getFlags();
        if(gridX >= flags.length || gridY >= flags[gridX].length)
        {
            return null;
        }

        return flags[gridX][gridY];
    }

    int[][] getFlags();

    int getHeight();

    Tile getOffset();

    int getOffsetX();

    int getOffsetY();

    int getWidth();

    /**
     * @param flag
     *
     * @return Determines if given tile flag represents a blocked/non-walkable tile.
     */
    boolean isBlocked(int flag);

    boolean isBlocked(int x, int y, int direction);

    /**
     * @param cardinal
     * @param flag
     * @param neighbor
     *
     * @return Determines if the cardinal direction of your choice is blocked.
     */
    boolean isCardinalDirectionBlocked(int cardinal, int flag, int neighbor);

    boolean isOrdinalDirectionBlocked(int ordinal, int ne, int nw, int se, int sw);

    /**
     * @param x
     * @param y
     *
     * @return Check if the given location is blocked, i.values.
     */
    boolean isSolid(int x, int y);

    boolean isSolid(int x, int y, int flag);

    boolean isWalkable(int x1, int y1, int x2, int y2);

    boolean isWalkable(int x1, int y1, int x2, int y2, int flag);

}
