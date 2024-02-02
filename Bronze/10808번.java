import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] words = new int[26];

        String[] input = sc.next().split("");
        for (String s : input) {
            int num = s.charAt(0);
            words[num-97] = words[num-97] + 1;
        }

        for (int i : words) {
            System.out.print(i + " ");
        }
    }
}
