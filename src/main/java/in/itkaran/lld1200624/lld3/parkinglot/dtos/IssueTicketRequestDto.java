package in.itkaran.lld1200624.lld3.parkinglot.dtos;

import in.itkaran.lld1200624.lld3.parkinglot.models.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueTicketRequestDto {
    private Long gateId;
    private VehicleType vehicleType;
    private String registrationNumber;
    private String ownerName;
}
