package PackjoonTest;

import java.util.Scanner;

public class 알파벳개수10808 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int[] num = new int[26];
        for(int i=0; i<str.length(); i++){
            num[str.charAt(i)-'a']++;
        }
        for(int i=0; i< num.length-1; i++){
            System.out.print(num[i]+" ");
        }
        System.out.print(num[num.length-1]);
    }
}
