package ch06_list_Map_set.list.list_Class_pratice;

import java.util.ArrayList;
import java.util.Collections;
//문제
//https://github.com/kdkcom1234/java-docs/blob/main/06.%20%EC%BB%AC%EB%A0%89%EC%85%98%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC/06.%EC%BB%AC%EB%A0%89%EC%85%98-%EC%97%B0%EC%8A%B5%EB%AC%B8%EC%A0%9C-01.List-01.String.md

public class gpt_list_practice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("-------------------------------------------");

        System.out.println(list.size());
        System.out.println("-------------------------------------------");
        System.out.println("1번인덱스 출력 " + list.get(1));
        System.out.println("-------------------------------------------");
        list.remove(1);  //바나나 삭제
        System.out.println("-------------------------------------------");
        list.add("strawberry"); //딸기 추가
        list.set(1, "orange");  // 원하는 인덱스에 오렌지 추가
        System.out.println("------------모든 요소 출력----------------");

        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("-------------------------------------------");

        for (String date : list) {
            if (list != null) {
                System.out.println("데이터가 있습니다");
            } else if (list == null){
                System.out.println("데이터가 비어 있습니다");
            }
        }
        System.out.println("-------------------------------------------");
        //가장 긴 문자열
        String a = "";
        for (String name : list){
            if (a.length() < name.length()){
                a = name;
            }
        }
        System.out.println(a);

        System.out.println("----------알파벳순 정렬--------------------");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("----------가장 짧은 문자열---------------------");
        //가장 짧은 문자열
        String shortestString = list.get(0);
        for (String name : list) {


            if (name.length() < shortestString.length()) {
                shortestString = name;
            }
        }
        System.out.println(shortestString);

        System.out.println("----------대문자 변환---------------------------");

        //모든 요소 대문자
        for (String data : list){
            data = data.toUpperCase();
            System.out.println(data);
            }
        System.out.println("----------소문자 변환---------------------------");


        //모든 요소 대문자
        for (String data1 : list){
            data1 = data1.toLowerCase();
            System.out.println(data1);
        }

      //  요소 거꾸로 배치: Collections.reverse(fruits);



        System.out.println("----------체리 찾기----------------------");
 //    "체리" 확인: boolean containsCherry = fruits.contains("체리");
        for (String name : list){
           if ("cherry" == name){
               System.out.println("체리 있습니다");
           }else {
               System.out.println("해당 과일이 없습니다");
               break;
           }
       }

        System.out.println("-------------------마지막 지우기--------------------");

        list.remove(list.size()- 1);
        //배열 0 1 2 3 4 5 but 배열 사이즈는 6이니까 -1 해서 마지막 값 지우기
      

        System.out.println("------------모든 요소 출력----------------");

        for (String name : list) {
            System.out.println(name);
        }




    }
        }
        
        




