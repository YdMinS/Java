package PackjoonTest;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 회전하는큐1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        LinkedList<Integer> q = new LinkedList();
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            q.add(i);
        }
        int cnt =0;
        for(int i=0; i<m; i++){
            int target = Integer.parseInt(st.nextToken());
            if(target!=q.peek()){
                int indexOfTarget = q.indexOf(target);
                if(indexOfTarget<q.size()-indexOfTarget){
                    while(target!=q.peek()){
                        q.addLast(q.pollFirst());
                        cnt++;
                    }
                } else {
                    while(target!=q.peek()){
                        q.addFirst(q.pollLast());
                        cnt++;
                    }
                }
            }
                q.pollFirst();
        }
        System.out.println(cnt);
    }
}
