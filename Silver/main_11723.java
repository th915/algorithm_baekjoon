import java.io.*;
import java.util.*;

/**
 * 11723번 집합
 * 메모리 : 313208 KB
 * 시간 : 1144 m
 * 코드 길이 : 1309 B
 * 
 * @author 이태희
 * @see https://www.acmicpc.net/problem/11723
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());

        boolean[] arrays = new boolean[21];

        for (int i = 0; i < m; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            String x = tk.nextToken();

            if (x.equals("all")){
                Arrays.fill(arrays, true);
                continue;
            } else if (x.equals("empty")){
                Arrays.fill(arrays, false);
                continue;
            }

            int index = Integer.parseInt(tk.nextToken());
            switch (x) {

                case "add":
                    arrays[index] = true;
                    break;

                case "remove":
                    arrays[index] = false;
                    break;

                case "check":
                    sb.append((arrays[index])? 1 : 0).append("\n");
                    break;

                case "toggle":
                    arrays[index] = !arrays[index];
                    break;
            }
        }
        System.out.println(sb);
    }
}