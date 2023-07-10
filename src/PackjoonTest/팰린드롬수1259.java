package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬수1259 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static void execution() throws IOException{
        String str = br.readLine();
        while(!str.equals("0")){
            boolean isYes = true;
            for(int i=0; i<str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length()-1-i)){
                    isYes = false;
                    break;
                }
            }
            if(isYes){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            str = br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        execution();
    }
}
