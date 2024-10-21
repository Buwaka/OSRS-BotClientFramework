package org.IFOSRS.Interactive;

import org.IFOSRS.Condition;

import java.awt.*;
import java.util.function.Predicate;

public interface Interactable
{
    public abstract Point getCenterPoint();

    public abstract Point getClickablePoint();

    public boolean interact();

    public boolean interact(String action);

    public boolean interact(Predicate<String> filter);

    public boolean interactForceRight(String action);

    public boolean interactForceLeft(String action);

    public boolean interact(String action, boolean rightClick, boolean forceRightClick);

    public boolean interact(String action, boolean rightClick, boolean forceRightClick, Condition interrupt);

    public boolean rightClick(Condition interrupt);

    boolean hover(String action, Condition interrupt);
}
