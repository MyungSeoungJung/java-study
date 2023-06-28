package ch02_Operator;

public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        //AND (논리곱) 연산자 &&

        boolean reuslt = a && b;
        // && 둘 다 true면 true "하나라도 false 면 false"
        //왼쪽 값에 의해서 연산 결과를 도출할 수 있으면 오른쪽 값은 판단하지않음 (short-circuit evaluation(단락 평가))


        // OR (논리합) 연산자 ||  "둘 중 하나라도 true면 true", 둘 다 false여야지 false
        boolean result2 = a || b;


    }
}
