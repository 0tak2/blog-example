package com.example.eventclientdemo;

import java.util.List;

public interface EventHolder {
    void add(EventItem e);
    List<EventItem> getAll();
    void removeAll();
    default List<EventItem> flush() {
        List<EventItem> eventItemList = getAll();
        removeAll();
        return eventItemList;
    }
}
