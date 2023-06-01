package PackjoonTest;

import java.util.Scanner;

public class 별찍기IV2441 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.printf(" ");
            }
            for(int j=n-i; j>0; j--){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
