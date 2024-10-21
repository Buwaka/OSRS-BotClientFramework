package org.IFOSRS;

import org.IFOSRS.Interactive.Entity;

public interface Item extends ClientWrapper
{
    int getID();

    java.lang.String[] getActions();

    int getAmount();

    int getLivePrice();

    int getHighAlchValue();

    java.awt.image.BufferedImage getImage();

    java.lang.String getName();

    int getNotedItemID();

    int getSlot();

    boolean hasAction(java.lang.String... actions);

    boolean hasDefinition();

    int hashCode();

    boolean interact();

    boolean interact(java.lang.String action);

    boolean isMembersOnly();

    boolean isNotable();

    boolean isNoted();

    boolean isPlaceholder();

    boolean isStackable();

    boolean isTradable();

    boolean isValid();

    java.lang.String toString();

    boolean useOn(int id);

    boolean useOn(java.lang.String name);

    boolean useOn(Entity entity);

    boolean useOn(Item item);
}
