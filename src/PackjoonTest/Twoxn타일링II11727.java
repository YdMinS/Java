package PackjoonTest;

import java.util.Scanner;
import java.util.Arrays;

public class Twoxn타일링II11727 {
    static long[] d = new long[1001];
    public static void count(int n){
        d[n] = d[n-1]%10007 + 2*d[n-2]%10007;
    }
    public static void main(String[] args) {
        Arrays.fill(d,-1);
        int n = new Scanner(System.in).nextInt();
        d[1] = 1;
        d[2] = 3;
        for(int i=3; i<=n; i++){
            count(i);
        }
        System.out.println(d[n]%10007);
    }
}
