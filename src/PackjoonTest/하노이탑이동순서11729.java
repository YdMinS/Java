package PackjoonTest;

import java.util.Scanner;

public class 하노이탑이동순서11729 {
    static Scanner sc;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int cnt =0;

    private static void input() {
        sc = new Scanner(System.in);
        N = sc.nextInt();
    }

    static void hanoi(int n, int from, int to, int other){
        if(n>1){
            hanoi(n-1, from, other, to);
            hanoi(1,from, to, other);
            hanoi(n-1, other, to, from);
        } else {
            cnt++;
            sb.append(from+" "+to+"\n");
        }
    }

    static void execute(){
        hanoi(N, 1, 3, 2);
        System.out.println(cnt);
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        input();
        execute();
    }
}
