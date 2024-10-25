package org.IFOSRS.Singletons.Skills;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.checkerframework.checker.formatter.qual.InvalidFormat;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/*$InternalInterfaceModifier$*/ interface ISkills
{
     int getBoostedLevel(Skill skill);

     int[] getBoostedLevels();

     int[] getExperience();

     int getExperience(Skill skill);

     int getExperienceForLevel(int level);

     int getExperienceToLevel(Skill skill);

     int[] getLevels();

     int getRealLevel(Skill skill);

     int getTotalLevel();

     boolean hoverSkill(Skill skill);

     boolean open();
    
}
