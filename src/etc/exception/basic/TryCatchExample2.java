package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];


        try {
            System.out.print("정수: ");
            int num = sc.nextInt();

            int result = 100 / num;

            System.out.println(arr[result]);

            String s = null;
//            s.equals("메롱");
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("입력값이 잘못되었어요!");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위가 벗어났어요!");
        } catch (NullPointerException e) {
            System.out.println("주소가 null 입니다.");
        } catch ( Exception e) {
            System.out.println("알 수 없는 예외 발생!");
        } finally {
            System.out.println("예외 발생과 상관없이 항상 발생");
        }
    }
}
