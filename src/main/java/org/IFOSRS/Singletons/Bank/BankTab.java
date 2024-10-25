package org.IFOSRS.Singletons.Bank;

import org.IFOSRS.ClientWrapper;
import org.IFOSRS.WidgetChild;

public enum BankTab implements ClientWrapper
{
    MAIN_TAB,
    FIRST_TAB,
    SECOND_TAB,
    THIRD_TAB,
    FOURTH_TAB,
    FIFTH_TAB,
    SIXTH_TAB,
    SEVENTH_TAB,
    EIGHTH_TAB,
    NINTH_TAB;

    static IBankTab instance = null;

    @Override
    public Object getObject()
    {
        return instance;
    }

    public static int getConfig()
    {
        return instance.getConfig();
    }


    public static WidgetChild getWidgetChild()
    {
        return instance.getWidgetChild();
    }


    public static boolean isOpen()
    {
        return instance.isOpen();
    }


    public static boolean open()
    {
        return instance.open();
    }


    public static int count()
    {
        return instance.count();
    }

    public static WidgetChild getChild()
    {
        return instance.getChild();
    }


    public static int getID()
    {
        return instance.getID();
    }

}
