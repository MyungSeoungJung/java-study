package ch05.ClassConcept;

public class UtilsMain {
    public static void main(String[] args) {
        //문제 1번 ---------------------------------------------------------
        //Utils 클래스 객체를 생성하고 매서드를 실행
           Utils _utils = new Utils();
        //(클래스) (객체명) = new Utils();

        int a = 5;
        int b = 123;

        //메서드 호출
        //결과값    ↓ 아래처럼 변수에 넣어줘야지 사용가능
        int result = _utils.sum(a, b);
        int result2 = _utils.sum(3,5);
       // System.out.println(result);

        //문제 3번 ---------------------------------------------------------
        int[] c = {1,2,3,4,5,7,8};
        int arrResult = _utils.sumArr(c);   //메소드 호출 return값이 반환됨
        System.out.println(arrResult);
    }
}
