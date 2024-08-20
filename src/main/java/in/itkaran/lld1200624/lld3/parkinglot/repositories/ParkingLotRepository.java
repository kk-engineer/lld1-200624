package in.itkaran.lld1200624.lld3.parkinglot.repositories;

import in.itkaran.lld1200624.lld3.parkinglot.models.ParkingLot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLotMap = new TreeMap<>();
    private Long previousId = 0L;

    public ParkingLot save(ParkingLot parkingLot) {
        if (parkingLot.getId() == null) {
            parkingLot.setId(++previousId);
        }
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        return parkingLot;
    }

    public ParkingLot findParkingLotById(Long id) {
        return parkingLotMap.get(id);
    }

}
