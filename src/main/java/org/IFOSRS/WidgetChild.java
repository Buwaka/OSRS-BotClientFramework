package org.IFOSRS;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface WidgetChild extends ClientWrapper
{
    boolean containsMouse();

    boolean equals(java.lang.Object o);

    @Nullable
    java.lang.String[] getActions();


    @Nullable
    WidgetChild getChild(int id);

    @Nonnull
    java.util.List<Item> getChildItems();

    @Nullable
    WidgetChild[] getChildren();


    int getChildrenCount();

    int getHeight();

    int getID();

    int getIndex();

    @Nonnull
    Item getItem();

    int getItemId();

    @Nonnull
    java.util.List<Item> getItems();

    int getItemStack();

    @Nullable
    java.lang.String getLeftClickAction();

    java.lang.String getName();

    int getParentID();

    int getRealID();

    int getRealParentID();

    @Nonnull
    java.awt.Rectangle getRectangle();


    int getRelativeX();

    int getRelativeY();

    int getScrollMax();

    int getScrollX();

    int getScrollY();

    @Nullable
    java.lang.String getSelectedAction();


    @Nullable
    WidgetChild getSibling(int offset);

    @Nullable
    java.lang.String getSpell();

    int getSpriteAngle();

    @Nonnull
    java.lang.String getText();


    int getWidth();

    int getX();

    int getY();

    boolean hasAction(java.lang.String action);

    boolean hasActionExact(java.lang.String action);

    int hashCode();

    boolean hasListener();

    boolean hasScript();

    boolean interact();

    boolean interact(@Nullable java.lang.String action);

    boolean isGrandChild();

    boolean isHidden();

    boolean isVisible();

}
