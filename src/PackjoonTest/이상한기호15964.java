package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이상한기호15964 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Long A, B;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
    }

    private static Long newOperator(Long a, Long b) {
        return (a+b)*(a-b);
    }

    static void execute(){
        System.out.println(newOperator(A, B));
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
