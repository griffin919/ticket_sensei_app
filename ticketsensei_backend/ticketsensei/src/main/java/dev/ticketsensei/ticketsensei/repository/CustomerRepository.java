package dev.ticketsensei.ticketsensei.repository;

import dev.ticketsensei.ticketsensei.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
