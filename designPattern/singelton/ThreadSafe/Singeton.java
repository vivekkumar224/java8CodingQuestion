package org.example.designPattern.singelton.ThreadSafe;

public class Singeton {

    private static Singeton singeton;

    private Singeton()
    {

    }

    public static  synchronized Singeton getSingeton()
    {
        if(singeton==null)
        {
           singeton = new Singeton();

        }
        return singeton;
    }
}

