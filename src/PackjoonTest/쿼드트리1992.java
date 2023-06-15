package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 쿼드트리1992 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[][] map;

    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }
    }

    static boolean isCompressable(int n, int x, int y){
        int value = map[x][y];

        for(int i=x; i<x+n; i++){
            for (int j=y; j<y+n; j++){
                if(value!=map[i][j])
                    return false;
            }
        }
        return true;
    }

    static void quardTree(int n, int x, int y){
        if(isCompressable(n, x, y)){
            sb.append(map[x][y]);
            return;
        }

        int newN = n/2;

        sb.append("(");

        //for 4
        quardTree(newN, x, y);
        quardTree(newN, x, y+newN);
        quardTree(newN, x+newN, y);
        quardTree(newN, x+newN, y+newN);

        sb.append(")");
    }

    static void execute(){
        quardTree(N, 0, 0);
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
