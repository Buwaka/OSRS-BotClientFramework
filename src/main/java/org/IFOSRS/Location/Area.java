package org.IFOSRS.Location;

import com.google.inject.Inject;
import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Interactive.Entity;
import org.IFOSRS.Location.Tiles.Tile;

public interface Area extends ClientWrapper
{
    @Inject
    static Area CreateArea(Tile[] tiles)
    {
        assert false;
        return null;
    }

    @Inject
    static Area CreateArea(int x1, int y1, int x2, int y2)
    {
        assert false;
        return null;
    }

    @Inject
    static Area CreateArea(Tile center, int radius)
    {
        assert false;
        return null;
    }


    boolean contains(int x, int y);

    boolean contains(Tile tile);

    boolean contains(Entity entity);

    java.util.List<Tile> getBoundaryPoints();

    java.awt.Rectangle getBoundingBox();

    Tile getCenter();

    Tile getNearestTile(Entity entity);

    java.awt.Polygon getPolygonArea();

    Tile getRandomTile();

    Tile getTile();

    Tile[] getTiles();

    void setZ(int plane);

    Area withArea(Area area);
}
