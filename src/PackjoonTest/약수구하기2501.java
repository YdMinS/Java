package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 약수구하기2501 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;

    static void input() throws IOException{
        String str = br.readLine();
        st = new StringTokenizer(str);
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
    }

    static void execute(){
        int cnt = 0;
        for(int i=1; i<=N; i++){
            cnt += N%i == 0 ? 1 : 0;
            if(cnt == M) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
