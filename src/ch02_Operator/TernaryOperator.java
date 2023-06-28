package ch02_Operator;

public class TernaryOperator {
    public static void main(String[] args) {
        //삼항 연산자
        //삼항연산자 항이 3개다
        //항은 연산의 대상
        //1항 연산자 : ++a
        //2항 연산자 : a + b

        //3항 연산자 : (조건식) ? 값1 : 값2  
        // 조건식의 값이 ture면 ? 뒤의 값1을 반환
        // 조건식의 값이 false면 : 뒤의 값2을 반환
        // 조건식은 true/false를 반환할 수 있는 식만 올 수 있디.
        int num = 10;
        int num2 = 5;
        int max = (num > num2) ? num : num2;
        System.out.println("더 큰 숫자는" + max);


    }
}
