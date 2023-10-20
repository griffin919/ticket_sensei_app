package dev.ticketsensei.ticketsensei.controllers;

import dev.ticketsensei.ticketsensei.entity.Event;
import dev.ticketsensei.ticketsensei.repository.EventRepository;
import dev.ticketsensei.ticketsensei.controllers.EventNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    // Create an event
    @PostMapping("/")
    public Event createEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }

    // Get all events
    @GetMapping("/")
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    // Get a specific event by ID
    @GetMapping("/{id}")
    public Optional<Event> getEventById(@PathVariable Long id) {
        return eventRepository.findById(id);
    }

    // Update an event
    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event updatedEvent) {
        if (eventRepository.existsById(id)) {
            updatedEvent.setEventId(id);
            return eventRepository.save(updatedEvent);
        } else {
            throw new EventNotFoundException("Event with ID " + id + " not found.");
        }
    }

    // Delete an event by ID
    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        if (eventRepository.existsById(id)) {
            eventRepository.deleteById(id);
        } else {
            throw new EventNotFoundException("Event with ID " + id + " not found.");
        }
    }
}
