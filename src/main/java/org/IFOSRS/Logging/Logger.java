package org.IFOSRS.Logging;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.IFOSRS.ClientWrapper;


public abstract class Logger implements ClientWrapper
{
    @Inject
   private static Logger instance = null;

    @Override
    public Object getObject()
    {
        return null;
    }

    public static void log(Object obj)
    {
        if(instance != null)
        {
            instance._log(obj);
            return;
        }
        assert false;
    }

   abstract protected void _log(Object obj);

    static void info(Object obj)
    {
        assert false;
    }

    static void warning(Object obj)
    {
        assert false;
    }

    static void Error(Object obj)
    {
        assert false;
    }

    static void debug(Object obj)
    {
        assert false;
    }
}
