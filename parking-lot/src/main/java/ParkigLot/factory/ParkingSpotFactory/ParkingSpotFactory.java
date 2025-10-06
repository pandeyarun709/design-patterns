package ParkigLot.factory.ParkingSpotFactory;

import ParkigLot.enums.SpotType;
import ParkigLot.enums.VehicleType;

public class ParkingSpotFactory {

    public static ParkingSpot createParkingSpot(VehicleType vehicleType) {

        switch (vehicleType) {
            case CAR:
                return  new CarParkingSpot();
        }

        return new CarParkingSpot();
    }
}
