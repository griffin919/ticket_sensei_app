package dev.ticketsensei.ticketsensei.controllers;

import dev.ticketsensei.ticketsensei.entity.Ticket;
import dev.ticketsensei.ticketsensei.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/ticket")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping("/")
    public List<Ticket> fetchAllTickets(){
        return ticketRepository.findAll();
    }

    @GetMapping("/greet")
    public String getTickets(){
        return "Your tickets sir";
    }

}
