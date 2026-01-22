package org.example.designPattern.Strategy;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void payment() {
        System.out.println("UpiPayment is successfully Done");
    }
}
