package PackjoonTest;

import java.util.HashMap;
import java.util.Scanner;

public class 학점계산2754 {
    static HashMap<String, Double> noteMap = new HashMap<>();
    static HashMap<String, Double> forCalculate = new HashMap<>();

    static void noteSetting(){
        noteMap.put("A", 4.0);
        noteMap.put("B", 3.0);
        noteMap.put("C", 2.0);
        noteMap.put("D", 1.0);
        noteMap.put("F", 0.0);

        forCalculate.put("+", 0.3);
        forCalculate.put("0", 0.0);
        forCalculate.put("-", -0.3);
    }

    static void execute(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Double note1 = noteMap.get(str.charAt(0)+"");
        if(str.length()>1){
            Double note2 = forCalculate.get(str.charAt(1)+"");
            System.out.println(note1+note2);
        } else {
            System.out.println(note1);
        }
    }
    public static void main(String[] args) {
        noteSetting();
        execute();
    }
}
