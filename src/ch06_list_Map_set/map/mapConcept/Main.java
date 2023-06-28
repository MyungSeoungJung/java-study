package ch06_list_Map_set.map.mapConcept;

import ch06_list_Map_set.list.list_Class_pratice.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        // 해시맵: 추가할때 정렬 x = Map<String, Student> students = new HashMap<>();
        //그래서 트리맵으로
        //트리맵: 추가할 때 이진트리로 정렬, 성능이 떨어지지만 키값으로 정렬
        Map<String, Student> students = new TreeMap<>();

        //객체 추가 .put                                           ---------------------------------------------------------------------
        //키(key): 특정 값을 가져오기 위한 "유일값"   Ex:학번
        //값(value): 학생 정보                    Ex: 이름,나이,grade
        //students.put(엔트리(key, value));
        students.put("e-01-00001",new Student("명승정",21,2));
        students.put("e-01-00002",new Student("이원서",24,3));
        students.put("e-01-00004",new Student("이소석",23,3));
        students.put("e-01-00003",new Student("이석",23,3));

        //객체 검색/조회                                         ---------------------------------------------------------------------
        //.keySet() => Key 목록을 반환함 (키는 중복이 안됨)
        //Set: 집합,원소의 중복이 없는 자료구조
        //일반적으로 Map, 연관배열,dictionary,key-value pair
        //자료구조는 정렬해서 저장하지 않음
        /*정렬 안되는 코드
               for (String Key : students.keySet()){
           System.out.println("학번: " + Key + " 학생이름: "+students.get(Key).getName());
        }
         */

        //해시맵을 정렬된 트리맵으로 변환                 --순서 정렬되는 코드
        Map<String, Student> sortedStudent = new HashMap<>(students);
        for (String Key : new TreeMap<>(students).keySet()){
          System.out.println("학번: " + Key + " 학생이름: "+students.get(Key).getName());
       }

        System.out.println("--------------------------------------------");

        // .valuse() -> 값 목록을 반환함   (즉 리스트같은 느낌)                  ---------------------------------------------------------------------
        for (Student s : students.values()){
            System.out.println(s.getName());
        }
        
        //키 값 존재 여부 확인                                   ---------------------------------------------------------------------
        boolean result = students.containsKey("e-01-00001");


        //객체 값(value) 수정
        // 맵변수명.get(키값): 키값으로 조회 후 뭔가를 처리할 수 있음
        Student s = students.get("e-01-00003");
                //setter등으로 값 수정
        
        
        //객체 삭제
        //맵변수명.remove(키값): 특정 키값의 엔트리(key-value)를 삭제
        students.remove("e-01-00003");
        students.clear(); //모두 다 삭제

    }
}
