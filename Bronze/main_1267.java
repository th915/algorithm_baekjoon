import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int y = 0;
        int m = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            int minite = Integer.parseInt(st.nextToken());
            y += ((minite / 30) + 1) * 10;
            m += ((minite / 60) + 1) * 15;
 
        }

        if (y == m) {
            System.out.println("Y M " + y);
        } else if (y < m) {
            System.out.println("Y " + y);
        } else if (y > m) {
            System.out.println("M " + m);
        }

    }
}
