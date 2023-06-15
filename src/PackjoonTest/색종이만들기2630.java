package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이만들기2630 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[][] map;
    static int cntBlue;
    static int cntWhite;

    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static boolean isOnePaper(int n, int x, int y){
        int value = map[x][y];

        for(int i=x; i<x+n; i++){
            for(int j=y; j<y+n; j++){
                if(value!=map[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    static void blueSquare(int n, int x, int y){
        if(isOnePaper(n,x,y)){
            if(map[x][y]==1){
                cntBlue++;
                return;
            } else {
                cntWhite++;
                return;
            }
        }

        int newN = n/2;

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                blueSquare(newN, x+newN*i, y+newN*j);
            }
        }
    }

    static void execute(){
        blueSquare(N, 0,0);
        System.out.println(cntWhite+"\n"+cntBlue);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
