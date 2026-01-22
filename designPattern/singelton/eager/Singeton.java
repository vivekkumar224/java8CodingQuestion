package org.example.designPattern.singelton.eager;

public class Singeton {

    private static Singeton singeton=new Singeton();

    private Singeton()
    {

    }

    public static Singeton getSingeton()
    {
        return singeton;
    }
}
