package etc.api.util.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListDelete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
        List<String> kakao = new ArrayList<>();
        Collections.addAll(kakao,"mz","neo","aph","ryan","jz","chs");
        System.out.println("현재 저장된 친구들: " + kakao);
        String name = sc.next();
        // if(kakao.indexOf(name != -1)
        /*
        if(kakao.contains(name)) {
            kakao.remove(name);
            System.out.println("삭제 후 정보: " + kakao);

        }else {
            System.out.println("없어서 못지워요~");
        }

        sc.close();*/

/*
        - forEach(향상 for문)을 사용하여 반복문을 순회할 때
        리스트의 크기를 마음대로 줄이거나 늘릴 수 없습니다.
                - 향상 for문은 반복문을 시작할 때 구조적으로 컬렉션의
        크기 및 사용 가능한 요소들의 개수를 항상 파악하고 있기 때문에
        값의 변경이 일어나면 예외를 발생시키도록 설계되어 있습니다.`

*/
        for (String s : kakao) {
            if (s.equals("name")) {
                kakao.remove(s);
                break;
            }
        }

        System.out.println(kakao);
    }
}
