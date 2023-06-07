package PackjoonTest;

import java.util.*;

public class DFSandBFS1260ver2 {
    static Scanner scan = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int N, M, V;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;

    static void input(){
        N = scan.nextInt();
        M = scan.nextInt();
        V = scan.nextInt();
        adj = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            adj[i] = new ArrayList<Integer>();
        }
        for(int i=1; i<=M; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }
        for(int i=1; i<=N; i++){
            Collections.sort(adj[i]);
        }
    }
    static void dfs(int x){
        visited[x] = true;
        sb.append(x).append(' ');
        for(int y : adj[x]){
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
            for(int y : adj[x]){
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
