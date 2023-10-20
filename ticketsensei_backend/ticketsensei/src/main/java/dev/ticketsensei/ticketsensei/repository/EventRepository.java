package dev.ticketsensei.ticketsensei.repository;

import dev.ticketsensei.ticketsensei.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
    // You can add custom query methods here if needed
}