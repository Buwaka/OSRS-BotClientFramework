package org.IFOSRS.Singletons.Bank;

import com.google.inject.Inject;
import org.IFOSRS.Item;

import java.awt.*;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Bank
{
    @Inject
    static IBank instance = null;

    /**
     * Retrieves the original client object, needs to be cast to the right type depending on the client being used
     *
     * @return the object reference to the original client object
     */
    public static Object getObject()
    {
        return instance;
    }

    /**
     * This allows you to add an item to the bank history cache, it should only be necessary if you're doing things outside our API.
     */
    public static boolean addToBankHistoryCache(Item item)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._addToBankHistoryCache(item);
    }

    /**
     * Gets the items in your bank
     */
    public static List<Item> all()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._all();
    }

    /**
     * A list of all the non-null items that match the given filter Filters out null before checking against the filter
     */
    public static List<Item> all(Predicate<Item> filter)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._all(filter);
    }

    /**
     * Gets the number of tabs currently available
     */
    public static int availableTabs()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._availableTabs();
    }

    /**
     * Gets the virtual position for the specified slot.
     */
    public static Rectangle calculateSlotPosition(int slot)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._calculateSlotPosition(slot);
    }

    /**
     * Gets the bank's max capacity
     */
    public static int capacity()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._capacity();
    }

    /**
     * Exits the bank with the close button.
     */
    public static boolean close()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._close();
    }

    /**
     * Checks if the bank contains the given ID Placeholders are ignored
     */
    public static boolean contains(int id)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._contains(id);
    }

    /**
     * Checks if your collection contains at least one item which meets one of the specified ids.
     */
    public static boolean contains(int... ids)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._contains(ids);
    }

    /**
     * Determines if bank contains an item that matches the given name.
     */
    public static boolean contains(String string)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._contains(string);
    }

    /**
     * Checks if your collection contains at least one item which meets one of the specified names.
     */
    public static boolean contains(String... names)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._contains(names);
    }

    /**
     * Checks if your collection contains at least one item which meets the specified filter.
     */
    public static boolean contains(Predicate<Item> filter)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._contains(filter);
    }

    /**
     * Checks if your Bank contains all of the items with specified IDs Placeholders are ignored
     */
    public static boolean containsAll(int... ids)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._containsAll(ids);
    }

    /**
     * Checks if your Bank contains all of the items with names specified Placeholders are ignored
     */
    public static boolean containsAll(String... names)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._containsAll(names);
    }

    /**
     * Checks if your bank contains all of the items in the collection
     */
    public static boolean containsAll(Collection<Item> collection)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._containsAll(collection);
    }

    /**
     * Count of all the items that match the search.
     */
    public static int count(int id)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._count(id);
    }

    /**
     * Count of all the items that match the search.
     */
    public static int count(int... ids)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._count(ids);
    }

    /**
     * Count of all the items that match the search.
     */
    public static int count(String name)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._count(name);
    }

    /**
     * Count of all the items that match the search.
     */
    public static int count(String... names)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._count(names);
    }

    /**
     * Gets the Item count for the BankTab
     */
    public static int count(BankTab tab)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._count(tab);
    }

    /**
     * Count of all the items that match the search.
     */
    public static int count(Predicate<Item> filter)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._count(filter);
    }

    /**
     * Deposits the item with the given id
     */
    public static boolean deposit(int id)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._deposit(instance._get(id));
    }

    /**
     * Deposits the item with the given id and amount
     */
    public static boolean deposit(int id, int amount)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._deposit(instance._get(id), amount);
    }

    /**
     * Deposits the item with the given name
     */
    public static boolean deposit(String name)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._deposit(instance._get(name));
    }

    /**
     * Deposits the item with the given name and amount
     */
    public static boolean deposit(String name, int amount)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._deposit(instance._get(name), amount);
    }

    /**
     * Deposits the first item that matches the given Filter
     */
    public static boolean deposit(Predicate<Item> filter)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._deposit(instance._get(filter));
    }

    /**
     * Deposits the first item that matches the given Filter for the given amount
     */
    public static boolean deposit(Predicate<Item> filter, int amount)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._deposit(instance._get(filter), amount);
    }

    /**
     * Deposits the given item
     */
    public static boolean deposit(Item item)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._deposit(item);
    }

    /**
     * Deposits the given item with the specified amount
     */
    public static boolean deposit(Item item, int amount)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._deposit(item, amount);
    }

    /**
     * Deposits all of an item for a given ID
     */
    public static boolean depositAll(int id)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._depositAll(instance._get(id));
    }

    /**
     * Deposits all of an item for the given name
     */
    public static boolean depositAll(String name)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._depositAll(instance._get(name));
    }


    /**
     * Deposits all of an item that matches the given Filter
     */
    public static boolean depositAll(Predicate<Item> filter)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._depositAll(instance._get(filter));
    }

    /**
     * Deposits all of the given item
     */
    public static boolean depositAll(Item item)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._depositAll(item);
    }

    /**
     * Deposits all worn equipment with the deposit all equipment button.
     */
    public static boolean depositAllEquipment()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._depositAllEquipment();
    }

    /**
     * Deposits all items except those with the given ids
     */
    public static boolean depositAllExcept(int... ids)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._depositAllExcept(ids);
    }

    /**
     * Deposits all items except those with the given names
     */
    public static boolean depositAllExcept(String... names)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._depositAllExcept(names);
    }

    /**
     * Deposits all items that do not match the given Filter
     */
    public static boolean depositAllExcept(Predicate<Item> filter)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._depositAllExcept(filter);
    }

    /**
     * Deposits all items in your inventory with the deposit all button.
     */
    public static boolean depositAllItems()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._depositAllItems();
    }

    /**
     * Drags the item from one slot to another, either of which can be empty to simply move an item from one slot to the other
     */
    public static boolean drag(int fromSlot, int toSlot)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._drag(fromSlot, toSlot);
    }

    /**
     * Number of slots that do not contain an item or placeholder
     */
    public static int emptySlotCount()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._emptySlotCount();
    }

    /**
     * Get all items which do not fit the given criteria.
     */
    public static List<Item> except(Predicate<Item> filter)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._except(filter);
    }

    /**
     * Number of slots that contain non-null items Includes placeholders as a full slot
     */
    public static int fullSlotCount()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._fullSlotCount();
    }

    /**
     * Gets the first item with the given id
     */
    public static Item get(int id)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._get(id);
    }

    /**
     * Gets the first Item that matches one of the given ids
     */
    public static Item get(int... ids)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._get(ids);
    }

    /**
     * Get the item for specified name.
     */
    public static Item get(String name)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._get(name);
    }

    /**
     * Gets the first item that matches one of the given names
     */
    public static Item get(String... names)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._get(names);
    }

    /**
     * Gets the first Item that matches the given Filter
     */
    public static Item get(Predicate<Item> filter)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._get(filter);
    }

    /**
     * Gets the bank item history cache.
     */
    public static List<Item> getBankHistoryCache()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._getBankHistoryCache();
    }

    /**
     * Gets the Name for the Item in the slot.
     */
    public static String getNameForSlot(int slot)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        Item item = instance._getItemInSlot(slot);
        return item == null ? item.getName() : null;
    }

    /**
     * Gets the current rearrange mode type;
     */
    public static BankMode getRearrangeMode()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._getRearrangeMode();
    }

    /**
     * Gets the row of the Item
     */
    public static int getRow(Item item)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._getRow(item);
    }

    /**
     * Determines the current scroll position height of the bank's scroll container.
     */
    public static int getScrollHeight()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._getScrollHeight();
    }

    /**
     * Gets the slot for the item with specified ID.
     */
    public static int getSlot(int id)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._getSlot(instance._get(id));
    }

    /**
     * Gets the slot for the item with specified name.
     */
    public static int getSlot(String name)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._getSlot(instance._get(name));
    }

    /**
     * Gets the slot for the first item that matches the given filter
     */
    public static int getSlot(Predicate<Item> filter)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._getSlot(instance._get(filter));
    }

    /**
     * Gets the tab for the given slot
     */
    public static int getTab(int slot)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._getTab(slot);
    }

    /**
     * Gets the tab for the Item
     */
    public static int getTab(Item item)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._getTab(item);
    }

    /**
     * Gets the current withdraw BankMode
     */
    public static BankMode getWithdrawMode()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._getWithdrawMode();
    }

    /**
     * Checks if the always open tab option is enabled
     */
    public static boolean isAlwaysOpenTab()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._isAlwaysOpenTab();
    }

    /**
     * Checks if the bank has been cached.
     */
    public static boolean isCached()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._isCached();
    }

    /**
     * Checks if the bank is empty (including placeholders)
     */
    public static boolean isEmpty()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._isEmpty();
    }

    /**
     * Determines if bank is full.
     */
    public static boolean isFull()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._isFull();
    }

    /**
     * Checks to see if the Bank container has been loaded successfully at least once
     * Check is done during all() call
     */
    public static boolean isLoaded()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._isLoaded();
    }

    /**
     * Checks if the bank is currently open or not.
     */
    public static boolean isOpen()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._isOpen();
    }

    /**
     * Checks if the given slot contains an item
     */
    public static boolean isSlotEmpty(int slot)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._isSlotEmpty(slot);
    }

    /**
     * Checks if the slot has an Item in it
     */
    public static boolean isSlotFull(int slot)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._isSlotFull(slot);
    }

    /**
     * Determines if the given Item's slot is visible
     */
    public static boolean isSlotVisible(Item item)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._isSlotVisible(item);
    }

    /**
     * Checks if your Bank only contains items with the specified IDs
     */
    public static boolean onlyContains(int... ids)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._onlyContains(ids);
    }

    /**
     * Checks if your Bank only contains items with specified names
     */
    public static boolean onlyContains(String... names)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._onlyContains(names);
    }

    /**
     * Checks if your Bank only contains items that match the Filter
     */
    public static boolean onlyContains(Predicate<Item> f)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._onlyContains(f);
    }

    /**
     * Finds the nearest BankType and attempts to open it.
     */
    public static boolean open()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._open();
    }

    /**
     * Opens a specific bank location, if you're not in the area it will call walk(Tile) and return false
     * If given a null bank location, it will verify the nearest bank type's location (if we have it)
     * If that verification fails, it will recalculate to find the nearest valid bank location.
     */
    public static boolean open(BankLocation bank)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._open(bank);
    }

    /**
     * Opens the bank tab specified
     */
    public static boolean openTab(int tab)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._openTab(tab);
    }

    /**
     * Opens the BankTab specified.
     */
    public static boolean openTab(BankTab tab)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._openTab(tab);
    }

    /**
     * Checks whether placeholders are currently enabled
     */
    public static boolean placeHoldersEnabled()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._placeHoldersEnabled();
    }

    /**
     * This will reset the bank history cache to its initial state
     */
    public static void resetCache()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        instance._resetCache();
    }

    /**
     * Sets the BankQuantitySelection for bank actions
     */
    public static boolean setDefaultQuantity(BankQuantity selection)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._setDefaultQuantity(selection);
    }

    /**
     * Sets the Rearrange mode for the bank either IBank.BankMode.SWAP or IBank.BankMode.INSERT
     */
    public static boolean setRearrangeMode(BankMode mode)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._setRearrangeMode(mode);
    }

    /**
     * Set whether our methods use the Bank cache if you call a method while not in the bank
     */
    public static void setUseBankHistoryCache(boolean useCache)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        instance._setUseBankHistoryCache(useCache);
    }

    /**
     * Sets the withdraw mode, either IBank.BankMode.ITEM or IBank.BankMode.NOTE
     */
    public static boolean setWithdrawMode(BankMode mode)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._setWithdrawMode(mode);
    }

    /**
     * Gets the bounds of a slot
     */
    public static Rectangle slotBounds(int slot)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._slotBounds(slot);
    }

    /**
     * Calls slotBounds(int) with Item.getSlot() If Item is null returns null Rectangle
     */
    public static Rectangle slotBounds(Item item)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._slotBounds(item.getSlot());
    }

    /**
     * Checks if the slot contains an item with an ID matching one of the given ids
     */
    public static boolean slotContains(int slot, int... ids)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._slotContains(slot, instance._get(ids));
    }

    /**
     * Checks if the slot contains items that matches the given names.
     */
    public static boolean slotContains(int slot, String... names)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._slotContains(slot, instance._get(names));
    }

    /**
     * Checks if the slot contains an item that matches the filter.
     */
    public static boolean slotContains(int slot, Predicate<Item> filter)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._slotContains(slot, instance._get(filter));
    }

    /**
     * Checks if the slot contains given Item
     */
    public static boolean slotContains(int slot, Item t)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._slotContains(slot, t);
    }

    /**
     * Gets the ID of the WidgetChild for the tab container
     */
    public static int tabContainerWidgetId()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._tabContainerWidgetId();
    }

    /**
     * Toggles whether placeholders are enabled or not
     */
    public static boolean togglePlaceholders(boolean enabled)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._togglePlaceholders(enabled);
    }

    /**
     * Gets the ID of the WidgetChild for the bank interface
     */
    public static int widgetChildId()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._widgetChildId();
    }

    /**
     * Gets the ID of the Widget for the bank
     */
    public static int widgetParentId()
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._widgetParentId();
    }

    /**
     * Withdraws one of the given item id
     */
    public static boolean withdraw(int id)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._withdraw(id);
    }

    /**
     * Withdraws an item for the id and amount given.
     */
    public static boolean withdraw(int id, int amount)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._withdraw(id, amount);
    }

    /**
     * Withdraws one item that matches the given Filter
     */
    public static boolean withdraw(Predicate<Item> filter)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._withdraw(filter);
    }

    /**
     * Withdraws an item that matches the given Filter for the given amount
     * For withdraw All-but-one pass in value: -9411
     */
    public static boolean withdraw(Predicate<Item> filter, int amount)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._withdraw(filter, amount);
    }

    /**
     * Withdraws one of an item with the given name
     */
    public static boolean withdraw(String name)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._withdraw(name);
    }

    /**
     * Withdraws an item for the name and amount given.
     */
    public static boolean withdraw(String name, int amount)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._withdraw(name, amount);
    }

    /**
     * Withdraws all of an item for a given ID
     */
    public static boolean withdrawAll(int id)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._withdrawAll(id);
    }

    /**
     * Withdraws all of an item that matches the given Filter
     */
    public static boolean withdrawAll(Predicate<Item> filter)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._withdrawAll(filter);
    }

    /**
     * Withdraws all of an item for the given name
     */
    public static boolean withdrawAll(String name)
    {
        if(instance == null) {throw new IllegalStateException("instance is null");}
        return instance._withdrawAll(name);
    }
}

