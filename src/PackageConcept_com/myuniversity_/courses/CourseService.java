package PackageConcept_com.myuniversity_.courses;

import PackageConcept_com.myuniversity_.student.Student;

import java.util.Scanner;

//학과 과목과 관련된 기능을 제공해주는 클래스
public class CourseService {

    Scanner sc = new Scanner(System.in);
    Courses[] CourseStore = new Courses[100];  //과목 정보 저장 배열
    int CouurseMount = 0;  //과목 총 갯수
    private void CourseService(String Coursename,int maxStudent) {
        Courses co = new Courses(Coursename,maxStudent);   //자바프로그래밍 총인원수 20
        CourseStore[CouurseMount] = co;              //과목의 정보 (과목이름,총 인원) 배열에 저장

    }



    public void addCourse(String Coursename,int Coursenum){
        Courses co = new Courses(Coursename,Coursenum);  //생성자 호출
        CourseStore[CouurseMount] = co;       //배열의 순서대로 넣어야하기때문에 증가하는 애가 필요해서 numAccount++
        CouurseMount++;
    }

        // 서비스를 실행할 수 있는 run 메서드
        //run 메서드를 Main 메서드에서 실행하면 됨.
        //과목 저장 배열
        //courses(과목) 생성기능
        //키보드 입력 객체


        //과목에 참여 학생 추가 기능

        public void addStudent(String student){  //이 메서드를 통해서 Course클래스에 가서 리턴하기?
        Student stu = new Student(student);

        }

        //과목에 참여한 학생 출력 기능

    
    public void run(){
        while (true){
            System.out.println("\n=== 수강 관리 프로그램 ===");
            System.out.println("1. 과목 추가");
            System.out.println("2. 학생 추가");
            System.out.println("3. 참여한 학생 출력");
            System.out.print("원하는 기능을 선택하세요: ");

            int choice = sc.nextInt();
            sc.nextLine();   // 순서대로 사용자 입력 될 수 있게 기다림
        
            switch (choice){
                case 1:
                    System.out.print("추가할 과목의 이름을 입력하세요 :");
                    String Coursename = sc.nextLine();
                    System.out.print("과목의 총 인원수를 입력하세요 :");
                    int Coursenum = sc.nextInt();
                    sc.nextLine(); // 개행 문자 제거
                    addCourse(Coursename,Coursenum);
                    break;
                case 2:
                    System.out.print("추가할 학생의 이름을 입력하세요 :");
                    String name = sc.nextLine();




            }
        }
    }


}
