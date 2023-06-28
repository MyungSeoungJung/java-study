package ch05.singleton;

public class Main {
    public static void main(String[] args) {
        // Singleton s1 = new Singleton(); // 생성자 Private이라 객체 생성 안됨

        // get.Instance()메서드로 생성
            //statice으로만 쓸때와 다른 점은 = 우리가 필요한 시점에 생성 할 수 있음

        Singleton s2 = Singleton.getInstance(); //이때 객체 생성
        Singleton s3 = Singleton.getInstance(); //이전 생성된 것을 반환
        Singleton s4 = Singleton.getInstance(); //이전 생성된 것을 반환
        
        System.out.println(s2);  //ch05.singleton.Singleton@682a0b20
        System.out.println(s3); //ch05.singleton.Singleton@682a0b20
        System.out.println(s4); //ch05.singleton.Singleton@682a0b20
    }
}
