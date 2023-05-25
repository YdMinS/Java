package PackjoonTest;

import java.util.Scanner;

public class 최소공배수1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line  = sc.nextInt();
        for(int i=0; i<line; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(LCM(a,b));
        }
    }
    public static int GCD(int a, int b){
        while (b != 0) {
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static int LCM(int a, int b){
        return a*b/GCD(a, b);
    }
}
