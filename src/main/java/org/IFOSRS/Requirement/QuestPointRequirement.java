package org.IFOSRS.Requirement;


import org.IFOSRS.Singletons.Quest.Quests;

public class QuestPointRequirement implements Requirement
{

    private static final long serialVersionUID = -7697006643976060405L;
    int ReqQuestPoints;

    public QuestPointRequirement(int QuestPoints)
    {
        ReqQuestPoints = QuestPoints;
    }

    /**
     * @return
     */
    @Override
    public Requirement.RequirementType GetRequirementType()
    {
        return Requirement.RequirementType.QuestPoint;
    }

    /**
     * @return
     */
    @Override
    public boolean isRequirementMet()
    {
        return Quests.getQuestPoints() >= ReqQuestPoints;
    }
}
