package org.IFOSRS.Singletons.Widgets;

import org.IFOSRS.Widget;
import org.IFOSRS.WidgetChild;

public interface IWidgets
{
    Widget Get(int id);
    WidgetChild Get(int... ids);
}
