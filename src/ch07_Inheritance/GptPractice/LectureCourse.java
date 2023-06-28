package ch07_Inheritance.GptPractice;

public class LectureCourse extends Course{
    String room;
    int time;

    public LectureCourse(String courseName, int courseCode, String instructor,String room,int time){
        super(courseName,courseCode,instructor);
        this.room = room;
        this.time = time;
    }

    public String getRoom(){
        return room;
    }

    public int time(){
        return time;
    }



}
