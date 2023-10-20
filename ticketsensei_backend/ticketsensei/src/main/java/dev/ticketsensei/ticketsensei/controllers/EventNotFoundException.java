package dev.ticketsensei.ticketsensei.controllers;


public class EventNotFoundException extends RuntimeException {
    public EventNotFoundException(String message) {
        super(message);
    }
}