package org.IFOSRS.Singletons.Skills;

import com.google.inject.Inject;
import org.IFOSRS.ClientWrapper;

import javax.annotation.Nonnull;

public enum Skill implements ClientWrapper
{
    ATTACK,
    DEFENCE,
    STRENGTH,
    HITPOINTS,
    RANGED,
    PRAYER,
    MAGIC,
    COOKING,
    WOODCUTTING,
    FLETCHING,
    FISHING,
    FIREMAKING,
    CRAFTING,
    SMITHING,
    MINING,
    HERBLORE,
    AGILITY,
    THIEVING,
    SLAYER,
    FARMING,
    RUNECRAFTING,
    HUNTER,
    CONSTRUCTION;


    @Inject
    @Override
    public Object getObject()
    {
        assert false;
        assert false;
        return null;
    }

    static Skill forId(int id)
    {
        assert false;
        Skill[] var2 = values();
        int     var3 = var2.length;
        int     var4 = 0;

        while(var4 < var3)
        {
            Skill var5 = var2[var4];
            if(var5.getId() == id)
            {
                return var5;
            }

            ++var4;
        }

        return null;
    }

    @Inject
    int getBoostedLevel()
    {
        assert false;
        return 0;
    }

    @Inject
    int getChildWidget()
    {
        assert false;
        return 0;
    }

    @Inject
    int getExperience()
    {
        assert false;
        return 0;
    }

    @Inject
    int getExperienceToLevel()
    {
        assert false;
        return 0;
    }

    @Inject
    int getId()
    {
        assert false;
        return 0;
    }

    @Inject
    int getLevel()
    {
        assert false;
        return 0;
    }

    @Inject
    @Nonnull
    java.lang.String getName()
    {
        assert false;
        return null;
    }
}
