package ParkigLot.factory.ParkingSpotFactory;

import ParkigLot.factory.VehicleFatory.Vehicle;

public class CarParkingSpot extends ParkingSpot {

    public CarParkingSpot() {
       super();
    }

    public boolean assignVehicle(Vehicle v) {
        if (this.isOccupied) {
            System.out.println("Allocated Handicapped slot " + 1 + " to " + v.getPlate());
            this.vehicle = v; isOccupied = true;  return true;
        }
        return false;
    }
}
