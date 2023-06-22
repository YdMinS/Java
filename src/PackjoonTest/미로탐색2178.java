package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색2178 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int M;
    static int[][] map;
    static boolean[][] checked;
    static int[][] distance;
    static int[] dirX = {1, 0, 0, -1};
    static int[] dirY = {0, -1, 1, 0};
    static int cnt = 0;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        checked = new boolean[N][M];
        distance = new int[N][M];
        distance[0][0] =1;
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }
    }

    static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});

        while(!q.isEmpty()){
            int[] xy = q.poll();
            int currentX = xy[0];
            int currentY = xy[1];
            if(currentX == N-1 && currentY==M-1) break;
            for(int i=0; i<4; i++){
                int newX = currentX + dirX[i];
                int newY = currentY + dirY[i];
                if(newX < 0 || newY < 0 || newX >=N || newY >=M) continue;
                if(checked[newX][newY] || map[newX][newY]== 0) continue;
                q.add(new int[] {newX, newY});
                distance[newX][newY] = distance[currentX][currentY]+1;
                checked[newX][newY] = true;
            }
        }
    }

    static void execute(){
        bfs(0,0);
        System.out.println(distance[N-1][M-1]);
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
