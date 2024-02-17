package com.example.eventclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class EventClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventClientDemoApplication.class, args);
    }

}

@Configuration
class EventRepositoryConfigure {
    @Bean
    public EventRepository eventRepository() {
        return new EventRepository();
    }
}
