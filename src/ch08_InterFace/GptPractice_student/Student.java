package ch08_InterFace.GptPractice_student;

public class Student implements Gradable,Studyable{
   private int grade;
    private String name;

    public Student(String name,int grade) {
        this.grade = grade;
        this.name = name;
    }

    @Override
    public void calculateGrade() {
        if (90 < grade){
            System.out.println(name + "학생은 A학점입니다");
        } else if (80 < grade) {
            System.out.println(name + "학생은 B학점입니다");
        } else if(70 < grade) {
            System.out.println(name + "은 C학점입니다");
        }else {
            System.out.println(name + "너는 낙제야");
        }
        }


    @Override
    public void Study() {
        System.out.println(name + "학생이 공부중입니다");
    }
}
