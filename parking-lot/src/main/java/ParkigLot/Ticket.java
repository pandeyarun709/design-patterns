package ParkigLot;

import ParkigLot.enums.PaymentStatus;
import ParkigLot.enums.PaymentType;
import ParkigLot.factory.VehicleFatory.Vehicle;
import ParkigLot.strategy.payments.Payment;
import ParkigLot.strategy.payments.PaymentStrategy;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

public class Ticket {

    Vehicle vehicle;

    LocalDateTime entranceTime;
    LocalDateTime exitTime;
    String entranceGateId;
    String exitGateId;
    double amount;
    PaymentStatus paymentStatus = PaymentStatus.UNPAID;



    public Ticket(String entranceGateId) {
        this.entranceGateId = entranceGateId;
        this.entranceTime = LocalDateTime.now();
    }

    public void proceedExit(String exitGateId, LocalDateTime exitTime) {
        this.exitGateId = exitGateId;
        this.exitTime = exitTime;
    }


    public void payAmount(PaymentType paymentType, double amount) {
        PaymentStrategy payment= new PaymentStrategy(paymentType);
        this.amount = amount;
        payment.proceedPayment(amount);
        this.paymentStatus = PaymentStatus.COMPLETED;
    }

}
