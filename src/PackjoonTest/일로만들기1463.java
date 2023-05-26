package PackjoonTest;

import java.util.Scanner;
import java.util.Arrays;

public class 일로만들기1463 {
    private static final int[] d = new int[1000001];
    private static int shortCut(int n){
        if(d[n] != -1) return d[n];
        d[n] = d[n-1] + 1;
        if(n%3==0) d[n] = Math.min(d[n], d[n/3]+1);
        if(n%2==0) d[n] = Math.min(d[n], d[n/2]+1);
        return d[n];
    }

    public static void main(String[] args) {
        Arrays.fill(d, -1);
        int N = new Scanner(System.in).nextInt();
        d[1] = 0;
        for(int i=2; i<=N; i++){
            shortCut(i);
        }
        System.out.println(shortCut(N));
    }
}
