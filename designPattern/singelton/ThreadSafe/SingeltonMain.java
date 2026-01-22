package org.example.designPattern.singelton.ThreadSafe;




public class SingeltonMain {

    public static void main(String[] args) {





       Thread thread=new Thread(()->{
           try
           {
               Singeton singeton =Singeton.getSingeton();
               Thread.sleep(2000);
               System.out.println(singeton);
           }
           catch (InterruptedException interruptedException)
           {

           }

       });
       Thread thread1=new Thread(()->{
           try
           {
               Singeton singeton1 =Singeton.getSingeton();
               Thread.sleep(2000);
               System.out.println(singeton1);
           }
           catch (InterruptedException interruptedException)
           {

           }
       });

       thread.start();
       thread1.start();


    }
}
