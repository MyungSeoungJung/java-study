package ch07_Inheritance.GptPractice;

public class OnlineCourse extends Course{

    String platForm;

    public OnlineCourse(String courseName, int courseCode, String instructor,String platForm){
        super(courseName,courseCode,instructor);
//      this.courseName = courseName;
//      this.courseCode = courseCode;
//      this.instructor = instructor;
        this.platForm = platForm;

    }

    /* 이렇게 선언되어있는거랑 마찬가지
    public String getCouserName(){
        return courseName;
    }

    public int courseCode(){
        return courseCode;
    }
    public String instructor(){
        return instructor;
    }}
     */
    public String getPlatform(){
        return platForm;
    }


}
