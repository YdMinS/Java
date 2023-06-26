package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 과제안내신분5597 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean[] checked = new boolean[30];

    static void input() throws IOException{
        for(int i=0; i<28; i++){
            checked[Integer.parseInt(br.readLine())-1] = true;
        }
    }

    static void execute(){
        for(int i=0; i<checked.length; i++){
            if(!checked[i])
                System.out.println(i+1);
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
