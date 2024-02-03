import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int num = Integer.parseInt(str);

        for (int i = 0; i < num; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(tk.nextToken());
            int y = Integer.parseInt(tk.nextToken());
            
            sb.append(x + y).append("\n");
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
