package org.IFOSRS.Singletons.Skills;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.IFOSRS.ClientWrapper;
import org.checkerframework.checker.nullness.qual.NonNull;

@Singleton
public interface Skills extends ClientWrapper
{
    /**
     * @param skill
     *
     * @return Gets top level for skill
     */
    @Inject
    static int getBoostedLevel(@NonNull Skill skill)
    {
        return 0;
    }

    /**
     * @return     Get all boosted levels When level shows 11/9, this method returns 11
     */
    @Inject
    static int[] getBoostedLevels()
    {
        return new int[0];
    }


    /**
     * @return     Gets all experience
     */
    @Inject
    static int[] getExperience()
    {
        return new int[0];
    }

    @Inject
    static int getExperience(@NonNull Skill skill)
    {
        return 0;
    }

    /**
     * @param level Gets experience for level
     *
     * @return
     */
    @Inject
    static int getExperienceForLevel(int level)
    {
        return 0;
    }


    /**
     * @param skill
     *
     * @return    Gets experience to next level for skill
     */
    @Inject
    static int getExperienceToLevel(@NonNull Skill skill)
    {
        return 0;
    }


    /**
     * @return     Gets all levels based on experience When skill shows 11/9, this method has 9
     */
    @Inject
    static int[] getLevels()
    {
        return new int[0];
    }


    /**
     * @param skill     Gets current level for skill
     *
     * @return
     */
    @Inject
    static int getRealLevel(@NonNull Skill skill)
    {
        return 0;
    }


    /**
     * @return     Gets the total level of your character
     */
    @Inject
    static int getTotalLevel()
    {
        return 0;
    }


    /**
     * @param skill
     *
     * @return     hovers over skill
     */
    @Inject
    static boolean hoverSkill(@NonNull Skill skill)
    {
        return false;
    }


    /**
     * @return     Opens the skills Tab
     */
    @Inject
    static boolean open()
    {
        return false;
    }

}
