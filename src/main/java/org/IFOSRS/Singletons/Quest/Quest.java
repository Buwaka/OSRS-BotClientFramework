package org.IFOSRS.Singletons.Quest;

import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Requirement.Requirement;
import org.IFOSRS.WidgetChild;

public interface Quest extends ClientWrapper
{
    boolean find();

    int getChild();

    int getColor();

    int getConfigID();

    int getConfigValue();

    int getFinishedSetting();

    int getGrandChild();

    int getParent();

    int getQP();

    Requirement getQuests();

    int[] getSettings();

    Requirement getSkills();

    int getStartedSetting();

    enum State
    {
        FINISHED,
        INVALID,
        NOT_STARTED,
        STARTED
    }

    Quest.State getState();

    enum Type
    {
        F2P,
        MINIQUEST,
        P2P
    }

    Quest.Type getType();

    int getVarBitID();

    WidgetChild getWidgetChild();

    boolean hasRequirements();

    boolean isFinished();

    boolean isStarted();

    static Quest[] values()
    {
        return null;
    }
}
