package PackjoonTest;

import java.io.*;
import java.util.StringTokenizer;

public class NandMIII15651 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N, M;
    static int[] candidate, result;

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        candidate = new int[N];
        result = new int[M];
        for(int i=0; i<N; i++){
            candidate[i] = i+1;
        }
    }

    static void dfs(int depth) throws IOException{
        if(depth == M){
            for(int i=0; i<M; i++){
                bw.write(result[i]+" ");
            }
            bw.newLine();
            return;
        }
        for(int i = 0; i<N; i++){
            result[depth] = candidate[i];
            dfs(depth+1);
        }
    }

    static void execute() throws IOException {
        dfs(0);
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}