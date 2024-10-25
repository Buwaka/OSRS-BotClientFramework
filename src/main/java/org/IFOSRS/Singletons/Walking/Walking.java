package org.IFOSRS.Singletons.Walking;

import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Interactive.Entity;
import org.IFOSRS.Location.Tiles.Tile;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.annotation.Nullable;


public class Walking implements ClientWrapper
{

    static IWalking instance = null;

    @Override
    public Object getObject()
    {
        return null;
    }

    /**
     * @param destination
     *
     * @return Returns whether you are able to walk to the tile, only works with local tiles.
     */

    static boolean canWalk(@NonNull Tile destination)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.canWalk(destination);
    }

    /**
     * @param destination
     *
     * @return Checks whether you can walk to a given entity using local walk.
     */

    static boolean canWalk(@NonNull Entity destination)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.canWalk(destination);
    }

    /**
     * @return Gets destination tile (red mini map flag).
     */

    static @Nullable Tile getDestination()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getDestination();
    }

    /**
     * @return Gets the distance from the destination
     */

    static int getDestinationDistance()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getDestinationDistance();
    }


    static int getMinimapTargetSize()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getMinimapTargetSize();
    }


    static int getRunEnergy()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getRunEnergy();
    }

    /**
     * @return Gets energy level which run will be toggled when using default walk methods.
     */

    static int getRunThreshold()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getRunThreshold();
    }

    /**
     * @return Checks whether running is currently enabled via playerSettings.
     */

    static boolean isRunEnabled()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.isRunEnabled();
    }


    static boolean isStaminaActive()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.isStaminaActive();
    }

    /**
     * @param runThreshold Sets energy level which run will be toggled when using default walk methods.
     */

    static void setRunThreshold(int runThreshold)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        instance.setRunThreshold(runThreshold);
    }


    static boolean toggleRun()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.toggleRun();
    }

    /**
     * @param x
     * @param y
     *
     * @return Walks to the tile at (x, y, 0)
     */

    static boolean walk(int x, int y)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.walk(x, y);
    }


    static boolean walk(int x, int y, int z)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.walk(x, y, z);
    }

    /**
     * @param tile
     *
     * @return Walks to the given tile, using a combination of web and local pathfinders, handling obstacles along the way as necessary.
     */

    static boolean walk(@NonNull Tile tile)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.walk(tile);
    }

    /**
     * @param entity
     *
     * @return Walks to the tile (or the nearest walkable tile) of the entity.
     */

    static boolean walk(@NonNull Entity entity)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.walk(entity);
    }

    /**
     * @param tile
     *
     * @return Attempts to walk to the exact tile
     */

    static boolean walkExact(@NonNull Tile tile)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.walkExact(tile);
    }
}
