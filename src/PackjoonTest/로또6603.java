package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 로또6603 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int K;
    static int[] S;
    static int[] result = new int[7];
    static boolean[] checked;
    static boolean isComplete;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        if(K!=0){
            S = new int[K+1];
            checked = new boolean[K+1];
            for(int i=1; i<=K; i++){
                S[i] = Integer.parseInt(st.nextToken());
            }
        } else {
            isComplete = true;
        }

    }

    static void findAllCase(int idx){
        if(idx == 6){
            for(int i=1; i<=6; i++){
                if(i<6)
                    System.out.print(result[i]+" ");
                else
                    System.out.print(result[i]);
            }
            System.out.println();
            return;
        }

        for(int i=1; i<=K; i++){
            if(!checked[i]){
                checked[i] = true;
                result[idx+1] = S[i];
                findAllCase(idx+1);
                for(int j=i+1; j<=K; j++){
                    checked[j] = false;
                }
            }

        }
    }

    static void execute(){
        findAllCase(0);
    }

    public static void main(String[] args) throws IOException {
        int first = 1;
        while(!isComplete){
            input();
            if(isComplete) break;
            if(first>1) System.out.println();
            execute();
            first++;
        }
    }
}
