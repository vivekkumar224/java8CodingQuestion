package org.example.designPattern.adapter;

public class AdapterMain {

    public static void main(String[] args) {

        ThirdPartyPayement thirdPartyPayement=new ThirdPartyPayement();
        PaymentAdapter paymentAdapter=new PaymentAdapter(thirdPartyPayement);
        paymentAdapter.payment(2000);
    }
}
