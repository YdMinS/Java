package PackjoonTest;

import java.util.Scanner;
import java.util.Arrays;

public class Twoxn타일링11726 {
    private static long[] s = new long[1002];
    private static void count(int n){
        if(s[n]==-1)
            s[n] = s[n-1]%10007 + s[n-2]%10007;
    }
    public static void main(String[] args) {
        Arrays.fill(s, -1);
        s[1] = 1;
        s[2] = 2;
        int n = new Scanner(System.in).nextInt();
        if(n>2){
            for(int i=3; i<=n+1; i++){
                count(i);
            }
        }
        System.out.println(s[n]%10007);
    }
}
