package PackjoonTest;

import java.util.Scanner;

public class 단어뒤집기9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        sc.nextLine();
        String[] sentenceArr = new String[line];
        for(int i=0; i<sentenceArr.length; i++){
            sentenceArr[i] = sc.nextLine();
        }
        for(int i=0; i<sentenceArr.length; i++){
            String[] wordArr = sentenceArr[i].split(" ");
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<wordArr.length; j++){
                for(int l=wordArr[j].length()-1; l>=0; l--){
                    sb.append(wordArr[j].charAt(l)+"");
                }
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }

    }
}
