package org.IFOSRS.Interactive;

import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Item;
import org.IFOSRS.Location.Tiles.Tile;

public interface GroundItem extends ClientWrapper,Interactable
{
    boolean exists();

    java.lang.String[] getActions();

    int getAmount();

    java.awt.Rectangle getBoundingBox();

    int getGridX();

    int getGridY();

    int getHeight();

    int getID();

    Item getItem();

    int getLocalX();

    int getLocalY();

    java.lang.String getName();

    int getPlane();

    int getRenderableHeight();

    Tile getTile();

    int getX();

    int getY();

    int getZ();

    boolean hasAction(java.lang.String... actions);

    boolean isOnScreen();

    void setTile(Tile t);

    void setZ(int z);

    java.lang.String toString();
}
