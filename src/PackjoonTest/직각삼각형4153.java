package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 직각삼각형4153 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static void execute() throws IOException{
        String str = br.readLine();
        while(!str.equals("0 0 0")){
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int A = a*a;
            int B = b*b;
            int C = c*c;
            if(A==B+C || B==A+C || C==A+B){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
            str = br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
       execute();
    }
}
