package ch08_InterFace.Gpt_Practice;

public class Rabbit implements Runnable {

    @Override
    public void run(){
        System.out.println("The rabbit is running fast");
    }
}
