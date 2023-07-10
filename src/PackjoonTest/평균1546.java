package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균1546 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    static int[] scores;
    static float avg;

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int temp;
        scores = new int[N];
        for(int i=0; i<N; i++){
            temp = Integer.parseInt(st.nextToken());
            scores[i] = temp;
            max = temp > max ? temp : max;
            min = temp > min ? min : temp;
        }
        float sum = 0;
        for(int i=0; i<scores.length; i++){
            sum += (float)scores[i]/max*100;
        }
        System.out.println(sum*10/(N*10));
    }

    public static void main(String[] args) throws IOException {
        input();
    }
}
