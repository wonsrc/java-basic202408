package basic.array;

import java.util.Arrays;
import java.util.Scanner;

    /*
         1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

         2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

         - 추가
         배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
         더 이상 지울 친구가 없다면 프로그램 종료.
         */


/*
입력받은 문자열이랑 기존 문자열이랑 비교해서 target 을 받고 delete 진행
target은 -1로 초기화해서 값이 변화 없으면 없는 이라고 하고 continue
길이가 0 되면 종료
 */
public class ArrayQuiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kakao = {"MZ", "NO", "APC", "RYN", "CHS"};
        System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakao));


        while(kakao.length != 0) {
            System.out.print("친구의 이름을 지워주세요: ");
            String delete = sc.next();

            int target = -1;
            for(int i = 0; i < kakao.length; i++) {
                if(delete.equals(kakao[i])) {
                    target = i;
                    break;
                }
            }
            if(target == -1) {
                System.out.println(delete + "은(는)없는 이름 입니다.");
                continue;
            }

            for(int i = target; i < kakao.length -1; i++) {
                kakao[i] = kakao[i+1];
            }

            String[] temp = new String[kakao.length-1];

            for(int i = 0; i < temp.length; i++) {
                temp[i] = kakao[i];
            }

            kakao = temp; temp = null;

            System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakao));

        }
        sc.close();

    }
}
