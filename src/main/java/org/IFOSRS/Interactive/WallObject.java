package org.IFOSRS.Interactive;

import org.IFOSRS.ClientWrapper;

public interface WallObject extends GameObject
{
    int 	getFlags();
    int 	getGridX();
    int 	getGridY();
    long 	getIndex();
    int 	getOrientation();
    int 	getPlane();
}
