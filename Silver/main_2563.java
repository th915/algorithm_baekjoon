import java.util.Scanner;

public class main_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] paper = new int[100][100];
        int count = 0;

        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(paper[i][j] == 1){
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
