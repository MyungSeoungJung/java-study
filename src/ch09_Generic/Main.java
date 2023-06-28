package ch09_Generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        //List: 인터페이스, ArrayList: 구현클래스
        //<String>: 매개변수 타입(클래스)으로 넣었습니다
        //매개변수를 타입으로 넣을 수 있게 하는 것이 제네릭
        List<String> list = new ArrayList<>();
        //타입을 지정해줘서 안정성을 높히려고

        /*
        1.제네릭을 사용하면 타입을 컴파일타임(코트 짜는중)에 체크 할 수 있다. list.add(1) <-스트링으로 제네릭 설정했는데 정수 1이 들어가면 코드 짜는 중 바로 빨간줄로 에러 확인 가능
        2.코드를 타입 매개변수가지고 쉽게 재사용 가능하다.
         */
        //제네릭을 쓸 수 있는상황: 연산이나 로직이 똑같고
        //메서드명을 같은 걸 쓰고, 매개변수개수도 같은 걸 쓰는데
        //타입만 다를때 제네릭 사용

        GenericQueue<Integer> queue = new GenericQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
