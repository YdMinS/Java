package PackjoonTest;

import java.util.Scanner;
import java.util.Arrays;

public class 일이삼더하기9095 {
    static int[] d = new int[11];
    static void count(int n){
        if(d[n]==-1)
            d[n] = d[n-1]+d[n-2]+d[n-3];
    }
    public static void main(String[] args) {
        Arrays.fill(d,-1);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];
        for(int i=0; i<numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }
        d[1] =1;
        d[2] =2;
        d[3] =4;
        for(int i=0; i<numArr.length; i++){
            for(int j=4; j<=numArr[i];j++){
                count(j);
            }
            System.out.println(d[numArr[i]]);
        }
    }
}
