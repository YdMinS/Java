package PackjoonTest;

import java.util.Arrays;
import java.util.Scanner;

public class 대표값II2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mid = 0;
        int sum = 0;
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i]= sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println(sum/5);
        System.out.println(arr[2]);
    }
}
