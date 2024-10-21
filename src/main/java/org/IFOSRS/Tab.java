package org.IFOSRS;

import com.google.inject.Inject;

import javax.annotation.Nullable;

public enum Tab implements ClientWrapper
{
    ACCOUNT_MANAGEMENT,
    CLAN,
    COMBAT,
    EMOTES,
    EQUIPMENT,
    FRIENDS,
    INVENTORY,
    LOGOUT,
    MAGIC,
    MUSIC,
    OPTIONS,
    PRAYER,
    QUEST,
    SKILLS;


    @Inject
    @Override
    public Object getObject()
    {
        return null;
    }

    @Inject
    @Nullable
    WidgetChild getWidget()
    {
        return null;
    }

    @Inject
    boolean isDisabled()
    {
        return false;
    }

    @Inject
    boolean isOpen()
    {
        return false;
    }

    @Inject
    boolean open()
    {
        return false;
    }

    @Inject
    public java.lang.String toString()
    {
        return null;
    }
}
