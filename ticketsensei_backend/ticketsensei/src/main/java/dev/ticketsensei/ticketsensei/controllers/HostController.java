package dev.ticketsensei.ticketsensei.controllers;

import org.springframework.web.bind.annotation.*;
import dev.ticketsensei.ticketsensei.entity.Host;
import dev.ticketsensei.ticketsensei.repository.HostRepository;

@RestController
@RequestMapping("/api/hosts")
public class HostController {

    private final HostRepository hostRepository;

    public HostController(HostRepository hostRepository) {
        this.hostRepository = hostRepository;
    }

    // Create a new host
    @PostMapping("/")
    public Host createHost(@RequestBody Host host) {
        return hostRepository.save(host);
    }

    // Read a host by ID
    @GetMapping("/{id}")
    public Host getHost(@PathVariable Integer id) {
        return hostRepository.findById(id).orElse(null);
    }

    // Update a host
    @PutMapping("/{id}")
    public Host updateHost(@PathVariable Integer id, @RequestBody Host host) {
        if (hostRepository.existsById(id)) {
            host.setId(id);
            return hostRepository.save(host);
        }
        return null; // Handle not found or other error cases
    }

    // Delete a host
    @DeleteMapping("/{id}")
    public void deleteHost(@PathVariable Integer id) {
        hostRepository.deleteById(id);
    }
}
