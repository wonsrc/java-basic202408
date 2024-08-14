package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01Solution {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("먹고 싶은 음식을 입력하세요");
        System.out.println("입력을 중지하려면 <그만>이라고 입력하세요");

        String[] foodList = {};

        while (true) {
            System.out.print(">");
            String newFood = sc2.next();

            if (newFood.equals("그만")) break;

            // 기존 배열보다 큰 새 배열 생성
            String [] tmp  = new String[foodList.length + 1];

            // 기조 foodList에 있는 음식들 새 배열로 복사
            for (int i = 0; i < foodList.length; i++) {
                tmp[i] = foodList[i];
            }
            // 새 음식을 끝 인덱스에 추가하자
            tmp[tmp.length-1] = newFood;

            //  주소값이전
            foodList = tmp; tmp = null;
        }// end while

        System.out.println("먹고싶은 음식 리스트" + Arrays.toString(foodList));

        sc2.close();
    }
}
