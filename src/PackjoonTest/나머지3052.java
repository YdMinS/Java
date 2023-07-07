package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 나머지3052 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] rest = new int[42];

    static void input() throws IOException {
        for(int i=0; i<10; i++){
            rest[Integer.parseInt(br.readLine())%42]++;
        }
    }

    static void execute(){
        int cnt = 0;
        for(int i=0; i< rest.length; i++){
            cnt += rest[i]!=0 ? 1 : 0;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
