package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 방배정13300 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, k, roomNum;
    static int[] cntF=new int[6], cntM=new int[6];

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
    }

    static void execute() throws IOException{
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            if(st.nextToken().equals("0")){
                cntF[Integer.parseInt(st.nextToken())-1]++;
            } else {
                cntM[Integer.parseInt(st.nextToken())-1]++;
            }
        }
        for(int i=0; i<6; i++){
            roomNum += cntF[i]%k ==0 ? cntF[i]/k : cntF[i]/k+1;
            roomNum += cntM[i]%k ==0 ? cntM[i]/k : cntM[i]/k+1;
        }
        System.out.println(roomNum);
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
