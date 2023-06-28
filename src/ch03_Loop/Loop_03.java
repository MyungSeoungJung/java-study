package ch03_Loop;

public class Loop_03 {
    public static void main(String[] args) {
        //반복문 (Loop)
        //특정 조건이 만족되는 동안 계속해서 실행되는 코드
        
        // 1. for문
        /*
        for (초기화; 조건식; 증감식) {
         반복해서 실행할 코드
        }
         */
        
        // 1.가장 처음에 초기화 식이 실행됨, int i = 0;
        // 2. 조건식 실행, i < 5                  == i가 5보다 작냐?
        // 3. 조건이 true이면 블록안에 코드가 실행    == i가 5보다 작음으로 블록안의 코드 실행
        // 4. 증삼식 실행 
        // 5. 1번의 초기화식은 처음에만 실행한 후 실행 하지않음
        // 코드 진행중 조건이 false가 되면 블록안의 코드 실행하지 않고 반복문을 종료함.
        for (int i = 0; i < 5; i++) {
            System.out.println("i의 값 :" + i);
        }

    }
}
