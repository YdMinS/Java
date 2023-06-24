package PackjoonTest;

import java.io.*;
import java.util.StringTokenizer;

public class AplusBIV10951 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int a, b;
    static String str;

    static void execute() throws IOException {
        while((str= br.readLine())!=null){
            st = new StringTokenizer(str);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            System.out.println(a+b);
        }
    }

    public static void main(String[] args) throws IOException {
        execute();
    }
}
