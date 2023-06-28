package ch07_Inheritance.GptPractice;

public class Course {
    String courseName;
    int courseCode;
    String instructor;

    public Course(String courseName, int courseCode, String instructor){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    public String getCouserName(){
        return courseName;
    }

    public int courseCode(){
        return courseCode;
    }
    public String instructor(){
        return instructor;
    }
}
