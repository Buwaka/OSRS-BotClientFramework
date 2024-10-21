package org.IFOSRS.Singletons;

import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Item;
import org.IFOSRS.WidgetChild;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public interface Inventory extends ClientWrapper
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
     * @return Returns the capacity of your inventory (28)
     */
    static int capacity()
    {
        assert false;
        return 0;
    }

    static boolean combine(int primaryItemId, int secondaryItemId)
    {
        assert false;
        return false;
    }

    static boolean combine(java.lang.String primaryItemName, java.lang.String secondaryItemName)
    {
        assert false;
        return false;
    }

    static boolean combine(@NonNull Item primary, @NonNull Item secondary)
    {
        assert false;
        return false;
    }

    static boolean contains(int id)
    {
        assert false;
        return false;
    }

    static boolean contains(int[] ids)
    {
        assert false;
        return false;
    }

    static boolean contains(java.lang.String string)
    {
        assert false;
        return false;
    }

    /**
     * @param names
     *
     * @return Checks if your collection contains one item which meets one of the specified names.
     */
    static boolean contains(java.lang.String... names)
    {
        assert false;
        return false;
    }

    static boolean contains(@NonNull Predicate<Item> filter)
    {
        assert false;
        return false;
    }

    static boolean contains(@Nullable Item item)
    {
        assert false;
        return false;
    }

    /**
     * @param ids
     *
     * @return Checks if your collection contains one item which meets one of the specified ids.
     */
    static boolean contains(java.lang.Integer... ids)
    {
        assert false;
        return false;
    }


    static int count(int id)
    {
        assert false;
        return 0;
    }

    static int count(java.lang.String name)
    {
        assert false;
        return 0;
    }

    static int count(@NonNull Predicate<Item> filter)
    {
        assert false;
        return 0;
    }

    /**
     * @return Deselects any item if it is selected
     */
    static boolean deselect()
    {
        assert false;
        return false;
    }

    /**
     * @param itemId
     * @param toSlot
     *
     * @return This will move the first matching item in the inventory to the provided slot.
     */
    static boolean drag(int itemId, int toSlot)
    {
        assert false;
        return false;
    }

    /**
     * @param itemName
     * @param toSlot
     *
     * @return This will move the first matching item in the inventory to the provided slot.
     */
    static boolean drag(java.lang.String itemName, int toSlot)
    {
        assert false;
        return false;
    }

    /**
     * @param itemFilter
     * @param toSlot
     *
     * @return This will move the first matching item in the inventory to the provided slot.
     */
    static boolean drag(@NonNull Predicate<Item> itemFilter, int toSlot)
    {
        assert false;
        return false;
    }

    /**
     * @param item
     * @param toSlot
     *
     * @return This will move the first matching item in the inventory to the provided slot.
     */
    static boolean drag(@NonNull Item item, int toSlot)
    {
        assert false;
        return false;
    }

    static boolean drop(int id)
    {
        assert false;
        return false;
    }

    static boolean drop(java.lang.String name)
    {
        assert false;
        return false;
    }

    static boolean drop(@NonNull Predicate<Item> filter)
    {
        assert false;
        return false;
    }

    static boolean dropAll()
    {
        assert false;
        return false;
    }

    /**
     * @param id
     *
     * @return Drops all items in your inventory matching specified ID
     */
    static boolean dropAll(int... id)
    {
        assert false;
        return false;
    }

    static boolean dropAll(java.lang.String name)
    {
        assert false;
        return false;
    }

    static boolean dropAll(java.lang.String... names)
    {
        assert false;
        return false;
    }

    static boolean dropAll(@NonNull Predicate<Item> filter)
    {
        assert false;
        return false;
    }

    static boolean dropAllExcept(int... ids)
    {
        assert false;
        return false;
    }

    static boolean dropAllExcept(java.lang.String... names)
    {
        assert false;
        return false;
    }

    static boolean dropAllExcept(@NonNull Predicate<Item> filter)
    {
        assert false;
        return false;
    }

    static int emptySlotCount()
    {
        assert false;
        return 0;
    }

    /**
     * @param filter
     *
     * @return Get all items which do not fit the given criteria.
     */
    static java.util.List<Item> except(@NonNull Predicate<Item> filter)
    {
        assert false;
        return null;
    }

    static int fullSlotCount()
    {
        assert false;
        return 0;
    }

    /**
     * @param id
     *
     * @return Gets the first item that matches the given item ID
     */
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

    static @Nullable Item get(java.lang.String name)
    {
        assert false;
        return null;
    }

    static @Nullable Item get(java.lang.String... names)
    {
        assert false;
        return null;
    }

    static @Nullable Item get(Predicate<Item> filter)
    {
        assert false;
        return null;
    }

    static java.lang.String[] getActionsForSlot(int slot)
    {
        assert false;
        return new String[0];
    }

    /**
     * @return Gets the count of empty slots in your inventory
     */
    static int getEmptySlots()
    {
        assert false;
        return 0;
    }

    /**
     * @return Gets the first empty slot in your inventory.
     */
    static int getFirstEmptySlot()
    {
        assert false;
        return 0;
    }

    /**
     * @return Gets the next full slot in your inventory
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
     * @return Gets the basic inventory widget Basic meaning bank not open, ge not open, shop not open, etc
     */
    static WidgetChild getInventoryWidget()
    {
        assert false;
        return null;
    }

    static @Nullable Item getItemInSlot(int index)
    {
        assert false;
        return null;
    }

    /**
     * @param itemIDs
     *
     * @return Gets a random item that matches the item id(s) in your inventory
     */
    static @Nullable Item getRandom(int... itemIDs)
    {
        assert false;
        return null;
    }

    /**
     * @param itemNames
     *
     * @return Gets a random item that matches the item name(s) in your inventory
     */
    static @Nullable Item getRandom(java.lang.String... itemNames)
    {
        assert false;
        return null;
    }

    /**
     * @param itemFilter
     *
     * @return Gets a random item that matches the item filter in your inventory
     */
    static @Nullable Item getRandom(@NonNull Predicate<Item> itemFilter)
    {
        assert false;
        return null;
    }

    /**
     * @return Gets the ID of the currently selected item.
     */
    static int getSelectedItemId()
    {
        assert false;
        return 0;
    }

    /**
     * @return Gets the index of the currently selected item.
     */
    static int getSelectedItemIndex()
    {
        assert false;
        return 0;
    }

    static @Nullable WidgetChild getWidgetForSlot(int slot)
    {
        assert false;
        return null;
    }

    /**
     * @param id
     *
     * @return Interact with an Item with specified ID in inventory using the first available action
     */
    static boolean interact(int id)
    {
        assert false;
        return false;
    }

    /**
     * @param id
     * @param action
     *
     * @return Interact with an Item with specified ID in inventory
     */
    static boolean interact(int id, @Nullable java.lang.String action)
    {
        assert false;
        return false;
    }

    /**
     * @param name
     *
     * @return Interact with the Item with specified name in Inventory using the first available action
     */
    static boolean interact(java.lang.String name)
    {
        assert false;
        return false;
    }

    /**
     * @param name
     * @param action
     *
     * @return Interact with the Item with specified name in Inventory
     */
    static boolean interact(java.lang.String name, @Nullable java.lang.String action)
    {
        assert false;
        return false;
    }

    static boolean interact(@NonNull Predicate<Item> filter)
    {
        assert false;
        return false;
    }

    static boolean interact(@NonNull Predicate<Item> filter, @Nullable java.lang.String action)
    {
        assert false;
        return false;
    }

    /**
     * @param item
     *
     * @return Interacts with a given Item with a specified action using the first available action If Item has an invalid slot value, it will find slot based on item id
     */
    static boolean interact(@NonNull Item item)
    {
        assert false;
        return false;
    }

    /**
     * @param item
     * @param action
     *
     * @return Interacts with a given Item with a specified action If Item has an invalid slot value, it will find slot based on item id
     */
    static boolean interact(@NonNull Item item, @Nullable java.lang.String action)
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
     * @return Forces the inventory to ignore whether shift interactions are enabled or not
     */
    static boolean isForceNoShift()
    {
        assert false;
        return false;
    }

    static boolean isFull()
    {
        assert false;
        return false;
    }

    /**
     * @return Checks whether an item is currently selected in your inventory
     */
    static boolean isItemSelected()
    {
        assert false;
        return false;
    }

    /**
     * @return Checks if the Inventory Item Table has been successfully loaded within the client through our all() call
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
     * @return Checks if the given slot has an item in it or not
     */
    static boolean isSlotEmpty(int slot)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     *
     * @return Checks if the slot has an Item in it
     */
    static boolean isSlotFull(int slot)
    {
        assert false;
        return false;
    }

    /**
     * @param item
     *
     * @return Gets the slot bounds of an item.
     */
    static java.awt.Rectangle itemBounds(Item item)
    {
        assert false;
        return null;
    }

    /**
     * @param id
     *
     * @return Checks if your Inventory only contains items with specified ID
     */
    static boolean onlyContains(int... id)
    {
        assert false;
        return false;
    }

    /**
     * @param names
     *
     * @return Checks if your Inventory only contains items with specified name
     */
    static boolean onlyContains(java.lang.String... names)
    {
        assert false;
        return false;
    }


    /**
     * @param f
     *
     * @return Checks if your Inventory only contains items that match the Filter
     */
    static boolean onlyContains(@NonNull Predicate<Item> f)
    {
        assert false;
        return false;
    }


    static boolean open()
    {
        assert false;
        return false;
    }

    static @Nullable Item set(int index, @Nullable Item element)
    {
        assert false;
        return null;
    }

    /**
     * @param forceNoShift Sets inventory to force no shift during dropping
     */
    static void setForceNoShift(boolean forceNoShift)
    {
        assert false;

    }

    static void setSelectedWidgetItemId(int id)
    {
        assert false;

    }

    /**
     * @return Checks whether shift needs to be pressed for shift interactions Only implemented for dropping purposes
     */
    static boolean shouldShift()
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
     * @param filter
     *
     * @return Gets the slot for the item with specified name.
     */
    static int slot(@NonNull Predicate<Item> filter)
    {
        assert false;
        return 0;
    }

    static java.awt.Rectangle slotBounds(int slot)
    {
        assert false;
        return null;
    }

    /**
     * @param slot
     * @param ids
     *
     * @return Checks if the slot contains items that matches the given ids.
     */
    static boolean slotContains(int slot, int... ids)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     * @param names
     *
     * @return Checks if the slot contains items that matches the given names.
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
     * @return Checks if the slot contains items that matches the filter.
     */
    static boolean slotContains(int slot, @NonNull Predicate<Item> filter)
    {
        assert false;
        return false;
    }


    /**
     * @param slot
     * @param t
     *
     * @return Checks if the slot contains items that matches the given ids.
     */
    static boolean slotContains(int slot, @NonNull Item t)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     *
     * @return Interacts with specified slot in inventory using the first available action
     */
    static boolean slotInteract(int slot)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     * @param action
     *
     * @return Interacts with specified slot in inventory
     */
    static boolean slotInteract(int slot, @Nullable java.lang.String action)
    {
        assert false;
        return false;
    }

    /**
     * @param slot
     * @param sub
     *
     * @return Checks if the slot contains items that matches the given ids.
     */
    static boolean slotNameContains(int slot, java.lang.String sub)
    {
        assert false;
        return false;
    }

    /**
     * @param fromSlot
     * @param toSlot
     *
     * @return Swaps the contents of two inventory slots, either of which can be empty to simply move an item from one to the other
     */
    static boolean swap(int fromSlot, int toSlot)
    {
        assert false;
        return false;
    }

    /**
     * @param firstItem
     * @param secondItem
     *
     * @return Swaps the first of each item given if found, if you want to swap specific slots use swap(int, int) instead
     */
    static boolean swap(@NonNull Item firstItem, @NonNull Item secondItem)
    {
        assert false;
        return false;
    }

    /**
     * @return Converts all() to an Item array
     */
    static @Nullable Item @NonNull [] toArray()
    {
        assert false;
        return new Item[0];
    }

    static boolean use(int id)
    {
        assert false;
        return false;
    }

    static boolean use(java.lang.String name)
    {
        assert false;
        return false;
    }

    static boolean use(@NonNull Item item)
    {
        assert false;
        return false;
    }

    /**
     * @return Gets the basic inventory widget child ID Basic meaning bank not open, ge not open, shop not open, etc
     */
    static int widgetChildId()
    {
        assert false;
        return 0;
    }

    /**
     * @return Gets the basic inventory widget parent ID Basic meaning bank not open, GE not open, shop not open, etc
     */
    static int widgetParentId()
    {
        assert false;
        return 0;
    }

}
