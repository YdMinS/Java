package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 적록색약10026 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[][] fourDirections = {{1,0},{0,1},{-1,0},{0,-1}};

    static int N, numberOfArea;
    static char[][] map;
    static char[][] mapForRGWeek;
    static boolean[][] checked;
    static boolean[][] checkedForRGWeek;

    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        mapForRGWeek = new char[N][N];
        checked = new boolean[N][N];
        checkedForRGWeek = new boolean[N][N];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                char RGB = str.charAt(j);
                map[i][j] = RGB;
                mapForRGWeek[i][j] = RGB=='G' ? 'R' : RGB;
            }
        }
    }

    private static void bfs(int x, int y){
        checked[x][y] = true;
        for(int i=0; i<4; i++){
            int newX = x + fourDirections[i][0];
            int newY = y + fourDirections[i][1];
            if(newX < 0 || newY < 0 || newX >=N || newY >=N) continue;
            if(map[newX][newY]!=map[x][y]) continue;
            if(checked[newX][newY]) continue;
            bfs(newX, newY);
        }
    }

    private static void bfsForRGWeek(int x, int y){
        checkedForRGWeek[x][y] = true;
        for(int i=0; i<4; i++){
            int newX = x + fourDirections[i][0];
            int newY = y + fourDirections[i][1];
            if(newX < 0 || newY < 0 || newX >=N || newY >=N) continue;
            if(mapForRGWeek[newX][newY]!=mapForRGWeek[x][y]) continue;
            if(checkedForRGWeek[newX][newY]) continue;
            bfsForRGWeek(newX, newY);
        }
    }

    static void execute(){
       for(int i=0; i<N; i++){
           for(int j=0; j<N; j++){
               if(!checked[i][j]){
                   numberOfArea++;
                   bfs(i, j);
               }
           }
        }
        sb.append(numberOfArea+" ");
        numberOfArea=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!checkedForRGWeek[i][j]){
                    numberOfArea++;
                    bfsForRGWeek(i, j);
                }
            }
        }
        sb.append(numberOfArea);
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
