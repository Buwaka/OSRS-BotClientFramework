package org.IFOSRS.Requirement;


import org.IFOSRS.Singletons.Skills.Skill;
import org.IFOSRS.Singletons.Skills.Skills;

import javax.annotation.Nullable;


public class LevelRequirement implements Requirement
{
    private static final long serialVersionUID = 855390922845163754L;
    Skill skill;
    int   level;
    @Nullable
    Integer maxLevel = null;


    public LevelRequirement(Skill skill, int level)
    {
        this.skill = skill;
        this.level = level;
    }

    public LevelRequirement(Skill skill, int level, int MaxLevel)
    {
        this.skill = skill;
        this.level = level;
        maxLevel   = MaxLevel;
    }


    /**
     * @return
     */
    @Override
    public Requirement.RequirementType GetRequirementType()
    {
        return Requirement.RequirementType.Level;
    }

    /**
     * @return
     */
    @Override
    public boolean isRequirementMet()
    {
        if(maxLevel != null)
        {
            return Skills.getRealLevel(skill) >= level && Skills.getRealLevel(skill) < maxLevel;
        }
        return Skills.getRealLevel(skill) >= level;
    }


}
