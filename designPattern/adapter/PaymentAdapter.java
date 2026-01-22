package org.example.designPattern.adapter;

public class PaymentAdapter implements PaymentProcessor{

    ThirdPartyPayement thirdPartyPayement;

    public PaymentAdapter (ThirdPartyPayement thirdPartyPayement)
    {
        this.thirdPartyPayement=thirdPartyPayement;
    }

    @Override
    public void payment(Integer amount) {

        thirdPartyPayement.makePayement(Double.valueOf(amount));

    }
}
