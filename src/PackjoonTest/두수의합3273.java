package PackjoonTest;

import java.util.Scanner;

public class 두수의합3273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2000001];
        int pairNum = 0;
        for(int i=0; i<n; i++){
            arr[sc.nextInt()]++;
        }
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            if(arr[i]==1 && arr[t-i]==1){
                pairNum++;
            }
        }
        System.out.println(pairNum/2);
    }
}
