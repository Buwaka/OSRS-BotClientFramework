package org.IFOSRS.Interactive;

import org.IFOSRS.Location.Tiles.Tile;

public interface GameObject extends Entity
{
    boolean canReach(Tile tile);

    double distance();

    double distance(Tile tile);

    double distance(Entity entity);

    boolean exists();

    java.lang.String[] getActions();

    int getAdjustToTerrain();

    int[] getAlternativeIDs();

    int getAnimationID();

    int getBrightness();

    int getContrast();

    abstract int getFlags();

    /**
     * @return Gets the Tile 2D height of the object (furnace is 2x3, 3 is height)
     */
    int getHeight();

    int getID();

    abstract long getIndex();

    /**
     * @return Gets a list of valid tiles your player could be standing on to interact with the game object (not including diagonals)
     */
    java.util.List<Tile> getInteractableFrom();

    int getInteractType();

    int getLocalX();

    int getLocalY();

    int getMapAreaId();

    int getMapSceneID();

    int getMiniMapIcon();

    //Model getModel();

    short[] getModelColors();

    int getModelSizeX();

    int getModelSizeY();

    int getModelSizeZ();

    short[] getModifiedModelColors();

    java.lang.String getName();

    int[] getObjectModelTypes();

    java.util.List<Tile> getObjectTiles();

    int getOffsetX();

    int getOffsetY();

    int getOffsetZ();

    abstract int getOrientation();

    java.util.Map<java.lang.Integer, java.lang.Object> getParams();

    abstract int getPlane();

    int getRealID();

    int getRenderableHeight();

    short[] getReTextureToFind();

    short[] getReTextureToReplace();

    int getSupportsItems();

    /**
     * @return Gets the surrounding tiles (not including diagonals) around the GameObject
     */
    java.util.List<Tile> getSurrounding();

    Tile getTile();

    int getVarbitID();

    int getVarpID();

    int getWallOrDoor();

    int getWallThickness();

    /**
     * @return Gets the Tile 2D width of the object (furnace is 2x3, 2 is width)
     */
    int getWidth();

    int getX();

    int getY();

    int getZ();

    boolean hasAction(java.lang.String... actions);

    boolean hasChildDefinitions();

    boolean isBlocksProjectiles();

    boolean isCastsShadows();

    boolean isImpenetrableSolid();

    boolean isNonFlatShading();

    boolean isObstructsGround();

    boolean isOccludes();

    boolean isRandomizeAnimationStart();

    void setTile(Tile t);

    /**
     * @param tile
     *
     * @return Distance (Chebyshev/Tchebychev) away from the given tile.
     */
    int tileDistance(Tile tile);

    java.lang.String toString();

    double walkingDistance(Tile tile);
}
