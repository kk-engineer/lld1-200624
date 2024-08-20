package in.itkaran.lld1200624.lld3.parkinglot.controllers;

import in.itkaran.lld1200624.lld3.parkinglot.dtos.IssueTicketRequestDto;
import in.itkaran.lld1200624.lld3.parkinglot.dtos.IssueTicketResponseDto;
import in.itkaran.lld1200624.lld3.parkinglot.dtos.ResponseStatus;
import in.itkaran.lld1200624.lld3.parkinglot.exceptions.GateNotFoundException;
import in.itkaran.lld1200624.lld3.parkinglot.models.Ticket;
import in.itkaran.lld1200624.lld3.parkinglot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto issueTicketRequestDto) {
        IssueTicketResponseDto issueTicketResponseDto = new IssueTicketResponseDto();
        try {
            Ticket ticket = ticketService.issueTicket(
                    issueTicketRequestDto.getGateId(),
                    issueTicketRequestDto.getRegistrationNumber(),
                    issueTicketRequestDto.getVehicleType(),
                    issueTicketRequestDto.getOwnerName());
            issueTicketResponseDto.setTicket(ticket);
            issueTicketResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (GateNotFoundException e) {
            System.out.println(e.getMessage());
            issueTicketResponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return issueTicketResponseDto;
    }
}
