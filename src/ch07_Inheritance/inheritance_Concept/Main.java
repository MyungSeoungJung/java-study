package ch07_Inheritance.inheritance_Concept;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("명승정",27);

        Student s = new Student("학생",23,"ㄸㄹ");
        Person p3 = new Lecturer("교수",12,12);


        //업 캐스팅
        //Student 객체를 Person 타입으로 변환(부모 타입으로 변환)
        Person p2 = s; //자식 객체를 부모 객체에 대입
        //부모 객체의 메서드를 자식 객체에서 재정의된 매서드 호출 (오버라이드)
        //↓ 자식 객체의 메서드가 호출됨
        p2.introduce(); //person의 introduce가아니라 student의 introduce가 호출

        //자식 객체의 추가한 메서드/필드는 접근 불가
        // p2.study(); 호출 불가
        Student reStudent = (Student) p2;  //Student에서 온 person을 (Student)로 명시적 형변환 가능
        //명시적 형변환 = 큰값을 작은값에 넣는 것 = 부모 객체를 자식 객체에 대입 = 가능한이유 s객체가 처음부터 student였어서

        Person p4 = p3;  //lectuer(자식)에서 온 person 대입
        // Student startPersonChangeStudent = (Student) p; p는 원래부터가 Person타입이기 때문에 Student타입을 모른다.
        PersonManager personManager = new PersonManager();
        System.out.println("-----------자식(Student) 클래스의 매서드 실행------why 자식클래스에서부터 온 person클래스 이니까------------");
        personManager.work(p2);
        System.out.println("---------------자식(lecturer)클래스의 매서드 실행-------why 자식클래스에서부터 온 person클래스 이니까-------------");
        personManager.work(p4);

        //그냥 형변환 하면 에러발생 가능성이 존재함 = 그래서 instanceOf를 해줘야 함        instanceOf = 연산자
        //부모객체변수 instanceof 자식 클래스 타입


    }
}
