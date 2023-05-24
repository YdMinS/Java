package PackjoonTest;

import java.util.Scanner;

public class 팩토리얼10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력받은 N 값
        int N = sc.nextInt();
        // 출력할 값
        int answer = 1;
        // 팩토리얼 계산
        while(N>0){
            answer *= N;
            N--;
        }
        System.out.println(answer);
    }
}
