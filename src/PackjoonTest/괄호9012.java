package PackjoonTest;

import java.util.Scanner;

public class 괄호9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        sc.nextLine();
        String[] ptArr = new String[line];
        for(int i=0; i<line; i++){
            ptArr[i] = sc.nextLine();
        }
        for(int i=0; i<ptArr.length; i++){
            int sum = 0;
            for(int j=0; j<ptArr[i].length();j++){
                sum += ptArr[i].charAt(j)== '(' ? '(' : -'(';
                if(sum<0){
                    break;
                }
            }
            System.out.println(sum == 0 ? "YES" : "NO");
        }
        }
    }

