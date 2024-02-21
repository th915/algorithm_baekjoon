import java.io.*;
import java.util.StringTokenizer;

/**
 * 21921번 블로그
 * 
 * @author 이태희
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(tk.nextToken());
        int X = Integer.parseInt(tk.nextToken());

        int[] arrays = new int[N];
        tk = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrays[i] = Integer.parseInt(tk.nextToken());
        }

        int max = 0;
        int count = 1;

        for (int i = 0; i < X; i++) {
            max += arrays[i];
        }

        int sum = max;
        for (int i = X; i < N; i++) {
            max += arrays[i] - arrays[i-x];

            if(max > sum){
                count = 1;
                sum = max;
            } else if (max == sum){
                count++;
            }
        }

        if(sum != 0){
            sb.append(sum).append("\n").append(count);
        } else {
            sb.append("SAD");
        }
        System.out.println(sb);
    }
}