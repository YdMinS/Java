package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소최대10818 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
    }

    static void execute() {
        int temp;
        for(int i=0; i<N; i++){
            temp = Integer.parseInt(st.nextToken());
            max = max>temp ? max : temp;
            min = min<temp ? min : temp;
        }
        System.out.println(min+" "+max);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
