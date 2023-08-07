package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이진수3460 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;

    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        int test;
        for(int i=0; i<N; i++){
            test = Integer.parseInt(br.readLine());
            execute(test);
        }
    }

    static void execute(int x){
        int tempX = x;
        for(int i=0; i<x; i++){
            if(tempX % 2 ==1) {
                System.out.print(i + " ");
            }
            tempX /= 2;
        }
        System.out.println("");
    }

    public static void main(String[] args) throws IOException{
        input();
    }
}
