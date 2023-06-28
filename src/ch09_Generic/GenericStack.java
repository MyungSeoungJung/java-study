package ch09_Generic;

import ch08_InterFace.GptPractice_student.Student;

public class GenericStack<T> {
//    스택
//    스택이라는 자료구조를 만들 것
//    LinkedList를 이용하여 만들것
//    스택은 LIFO(Last In First Out)형태의 자료구조
//    접시를 쌓아놓고 설거지하는 것과 비슷하다
//    예) 메서드 호출이 스택에 쌓아놓고 실행된다
//    a => b => c  실행순서는 c => b => a
//    예) 웹 브라우저 뒤로가기: 가장 나중에 열린 페이지부터 뒤로 가기를 실행합니다.
//    NavigationStack 1 page -> 2 page -> 3 page 뒤로가기 3page -> 2page -> 1page
//
//
//    private LinkedList<T> stack = new LinkedList<>();
//    private void push(T item){
//        stack.addLast(item);
//    }
//
//    public  T pop(){
//        return stack.removeLast();
//    }
//


    //모든 클래스 타입 가능한 스택 자료구조 사용
    GenericStack<String> stack = new GenericStack<>();
    GenericStack<Student> stackStudent = new GenericStack<>();




}
