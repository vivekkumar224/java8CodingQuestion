package org.example.designPattern.decorator;

public class SuggerCofee extends Coffeedecorator{

    public SuggerCofee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Integer getPrice() {
        return coffee.getPrice()+10;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ "  added sugar";
    }
}
