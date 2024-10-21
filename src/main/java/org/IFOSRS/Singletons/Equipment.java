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
    @Inject
    static java.util.List<Item> all()
    {
        assert false;
        return null;
    }

    @Inject
    static java.util.List<Item> all(@NonNull Predicate<Item> filter)
    {
        assert false;
        return null;
    }

    /**
     * @return Gets the capacity for the equipment interface
     */
    @Inject
    static int capacity()
    {
        assert false;
        return 0;
    }

    @Inject
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
    @Inject
    static boolean contains(int... ids)
    {
        assert false;
        return false;
    }

    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
    static int count(java.lang.String name)
    {
        assert false;
        return 0;
    }

    /**
     * @return Gets the number of slots that do not contain items
     */
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
    static java.util.List<@NonNull Item> except(@NonNull Predicate<Item> filter)
    {
        assert false;
        return null;
    }

    /**
     * @return Gets the number of slots that contains items
     */
    @Inject
    static int fullSlotCount()
    {
        assert false;
        return 0;
    }

    @Inject
    static @Nullable Item get(int id)
    {
        assert false;
        return null;
    }

    @Inject
    static @Nullable Item get(int... ids)
    {
        assert false;
        return null;
    }

    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
    static @Nullable Item get(java.lang.String... names)
    {
        assert false;
        return null;
    }

    /**
     * @return Gets the first empty slot in your equipment.
     */
    @Inject
    static int getFirstEmptySlot()
    {
        assert false;
        return 0;
    }

    /**
     * @return Gets the next full slot in your equipment
     */
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
    static boolean interact(@NonNull EquipmentSlot slot, @Nullable java.lang.String action)
    {
        assert false;
        return false;
    }

    @Inject
    static boolean isEmpty()
    {
        assert false;
        return false;
    }

    /**
     * @return Determines if equipment full.
     */
    @Inject
    static boolean isFull()
    {
        assert false;
        return false;
    }

    /**
     * @return Checks if the internal equipment tables have been loaded Used primarily for ItemEventManagers
     */
    @Inject
    static boolean isLoaded()
    {
        assert false;
        return false;
    }

    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
    static boolean onlyContains(java.lang.String... names)
    {
        assert false;
        return false;
    }

    /**
     * @return Opens the equipment tab
     */
    @Inject
    static boolean open()
    {
        assert false;
        return false;
    }

    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
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
    @Inject
    static boolean unequip(@NonNull Predicate<Item> filter)
    {
        assert false;
        return false;
    }

    /**
     * @return Gets the child ID of the WidgetChild for the equipment interface
     */
    @Inject
    static int widgetChildId()
    {
        assert false;
        return 0;
    }

    /**
     * @return Gets the ID of the parent Widget for the Equipment Interface
     */
    @Inject
    static int widgetParentId()
    {
        assert false;
        return 0;
    }

}
