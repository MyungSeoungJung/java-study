package ch04_Array_EnhanceFor;

public class Array {
    public static void main(String[] args) {
        // 배열은(array)동일한 자료형의 여러 개 값을 저장하는 자료구조
        // 배열의 크기는 불변 바꿀수없음

        //타입 [] 배열이름 = new 타입[크기];

        //배열 초기화 방법
        int[] number = new int[5]; // 크기가 5인 배열 생성

        //배열 요소(element)에 값을 할당
        //배열이름[번호(인덱스)]
        number[0] = 10;
        number[1] = 3;
        System.out.println(number[1]);

        System.out.println("-------------------------------------------------------");

        //배열의 크기
        //배열이름.length
        int arrayLangth = number.length;
        System.out.println(arrayLangth);

        //배열을 반복문 접근
        //0에서 시작해서 배열의 길이보다 "작을 때"까지 ex 배열의 크기가 5인 배열 = 0,1,2,3,4
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        System.out.println("-------------------------------------------------------");

        //배열 요소에 초기값을 넣어서 초기화
        int[] number2 = { 5, 10, 15 };

        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }

        System.out.println("-------------------------------------------------------");


        //배열의 크기 나중에 정하기
        int[] number3;
        
        //배열의 크기가 초기화 되기전에 참조하면 에러
        //System.out.println(number3[0]);  //초기화 되기 전

        //배열 크기 초기화, 숫자는 0 기반으로 초기화 된다.
        number3 = new int[3]; // 나중에 정하기
        System.out.println(number3[0]);

        System.out.println("-------------------------------------------------------");



    }
}
