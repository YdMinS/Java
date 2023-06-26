package PackjoonTest;

import java.util.Scanner;

public class 문자열9086 {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static String str;

    static void execute(){
        N = Integer.parseInt(sc.nextLine());
        for(int i=0; i<N; i++){
            str = sc.nextLine();
            System.out.print(str.charAt(0));
            System.out.print(str.charAt(str.length()-1)+"\n");
        }
    }

    public static void main(String[] args) {
        execute();
    }
}
