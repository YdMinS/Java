package PackjoonTest;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 덱10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Deque<Integer> dq = new ArrayDeque<>();
        int line = Integer.parseInt(br.readLine());
        int input = 0;
        for(int i=0; i<line; i++){
            String command = br.readLine();
            if(command.contains("pu")){
                st = new StringTokenizer(command);
                command = st.nextToken();
                input = Integer.parseInt(st.nextToken());
            }
            switch(command){
                case "push_front":
                    dq.offerFirst(input);
                    break;
                case "push_back":
                    dq.offerLast(input);
                    break;
                case "pop_front":
                    if(dq.isEmpty()){
                        bw.write("-1\n");
                    } else {
                        bw.write(dq.pollFirst()+"\n");
                    }
                    break;
                case "pop_back":
                    if(dq.isEmpty()){
                        bw.write("-1\n");
                    } else {
                        bw.write(dq.pollLast()+"\n");
                    }
                    break;
                case "size":
                    bw.write(dq.size()+"\n");
                    break;
                case "empty":
                    if(dq.isEmpty()){
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "front":
                    if(dq.isEmpty()){
                        bw.write("-1\n");
                    } else {
                        bw.write(dq.getFirst()+"\n");
                    }
                    break;
                case "back":
                    if(dq.isEmpty()){
                        bw.write("-1\n");
                    } else {
                        bw.write(dq.getLast()+"\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
