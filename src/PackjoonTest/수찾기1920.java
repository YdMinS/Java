package PackjoonTest;

import java.io.*;
import java.util.StringTokenizer;

public class 수찾기1920 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int M;
    static int[] A;

    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        M = Integer.parseInt(br.readLine());
    }

    static void execute() throws IOException{
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int n=0;
            int temp = Integer.parseInt(st.nextToken());
            while(n<N){
                if(temp==A[n]){
                    bw.append("1\n");
                    break;
                }
                n++;
                if(n==N){
                    bw.append("0\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
