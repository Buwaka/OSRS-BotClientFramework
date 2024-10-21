package org.IFOSRS.Singletons.Quest;

import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Requirement.Requirement;
import org.IFOSRS.WidgetChild;

public enum MiniQuest implements Quest, ClientWrapper
{
    ENTER_THE_ABYSS,
    ARCHITECTURAL_ALLIANCE,
    BEAR_YOUR_SOUL,
    ALFRED_GRIMHANDS_BARCRAWL,
    CURSE_OF_THE_EMPTY_LORD,
    ENCHANTED_KEY,
    THE_GENERALS_SHADOW,
    SKIPPY_AND_THE_MOGRES,
    THE_MAGE_ARENA,
    LAIR_OF_TARN_RAZORLOR,
    FAMILY_PEST,
    THE_MAGE_ARENA_2,
    IN_SEARCH_OF_KNOWLEDGE,
    DADDYS_HOME,
    THE_FROZEN_DOOR,
    HOPESPEARS_WILL,
    INTO_THE_TOMBS,
    BARBARIAN_TRAINING,
    HIS_FAITHFUL_SERVANTS;

    @Override
    public boolean find()
    {
        assert false;
        return false;
    }

    @Override
    public int getChild()
    {
        assert false;
        return 0;
    }

    @Override
    public int getColor()
    {
        assert false;
        return 0;
    }

    @Override
    public int getConfigID()
    {
        assert false;
        return 0;
    }

    @Override
    public int getConfigValue()
    {
        assert false;
        return 0;
    }

    @Override
    public int getFinishedSetting()
    {
        assert false;
        return 0;
    }

    @Override
    public int getGrandChild()
    {
        assert false;
        return 0;
    }

    @Override
    public int getParent()
    {
        assert false;
        return 0;
    }

    @Override
    public int getQP()
    {
        assert false;
        return 0;
    }

    @Override
    public Requirement getQuests()
    {
        assert false;
        return null;
    }

    @Override
    public int[] getSettings()
    {
        assert false;
        return new int[0];
    }

    @Override
    public Requirement getSkills()
    {
        assert false;
        return null;
    }

    @Override
    public int getStartedSetting()
    {
        assert false;
        return 0;
    }

    @Override
    public State getState()
    {
        assert false;
        return null;
    }

    @Override
    public Type getType()
    {
        assert false;
        return null;
    }

    @Override
    public int getVarBitID()
    {
        assert false;
        return 0;
    }

    @Override
    public WidgetChild getWidgetChild()
    {
        assert false;
        return null;
    }

    @Override
    public boolean hasRequirements()
    {
        assert false;
        return false;
    }

    @Override
    public boolean isFinished()
    {
        assert false;
        return false;
    }

    @Override
    public boolean isStarted()
    {
        assert false;
        return false;
    }

    @Override
    public Object getObject()
    {
        assert false;
        return null;
    }
}
