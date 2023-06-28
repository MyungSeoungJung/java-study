package ch09_Generic.GptPractice;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtil <T> {  //문자면 <String>,정수면 <Integer>

    //타입을 일반화해서 하나의 메서드로 여러 타입을 받을 수 있음

    public static <T> int countOccurrences(List<T> list, T target) {
        int count = 0;
        for (T element : list) {
            if (element.equals(target)) {
                count++;
            }
        }
        return count;
    }
}
