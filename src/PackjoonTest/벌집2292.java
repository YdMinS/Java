package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집2292 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, cnt=1;

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
    }

    static void execute(){
        int i=0;
        int ref = 1;
        while(N>ref){
            cnt++;
            i++;
            ref += 6*i;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
