package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int line = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int last = 0;
        for(int i=0; i<line; i++){
            String command = br.readLine();
            if(command.contains(" ")){
                st = new StringTokenizer(command);
                command = st.nextToken();
                last = Integer.parseInt(st.nextToken());
            }
            switch (command){
                case "pop":
                    System.out.println(q.isEmpty() ? -1 : q.poll());
                    break;
                case "push":
                    q.add(last);
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    System.out.println(q.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    System.out.println(q.isEmpty() ? -1 : q.peek());
                    break;
                case "back":
                    System.out.println(q.isEmpty() ? -1 : last);
            }
        }
    }
}
