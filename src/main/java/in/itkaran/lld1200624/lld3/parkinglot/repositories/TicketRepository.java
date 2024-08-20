package in.itkaran.lld1200624.lld3.parkinglot.repositories;

import in.itkaran.lld1200624.lld3.parkinglot.models.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    Map<Long, Ticket> ticketMap = new TreeMap<>();
    private Long previousId = 0L;

    public Ticket save(Ticket ticket) {
        if (ticket.getId() == null) {
            ticket.setId(++previousId);
        }
        ticketMap.put(ticket.getId(), ticket);
        return ticket;
    }
}
