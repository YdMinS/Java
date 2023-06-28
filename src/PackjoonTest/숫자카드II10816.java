package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자카드II10816 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] cardsPositive, cardsNegative, num;

    static void input() throws IOException {
        int temp;
        N = Integer.parseInt(br.readLine());
        cardsPositive = new int[10000001];
        cardsNegative = new int[10000001];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            temp = Integer.parseInt(st.nextToken());
            if(temp>=0){
                cardsPositive[temp]++;
            } else {
                cardsNegative[temp*(-1)]++;
            }
        }
        M = Integer.parseInt(br.readLine());
        num = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void execute(){
        int temp;
        for(int i=0; i<num.length; i++){
            temp = num[i];
            if(temp>=0){
                sb.append(cardsPositive[temp]+" ");
            } else {
                sb.append(cardsNegative[temp*(-1)]+" ");
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
