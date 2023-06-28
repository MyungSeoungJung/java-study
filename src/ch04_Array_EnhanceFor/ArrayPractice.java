package ch04_Array_EnhanceFor;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int inputNum = sc.nextInt();
/*
        int[] num = {1,2,3,4,5,6,7};

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

 */
        /*
        //gpt 배열문제 7번
        // 정수형으로 구성된 길이 4의 배열을 선언하고, 사용자로부터 4개의 정수를 입력받아 배열에 할당하고,
        // 배열의 모든 요소의 합을 출력하세요.
        int sum = 0;
        int[] num1 = new int[4];
        for (int i = 0; i < num1.length; i++) {
            int inputNum1 = sc.nextInt();
            num1[i] = inputNum1;
            sum += num1[i];
        }
        System.out.println(sum);

         */
    //gpt문제 5번 짝수만 할당
        int[] arr = new int[6];
        for (int i = 0; i <= 6; i++) {
            int input = sc.nextInt();
            if (6 + 1 / input == 0) {  // 2 4 6 == 0
                arr[i] = input;
            }else{
                System.out.println("짝수가 아닙니다");
            }
            System.out.println(arr[i]);
        }

        System.out.println("------------------------------------------------------");

        int[] num1 = new int[5];
        int num2 = sc.nextInt();





        }
    }
