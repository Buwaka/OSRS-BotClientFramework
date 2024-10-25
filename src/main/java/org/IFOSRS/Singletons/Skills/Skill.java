package org.IFOSRS.Singletons.Skills;

import com.google.inject.Inject;
import org.IFOSRS.ClientWrapper;

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
    static ISkill instance = null;

    @Override
    public Object getObject()
    {
        return instance;
    }

    public int getBoostedLevel()
    {
        if(instance==null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getBoostedLevel(this);
    }

    public int getExperience()
    {
        if(instance==null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getExperience(this);
    }

    public int getExperienceToLevel()
    {
        if(instance==null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getExperienceToLevel(this);
    }

    public int getId()
    {
        if(instance==null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getId(this);
    }

    public int getLevel()
    {
        if(instance==null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getLevel(this);
    }

    public java.lang.String getName()
    {
        if(instance==null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getName(this);
    }














}
