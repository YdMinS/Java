package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의합11720 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int sum = 0;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for(int i=0; i<N; i++){
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(sum);
    }
}
