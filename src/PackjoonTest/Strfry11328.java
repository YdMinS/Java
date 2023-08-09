package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Strfry11328 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            execute();
        }
    };

    static void execute() throws IOException{
        st = new StringTokenizer(br.readLine());
        String ref = st.nextToken();
        String test = st.nextToken();
        int[] chrArr = new int['z'-'a'+1];
        for(int i=0; i<ref.length(); i++){
            chrArr[ref.charAt(i)-'a']++;
        }
        for(int i=0; i<test.length(); i++){
            chrArr[test.charAt(i)-'a']--;
        }
        for(int i=0; i< chrArr.length; i++){
            if(chrArr[i]!=0){
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }

    public static void main(String[] args) throws IOException{
        input();
    }
}
