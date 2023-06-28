package ch05.statics;

public class Counter {

    private static int count = 0;
    // static 필드 = 클래스의 모든 객체에 값이 공유된다.
    public Counter() {
        count ++; // 정적 변수 값 증가

    }
    //static 메서드
    public static int getCount() {
        return count ++; //정적 변수 반환

    }

}
