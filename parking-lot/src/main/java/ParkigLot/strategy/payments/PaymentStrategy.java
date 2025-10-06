package ParkigLot.strategy.payments;

import ParkigLot.enums.PaymentType;

public class PaymentStrategy {

    private Payment payment;

    public PaymentStrategy(PaymentType paymentType) {
        switch (paymentType) {
            case UPI:
                this.payment = new UpiPayment();
        }
    }

    public double proceedPayment(double amount) {
        payment.processPayment(amount);
        return amount;
    }

}
