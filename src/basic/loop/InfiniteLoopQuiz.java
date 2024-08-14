package basic.loop;

import java.util.Scanner;

public class InfiniteLoopQuiz {
    public static void main(String[] args) {
        /*
             1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
              지속적으로 문제를 출제한 후 정답을 입력받으세요.
              사용자가 0을 입력하면 반복문을 탈출시키세요.

             2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
         */

        //Math.random() 난수 발생
        Scanner sc = new Scanner(System.in);

        System.out.println("*** 연산 퀴즈 ***");
        System.out.println("# 종룧시려면 0을 입력해 주세요: ");

        int cCount = 0;
        int iCount = 0;

        while(true) {
            int num1 = (int) (Math.random() * 100 + 1);
            int num2 = (int) (Math.random() * 100 + 1);

            int operator = (int) (Math.random()*2); // 0 : + , 1 : -

            int correct;
            if (operator == 0) {
                System.out.printf("%d + %d = ???", num1, num2);
                correct = num1 + num2;
            } else {
                System.out.printf("%d - %d = ???", num1, num2);
                correct = num1 - num2;
            }

            System.out.print("> ");
            int answer = sc.nextInt();

            if(answer == correct) {
                System.out.println("정답입니다.");
                cCount++;
            } else if(answer == 0) {
                System.out.println("종료합니다");
                break;
            } else {
                System.out.println("틀렸습니다~");
                iCount++;
            }

        }
        System.out.println("-------------------------------------------");
        System.out.printf("정답 : %d , 오답 : %d", cCount, iCount);

        sc.close();
    }
}
