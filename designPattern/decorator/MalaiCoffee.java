package org.example.designPattern.decorator;

public class MalaiCoffee extends Coffeedecorator {


    public MalaiCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Integer getPrice() {
        return coffee.getPrice()+ 20;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ "  malai";
    }
}
