package PackjoonTest;

import java.util.Scanner;

public class 시험성적9498 {
    public static void main(String[] args) {
        int s = new Scanner(System.in).nextInt();
        if(s>=90 && s<=100){
            System.out.println("A");
        } else if (s>=80 && s<=89) {
            System.out.println("B");
        } else if (s>=70 && s<=79) {
            System.out.println("C");
        } else if (s>=60 && s<=69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
