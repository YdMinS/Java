package PackjoonTest;

import java.io.*;
import java.util.StringTokenizer;

public class AplusBminus510952 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int a, b;

    static void execute() throws IOException {
        while(true){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a==0){
                if (b == 0) {
                    break;
                }
            }
            bw.append(a+b+"\n");
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        execute();
    }
}
