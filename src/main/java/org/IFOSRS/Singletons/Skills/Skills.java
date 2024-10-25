package org.IFOSRS.Singletons.Skills;

import com.google.inject.Inject;
import org.IFOSRS.ClientWrapper;
import org.checkerframework.checker.nullness.qual.NonNull;


public class Skills implements ClientWrapper
{
    @Inject
    static ISkills instance = null;

    @Override
    public Object getObject()
    {
        return instance;
    }

    /**
     * @param skill
     *
     * @return Gets top level for skill
     */

    public static int getBoostedLevel(@NonNull Skill skill)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getBoostedLevel(skill);
    }

    /**
     * @return Get all boosted levels When level shows 11/9, this method returns 11
     */

    public static int[] getBoostedLevels()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getBoostedLevels();
    }


    /**
     * @return Gets all experience
     */

    public static int[] getExperience()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getExperience();
    }


    public static int getExperience(@NonNull Skill skill)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getExperience(skill);
    }

    /**
     * @param level Gets experience for level
     *
     * @return
     */

    public static int getExperienceForLevel(int level)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getExperienceForLevel(level);
    }


    /**
     * @param skill
     *
     * @return Gets experience to next level for skill
     */

    public static int getExperienceToLevel(@NonNull Skill skill)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getExperienceToLevel(skill);
    }


    /**
     * @return Gets all levels based on experience When skill shows 11/9, this method has 9
     */

    public static int[] getLevels()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getLevels();
    }


    /**
     * @param skill Gets current level for skill
     *
     * @return
     */

    public static int getRealLevel(@NonNull Skill skill)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getRealLevel(skill);
    }


    /**
     * @return Gets the total level of your character
     */

    static int getTotalLevel()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.getTotalLevel();
    }


    /**
     * @param skill
     *
     * @return hovers over skill
     */

    public static boolean hoverSkill(@NonNull Skill skill)
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.hoverSkill(skill);
    }


    /**
     * @return Opens the skills Tab
     */

    public static boolean open()
    {
        if(instance == null)
        {
            throw new IllegalStateException("Instance is null");
        }
        return instance.open();
    }

}
