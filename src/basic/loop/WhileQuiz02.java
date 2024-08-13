package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {
    public static void main(String[] args) {
        System.out.println("정수를 입력해주세요");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = 0;

        int i = 1;  // begin
        while(i <= num) {   // end
            if (num % i == 0) {
                cnt++;
            }
            i++;    //step
        }

        /*for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                cnt++;
            }
        }*/
        if(cnt == 2) {
            System.out.printf("%d 은(는) 소수입니다.", num);
        } else {
            System.out.printf("%d 은(는) 소수가 아닙니다.", num);
        }

        System.out.println();
        System.out.println("=========================================================");

        int j = 2;
        while(num % j != 0) {
            j++;
        }

        System.out.printf("%d 은(는) %s\n"
                , num,num == j? "소수입니다" : "소수가 아닙니다.");
        sc.close();
    }
}
