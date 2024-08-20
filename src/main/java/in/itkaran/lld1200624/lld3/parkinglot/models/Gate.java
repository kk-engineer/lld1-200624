package in.itkaran.lld1200624.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate extends BaseModel{
    private GateType gateType;
    private GateStatus status;
    private ParkingLot parkingLot;
    private Operator operator;
}
