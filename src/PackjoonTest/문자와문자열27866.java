package PackjoonTest;

import java.util.Scanner;

public class 문자와문자열27866 {
    static Scanner sc = new Scanner(System.in);
    static String str;
    static int n;

    static void input(){
        str = sc.nextLine();
        n = Integer.parseInt(sc.nextLine());
    }

    static void execute(){
        System.out.println(str.charAt(n-1));
    }

    public static void main(String[] args) {
        input();
        execute();
    }
}
