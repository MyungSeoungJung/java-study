package ch03_Loop;

public class NestLoop_05 {
    public static void main(String[] args) {
        //중첩 반복문
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i * j);
            }
            System.out.println("--" + i +"단");
        }
    }
}
