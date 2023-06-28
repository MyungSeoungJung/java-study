package ch06_list_Map_set.list.list_Class_pratice;

//comparable 인터페이스를 구현한다 = 자바객체를 특정 필드로 정렬하는 방법
//implement 구현
//java sort by specific field
public class Student implements Comparable<Student> {
    String name;
    int age;
    int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public String getAge() {
        return name;
    }


    public int getGrade() {
        return grade;
    }


    //Collection.sort(리스트)
    // 객체별로 compareTo 실행하여 정렬해줌
    //객체는 string처럼 비교할 수 없으므로
    public int compareTo(Student o){
        return this.name.compareTo(o.name);
    }
    
}
