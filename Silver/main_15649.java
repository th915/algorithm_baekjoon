import java.util.*;
import java.io.*;

/**
 * 15649번 N과 M(1)
 * 
 * @author 이태희
 */
public class main_15649 {

    public static int n;
    public static int m;
    public static int[] arrays;
    public static boolean[] isused;
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());

        arrays = new int[m+1];
        isused = new boolean[n+1];

        func(0);
        System.out.println(sb);
    }

    public static void func(int k){
        if (k == m){
            for (int i = 0; i < m; i++) {
                sb.append(arrays[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(!isused[i]){
                arrays[k] = i;
                isused[i] = true;
                func(k+1);
                isused[i] = false;
            }
        }
    }
}
