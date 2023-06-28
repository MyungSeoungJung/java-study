package ch08_InterFace.InterFaceConcept;

public class TDD_styleExample {
    static void testArea(Shape s){
        //TDD 스타일로 개발 예시

        //1.기능: 너비 구하기 테스트
        int expectedResult = 100; //예상 결과
        double actualResult = s.calculaterArea(); //실제 결과
        if (expectedResult == actualResult){
            System.out.println("너비 구하기 테스트 성공");
        }else  {
            System.out.println("너비 구하기테스트 실패");
        }
    }
    static  void testPerimeter(Shape s){
        //2.기능: 둘레 구하기 테스트
        int expectedResult = 40; //예상 결과
        double actualResult = s.calculaterPerimeter(); //실제 결과
        if (expectedResult == actualResult){
            System.out.println("둘레 구하기 테스트 성공");
        }else  {
            System.out.println("둘레 구하기 테스트 실패");
        }

    }


    public static void main(String[] args) {
        //TDD 스타일로 개발 예시
        Shape s = new Square(10);
        testArea(s);
        testPerimeter(s);


        
    }
}
