package org.IFOSRS.Singletons.Client;

import com.google.inject.Inject;
import org.IFOSRS.ClientWrapper;
import org.IFOSRS.CollisionMap;

import javax.annotation.Nonnull;


public class Client implements ClientWrapper
{
    @Inject
    static IClient instance = null;

    public enum ClientType
    {
        DreamBot,
        EternalClient
    }

    @Override
    public Object getObject()
    {
        return instance;
    }


    public static ClientType getClientType()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getClientType();
    }


    public static boolean isMembers()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.isMembers();
    }

    /*@MagicConstant(flagsFromClass=net.eternalclient.api.data.CollisionDataFlag.class) int[][] getFlags()
        Gets a 2D array of tile collision flags.
        The array covers all tiles in the scene (104x104), and the index into the array is of format [x][y] where x and y are the tiles scene coordinates, respectively.
        Collision flags are checked using the bitwise and (&) operator. Flag values can be obtained and used with the CollisionDataFlag class.

        Returns:
        all collision flags for the tiles in the scene*/

    public static CollisionMap getCollisionMaps()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getCollisionMaps();
    }


    public static byte[][][] getTileSettings()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getTileSettings();
    }

    public enum GameState
    {
        /**
         * Unknown game state.
         */
        UNKNOWN(-1),
        /**
         * The client is starting.
         */
        STARTING(0),
        /**
         * The client is at the login screen.
         */
        LOGIN_SCREEN(10),
        /**
         * The client is at the login screen entering authenticator code.
         */
        LOGIN_SCREEN_AUTHENTICATOR(11),
        /**
         * There is a player logging in.
         */
        LOGGING_IN(20),
        /**
         * The game is being loaded.
         */
        LOADING(25),
        /**
         * The user has successfully logged in.
         */
        LOGGED_IN(30),
        /**
         * Connection to the server was lost.
         */
        CONNECTION_LOST(40),
        /**
         * A world hop is taking place.
         */
        HOPPING(45);

        /**
         * The raw state value.
         */
        private final int state;

        GameState(int state)
        {
            this.state = state;
        }

        /**
         * Utility method that maps the rank value to its respective
         * {@link GameState} value.
         *
         * @param state the raw state value
         *
         * @return the gamestate
         */
        public static GameState of(int state)
        {
            for(GameState gs : GameState.values())
            {
                if(gs.state == state)
                {
                    return gs;
                }
            }
            return UNKNOWN;
        }
    }


    @Nonnull
    public static GameState getGameState()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getGameState();
    }

    public static int getBaseY()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getBaseY();
    }

    public static int getBaseX()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getBaseX();
    }
}
