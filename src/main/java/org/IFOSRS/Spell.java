package org.IFOSRS;

public interface Spell extends ClientWrapper
{
    int 	getChild();
    Rune[] 	getCost();
    int 	getLevel();
    int 	getMaxHit();
    int 	getParent();
    WidgetChild 	getWidget();
}
