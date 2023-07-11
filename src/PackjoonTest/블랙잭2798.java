package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 블랙잭2798 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, max=Integer.MIN_VALUE;
    static int[] arr;

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] =  Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
    }

    static void execute(){
        int tempSum;
        for(int i=0; i<arr.length-2; i++){{
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++){
                    tempSum = arr[i]+arr[j]+arr[k];
                    if(tempSum > M) continue;
                    else {
                        max = max>tempSum ? max : tempSum;
                    }
                }
            }
        }
        }
        System.out.println(max);
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
