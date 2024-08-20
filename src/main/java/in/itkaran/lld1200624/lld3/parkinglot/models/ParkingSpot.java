package in.itkaran.lld1200624.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingSpot extends BaseModel{
    private String spotNumber;      //e.g A1, B5, G7 etc
    private ParkingSpotStatus status;
    private List<VehicleType> supportedVehicleTypes;
    private Long parkingFloorId;
}
