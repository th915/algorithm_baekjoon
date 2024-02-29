import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 17952번 과제는 끝나지 않아!
 * 메모리 : 206116 KB
 * 시간 : 708 m
 * 코드 길이 : 1605 B
 * 
 * @author 이태희
 * @see https://www.acmicpc.net/problem/17952
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        ArrayList<Integer> score = new ArrayList<Integer>();
        ArrayList<Integer> time = new ArrayList<Integer>();

        int m = Integer.parseInt(tk.nextToken());
        long result = 0;

        String x;
        for (int i = 0; i < m; i++) {
            tk = new StringTokenizer(br.readLine());
            x = tk.nextToken();

            if (m == 1 && x.equals("0")){
                break;
            }

            if (x.equals("1")){
                int a = Integer.parseInt(tk.nextToken());
                int b = Integer.parseInt(tk.nextToken());

                if (b == 1){
                    result += a;
                } else {
                    score.add(a);
                    time.add(b-1);
                }
            } else {

                if(time.size() <= 0) {
                    continue;
                }
                int b = time.get(time.size() - 1) - 1;

                if (b == 0){
                    result += score.get(score.size() - 1);
                    time.remove(time.size() - 1);
                    score.remove(score.size() - 1);
                } else {
                    time.remove(time.size() - 1);
                    time.add(b);
                }
            }
        }

        System.out.println(result);
    }
}