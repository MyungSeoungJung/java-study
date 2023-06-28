package ch09_Generic.GptPractice;

import account.Account;
import ch08_InterFace.GptPractice_student.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);

        int target = 1;   // 몇개가 있는지 찾을 특정 요소

        CollectionUtil<Integer> util = new CollectionUtil<>();
        int occurrenceCount = util.countOccurrences(numbers, target);

        System.out.println("Number of occurrences of " + target + ": " + occurrenceCount);

        System.out.println("-----------------------------------------------------------");

        List<String> strList1 = new ArrayList<>();
        strList1.add("apple");
        strList1.add("banana");
        strList1.add("apple");
        strList1.add("cherry");
        strList1.add("durian");
        strList1.add("melon");

    String target1 = "apple";   // 몇개가 있는지 찾을 특정 요소

    CollectionUtil<String> util1 = new CollectionUtil<>();
    int occurrenceCount1 = util1.countOccurrences(strList1, target1);  //반환값이 int니까 받는 변수 occurrenceCount타입도 int

    System.out.println("Number of occurrences of " + target + ": " + occurrenceCount);



    Cache<Student> c = new Cache<>();
    c.setData(new Student("명승정",12));
    Student a = c.getData();

    Cache<Account> cc = new Cache<>();
    cc.setData(new Account("000001",25000));
    Account acc = cc.getData();

}
}
