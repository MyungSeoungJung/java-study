package ch07_Inheritance.inheritance_Concept;

public class PersonManager {
    public void work(Person p){
        //그냥 형변환 하면 에러발생 가능성이 존재함 = 그래서 instanceOf를 해줘야 함        instanceOf = 연산자
        //부모객체변수 instanceof 자식 클래스 타입
        //다향성을 이용해서 현재 객체가 student일 수도 있고 Lecturer일 수도 있음
        if (p instanceof Student){   //----------뿌리가 Student면 실행
                ((Student) p).study();
            }else if (p instanceof Lecturer){  //-------------뿌리가 Lecturer면 실행
                ((Lecturer) p).teach();

        }

    }
}
