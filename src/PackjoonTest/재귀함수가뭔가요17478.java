package PackjoonTest;

import java.util.Scanner;

public class 재귀함수가뭔가요17478 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static int N;
    static String[] JHsaid = new String[5];
    static String reply = "____";

    static void input(){
        N = sc.nextInt();
        JHsaid[0] = "\"재귀함수가 뭔가요?\"\n";
        JHsaid[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
        JHsaid[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
        JHsaid[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
        JHsaid[4] = "라고 답변하였지.\n";

    }

    static void recursionIs(int n){
        System.out.print(sb.toString());
        System.out.print(JHsaid[0]);
        if(n>0) {
            for(int i=1; i<=3; i++){
                System.out.print(sb.toString());
                System.out.print(JHsaid[i]);
            }
            sb.append(reply);
            recursionIs(n-1);
        } else {
            System.out.print(sb.toString());
            System.out.print("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
            for(int i=0; i<=N; i++){
                System.out.print(sb.toString());
                System.out.print(JHsaid[4]);
                sb.delete(0,4);
            }
        }
    }

    static void execute(){
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        recursionIs(N);
    }

    public static void main(String[] args) {
        input();
        execute();
    }
}
