package PackjoonTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class 수정렬하기II2751 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static ArrayList<Integer> numList = new ArrayList<>();

    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            numList.add(Integer.parseInt(br.readLine()));
        }
    }

    static void resultPrint(ArrayList<Integer> arr) throws IOException {
        for (int integer : arr) {
            sb.append(integer+"\n");
        }
        System.out.println(sb);
    }

    static void execute() throws IOException {
        Collections.sort(numList);
        resultPrint(numList);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
