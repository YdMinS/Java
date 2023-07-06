package PackjoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부1157 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int max = -1;
    static char ch = '?';
    static char[] charArr = new char[26];
    static boolean duplicated = false;

    static void input() throws IOException{
        String str = br.readLine();
        char c;
        int index;
        for(int i=0; i<str.length(); i++){
            c = str.charAt(i);
            if(c>='a' && c<='z'){
                index = c - 'a';
                charArr[index]++;
            }
            if(c>='A' && c<='Z'){
                index = c - 'A';
                charArr[index]++;
            }
        }
    }

    static void execute(){
        for(int i=0; i<charArr.length; i++){
            if(charArr[i] > max){
                max = charArr[i];
                ch = (char)(i+'A');
            } else if (charArr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
