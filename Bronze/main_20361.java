import java.io.*;
import java.util.StringTokenizer;

/**
 * 20361번 일우는 야바위꾼
 * 
 * @author 이태희
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        String N = tk.nextToken();
        String X  = tk.nextToken();
        int K = Integer.parseInt(tk.nextToken());

        for (int i = 0; i < K; i++) {
            tk = new StringTokenizer(br.readLine());
            String a = tk.nextToken();
            String b = tk.nextToken();

            if(a.equals(X) || b.equals(X)){
                X = (a.equals(X))? b : a;
            }
        }

        System.out.println(X);
    }
}