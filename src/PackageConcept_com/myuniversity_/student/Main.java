package PackageConcept_com.myuniversity_.student;

import PackageConcept_com.myuniversity_.courses.CourseService;
import PackageConcept_com.myuniversity_.courses.Courses;

public class Main {
    public static void main(String[] args) {
        Courses c = new Courses("자바 프로그래밍",20);
     //   c.joinStudent(new Student("명승정"));
     //   c.joinStudent(new Student("김민형"));

        System.out.println("---------------참가한 학생-------------------");

        /*
        Student[] students = c.getStudents();
        for (int i = 0; i < c.getNumOfStudent(); i++) {
            System.out.println(students[i].getName());

}
         */
            CourseService cs = new CourseService();
            cs.run();


        }

    }

