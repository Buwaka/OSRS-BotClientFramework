package org.IFOSRS.Singletons.Quest;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.IFOSRS.ClientWrapper;

@Singleton
public interface Quests extends ClientWrapper
{
    @Inject
    static int getQuestPoints()
    {
        return -1;
    }

    @Inject
    static boolean isFinished(Quest quest)
    {
        return false;
    }

    @Inject
    static boolean isStarted(Quest quest)
    {
        return false;
    }

}
