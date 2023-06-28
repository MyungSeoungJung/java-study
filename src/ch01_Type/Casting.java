package ch01_Type;

public class Casting {
    public static void main(String[] args) {

        //형변환 (형식 변환,Casting, conversion)
        //변수나 값의 자료형을 다른 자료형으로 변환하는 과정

        //------------------------------------------------------------------------------------------------
        //1. 묵시적 형변환(자동 형변환) 웬만하면 잘 안 쓰는게 좋음(알 수 없는 오류 가능성이 올라감)
        //묵시적 변환의 원리는 더 작은 값의 변수를 더 큰 값을 저장 할 수 있는 변수에 대입
        //(작은 상자에 담긴 물건을 더 큰 상자에 담는 행위라 별 다른 행위 없어도 옮길 수 있음)
        int a = 10;  //  작은 타입의 값
        double b = a;  //더 큰 타입의 값
        System.out.println(b);

        //------------------------------------------------------------------------------------------------

        //2. 명시적 형변환
        //더 큰 상자에 담긴 큰 물건을 작은 상자에 옮기려는 행위라 특수한 행위가 필요함 = 명시적 형변환
        double c = 124;  //큰 타입의 값
        int d = (int) c; // int는 double보다 작은 타입의 값

        System.out.println("-----------------------------------------------------------------------------------");

        //정수 > 문자열로 변환 (자주 많이 사용)
        // "10  <-> 10
        int x = 10;
        String str = Integer.toString(x);
        String strValue = String.valueOf(x);

        System.out.println(str);
        System.out.println(strValue);


        //소수점 > 문자열로 변환 : decimal
        double decimal = 10.5;
        String strDecimal = Double.toString(decimal);
        String strDecimal1 = String.valueOf(decimal);  // *** .valueOf는 모든 타입에 가능 ***

        System.out.println(strDecimal);
        System.out.println(strDecimal1);

        System.out.println("-----------------------------------------------------------------------------------");

        //문자열에서 숫자로 변환
        String numStr = "10";
        int num1 = Integer.valueOf(numStr);
        int num2 = Integer.parseInt(numStr);

        System.out.println(num1);
        System.out.println(num2);


        System.out.println("-----------------------------------------------------------------------------------");
        //              요약
        //valueOf. 앞에 있는 타입으로 변환한다는 뜻
        //String.valueOf    = 스트링으로 변환
        //Integer.valueOf   = 정수로 변환
        //Double.valueOf    = 실수로 변환

        //소수점 x = int
        //소수점 x 20억 넘을 거 같아= long
        //소수점 o = Double
        //글자로 변환 String

    }
}
