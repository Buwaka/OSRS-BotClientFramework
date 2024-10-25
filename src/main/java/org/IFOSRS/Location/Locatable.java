package org.IFOSRS.Location;

import org.IFOSRS.Location.Tiles.Tile;
import org.IFOSRS.Singletons.Client.Client;
import org.IFOSRS.Singletons.Map;
import org.IFOSRS.Singletons.Players;

public interface Locatable
{
    Tile getTile();

    default double distance(Tile tile) {
        return this.getTile().distance(tile);
    }


    default int tileDistance(Tile tile)
    {
        return Math.max(Math.abs(this.getX() - tile.getX()), Math.abs(this.getY() - tile.getY()));
    }


    default double walkingDistance(Tile tile)
    {
        //TODO
        return 0;
    }

    default boolean canReach() {
        return Map.canReach(Players.getLocal().getTile(), this.getTile());
    }

    default boolean canReach(Tile tile) {
        return Map.canReach(this.getTile(), tile);
    }

    default int getX() {
        return this.getTile().getX();
    }

    default int getY() {
        return this.getTile().getY();
    }

    default int getGridX() {
        return this.getX() - Client.getBaseX();
    }

    default int getGridY() {
        return this.getY() - Client.getBaseY();
    }

    default int getZ() {
        return this.getTile().getZ();
    }



//    default int getSceneX() {
//        return this.getX() - this.getWorldView().getBaseX();
//    }
//
//    default int getSceneY() {
//        return this.getY() - this.getWorldView().getBaseY();
//    }
//
//    default int getLocalX() {
//        return (this.getSceneX() << 7) + 64;
//    }
//
//    default int getLocalY() {
//        return (this.getSceneY() << 7) + 64;
//    }
//
//    default int getRegionX() {
//        return this.getX() & 63;
//    }
//
//    default int getRegionY() {
//        return this.getY() & 63;
//    }
//
//    default int getRegionId() {
//        return this.getX() >> 6 << 8 | this.getY() >> 6;
//    }


}
