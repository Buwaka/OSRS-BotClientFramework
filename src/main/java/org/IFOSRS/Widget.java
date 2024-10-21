package org.IFOSRS;

public interface Widget extends ClientWrapper
{
    WidgetChild 	getChild(int id);
    java.util.List<WidgetChild> 	getChildren();
    int 	getID();
    boolean 	isVisible();
}
