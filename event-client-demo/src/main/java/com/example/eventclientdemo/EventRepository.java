package com.example.eventclientdemo;

import java.util.ArrayList;
import java.util.List;

public class EventRepository implements EventHolder {
    private final List<EventItem> list;
    private final int initialCapacity = 200;

    public EventRepository() {
        this.list = new ArrayList<>(initialCapacity);
    }

    @Override
    public void add(EventItem e) {
        list.add(e);
    }

    @Override
    public List<EventItem> getAll() {
        return new ArrayList<>(list);
    }

    @Override
    public void removeAll() {
        list.clear();
    }
}
