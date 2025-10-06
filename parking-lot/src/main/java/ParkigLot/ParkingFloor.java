package ParkigLot;

import ParkigLot.enums.SpotType;
import ParkigLot.enums.VehicleType;
import ParkigLot.factory.ParkingSpotFactory.ParkingSpot;
import ParkigLot.factory.ParkingSpotFactory.ParkingSpotFactory;
import ParkigLot.factory.VehicleFatory.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingFloor {

    private int floor;
    List<ParkingSpot> parkingSpotList;


    public void addParkingSpot(VehicleType vehicleType) {
        parkingSpotList.add(ParkingSpotFactory.createParkingSpot(vehicleType));
    }


    public void removeParkingSpot(VehicleType vehicleType) {
        //find remove
    }

}
