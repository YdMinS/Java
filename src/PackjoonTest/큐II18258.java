package PackjoonTest;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 큐II18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> q = new LinkedList<>();
        int input =0;
        for(int i=0; i<n; i++){
            String command = br.readLine();
            if(command.contains("pu")){
                st = new StringTokenizer(command);
                command = st.nextToken();
                input = Integer.parseInt(st.nextToken());
            }
            switch(command){
                case "pop":
                    if(q.isEmpty()){
                        bw.write("-1\n");
                    } else {
                        bw.write(q.poll()+"\n");
                    }
                    break;
                case "push":
                    q.add(input);
                    break;
                case "size":
                    bw.write(q.size()+"\n");
                    break;
                case "empty":
                    if(q.isEmpty()){
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "front":
                    if(q.isEmpty()){
                        bw.write("-1\n");
                    } else {
                        bw.write(q.peekFirst()+"\n");
                    }
                    break;
                case "back":
                    if(q.isEmpty()){
                        bw.write("-1\n");
                    } else {
                        bw.write(q.peekLast()+"\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
