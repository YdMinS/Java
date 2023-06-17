package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기2750 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[] numArr;

    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        numArr = new int[N];
        for(int i=0; i<numArr.length; i++){
            numArr[i] = Integer.parseInt(br.readLine());
        }
    }

    static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int tmp;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    static void resultPrint(){
        for(int i : numArr){
            System.out.println(i);
        }
    }

    static void execute(){
        sort(numArr);
        resultPrint();
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
