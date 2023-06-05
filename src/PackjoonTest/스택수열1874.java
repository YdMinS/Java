package PackjoonTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열1874 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        boolean isNo = false;
        Stack<Integer> stackNto1 = new Stack<>();
        Stack<Integer> stackAnswer = new Stack<>();
        int start = 1;
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(stackNto1.isEmpty()) {
                stackNto1.push(start++);
                sb.append("+");
            }
            while(num > stackNto1.peek()){
                stackNto1.push(start++);
                sb.append("+");
            }
            if(num == stackNto1.peek()){
                stackAnswer.push(stackNto1.pop());
                sb.append("-");
                continue;
            }
            System.out.println("NO");
            isNo = true;
            break;
        }
        if(!isNo) {
            String str = sb.toString();
            for(int i=0; i<str.length(); i++){
                System.out.println(str.charAt(i));
            }
        }
    }
}
