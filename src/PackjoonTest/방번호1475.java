package PackjoonTest;

import java.util.Scanner;

public class 방번호1475 {
    public static void main(String[] args) {
        String numStr = new Scanner(System.in).nextLine();
        int[] num = new int[10];
        for(int i=0; i<numStr.length(); i++){
            num[numStr.charAt(i)-'0']++;
        }
        int maxNum = 0;
        int sum69 = 0;
        for(int i=0; i<num.length; i++){
            if(i==6 || i==9){
                sum69 += num[i];
            } else {
                maxNum = Math.max(maxNum, num[i]);
            }
        }
        System.out.println(maxNum>(sum69/2+sum69%2) ? maxNum : sum69/2+sum69%2);
    }
}
