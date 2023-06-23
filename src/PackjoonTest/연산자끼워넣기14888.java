package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연산자끼워넣기14888 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[] num;
    static int[] operatorList;
    static boolean[] checked;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] currentResult;

    static int plus(int a, int b){
        return a + b;
    }
    static int minus(int a, int b){
        return a - b;
    }
    static int multiply(int a, int b){
        return a * b;
    }
    static int division(int a, int b){
        if(a<0){
            return (a*(-1)/b)*(-1);
        } else {
            return a/b;
        }
    }

    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        num = new int[N];
        operatorList = new int[N-1];
        checked = new boolean[N-1];
        currentResult = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int cnt =0;
        for(int i=0; i<4; i++){
            int num = Integer.parseInt(st.nextToken());
            int j =num;
            while(j>0){
                operatorList[cnt] = i;
                j--;
                cnt++;
            }
        }
    }
    static void dfs(int depth){
        if(depth == N-1){
            max = max>currentResult[N-1] ? max : currentResult[N-1];
            min = min>currentResult[N-1] ? currentResult[N-1] : min;
            return;
        }
        if(depth == 0){
            currentResult[0] = num[0];
        }
        for(int i=0; i<N-1; i++){
            if(!checked[i]){
                checked[i] = true;
                switch(operatorList[i]){
                    case 0:
                        currentResult[depth+1] = plus(currentResult[depth], num[depth+1]);
                        break;
                    case 1:
                        currentResult[depth+1] = minus(currentResult[depth], num[depth+1]);
                        break;
                    case 2:
                        currentResult[depth+1] = multiply(currentResult[depth], num[depth+1]);
                        break;
                    case 3:
                        currentResult[depth+1] = division(currentResult[depth], num[depth+1]);
                }
                dfs(depth+1);
                checked[i] = false;
            }
        }
    }

    static void execute(){
        dfs(0);
        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
