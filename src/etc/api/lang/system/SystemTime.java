package etc.api.lang.system;

public class SystemTime {
    public static void main(String[] args) {


        //1970년 1월 1일 자정을 기준으로 현재까지의 소요된 시간을 밀리초로 리턴(long)
        long start = System.currentTimeMillis();
//        System.out.println("start = " + start);

        long total = 0;
        for (long i = 0; i < 20000000000L; i++) {
            total += i;
        }

        long end = System.currentTimeMillis();

        System.out.println("실행 소요시간: " + (end - start) * 0.001 + "초");
    }
}
