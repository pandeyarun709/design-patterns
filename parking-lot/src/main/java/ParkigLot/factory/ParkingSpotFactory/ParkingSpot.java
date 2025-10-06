package ParkigLot.factory.ParkingSpotFactory;

import ParkigLot.ParkingFloor;
import ParkigLot.enums.VehicleType;
import ParkigLot.factory.VehicleFatory.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class ParkingSpot {
    private int spotId;
    protected boolean isOccupied;
    protected Vehicle vehicle;


    public abstract boolean assignVehicle(Vehicle vehicle);

    public boolean removeVehicle() {
        // Logic to remove vehicle from spot and mark as free
        return true;
    }
}
