package basic.loop;

public class WhileExample2 {
    public static void main(String[] args) {

        //48 ~ 150사이의 정수 중 8의 배수만 가로로 출력해 보세요.
        //(48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되겠죠?)
        int i = 48;

        while(i <= 150) {
            if(i % 8 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println(); // 단순 줄 개행

        //1 ~ 100까지의 정수 중 4의 배수이면서
        //8의 배수는 아닌 수를 가로로 출력해 보세요.

        int j = 1;
        while (j <= 100) {
            if( j % 4 == 0 && j % 8 != 0){
                System.out.print(j + " ");
            }
            j++;
        }


        System.out.println();

        //1 ~ 30000까지의 정수 중 258의 배수의 개수를 출력.
        int k = 1;
        int count = 0;

        while (k <= 30000) {
            if (k % 258 == 0) {
                count++;
            }
            k++;
        }

        System.out.println("count = " + count);

        //1000의 약수의 개수를 구하세요.
        //1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
        //그랬을 때 나누어 떨어지는 애가 약수입니다.
        int l = 1;
        int cnt = 0;
        while(l <= 1000) {
            if(1000 % l == 0) {
                cnt++;
            }


            l++;
        }
        System.out.println("cnt = " + cnt);

    }
}
