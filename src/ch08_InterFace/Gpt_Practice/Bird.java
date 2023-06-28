package ch08_InterFace.Gpt_Practice;

public class Bird implements Singable{

    @Override
    public void sing() {
        System.out.println("The bird is singing");
    }
}
