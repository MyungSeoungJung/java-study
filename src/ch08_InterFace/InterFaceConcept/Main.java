package ch08_InterFace.InterFaceConcept;

public class Main {
    public static void main(String[] args) {
        //인터페이스 객체 생성이 불가하다.
          //Shape a = new Shape();
        //구현체로만 객체 생성이 가능하다
        // ex: 회사 경영진이 야, 원으로 하니까 후져 사각형으로 바꿔
        //1. 인터페이스를 쓰는 이유 1번째가 갈아끼기 쉽다
        Shape s = new Circle(5);
        System.out.println(s.calculaterArea());
        System.out.println(s.calculaterPerimeter());

        
    }
}
