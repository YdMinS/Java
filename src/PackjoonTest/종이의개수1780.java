package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 종이의개수1780 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[][] map;
    static int cntZero;
    static int cntPlus1;
    static int cntMinus1;

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
                if(value != map[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    static void onlyNine(int n, int x, int y){
        if(isOnePaper(n, x, y)){
            if(map[x][y]==0){
                cntZero++;
            } else if(map[x][y]==1){
                cntPlus1++;
            } else{
                cntMinus1++;
            }
            return;
        }

        int newN = n/3;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                onlyNine(newN, x+newN*i, y+newN*j);
            }
        }
    }

    static void execute(){
        onlyNine(N, 0,0);
        System.out.println(cntMinus1+"\n"+cntZero+"\n"+cntPlus1);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
