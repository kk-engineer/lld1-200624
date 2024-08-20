package in.itkaran.lld1200624.lld3.parkinglot.services;

import in.itkaran.lld1200624.lld3.parkinglot.exceptions.GateNotFoundException;
import in.itkaran.lld1200624.lld3.parkinglot.models.*;
import in.itkaran.lld1200624.lld3.parkinglot.repositories.*;
import in.itkaran.lld1200624.lld3.parkinglot.services.factory.SpotAssignmentStrategyFactory;
import in.itkaran.lld1200624.lld3.parkinglot.services.strategies.spotassignment.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private TicketRepository ticketRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private ParkingFloorRepository parkingFloorRepository;

    public TicketService(GateRepository gateRepository,
                            TicketRepository ticketRepository,
                            VehicleRepository vehicleRepository,
                            ParkingLotRepository parkingLotRepository,
                            ParkingFloorRepository parkingFloorRepository,
                            ParkingSpotRepository parkingSpotRepository
                         ) {
        this.gateRepository = gateRepository;
        this.ticketRepository = ticketRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
    }

    public Ticket issueTicket(
            Long gateId,
            String vehicleNumber,
            VehicleType vehicleType,
            String ownerName)
            throws GateNotFoundException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        // findGateById
        Optional<Gate> optionalEntryGate = gateRepository.findGateById(gateId);
        if (optionalEntryGate.isEmpty()) {
            throw new GateNotFoundException("Gate not found" + gateId);
        }

        Gate entryGate = optionalEntryGate.get();
        ticket.setEntryGate(entryGate);
        ticket.setGeneratedBy(entryGate.getOperator());

        // Get the Vehicle details if present else create a new vehicle
        Vehicle savedVehicle = vehicleRepository.findVehicleByRegistrationNumber(vehicleNumber);
        if (savedVehicle == null) {
            Vehicle vehicle = new Vehicle();
            vehicle.setRegistrationNumber(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleType(vehicleType);
            savedVehicle = vehicleRepository.save(vehicle);
        }
        ticket.setVehicle(savedVehicle);

        // Get the ParkingSpot
        Long parkingLotId = entryGate.getParkingLot().getId();
        ParkingLot parkingLot = parkingLotRepository.findParkingLotById(parkingLotId);

        SpotAssignmentStrategyType spotAssignmentStrategyType = parkingLot.getSpotAssignmentStrategyType();
        FeeCalculationStrategyType feeCalculationStrategyType = parkingLot.getFeeCalculationStrategyType();

        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.
                                                        getSpotAssignmentStrategy(spotAssignmentStrategyType);

        ticket.setParkingSpot(spotAssignmentStrategy.assignSpot(vehicleType));
        ticket.setTicketNumber("AX456Z");
        return ticketRepository.save(ticket);
    }
}
