package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM호텔10250 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, H, W, n;


    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            execute();
        }
    }

    static void execute(){
        int floor = n%H==0 ? H : n%H;
        System.out.print(floor);
        int length = n%H==0 ? n/H :n/H +1;
        if(length<10){
            System.out.println("0"+length);
        } else {
            System.out.println(length);
        }
    }

    public static void main(String[] args) throws IOException{
        input();
    }
}
