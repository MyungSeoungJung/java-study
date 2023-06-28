package ch08_InterFace.InterFaceConcept;

public class Circle implements Shape{
    private  double radius;

    public  Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculaterArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculaterPerimeter(){
        return 2 * Math.PI * radius;
    }
}
