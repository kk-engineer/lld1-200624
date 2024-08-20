package in.itkaran.lld1200624.lld3.parkinglot.repositories;

import in.itkaran.lld1200624.lld3.parkinglot.models.ParkingFloor;

import java.util.Map;
import java.util.TreeMap;

public class ParkingFloorRepository {
    private Map<Long, ParkingFloor> parkingFloorMap = new TreeMap<>();
    private Long previousId = 0L;

    public ParkingFloor save(ParkingFloor parkingFloor) {
        if (parkingFloor.getId() == null) {
            parkingFloor.setId(++previousId);
        }
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        return parkingFloor;
    }

    public ParkingFloor findParkingFloorById(Long id) {
        return parkingFloorMap.get(id);
    }
}
