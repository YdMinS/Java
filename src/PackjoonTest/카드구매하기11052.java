package PackjoonTest;

import java.util.Scanner;

public class 카드구매하기11052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 카드 개수
        int n = sc.nextInt();
        // 값의 개수
        int[] p = new int[n+1];
        // 카드 개수별 최대비용
        int[] d = new int[n+1];
        for(int i=1; i<=n; i++){
            p[i] = sc.nextInt();
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                d[i] = Math.max(d[i-j]+p[j], d[i]);
            }
        }
        System.out.println(d[n]);
    }
}
