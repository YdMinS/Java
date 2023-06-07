package PackjoonTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFSandBFS1260 {
    static Scanner scan = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int N, M, V;
    static int[][] adj;
    static boolean[] visited;

    static void input(){
        N = scan.nextInt();
        M = scan.nextInt();
        V = scan.nextInt();
        adj = new int[N+1][N+1];
        for(int i=1; i<=M; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            adj[x][y] = 1;
            adj[y][x] = 1;
        }
    }
    static void dfs(int x){
        visited[x] = true;
        sb.append(x).append(' ');
        for(int y=1; y<=N; y++){
            if(adj[x][y] == 0) continue;
            if(visited[y] == true) continue;
            dfs(y);
        }
    }

    static void bfs(int x){
        Queue<Integer> que = new LinkedList<>();
        que.add(x);
        visited[x] = true;
        while(!que.isEmpty()){
            x = que.poll();
            sb.append(x).append(' ');
            for(int y=1; y<=N; y++){
                if(adj[x][y] == 0) continue;
                if(visited[y]) continue;
                que.add(y);
                visited[y] = true;
            }
        }
    }

    static void process(){
        visited = new boolean[N+1];
        dfs(V);
        sb.append("\n");
        for(int i=1; i<=N; i++) visited[i] = false;
        bfs(V);
        System.out.println(sb);
    }
    public static void main(String[] args) {
        input();
        process();
    }
}
