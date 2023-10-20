package dev.ticketsensei.ticketsensei.repository;

import dev.ticketsensei.ticketsensei.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
