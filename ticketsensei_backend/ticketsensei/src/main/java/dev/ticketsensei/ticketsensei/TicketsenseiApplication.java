package dev.ticketsensei.ticketsensei;

//import dev.ticketsensei.ticketsensei.entity.Ticket;
//import dev.ticketsensei.ticketsensei.repository.TicketRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = "dev.ticketsensei.ticketsensei.entity")
@EnableJpaRepositories(basePackages = "dev.ticketsensei.ticketsensei.repository")
@SpringBootApplication
public class TicketsenseiApplication  {
//implements CommandLineRunner
	public static void main(String[] args) {
		SpringApplication.run(TicketsenseiApplication.class, args);
	}

//	@Autowired
//	public TicketRepository ticketRepository;
//
//	@Override
//	public void run(String... args) throws Exception {

//		Ticket ticket1 = Ticket.builder()
//				.TicketRate(120)
//				.TicketCategory("VIP Birch")
//				.build();
//
//		Ticket ticket2 = Ticket.builder()
//				.TicketRate(150)
//				.TicketCategory("VVIP Birch")
//				.build();
//
//		Ticket ticket3 = Ticket.builder()
//				.TicketRate(1000)
//				.TicketCategory("Fouple VVIP Birch")
//				.build();
//
//		ticketRepository.save(ticket1);
//		ticketRepository.save(ticket2);
//		ticketRepository.save(ticket3);
//	}
}
