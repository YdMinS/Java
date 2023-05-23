package PackjoonTest;

import java.util.Arrays;
import java.util.Scanner;

public class 수리공항승1449 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int cntTape = 0;
        int[] intArr = new int[N];
        for(int i=0; i<N; i++){
            intArr[i] = sc.nextInt();
        }
        Arrays.sort(intArr);
//            int idx =0;
//            while(sc.hasNextInt()){
//                intArr[idx] = sc.nextInt();
//                idx++;
//            }
        for(int i =0; i<intArr.length; i++){
            if(i+1 == intArr.length){
                cntTape++;
                break;
            }
            if(intArr[i+1]-intArr[i]+1 > L){
                cntTape++;
            } else {
                cntTape++;
                i++;
            }
        }
        System.out.println(cntTape);
    }
}
