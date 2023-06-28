package ch03_Loop;

public class Conditions_01 {
    public static void main(String[] args) {
        //조건문 (condition)
        //코드를 실행할지 말지를 결정하는데 사용한다.
        //프로그램의 로직(logic)을 제어하는 핵심적인 부분


        //if문
        /*
        if (조건식) {
          식이 true일 때 실행할 구문
        }
         */

        int age = 20;

        if(age >= 18) {
            //age가 18보다 크거가 같은가? true이므로 아래 출력문 실행
            System.out.println("성인입니다");  //true일때 출력문 실행
        }
        System.out.println("프로그램이 종료되었습니다");

        System.out.println("---------------------------------------------------------------------------");

        //if-else문
        //if문의 조건식이 true이면, if블록 {} 안의 코드 실행
        //if문의 조건식이 false면, else블록 {} 안의 코드 실행
        int age1 = 13;
        if (age1 >= 16) {
            System.out.println("성인입니다");
        } else {
            System.out.println("미성년자입니다");
        }

        System.out.println("---------------------------------------------------------------------------");


        //else - if문
        //조건이 같을 때는 조건이 만족되는 가장 위의 블록만 실행  *else if문을 쓸때는 코드의 순서를 잘 배열 해야함*
        // 코드의 깊이가 깊어지지않게 주의한다.
        int age3 = 70;

        if (age3 >= 60){
            System.out.println("노인입니다");  //true 둘 다 true이지만 이 조건식이 가장 위의 블록이라 이 블록만 실행
        } else if (age3 <= 18) {
            System.out.println("성인입니다"); //true 둘 다 true이지만 위의 블록보다 아래에 있기에 이 블록 실행 x
        } else {
            System.out.println("미성년자입니다");
        }


    }
}
