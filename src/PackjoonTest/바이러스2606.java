package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 바이러스2606 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N;
    static int testNumber;
    static boolean[][] map;
    static boolean[] checked;

    private static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        testNumber = Integer.parseInt(br.readLine());
        map = new boolean[N+1][N+1];
        for(int i=0; i<testNumber; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            mapping(start, end);
        }
    }

    private static void mapping(int start, int end){
        map[start][end] = true;
        map[end][start] = true;
    }
    private static void dfs(int x){
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        checked[x] = true;
        int cnt = 0;

        while(!q.isEmpty()){
            x = q.poll();
            for(int y=1; y<=N; y++ ){
                if(!map[x][y]) continue;
                if(checked[y]) continue;
                q.add(y);
                checked[y] = true;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    static void excute(int x){
        checked = new boolean[N+1];
        dfs(x);
    }
    public static void main(String[] args) throws IOException {
        input();
        excute(1);
    }
}
