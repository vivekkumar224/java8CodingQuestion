package org.example.designPattern.Strategy;

public class StrategyMain {

    public static void main(String[] args) {
        CreditCardPayment creditCardPayment=new CreditCardPayment();
        PayPalPayment payPalPayment=new PayPalPayment();
        DebitCardPayment debitCardPayment=new DebitCardPayment();
        UpiPayment upiPayment=new UpiPayment();

        PaymentManagement paymentManagement=new PaymentManagement(creditCardPayment);
        paymentManagement.doPayment();
        PaymentManagement paymentManagement1=new PaymentManagement(payPalPayment);
        paymentManagement1.doPayment();

        PaymentManagement paymentManagement2=new PaymentManagement(debitCardPayment);
        paymentManagement2.doPayment();
        PaymentManagement paymentManagement3=new PaymentManagement(upiPayment);
        paymentManagement3.doPayment();
    }
}
