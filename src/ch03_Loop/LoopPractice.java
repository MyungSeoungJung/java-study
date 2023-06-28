package ch03_Loop;

public class LoopPractice {
    public static void main(String[] args) {
        //1
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------------");
        //2
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            i++;
        }
        System.out.println("-----------------------------------------------------");

        //3
        for (int i = 1; i < 10; i++) {
            System.out.println("5 x "+ i + " = " + (5 * i));
        }

        System.out.println("-----------------------------------------------------");

        //4
        for (int i = 10; i > 0; i--) {
            System.out.println(i + " i의 역순");
        }
        System.out.println("-----------------------------------------------------");

        //5
        for (int i = 0; i < 100; i++) {

        }

        System.out.println("-----------------------------------------------------");

        // 책 연습문제 1번
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println("-----------------------------------------------------");


        //책 연습 2번

        int evenSum = 0;
        int ooddSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }if (i % 2 == 1){
                ooddSum += i;
            }
        }
        System.out.println(evenSum);
        System.out.println(ooddSum);
        System.out.println("-----------------------------------------------------");

        //책 연습 3번

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (i + j == 6) {
                    System.out.println(i + "," + j);
                }
             }
            }




        System.out.println("-----------------------------------------------------");

        //책 연습 4번
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("-----------------------------------------------------");
        //반복문을 돌리려면 가로부터짜야한다
        for (int i = 1; i <= 5; i++) {

            //빈공간 출력 5- i (행번호)만큼 출력
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            //별 출력 2 * i -1 만큼 출력
            for (int k = 1; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            //밑으로 내림
            System.out.println("");

        }






        }
    }

