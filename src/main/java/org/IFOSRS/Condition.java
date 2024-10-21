package org.IFOSRS;

@FunctionalInterface
public interface Condition
{
    boolean verify();

    default Condition and(Condition c)
    {
        return () -> {
            return this.verify() && c.verify();
        };
    }

    default Condition or(Condition c)
    {
        return () -> {
            return this.verify() || c.verify();
        };
    }

    default Condition not(Condition c)
    {
        return () -> {
            return this.verify() && !c.verify();
        };
    }

    default Condition negate()
    {
        return () -> {
            return !this.verify();
        };
    }
}

