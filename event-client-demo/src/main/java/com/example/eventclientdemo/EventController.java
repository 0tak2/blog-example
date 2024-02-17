package com.example.eventclientdemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    private final EventRepository repository;

    public EventController(EventRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public void newEvent(@RequestBody EventItem e) {
        repository.add(e);
    }

    @GetMapping
    public List<EventItem> getAllEvents() {
        return repository.getAll();
    }

    @PostMapping("/flush")
    public List<EventItem> flushEvents() {
        return repository.flush();
    }
}
