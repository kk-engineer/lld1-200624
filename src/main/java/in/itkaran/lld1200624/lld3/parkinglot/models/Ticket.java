package in.itkaran.lld1200624.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Ticket extends BaseModel{
    private String ticketNumber;    // Random String of 7 characters
    private Date entryTime;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private Gate entryGate;
    private Operator generatedBy;
}
