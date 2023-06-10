package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 곱셈2388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();
        for(int i=B.length()-1; i>=0; i--){
            System.out.println(A*Character.getNumericValue(B.charAt(i)));
        }
        System.out.println(A*Integer.parseInt(B));
    }
}
