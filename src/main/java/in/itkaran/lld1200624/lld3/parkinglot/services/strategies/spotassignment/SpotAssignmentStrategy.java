package in.itkaran.lld1200624.lld3.parkinglot.services.strategies.spotassignment;

import in.itkaran.lld1200624.lld3.parkinglot.models.ParkingSpot;
import in.itkaran.lld1200624.lld3.parkinglot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(VehicleType vehicleType);
}
