package org.example.designPattern.singelton.eager;

public class SingeltonMain {

    public static void main(String[] args) {
        Singeton singeton = Singeton.getSingeton();
        Singeton singeton1 = Singeton.getSingeton();
        System.out.println(singeton1);
        System.out.println(singeton);
    }
}
