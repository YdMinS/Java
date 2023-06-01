package PackjoonTest;

import java.util.Scanner;

public class 별찍기IX2446 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.printf(" ");
            }
            for(int j=0; j<2*(n-i)-1; j++){
                System.out.printf("*");
            }
            System.out.println("");
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-2; j++){
                System.out.printf(" ");
            }
            for(int j=0; j<2*(i+1)+1; j++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
