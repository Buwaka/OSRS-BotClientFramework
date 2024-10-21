package org.IFOSRS.Singletons;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Widget;
import org.IFOSRS.WidgetChild;

@Singleton
public interface Widgets extends ClientWrapper
{
    @Inject
    static Widget Get(int id)
    {
        assert false;
        return null;
    }

    @Inject
    static WidgetChild Get(int... ids)
    {
        assert false;
        return null;
    }
}
