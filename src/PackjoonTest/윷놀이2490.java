package PackjoonTest;

import java.util.Scanner;

public class 윷놀이2490 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cntOfOne = new int[3];
        for(int i=0; i<3; i++){
            cntOfOne[i] =0;
            for(int j=0; j<4; j++){
                int yut = sc.nextInt();
                if(yut == 0){
                    cntOfOne[i]++;
                }
            }
        }
        for(int i=0; i< cntOfOne.length; i++) {
            switch (cntOfOne[i]) {
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
                case 0:
                    System.out.println("E");
            }
        }
    }
}
