package PackjoonTest;

import java.util.Scanner;

public class 주사위세개2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b && b==c){
            System.out.println(10000+a*1000);
        } else if(a==b && b!=c || a!=b && b==c || a==c && b!=c){
            if(a==b || a==c)
                System.out.println(1000+a*100);
            if(b==c)
                System.out.println(1000+b*100);
        } else if(a!=b && b!=c && c!=a){
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max*100);
        }
    }
}
