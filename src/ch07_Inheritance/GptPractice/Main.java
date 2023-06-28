package ch07_Inheritance.GptPractice;

public class Main {
    public static void main(String[] args) {

        //형변환
        Course co = new Course("코스1",1234,"고대근");
        Course co1 = new Course("코스2",134,"근");
        Course co2 = new Course("코스3",14,"고대");
        Course ol = new OnlineCourse("온라인1" , 123,"김민형","www");
        Course ol1 = new OnlineCourse("온라인2" , 12,"김형","www245254");
        Course ol2 = new OnlineCourse("온라인3" , 13,"민형","www452452");
        Course LC = new LectureCourse("실습",12,"이소석","12호",6);
        Course LC1 = new LectureCourse("실습1",12,"이소석","12호",6);
        //업케스팅 다운케스팅  ~~~에서온이 중요하다, 다양화,형변환
        
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(co1);
        courseManager.addCourse(co2);
        courseManager.addCourse(LC);
        courseManager.addCourse(LC1);
        courseManager.addCourse(ol2);
        courseManager.addCourse(co1);

        System.out.println("-------------------------------------모든 리스트-----------------------");

        courseManager.printCourses();

        System.out.println("-------------------------------------온라인 리스트-----------------------");
    }
}
