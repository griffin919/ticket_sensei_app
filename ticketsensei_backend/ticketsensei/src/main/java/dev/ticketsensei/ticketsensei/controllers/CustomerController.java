package dev.ticketsensei.ticketsensei.controllers;

import org.springframework.web.bind.annotation.*;
import dev.ticketsensei.ticketsensei.entity.Customer;
import dev.ticketsensei.ticketsensei.repository.CustomerRepository;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Create a new customer
    @PostMapping("/")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    // Read a customer by ID
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    // Update a customer
    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
        if (customerRepository.existsById(id)) {
            customer.setId(id);
            return customerRepository.save(customer);
        }
        return null; // Handle not found or other error cases
    }

    // Delete a customer
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        customerRepository.deleteById(id);
    }
}
