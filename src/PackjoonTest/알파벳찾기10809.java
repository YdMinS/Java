package PackjoonTest;

import java.io.IOException;
import java.util.Scanner;

public class 알파벳찾기10809 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static String str;
    static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's',
            't', 'u', 'v', 'w', 'x', 'y', 'z'};

    static void input() throws IOException {
        str = sc.nextLine();
    }

    static void execute(){
        for(char c : alphabet){
            alphabet : for(int i=0; i<str.length(); i++){
                            if(c == str.charAt(i)){
                                sb.append(i+" ");
                                break alphabet;
                            }
                            if(i == str.length()-1){
                                sb.append(-1+" ");
                            }
                        }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
