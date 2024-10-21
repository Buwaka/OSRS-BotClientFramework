package org.IFOSRS.Singletons;

import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Tab;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.annotation.Nullable;

public interface Tabs extends ClientWrapper
{
    /**
     * @return     Gets the currently open tab
     */
    static @Nullable Tab getOpen()
    {
        assert false;
        return null;
    }

    /**
     * @param tab
     *
     * @return     Checks if the tab is disabled.
     */
    static boolean isDisabled(@NonNull Tab tab)
    {
        assert false;
        return false;
    }

    /**
     * @param tab
     *
     * @return     Checks if tab is open
     */
    static boolean isOpen(@NonNull Tab tab)
    {
        assert false;
        return false;
    }

    /**
     *     Opens logout tab and clicks logout button
     */
    static void logout()
    {
        assert false;

    }

    /**
     * @param tab
     *
     * @return     Opens specified tab
     */
    static boolean open(@NonNull Tab tab)
    {
        assert false;
        return false;
    }

    /**
     * @param tab
     *
     * @return     Opens the tab using F keys.
     */
    static boolean openWithFKey(@NonNull Tab tab)
    {
        assert false;
        return false;
    }

    /**
     * @param tab
     *
     * @return     Opens the tab using the mouse.
     */
    static boolean openWithMouse(@NonNull Tab tab)
    {
        assert false;
        return false;
    }

}
