package ch08_InterFace.InterFaceConcept;

public class Rectangle implements Shape,Drawble{  //2개 인터페이스 implements 하려면 추가하려는 메서드 구현해야됨

    private double width;
    private double height;


    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculaterArea(){
        return width * height;
    }

    @Override
    public double calculaterPerimeter(){
        return 2 * (width * height);
    }

    @Override   // 2번째 추가하려는 인터페이스에 있는 메서드 생성
    public void drawLines() {

    }
}
