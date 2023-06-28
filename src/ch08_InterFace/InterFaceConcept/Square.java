package ch08_InterFace.InterFaceConcept;

public class Square implements Shape{
    private double side; //변의 값

    public Square(double side){
        this.side = side;
    }


    @Override
    public double calculaterArea(){
        return side * side;
    }

    @Override
    public double calculaterPerimeter(){
        return 4 * side;
    }


}
