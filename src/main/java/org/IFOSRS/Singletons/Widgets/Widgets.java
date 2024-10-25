package org.IFOSRS.Singletons.Widgets;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Widget;
import org.IFOSRS.WidgetChild;


public abstract class Widgets implements ClientWrapper
{
    @Inject
    static IWidgets instance = null;


    public static Widget Get(int id)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.Get(id);
    }


    public static WidgetChild Get(int... ids)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.Get(ids);
    }
}
