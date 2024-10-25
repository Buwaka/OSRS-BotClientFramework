package org.IFOSRS;

import com.google.inject.Inject;

public enum SpellBook implements ClientWrapper
{
    NORMAL,
    ANCIENT,
    LUNAR,
    ARCEUUS;

    
    /**
     * {@inheritDoc}
     */
    @Override
    public Object getObject()
    {
        return null;
    }
}
