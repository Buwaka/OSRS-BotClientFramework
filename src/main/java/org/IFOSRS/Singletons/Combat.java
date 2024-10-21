package org.IFOSRS.Singletons;

import com.google.gson.annotations.SerializedName;
import org.IFOSRS.ClientWrapper;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.annotation.Nullable;

public interface Combat extends ClientWrapper
{
    /**
     * @return Returns the current player's combat level
     */
    static int getCombatLevel()
    {
        assert false;
        return 0;
    }

    /**
     * @return Returns the current combat style's mode index (almost always 0-3 inclusive)
     */
    static int getCombatModeIndex()
    {
        assert false;
        return 0;
    }

    /**
     * @return Returns the current combat style
     */
    static @Nullable CombatStyle getCombatStyle()
    {
        assert false;
        return null;
    }

    /**
     * @return Gets your players health percentage as a int (0 - 100), based skills.
     */
    static int getHealthPercent()
    {
        assert false;
        return 0;
    }

    /**
     * @return Gets the actual value of the special attack bar
     */
    static int getSpecialModifier()
    {
        assert false;
        return 0;
    }

    /**
     * @return Gets the percentage of special attack bar.
     */
    static int getSpecialPercentage()
    {
        assert false;
        return 0;
    }

    /**
     * @return Gets the wilderness level that your player is in.
     */
    static int getWildernessLevel()
    {
        assert false;
        return 0;
    }

    /**
     * @return Checks whether your player is immune to poison.
     */
    static boolean hasPoisonImmunity()
    {
        assert false;
        return false;
    }

    /**
     * @return Checks antifire potion protection is active
     */
    static boolean isAntiFireEnabled()
    {
        assert false;
        return false;
    }

    /**
     * @return Checks whether autoretaliate is on.
     */
    static boolean isAutoRetaliateOn()
    {
        assert false;
        return false;
    }

    /**
     * @return Checks whether your player is diseased.
     */
    static boolean isDiseased()
    {
        assert false;
        return false;
    }

    /**
     * @return Checks whether your player is envenomed.
     */
    static boolean isEnvenomed()
    {
        assert false;
        return false;
    }

    /**
     * @return Checks whether your player is in multiway combat zone.
     */
    static boolean isInMultiCombat()
    {
        assert false;
        return false;
    }

    /**
     * @return Checks whether your player is in the wilderness.
     */
    static boolean isInWild()
    {
        assert false;
        return false;
    }

    /**
     * @return Checks whether your player is poisoned.
     */
    static boolean isPoisoned()
    {
        assert false;
        return false;
    }

    /**
     * @return Checks whether special attack is active.
     */
    static boolean isSpecialActive()
    {
        assert false;
        return false;
    }

    /**
     * @return Checks if the super antifire potion protection is active
     */
    static boolean isSuperAntiFireEnabled()
    {
        assert false;
        return false;
    }

    /**
     * @return Opens the Combat tab.
     */
    static boolean openTab()
    {
        assert false;
        return false;
    }

    /**
     * @param index
     *
     * @return Sets the current combat style by index (almost always 0-3 inclusive)
     */
    static boolean setCombatModeIndex(int index)
    {
        assert false;
        return false;
    }

    /**
     * @param combatStyle
     *
     * @return Sets your active combat style
     */
    static boolean setCombatStyle(@NonNull CombatStyle combatStyle)
    {
        assert false;
        return false;
    }

    /**
     * @param enable
     *
     * @return Toggles the autoretaliate option.
     */
    static boolean toggleAutoRetaliate(boolean enable)
    {
        assert false;
        return false;
    }

    /**
     * @param enable
     *
     * @return Toggles the special attack option.
     */
    static boolean toggleSpecialAttack(boolean enable)
    {
        assert false;
        return false;
    }


    public enum CombatStyle
    {
        flare,
        accurate,
        rapid,
        focus,
        jab,
        lunge,
        pummel,
        spike,
        punch,
        hack,
        pound,
        blaze,
        reap,
        block,
        fend,
        smash,
        flick,
        @SerializedName("aim and fire") aim_and_fire,
        @SerializedName("short fuse") short_fuse,
        spell,
        @SerializedName("long fuse") long_fuse,
        longrange,
        chop,
        impale,
        @SerializedName("medium fuse") medium_fuse,
        stab,
        kick,
        swipe,
        @SerializedName("spell (defensive)") spell_defensive,
        deflect,
        lash,
        slash,
        bash,
        scorch;
    }

    public enum Attacktype
    {
        stab,
        slash,
        crush,
        magic,
        ranged,
        @SerializedName("defensive casting") defensive_casting,
        spellcasting;
    }

    public enum AttackStyles
    {
        controlled,
        magic,
        accurate,
        defensive,
        aggressive;
    }


    public enum ExperienceType
    {
        magic,
        shared,
        @SerializedName("magic and defence") magic_and_defence,
        strength,
        defence,
        ranged,
        attack,
        @SerializedName("ranged and defence") ranged_and_defence
    }
}
