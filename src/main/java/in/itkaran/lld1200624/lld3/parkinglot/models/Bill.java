package in.itkaran.lld1200624.lld3.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Bill extends BaseModel{
    private Ticket ticket;
    private Gate gate;
    private Operator generatedBy;
    private int amount;
    private BillStatus status;
    List<Payment> payments;
    private Date exitTime;
}
