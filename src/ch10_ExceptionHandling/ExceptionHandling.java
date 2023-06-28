package ch10_ExceptionHandling;


//예외 처리
public class ExceptionHandling {
    
    public static void main(String[] args) {
        try {
            int term = 22; //입력값 생각을 해보자, 0이 되는 케이스는 주로 입력값을 제대로 못 받은 경우
            int amount = 240;
            int result = amount / term;
            System.out.println("한달에 " + result + "만원");
        }catch (ArithmeticException e ){ //특정 예외 상황
            System.out.println("산술연산 예외 발생" + e.getMessage());
            System.out.println("나누기 연산의 값을 정확히 입력해주세요");
        }catch (Exception e){ //일반적인 예외 상황
            System.out.println(e.getMessage());
        }
    }
}
