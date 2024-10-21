package org.IFOSRS.Singletons.Prayer;

import com.google.inject.Inject;
import org.IFOSRS.ClientWrapper;
import org.IFOSRS.WidgetChild;

public enum Prayer implements ClientWrapper
{
    THICK_SKIN,
    BURST_OF_STRENGTH,
    CLARITY_OF_THOUGHT,
    SHARP_EYE,
    MYSTIC_WILL,
    ROCK_SKIN,
    SUPERHUMAN_STRENGTH,
    IMPROVED_REFLEXES,
    RAPID_RESTORE,
    RAPID_HEAL,
    PROTECT_ITEM,
    HAWK_EYE,
    MYSTIC_LORE,
    STEEL_SKIN,
    ULTIMATE_STRENGTH,
    INCREDIBLE_REFLEXES,
    PROTECT_FROM_MAGIC,
    PROTECT_FROM_MISSILES,
    PROTECT_FROM_MELEE,
    EAGLE_EYE,
    MYSTIC_MIGHT,
    RETRIBUTION,
    REDEMPTION,
    SMITE,
    PRESERVE,
    CHIVALRY,
    PIETY,
    RIGOUR,
    AUGURY;


    @Override
    public Object getObject()
    {
        assert false;
        return null;
    }

    @Inject
    int getChildIndex()
    {
        assert false;
        return -1;
    }

    @Inject
    int getLevel()
    {
        assert false;
        return -1;
    }

    @Inject
    int getQuickPrayerChild()
    {
        assert false;
        return -1;
    }

    @Inject
    int getSetting()
    {
        assert false;
        return -1;
    }

    @Inject
    WidgetChild getWidgetChild()
    {
        assert false;
        return null;
    }

    @Inject
    int getWidgetIndex()
    {
        assert false;
        return 0;
    }

    static Prayer of(java.lang.String name)
    {
        assert false;
        if (name == null) {
            return null;
        }
        Prayer[] var2 = values();
        int var3 = var2.length;
        int var4 = 0;

        while(var4 < var3) {
            Prayer var5 = var2[var4];
            if (var5.toString().equalsIgnoreCase(name)) {
                return var5;
            }

            ++var4;

        }

        return null;
    }

    @Inject
    public java.lang.String toString()
    {
        assert false;
        return null;
    }
}
