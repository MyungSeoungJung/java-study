package ch07_Inheritance.inheritance_Concept;

//extends 부모클래스
 //부모클래스의 필드 및 메서드를 상속 받는다.
 //inheritance(상속): 프로그래밍언어에서 상속은 자식이 부모를 선택해서 물려 받음
//SE(SW공학)에서는 -> generaliztin(일반화)부름 ->자바에선 inheritance(상속)
//여러개의 클래스를 구현하는데 일반적인(공통적인) 속성과 기능이 있더라 -> 그거를 부모를 클래스로 만들고,나머지 클래스들은 상속받고 필요한 것만 추가하자
public class Student extends Person{
    //student는 person(부모)의 메서드,필드를 그냥 사용할 수 있다
   private String studentId; //학번 추가
   
   //빈 생성자는 자동으로 상속받은
    //하지만 매개변수가 있는 생성자는 상속할 때 별도로 선언해줘야함

    public Student(String name,int age,String studentId){  //
        //super(...); = 부모의 생성자를 호출
        //부모 객체도 실제로 생성이 됨
        //super 하는 순간 자식은 필드와 메서드를 그냥 사용 할 수 있음
        super(name,age);//부모 매서드의 매개변수로 호출
        this.studentId = studentId; //나머지 매개변수 (studentId) 초기화
    }

    //학생 공부
    //부모의 메서드 외에 다른 메서드를 추가했다
    public void study(){
        System.out.println(name + "이(가) 공부를 시작합니다");
    }
    
    //override: 재정의한다
    @Override
    public void introduce(){
     //기존 person의 introduce는 그대로 쓰고 뭔가 추가를 하겠다.
     //super(부모), this(본인) 호출
        super.introduce();
        System.out.println("제 학번은" + studentId+ "입니다");
    }
    
}



