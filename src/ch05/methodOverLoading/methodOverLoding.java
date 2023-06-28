package ch05.methodOverLoading;

public class methodOverLoding {

    //메소드 오버로딩 = 메소드 이름은 동일 ,매개변수의 개수 또는 타입이 다른 경우 즉 메서드 시그니처가 다른 경우

    //*매개변수 이름 상관없음*  반환 타입(x),접근제한자(x)

    //메서드 시그니처(method signatures) = 메서드 이름 + 매개변수(개수,타입)*매개변수 이름 상관없음*
    //어떤 메서드의 유일함을 나타내는 껍데기(프로토타입,선언부)
    public  int multply(int x, int y){
        System.out.println("int int");
        return x * y;
    }

    public int multiply(double x, double y, int z){
        System.out.println("double double");
        return (int) (x * y) * z;

    }
}
