package org.IFOSRS.Singletons.Prayer;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.IFOSRS.WidgetChild;


public interface Prayers
{
    
    static boolean flick(Prayer prayer, int delay)
    {
        return false;
    }
    
    static Prayer[] getActive()
    {
        return new Prayer[0];
    }
    
    static java.util.List<Prayer> getQuickPrayers()
    {
        return null;
    }
    
    static WidgetChild getWidgetChild(Prayer prayer)
    {
        return null;
    }
    
    static WidgetChild getWidgetChildQuickPrayer(Prayer prayer)
    {
        return null;
    }
    
    static boolean isActive(Prayer prayer)
    {
        return false;
    }
    
    static boolean isOpen()
    {
        return false;
    }
    
    static boolean isQuickPrayerActive()
    {
        return false;
    }


    /**
     * @return Opens the prayer Tab
     */
    
    static boolean openTab()
    {
        return false;
    }


    /**
     * @param prayers
     *
     * @return This will set up your quick prayers to enable only the given Prayer's, disabling any others currently enabled.
     */
    
    static boolean setupQuickPrayers(Prayer... prayers)
    {
        return false;
    }
    
    static boolean toggle(boolean active, Prayer prayer)
    {
        return false;
    }


    /**
     * @param active
     *
     * @return Toggles quick prayer
     */
    
    static boolean toggleQuickPrayer(boolean active)
    {
        return false;
    }

}
