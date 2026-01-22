package org.example.designPattern.Observer;

public class ObserMain {

    public static void main(String[] args) {
        YotubChannel myYotubChannel=new YotubChannel();
         Subcriber subcriber=new Subcriber("vivek");
        Subcriber subcriber1=new Subcriber("shyam");
        Subcriber subcriber2=new Subcriber("mukesh");
        Subcriber subcriber3=new Subcriber("Abhishek");

        myYotubChannel.addSubriber(subcriber);
        myYotubChannel.addSubriber(subcriber1);
        myYotubChannel.addSubriber(subcriber2);
        myYotubChannel.addSubriber(subcriber3);
       myYotubChannel.updateVideos("Tu aati hai sine me jb jb sashe bharta hu teri dil ki galio har roj mai gujrata hu");
    }
}
