package org.IFOSRS.Singletons.Bank;

import com.google.inject.Inject;
import org.IFOSRS.ClientWrapper;

public enum BankQuantity implements ClientWrapper
{
    ALL,
    FIVE,
    ONE,
    TEN,
    X;

    @Inject
    static IBankQuantity instance = null;

    @Override
    public Object getObject()
    {
        return instance;
    }

    public static BankQuantity getSelection()
    {
        return instance.getSelection();
    }

}
