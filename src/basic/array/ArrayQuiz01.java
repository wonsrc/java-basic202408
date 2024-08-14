package basic.array;

import javax.lang.model.SourceVersion;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {
        /*
            # 음식명을 입력받아서 배열에 순서대로 저장하는 코드
            1. 음식명을 입력받는다.ㅇ
            2. 음식명에 '그만'이 입력되었는가?
            2-1. 그만이 입력되었으면 종료한다.ㅇ
            2-2. 그만이 입력되지 않았으면 배열에 넣는다.
            3. 배열의 크기를 1 증가시킨다.
            4. 기존의 음식데이터를 증가된 새 배열에 복사한다.
            5. 새로운 음식명을 마지막 위치에 추가한다.
         */
        Scanner sc = new Scanner(System.in);
        int first = 1;
        String [] foodMenu = new String[]{"first"};
        while(true) {
            System.out.println("음식을 입력해주세요");
            String food = sc.next();
            if(food.equals("stop")) break;
            if(first == 1) {
                foodMenu[0] = food;
                first = -1;
                System.out.println(Arrays.toString(foodMenu));
            } else {
                String [] tmp = new String[foodMenu.length +1];

                for(int i = 0; i < foodMenu.length; i++) {
                    tmp[i] = foodMenu[i];
                }

                tmp[tmp.length-1] = food;

                foodMenu = tmp; tmp = null;

                System.out.println(Arrays.toString(foodMenu));
            }
        }

        System.out.println("===================================================================");

    }
}
