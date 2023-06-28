package ch05.singleton;

public class Singleton {
    //private static 클래스 객체
    private static Singleton instance;

    private Singleton(){ //외부에서 객체 생성 안 됨.
        //private 생성자
    }

    //오버로딩
//    public Singleton(Singleton instance){
//        this.instance = instance;
//    }

    
    //getInstance 메서드로 처음에 생성한 객체만 접근하게 하는 방법
    //객체 생성은 첫번째 메서드 호출시에 한 번만
    public static Singleton getInstance(){
    if(instance == null){
        instance = new Singleton();
        System.out.println("객체가 생성되었습니다");
    }
    return instance;
    }
}
