package ch07_Inheritance.GptPractice;

import java.util.ArrayList;
import java.util.List;


public class CourseManager {
    private List<Course> courses;

    public CourseManager() { //빈 리스트 생성
        this.courses = new ArrayList<>();
    }


    public void addCourse(Course course) {
        courses.add(course);
        /*
        addcoure에 데이터 넣을때 고민 = course클래스의 필드가 3가지밖에 없고 onlineCourse하고 LectuerCourse는 추가적인 데이터가 있는데 addcourse메서드의 매개변수 Course로만 받아도 될까하는 고민
        해결법 = main에서 객체 생성때 Course course = new OnlineCourse(명승정,12,43.www)이때 Online,LectuerCours를 -> Course로 업캐스팅해줘서 Course의 한 배열에 저장 가능
         */
    }


    //리스트 출력
    public void printCourses() {
        for (Course co : courses) {
            System.out.println("코스이름: " + co.courseName + " 코스코드: " + co.courseCode + " 강사이름: " + co.instructor);
        }
    }

    public Course getCourseByInstructor(String instructor) {
        for (Course co : courses) {
            if (co.instructor().equals(instructor)) {
                return co;
            } else {
                System.out.println("일치하는 사람이 없습니다");
            }
        }
        return null;

    }

    //어쨋든 배출이 list니까
    public List<Course> getOnlineCourses() {
        List<Course> ac = new ArrayList<>();  //빈상자 만들기 why instance of로 걸러진 onlineCourse들만 담아야 하기 때문에
        for (Course co : courses) {
            if (co instanceof OnlineCourse) {  //instanceof에서 onlineCourse로 걸러지는 이유는 Course course = new "OnlineCourse" OnlineCourse에서 온 객체니까
                ac.add(co); //리스트형
            }
        }
        return ac; //List형 배출이니까 선언때 List타입으로 선언
    }

public List<Course> getList(){
        return courses;
}



}
