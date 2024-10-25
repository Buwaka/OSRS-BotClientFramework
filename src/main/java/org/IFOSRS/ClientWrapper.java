package org.IFOSRS;

public interface ClientWrapper
{
    /**
     * Retrieves the original client object, needs to be cast to the right type depending on the client being used
     *
     * @return the object reference to the original client object
     */
    public Object getObject();
}
