package org.example.designPattern.decorator;

public class DecoratorMain {

    public static void main(String[] args) {

        MalaiCoffee malaiCoffee = new MalaiCoffee( new SuggerCofee(new SimpleCoffee()));
        System.out.println(malaiCoffee.getDescription());
        System.out.println(malaiCoffee.getPrice());
    }
}
