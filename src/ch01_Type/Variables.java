package ch01_Type;

public class Variables {
    public static void main(String[] args) {
        // 자바에서 변수(variables)
        // ""변수: 이름이 있는 메모리 공간""
        // 컴퓨터는 작업을 수행하려면 메모리에 뭔가가 올라가 있어야함
        // 프로그래밍: 프로그래밍 언어를 가지고 컴퓨터한테 일 시키는 것
        // 고객(사용자) -> 개발자 -> 프로그래밍언어 -> 컴퓨터한테 일

        // 변수 선언(declare)
        // 이름이 있는 메모리 공간 만들기;
        // [메모리공간유형] [변수이름]
        // int(integer, 정수 -2020, 0, 333, 소숫점 없는 숫자, 0 포함)
        // age라는 이름에 공간에는 정수 값을 저정할 수 있다.
        // int 형식 변수에 저장 가능한 숫자 범위 대략 -21억 ~ 21억
        int age;

        // 값 할당(assignment)
        // 변수에 값을 저장
        age = 25;
        System.out.println(age);  // 로깅(logging), 작업 결과를 출력해서 확인
        System.out.println(age);

        // 변수이름
        // 숫자로 시작하면 안됨.
        // 일반적으로(관례, convention) 소문자로 시작. 두번째 단어부터는 대문자로 시작
        // 변수명을 축약하지 않음.
        // 이런 형태의 변수이름 표기법을 cammel-case(카멜케이스) 표기법이라 함.
        int studentAge;
        studentAge = 11;
        System.out.println(studentAge);
    }
}
