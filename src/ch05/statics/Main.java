package ch05.statics;

public class Main {
    public static void main(String[] args) {
        Counter co = new Counter();
          // == 1
        System.out.println(co.getCount());
        // == 2

        Counter co2 = new Counter();
        // == 1 (x)       ==3
        System.out.println(co2.getCount());
        // == 2(x)          ==4

    }
}
