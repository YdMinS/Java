package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 개수세기10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numCount = new int[202];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n;i++){
            numCount[Integer.parseInt(st.nextToken())+100]++;
        }
        int t = Integer.parseInt(br.readLine());
        System.out.println(numCount[t+100]);
    }
}
