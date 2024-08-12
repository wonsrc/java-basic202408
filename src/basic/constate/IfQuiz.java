package basic.constate;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class IfQuiz {
    public static void main(String[] args) {
        /*
            - 정수 3개를 입력 받습니다. (변수 하나씩 선언해서 따로따로 받으세요.)
            - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
            # max, mid, min이라는 변수를 미리 선언하셔서
             판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
             마지막에 한번에 출력하시면 되겠습니다.
        */
        System.out.println("정수 3개를 입력해 주세요 : ");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        int min = sc1.nextInt();
        int mid = sc1.nextInt();
        int max = sc1.nextInt();
        int tmp = 0;


        if(min > mid) {
            tmp = min;
            min = mid;
            mid = tmp;
        }

        if(min > max) {
            tmp = min;
            min = max;
            max = tmp;
        }

        if(mid > max) {
            tmp = mid;
            mid = max;
            max = tmp;
        }

        System.out.printf("min : %d, mid : %d, max : %d",min, mid, max);

        sc1.close();
        sc2.close();
        sc3.close();


    }
}
