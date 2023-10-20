package dev.ticketsensei.ticketsensei.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import dev.ticketsensei.ticketsensei.entity.Host;

public interface HostRepository extends JpaRepository<Host, Integer> {
    // You can define custom query methods here if needed
}