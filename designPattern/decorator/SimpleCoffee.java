package org.example.designPattern.decorator;

public class SimpleCoffee implements Coffee{


    @Override
    public Integer getPrice() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
