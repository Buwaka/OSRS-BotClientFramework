package org.IFOSRS.Requirement;

import org.IFOSRS.Singletons.Combat;


public class CombatRequirement implements Requirement
{
    private static final long serialVersionUID = -3762054831327359432L;
    public               int  Level;

    public CombatRequirement(int level)
    {
        Level = level;
    }

    /**
     * @return
     */
    @Override
    public RequirementType GetRequirementType()
    {
        return RequirementType.CombatLevel;
    }

    /**
     * @return
     */
    @Override
    public boolean isRequirementMet()
    {
        return Combat.getCombatLevel() >= Level;
    }
}
