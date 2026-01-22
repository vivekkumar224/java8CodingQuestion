package org.example.designPattern.Strategy;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void payment() {
        System.out.println("Paypal payment is successfully done");
    }
}
