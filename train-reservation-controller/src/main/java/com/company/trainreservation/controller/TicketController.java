package com.company.trainreservation.controller;

import com.company.trainreservation.model.Ticket;
import com.company.trainreservation.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/tickets")
    public List<Ticket> getAllTicket() {
        return ticketService.getAllTicket();
    }

    @GetMapping("/tickets/{id}")
    public Ticket getTicketById(@PathVariable int id) {
        return ticketService.getTicketById(id);
    }

    @PostMapping("/tickets")
    public Ticket addNewTicket(@RequestBody Ticket newTicket) {
        return ticketService.createTicket(newTicket);
    }

    @PutMapping("/tickets")
    public void updateTicket(@RequestBody Ticket ticket) {
        ticketService.updateTicket(ticket);
    }

    @DeleteMapping("/tickets/{id}")
    public void deleteTicket(@PathVariable int id) {
        ticketService.deleteTicket(id);

    }
}
