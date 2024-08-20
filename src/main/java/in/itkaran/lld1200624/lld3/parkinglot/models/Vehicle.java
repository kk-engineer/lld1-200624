package in.itkaran.lld1200624.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle extends BaseModel{
    private String registrationNumber;
    private String ownerName;
    private VehicleType vehicleType;
}
