package ch06_list_Map_set.set;

import ch06_list_Map_set.list.list_Class_pratice.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //set은 중복의 데이터가 없다.
        //맵의 ket        setd의 set
        Student s1 = new Student("명승정",12,53);
        Student s2 = new Student("이주정",52,23);
        Student s3 = s1;

        //hash code 같은 참조면 같은 값
        System.out.println("s1" + s1.hashCode());
        System.out.println("s2" + s2.hashCode());
        System.out.println("s3" + s3.hashCode());

        //equals, 기본적으로 같은 참조면 true이나 바꿀 수 이다
        System.out.println(s1.equals(s3));  //equal 컨트롤+ 클릭하면 자세하게 볼 수 있음

        //객체 추가
        Set<String> sets = new HashSet<>();


        sets.add("apple");
        sets.add("banana");
        sets.add("banana");
        sets.add("cherry");
        sets.add("Elderberry");
        sets.add("Elderberry");


        //객체 탐색 조회
        for (String s : sets){
            System.out.println(s);
        }

        sets.size();

        
        //contains
        //해당 값이 있냐 없냐
        System.out.println(sets.contains("cherry"));

        //특정 값 있으면 지워
        sets.remove("cherry");

        System.out.println("--------------------------------------------------------------------------------------");

        List<String> list = new ArrayList<>();
        List<String> list1 = new LinkedList<>();
       Map<String, Student> students = new TreeMap<>();



        list.add("apple");
        list.add("banana");
        list.add("banana");
        list.add("cherry");
        list.add("Elderberry");
        list.add("Elderberry");
        for (String s : list){
            System.out.println(s);
        }


        System.out.println("------------------------------리스트 set으로 변환----------------------------------------");
        //컬랙션(리스트) -> set으로 초기화 생성
        //set은 중복값이 없음
        //중복제거,TreeSet으로하면 중복제거에 정렬까지           s에 할당 <- TreeSet으로 (↓ 불러 올 배열)
        for (String s : new TreeSet<>(list)){  // for (String s : new TreeSet<>(list)){
            System.out.println(s);
        }




    }
}
