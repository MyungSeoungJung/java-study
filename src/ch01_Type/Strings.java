package ch01_Type;

public class Strings {

    public static void main(String[] args) {
        //String(문자열)
        //자바에서 String은 기본 자료형이 아니다.
        String greeting = "Hello World";



        // ctrl + /는 선택 영역만큼 주석이 생김

        //여러줄 슬래쉬는 /*  */


        //문자열 초기화 방법
        //문자열 값을 코드에 직접 입력한 것을 리터럴이라 한다(literal)
        String firstName = new String("John");
        String lastName  = "Doe";

        //문자열 결합 (concat)
        //변수를 참조해서 사용할 떄는 이름은 대소문자를 가립니다(case-senstive)
        String fullName = firstName + " " +lastName;
        System.out.println(fullName);

        //제어문자 (escape characters. escape sequence)
        //특수문자, 줄바꿈, 탭
        String message =  "\"Hello World\"";      //""
        String message1 = "Hello\tWorld ";      // 탭
        String message2 = "\'Hello World \' "; // ''
        String message3 = "Hello\nWorld ";    // 줄 바꿈
        String message4 = "\\Hello World \\"; // \백슬래쉬

        System.out.println(message);
        System.out.println(message1);
        System.out.println(message2);
        System.out.println(message3);
        System.out.println(message4);

    }
}