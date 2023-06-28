package ch03_Loop;

public class ConditionCase_02 {
    public static void main(String[] args) {
        //switch 문
        int dayOfWeek = 2;

        /*
        switch (변수) {
         }
         */

        // switch문은 변수의 값과 일치하는 case 구문을 실행
        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;  //break를 안 쓰면 case에 맞는 코드를 실행 후 뒤에 있는 코드까지 실행되므로 가급적 break를 사용.
            case 3:
                System.out.println("수요일");
                break;
                
            default:
                System.out.println("목요일,금요일,토요일, 또는 일요일입니다"); // 일치하는 case를 찾지못하면 default문 실행한다. (맨 마지막 사용)
        }


        System.out.println("--------------------------------------------------------------");
        
        
        // switch문을 if - else문으로 변경
        if (dayOfWeek == 1) {
            System.out.println("월요일입니다");
        } else if (dayOfWeek == 2) {
            System.out.println("화요일입니다");
        } else if (dayOfWeek == 3) {
            System.out.println("수요일입니다");
        } else {
            System.out.println("목요일,금요일,토요일, 또는 일요일입니다");
        }

    }
}
