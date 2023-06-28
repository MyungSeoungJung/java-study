package ch03_Loop;

public class LoopWhile_04 {
    public static void main(String[] args) {
        
        // while (반복문)
        
        /*
        while (조건식) {
         조건식이 true인 동안 실행될 코드
         조건이 false가 되는 탈출구문이 일반적으로 존재
        }
         */

        int i = 0;
        
        while (i < 5) {
            System.out.println("i의 값" + i); //조건이 true인 동안 무한으로 실행
            if ( i == 2) {
                //반복문을 종료하고 빠져나옴, 이후 코드는 실행하지않음
                break;  //break는 가장 가까운 반복문을 종료하고 나옴
            }
            i ++; //무한으로 실행 안되게 false값이 되도록 탈출구문이 일반적으로 존재한다
        }
        System.out.println("반복문 종료"); //break를 타서 여기 구문 실행

        System.out.println("-------------------------------------------------------");

        for (int j = 0; j < 5; j++) {
            if (j == 2){
                continue; // if문의 true이므로 continue 코드 실행
                // contine는 이후 코드를 "스킵"하고 다음 반복을 실행, 가장 가까운 반복의 다음 반복코드를 실행
            }
            System.out.println("j의 값" + j);
        }
    }
}
