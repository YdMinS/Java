package PackjoonTest;

import java.util.Scanner;

public class 별찍기III2440 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        for(int i=0; i<num; i++){
            for(int j=num-i; j>0; j--){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
