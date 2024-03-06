import java.io.*;

/**
 * 1157번 단어 공부
 * 메모리 : 21072 KB
 * 시간 : 292 m
 * 코드 길이 : 908 B
 * 
 * @author 이태희
 * @see https://www.acmicpc.net/problem/1157
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toUpperCase();

        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(Character.isLetter(a)) {
                alphabet[a - 'A'] += 1;
            }
        }

        int max = 0;
        char result = '?';

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                result = (char) (i + 'A');
            } else if (alphabet[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}