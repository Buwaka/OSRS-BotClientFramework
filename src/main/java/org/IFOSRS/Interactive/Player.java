package org.IFOSRS.Interactive;

import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Item;
import org.IFOSRS.NameComposite;
import org.IFOSRS.PlayerComposite;

public interface Player extends Character
{
    java.lang.String[] getActions();

    java.awt.Rectangle getBoundingBox();

    PlayerComposite getComposite();

    /**
     * @return Gets a list of Items that the player is wearing based on PlayerComposite.getAppearance() and adjusting the value to translate from appearance to item.
     */
    java.util.List<Item> getEquipment();

    int getID();

    int getIndex();

    /**
     * @return Gets the Character's combat level.
     */
    int getLevel();

    java.lang.String getName();

    NameComposite getNameComposite();

    int getOverheadIcon();

    int getSkullIcon();

    int getTeam();

    boolean hasAction(java.lang.String... actions);

    java.lang.String hashed();

    java.lang.String hashed(java.lang.String prepend, java.lang.String append);

    boolean isHidden();

    boolean isSkulled();

    void setIndex(int index);

    java.lang.String toString();
}
