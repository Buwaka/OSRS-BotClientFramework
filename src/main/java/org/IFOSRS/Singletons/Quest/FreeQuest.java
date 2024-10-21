package org.IFOSRS.Singletons.Quest;

import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Requirement.Requirement;
import org.IFOSRS.WidgetChild;

public enum FreeQuest implements Quest, ClientWrapper
{
    BELOW_ICE_MOUNTAIN,
    BLACK_KNIGHTS_FORTRESS,
    COOKS_ASSISTANT,
    CORSAIR_CURSE,
    DEMON_SLAYER,
    DORICS_QUEST,
    DRAGON_SLAYER,
    ERNEST_THE_CHICKEN,
    GOBLIN_DIPLOMACY,
    IMP_CATCHER,
    THE_KNIGHTS_SWORD,
    MISTHALIN_MYSTERY,
    PIRATES_TREASURE,
    PRINCE_ALI_RESCUE,
    THE_RESTLESS_GHOST,
    ROMEO_AND_JULIET,
    RUNE_MYSTERIES,
    SHEEP_SHEARER,
    SHIELD_OF_ARRAV,
    VAMPIRE_SLAYER,
    WITCHS_POTION,
    X_MARKS_THE_SPOT;

    @Override
    public Object getObject()
    {
        assert false;
        return null;
    }

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
}
