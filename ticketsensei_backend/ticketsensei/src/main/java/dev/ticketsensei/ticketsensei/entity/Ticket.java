package dev.ticketsensei.ticketsensei.entity;

import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "ticket_category", nullable = false)
    private String TicketCategory;

    @Column(name = "ticket_rate")
    private int TicketRate;

    @Override
    public String  toString() {
        return "Ticket{" +
                "Id=" + Id +
                ", TicketCategory='" + TicketCategory + '\'' +
                ", TicketRate=" + TicketRate +
                '}';
    }
}
