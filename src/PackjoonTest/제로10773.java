package PackjoonTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로10773 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0){
                stack.push(num);
            } else {
                stack.pop();
            }
        }

        for(int i : stack){
            sum+=i;
        }
        System.out.println(sum);
    }
}
