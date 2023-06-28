package ch06_list_Map_set.list.Concept;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //자료형에 따라서 다르게 작동하기 위해서 추가적인 매개변수를 <자료형> 넣는다
        //자료형을 매개변수로 받는 것을 제네릭(generic)이라한다
        //매개변수의 자료형은 기본(원시)자료형은 안 됨 ex: int/long x 클래스 타입을 넣어줘야 함.  --->  List<Integer> list = new ArrayList<Integer>(); 가능

        //List<자료형>변수형 = new ArrayList<자료형,생략가능>(불러올 애들 (호출));
        List<String> list = new ArrayList<>();

        // ---> Linked리스트로 바꾸려면 new 뒤를 바꾸면 됨 EX: List<String> list = new LinkedList<String>();
                         //기본으로 ArrayList를 쓰고 아니면 Linkedlist로 갈아 끼우면 됨
        //객체 추가
        //리스트변수명.add(객체)   
        list.add("명승정");    //        list.add(0, new String("명승정"));
        list.add("김민형");
        for (String name : list){
            System.out.println(name);
        }
        System.out.println("-----------------------------------------------");

        //특정 위치의 값을 변경
        //리스트변수.set(인덱스, 객체);
        list.set(0, "이소석");
        list.set(1,"이원서");
        for (String name : list){
            System.out.println(name);
        }
        System.out.println("-----------------------------------------------");

        //리스트변수.size() = 요소의 개수 파악
        System.out.println(list.size());
        System.out.println("-----------------------------------------------");


        //객체 추가
        list.add("윤명호");
        for (String name : list){
            System.out.println(name);
        }

        System.out.println("-----------------------------------------------");

        //1번 요소 삭제
        list.remove(1);
        //하나의 요소를 삭제하면 뒤에 있는 것들을 전부 땡겨옴, 중간에 구멍이 안 생김
        for (String name : list){
            System.out.println(name);
        }
        System.out.println("-----------------------------------------------");


        //2번에 객체 삽입;

        list.add(2,new String("윤주민"));
        for (String name : list){
            System.out.println(name);
        }

        //원하는 인덱스에 있는 값 출력
        System.out.println(list.get(1));
        
        //변수.inndexOf(객체) = 요소의 위치를 찾을 수 있음


        //이렇게 중간에 요소를 삭제하거나,추가하게 되면 뒤쪽 요소를 당겨오거나 밀어야되는 overhead(추가적인연산) 발생
        //이런 케이스가 잦다면 , Arraylist 말고 Linkedlist 사용
        //               요소추가,     전체 탐색,      요소삭제/삽입
        //ArrayList        빠름         빠름           느림(많이)
        //LinkedList       느림         느림             빠름



    }
}
