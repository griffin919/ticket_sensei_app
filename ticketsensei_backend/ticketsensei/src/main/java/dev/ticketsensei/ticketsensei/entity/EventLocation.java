package dev.ticketsensei.ticketsensei.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class EventLocation {
    private String address;
    private String city;
    private String region;
    private String description;
    private String gmapCode;

    // Constructors, getters, and setters
}
