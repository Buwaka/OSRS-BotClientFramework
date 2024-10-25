package org.IFOSRS.Singletons.Bank;

import org.IFOSRS.Item;

import java.awt.*;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;


/**
 * Internal use only
 */
public interface IBank
{
    boolean _addToBankHistoryCache(Item item);
     List<Item> _all();
     List<Item> _all(Predicate<Item> filter);
     int _availableTabs();
     Rectangle _calculateSlotPosition(int slot);
     int _capacity();
     boolean _close();
     boolean _contains(int id);
     boolean _contains(int... ids);
     boolean _contains(String string);
     boolean _contains(String... names);
     boolean _contains(Predicate<Item> filter);
     boolean _containsAll(int... ids);
     boolean _containsAll(String... names);
     boolean _containsAll(Collection<?> collection);
     int _count(int id);
     int _count(int... ids);
     int _count(String name);
     int _count(String... names);
     int _count(BankTab tab);
     int _count(Predicate<Item> filter);
     boolean _deposit(Item item);
     boolean _deposit(Item item, int amount);
     boolean _depositAll(int id);
     boolean _depositAll(String name);
     boolean _depositAll(Predicate<Item> filter);
     boolean _depositAll(Item item);
     boolean _depositAllEquipment();
     boolean _depositAllExcept(int... ids);
     boolean _depositAllExcept(String... names);
     boolean _depositAllExcept(Predicate<Item> filter);
     boolean _depositAllItems();
     boolean _drag(int fromSlot, int toSlot);
     int _emptySlotCount();
     List<Item> _except(Predicate<Item> filter);
     int _fullSlotCount();
     Item _get(int id);
     Item _get(int... ids);
     Item _get(String name);
     Item _get(String... names);
     Item _get(Predicate<Item> filter);
     List<Item> _getBankHistoryCache();
     Item _getItemInSlot(int slot);
     BankMode _getRearrangeMode();
     int _getRow(Item item);
     int _getScrollHeight();
     int _getSlot(Item item);
     int _getTab(int slot);
     int _getTab(Item item);
     BankMode _getWithdrawMode();
     boolean _isAlwaysOpenTab();
     boolean _isCached();
     boolean _isEmpty();
     boolean _isFull();
     boolean _isLoaded();
     boolean _isOpen();
     boolean _isSlotEmpty(int slot);
     boolean _isSlotFull(int slot);
     boolean _isSlotVisible(Item item);
     boolean _onlyContains(int[] ids);
     boolean _onlyContains(String... names);
     boolean _onlyContains(Predicate<Item> f);
     boolean _open();
     boolean _open(BankLocation bank);
     boolean _openTab(int tab);
     boolean _openTab(BankTab tab);
     boolean _placeHoldersEnabled();
     void _resetCache();
     boolean _setDefaultQuantity(BankQuantity selection);
     boolean _setRearrangeMode(BankMode mode);
     void _setUseBankHistoryCache(boolean useCache);
     boolean _setWithdrawMode(BankMode mode);
     Rectangle _slotBounds(int slot);
     boolean _slotContains(int slot, Item t);
     boolean _slotNameContains(int slot, String sub);
     int _tabContainerWidgetId();
     boolean _togglePlaceholders(boolean enabled);
     int _widgetChildId();
     int _widgetParentId();
     boolean _withdraw(int id);
     boolean _withdraw(int id, int amount);
     boolean _withdraw(Predicate<Item> filter);
     boolean _withdraw(Predicate<Item> filter, int amount);
     boolean _withdraw(String name);
     boolean _withdraw(String name, int amount);
     boolean _withdrawAll(int id);
     boolean _withdrawAll(Predicate<Item> filter);
     boolean _withdrawAll(String name);

}
