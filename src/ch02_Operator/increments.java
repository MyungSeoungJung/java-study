package ch02_Operator;

public class increments {
    public static void main(String[] args) {

        //증감 또는 감소 연산

        //증감 연산
        int a = 10;
        System.out.println(++a);

        //감소 연산
        int b = 10;
        System.out.println(--b);


        //후위연산자 마지막에 연산작동
        System.out.println(a++);
        System.out.println(b--);
        
        System.out.println("------------------------------------------------------");
        
        //전위 연산자는 계산식 전에 ++i ,--i     +1,-1를 계산하고 계산식 작용
        int num1 = 7;
        System.out.println(++num1 - 1);  //num이 이미 7이 된 상태에서 -1  = 7
        System.out.println(++num1 -1);   //num이 위에 계산식에서 8이된상태에서 ++를해서 9 - 1 = 8

        // 후위 연산자는 계산식을 완료한다음 i++ ,i--    +1 , -1 동작
        int num = 7;
        System.out.println(num-- + 1);  //num이 후위연산으로 7 그대로인 상태에서 + 1  = 8
        System.out.println(num-- + 1);  //위의 계산식에서 후위연산 num--로 6이된 상태에서 + 1 = 7
        System.out.println(num-- + 1);  //위의 계산식에서 후위연산 num--로 5이된 상태에서 + 1 = 6
        //  https://needneo.tistory.com/176 후위연산자 이해안될때 링크



    }
}
