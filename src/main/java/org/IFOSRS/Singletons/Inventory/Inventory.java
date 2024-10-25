package org.IFOSRS.Singletons.Inventory;

import org.IFOSRS.Item;
import org.IFOSRS.Singletons.Inventory.IInventory;
import org.IFOSRS.WidgetChild;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.annotation.Nullable;
import java.awt.*;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Inventory {

    private static IInventory instance = null;

    public static void setInstance(IInventory instance) {
        Inventory.instance = instance;
    }

    private static void checkInstance() {
        if (instance == null) {
            throw new IllegalStateException("Inventory instance is not initialized!");
        }
    }
    /**
     * @return Gets the items in your inventory
     */
    public static List<Item> all() {
        checkInstance();
        return instance.all();
    }

    /**
     * A list of all the items.
     *
     * @param filter
     * @return
     */
    public static List<Item> all(@NonNull Predicate<Item> filter) {
        checkInstance();
        return instance.all(filter);
    }

    /**
     * @return Returns the capacity of your inventory (28)
     */
    public static int capacity() {
        checkInstance();
        return instance.capacity();
    }

    public static boolean combine(int primaryItemId, int secondaryItemId) {
        checkInstance();
        return combine(instance.get(primaryItemId) , instance.get(secondaryItemId));
    }

    public static boolean combine(String primaryItemName, String secondaryItemName) {
        checkInstance();
        return combine(instance.get(primaryItemName) , instance.get(secondaryItemName));
    }

    public static boolean combine(Item primary, Item secondary) {
        if(primary == null || secondary == null)
        {
            return false;
        }
        checkInstance();
        return instance.combine(primary, secondary);
    }

    /**
     * Contains boolean.
     *
     * @param id
     * @return
     */
    public static boolean contains(int id) {
        checkInstance();
        return instance.contains(id);
    }

    /**
     * @param ids
     * @return Checks if your collection contains one item which meets one of the specified ids.
     */
    public static boolean contains(int... ids) {
        checkInstance();
        return instance.contains(ids);
    }

    /**
     * Determines if collection contains item with specified name.
     *
     * @param string
     * @return
     */
    public static boolean contains(@NonNull String string) {
        checkInstance();
        return instance.contains(string);
    }

    /**
     * @param names
     * @return Checks if your collection contains one item which meets one of the specified names.
     */
    public static boolean contains(@NonNull String... names) {
        checkInstance();
        return instance.contains(names);
    }

    public static boolean contains(@NonNull Predicate<Item> filter) {
        checkInstance();
        return instance.contains(filter);
    }

    public static boolean contains(@Nullable Item item) {
        checkInstance();
        return instance.contains(item);
    }

    /**
     * Checks if your Inventory contains all of the items with specified IDs
     *
     * @param ids
     * @return
     */
    public static boolean containsAll(int... ids) {
        checkInstance();
        return instance.containsAll(ids);
    }

    /**
     * Checks if your Inventory contains all of the items with names specified
     *
     * @param names
     * @return
     */
    public static boolean containsAll(@NonNull String... names) {
        checkInstance();
        return instance.containsAll(names);
    }

    /**
     * Checks if your collection contains all of the items in the collections
     *
     * @param collection
     * @return
     */
    public static boolean containsAll(@NonNull Collection<Item> collection) {
        checkInstance();
        return instance.containsAll(collection);
    }

    /**
     * Count of all the items that match the search.
     *
     * @param id
     * @return
     */
    public static int count(int id) {
        checkInstance();
        return instance.count(id);
    }

    /**
     * Count of all the items that match the search.
     *
     * @param name
     * @return
     */
    public static int count(@NonNull String name) {
        checkInstance();
        return instance.count(name);
    }

    /**
     * Count of all the items that match the search.
     *
     * @param filter
     * @return
     */
    public static int count(@NonNull Predicate<Item> filter) {
        checkInstance();
        return instance.count(filter);
    }

    /**
     * @return Deselects any item if it is selected
     */
    public static boolean deselect() {
        checkInstance();
        return instance.deselect();
    }

    /**
     * @param itemId
     * @param toSlot
     * @return This will move the first matching item in the inventory to the provided slot.
     */
    public static boolean drag(int itemId, int toSlot) {
        checkInstance();
        return drag(instance.get(itemId), toSlot);
    }

    /**
     * @param itemName
     * @param toSlot
     * @return This will move the first matching item in the inventory to the provided slot.
     */
    public static boolean drag(@NonNull String itemName, int toSlot) {
        checkInstance();
        return drag(instance.get(itemName), toSlot);
    }

    /**
     * @param itemFilter
     * @param toSlot
     * @return This will move the first matching item in the inventory to the provided slot.
     */
    public static boolean drag(@NonNull Predicate<Item> itemFilter, int toSlot) {
        checkInstance();
        return drag(instance.get(itemFilter), toSlot);
    }

    /**
     * @param item
     * @param toSlot
     * @return This will move the first matching item in the inventory to the provided slot.
     */
    public static boolean drag(Item item, int toSlot) {
        if(item == null)
        {
            return false;
        }
        checkInstance();
        return instance.drag(item, toSlot);
    }

    public static boolean drop(int id) {
        checkInstance();
        return drop(instance.get(id));
    }

    public static boolean drop(@NonNull String name) {
        checkInstance();
        return drop(instance.get(name));
    }

    public static boolean drop(@NonNull Predicate<Item> filter) {
        checkInstance();
        return drop(instance.get(filter));
    }

    public static boolean drop(Item item) {
        if(item == null)
        {
            return false;
        }
        checkInstance();
        return instance.drop(item);
    }

    public static boolean dropAll() {
        checkInstance();
        return instance.dropAll();
    }

    /**
     * Drops all items in your inventory matching specified id's
     *
     * @param ids
     * @return
     */
    public static boolean dropAll(int... ids) {
        checkInstance();
        return instance.dropAll(ids);
    }

    /**
     * Drops all items in your inventory matching specified ID
     *
     * @param id
     * @return
     */
    public static boolean dropAll(int id) {
        checkInstance();
        return instance.dropAll(id);
    }

    public static boolean dropAll(@NonNull String name) {
        checkInstance();
        return instance.dropAll(name);
    }

    /**
     * Drops all items in your inventory matching specified names.
     *
     * @param names
     * @return
     */
    public static boolean dropAll(@NonNull String... names) {
        checkInstance();
        return instance.dropAll(names);
    }

    public static boolean dropAll(@NonNull Predicate<Item> filter) {
        checkInstance();
        return instance.dropAll(filter);
    }

    /**
     * Drops all items that don't match the given ID's
     *
     * @param ids
     * @return
     */
    public static boolean dropAllExcept(int... ids) {
        checkInstance();
        return instance.dropAllExcept(ids);
    }

    /**
     * Drops all items that don't match the given names
     *
     * @param names
     * @return
     */
    public static boolean dropAllExcept(@NonNull String... names) {
        checkInstance();
        return instance.dropAllExcept(names);
    }

    public static boolean dropAllExcept(@NonNull Predicate<Item> filter) {
        checkInstance();
        return instance.dropAllExcept(filter);
    }

    public static int emptySlotCount() {
        checkInstance();
        return instance.emptySlotCount();
    }

    /**
     * @param filter
     * @return Get all items which do not fit the given criteria.
     */
    public static List<Item> except(@NonNull Predicate<Item> filter) {
        checkInstance();
        return instance.except(filter);
    }

    public static int fullSlotCount() {
        checkInstance();
        return instance.fullSlotCount();
    }

    /**
     * @param id
     * @return Gets the first item that matches the given item ID
     */
    @Nullable
    public static Item get(int id) {
        checkInstance();
        return instance.get(id);
    }

    /**
     * @param ids
     * @return Gets the first item that matches one of the given IDs
     */

    @Nullable
    public static Item get(int... ids) {
        checkInstance();
        return instance.get(ids);
    }

    /**
     * Get item for specified name.
     *
     * @param name
     * @return
     */
    @Nullable
    public static Item get(@NonNull String name) {
        checkInstance();
        return instance.get(name);
    }

    @Nullable
    public static Item get(@NonNull String... names) {
        checkInstance();
        return instance.get(names);
    }

    @Nullable
    public static Item get(Predicate<Item> filter) {
        checkInstance();
        return instance.get(filter);
    }

    public static String[] getActionsForSlot(int slot) {
        checkInstance();
        return instance.getActionsForSlot(slot);
    }

    /**
     * @return Gets the count of empty slots in your inventory
     */
    public static int getEmptySlots() {
        checkInstance();
        return instance.getEmptySlots();
    }

    /**
     * @return Gets the first empty slot in your inventory.
     */
    public static int getFirstEmptySlot() {
        checkInstance();
        return instance.getFirstEmptySlot();
    }

    /**
     * @return Gets the next full slot in your inventory
     */
    public static int getFirstFullSlot() {
        checkInstance();
        return instance.getFirstFullSlot();
    }

    /**
     * @param slot
     * @return Gets the Id of the Item in the slot.
     */
    public static int getIdForSlot(int slot) {
        checkInstance();
        return instance.getIdForSlot(slot);
    }

    /**
     * @return Gets the basic inventory widget Basic meaning bank not open, ge not open, shop not open, etc
     */
    public static WidgetChild getInventoryWidget() {
        checkInstance();
        return instance.getInventoryWidget();
    }

    /**
     * Gets item in specified slot.
     *
     * @param index
     * @return
     */
    @Nullable
    public static Item getItemInSlot(int index) {
        checkInstance();
        return instance.getItemInSlot(index);
    }

    @Nullable
    public static String getNameForSlot(int slot) {
        checkInstance();
        return instance.getNameForSlot(slot);
    }

    /**
     * @param itemIDs
     * @return Gets a random item that matches the item id(s) in your inventory
     */
    @Nullable
    public static Item getRandom(int... itemIDs) {
        checkInstance();
        return instance.getRandom(itemIDs);
    }

    /**
     * @param itemNames
     * @return Gets a random item that matches the item name(s) in your inventory
     */
    @Nullable
    public static Item getRandom(@NonNull String... itemNames) {
        checkInstance();
        return instance.getRandom(itemNames);
    }

    /**
     * @param itemFilter
     * @return Gets a random item that matches the item filter in your inventory
     */
    @Nullable
    public static Item getRandom(@NonNull Predicate<Item> itemFilter) {
        checkInstance();
        return instance.getRandom(itemFilter);
    }

    public static int getSelectedItemId() {
        checkInstance();
        return instance.getSelectedItemId();
    }

    public static int getSelectedItemIndex() {
        checkInstance();
        return instance.getSelectedItemIndex();
    }

    @Nullable
    public static String getSelectedItemName() {
        checkInstance();
        return instance.getSelectedItemName();
    }

    @Nullable
    public static WidgetChild getWidgetForSlot(int slot) {
        checkInstance();
        return instance.getWidgetForSlot(slot);
    }

    @Nullable
    public static WidgetChild getWidgetForSlot(int slot, @Nullable String action) {
        checkInstance();
        return instance.getWidgetForSlot(slot, action);
    }

    /**
     * @param id
     * @return Interact with an Item with specified ID in inventory using the first available action
     */
    public static boolean interact(int id) {
        checkInstance();
        return interact(instance.get(id));
    }

    /**
     * @param id
     * @param action
     * @return Interact with an Item with specified ID in inventory
     */
    public static boolean interact(int id, @Nullable String action) {
        checkInstance();
        return interact(instance.get(id), action);
    }

    /**
     * @param name
     * @return Interact with the Item with specified name in Inventory using the first available action
     */
    public static boolean interact(@NonNull String name) {
        checkInstance();
        return interact(instance.get(name));
    }

    /**
     * @param name
     * @param action
     * @return Interact with the Item with specified name in Inventory
     */
    public static boolean interact(@NonNull String name, @Nullable String action) {
        checkInstance();
        return interact(instance.get(name), action);
    }

    public static boolean interact(@NonNull Predicate<Item> filter) {
        checkInstance();
        return interact(instance.get(filter));
    }

    public static boolean interact(@NonNull Predicate<Item> filter, @Nullable String action) {
        checkInstance();
        return interact(instance.get(filter), action);
    }

    /**
     * @param item
     * @return Interacts with a given Item with a specified action using the first available action If Item has an invalid slot value, it will find slot based on item id
     */
    public static boolean interact(Item item) {
        if(item == null)
        {
            return false;
        }
        checkInstance();
        return instance.interact(item);
    }

    /**
     * @param item
     * @param action
     * @return Interacts with a given Item with a specified action If Item has an invalid slot value, it will find slot based on item id
     */
    public static boolean interact(Item item, @Nullable String action) {
        if(item == null)
        {
            return false;
        }
        checkInstance();
        return instance.interact(item, action);
    }

    public static boolean isEmpty() {
        checkInstance();
        return instance.isEmpty();
    }

    /**
     * @return Forces the inventory to ignore whether shift interactions are enabled or not
     */
    public static boolean isForceNoShift() {
        checkInstance();
        return instance.isForceNoShift();
    }

    /**
     * Determines if container full.
     *
     * @return
     */
    public static boolean isFull() {
        checkInstance();
        return instance.isFull();
    }

    /**
     * @return Checks whether an item is currently selected in your inventory
     */
    public static boolean isItemSelected() {
        checkInstance();
        return instance.isItemSelected();
    }

    /**
     * @return Checks if the Inventory Item Table has been successfully loaded within the client through our all() call
     */
    public static boolean isLoaded() {
        checkInstance();
        return instance.isLoaded();
    }

    public static boolean isOpen() {
        checkInstance();
        return instance.isOpen();
    }

    /**
     * @param slot
     * @return Checks if the given slot has an item in it or not
     */
    public static boolean isSlotEmpty(int slot) {
        checkInstance();
        return instance.isSlotEmpty(slot);
    }

/**
 * @
 * @param slot
 * @return Checks if the slot has an Item in it
 */
public static boolean isSlotFull(int slot) {
    checkInstance();
    return instance.isSlotFull(slot);
}

    /**
     * @param item
     * @return Gets the slot bounds of an item.
     */
    public static Rectangle itemBounds(Item item) {
        checkInstance();
        return instance.itemBounds(item);
    }

    /**
     * Checks if your Inventory only contains items with specified name
     *
     * @param names
     * @return
     */
    public static boolean onlyContains(@NonNull String... names) {
        checkInstance();
        return instance.onlyContains(names);
    }

    /**
     * Checks if your Inventory only contains items that match the Filter
     *
     * @param f
     * @return
     */
    public static boolean onlyContains(@NonNull Predicate<Item> f) {
        checkInstance();
        return instance.onlyContains(f);
    }

    /**
     * Checks if your Inventory only contains items with specified ID
     *
     * @param id
     * @return
     */
    public static boolean onlyContains(int... id) {
        checkInstance();
        return instance.onlyContains(id);
    }

    public static boolean open() {
        checkInstance();
        return instance.open();
    }

    public static void setForceNoShift(boolean forceNoShift) {
        checkInstance();
        instance.setForceNoShift(forceNoShift);
    }

    public static void setSelectedWidgetItemId(int id) {
        checkInstance();
        instance.setSelectedWidgetItemId(id);
    }

    /**
     * @return Checks whether shift needs to be pressed for shift interactions Only implemented for dropping purposes
     */
    public static boolean shouldShift() {
        checkInstance();
        return instance.shouldShift();
    }

    public static int size() {
        checkInstance();
        return instance.size();
    }

    /**
     * @param id
     * @return Gets the slot for the item with specified ID.
     */
    public static Integer slot(int id) {
        checkInstance();
        return slot(instance.get(id));
    }

    /**
     * @param name
     * @return Gets the slot for the item with specified name.
     */
    public static Integer slot(@NonNull String name) {
        checkInstance();
        return slot(instance.get(name));
    }

    /**
     * @param filter
     * @return Gets the slot for the item with specified name.
     */
    public static Integer slot(@NonNull Predicate<Item> filter) {
        checkInstance();
        return slot(instance.get(filter));
    }

    public static Integer slot(Item item) {
        if(item == null)
        {
            return null;
        }
        checkInstance();
        return instance.slot(item);
    }

    public static Rectangle slotBounds(int slot) {
        checkInstance();
        return instance.slotBounds(slot);
    }

    /**
     * @param slot
     * @param ids
     * @return Checks if the slot contains items that matches the given ids.
     */
    public static boolean slotContains(int slot, int... ids) {
        checkInstance();
        return slotContains(slot, instance.get(ids));
    }

    /**
     * @param slot
     * @param names
     * @return Checks if the slot contains items that matches the given names.
     */
    public static boolean slotContains(int slot, @NonNull String... names) {
        checkInstance();
        return slotContains(slot, instance.get(names));
    }

    /**
     * @param slot
     * @param filter
     * @return Checks if the slot contains items that matches the filter.
     */
    public static boolean slotContains(int slot, @NonNull Predicate<Item> filter) {
        checkInstance();
        return slotContains(slot, instance.get(filter));
    }

    /**
     * @param slot
     * @param t
     * @return Checks if the slot contains items that matches the given ids.
     */
    public static boolean slotContains(int slot, Item t) {
        if(t == null)
        {
            return false;
        }
        checkInstance();
        return instance.slotContains(slot, t);
    }

    /**
     * @param slot
     * @return Interacts with specified slot in inventory using the first available action
     */
    public static boolean slotInteract(int slot) {
        checkInstance();
        return instance.slotInteract(slot);
    }

    /**
     * @param slot
     * @param action
     * @return Interacts with specified slot in inventory
     */
    public static boolean slotInteract(int slot, @Nullable String action) {
        checkInstance();
        return instance.slotInteract(slot, action);
    }

    /**
     * @param fromSlot
     * @param toSlot
     * @return Swaps the contents of two inventory slots, either of which can be empty to simply move an item from one to the other
     */
    public static boolean swap(int fromSlot, int toSlot) {
        Item item1 = instance.getItemInSlot(fromSlot);
        Item item2 = instance.getItemInSlot(toSlot);
        checkInstance();
        return swap(item1, item2);
    }

    /**
     * @param firstItem
     * @param secondItem
     * @return Swaps the first of each item given if found, if you want to swap specific slots use swap(int, int) instead
     */
    public static boolean swap(Item firstItem, Item secondItem) {
        if(firstItem == null || secondItem == null)
        {
            return false;
        }
        checkInstance();
        return instance.swap(firstItem, secondItem);
    }

    /**
     * @return Converts all() to an Item array
     */
    public static Item[] toArray() {
        checkInstance();
        return instance.all().toArray(new Item[0]);
    }

    public static boolean use(int id) {
        checkInstance();
        return use(instance.get(id));
    }

    public static boolean use(@NonNull String name) {
        checkInstance();
        return use(instance.get(name));
    }

    public static boolean use(Item item) {
        if(item == null)
        {
            return false;
        }
        checkInstance();
        return instance.use(item);
    }

    /**
     * @return Gets the basic inventory widget child ID Basic meaning bank not open, ge not open, shop not open, etc
     */
    public static int widgetChildId() {
        checkInstance();
        return instance.widgetChildId();
    }

    /**
     * @return Gets the basic inventory widget parent ID Basic meaning bank not open, GE not open, shop not open, etc
     */
    public static int widgetParentId() {
        checkInstance();
        return instance.widgetParentId();
    }
}