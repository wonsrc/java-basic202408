package basic.array;

import java.util.Arrays;

public class Array2d {
    public static void main(String[] args) {
        int[][] score = {   // int[][] score = new int[4][3];
                {79, 80, 99}, //A학생
                {95, 85, 89}, //B학생
                {90, 65, 56}, //C학생
                {69, 78, 77}  //D학생
                //과목: 3과목
        };
        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};

        System.out.println("C 학생의 수학점수 : " + score[2][2]);
        System.out.println(Arrays.deepToString(score));

        /*
         1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
         2. 각 과목의 평균을 출력해 보세요.
         3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
         */



    }
}
