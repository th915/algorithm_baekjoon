import java.io.*;
import java.util.StringTokenizer;

/**
 * 23971번 ZOAC 4
 * 
 * @author 이태희
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(tk.nextToken());
        int W = Integer.parseInt(tk.nextToken());
        int N = Integer.parseInt(tk.nextToken());
        int M = Integer.parseInt(tk.nextToken());

        int count = 0;
        for (int i = 0; i < H; i = i + + 1 + N) {
            for (int j = 0; j < W; j = j + 1 + M) {
                count++;
            }
        }
        System.out.println(count);
    }
}
