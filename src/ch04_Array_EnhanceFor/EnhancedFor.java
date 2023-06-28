package ch04_Array_EnhanceFor;

public class EnhancedFor {
    public static void main(String[] args) {
        //향상된 for문
        //배열같이 여러개의 값을 저장할 수 있는 자료구조를 순차적 탐색
        // 처음부터 끝까지 반복문을 돈다.
        
        
        int [] numbers = {1,2,3,4};
            //향상된 for문을 이용하여 배열 순회
        for(int num : numbers){ //numbers를 num에 대입
            System.out.println(num);

        }


    }
}
