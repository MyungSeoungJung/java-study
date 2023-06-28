package ch02_Operator;

public class Compare {
    public static void main(String[] args) {
        //동등 비교 연산자
        //똑같은지 비교
        int a = 5;
        int b = 3;
        boolean result = a == b; //false

        String str = "abc";  // 같은 주소로 저장
        String str1 = "abc"; // 같은 주소로 저장

        boolean strresult = str == str1;  // 같은 주소로 저장
        boolean strresult1 = str != str1; // 같은 주소로 저장

        //문자열 비교에는 ==,!= 를 사용하지않음  == 변수명.equls(비교값) 구문 사용
        boolean reuslt = str.equals(str1);  //equals구문은 실제의 값을 비교함
        boolean reuslt1 = !str.equals(str1);  // ! = 결과값이 반대로


        //참조 자료형은 = 값이 있는 공간의 주소
        //문자열은 기본자료형x 참조 자료형이라 주소를 할당
        /*
         String str1 = new String("abc");  //새로운 주소로 저장
         String str12 = new String("abc");
         boolean result = str1 == str12;    =  false값이 나옴 why? 주소가 다르기때문에
         */




        

        //부등 비교 연산자 (not equal)
        // ! = not
        boolean resultNot = a != b;
        


    }
}
