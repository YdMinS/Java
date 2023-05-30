package PackjoonTest;

import java.util.Scanner;

public class 유레카이론10448 {
    private static int tn(int m) {
        return m*(m+1)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] yn = new boolean[n];
        for(int i=0; i<n; i++){
            int test = sc.nextInt();
            for(int k=1; k<=test; k++){
                for(int l=1; l<=test; l++){
                    for(int m=1; m<=test; m++){
                        int sum = tn(k) + tn(l) + tn(m);
                        if( test == sum) yn[i]=true;
                    }
                }
            }
        }
        for( boolean y : yn){
            System.out.println(y ? 1 : 0);
        }
    }
}
