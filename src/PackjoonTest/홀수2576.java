package PackjoonTest;

import java.util.Scanner;

public class 홀수2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0; i<7; i++){
            int num = sc.nextInt();
            min = num%2==1? Math.min(min, num) : min;
            sum += num%2==1 ? num : 0;
        }
        if(sum==0){
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
