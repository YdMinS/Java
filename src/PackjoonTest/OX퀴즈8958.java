package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈8958 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, sum;
    static String[] quiz;

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        quiz = new String[N];
        for(int i=0; i<N; i++){
            quiz[i] = br.readLine();
        }
    }

    static void execute(){
        String str;
        boolean isO;
        int cnt;
        for(int i=0 ; i<N; i++){
            str = quiz[i];
            isO = false;
            sum = 0;
            cnt = 0;
            for(int j=0; j<str.length(); j++){
                if(!isO && str.charAt(j)=='O'){
                    sum++;
                    cnt++;
                    isO = true;
                } else if(isO && str.charAt(j)=='O'){
                    cnt++;
                    sum += cnt;
                } else {
                    isO = false;
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
