package org.IFOSRS.Singletons.Quest;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.IFOSRS.ClientWrapper;


public interface Quests extends ClientWrapper
{
    
    static int getQuestPoints()
    {
        return -1;
    }

    
    static boolean isFinished(Quest quest)
    {
        return false;
    }

    
    static boolean isStarted(Quest quest)
    {
        return false;
    }

}
