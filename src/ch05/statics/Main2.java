package ch05.statics;

public class Main2 {
    public static void main(String[] args) {
        int result1 = Counter.getCount();
        System.out.println(result1);

        int result2 = Counter.getCount();
        System.out.println(result2);
    }
}
