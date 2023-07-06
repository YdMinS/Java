package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알람시계2884 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int H, M;

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
    }

    static void execute(){
        if(M-45 < 0){
            M = 60 + M - 45;
            if(H==0){
                H = 23;
            } else {
                H--;
            }
        } else {
            M = M-45;
        }
        System.out.println(H+" "+M);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
