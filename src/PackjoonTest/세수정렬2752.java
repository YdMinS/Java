package PackjoonTest;

import java.util.Scanner;

public class 세수정렬2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        int big = Math.max(a, Math.max(b,c));
        int small = Math.min(a, Math.min(b,c));
        int middle = sum-big-small;
        System.out.printf("%d %d %d", small, middle, big);
    }
}
