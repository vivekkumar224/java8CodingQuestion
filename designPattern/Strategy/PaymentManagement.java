package org.example.designPattern.Strategy;

public class PaymentManagement {


    PaymentStrategy paymentStrategy;

    public PaymentManagement(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy=paymentStrategy;
    }
    public void doPayment()
    {
        paymentStrategy.payment();
    }
}
