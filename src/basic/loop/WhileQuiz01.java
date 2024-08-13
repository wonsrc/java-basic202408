package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {
    public static void main(String[] args) {
        System.out.println("정수 2개를 입력해주세요");

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int x = sc1.nextInt();
        int y = sc2.nextInt();
        int tmp = 0;
        /*
        int start = x > y ? y : x;
        int end = x > y ? x : y;

        int total = 0;
        while(start <= end) {
            total += start;
            start++;
        }*/

        if(x > y) {
            tmp = x;
            x = y;
            y = tmp;
        }
        int n = x;

        int result = 0;
        while(n <= y) {
            result += n;
            n++;
        }
//        for(int i = x; i <= y; i++) {
//            result += i;
//        }

        System.out.println("result = " + result);

        sc1.close();
        sc2.close();
    }


}
