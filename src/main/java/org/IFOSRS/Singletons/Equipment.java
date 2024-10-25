package org.IFOSRS.Singletons;

import com.google.gson.annotations.SerializedName;
import com.google.inject.Inject;
import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Item;
import org.IFOSRS.WidgetChild;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public interface Equipment extends ClientWrapper
{
    
    static java.util.List<Item> all()
    {
        assert false;
        return null;
    }

    
    static java.util.List<Item> all(@NonNull Predicate<Item> filter)
    {
        assert false;
        return null;
    }

    /**
     * @return Gets the capacity for the equipment interface
     */
    
    static int capacity()
    {
        assert false;
        return 0;
    }

    
    static boolean contains(int id)
    {
        assert false;
        return false;
    }

    /**
     * @param ids
     *
     * @return true if any of the IDs match
     */
    
    static boolean contains(int... ids)
    {
        assert false;
        return false;
    }

    
    static boolean contains(@NonNull Predicate<Item> filter)
    {
        assert false;
        return false;
    }

    /**
     * @param string
     *
     * @return Determines if collection contains item with specified name.
     */
    
    static boolean contains(java.lang.String string)
    {
        assert false;
        return false;
    }

    /**
     * @param names
     *
     * @return Checks if your equipment contains one item which meets one of the specified names.
     */
    
    static boolean contains(java.lang.String... names)
    {
        assert false;
        return false;
    }

    /**
     * @param ids
     *
     * @return Checks if your equipment contains all of the items with specified IDs
     */
    
    static boolean containsAll(int... ids)
    {
        assert false;
        return false;
    }

    /**
     * @param collection
     *
     * @return Checks if your equipment contains all of the items in the collections
     */
    
    static boolean containsAll(java.util.Collection<Item> collection)
    {
        assert false;
        return false;
    }

    /**
     * @param names
     *
     * @return Checks if your equipment contains all of the items with names specified
     */
    
    static boolean containsAll(java.lang.String... names)
    {
        assert false;
        return false;
    }

    /**
     * @param id
     *
     * @return Count of all the items that match the search.
     */
    
    static int count(int id)
    {
        assert false;
        return 0;
    }

    /**
     * @param filter
     *
     * @return Count of all the items that match the search.
     */
    
    static int count(@NonNull Predicate<Item> filter)
    {
        assert false;
        return 0;
    }

    /**
     * @param name
     *
     * @return Count of all the items that match the search.
     */
    
    static int count(java.lang.String name)
    {
        assert false;
        return 0;
    }

    /**
     * @return Gets the number of slots that do not contain items
     */
    
    static int emptySlotCount()
    {
        assert false;
        return 0;
    }

    public enum EquipmentSlot
    {
        head,
        cape,
        neck,
        weapon,
        body,
        shield,
        legs,
        hands,
        feet,
        ring,
        ammo,
        @SerializedName("2h") two_handed;
    }

    /**
     * @param slot
     * @param filter
     *
     * @return Equips the first item that matches the given filter in the slot provided
     */
    
    static boolean equip(@NonNull EquipmentSlot slot, @NonNull Predicate<Item> filter)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     * @param ids
     *
     * @return Equips the first item that matches one of the given IDs in the slot provided
     */
    
    static boolean equip(@NonNull EquipmentSlot slot, java.lang.Integer... ids)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     * @param names
     *
     * @return Equips the first item that matches one of the given names in the slot provided
     */
    
    static boolean equip(@NonNull EquipmentSlot slot, java.lang.String... names)
    {
        assert false;
        return false;
    }

    /**
     * @param filter
     *
     * @return Get all items which do not fit the given criteria.
     */
    
    static java.util.List<@NonNull Item> except(@NonNull Predicate<Item> filter)
    {
        assert false;
        return null;
    }

    /**
     * @return Gets the number of slots that contains items
     */
    
    static int fullSlotCount()
    {
        assert false;
        return 0;
    }

    
    static @Nullable Item get(int id)
    {
        assert false;
        return null;
    }

    
    static @Nullable Item get(int... ids)
    {
        assert false;
        return null;
    }

    
    static @Nullable Item get(@NonNull Predicate<Item> filter)
    {
        assert false;
        return null;
    }

    /**
     * @param ids
     *
     * @return Get first item that matches.
     */
    
    static @Nullable Item get(java.lang.Integer... ids)
    {
        assert false;
        return null;
    }

    /**
     * @param name
     *
     * @return Get item for specified name.
     */
    
    static @Nullable Item get(java.lang.String name)
    {
        assert false;
        return null;
    }

    /**
     * @param names
     *
     * @return Get first item that matches.
     */
    
    static @Nullable Item get(java.lang.String... names)
    {
        assert false;
        return null;
    }

    /**
     * @return Gets the first empty slot in your equipment.
     */
    
    static int getFirstEmptySlot()
    {
        assert false;
        return 0;
    }

    /**
     * @return Gets the next full slot in your equipment
     */
    
    static int getFirstFullSlot()
    {
        assert false;
        return 0;
    }

    /**
     * @param slot
     *
     * @return Gets the Id of the Item in the slot.
     */
    
    static int getIdForSlot(int slot)
    {
        assert false;
        return 0;
    }

    /**
     * @param slot
     *
     * @return Gets the ID of the Item in the EquipmentSlot
     */
    
    static int getIdForSlot(@NonNull EquipmentSlot slot)
    {
        assert false;
        return 0;
    }

    /**
     * @param slot
     *
     * @return Gets item in specified slot.
     */
    
    static @Nullable Item getItemInSlot(int slot)
    {
        assert false;
        return null;
    }

    /**
     * @param equipmentSlot
     *
     * @return Gets item in specified slot.
     */
    
    static @Nullable Item getItemInSlot(@NonNull EquipmentSlot equipmentSlot)
    {
        assert false;
        return null;
    }

    /**
     * @param slot
     *
     * @return Gets the Name for the Item in the slot.
     */
    
    static @Nullable java.lang.String getNameForSlot(int slot)
    {
        assert false;
        return null;
    }

    /**
     * @param slot
     *
     * @return Gets the Name for the Item in the EquipmentSlot.
     */
    
    static @Nullable java.lang.String getNameForSlot(@NonNull EquipmentSlot slot)
    {
        assert false;
        return null;
    }

    /**
     * @param slot
     *
     * @return Gets the rectangular bounds of the WidgetChild for the given EquipmentSlot
     */
    
    static @Nullable java.awt.Rectangle getSlotBounds(@NonNull EquipmentSlot slot)
    {
        assert false;
        return null;
    }

    /**
     * @param filter
     *
     * @return Gets the EquipmentSlot for a given item filter
     */
    
    static @Nullable EquipmentSlot getSlotForItem(@NonNull Predicate<Item> filter)
    {
        assert false;
        return null;
    }

    /**
     * @param slot
     *
     * @return Gets the WidgetChild for the EquipmentSlot given
     */
    
    static @Nullable WidgetChild getWidgetForSlot(@NonNull EquipmentSlot slot)
    {
        assert false;
        return null;
    }

    /**
     * @param slot
     * @param action
     *
     * @return Interacts with the slot specified with the action specified Opens the Tab.EQUIPMENT tab if needed
     */
    
    static boolean interact(@NonNull EquipmentSlot slot, @Nullable java.lang.String action)
    {
        assert false;
        return false;
    }

    
    static boolean isEmpty()
    {
        assert false;
        return false;
    }

    /**
     * @return Determines if equipment full.
     */
    
    static boolean isFull()
    {
        assert false;
        return false;
    }

    /**
     * @return Checks if the internal equipment tables have been loaded Used primarily for ItemEventManagers
     */
    
    static boolean isLoaded()
    {
        assert false;
        return false;
    }

    
    static boolean isOpen()
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     *
     * @return Checks if the given slot is empty Uses the values from EquipmentSlot.getSlot()
     */
    
    static boolean isSlotEmpty(int slot)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     *
     * @return Checks if the given EquipmentSlot is empty
     */
    
    static boolean isSlotEmpty(@NonNull EquipmentSlot slot)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     *
     * @return Checks if the slot has an Item in it slot is based on EquipmentSlot.getSlot()
     */
    
    static boolean isSlotFull(int slot)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     *
     * @return Checks if the given EquipmentSlot is full
     */
    
    static boolean isSlotFull(@NonNull EquipmentSlot slot)
    {
        assert false;
        return false;
    }

    /**
     * @param ids
     *
     * @return Checks if your Equipment only contains items with specified IDs
     */
    
    static boolean onlyContains(int... ids)
    {
        assert false;
        return false;
    }

    /**
     * @param filter
     *
     * @return Checks if your Equipment only contains items that match the Filter
     */
    
    static boolean onlyContains(@NonNull Predicate<Item> filter)
    {
        assert false;
        return false;
    }

    /**
     * @param names
     *
     * @return Checks if your equipment only contains items with specified names
     */
    
    static boolean onlyContains(java.lang.String... names)
    {
        assert false;
        return false;
    }

    /**
     * @return Opens the equipment tab
     */
    
    static boolean open()
    {
        assert false;
        return false;
    }

    
    static int size()
    {
        assert false;
        return 0;
    }

    /**
     * @param id
     *
     * @return Gets the slot for the item with specified ID.
     */
    
    static int slot(int id)
    {
        assert false;
        return 0;
    }

    /**
     * @param name
     *
     * @return Gets the slot for the item with specified name.
     */
    
    static int slot(java.lang.String name)
    {
        assert false;
        return 0;
    }

    /**
     * @param filter Gets the slot for the item that matches specified filter.
     *
     * @return
     */
    
    static int slot(@NonNull Predicate<Item> filter)
    {
        assert false;
        return 0;
    }

    /**
     * @param slot
     * @param filter
     *
     * @return Checks if the slot contains items that matches the filter.
     */
    
    static boolean slotContains(int slot, @NonNull Predicate<Item> filter)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     * @param item
     *
     * @return Checks if the slot contains the given Item slot based on EquipmentSlot.getSlot()
     */
    
    static boolean slotContains(int slot, @NonNull Item item)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     * @param ids
     *
     * @return Checks if the slot contains an item that matches any the given ids.
     */
    
    static boolean slotContains(int slot, int... ids)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     * @param name
     *
     * @return Checks if the slot contains an Item that matches the given name.
     */
    
    static boolean slotContains(int slot, java.lang.String name)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     * @param names
     *
     * @return Checks if the slot contains any items that match the given names.
     */
    
    static boolean slotContains(int slot, java.lang.String... names)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     * @param filter
     *
     * @return Checks if the EquipmentSlot contains items that matches the given filter.
     */
    
    static boolean slotContains(@NonNull EquipmentSlot slot, @NonNull Predicate<Item> filter)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     * @param item
     *
     * @return Checks if the EquipmentSlot contains the given Item
     */
    
    static boolean slotContains(@NonNull EquipmentSlot slot, @NonNull Item item)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     * @param ids
     *
     * @return Checks if the EquipmentSlot contains an item that matches any the given ids.
     */
    
    static boolean slotContains(@NonNull EquipmentSlot slot, java.lang.Integer... ids)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     * @param name
     *
     * @return Checks if the EquipmentSlot contains an item that matches the given name.
     */
    
    static boolean slotContains(@NonNull EquipmentSlot slot, java.lang.String name)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     * @param names
     *
     * @return Checks if the EquipmentSlot contains any items that match the given names.
     */
    
    static boolean slotContains(@NonNull EquipmentSlot slot, java.lang.String... names)
    {
        assert false;
        return false;
    }


    /**
     * @param slot
     *
     * @return Unequips the equipment from the equipment slot
     */
    
    static boolean unequip(@NonNull EquipmentSlot slot)
    {
        assert false;
        return false;
    }

    /**
     * @param filter
     *
     * @return Unequips an item that matches the given Filter
     */
    
    static boolean unequip(@NonNull Predicate<Item> filter)
    {
        assert false;
        return false;
    }

    /**
     * @return Gets the child ID of the WidgetChild for the equipment interface
     */
    
    static int widgetChildId()
    {
        assert false;
        return 0;
    }

    /**
     * @return Gets the ID of the parent Widget for the Equipment Interface
     */
    
    static int widgetParentId()
    {
        assert false;
        return 0;
    }

}
