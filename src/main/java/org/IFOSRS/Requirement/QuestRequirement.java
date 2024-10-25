package org.IFOSRS.Requirement;

import org.IFOSRS.Singletons.Logging.Logger;
import org.IFOSRS.Singletons.Quest.FreeQuest;
import org.IFOSRS.Singletons.Quest.MiniQuest;
import org.IFOSRS.Singletons.Quest.PaidQuest;
import org.IFOSRS.Singletons.Quest.Quest;


public class QuestRequirement implements Requirement
{
    private static final long       serialVersionUID = 8659572019539432254L;
    private transient    Quest      quest            = null;
    private              Quest.Type QuestType        = null;
    private              String     QuestName        = null;

    public QuestRequirement(Quest quest)
    {
        this.quest = quest;
        QuestType  = quest.getType();
        QuestName  = quest.toString();
    }

    public QuestRequirement(String Name, Quest.Type type)
    {
        QuestType = type;
        QuestName = Name;
        switch(type)
        {
            case F2P:
            {
                quest = FreeQuest.valueOf(QuestName);
            }
            break;
            case P2P:
            {
                quest = PaidQuest.valueOf(QuestName);
            }
            break;
            case MINIQUEST:
            {
                quest = MiniQuest.valueOf(QuestName);
            }
            break;
        }
    }

    /**
     * @return
     */
    @Override
    public RequirementType GetRequirementType()
    {
        return RequirementType.Quest;
    }

    /**
     * @return
     */
    @Override
    public boolean isRequirementMet()
    {
        Quest questie = GetQuest();
        return questie != null && questie.isFinished();
    }

    public Quest GetQuest()
    {
        if(quest != null)
        {
            return quest;
        }

        if(QuestType != null && QuestName != null)
        {
            switch(QuestType)
            {
                case F2P:
                {
                    quest = FreeQuest.valueOf(QuestName);
                }
                break;
                case P2P:
                {
                    quest = PaidQuest.valueOf(QuestName);
                }
                break;
                case MINIQUEST:
                {
                    quest = MiniQuest.valueOf(QuestName);
                }
                break;
            }
            return quest;
        }

        Logger.log(
                "QuestRequirement: GetQuest: Quest ref, quest type and/or quest name is not defined");
        return null;
    }
}
