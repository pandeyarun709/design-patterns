package ParkigLot.factory.VehicleFatory;

import ParkigLot.Ticket;
import ParkigLot.enums.VehicleType;
import lombok.Data;

@Data
public abstract class Vehicle {

    String plate;
    VehicleType vehicleType;
}
