package org.example.designPattern.Strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void payment() {

        System.out.println("Credit Card payment is successfully DoneS");

    }
}
