package org.IFOSRS.Requirement;


import org.IFOSRS.Item;
import org.IFOSRS.Singletons.Logging.Logger;
import org.IFOSRS.Singletons.Bank.Bank;
import org.IFOSRS.Singletons.Inventory.Inventory;

import java.util.Arrays;
import java.util.List;


public class ItemRequirement implements Requirement
{
    private static final long serialVersionUID = -7005824736241585885L;
    boolean CheckBank;

    List<Item> Items;


    /**
     * @param bank             Whether to check the bank as well
     * @param items ID and amount set, negative amount for reverse requirement (aka item count needs to be less than count)
     */
    public ItemRequirement(boolean bank, Item... items)
    {
        CheckBank = bank;
        Logger.log("ItemRequirement: " + Arrays.toString(items));
        Items = Arrays.asList(items);
    }

    /**
     * @return
     */
    @Override
    public Requirement.RequirementType GetRequirementType()
    {
        return Requirement.RequirementType.Item;
    }

    /**
     * @return
     */
    @Override
    public boolean isRequirementMet()
    {
        boolean[] Checks = new boolean[Items.size()];
        Arrays.fill(Checks, false);
        Logger.log("ItemRequirement: isRequirementMet: CheckBank: " + CheckBank);
        for(int i = 0; i < Items.size(); i++)
        {
            Item item = Items.get(i);
            if(CheckBank)
            {
                if(item.getAmount() <= 0)
                {
                    if(Bank.count(item.getID()) <= Math.abs(item.getAmount()))
                    {
                        Logger.log(
                                "ItemRequirement: isRequirementMet: less than requirement bank, true " +
                                item);
                        Logger.log("count: " + Bank.count(item.getID()) + " < " + Math.abs(item.getAmount()));
                        Checks[i] = true;
                        continue;
                    }
                }
                else if(Bank.count(item.getID()) > item.getAmount())
                {
                    Logger.log(
                            "ItemRequirement: isRequirementMet: more than requirement bank, true " +
                            item.getID());
                    Logger.log("count: " + Bank.count(item.getID()) + " > " + Math.abs(item.getAmount()));
                    Checks[i] = true;
                    continue;
                }
            }
            else if(item.getAmount() <= 0)
            {
                if(Inventory.count(item.getID()) <= Math.abs(item.getAmount()))
                {
                    Logger.log(
                            "ItemRequirement: isRequirementMet: less than requirement Inventory, true " +
                            item.getID());
                    Logger.log("count: " + Inventory.count(item.getID()) + " < " + Math.abs(item.getAmount()));
                    Checks[i] = true;
                    continue;
                }
            }
            else if(Inventory.count(item.getID()) > item.getAmount())
            {
                Logger.log(
                        "ItemRequirement: isRequirementMet: more than requirement Inventory, true " +
                        item.getID());
                Logger.log("count: " + Inventory.count(item.getID()) + " > " + item.getAmount());
                Checks[i] = true;
                continue;
            }
        }

        for(boolean check : Checks)
        {
            if(!check)
            {
                Logger.log("ItemRequirement: failed a check, exiting, false");
                return false;
            }
        }
        Logger.log("ItemRequirement: Succeeded all checks, exiting, true");
        return true;
    }
}
