package basic.loop;

import basic.begin.PrintExample;

import java.util.Scanner;

public class LoopNestingQuiz {
    public static void main(String[] args) {
        System.out.println("정수를 하나 입력해주세요: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int resultCount = 0;

        System.out.print("소수 : ");
        for(int i = 1; i <= num; i++) {
            // 소수 판별을 위해 나누어 떨어진 횟수를 세어 줄 변수
            // 반복문 내부에 선언을 해서, i++이 될떄마다 0으로 초기화 되어야 함.
            int cnt = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt == 2) {
                System.out.print(i + " ");
                resultCount++;
            }
        }
        System.out.println();
        System.out.println("소수의 개수 : " + resultCount);

        sc.close();

    }
}
