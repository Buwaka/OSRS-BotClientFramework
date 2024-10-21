package org.IFOSRS.Singletons.Prayer;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.IFOSRS.WidgetChild;

@Singleton
public interface Prayers
{
    @Inject
    static boolean flick(Prayer prayer, int delay)
    {
        return false;
    }
    @Inject
    static Prayer[] getActive()
    {
        return new Prayer[0];
    }
    @Inject
    static java.util.List<Prayer> getQuickPrayers()
    {
        return null;
    }
    @Inject
    static WidgetChild getWidgetChild(Prayer prayer)
    {
        return null;
    }
    @Inject
    static WidgetChild getWidgetChildQuickPrayer(Prayer prayer)
    {
        return null;
    }
    @Inject
    static boolean isActive(Prayer prayer)
    {
        return false;
    }
    @Inject
    static boolean isOpen()
    {
        return false;
    }
    @Inject
    static boolean isQuickPrayerActive()
    {
        return false;
    }


    /**
     * @return Opens the prayer Tab
     */
    @Inject
    static boolean openTab()
    {
        return false;
    }


    /**
     * @param prayers
     *
     * @return This will set up your quick prayers to enable only the given Prayer's, disabling any others currently enabled.
     */
    @Inject
    static boolean setupQuickPrayers(Prayer... prayers)
    {
        return false;
    }
    @Inject
    static boolean toggle(boolean active, Prayer prayer)
    {
        return false;
    }


    /**
     * @param active
     *
     * @return Toggles quick prayer
     */
    @Inject
    static boolean toggleQuickPrayer(boolean active)
    {
        return false;
    }

}
