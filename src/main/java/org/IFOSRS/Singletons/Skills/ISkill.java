package org.IFOSRS.Singletons.Skills;

public interface ISkill
{
    int getBoostedLevel(Skill skill);

    int getExperience(Skill skill);

    int getExperienceToLevel(Skill skill);

    int getId(Skill skill);

    int getLevel(Skill skill);

    java.lang.String getName(Skill skill);
}
