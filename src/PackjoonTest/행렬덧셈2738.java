package PackjoonTest;

import java.io.*;
import java.util.StringTokenizer;

public class 행렬덧셈2738 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N, M;
    static int[][] A, B;

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        B = new int[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void execute() throws IOException{
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                bw.write(A[i][j]+B[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
