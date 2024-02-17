package com.example.eventclientdemo;

import java.time.LocalDateTime;
import java.util.UUID;

public class EventItem {
    private final UUID eventId;
    private final String message;
    private final LocalDateTime createdAt;

    public EventItem(UUID eventId, String message, LocalDateTime createdAt) {
        this.eventId = eventId;
        this.message = message;
        this.createdAt = createdAt;
    }

    public UUID getEventId() {
        return eventId;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
