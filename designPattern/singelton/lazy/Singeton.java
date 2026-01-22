package org.example.designPattern.singelton.lazy;

public class Singeton {

    private static Singeton singeton;

    private Singeton()
    {

    }

    public static Singeton getSingeton()
    {
        if(singeton==null)
        {
           singeton = new Singeton();
           return singeton;
        }
        return singeton;
    }
}

