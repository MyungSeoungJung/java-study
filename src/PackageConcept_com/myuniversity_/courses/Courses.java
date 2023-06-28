package PackageConcept_com.myuniversity_.courses;
//패키지 우클릭 > 다음에서 열기 Explorer 클릭하면 폴더 경로 나옴



//다른 패키지에 있는 클래스를 가져다 쓰는 방법
//import 패키지명...클래스명;
//import 패키지명...*;    = 해당패키지에 모든 클래스를
      //ex : import com.myuniversity.student.Student.*;
import PackageConcept_com.myuniversity_.student.GraduateStudent;
import PackageConcept_com.myuniversity_.student.Student;
import PackageConcept_com.myuniversity_.student.UnderGraduateStudent;

public class Courses {
    private String Coursename;

    //private int maxStudent = 20;

    private final int MAX_STUDENT = 20;
    private int numOfStudent = 0; //현재 과목에 몇명에 학생이 있는지
    private Student[] students;   //한 과목의 인원수 저장 배열
    private int studentsNum;


    private GraduateStudent[] graduateStudents[];
    private UnderGraduateStudent[] underGraduateStudents;

    public Courses(String Coursename,int maxStudent) {   //자바프로그래밍 총 인원수 20    //생성자
        // this.maxStudent = maxStudent;
        this.Coursename = Coursename;
        this.students = new Student[maxStudent];    //한 과목의 인원수 저장
        this.numOfStudent = 0;
    }
    //final 변수
    //상수 : 초기화만 가능하고 변경 불가능한 값




    //해당 코스에 학생에 참가(추가)

    public void joinStudent(Student student){
        this.students[numOfStudent] = student;
        this.numOfStudent++;
        System.out.println(student.getName() + "학생이 추가되었습니다");
        }


    public Student[] getStudents() {
        return students;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }




}
