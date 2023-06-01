package PackjoonTest;

import java.util.Scanner;

public class 숫자의개수2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String str = a*b*c+"";
        int[] num = new int[10];
        for(int i=0; i<str.length(); i++){
            num[str.charAt(i)-'0']++;
        }
        for(int i=0; i< num.length; i++){
            System.out.println(num[i]);
        }
    }
}
