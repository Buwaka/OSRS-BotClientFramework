package org.IFOSRS.Singletons;

import org.IFOSRS.Interactive.Player;
import org.IFOSRS.Location.Tiles.Tile;
import org.IFOSRS.PlayerComposite;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public interface Players
{
    static java.util.List<@NonNull Player> all()
    {
        return null;
    }

    static java.util.List<@NonNull Player> all(int... ids)
    {
        return null;
    }

    static java.util.List<@NonNull Player> all(java.lang.String... names)
    {
        return null;
    }

    static java.util.List<@NonNull Player> all(@NonNull Predicate<Player> filter)
    {
        return null;
    }

    static @Nullable Player closest(int... ids)
    {
        return null;
    }

    static @Nullable Player closest(java.lang.String... names)
    {
        return null;
    }

    static @Nullable Player closest(@NonNull Predicate<Player> filter)
    {
        return null;
    }

    static @Nullable Player closest(@NonNull Predicate<Player> filter, @NonNull Tile toTile)
    {
        return null;
    }

    /**
     * @return     Gets all players
     */
    static @Nullable Player @NonNull [] getArray()
    {
        return new Player[0];
    }

    /**
     * @param index
     *
     * @return     Gets a player at a specific index
     */
    static @Nullable Player getAtIndex(int index)
    {
        return null;
    }

    static @Nullable PlayerComposite getComposite(@NonNull Player player, java.lang.Object playerComposite)
    {
        return null;
    }

    /**
     * @return     Gets your player
     */
    static @NonNull Player getLocal()
    {
        return null;
    }

}
