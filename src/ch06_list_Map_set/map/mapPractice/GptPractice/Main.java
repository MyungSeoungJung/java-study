package ch06_list_Map_set.map.mapPractice.GptPractice;

import java.util.*;

public class Main {
    Map<String,Student> students = new TreeMap<>();

    public static void main(String[] args) {
        Map<String,Student> students = new TreeMap<>();

        students.put("1111", new Student("명승정",24));
        students.put("2222", new Student("이소석",28));  //지우짐
        students.put("3333", new Student("이원서",32));
        students.put("4444", new Student("김이형",12));
        students.put("4444", new Student("이민형",15));

        System.out.println("-------------------키 검색해서 특정한 학생값 출력하기---------------------");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (Student stu : students.values()) {
            if (students.containsKey(input)) {
                System.out.println(stu.getName());
                break;           //키는 어차피 고유한 값이니까 break를 써도 되나?
            } else {
               System.out.println("잘못된 키 번호입니다 다시 입력해주세요");
                break;
            }
        }
        System.out.println("-------------------지우기---------------------");

        students.remove("2222");
        System.out.println("삭제 완료");

        System.out.println("--------getter 안쓰고 출력------------------------------");

        for (Student s : students.values()){
            System.out.println(s);
        }
        System.out.println("------------getter 모두 출력---------------------------");

        for (Student s : students.values()) {
            System.out.println("이름: " + s.getName() + " / 나이: " + s.getAge());
        }

        System.out.println("-------------나이 합-----------------------");
        int sum = 0;
        for (Student a : students.values()){
            sum += a.getAge();
        }
        int totalage = sum / students.size();
            System.out.println(totalage);

        System.out.println("--------------------가장 나이가 많은 학생 ----------------");

       Student oldStudent = null;   //서로 같은 필드의 age를 비교해야함으로 Student객체의 임시변수와 null값을 선언
        for (Student s : students.values()){   //처음에 값을 넣어줘야지 뒤에 배열하고 비교를 할 수 있으므로 처음에 null값이 충족되어서 실행하고 값을 넣어줄수 있게 해줌
            if (oldStudent == null || s.getAge() > oldStudent.getAge()){    //s.age > oldStudent.age || oldStudent == null 이렇게 if구문이 순서가 바뀌면 null오류 발생 why? || 앞 연산자가 ture일 경우 뒤 연산자를 실행하지않아서.
                oldStudent = s;
            }
        }
        System.out.println(oldStudent.getName());

        System.out.println("--------------------알파벳 정렬 ----------------");


        // hashmap은 collection을 못 씀 why? hashmap에 데이터를 넣을때 마구잡이로 넣어서 list로 한번 바꾼다음 정렬해줘야됨 = list는 배열처럼 순서대로 넣으니까
        //맵 K,V -> value list
        List<Student> list = new ArrayList<>(students.values());
        //정렬
        Collections.sort(list, Comparator.comparing(Student::getName));
        //출력
        for (Student s : list){
        System.out.println(s.getName());
        }

        System.out.println("--------------------특정 문자열 포함하고 출력까지----------------");
        for (Student s : students.values()){
            if (s.getName().contains("이")){       //contains으로 이름 포함된 "이"를 찾으려면 getName으로 이름을 부른다음 .contains으로 찾기
                System.out.println(s.getName());
            }
            }
  
    }
}
