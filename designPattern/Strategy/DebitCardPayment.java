package org.example.designPattern.Strategy;

public class DebitCardPayment implements PaymentStrategy{
    @Override
    public void payment() {
        System.out.println("Debit Card payment is successfully DoneS");

    }
}
