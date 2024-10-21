package org.IFOSRS.Singletons;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.IFOSRS.ClientWrapper;
import org.IFOSRS.CollisionMap;

import javax.annotation.Nonnull;

@Singleton
public interface Client extends ClientWrapper
{
    enum ClientType
    {
        DreamBot,
        EternalClient
    }

    @Inject
    static ClientType getClientType()
    {
        assert false;
        return null;
    }



    @Inject
    static boolean isMembers()
    {
        assert false;
        return false;
    }

    /*@MagicConstant(flagsFromClass=net.eternalclient.api.data.CollisionDataFlag.class) int[][] getFlags()
        Gets a 2D array of tile collision flags.
        The array covers all tiles in the scene (104x104), and the index into the array is of format [x][y] where x and y are the tiles scene coordinates, respectively.
        Collision flags are checked using the bitwise and (&) operator. Flag values can be obtained and used with the CollisionDataFlag class.

        Returns:
        all collision flags for the tiles in the scene*/
    @Inject
    static CollisionMap getCollisionMaps()
    {
        assert false;
        return null;
    }

    @Inject
    static byte[][][] getTileSettings()
    {
        assert false;
        return new byte[0][][];
    }

    enum GameState
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
         * @return the gamestate
         */
        public static GameState of(int state)
        {
            for (GameState gs : GameState.values())
            {
                if (gs.state == state)
                {
                    return gs;
                }
            }
            return UNKNOWN;
        }
    }

    @Inject
    @Nonnull
    static GameState getGameState()
    {
        assert false;
        return null;
    }

    static int getBaseY()
    {
        assert false;
        return 0;
    }

    static int getBaseX()
    {
        assert false;
        return 0;
    }
}
