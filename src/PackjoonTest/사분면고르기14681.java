package PackjoonTest;

import java.util.Scanner;

public class 사분면고르기14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int q = 0;
        if(x*y>0){
            q = x>0 ? 1 : 3;
        } else {
            q = x>0 ? 4 : 2;
        }
        System.out.println(q);
    }
}
