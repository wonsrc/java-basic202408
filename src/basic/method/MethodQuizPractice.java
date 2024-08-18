package basic.method;


import java.lang.annotation.Target;
import java.util.Arrays;

public class MethodQuizPractice {

    static String[] foods ={"chicken", "pasta", "beef"};

    // 원하는 인덱스 위치에 요소를 삽입하는 메서드를 작성하세요.
    // targetIndex는 기존 foods의 배열 인덱스 범위 내여야 합니다.
    static void insert(int targetIndex, String newFoodName) {
        String[] tmp = copy(1);

        for(int i =targetIndex; i < foods.length; i++) {
            tmp[i+1] = foods[i];
        }

        tmp[targetIndex] = newFoodName;

        foods = tmp;

//        System.out.println(Arrays.toString(tmp));
    }

    // 원하는 인덱스 위치의 요소를 수정하는 메서드를 작성하세요.
    // targetIndex는 기존 foods의 배열 인덱스 범위 내여야 합니다.
     static void modify(int targetIndex, String newFoodName){
        String[] tmp = copy(0);

        tmp[targetIndex] = newFoodName;

        foods = tmp;

     }

    // 특정 인덱스가 범위 내의 올바른 인덱스인지를 확인하는 메서드를 작성하세요.
    // 작성이 완료되면 타 메서드에서 활용할 수 있을 것입니다.
     static boolean isOutOfBounds(int targetIndex) {
        for(int i = 0; i < foods.length; i++) {
            if(targetIndex == i) {
                return true;
            }
        }
        return false;
     }

    // 특정 인덱스의 요소를 삭제하는 메서드를 작성하세요.
     static void remove(String deleteTarget) {
        int tmpIndex = -1;
        String[] tmp = copy(-1);
        for(int i = 0; i < foods.length; i++) {
            if(deleteTarget.equals(foods[i])) {
                tmpIndex = i;
                break;
            }
        }

        for(int i = tmpIndex; i < tmp.length; i++) {
            tmp[i] = foods[i+1];
        }

        foods = tmp;

     }


    // 배열 내부 한눈에 보기
    /*static void search(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("foods[%d] : %s\n", i, arr[i]);
        }
    }*/
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // 특정 요소가 배열에 포함되어 있는지의 여부 확인
    /*static boolean include(String target) {

        for(int i = 0; i < foods.length; i++) {
            if(foods[i].equals(target)) {
                return true;
            }
        }
        return false;
    }*/

    // foods 배열에서 특정 데이터의 인덱스를 반환
 /*   static int returnIndex(String target) {
        for(int i = 0; i < foods.length; i++) {
            if(target.equals(foods[i])) {
                return i;
            }
        }
        return -1;
    }*/

    static int indexOf(String searchFood) {
        for (int i = 0; i < foods.length; i++) {
            if (searchFood.equals(foods[i])) {
                return i;
            }
        }
        return -1;
    }

    // foods 배열에 데이터를 끝에 추가하는 함수
    static void push(String newFood) {

        String[] tmp = copy(1);

        tmp[tmp.length-1] = newFood;

        foods = tmp;
    }

    static void pop() {
        String[] tmp = copy(-1);
        foods = tmp;
    }

    // 기존 배열 대비 크기가 다른 새 배열을 만들어주는 메서드 (tmp 만드는 것 메서드와)
    // size에 따라 크기가 큰 or 작은 배열을 만들어 줍니다.
    static String[] makeNewArray(int size) {
        return new String[foods.length + size];
    }

    static String[] copy(int size) {
        String[] tmp = makeNewArray(size);
        int length = (size >= 0) ? foods.length : tmp.length;
        for(int i = 0; i < length; i++) {
            tmp[i] = foods[i];
        }
        return tmp;
    }


    static boolean isInclude(String searchTarget) {
        for(int i = 0; i < foods.length; i++) {
            if(searchTarget.equals(foods[i])){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
//        search(foods);
        printFoods();
//        boolean result = include("pasta");
//        System.out.println("result = " + result);
//        boolean result2 = include("pork");
//        System.out.println("result2 = " + result2);
        if (isInclude("pasta")) {
            System.out.println("존재함");
        }

/*        int index = returnIndex("pasta");
        System.out.println("index = " + index);

        int index2 = returnIndex("pork");
        System.out.println("index2 = " + index2);*/

        push("hamburger");
        printFoods();
        push("icecream");
        printFoods();

        System.out.println("------------------------");

        printFoods();
        pop();
        printFoods();

        System.out.println("------------------------");

        insert(1,"ramen");
        printFoods();

        System.out.println("------------------------");

        modify(2,"icecream");
        printFoods();

        System.out.println("------------------------");

        if(isOutOfBounds(2)) {
            System.out.println("존재함");
        }

        System.out.println("------------------------");

        remove("ramen");
        printFoods();
        remove("chicken");
        printFoods();
    }



}
