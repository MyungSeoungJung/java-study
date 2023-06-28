package ch11_thread;

public class Main {
    public static void main(String[] args) {
        MyService ser = new MyService("수강 관리 서비스");
        MyService ser1 = new MyService("학생 정보 관리 서비스");


        ser.start();  //스레드 시작
        ser1.start();
    }
}
