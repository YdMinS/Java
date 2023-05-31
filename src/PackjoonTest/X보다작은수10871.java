package PackjoonTest;

import java.util.Scanner;

public class X보다작은수10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for(int i=0; i<n; i++){
            int t= sc.nextInt();
            if(t < x){
                System.out.printf(t+" ");
            }
        }
    }
}
