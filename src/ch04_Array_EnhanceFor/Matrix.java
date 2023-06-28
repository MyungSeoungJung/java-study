package ch04_Array_EnhanceFor;

public class Matrix {
    public static void main(String[] args) {
        //다차원 배열
        //10, 5, 10 ,7

        /* 2차원 배열
            5 x 3 형태의 배열

            1 4 6 7 5
            7 5 3 5 9
            6 7 2 6 7
        */

        //2차원 배열 초기화
        // [행] [열]
        int [][] matrix = new int [3][4];

        //행단위 반복
        for (int i = 0; i < 3;i++) {
            // 0행, 1행, 2행

            // 열단위 반복
            for (int j = 0; j < 4; j++) {
                // 0행 - 1열 ~ 3행-4형
                matrix[i][j] = i + j;

            }

        }
    }
}
