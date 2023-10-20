package dev.ticketsensei.ticketsensei.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class EventReview {
    private int rating;
    private String review;

    // Constructors, getters, and setters
}
