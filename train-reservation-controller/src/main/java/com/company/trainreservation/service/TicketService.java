package com.company.trainreservation.service;

import com.company.trainreservation.model.Ticket;
import com.company.trainreservation.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TicketService {
    @Autowired
    TicketRepository repo;

    public List<Ticket> getAllTicket() {
        return repo.findAll();
    }

    public Ticket createTicket(Ticket newTicket) {
        repo.save(newTicket);
        return newTicket;
    }

    public Ticket getTicketById(int id) {
        Optional<Ticket> ticket = repo.findById(id);
        return ticket.orElse(null);
    }

    public void updateTicket(Ticket ticket) {
        repo.save(ticket);
    }

    public void deleteTicket(int id) {
        Optional<Ticket> ticket = repo.findById(id);
        ticket.ifPresent(value -> repo.delete(value));
    }
}
