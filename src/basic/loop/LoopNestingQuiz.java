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
