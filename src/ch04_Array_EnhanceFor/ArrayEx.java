package ch04_Array_EnhanceFor;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {

        //사용자로부터 콘솔창(터미널)에서 키보드로 입력 받을때
        //scanner 초기화
         Scanner scanner = new Scanner(System.in);
         /*
        //정수값 1개를 입력 받을 수 있음
        //커서(프롬포트) 깜빡이고 있다는 것은 입력 대기중
        System.out.print("정수 값을 입력하세요 : ");
        int inputNum = scanner.nextInt();
         System.out.println("입력 받은 숫자는 : " + inputNum);

        System.out.println("---------------------------------------------------");


        *///

        int[] numbers = {7, 14, 3, 8, 21, 5};
        int max = numbers[0];

        for (int num : numbers) {
            if (max < num){
                max += num;
            }
        }

        System.out.println("최댓값: " + max);

    }
}
