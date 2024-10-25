package org.IFOSRS.Singletons.Client;

import org.IFOSRS.CollisionMap;

public interface IClient
{
    Client.ClientType getClientType();
    boolean isMembers();
    Client.GameState getGameState();
    int getBaseX();
    int getBaseY();
    CollisionMap getCollisionMaps();
    byte[][][] getTileSettings();
}
