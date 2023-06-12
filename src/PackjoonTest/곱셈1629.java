package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 곱셈1629 {
    static int A;
    static int B;
    static int C;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
    }

    static long power(int a, int b, int c){
        if(b==0)
            return 1;
        long n = power(a, b/2, c);
        if(b % 2 ==0)
            return n * n % c;
        else
            return n * n % c * a % c;
    }

    static void execute(){
        System.out.println(power(A, B, C));
    }
    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
