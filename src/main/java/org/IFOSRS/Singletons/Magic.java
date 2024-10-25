package org.IFOSRS.Singletons;

import com.google.inject.Singleton;
import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Interactive.Entity;
import org.IFOSRS.Item;
import org.IFOSRS.Spell;
import org.IFOSRS.SpellBook;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.annotation.Nullable;


public interface Magic extends ClientWrapper
{
    /**
     * @param spell
     *
     * @return     Checks if you can cast the given spell.
     */
    static boolean canCast(@NonNull Spell spell)
    {
        assert false;
        return false;
    }

    /**
     * @param spell
     * @param useBank
     *
     * @return     Checks if you can cast the given spell Does account for any staffs equipped.
     */
    static boolean canCast(@NonNull Spell spell, boolean useBank)
    {
        assert false;
        return false;
    }

    static boolean castSpell(@NonNull Spell spell)
    {
        assert false;
        return false;
    }

    /**
     * @param spell
     * @param action
     *
     * @return     Casts a spell with the given action
     */
    static boolean castSpell(@NonNull Spell spell, @Nullable java.lang.String action)
    {
        assert false;
        return false;
    }

    /**
     * @param spell
     * @param entity
     *
     * @return     Casts a spell on an entity
     */
    static boolean castSpellOn(@NonNull Spell spell, @NonNull Entity entity)
    {
        assert false;
        return false;
    }

    /**
     * @param spell
     * @param item
     *
     * @return    Casts a spell on an item in inventory
     */
    static boolean castSpellOn(@NonNull Spell spell, @NonNull Item item)
    {
        assert false;
        return false;
    }

    /**
     * @return     Deselects the current spell if one is selected
     */
    static boolean deselect()
    {
        assert false;
        return false;
    }

    /**
     * @return     Gets the active spell that is selected via autocast
     */
    static @Nullable Spell getAutocastSpell()
    {
        assert false;
        return null;
    }

    /**
     * @return     Gets the currently selected spell name
     */
    static @Nullable java.lang.String getSelectedSpellName()
    {
        assert false;
        return null;
    }

    /**
     * @return     Returns the current spellbook
     */
    static @Nullable SpellBook getSpellbook()
    {
        assert false;
        return null;
    }

    /**
     * @param spell 
     * @param action
     *
     * @return     Interacts with the spell with the given action
     */
    static boolean interact(@NonNull Spell spell, @Nullable java.lang.String action)
    {
        assert false;
        return false;
    }

    static boolean isAutocastDefensive()
    {
        assert false;
        return false;
    }

    static boolean isAutocasting()
    {
        assert false;
        return false;
    }

    /**
     * @return     This is used to check if spell filtering is enabled.
     */
    static boolean isSpellFilteringEnabled()
    {
        assert false;
        return false;
    }

    /**
     * @return     Checks if a spell is currently selected
     */
    static boolean isSpellSelected()
    {
        assert false;
        return false;
    }

    static boolean setAutocastSpell(@NonNull Spell spell)
    {
        assert false;
        return false;
    }

    static boolean setDefensiveAutocastSpell(@NonNull Spell spell)
    {
        assert false;
        return false;
    }

    static boolean setSpellFilteringEnabled(boolean enabled)
    {
        assert false;
        return false;
    }
}
