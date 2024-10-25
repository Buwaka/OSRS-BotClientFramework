package org.IFOSRS.Singletons.Logging;

import org.IFOSRS.ClientWrapper;


public abstract class Logger implements ClientWrapper
{
    private static Logger instance = null;

    public static void log(Object obj)
    {
        if(instance == null)
        {
            assert false;
        }
        instance._log(obj);
    }

    public static void info(Object obj)
    {
        if(instance == null)
        {
            assert false;
        }
        instance._info(obj);
    }

    public static void warning(Object obj)
    {
        if(instance == null)
        {
            assert false;
        }
        instance._warn(obj);
    }

    public static void debug(Object obj)
    {
        if(instance == null)
        {
            assert false;
        }
        instance._debug(obj);
    }

    public static void error(Object obj)
    {
        if(instance == null)
        {
            assert false;
        }
        instance._error(obj);
    }


    abstract protected void _log(Object obj);
    abstract protected void _info(Object obj);
    abstract protected void _warn(Object obj);
    abstract protected void _debug(Object obj);
    abstract protected void _error(Object obj);


}
