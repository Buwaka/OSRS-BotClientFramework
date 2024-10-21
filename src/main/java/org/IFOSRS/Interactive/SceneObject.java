package org.IFOSRS.Interactive;

import org.IFOSRS.Location.Tiles.Tile;

public interface SceneObject extends GameObject
{
    int 	getFlags();
    int 	getGridX();
    int 	getGridY();
    long 	getIndex();
    int 	getOrientation();
    int 	getPlane();
    int 	getRelativeX();
    int 	getRelativeY();
    Tile getTile();
    int 	getType();
}
