package org.IFOSRS.Singletons;

import org.IFOSRS.ClientWrapper;

public interface PlayerSettings extends ClientWrapper
{
    static int getBitValue(int varbit)
    {
        assert false;
        return Varbit.getBitValue(varbit);
    }

    static int getConfig(int id)
    {
        assert false;
        return Varplayer.GetConfig(id);
    }
}
