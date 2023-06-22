package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 구간합구하기IV11659 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int caseNum;
    static Queue<int[]> q = new LinkedList<>();
    static int[] accumulatedSum;

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        caseNum = Integer.parseInt(st.nextToken());
        accumulatedSum = new int[N];
        st = new StringTokenizer(br.readLine());
        accumulatedSum[0] = Integer.parseInt(st.nextToken());
        for(int i=1; i<N; i++){
            accumulatedSum[i] = accumulatedSum[i-1] + Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<caseNum; i++){
            st = new StringTokenizer(br.readLine());
            q.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }
    }

    static void execute(){
        int[] currentPair;
        int start;
        int end;
        while(!q.isEmpty()){
            currentPair = q.poll();
            start =  currentPair[0];
            end = currentPair[1];
            if(start ==1){
                System.out.println(accumulatedSum[end-1]);
            } else {
                System.out.println(accumulatedSum[end-1]-accumulatedSum[start-2]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
