import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandMII15650 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int M;
    static int[] candidate;
    static boolean[] checked;
    static int[] result;

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        candidate = new int[N];
        checked = new boolean[N];
        result = new int[M];
        for(int i=0; i<N; i++){
            candidate[i] = i+1;
        }
    }

    static void dfs(int depth, int start){
        if(depth == M){
            for(int i=0; i<M; i++){
                System.out.print(result[i]+" ");
            }
            System.out.println("");
            return;
        }
        for(int i=start; i<N; i++){
            if(!checked[i]){
                checked[i] = true;
                result[depth] = candidate[i];
                dfs(depth+1, i+1);
                checked[i] = false;
            }
        }
    }

    static void execute(){
        dfs( 0, 0);
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}