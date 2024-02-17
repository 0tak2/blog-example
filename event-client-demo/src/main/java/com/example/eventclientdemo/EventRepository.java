package com.example.eventclientdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class EventRepository implements EventHolder {
    private final List<EventItem> list;

    public EventRepository() {
        this.list = new CopyOnWriteArrayList<>();
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
