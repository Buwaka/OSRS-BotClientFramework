package org.IFOSRS.Interactive;


import org.IFOSRS.Direction;
import org.IFOSRS.Location.Tiles.Tile;

import javax.annotation.Nonnull;

public interface Character extends Entity
{
    /**
     * @return Determines if this Character can be attacked.
     */
    boolean canAttack();

    boolean exists();

    int getAnimation();

    /**
     * @return Gets the delay between animations.
     */
    int getAnimationDelay();

    Character getCharacterInteractingWithMe();

    @Nonnull
    java.util.List<Character> getCharactersInteractingWithMe();

    int getCombatTime();

    Direction getFacingDirection();

    int getGridX();

    int getGridY();

    /**
     * @return Gets the head frame ID from the current animation.
     */
    int getHeadFrame();

    int getHealthPercent();

    int[] getHitSplatCycles();

    int[] getHitSplatIds();

    int[] getHitSplats();

    int[] getHitSplatSpecials();

    int[] getHitSplatTypes();

    abstract int getIndex();

    Character getInteractingCharacter();

    int getInteractingIndex();

    abstract int getLevel();

    int getLocalX();

    int getLocalY();

    int getOrientation();

    java.lang.String getOverhead();

    int getQueueSize();

    int[] getQueueX();

    int[] getQueueY();

    int getRenderableHeight();

    Tile getServerTile();

    int getSmoothOrientation();

    int getSpotAnimation();

    int getStandAnimation();

    int getTailFrame();

    long getUID();

    int getWalkAnimation();

    int getX();

    int getY();

    int getZ();

    boolean isAnimating();

    boolean isHealthBarVisible();

    boolean isInCombat();

    boolean isInteractedWith();

    boolean isInteracting(@Nonnull Character character);

    boolean isMoving();

    boolean isStandingStill();

}
