package ch01_Type;

public class DataTypes {
    public static void main(String[] args){

        // 변수명 = 값, 값을 변수 공간에 저장한다, 대입한다, 할당한다
        // 1. 정수형 자료형
        // 대부분의 쓰는 자료형
        int age = 25;                   // int    -21억 ~ 21억
        long myLong = 1234123123L;     // long
        System.out.println(myLong);
        // 잘 인씀
        short no = 10;          // short     -3만 2천 ~ 3만 2천
        byte myByte = 10;       // byte      -128 ~ 127
        // 바이트(bytes)
        // 1 bit (0 or 1)
        // 0 : 1비트, 1 : 1비트 (2진수 개념에서, 전기가 통한다 안통한다)
        // 1 bit x 8개 ; 01001011: 1 바이트(byte)
        // int : 4byte 저장할 수 있음.
        // long : 8byte 저장할 수 있음.


        // 2. 실수형 자료형(소숫점이 있는 숫자, 10.0:실수, 10:정수)
        // 실수: Floating-point
        float myFloat = 3.14f;      // 4바이트
        System.out.println(myFloat);
        // 보통 이것만 쓴다. (double)
        double pi = 3.14159;        // 8바이트 소수형은 뒤에 아무것도 없어도 표시해주는 게 좋음


        /* 3. 문자형 자료형(Character)
         글자 1개 저장 가능, A, a, 1, *, # 등
         자바에서 잘 안 씀
         실제로는 글자로 저장하는 것이 아니라 숫자로 변환해서 저장함
         아스키(ASCII) 코드 개념, 유니코드(Unicode)
         2바이트 공간크기 */
        char myChar = 'A';

        // 4. 논리형 자료형(Boolean Type)
        // 참 또는 거짓(true/false) 값을 저장가능한 자료형
        // is변수명이라고 주로 씀
        boolean isTrue = true;
        boolean isKorean = false; // 한국사람이 아닙니다. 이것을 저장하고 싶을 때 명칭.
    }
}
