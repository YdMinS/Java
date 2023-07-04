package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열반복2675 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[] numArr;
    static String[] strArr;

    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        numArr = new int[N];
        strArr = new String[N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            numArr[i] = Integer.parseInt(st.nextToken());
            strArr[i] = st.nextToken();
        }
    }

    static void execute(){
        for(int i=0; i<N; i++){
            for(int j=0; j<strArr[i].length(); j++){
                for(int k=0; k<numArr[i]; k++){
                    System.out.print(strArr[i].charAt(j));
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
