package PackjoonTest;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class 에디터1406 {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        LinkedList<Character> ll = new LinkedList<>();
        for(int i=0; i<str.length(); i++){
            ll.add(str.charAt(i));
        }
        ListIterator<Character> iter = ll.listIterator();
        while(iter.hasNext()){
            iter.next();
        }
        for(int i=0; i<n; i++){
            String command = br.readLine();
            char c = command.charAt(0);
            switch(c){
                case 'L':
                    if(iter.hasPrevious()) iter.previous();
                    break;
                case 'D':
                    if(iter.hasNext()) iter.next();
                    break;
                case 'B':
                    if(iter.hasPrevious()){
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    iter.add(command.charAt(2));
                    break;
            }
        }
//        // For Each 성공
//        for (Character c : ll) {
//            bw.write(c);
//        }
//        // For 실패
//        for(int i=0; i<ll.size(); i++){
//            bw.write(ll.get(i));
//        }
//        // Iterator & while 성공
        ListIterator<Character> iter2 = ll.listIterator();
        while(iter2.hasNext()){
            bw.write(iter2.next());
        }
        bw.flush();
        System.out.println(System.currentTimeMillis()-s);
        bw.close();
    }
}
