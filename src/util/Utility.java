package util;

import java.awt.*;
import java.util.Scanner;

public class Utility {
    public static final String FILE_PATH;
    private static Scanner sc;

    static {
        FILE_PATH = "C:\\Users\\playdata2\\Desktop\\develop\\java\\song";
        sc = new Scanner(System.in);
    }

    public static void makeLIne() {
        System.out.println("==============================================");
    }

    // 문자열 입력을 처리
    public static String input(String message) {
        System.out.println(message);
        return sc.nextLine();
    }
}
