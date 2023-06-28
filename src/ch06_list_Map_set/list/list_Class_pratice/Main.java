package ch06_list_Map_set.list.list_Class_pratice;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(0, new Student("john", 12, 11));
        list.add(1, new Student("alex", 13, 4));
        list.add(2, new Student("Tom", 9, 4));
        list.add(3, new Student("Julia", 11, 10));
        list.add(4, new Student("Day", 14, 12));


        System.out.println("---------------존 출력-----------------");


//        for (Student name : list) {
//            if (list.contains("john")) {
//                System.out.println(name.getName());
//            } else {
//                System.out.println("없습니다");
//            }
//        }

        Collections.sort(list);

        for (Student name : list) {
            if ("john".equals(name.getName())) {
                System.out.println(name.getName());
            }
        }

            System.out.println("------------10학년 이상-------------");

            for (Student grade : list) {
                if (10 <= grade.getGrade()) {
                    System.out.println(grade.getName());
                }
            }

        /*
        Collections.sort(list, Comparable.comparingInt(Student::getAge));
        System.out.println(list);
         */

        }


    }

