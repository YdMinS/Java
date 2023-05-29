package PackjoonTest;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class 카드구하기II16194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n+1];
        int[] p = new int[n+1];
        for(int i=1; i<=n; i++){
            p[i] = sc.nextInt();
        }
        Arrays.fill(d,10000);
        d[0] = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                d[i] = Math.min(d[i-j]+p[j], d[i]);
            }
        }
        System.out.println(d[n]);
    }
}
