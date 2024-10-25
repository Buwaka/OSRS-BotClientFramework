package org.IFOSRS.Singletons.Bank;

import org.IFOSRS.WidgetChild;

public interface IBankTab
{
    int count();
    WidgetChild getChild();
    int getConfig();
    int getID();
    WidgetChild getWidgetChild();
    boolean isOpen();
    boolean open();
}
