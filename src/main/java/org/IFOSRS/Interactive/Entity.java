package org.IFOSRS.Interactive;

import org.IFOSRS.Location.Area;
import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Location.Tiles.Tile;

import java.util.function.Supplier;

public interface Entity extends  ClientWrapper,Interactable
{
    boolean canReach();

    double distance();

    double distance(Tile tile);

    double distance(Entity entity);

    boolean equals(java.lang.Object obj);

    boolean exists();

    abstract java.lang.String[] getActions();

    java.awt.Rectangle getBoundingBox();

    java.awt.Point getCenterPoint();

    java.awt.Point getClickablePoint();

    java.lang.String getLeftClickAction();

    abstract java.lang.String getName();

    Area getSurroundingArea(int radius);

    Tile getTile();

    int hashCode();

    boolean interact();

    boolean interact(java.lang.String action);

    boolean interact(java.lang.String action, boolean rightClick, boolean forceRightClick);

    boolean interact(java.lang.String action, boolean rightClick, boolean forceRightClick, Supplier<Boolean> interrupt);

    boolean interactForceLeft(java.lang.String action);

    boolean interactForceRight(java.lang.String action);

    boolean isOnScreen();

    double walkingDistance(Tile tile);
}
