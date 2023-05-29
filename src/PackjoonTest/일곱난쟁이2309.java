package PackjoonTest;

import java.util.Scanner;
import java.util.Arrays;

public class 일곱난쟁이2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] candidates = new int[9];
        int[] realMember = new int[7];
        int sum = 0;
        int rest = 0;
        int[] drop = new int[2];
        int cnt = 0;
        for(int i=0; i<candidates.length; i++){
            candidates[i] = sc.nextInt();
            sum += candidates[i];
        }
        rest = sum-100;
        for(int i=0; i<candidates.length-1; i++){
            for(int j=0; j<candidates.length;j++){
                if(i==j){
                    continue;
                }
                if(candidates[i]+candidates[j]==rest){
                    drop[0] = i;
                    drop[1] = j;
                }
            }
        }
        for(int i=0; i<candidates.length; i++){
            if(drop[0]==i || drop[1]==i) {
                continue;
            } else {
                realMember[cnt] = candidates[i];
                cnt++;
            }
        }
        Arrays.sort(realMember);
        for(int i : realMember){
            System.out.println(i);
        }
    }
}
