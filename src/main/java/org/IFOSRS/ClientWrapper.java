package org.IFOSRS;

public interface ClientWrapper
{
    /**
     * @return Get the original, unwrapped, object from the client, needs to be casted
     */
    Object getObject();
}
