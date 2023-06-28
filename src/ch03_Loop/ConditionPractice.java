package ch03_Loop;

public class ConditionPractice {
    public static void main(String[] args) {

        int x = 11;

        if (x > 10) {
            System.out.println("큰 수");
        }else {
            System.out.println("작은 수");
        }
        
        
        int score = 90;
        
        if (score >= 80){
            System.out.println("통과" );
        } else {
            System.out.println("불통과");
        }

        System.out.println("-------------------------------------------------------");

        int month = 2;
        switch (month){
            case 1:
                System.out.println("1월");
                break;
            case 2:
                System.out.println("2월");
                break;
            case 3:
                System.out.println("3월");
                break;
            case 4:
                System.out.println("4월");
                break;
        }

        System.out.println("-------------------------------------------------------");

        int score1 = 65;
        if (score1 >= 90) {
            System.out.println("A");
        } else if (score1 >= 80) {
            System.out.println("B");
        }else if (score1 >= 70){
            System.out.println("C");
        } else if (score1 >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        System.out.println("-------------------------------------------------------");


    }
    
}
