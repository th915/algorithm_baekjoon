import java.util.Scanner;

public class main_17478 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sentence = new String[5];
        int count = 0;

        int num = sc.nextInt();
        
        sentence[0] = "\"재귀함수가 뭔가요?\"";
        sentence[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어."; 
        sentence[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
        sentence[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
        sentence[4] = "라고 답변하였지.";

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        answer(question(num, sentence, count), sentence);

        sc.close();
    }

    public static int question(int num, String[] sentence, int count){
        if(num < 1){
            print(count);
            System.out.println(sentence[0]);
            print(count);
            System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            return count;
        }
            
        print(count);
        System.out.println(sentence[0]);
        print(count);
        System.out.println(sentence[1]);
        print(count);
        System.out.println(sentence[2]);
        print(count);
        System.out.println(sentence[3]);

        return question(num-1, sentence, count+1);
    }

    public static int answer(int num, String[] sentence){
        if(num < 1){
            print(num);
            System.out.println(sentence[4]);
            return 1;
        }
        
        print(num);
        System.out.println(sentence[4]);
        return answer(num-1, sentence);
    }

    public static void print(int num){
        for (int i = 0; i < num; i++) {
            System.out.print("____");
        }
    }
}