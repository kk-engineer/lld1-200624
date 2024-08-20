package in.itkaran.lld1200624.lld3.parkinglot.repositories;

import in.itkaran.lld1200624.lld3.parkinglot.models.Vehicle;

import java.util.Map;
import java.util.TreeMap;

public class VehicleRepository {
    private Map<Long, Vehicle> vehicleMap = new TreeMap<>();
    private Map<String, Vehicle> vehicleMapByRegistrationNumber = new TreeMap<>();
    private Long previousId = 0L;

    public Vehicle save(Vehicle vehicle) {
        if (vehicle.getId() == null) {
            vehicle.setId(++previousId);
        }
        vehicleMap.put(vehicle.getId(), vehicle);
        return vehicle;
    }

    public Vehicle findVehicleById(Long id) {
        return vehicleMap.get(id);
    }

    public Vehicle findVehicleByRegistrationNumber(String registrationNumber) {
        return vehicleMapByRegistrationNumber.get(registrationNumber);
    }
}
