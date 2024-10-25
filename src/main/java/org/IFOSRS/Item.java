package org.IFOSRS;

public interface Item extends ClientWrapper
{
    public abstract int getID();

    public abstract java.lang.String[] getActions();

    public abstract int getAmount();

    public abstract int getLivePrice();

    public abstract int getHighAlchValue();

    public abstract java.awt.image.BufferedImage getImage();

    public abstract java.lang.String getName();

    public abstract int getNotedItemID();

    public abstract int getSlot();

    public abstract boolean hasAction(java.lang.String... actions);

    public abstract int hashCode();

    public abstract boolean interact();

    public abstract boolean interact(java.lang.String action);

    public abstract boolean isMembersOnly();

    public abstract boolean isNotable();

    public abstract boolean isNoted();

}
