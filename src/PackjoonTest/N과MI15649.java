package PackjoonTest;

import java.io.*;
import java.util.StringTokenizer;

public class N과MI15649 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int M;
    static int[] result;
    static boolean[] checked;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        checked = new boolean[N+1];
        result = new int[M+1];
    }

    static void findAll(int idx) {
        if(idx == M){
            for(int i=1; i<=M; i++){
                System.out.print(result[i]+" ");
            }
            System.out.println("");
            return;
        }

        for(int i=1; i<=N; i++){
            if(!checked[i]){
                checked[i] = true;
                result[idx+1] = i;
                findAll(idx+1);
                checked[i] = false;
            }
        }
    }

    static void execute(){
        findAll(0);
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
