package PackjoonTest;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 사파리월드2420 {
    static Scanner sc = new Scanner(System.in);
    static StringTokenizer st;
    static long N, M;

    static void input(){
        String str = sc.nextLine();
        st = new StringTokenizer(str);
        N = Long.parseLong(st.nextToken());
        M = Long.parseLong(st.nextToken());
    }

    static void execute(){
        long result = N - M;
        System.out.println(result>=0 ? result : result*(-1));
    }

    public static void main(String[] args) {
        input();
        execute();
    }
}
