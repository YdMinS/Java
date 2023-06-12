package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 그림1926{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static int[][] paint;
    static boolean[][] checked;
    static int numOfPaints;
    static int maxSizeOfPaint;
    static int currentSizeOfPaint;
    static int[][] forDirection = {{1,0}, {0,-1}, {-1,0}, {0,1}};

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        paint = new int[N][M];
        checked = new boolean[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                paint[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void bfs(int x, int y) {
        currentSizeOfPaint++;
        checked[x][y] = true;
        for(int i=0; i<4; i++) {
            int newX = x + forDirection[i][0];
            int newY = y + forDirection[i][1];
            if (newX < 0 || newY < 0 || newX >= N || newY >= M) continue;
            if (paint[newX][newY] == 0) continue;
            if (checked[newX][newY]) continue;
            bfs(newX, newY);
        }
    }

    static void execute(){
        for (int i=0; i <N; i++) {
            for (int j=0; j <M; j++) {
               if(!checked[i][j] && paint[i][j] == 1){
                   currentSizeOfPaint = 0;
                   numOfPaints++;
                   bfs(i, j);
                   maxSizeOfPaint = Math.max(currentSizeOfPaint, maxSizeOfPaint);
               }
            }
        }
        System.out.println(numOfPaints);
        System.out.println(maxSizeOfPaint);
    }
    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
