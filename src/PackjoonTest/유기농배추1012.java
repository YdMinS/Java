package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 유기농배추1012 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N, M, testNumber, numOfBaeChu, numberOfGroup;
    static boolean[][] map;
    static boolean[][] checked;
    static int[][] fourDirection ={{1,0},{0,1},{-1,0},{0,-1}};

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new boolean[N][M];
        checked = new boolean[N][M];
        numOfBaeChu = Integer.parseInt(st.nextToken());
        for(int i=0; i<numOfBaeChu; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = true;
        }
    }

    static void dfs(int x, int y){
        checked[x][y] = true;
        for(int i=0; i<4; i++){
            int newX = x + fourDirection[i][0];
            int newY = y + fourDirection[i][1];
            if(newX < 0 || newY < 0 || newX >=N || newY >=M) continue;
            if(!map[newX][newY]) continue;
            if(checked[newX][newY]) continue;
            dfs(newX, newY);
        }
    }

    static void execute(){
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(!checked[i][j] && map[i][j]){
                    numberOfGroup++;
                    dfs(i,j);
                }
            }
        }
        System.out.println(numberOfGroup);
        numberOfGroup=0;
    }
    public static void main(String[] args) throws IOException{
        testNumber = Integer.parseInt(br.readLine());
        for(int i=0; i<testNumber; i++){
            input();
            execute();
        }
    }
}
