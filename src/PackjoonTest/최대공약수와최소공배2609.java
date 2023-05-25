package PackjoonTest;

import java.util.Scanner;

public class 최대공약수와최소공배2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(GCD(A,B));
        System.out.println(LCM(A,B));
    }
    public static int GCD(int A, int B){
        while(B!=0){
            int r = A%B;
            A=B;
            B=r;
        }
        return A;
    }
    public static int LCM(int A, int B){
        return A*B/GCD(A,B);
    }
}
