package ch10_ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        }catch (ArithmeticException e){
            System.out.println("산술연산 예외 발생" + e.getMessage());
        }finally {
            //정상처리 상황과 예외처리 상황 모두 실행되는 코드 블록
            System.out.println("연산이 실행되었습니다");
        }
    }


    //메서드 throws 예외종류
    public static int divide(int a, int b) throws ArithmeticException{
        int result = 0;
        result = a / b;
        return result;
    }
}
