import java.io.*;
import java.util.StringTokenizer;

/**
 * 15650번 N과 M (2)
 * 
 * @author 이태희
 */
public class Main {

    public static int N;
    public static int M;
    public static int[] arrays;
    public static boolean[] isused;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(tk.nextToken());
        M = Integer.parseInt(tk.nextToken());

        arrays = new int[M];
        isused = new boolean[N+1];

        func(0, 1);
        System.out.println(sb);
    }

    public static void func(int k1, int k2){
        if (k1 == M){
            for (int i = 0; i < M; i++) {
                sb.append(arrays[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = k2; i <= N ; i++) {
            arrays[k1] = i;
            func(k1 + 1, i + 1);
        }
    }
}