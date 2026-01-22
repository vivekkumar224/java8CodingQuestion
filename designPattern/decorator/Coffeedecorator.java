package org.example.designPattern.decorator;

public abstract class Coffeedecorator implements Coffee{

    protected Coffee coffee;

    public Coffeedecorator (Coffee coffee)
    {
        this.coffee=coffee;
    }


}
