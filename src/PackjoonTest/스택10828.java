package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for(int i =0; i<n; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }
            if(command.equals("pop")) {
                if(stack.isEmpty()){
                    System.out.println(-1);
                    continue;
                } else {
                    System.out.println(stack.pop());
                    continue;
                }
            }
            if(command.equals("size")){
                System.out.println(stack.size());
                continue;
            }
            if(command.equals("empty")){
                System.out.println(stack.size() == 0 ? 1 : 0);
                continue;
            }
            if(command.equals("top")){
                System.out.println(stack.size() == 0 ? -1 : stack.peek());
            }
        }
    }
}

