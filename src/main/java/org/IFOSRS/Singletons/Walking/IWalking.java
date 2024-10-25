package org.IFOSRS.Singletons.Walking;

import org.IFOSRS.Interactive.Entity;
import org.IFOSRS.Location.Tiles.Tile;

import javax.annotation.Nullable;

public interface IWalking
{

    boolean canWalk(Tile destination);

    boolean canWalk(Entity destination);

    @Nullable
    Tile getDestination();

    int getDestinationDistance();

    int getMinimapTargetSize();

    int getRunEnergy();

    int getRunThreshold();

    boolean isRunEnabled();

    boolean isStaminaActive();

    void setRunThreshold(int runThreshold);

    boolean toggleRun();

    boolean walk(int x, int y);

    boolean walk(int x, int y, int z);

    boolean walk(Tile tile);

    boolean walk(Entity entity);

    boolean walkExact(Tile tile);

}
