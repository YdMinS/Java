package PackjoonTest;

import java.io.*;
import java.util.Arrays;

public class 수정렬하기III10989 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int[] numArr;

    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        numArr = new int[N];
        for(int i=0; i<N; i++){
            numArr[i] = Integer.parseInt(br.readLine());
        }
    }

    private static void resultPrint (int[] arr)throws IOException{
        for(int i : arr){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }

    static void execute() throws IOException{
        Arrays.sort(numArr);
        resultPrint(numArr);
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
