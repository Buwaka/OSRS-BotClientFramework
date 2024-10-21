package org.IFOSRS.Interactive;

import org.IFOSRS.Location.Area;
import org.IFOSRS.Location.Tiles.Tile;

public interface NPC extends Character
{
    java.lang.String[] getActions();

    int[] getAdditionalModels();

    Area getArea();

    int[] getChildIDs();

    /**
     * @return Returns the overhead icon archive IDs for the currently available overhead icon
     */
    int[] getCurrentOverheadIcons();

    /**
     * @return Returns the overhead icon sprite indices for the currently available overhead icon
     */
    short[] getCurrentOverheadSpriteIndices();

    int getDegreesToTurn();

    int[] getHeadIconArchiveIds();

    short[] getHeadIconSpriteIndex();

    int getHeightScale();

    int getID();

    int getIdleAnimation();

    int getIndex();

    /**
     * @return Gets the Character's combat level.
     */
    int getLevel();

    int getLightModifier();

    int[] getModelIDs();

    java.lang.String getName();

    java.util.Map<java.lang.Integer, java.lang.Object> getParams();

    int getRealID();

    short[] getRecoloredOriginal();

    short[] getRecoloredTarget();

    short[] getRecolorOriginal();

    short[] getRecolorTarget();

    short[] getRetextureToFind();

    short[] getRetextureToReplace();

    int getShadowModifier();

    int getSize();

    /**
     * @return Gets the tile that loot will drop on, adjusts NPC tile based on NPC size.
     */
    Tile getTrueTile();

    int getTurn180Animation();

    int getTurn90CCWAnimation();

    int getTurn90CWAnimation();

    int getVarbitID();

    int getVarpID();

    int getWalkingAnimation();

    int getWidthScale();

    boolean hasAction(java.lang.String... actions);

    boolean hasRenderPriority();

    boolean isClickable();

    boolean isDrawMinimapDot();

    boolean isFollower();

    boolean isLowPriorityFollowerOps();

    boolean isRotationFlag();

    void setIndex(int index);

    java.lang.String toString();
}
