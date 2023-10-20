package dev.ticketsensei.ticketsensei.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    private String eventName;
    private String eventDescription;
    private Date eventDateTime;
    private int eventDuration;
    private String eventCategory;

    @ElementCollection
    private List<EventLocation> eventLocations;

    @ElementCollection
    private List<EventReview> eventReviews;

    private String eventLink;
    private String eventUpdate;
    private String eventStatus;
    private Long eventHostID;
    private Date bookingDeadline;
    private int ticketQty;

    @ElementCollection
    private List<TicketCategory> ticketCategories;

    private Long ticketID;

    @ElementCollection
    private List<String> eventImages;

    // Getters and setters
}


