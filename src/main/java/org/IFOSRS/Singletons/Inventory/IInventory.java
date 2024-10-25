package org.IFOSRS.Singletons.Inventory;

import org.IFOSRS.ClientWrapper;
import org.IFOSRS.Item;
import org.IFOSRS.WidgetChild;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.annotation.Nullable;
import java.awt.*;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public interface IInventory
{
        /**
         * @return Gets the items in your inventory
         */
        List<Item> all();

        /**
         * A list of all the items.
         *
         * @param filter
         * @return
         */
        List<Item> all(@NonNull Predicate<Item> filter);

        /**
         * @return Returns the capacity of your inventory (28)
         */
        int capacity();

        boolean combine(@NonNull Item primary, @NonNull Item secondary);

        /**
         * Contains boolean.
         *
         * @param id
         * @return
         */
        boolean contains(int id);

        boolean contains(int[] ids);

        /**
         * Determines if collection contains item with specified name.
         *
         * @param string
         * @return
         */
        boolean contains(@NonNull String string);

        /**
         * @param names
         * @return Checks if your collection contains one item which meets one of the specified names.
         */
        boolean contains(@NonNull String... names);

        boolean contains(@NonNull Predicate<Item> filter);

        boolean contains(@Nullable Object o);

        /**
         * Checks if your Inventory contains all of the items with specified IDs
         *
         * @param ids
         * @return
         */
        boolean containsAll(int... ids);

        /**
         * Checks if your Inventory contains all of the items with names specified
         *
         * @param names
         * @return
         */
        boolean containsAll(@NonNull String... names);

        /**
         * Checks if your collection contains all of the items in the collections
         *
         * @param collection
         * @return
         */
        boolean containsAll(@NonNull Collection<?> collection);

        /**
         * Count of all the items that match the search.
         *
         * @param id
         * @return
         */
        int count(int id);

        /**
         * Count of all the items that match the search.
         *
         * @param name
         * @return
         */
        int count(@NonNull String name);

        /**
         * Count of all the items that match the search.
         *
         * @param filter
         * @return
         */
        int count(@NonNull Predicate<Item> filter);

        /**
         * @return Deselects any item if it is selected
         */
        boolean deselect();

        /**
         * @param item
         * @param toSlot
         * @return This will move the first matching item in the inventory to the provided slot.
         */
        boolean drag(@NonNull Item item, int toSlot);

        boolean drop(Item item);

        boolean dropAll();

        /**
         * see dropAll(Integer...)
         *
         * @param ids
         * @return
         */
        boolean dropAll(int[] ids);

        /**
         * Drops all items in your inventory matching specified ID
         *
         * @param id
         * @return
         */
        boolean dropAll(int id);

        boolean dropAll(@NonNull String name);

        /**
         * Drops all items in your inventory matching specified names.
         *
         * @param names
         * @return
         */
        boolean dropAll(@NonNull String... names);

        boolean dropAll(@NonNull Predicate<Item> filter);

        /**
         * see dropAllExcept(Integer...)
         *
         * @param ids
         * @return
         */
        boolean dropAllExcept(int[] ids);

        /**
         * Drops all items that don't match the given names
         *
         * @param names
         * @return
         */
        boolean dropAllExcept(@NonNull String... names);

        boolean dropAllExcept(@NonNull Predicate<Item> filter);


        int emptySlotCount();

        /**
         * @param filter
         * @return Get all items which do not fit the given criteria.
         */
        List<Item> except(@NonNull Predicate<Item> filter);

        int fullSlotCount();

        /**
         * @param id
         * @return Gets the first item that matches the given item ID
         */
        @Nullable
        Item get(int id);

        @Nullable
        Item get(int[] ids);

        /**
         * Get item for specified name.
         *
         * @param name
         * @return
         */
        @Nullable
        Item get(@NonNull String name);

        @Nullable
        Item get(@NonNull String... names);

        @Nullable
        Item get(Predicate<Item> filter);

        @NonNull
        String[] getActionsForSlot(int slot);

        /**
         * @return Gets the count of empty slots in your inventory
         */
        int getEmptySlots();

        /**
         * @return Gets the first empty slot in your inventory.
         */
        int getFirstEmptySlot();

        /**
         * @return Gets the next full slot in your inventory
         */
        int getFirstFullSlot();

        /**
         * @param slot
         * @return Gets the Id of the Item in the slot.
         */
        int getIdForSlot(int slot);

        /**
         * @return Gets the basic inventory widget Basic meaning bank not open, ge not open, shop not open, etc
         */
        WidgetChild getInventoryWidget();

        /**
         * Gets item in specified slot.
         *
         * @param index
         * @return
         */
        @Nullable
        Item getItemInSlot(int index);

        @Nullable
        String getNameForSlot(int slot);

        /**
         * @param itemIDs
         * @return Gets a random item that matches the item id(s) in your inventory
         */
        @Nullable
        Item getRandom(int... itemIDs);

        /**
         * @param itemNames
         * @return Gets a random item that matches the item name(s) in your inventory
         */
        @Nullable
        Item getRandom(@NonNull String... itemNames);

        /**
         * @param itemFilter
         * @return Gets a random item that matches the item filter in your inventory
         */
        @Nullable
        Item getRandom(@NonNull Predicate<Item> itemFilter);

        int getSelectedItemId();

        int getSelectedItemIndex();

        @Nullable
        String getSelectedItemName();

        @Nullable
        WidgetChild getWidgetForSlot(int slot);

        @Nullable
        WidgetChild getWidgetForSlot(int slot, @Nullable String action);

        /**
         * @param item
         * @return Interacts with a given Item with a specified action using the first available action If Item has an invalid slot value, it will find slot based on item id
         */
        boolean interact(@NonNull Item item);

        /**
         * @param item
         * @param action
         * @return Interacts with a given Item with a specified action If Item has an invalid slot value, it will find slot based on item id
         */
        boolean interact(@NonNull Item item, @Nullable String action);

        boolean isEmpty();

        /**
         * @return Forces the inventory to ignore whether shift interactions are enabled or not
         */
        boolean isForceNoShift();

        /**
         * Determines if container full.
         *
         * @return
         */
        boolean isFull();

        /**
         * @return Checks whether an item is currently selected in your inventory
         */
        boolean isItemSelected();

        /**
         * @return Checks if the Inventory Item Table has been successfully loaded within the client through our all() call
         */
        boolean isLoaded();

        boolean isOpen();

        /**
         * @param slot
         * @return Checks if the given slot has an item in it or not
         */
        boolean isSlotEmpty(int slot);

        /**
         * @param slot
         * @return Checks if the slot has an Item in it
         */
        boolean isSlotFull(int slot);

        /**
         * @param item
         * @return Gets the slot bounds of an item.
         */
        @NonNull Rectangle itemBounds(Item item);

        /**
         * see onlyContains(Integer...)
         *
         * @param id
         * @return
         */
        boolean onlyContains(int... id);

        /**
         * Checks if your Inventory only contains items with specified name
         *
         * @param names
         * @return
         */
        boolean onlyContains(@NonNull String... names);

        /**
         * Checks if your Inventory only contains items that match the Filter
         *
         * @param f
         * @return
         */
        boolean onlyContains(@NonNull Predicate<Item> f);

        boolean open();

        /**
         * @param forceNoShift Sets inventory to force no shift during dropping
         */
        void setForceNoShift(boolean forceNoShift);

        void setSelectedWidgetItemId(int id);

        /**
         * @return Checks whether shift needs to be pressed for shift interactions Only implemented for dropping purposes
         */
        boolean shouldShift();

        int size();

        Integer slot(Item item);

        @NonNull
        Rectangle slotBounds(int slot);

        /**
         * @param slot
         * @param t
         * @return Checks if the slot contains items that matches the given ids.
         */
        boolean slotContains(int slot, @NonNull Item t);

        /**
         * @param slot
         * @return Interacts with specified slot in inventory using the first available action
         */
        boolean slotInteract(int slot);

        /**
         * @param slot
         * @param action
         * @return Interacts with specified slot in inventory
         */
        boolean slotInteract(int slot, @Nullable String action);

        /**
         * @param firstItem
         * @param secondItem
         * @return Swaps the first of each item given if found, if you want to swap specific slots use swap(int, int) instead
         */
        boolean swap(@NonNull Item firstItem, @NonNull Item secondItem);

        boolean use(@NonNull Item item);

        /**
         * @return Gets the basic inventory widget child ID Basic meaning bank not open, ge not open, shop not open, etc
         */
        int widgetChildId();

        /**
         * @return Gets the basic inventory widget parent ID Basic meaning bank not open, GE not open, shop not open, etc
         */
        int widgetParentId();
}
