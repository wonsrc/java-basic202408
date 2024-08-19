package oop.exception;

import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수1: ");
        int i = sc.nextInt();
        System.out.println("정수2: ");
        int j = sc.nextInt();

        System.out.printf("%d / %d = %d\n", i, j, i / j);

        System.out.println("프로그램 정상 종료!");

    }
}
