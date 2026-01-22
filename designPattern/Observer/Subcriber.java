package org.example.designPattern.Observer;

public class Subcriber {

    String name;


    public Subcriber(String name)
    {
        this.name=name;
    }





    public String getName() {
        return name;
    }

    public void GetVideos(String videos,String name)
    {
        System.out.println(videos +"  uploaded  sang by Amran malik  received in  " + name+ " inbox");
    }
}
