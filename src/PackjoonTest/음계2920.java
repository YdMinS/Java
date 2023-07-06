package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 음계2920 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int diff;
    static int[] play = new int[8];

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<8; i++){
            play[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        for(int i=1; i<8; i++){
            if(i==1){
                diff = play[i]-play[i-1];
            } else {
                if(play[i]-play[i-1]!=diff){
                    System.out.println("mixed");
                    return;
                }
            }
        }
        if(diff>0){
            System.out.println("ascending");
        }
        if(diff<0){
            System.out.println("descending");
        }
    }
}
