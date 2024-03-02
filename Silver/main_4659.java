import java.io.*;

/**
 * 4659번 비밀번호 발음하기
 * 메모리 : 13992 KB
 * 시간 : 112 m
 * 코드 길이 : 1726 B
 * 
 * @author 이태희
 * @see https://www.acmicpc.net/problem/4659
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String pw;
        while (!(pw = br.readLine()).equals("end")) {

            if (!pw.contains("a") && !pw.contains("e") && !pw.contains("i") && !pw.contains("o") && !pw.contains("u")){
                sb.append("<").append(pw).append("> is not acceptable.\n");
                continue;
            }
            
            boolean acceptable = true;
            int vowelCount = 0;
            int consonantCount = 0;
            boolean consecutive = false;

            char prev = ' ';
            for (char c : pw.toCharArray()) {
                if (isVowel(c)) {
                    vowelCount++;
                    consonantCount = 0;
                } else {
                    consonantCount++;
                    vowelCount = 0;
                }

                if (vowelCount > 2 || consonantCount > 2) {
                    acceptable = false;
                    break;
                }

                if (c == prev && (c != 'e' && c != 'o')) {
                    acceptable = false;
                    break;
                }

                prev = c;
            }

            if (acceptable) {
                sb.append("<").append(pw).append("> is acceptable.\n");
            } else {
                sb.append("<").append(pw).append("> is not acceptable.\n");
            }
        }

        System.out.println(sb);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
