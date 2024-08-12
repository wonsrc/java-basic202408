package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {
    public static void main(String[] args) {
        System.out.println("정수를 입력해주세요");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = 0;

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                cnt++;
            }
        }
        if(cnt == 2) {
            System.out.printf("%d는 소수입니다.", num);
        } else {
            System.out.printf("%d는 소수가 아닙니다.", num);
        }
    }
}
