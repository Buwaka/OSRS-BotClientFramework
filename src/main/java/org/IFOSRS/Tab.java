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


    
    /**
     * {@inheritDoc}
     */
    @Override
    public Object getObject()
    {
        return null;
    }

    
    @Nullable
    WidgetChild getWidget()
    {
        return null;
    }

    
    boolean isDisabled()
    {
        return false;
    }

    
    boolean isOpen()
    {
        return false;
    }

    
    boolean open()
    {
        return false;
    }

    
    public java.lang.String toString()
    {
        return null;
    }
}
