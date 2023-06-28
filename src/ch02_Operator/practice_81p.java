package ch02_Operator;

public class practice_81p {
    public static void main(String[] args) {

        //06
        int price  = 187000;



        int oman   = price / 50000;   // 첫번째 계산식 187000 / 15000 = 3
        int ilman  = price % 50000 / 10000; // 187000 % 50000 = 나머지 37000(십만원 단위를 제거하면 됨) / 10000(만원단위로 잔돈 계산) = 3
        int ochun  = price % 10000 / 5000;  //세번째 계산식을 하는 데 필요한 7천원         ( 만원 단위를 제거하면 됨 )
        int ilchun = price % 5000  / 1000;  //네번째 계산식을 하는 데 필요한 2천원         (천 단위로 2천원을 맞추면 됨)
        

        System.out.println("5만원권 :" + oman + "장");
        System.out.println("1만원권 :" + ilman + "장") ;
        System.out.println("5천원권 :" + ochun + "장") ;
        System.out.println("1천원권 :" + ilchun + "장") ;


        //07

        int number = 324;
        // 100으로 나누면 100미만 숫자들이 날아감
        // 날아간 100미만 숫자들의 뒷자리 추가해주기 * 100
        int result =  (number / 100) * 100;
        System.out.println(result);


    }
}
