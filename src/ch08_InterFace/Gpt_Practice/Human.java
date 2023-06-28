package ch08_InterFace.Gpt_Practice;

public class Human implements Walkable,Runnable{
    @Override
    public void run() {
        System.out.println("달리기");
    }

    @Override
    public void walk() {
        System.out.println("일하기");
    }
}
