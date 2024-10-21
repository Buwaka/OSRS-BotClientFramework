package org.IFOSRS.Location.Tiles;

import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Interactive.Entity;
import org.IFOSRS.Location.Area;
import org.IFOSRS.Location.Locatable;


/**
 * Also known as WorldTile, basically exact coordinates on the WorldMap
 */
public interface Tile extends Locatable, ClientWrapper
{
    Tile CreateTile();

    double distance();

    double distance(Tile tile);

    double distance(Entity entity);

    boolean equals(java.lang.Object obj);

    Area getArea(int radius);

    int getGridX();

    int getGridY();

    java.awt.Polygon getPolygon();

    Tile getRandomized();

    Tile getRandomized​(int deviation);

    Tile getRandomizedTile();

    int getX();

    int getY();

    int getZ();

    int hashCode();

    void setX(int x);

    void setY(int y);

    void setZ(int z);

    java.lang.String toString();

    Tile translate(int x, int y);

    Tile translate(Tile tile);

    double walkingDistance(Tile tile);

}
