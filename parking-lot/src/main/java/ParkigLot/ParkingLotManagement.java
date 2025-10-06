package ParkigLot;

import ParkigLot.ParkingFloor;
import ParkigLot.enums.ParkingSpotType;
import ParkigLot.enums.VehicleType;
import ParkigLot.factory.VehicleFatory.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotManagement {


    private static ParkingLotManagement parkingLotManagement;

    private int totalCapacity;
    private Map<Integer, ParkingFloor> parkingFloorMap;

    private ParkingLotManagement() {
        totalCapacity = 0;
        parkingFloorMap = new HashMap<>();
    }

    public static ParkingLotManagement getParkingLotManagementInstance() {
        if(parkingLotManagement == null) {
            parkingLotManagement = new ParkingLotManagement();
        }

        return parkingLotManagement;
    }

    public void addParkingFloor() {

    }

    public void addParkingSlot(int floor, VehicleType vehicleType) {
        ParkingFloor parkingFloor = parkingFloorMap.getOrDefault(floor, new ParkingFloor());
        parkingFloor.addParkingSpot(vehicleType);
        totalCapacity++;
    }

    public void removeParkingSlot(int floor, VehicleType vehicleType) {
        if(!parkingFloorMap.containsKey(floor)) {
          throw new IllegalArgumentException("Floor not exist");
        }
        ParkingFloor parkingFloor = parkingFloorMap.get(floor);
        parkingFloor.removeParkingSpot(vehicleType);
        totalCapacity--;
    }

    public void parkVehicle() {


    }

    public void exitVehicle() {

    }

    public void parkingPayment() {

    }

    public void exitVehicle() {

    }



}
