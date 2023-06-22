package PackjoonTest;

import java.io.*;
import java.util.StringTokenizer;

public class 숫자10093 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static long start;
    static long end;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        start = Long.parseLong(st.nextToken());
        end = Long.parseLong(st.nextToken());
    }

    static void execute() throws IOException{
        if(start==end){
            System.out.print(0);
            return;
        }
        if(start>end){
            long temp = start;
            start = end;
            end = temp;
        }
        System.out.println(end-start-1);
        for(long i=start+1; i<end; i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
